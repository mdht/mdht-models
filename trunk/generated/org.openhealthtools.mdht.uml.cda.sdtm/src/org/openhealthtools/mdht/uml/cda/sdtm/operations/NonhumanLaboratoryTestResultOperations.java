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

import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Laboratory Test Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Laboratory Test Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Laboratory Test Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultReferenceRangeAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Reference Range Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultFastingAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Fasting Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultLabToxicityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Lab Toxicity Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultExclusionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Exclusion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Association Laboratory Test Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Association Laboratory Test Result Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Association Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationFastingStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Association Fasting Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Association Lab Toxicity Grade</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getExclusionIndicator() <em>Get Exclusion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getTimingReference() <em>Get Timing Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonhumanLaboratoryTestResultOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonhumanLaboratoryTestResultOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultTemplateId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultTemplateId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.32')";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultTemplateId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultTemplateId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultTemplateId(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultClassCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultId(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultMoodCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultStatusCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultStatusCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultStatusCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultStatusCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultStatusCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultValue(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultMethodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Method Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultMethodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultMethodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Method Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultMethodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultMethodCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultInterpretationCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultInterpretationCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultInterpretationCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultInterpretationCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultInterpretationCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultGroupIdentifier(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultGroupIdentifier(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultGroupIdentifier(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultGroupIdentifier(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultGroupIdentifier(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultSpecimenInformation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultSpecimenInformation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultSpecimenInformation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Specimen Information</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultSpecimenInformation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultSpecimenInformation(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Laboratory Test Result Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Laboratory Test Result Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Laboratory Test Result Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Laboratory Test Result Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultReferenceRangeAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Reference Range Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultReferenceRangeAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->one(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(cda::ReferenceRange))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultReferenceRangeAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Reference Range Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultReferenceRangeAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultReferenceRangeAssociation(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultReferenceRangeAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultNonPerformanceReason(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultNonPerformanceReason(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultNonPerformanceReason(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultNonPerformanceReason(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultNonPerformanceReason(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultFastingAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Fasting Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultFastingAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultFastingAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Fasting Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultFastingAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultFastingAssociation(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultFastingAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultLabToxicityAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Lab Toxicity Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultLabToxicityAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultLabToxicityAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Lab Toxicity Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultLabToxicityAssociation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultLabToxicityAssociation(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultLabToxicityAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultExclusionIndicator(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Exclusion Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultExclusionIndicator(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Exclusion Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultExclusionIndicator(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Exclusion Indicator</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultExclusionIndicator(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultExclusionIndicator(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultExclusionIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultPlannedStudyDay(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultPlannedStudyDay(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Planned Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultPlannedStudyDay(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Planned Study Day</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultPlannedStudyDay(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultPlannedStudyDay(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultPlannedStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultStudyDayPeriod(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultStudyDayPeriod(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultStudyDayPeriod(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultStudyDayPeriod(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultStudyDayPeriod(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultTimingReference(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultTimingReference(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultTimingReference(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultTimingReference(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultTimingReference(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Association Laboratory Test Result Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Association Laboratory Test Result Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Association Laboratory Test Result Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Association Laboratory Test Result Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((interpretationCode.oclIsUndefined() or interpretationCode.isNullFlavorUndefined()) implies (not interpretationCode.oclIsUndefined() and interpretationCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = interpretationCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.5.83'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject(isDefined('moodCode') and moodCode=vocab::ActMood::EVN.CRT)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined() and value.oclIsTypeOf(datatypes::PQR)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipType::REFV)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Association Reference Range</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null)->reject(observationRange->one(observationRange : cda::ObservationRange | not observationRange.oclIsUndefined() and observationRange.oclIsKindOf(cda::ObservationRange)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Association Reference Range</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultfastingAssociationfastingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BN))))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValue(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultfastingAssociationfastingStatusValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultfastingAssociationTypeCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultfastingAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationFastingStatus(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Association Fasting Status</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationFastingStatus(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultfastingAssociationFastingStatus(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Association Fasting Status</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultfastingAssociationFastingStatus(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultfastingAssociationFastingStatus(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultfastingAssociationFastingStatus", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlabToxicityAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Association Lab Toxicity Grade</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_LAB_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Association Lab Toxicity Grade</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_LAB_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_LAB_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_LAB_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_LAB_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_LAB_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_LAB_TOXICITY_GRADE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
             new Object [] { nonhumanLaboratoryTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(NonhumanLaboratoryTestResult) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(NonhumanLaboratoryTestResult) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(107));
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
    return (GroupIdentifier) query.evaluate(nonhumanLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getSpecimenInformation(NonhumanLaboratoryTestResult) <em>Get Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->any(true).oclAsType(sdtm::Specimen Information)";

  /**
   * The cached OCL query for the '{@link #getSpecimenInformation(NonhumanLaboratoryTestResult) <em>Get Specimen Information</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  SpecimenInformation getSpecimenInformation(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult)
  {
    if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(108));
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
    return (SpecimenInformation) query.evaluate(nonhumanLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(NonhumanLaboratoryTestResult) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(NonhumanLaboratoryTestResult) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(109));
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
    return (NonPerformanceReason) query.evaluate(nonhumanLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getExclusionIndicator(NonhumanLaboratoryTestResult) <em>Get Exclusion Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionIndicator(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_EXCLUSION_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Exclusion Reason))->asSequence()->any(true).oclAsType(sdtm::Exclusion Reason)";

  /**
   * The cached OCL query for the '{@link #getExclusionIndicator(NonhumanLaboratoryTestResult) <em>Get Exclusion Indicator</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionIndicator(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EXCLUSION_INDICATOR__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ExclusionReason getExclusionIndicator(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult)
  {
    if (GET_EXCLUSION_INDICATOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(110));
      try
      {
        GET_EXCLUSION_INDICATOR__EOCL_QRY = helper.createQuery(GET_EXCLUSION_INDICATOR__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EXCLUSION_INDICATOR__EOCL_QRY);
    return (ExclusionReason) query.evaluate(nonhumanLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getPlannedStudyDay(NonhumanLaboratoryTestResult) <em>Get Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_PLANNED_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Planned Study Day))->asSequence()->any(true).oclAsType(sdtm::Planned Study Day)";

  /**
   * The cached OCL query for the '{@link #getPlannedStudyDay(NonhumanLaboratoryTestResult) <em>Get Planned Study Day</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PLANNED_STUDY_DAY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PlannedStudyDay getPlannedStudyDay(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult)
  {
    if (GET_PLANNED_STUDY_DAY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(111));
      try
      {
        GET_PLANNED_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_PLANNED_STUDY_DAY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_STUDY_DAY__EOCL_QRY);
    return (PlannedStudyDay) query.evaluate(nonhumanLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(NonhumanLaboratoryTestResult) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(NonhumanLaboratoryTestResult) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(112));
      try
      {
        GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
    return (StudyDayPeriod) query.evaluate(nonhumanLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(NonhumanLaboratoryTestResult) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getTimingReference(NonhumanLaboratoryTestResult) <em>Get Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(NonhumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(113));
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
    return (TimingReference) query.evaluate(nonhumanLaboratoryTestResult);
  }

} // NonhumanLaboratoryTestResultOperations