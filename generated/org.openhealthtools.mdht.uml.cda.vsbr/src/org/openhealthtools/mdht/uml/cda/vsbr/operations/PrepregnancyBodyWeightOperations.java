/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prepregnancy Body Weight</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight#validatePrepregnancyBodyWeightTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight#validatePrepregnancyBodyWeightClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight#validatePrepregnancyBodyWeightCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight#validatePrepregnancyBodyWeightMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight#validatePrepregnancyBodyWeightValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrepregnancyBodyWeightOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrepregnancyBodyWeightOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validatePrepregnancyBodyWeightTemplateId(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePrepregnancyBodyWeightTemplateId(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PREPREGNANCY_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.33')";

  /**
   * The cached OCL invariant for the '{@link #validatePrepregnancyBodyWeightTemplateId(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePrepregnancyBodyWeightTemplateId(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PREPREGNANCY_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.33')
   * @param prepregnancyBodyWeight The receiving '<em><b>Prepregnancy Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePrepregnancyBodyWeightTemplateId(PrepregnancyBodyWeight prepregnancyBodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PREPREGNANCY_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PREPREGNANCY_BODY_WEIGHT);
      try
      {
        VALIDATE_PREPREGNANCY_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREPREGNANCY_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PREPREGNANCY_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prepregnancyBodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PREPREGNANCY_BODY_WEIGHT__PREPREGNANCY_BODY_WEIGHT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrepregnancyBodyWeightTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prepregnancyBodyWeight, context) }),
             new Object [] { prepregnancyBodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePrepregnancyBodyWeightClassCode(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePrepregnancyBodyWeightClassCode(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PREPREGNANCY_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validatePrepregnancyBodyWeightClassCode(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePrepregnancyBodyWeightClassCode(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PREPREGNANCY_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param prepregnancyBodyWeight The receiving '<em><b>Prepregnancy Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePrepregnancyBodyWeightClassCode(PrepregnancyBodyWeight prepregnancyBodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PREPREGNANCY_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PREPREGNANCY_BODY_WEIGHT);
      try
      {
        VALIDATE_PREPREGNANCY_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREPREGNANCY_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PREPREGNANCY_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prepregnancyBodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PREPREGNANCY_BODY_WEIGHT__PREPREGNANCY_BODY_WEIGHT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrepregnancyBodyWeightClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prepregnancyBodyWeight, context) }),
             new Object [] { prepregnancyBodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePrepregnancyBodyWeightCode(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePrepregnancyBodyWeightCode(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PREPREGNANCY_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePrepregnancyBodyWeightCode(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePrepregnancyBodyWeightCode(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PREPREGNANCY_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param prepregnancyBodyWeight The receiving '<em><b>Prepregnancy Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePrepregnancyBodyWeightCode(PrepregnancyBodyWeight prepregnancyBodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PREPREGNANCY_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PREPREGNANCY_BODY_WEIGHT);
      try
      {
        VALIDATE_PREPREGNANCY_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREPREGNANCY_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PREPREGNANCY_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prepregnancyBodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PREPREGNANCY_BODY_WEIGHT__PREPREGNANCY_BODY_WEIGHT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrepregnancyBodyWeightCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prepregnancyBodyWeight, context) }),
             new Object [] { prepregnancyBodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePrepregnancyBodyWeightMoodCode(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePrepregnancyBodyWeightMoodCode(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PREPREGNANCY_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validatePrepregnancyBodyWeightMoodCode(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePrepregnancyBodyWeightMoodCode(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PREPREGNANCY_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param prepregnancyBodyWeight The receiving '<em><b>Prepregnancy Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePrepregnancyBodyWeightMoodCode(PrepregnancyBodyWeight prepregnancyBodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PREPREGNANCY_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PREPREGNANCY_BODY_WEIGHT);
      try
      {
        VALIDATE_PREPREGNANCY_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREPREGNANCY_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PREPREGNANCY_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prepregnancyBodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PREPREGNANCY_BODY_WEIGHT__PREPREGNANCY_BODY_WEIGHT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrepregnancyBodyWeightMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prepregnancyBodyWeight, context) }),
             new Object [] { prepregnancyBodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePrepregnancyBodyWeightValue(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePrepregnancyBodyWeightValue(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PREPREGNANCY_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

  /**
   * The cached OCL invariant for the '{@link #validatePrepregnancyBodyWeightValue(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePrepregnancyBodyWeightValue(PrepregnancyBodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PREPREGNANCY_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))
   * @param prepregnancyBodyWeight The receiving '<em><b>Prepregnancy Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePrepregnancyBodyWeightValue(PrepregnancyBodyWeight prepregnancyBodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PREPREGNANCY_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PREPREGNANCY_BODY_WEIGHT);
      try
      {
        VALIDATE_PREPREGNANCY_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREPREGNANCY_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PREPREGNANCY_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(prepregnancyBodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PREPREGNANCY_BODY_WEIGHT__PREPREGNANCY_BODY_WEIGHT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrepregnancyBodyWeightValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(prepregnancyBodyWeight, context) }),
             new Object [] { prepregnancyBodyWeight }));
      }
       
      return false;
    }
    return true;
  }

} // PrepregnancyBodyWeightOperations