/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Autopsy Results</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutopsyResultsOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AutopsyResultsOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyResultsTemplateId(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyResultsTemplateId(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_RESULTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.3')";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyResultsTemplateId(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyResultsTemplateId(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_RESULTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.3')
   * @param autopsyResults The receiving '<em><b>Autopsy Results</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyResultsTemplateId(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_RESULTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_RESULTS);
      try
      {
        VALIDATE_AUTOPSY_RESULTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_RESULTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_RESULTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyResults))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_RESULTS__AUTOPSY_RESULTS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyResultsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyResults, context) }),
             new Object [] { autopsyResults }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyResultsClassCode(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyResultsClassCode(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_RESULTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyResultsClassCode(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyResultsClassCode(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_RESULTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param autopsyResults The receiving '<em><b>Autopsy Results</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyResultsClassCode(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_RESULTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_RESULTS);
      try
      {
        VALIDATE_AUTOPSY_RESULTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_RESULTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_RESULTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyResults))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_RESULTS__AUTOPSY_RESULTS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyResultsClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyResults, context) }),
             new Object [] { autopsyResults }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyResultsCodeP(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyResultsCodeP(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_RESULTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyResultsCodeP(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyResultsCodeP(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_RESULTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined()
   * @param autopsyResults The receiving '<em><b>Autopsy Results</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyResultsCodeP(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_RESULTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_RESULTS);
      try
      {
        VALIDATE_AUTOPSY_RESULTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_RESULTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_RESULTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyResults))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_RESULTS__AUTOPSY_RESULTS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyResultsCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyResults, context) }),
             new Object [] { autopsyResults }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyResultsCode(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyResultsCode(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_RESULTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69436-4' and value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyResultsCode(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyResultsCode(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_RESULTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = '69436-4' and value.codeSystem = '2.16.840.1.113883.6.1'
   * @param autopsyResults The receiving '<em><b>Autopsy Results</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyResultsCode(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_RESULTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_RESULTS);
      try
      {
        VALIDATE_AUTOPSY_RESULTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_RESULTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_RESULTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyResults))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_RESULTS__AUTOPSY_RESULTS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyResultsCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyResults, context) }),
             new Object [] { autopsyResults }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyResultsMoodCode(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyResultsMoodCode(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_RESULTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyResultsMoodCode(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyResultsMoodCode(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_RESULTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param autopsyResults The receiving '<em><b>Autopsy Results</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyResultsMoodCode(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_RESULTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_RESULTS);
      try
      {
        VALIDATE_AUTOPSY_RESULTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_RESULTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_RESULTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyResults))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_RESULTS__AUTOPSY_RESULTS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyResultsMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyResults, context) }),
             new Object [] { autopsyResults }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyResultsValue(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyResultsValue(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_RESULTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyResultsValue(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyResultsValue(AutopsyResults, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_RESULTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param autopsyResults The receiving '<em><b>Autopsy Results</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyResultsValue(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_RESULTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_RESULTS);
      try
      {
        VALIDATE_AUTOPSY_RESULTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_RESULTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_RESULTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyResults))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_RESULTS__AUTOPSY_RESULTS_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyResultsValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyResults, context) }),
             new Object [] { autopsyResults }));
      }
       
      return false;
    }
    return true;
  }

} // AutopsyResultsOperations