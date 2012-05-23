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

import org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Human Laboratory Test Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Laboratory Test Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Laboratory Test Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultReferenceRangeAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Reference Range Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultBaselineIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Baseline Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultDerivedDataIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Derived Data Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultFastingAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Fasting Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultLabToxicityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Lab Toxicity Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultlaboratory Test Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultlaboratory Test Result Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultreferenceRangeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Association Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultfastingAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultfastingAssociationFastingStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Association Fasting Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#validateNonHumanLaboratoryTestResultlabToxicityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultlab Toxicity Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#getBaselineIndicator() <em>Get Baseline Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult#getDerivedDataIndicator() <em>Get Derived Data Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonHumanLaboratoryTestResultOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonHumanLaboratoryTestResultOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultTemplateId(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultTemplateId(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.32')";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultTemplateId(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultTemplateId(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.32')
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultTemplateId(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultClassCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultClassCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultClassCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultClassCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultClassCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultId(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultId(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultId(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultId(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultId(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultMoodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultMoodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultMoodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultMoodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultMoodCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultStatusCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultStatusCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultStatusCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultStatusCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultStatusCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultValue(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultValue(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultValue(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultValue(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultValue(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultMethodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Method Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultMethodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultMethodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Method Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultMethodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultMethodCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_METHOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultGroupIdentifier(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultGroupIdentifier(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultGroupIdentifier(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultGroupIdentifier(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultGroupIdentifier(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultSpecimenInformation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultSpecimenInformation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultSpecimenInformation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Specimen Information</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultSpecimenInformation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultSpecimenInformation(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Laboratory Test Result Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Laboratory Test Result Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Laboratory Test Result Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Laboratory Test Result Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultReferenceRangeAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Reference Range Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultReferenceRangeAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->one(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(cda::ReferenceRange))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultReferenceRangeAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Reference Range Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultReferenceRangeAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.referenceRange->one(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(cda::ReferenceRange))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultReferenceRangeAssociation(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultReferenceRangeAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultNonPerformanceReason(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultNonPerformanceReason(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultNonPerformanceReason(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultNonPerformanceReason(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultNonPerformanceReason(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultBaselineIndicator(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Baseline Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultBaselineIndicator(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Baseline Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultBaselineIndicator(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Baseline Indicator</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultBaselineIndicator(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Baseline Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultBaselineIndicator(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_BASELINE_INDICATOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultBaselineIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultDerivedDataIndicator(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Derived Data Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultDerivedDataIndicator(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Derived Data Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultDerivedDataIndicator(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Derived Data Indicator</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultDerivedDataIndicator(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Derived Data Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultDerivedDataIndicator(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_DERIVED_DATA_INDICATOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultDerivedDataIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultFastingAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Fasting Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultFastingAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultFastingAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Fasting Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultFastingAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultFastingAssociation(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultFastingAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultLabToxicityAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Lab Toxicity Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultLabToxicityAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultLabToxicityAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Result Lab Toxicity Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultLabToxicityAssociation(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultLabToxicityAssociation(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultLabToxicityAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultlaboratory Test Result Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultlaboratory Test Result Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultlaboratory Test Result Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultlaboratory Test Result Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.referenceRange->excluding(null).observationRange->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassObservation::OBS)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.referenceRange->excluding(null).observationRange->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.referenceRange->excluding(null).observationRange->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((interpretationCode.oclIsUndefined() or interpretationCode.isNullFlavorUndefined()) implies (interpretationCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = interpretationCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.5.83'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.referenceRange->excluding(null).observationRange->excluding(null)->reject((interpretationCode.oclIsUndefined() or interpretationCode.isNullFlavorUndefined()) implies (interpretationCode.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = interpretationCode.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.5.83'))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject(isDefined('moodCode') and moodCode=vocab::ActMood::EVN.CRT)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.referenceRange->excluding(null).observationRange->excluding(null)->reject(isDefined('moodCode') and moodCode=vocab::ActMood::EVN.CRT)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined() and value.oclIsTypeOf(datatypes::PQR)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Associationreference Range Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.referenceRange->excluding(null).observationRange->excluding(null)->reject((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined() and value.oclIsTypeOf(datatypes::PQR)))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipType::REFV)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.referenceRange->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipType::REFV)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationTypeCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultreferenceRangeAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Association Reference Range</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null)->reject(observationRange->one(observationRange : cda::ObservationRange | not observationRange.oclIsUndefined() and observationRange.oclIsKindOf(cda::ObservationRange)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultreference Range Association Reference Range</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.referenceRange->excluding(null)->reject(observationRange->one(observationRange : cda::ObservationRange | not observationRange.oclIsUndefined() and observationRange.oclIsKindOf(cda::ObservationRange)))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultreferenceRangeAssociationReferenceRange", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultfastingAssociationfastingStatusClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultfastingAssociationfastingStatusCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultfastingAssociationfastingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusValue(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusValue(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BN))))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusValue(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Associationfasting Status Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusValue(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BN))))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultfastingAssociationfastingStatusValue(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultfastingAssociationfastingStatusValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultfastingAssociationTypeCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultfastingAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationFastingStatus(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Association Fasting Status</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationFastingStatus(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultfastingAssociationFastingStatus(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultfasting Association Fasting Status</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultfastingAssociationFastingStatus(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultfastingAssociationFastingStatus(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultfastingAssociationFastingStatus", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanLaboratoryTestResultlabToxicityAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultlab Toxicity Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultlabToxicityAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanLaboratoryTestResultlabToxicityAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Laboratory Test Resultlab Toxicity Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanLaboratoryTestResultlabToxicityAssociationTypeCode(NonHumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanLaboratoryTestResultlabToxicityAssociationTypeCode(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT);
      try
      {
        VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanLaboratoryTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_LABORATORY_TEST_RESULT__NON_HUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanLaboratoryTestResultlabToxicityAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanLaboratoryTestResult, context) }),
             new Object [] { nonHumanLaboratoryTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(NonHumanLaboratoryTestResult) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(NonHumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(NonHumanLaboratoryTestResult) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(NonHumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(85));
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
    return (GroupIdentifier) query.evaluate(nonHumanLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getSpecimenInformation(NonHumanLaboratoryTestResult) <em>Get Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(NonHumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->first().oclAsType(sdtm::Specimen Information)";

  /**
   * The cached OCL query for the '{@link #getSpecimenInformation(NonHumanLaboratoryTestResult) <em>Get Specimen Information</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(NonHumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->first().oclAsType(sdtm::Specimen Information)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  SpecimenInformation getSpecimenInformation(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult)
  {
    if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(86));
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
    return (SpecimenInformation) query.evaluate(nonHumanLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(NonHumanLaboratoryTestResult) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(NonHumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(NonHumanLaboratoryTestResult) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(NonHumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(87));
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
    return (NonPerformanceReason) query.evaluate(nonHumanLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getBaselineIndicator(NonHumanLaboratoryTestResult) <em>Get Baseline Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaselineIndicator(NonHumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_BASELINE_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Baseline Indicator))->asSequence()->first().oclAsType(sdtm::Baseline Indicator)";

  /**
   * The cached OCL query for the '{@link #getBaselineIndicator(NonHumanLaboratoryTestResult) <em>Get Baseline Indicator</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaselineIndicator(NonHumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BASELINE_INDICATOR__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Baseline Indicator))->asSequence()->first().oclAsType(sdtm::Baseline Indicator)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  BaselineIndicator getBaselineIndicator(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult)
  {
    if (GET_BASELINE_INDICATOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(88));
      try
      {
        GET_BASELINE_INDICATOR__EOCL_QRY = helper.createQuery(GET_BASELINE_INDICATOR__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BASELINE_INDICATOR__EOCL_QRY);
    return (BaselineIndicator) query.evaluate(nonHumanLaboratoryTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getDerivedDataIndicator(NonHumanLaboratoryTestResult) <em>Get Derived Data Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedDataIndicator(NonHumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_DERIVED_DATA_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Derived Data Indicator))->asSequence()->first().oclAsType(sdtm::Derived Data Indicator)";

  /**
   * The cached OCL query for the '{@link #getDerivedDataIndicator(NonHumanLaboratoryTestResult) <em>Get Derived Data Indicator</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedDataIndicator(NonHumanLaboratoryTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DERIVED_DATA_INDICATOR__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Derived Data Indicator))->asSequence()->first().oclAsType(sdtm::Derived Data Indicator)
   * @param nonHumanLaboratoryTestResult The receiving '<em><b>Non Human Laboratory Test Result</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DerivedDataIndicator getDerivedDataIndicator(NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult)
  {
    if (GET_DERIVED_DATA_INDICATOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NON_HUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(89));
      try
      {
        GET_DERIVED_DATA_INDICATOR__EOCL_QRY = helper.createQuery(GET_DERIVED_DATA_INDICATOR__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DERIVED_DATA_INDICATOR__EOCL_QRY);
    return (DerivedDataIndicator) query.evaluate(nonHumanLaboratoryTestResult);
  }

} // NonHumanLaboratoryTestResultOperations