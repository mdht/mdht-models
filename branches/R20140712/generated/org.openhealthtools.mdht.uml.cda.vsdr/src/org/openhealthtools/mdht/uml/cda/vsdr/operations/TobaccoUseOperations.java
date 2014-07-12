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

import org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tobacco Use</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse#validateTobaccoUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse#validateTobaccoUseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse#validateTobaccoUseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse#validateTobaccoUseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse#validateTobaccoUseValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TobaccoUseOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TobaccoUseOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateTobaccoUseTemplateId(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTobaccoUseTemplateId(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.14')";

  /**
   * The cached OCL invariant for the '{@link #validateTobaccoUseTemplateId(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTobaccoUseTemplateId(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTobaccoUseTemplateId(TobaccoUse tobaccoUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.TOBACCO_USE);
      try
      {
        VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.TOBACCO_USE__TOBACCO_USE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TobaccoUseTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tobaccoUse, context) }),
             new Object [] { tobaccoUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateTobaccoUseClassCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTobaccoUseClassCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateTobaccoUseClassCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTobaccoUseClassCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTobaccoUseClassCode(TobaccoUse tobaccoUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.TOBACCO_USE);
      try
      {
        VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.TOBACCO_USE__TOBACCO_USE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TobaccoUseClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tobaccoUse, context) }),
             new Object [] { tobaccoUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTobaccoUseCode(TobaccoUse tobaccoUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.TOBACCO_USE);
      try
      {
        VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.TOBACCO_USE__TOBACCO_USE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TobaccoUseCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tobaccoUse, context) }),
             new Object [] { tobaccoUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateTobaccoUseMoodCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTobaccoUseMoodCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateTobaccoUseMoodCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTobaccoUseMoodCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateTobaccoUseCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTobaccoUseCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69443-0' and value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validateTobaccoUseCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTobaccoUseCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTobaccoUseMoodCode(TobaccoUse tobaccoUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.TOBACCO_USE);
      try
      {
        VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.TOBACCO_USE__TOBACCO_USE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TobaccoUseMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tobaccoUse, context) }),
             new Object [] { tobaccoUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateTobaccoUseValue(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTobaccoUseValue(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateTobaccoUseValue(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTobaccoUseValue(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTobaccoUseValue(TobaccoUse tobaccoUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.TOBACCO_USE);
      try
      {
        VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.TOBACCO_USE__TOBACCO_USE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TobaccoUseValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tobaccoUse, context) }),
             new Object [] { tobaccoUse }));
      }
       
      return false;
    }
    return true;
  }

} // TobaccoUseOperations