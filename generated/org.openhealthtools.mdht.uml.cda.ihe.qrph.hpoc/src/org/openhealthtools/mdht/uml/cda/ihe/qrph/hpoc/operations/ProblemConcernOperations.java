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
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemConcern;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Concern</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemConcern#validateProblemConcernText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemConcern#validateProblemConcernActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemConcern#validateProblemConcernActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemConcernOperations extends ProblemConcernActOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProblemConcernOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemConcernText(ProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemConcernText(ProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEM_CONCERN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateProblemConcernText(ProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemConcernText(ProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEM_CONCERN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemConcern The receiving '<em><b>Problem Concern</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemConcernText(ProblemConcern problemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEM_CONCERN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.PROBLEM_CONCERN);
      try
      {
        VALIDATE_PROBLEM_CONCERN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_CONCERN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_CONCERN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemConcern))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.PROBLEM_CONCERN__PROBLEM_CONCERN_TEXT,
             HPOCPlugin.INSTANCE.getString("ProblemConcernText"),
             new Object [] { problemConcern }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemConcernActTemplateId(ProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemConcernActTemplateId(ProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.16')";

  /**
   * The cached OCL invariant for the '{@link #validateProblemConcernActTemplateId(ProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemConcernActTemplateId(ProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemConcern The receiving '<em><b>Problem Concern</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemConcernActTemplateId(ProblemConcern problemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.PROBLEM_CONCERN);
      try
      {
        VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemConcern))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.PROBLEM_CONCERN__PROBLEM_CONCERN_ACT_TEMPLATE_ID,
             HPOCPlugin.INSTANCE.getString("ProblemConcernActTemplateId"),
             new Object [] { problemConcern }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemConcernActEffectiveTime(ProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemConcernActEffectiveTime(ProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateProblemConcernActEffectiveTime(ProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemConcernActEffectiveTime(ProblemConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemConcern The receiving '<em><b>Problem Concern</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemConcernActEffectiveTime(ProblemConcern problemConcern, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.PROBLEM_CONCERN);
      try
      {
        VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemConcern))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.PROBLEM_CONCERN__PROBLEM_CONCERN_ACT_EFFECTIVE_TIME,
             HPOCPlugin.INSTANCE.getString("ProblemConcernActEffectiveTime"),
             new Object [] { problemConcern }));
      }
       
      return false;
    }
    return true;
  }

} // ProblemConcernOperations