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
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultEcgTestResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Ecg Test Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultEcgTestResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Ecg Test Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultAssociatedPosition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Associated Position</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultLeadLocationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Lead Location Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultBaselineIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Baseline Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultDerivedDataIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Derived Data Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultEventStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Position Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getBaselineIndicator() <em>Get Baseline Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getDerivedDataIndicator() <em>Get Derived Data Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getEventStudyDay() <em>Get Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getTimingReference() <em>Get Timing Reference</em>}</li>
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
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.29')
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
   * self.classCode=vocab::ActClassObservation::OBS
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
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
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
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
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
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
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
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
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
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
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
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
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
   * (self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())
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
   * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
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
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
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
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
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
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
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
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
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
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))
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
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
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
   * The cached OCL expression body for the '{@link #validateECGTestResultBaselineIndicator(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Baseline Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultBaselineIndicator(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Baseline Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultBaselineIndicator(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Baseline Indicator</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultBaselineIndicator(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Baseline Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultBaselineIndicator(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ECG_TEST_RESULT_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_BASELINE_INDICATOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultBaselineIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultDerivedDataIndicator(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Derived Data Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultDerivedDataIndicator(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Derived Data Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultDerivedDataIndicator(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Derived Data Indicator</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultDerivedDataIndicator(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Derived Data Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultDerivedDataIndicator(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ECG_TEST_RESULT_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_DERIVED_DATA_INDICATOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultDerivedDataIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
             new Object [] { ecgTestResult }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateECGTestResultEventStudyDay(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Event Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultEventStudyDay(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ECG_TEST_RESULT_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateECGTestResultEventStudyDay(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Event Study Day</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateECGTestResultEventStudyDay(ECGTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ECG_TEST_RESULT_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateECGTestResultEventStudyDay(ECGTestResult ecgTestResult, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ECG_TEST_RESULT_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ECG_TEST_RESULT);
      try
      {
        VALIDATE_ECG_TEST_RESULT_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ECG_TEST_RESULT_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ECG_TEST_RESULT_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ecgTestResult))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ECG_TEST_RESULT__ECG_TEST_RESULT_EVENT_STUDY_DAY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ECGTestResultEventStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ecgTestResult, context) }),
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
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
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
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
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
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
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
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
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
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
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
   * The cached OCL expression body for the '{@link #getGroupIdentifier(ECGTestResult) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)";

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
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(ECGTestResult ecgTestResult)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ECG_TEST_RESULT, SdtmPackage.Literals.ECG_TEST_RESULT.getEAllOperations().get(73));
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
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)";

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
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(ECGTestResult ecgTestResult)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ECG_TEST_RESULT, SdtmPackage.Literals.ECG_TEST_RESULT.getEAllOperations().get(74));
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
   * The cached OCL expression body for the '{@link #getBaselineIndicator(ECGTestResult) <em>Get Baseline Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaselineIndicator(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_BASELINE_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Baseline Indicator))->asSequence()->first().oclAsType(sdtm::Baseline Indicator)";

  /**
   * The cached OCL query for the '{@link #getBaselineIndicator(ECGTestResult) <em>Get Baseline Indicator</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaselineIndicator(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BASELINE_INDICATOR__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Baseline Indicator))->asSequence()->first().oclAsType(sdtm::Baseline Indicator)
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  BaselineIndicator getBaselineIndicator(ECGTestResult ecgTestResult)
  {
    if (GET_BASELINE_INDICATOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ECG_TEST_RESULT, SdtmPackage.Literals.ECG_TEST_RESULT.getEAllOperations().get(75));
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
    return (BaselineIndicator) query.evaluate(ecgTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getDerivedDataIndicator(ECGTestResult) <em>Get Derived Data Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedDataIndicator(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_DERIVED_DATA_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Derived Data Indicator))->asSequence()->first().oclAsType(sdtm::Derived Data Indicator)";

  /**
   * The cached OCL query for the '{@link #getDerivedDataIndicator(ECGTestResult) <em>Get Derived Data Indicator</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedDataIndicator(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DERIVED_DATA_INDICATOR__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Derived Data Indicator))->asSequence()->first().oclAsType(sdtm::Derived Data Indicator)
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DerivedDataIndicator getDerivedDataIndicator(ECGTestResult ecgTestResult)
  {
    if (GET_DERIVED_DATA_INDICATOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ECG_TEST_RESULT, SdtmPackage.Literals.ECG_TEST_RESULT.getEAllOperations().get(76));
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
    return (DerivedDataIndicator) query.evaluate(ecgTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getEventStudyDay(ECGTestResult) <em>Get Event Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventStudyDay(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_EVENT_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Study Day))->asSequence()->first().oclAsType(sdtm::Event Study Day)";

  /**
   * The cached OCL query for the '{@link #getEventStudyDay(ECGTestResult) <em>Get Event Study Day</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventStudyDay(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EVENT_STUDY_DAY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Study Day))->asSequence()->first().oclAsType(sdtm::Event Study Day)
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EventStudyDay getEventStudyDay(ECGTestResult ecgTestResult)
  {
    if (GET_EVENT_STUDY_DAY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ECG_TEST_RESULT, SdtmPackage.Literals.ECG_TEST_RESULT.getEAllOperations().get(77));
      try
      {
        GET_EVENT_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_EVENT_STUDY_DAY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_STUDY_DAY__EOCL_QRY);
    return (EventStudyDay) query.evaluate(ecgTestResult);
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(ECGTestResult) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(ECGTestResult)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->first().oclAsType(sdtm::Timing Reference)";

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
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->first().oclAsType(sdtm::Timing Reference)
   * @param ecgTestResult The receiving '<em><b>ECG Test Result</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(ECGTestResult ecgTestResult)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ECG_TEST_RESULT, SdtmPackage.Literals.ECG_TEST_RESULT.getEAllOperations().get(78));
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

} // ECGTestResultOperations