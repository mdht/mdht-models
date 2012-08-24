/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Laboratory Test Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Laboratory Test Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Laboratory Test Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultReferenceRangeAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Reference Range Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultFastingAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Fasting Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultLabToxicityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Lab Toxicity Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Association Laboratory Test Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Association Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationFasting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Association Fasting</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#getTimingReference() <em>Get Timing Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HumanClinicalLaboratoryTestResultOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HumanClinicalLaboratoryTestResultOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultTemplateId(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultTemplateId(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.31')";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultTemplateId(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultTemplateId(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultTemplateId(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultClassCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultId(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultId(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultId(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultId(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultId(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultMoodCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultStatusCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultStatusCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultStatusCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultStatusCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultStatusCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultValue(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultMethodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Method Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultMethodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultMethodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Method Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultMethodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultMethodCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_METHOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultInterpretationCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultInterpretationCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultInterpretationCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultInterpretationCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultInterpretationCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultGroupIdentifier(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultGroupIdentifier(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultGroupIdentifier(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultGroupIdentifier(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultGroupIdentifier(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultSpecimenInformation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultSpecimenInformation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultSpecimenInformation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Specimen Information</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultSpecimenInformation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultSpecimenInformation(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Laboratory Test Result Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Laboratory Test Result Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Laboratory Test Result Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Laboratory Test Result Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultReferenceRangeAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Reference Range Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultReferenceRangeAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->one(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(cda::ReferenceRange))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultReferenceRangeAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Reference Range Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultReferenceRangeAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultReferenceRangeAssociation(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultReferenceRangeAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultNonPerformanceReason(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultNonPerformanceReason(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultNonPerformanceReason(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultNonPerformanceReason(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultNonPerformanceReason(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultFastingAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Fasting Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultFastingAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultFastingAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Fasting Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultFastingAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultFastingAssociation(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultFastingAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultLabToxicityAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Lab Toxicity Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultLabToxicityAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultLabToxicityAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Lab Toxicity Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultLabToxicityAssociation(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultLabToxicityAssociation(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultLabToxicityAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultTimingReference(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultTimingReference(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultTimingReference(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultTimingReference(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultTimingReference(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Association Laboratory Test Result Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Association Laboratory Test Result Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((interpretationCode.oclIsUndefined() or interpretationCode.isNullFlavorUndefined()) implies (not interpretationCode.oclIsUndefined() and interpretationCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = interpretationCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.5.83'))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject(isDefined('moodCode') and moodCode=vocab::ActMood::EVN.CRT)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined() and value.oclIsTypeOf(datatypes::PQR)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipType::REFV)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Association Reference Range</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null)->reject(observationRange->one(observationRange : cda::ObservationRange | not observationRange.oclIsUndefined() and observationRange.oclIsKindOf(cda::ObservationRange)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Association Reference Range</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultfastingAssociationfastingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BN))))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultfastingAssociationfastingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultfastingAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationFasting(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Association Fasting</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationFasting(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultfastingAssociationFasting(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Association Fasting</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultfastingAssociationFasting(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultfastingAssociationFasting(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultfastingAssociationFasting", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade(HumanClinicalLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalLaboratoryTestResult The receiving '<em><b>Human Clinical Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_LABORATORY_TEST_RESULT__HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalLaboratoryTestResult, context) }),
             new Object [] { humanClinicalLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(HumanClinicalLaboratoryTestResult) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(HumanClinicalLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(HumanClinicalLaboratoryTestResult) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(HumanClinicalLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT, SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT.getEAllOperations().get(103));
      try
      {
        GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
    return (GroupIdentifier) query.evaluate(humanClinicalLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getSpecimenInformation(HumanClinicalLaboratoryTestResult) <em>Get Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(HumanClinicalLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->any(true).oclAsType(sdtm::Specimen Information)";

  /**
   * The cached OCL query for the '{@link #getSpecimenInformation(HumanClinicalLaboratoryTestResult) <em>Get Specimen Information</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(HumanClinicalLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  SpecimenInformation getSpecimenInformation(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult)
  {
    if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT, SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT.getEAllOperations().get(104));
      try
      {
        GET_SPECIMEN_INFORMATION__EOCL_QRY = helper.createQuery(GET_SPECIMEN_INFORMATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SPECIMEN_INFORMATION__EOCL_QRY);
    return (SpecimenInformation) query.evaluate(humanClinicalLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(HumanClinicalLaboratoryTestResult) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(HumanClinicalLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(HumanClinicalLaboratoryTestResult) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(HumanClinicalLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT, SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT.getEAllOperations().get(105));
      try
      {
        GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
    return (NonPerformanceReason) query.evaluate(humanClinicalLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(HumanClinicalLaboratoryTestResult) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(HumanClinicalLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getTimingReference(HumanClinicalLaboratoryTestResult) <em>Get Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(HumanClinicalLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT, SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT.getEAllOperations().get(106));
      try
      {
        GET_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_TIMING_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TIMING_REFERENCE__EOCL_QRY);
    return (TimingReference) query.evaluate(humanClinicalLaboratoryTestResult);
  }

} // HumanClinicalLaboratoryTestResultOperations