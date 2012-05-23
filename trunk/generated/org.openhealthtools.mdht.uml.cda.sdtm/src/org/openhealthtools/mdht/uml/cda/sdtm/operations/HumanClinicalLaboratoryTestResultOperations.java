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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

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
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.31')
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
   * self.classCode=vocab::ActClassObservation::OBS
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
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
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
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
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
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
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
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
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
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))
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
   * (self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())
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

} // HumanClinicalLaboratoryTestResultOperations