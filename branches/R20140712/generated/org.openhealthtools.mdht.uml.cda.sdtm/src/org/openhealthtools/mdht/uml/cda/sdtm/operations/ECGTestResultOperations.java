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
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>ECG Test Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultEcgTestResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Ecg Test Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultEcgTestResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Ecg Test Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultAssociatedPosition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Associated Position</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultLeadLocationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Lead Location Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultAssociatedConsciousness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Associated Consciousness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Association Ecg Test Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Association Ecg Test Result Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionpositionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionpositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionpositionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionpositionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Position Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionPosition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Position Position</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationecgLeadLocationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationecgLeadLocationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationecgLeadLocationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationecgLeadLocationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationEcgLeadLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Association Ecg Lead Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessconsciousnessStateCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessconsciousnessStateValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousness Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessConsciousnessState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousness Consciousness State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECGTestResultOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ECGTestResultOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultTemplateId(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultTemplateId(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.29')";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultTemplateId(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultTemplateId(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultTemplateId(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultClassCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultEffectiveTime(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultEffectiveTime(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultEffectiveTime(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultEffectiveTime(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultEffectiveTime(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultId(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultId(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultId(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultId(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultId(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultValue(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultMoodCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultStatusCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultStatusCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultStatusCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultStatusCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultStatusCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultMethodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Method Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultMethodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultMethodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Method Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultMethodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultMethodCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_METHOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultText(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultText(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultText(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultText(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultText(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultInterpretationCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultInterpretationCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultInterpretationCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultInterpretationCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultInterpretationCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultGroupIdentifier(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultGroupIdentifier(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultGroupIdentifier(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultGroupIdentifier(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultGroupIdentifier(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultEcgTestResultCategoryAssociation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Ecg Test Result Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultEcgTestResultCategoryAssociation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultEcgTestResultCategoryAssociation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Ecg Test Result Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultEcgTestResultCategoryAssociation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultEcgTestResultCategoryAssociation(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_ECG_TEST_RESULT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultEcgTestResultCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultEcgTestResultSubCategoryAssociation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Ecg Test Result Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultEcgTestResultSubCategoryAssociation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultEcgTestResultSubCategoryAssociation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Ecg Test Result Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultEcgTestResultSubCategoryAssociation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultEcgTestResultSubCategoryAssociation(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_ECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultEcgTestResultSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultAssociatedPosition(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Associated Position</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultAssociatedPosition(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultAssociatedPosition(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Associated Position</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultAssociatedPosition(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultAssociatedPosition(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_ASSOCIATED_POSITION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultAssociatedPosition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultNonPerformanceReason(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultNonPerformanceReason(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultNonPerformanceReason(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultNonPerformanceReason(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultNonPerformanceReason(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultLeadLocationAssociation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Lead Location Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultLeadLocationAssociation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_LEAD_LOCATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultLeadLocationAssociation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Lead Location Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultLeadLocationAssociation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_LEAD_LOCATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultLeadLocationAssociation(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_LEAD_LOCATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_LEAD_LOCATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_LEAD_LOCATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_LEAD_LOCATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_LEAD_LOCATION_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultLeadLocationAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultTimingReference(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultTimingReference(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultTimingReference(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultTimingReference(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultTimingReference(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultAssociatedConsciousness(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Associated Consciousness</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultAssociatedConsciousness(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_ASSOCIATED_CONSCIOUSNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultAssociatedConsciousness(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Associated Consciousness</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultAssociatedConsciousness(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_ASSOCIATED_CONSCIOUSNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultAssociatedConsciousness(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_ASSOCIATED_CONSCIOUSNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_ASSOCIATED_CONSCIOUSNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_ASSOCIATED_CONSCIOUSNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_ASSOCIATED_CONSCIOUSNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_ASSOCIATED_CONSCIOUSNESS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultAssociatedConsciousness", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultPlannedStudyDay(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultPlannedStudyDay(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Planned Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultPlannedStudyDay(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Planned Study Day</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultPlannedStudyDay(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultPlannedStudyDay(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_PLANNED_STUDY_DAY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultPlannedStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultStudyDayPeriod(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultStudyDayPeriod(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultStudyDayPeriod(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultStudyDayPeriod(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultStudyDayPeriod(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultecgTestResultCategoryAssociationTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultCategoryAssociationTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultecgTestResultCategoryAssociationTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultCategoryAssociationTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultecgTestResultCategoryAssociationTypeCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultecgTestResultCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Association Ecg Test Result Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Association Ecg Test Result Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultecgTestResultSubCategoryAssociationTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultSubCategoryAssociationTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultecgTestResultSubCategoryAssociationTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultSubCategoryAssociationTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultecgTestResultSubCategoryAssociationTypeCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultecgTestResultSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Association Ecg Test Result Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Association Ecg Test Result Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedPositionpositionClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedPositionpositionClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedPositionpositionClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedPositionpositionClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedPositionpositionClassCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedPositionpositionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedPositionpositionCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedPositionpositionCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedPositionpositionCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedPositionpositionCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedPositionpositionCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedPositionpositionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedPositionpositionMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedPositionpositionMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedPositionpositionMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedPositionpositionMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedPositionpositionMoodCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedPositionpositionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedPositionpositionValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedPositionpositionValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedPositionpositionValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedPositionpositionValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedPositionpositionValue(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedPositionpositionValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedPositionTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Position Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedPositionTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedPositionTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Position Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedPositionTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedPositionTypeCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_POSITION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedPositionTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedPositionPosition(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Position Position</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedPositionPosition(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedPositionPosition(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Position Position</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedPositionPosition(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedPositionPosition(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_POSITION_POSITION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedPositionPosition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultleadLocationAssociationecgLeadLocationClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationecgLeadLocationClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultleadLocationAssociationecgLeadLocationClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationecgLeadLocationClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultleadLocationAssociationecgLeadLocationClassCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultleadLocationAssociationecgLeadLocationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultleadLocationAssociationecgLeadLocationCodeP(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationecgLeadLocationCodeP(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultleadLocationAssociationecgLeadLocationCodeP(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationecgLeadLocationCodeP(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultleadLocationAssociationecgLeadLocationCodeP(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultleadLocationAssociationecgLeadLocationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultleadLocationAssociationecgLeadLocationCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationecgLeadLocationCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultleadLocationAssociationecgLeadLocationCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationecgLeadLocationCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultleadLocationAssociationecgLeadLocationCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultleadLocationAssociationecgLeadLocationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultleadLocationAssociationecgLeadLocationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultleadLocationAssociationecgLeadLocationValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationecgLeadLocationValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultleadLocationAssociationecgLeadLocationValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationecgLeadLocationValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultleadLocationAssociationecgLeadLocationValue(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultleadLocationAssociationecgLeadLocationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultleadLocationAssociationTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultleadLocationAssociationTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultleadLocationAssociationTypeCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultleadLocationAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultleadLocationAssociationEcgLeadLocation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Association Ecg Lead Location</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationEcgLeadLocation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_ECG_LEAD_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultleadLocationAssociationEcgLeadLocation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Association Ecg Lead Location</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultleadLocationAssociationEcgLeadLocation(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_ECG_LEAD_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultleadLocationAssociationEcgLeadLocation(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_ECG_LEAD_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_ECG_LEAD_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_ECG_LEAD_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_ECG_LEAD_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_ECG_LEAD_LOCATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultleadLocationAssociationEcgLeadLocation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedConsciousnessconsciousnessStateClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedConsciousnessconsciousnessStateCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedConsciousnessconsciousnessStateCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessconsciousnessStateCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedConsciousnessconsciousnessStateCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessconsciousnessStateCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedConsciousnessconsciousnessStateCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedConsciousnessconsciousnessStateCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedConsciousnessconsciousnessStateMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedConsciousnessconsciousnessStateValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessconsciousnessStateValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedConsciousnessconsciousnessStateValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessconsciousnessStateValue(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedConsciousnessconsciousnessStateValue(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedConsciousnessconsciousnessStateValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedConsciousnessTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousness Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedConsciousnessTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousness Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessTypeCode(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedConsciousnessTypeCode(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedConsciousnessTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultassociatedConsciousnessConsciousnessState(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousness Consciousness State</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessConsciousnessState(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_CONSCIOUSNESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultassociatedConsciousnessConsciousnessState(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousness Consciousness State</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultassociatedConsciousnessConsciousnessState(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_CONSCIOUSNESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultassociatedConsciousnessConsciousnessState(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_CONSCIOUSNESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_CONSCIOUSNESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_CONSCIOUSNESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_CONSCIOUSNESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_CONSCIOUSNESS_STATE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultassociatedConsciousnessConsciousnessState", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(ECGTestResult) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(ECGTestResult) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(ECGTestResult ecgTestResult)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ECG_TEST_RESULT, SdtmPackage.Literals.ECG_TEST_RESULT.getEAllOperations().get(104));
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
    return (GroupIdentifier) query.evaluate(ecgTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(ECGTestResult) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(ECGTestResult) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(ECGTestResult ecgTestResult)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ECG_TEST_RESULT, SdtmPackage.Literals.ECG_TEST_RESULT.getEAllOperations().get(105));
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
    return (NonPerformanceReason) query.evaluate(ecgTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(ECGTestResult) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getTimingReference(ECGTestResult) <em>Get Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(ECGTestResult ecgTestResult)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ECG_TEST_RESULT, SdtmPackage.Literals.ECG_TEST_RESULT.getEAllOperations().get(106));
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
    return (TimingReference) query.evaluate(ecgTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getPlannedStudyDay(ECGTestResult) <em>Get Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_PLANNED_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Planned Study Day))->asSequence()->any(true).oclAsType(sdtm::Planned Study Day)";

  /**
   * The cached OCL query for the '{@link #getPlannedStudyDay(ECGTestResult) <em>Get Planned Study Day</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PLANNED_STUDY_DAY__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PlannedStudyDay getPlannedStudyDay(ECGTestResult ecgTestResult)
  {
    if (GET_PLANNED_STUDY_DAY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ECG_TEST_RESULT, SdtmPackage.Literals.ECG_TEST_RESULT.getEAllOperations().get(107));
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
    return (PlannedStudyDay) query.evaluate(ecgTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(ECGTestResult) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(ECGTestResult) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(ECGTestResult ecgTestResult)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ECG_TEST_RESULT, SdtmPackage.Literals.ECG_TEST_RESULT.getEAllOperations().get(108));
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
    return (StudyDayPeriod) query.evaluate(ecgTestResult);
  }

} // ECGTestResultOperations