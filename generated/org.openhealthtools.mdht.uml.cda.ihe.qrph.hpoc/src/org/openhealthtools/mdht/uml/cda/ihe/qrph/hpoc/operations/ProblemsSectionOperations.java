/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemConcern;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problems Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection#validateProblemsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection#validateProblemsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection#validateProblemsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection#validateProblemsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection#validateProblemsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection#validateProblemsSectionComponentHpocProblems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Component Hpoc Problems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection#validateProblemsSectionEntryProblemConcern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Entry Problem Concern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemsSectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProblemsSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemsSectionTemplateId(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionTemplateId(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.4')";

  /**
   * The cached OCL invariant for the '{@link #validateProblemsSectionTemplateId(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionTemplateId(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemsSection The receiving '<em><b>Problems Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemsSectionTemplateId(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.PROBLEMS_SECTION);
      try
      {
        VALIDATE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.PROBLEMS_SECTION__PROBLEMS_SECTION_TEMPLATE_ID,
             HPOCPlugin.INSTANCE.getString("ProblemsSectionTemplateId"),
             new Object [] { problemsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemsSectionCode(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionCode(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '11450-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateProblemsSectionCode(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionCode(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemsSection The receiving '<em><b>Problems Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemsSectionCode(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.PROBLEMS_SECTION);
      try
      {
        VALIDATE_PROBLEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.PROBLEMS_SECTION__PROBLEMS_SECTION_CODE,
             HPOCPlugin.INSTANCE.getString("ProblemsSectionCode"),
             new Object [] { problemsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemsSectionCodeP(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionCodeP(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEMS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateProblemsSectionCodeP(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionCodeP(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEMS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemsSection The receiving '<em><b>Problems Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemsSectionCodeP(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEMS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.PROBLEMS_SECTION);
      try
      {
        VALIDATE_PROBLEMS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEMS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEMS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.PROBLEMS_SECTION__PROBLEMS_SECTION_CODE_P,
             HPOCPlugin.INSTANCE.getString("ProblemsSectionCodeP"),
             new Object [] { problemsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemsSectionTitle(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionTitle(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEMS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateProblemsSectionTitle(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionTitle(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEMS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemsSection The receiving '<em><b>Problems Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemsSectionTitle(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEMS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.PROBLEMS_SECTION);
      try
      {
        VALIDATE_PROBLEMS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEMS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEMS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.PROBLEMS_SECTION__PROBLEMS_SECTION_TITLE,
             HPOCPlugin.INSTANCE.getString("ProblemsSectionTitle"),
             new Object [] { problemsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemsSectionText(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionText(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEMS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateProblemsSectionText(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionText(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEMS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemsSection The receiving '<em><b>Problems Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemsSectionText(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEMS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.PROBLEMS_SECTION);
      try
      {
        VALIDATE_PROBLEMS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEMS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEMS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.PROBLEMS_SECTION__PROBLEMS_SECTION_TEXT,
             HPOCPlugin.INSTANCE.getString("ProblemsSectionText"),
             new Object [] { problemsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemsSectionComponentHpocProblems(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Component Hpoc Problems</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionComponentHpocProblems(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEMS_SECTION_COMPONENT_HPOC_PROBLEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies component->one(component : cda::Component5 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component5))";

  /**
   * The cached OCL invariant for the '{@link #validateProblemsSectionComponentHpocProblems(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Component Hpoc Problems</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionComponentHpocProblems(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEMS_SECTION_COMPONENT_HPOC_PROBLEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemsSection The receiving '<em><b>Problems Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemsSectionComponentHpocProblems(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEMS_SECTION_COMPONENT_HPOC_PROBLEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.PROBLEMS_SECTION);
      try
      {
        VALIDATE_PROBLEMS_SECTION_COMPONENT_HPOC_PROBLEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEMS_SECTION_COMPONENT_HPOC_PROBLEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEMS_SECTION_COMPONENT_HPOC_PROBLEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.PROBLEMS_SECTION__PROBLEMS_SECTION_COMPONENT_HPOC_PROBLEMS,
             HPOCPlugin.INSTANCE.getString("ProblemsSectionComponentHpocProblems"),
             new Object [] { problemsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemsSectionEntryProblemConcern(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Entry Problem Concern</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionEntryProblemConcern(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEMS_SECTION_ENTRY_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

  /**
   * The cached OCL invariant for the '{@link #validateProblemsSectionEntryProblemConcern(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problems Section Entry Problem Concern</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemsSectionEntryProblemConcern(ProblemsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEMS_SECTION_ENTRY_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemsSection The receiving '<em><b>Problems Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemsSectionEntryProblemConcern(ProblemsSection problemsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PROBLEMS_SECTION_ENTRY_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.PROBLEMS_SECTION);
      try
      {
        VALIDATE_PROBLEMS_SECTION_ENTRY_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEMS_SECTION_ENTRY_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEMS_SECTION_ENTRY_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.PROBLEMS_SECTION__PROBLEMS_SECTION_ENTRY_PROBLEM_CONCERN,
             HPOCPlugin.INSTANCE.getString("ProblemsSectionEntryProblemConcern"),
             new Object [] { problemsSection }));
      }
       
      return false;
    }
    return true;
  }

} // ProblemsSectionOperations