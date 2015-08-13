/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemConcernActOperations;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemConcern;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Plan Of Care Problem Concern</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemConcern#validateHearingPlanOfCareProblemConcernText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problem Concern Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemConcern#validateProblemConcernActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemConcern#validateProblemConcernActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemConcern#validateProblemConcernActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareProblemConcernOperations extends ProblemConcernActOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HearingPlanOfCareProblemConcernOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareProblemConcernText(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problem Concern Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareProblemConcernText(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_PROBLEM_CONCERN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareProblemConcernText(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problem Concern Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareProblemConcernText(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_PROBLEM_CONCERN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareProblemConcern The receiving '<em><b>Hearing Plan Of Care Problem Concern</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareProblemConcernText(HearingPlanOfCareProblemConcern hearingPlanOfCareProblemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_PROBLEM_CONCERN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROBLEM_CONCERN);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_PROBLEM_CONCERN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEM_CONCERN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEM_CONCERN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareProblemConcern))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_PROBLEM_CONCERN__HEARING_PLAN_OF_CARE_PROBLEM_CONCERN_TEXT,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareProblemConcernText"),
             new Object [] { hearingPlanOfCareProblemConcern }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemConcernActTemplateId(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemConcernActTemplateId(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.17')";

  /**
   * The cached OCL invariant for the '{@link #validateProblemConcernActTemplateId(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemConcernActTemplateId(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareProblemConcern The receiving '<em><b>Hearing Plan Of Care Problem Concern</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemConcernActTemplateId(HearingPlanOfCareProblemConcern hearingPlanOfCareProblemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROBLEM_CONCERN);
      try
      {
        VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareProblemConcern))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_PROBLEM_CONCERN__PROBLEM_CONCERN_ACT_TEMPLATE_ID,
             HPOCPlugin.INSTANCE.getString("ProblemConcernActTemplateId"),
             new Object [] { hearingPlanOfCareProblemConcern }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemConcernActId(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemConcernActId(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEM_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateProblemConcernActId(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemConcernActId(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEM_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareProblemConcern The receiving '<em><b>Hearing Plan Of Care Problem Concern</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemConcernActId(HearingPlanOfCareProblemConcern hearingPlanOfCareProblemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEM_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROBLEM_CONCERN);
      try
      {
        VALIDATE_PROBLEM_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareProblemConcern))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_PROBLEM_CONCERN__PROBLEM_CONCERN_ACT_ID,
             HPOCPlugin.INSTANCE.getString("ProblemConcernActId"),
             new Object [] { hearingPlanOfCareProblemConcern }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemConcernActEffectiveTime(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemConcernActEffectiveTime(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateProblemConcernActEffectiveTime(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemConcernActEffectiveTime(HearingPlanOfCareProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareProblemConcern The receiving '<em><b>Hearing Plan Of Care Problem Concern</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemConcernActEffectiveTime(HearingPlanOfCareProblemConcern hearingPlanOfCareProblemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROBLEM_CONCERN);
      try
      {
        VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareProblemConcern))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_PROBLEM_CONCERN__PROBLEM_CONCERN_ACT_EFFECTIVE_TIME,
             HPOCPlugin.INSTANCE.getString("ProblemConcernActEffectiveTime"),
             new Object [] { hearingPlanOfCareProblemConcern }));
      }
       
      return false;
    }
    return true;
  }

} // HearingPlanOfCareProblemConcernOperations