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

import org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsStillLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Numberof Births Still Living</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsStillLiving#validateNumberofBirthsStillLivingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsStillLiving#validateNumberofBirthsStillLivingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsStillLiving#validateNumberofBirthsStillLivingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsStillLiving#validateNumberofBirthsStillLivingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsStillLiving#validateNumberofBirthsStillLivingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberofBirthsStillLivingOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberofBirthsStillLivingOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateNumberofBirthsStillLivingTemplateId(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofBirthsStillLivingTemplateId(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.26')";

  /**
   * The cached OCL invariant for the '{@link #validateNumberofBirthsStillLivingTemplateId(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofBirthsStillLivingTemplateId(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.26')
   * @param numberofBirthsStillLiving The receiving '<em><b>Numberof Births Still Living</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNumberofBirthsStillLivingTemplateId(NumberofBirthsStillLiving numberofBirthsStillLiving, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NUMBEROF_BIRTHS_STILL_LIVING);
      try
      {
        VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberofBirthsStillLiving))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NUMBEROF_BIRTHS_STILL_LIVING__NUMBEROF_BIRTHS_STILL_LIVING_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NumberofBirthsStillLivingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(numberofBirthsStillLiving, context) }),
             new Object [] { numberofBirthsStillLiving }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNumberofBirthsStillLivingClassCode(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofBirthsStillLivingClassCode(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateNumberofBirthsStillLivingClassCode(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofBirthsStillLivingClassCode(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param numberofBirthsStillLiving The receiving '<em><b>Numberof Births Still Living</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNumberofBirthsStillLivingClassCode(NumberofBirthsStillLiving numberofBirthsStillLiving, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NUMBEROF_BIRTHS_STILL_LIVING);
      try
      {
        VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberofBirthsStillLiving))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NUMBEROF_BIRTHS_STILL_LIVING__NUMBEROF_BIRTHS_STILL_LIVING_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NumberofBirthsStillLivingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(numberofBirthsStillLiving, context) }),
             new Object [] { numberofBirthsStillLiving }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNumberofBirthsStillLivingCode(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofBirthsStillLivingCode(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNumberofBirthsStillLivingCode(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofBirthsStillLivingCode(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param numberofBirthsStillLiving The receiving '<em><b>Numberof Births Still Living</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNumberofBirthsStillLivingCode(NumberofBirthsStillLiving numberofBirthsStillLiving, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NUMBEROF_BIRTHS_STILL_LIVING);
      try
      {
        VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberofBirthsStillLiving))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NUMBEROF_BIRTHS_STILL_LIVING__NUMBEROF_BIRTHS_STILL_LIVING_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NumberofBirthsStillLivingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(numberofBirthsStillLiving, context) }),
             new Object [] { numberofBirthsStillLiving }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNumberofBirthsStillLivingMoodCode(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofBirthsStillLivingMoodCode(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
   * The cached OCL invariant for the '{@link #validateNumberofBirthsStillLivingMoodCode(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofBirthsStillLivingMoodCode(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('moodCode')
   * @param numberofBirthsStillLiving The receiving '<em><b>Numberof Births Still Living</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNumberofBirthsStillLivingMoodCode(NumberofBirthsStillLiving numberofBirthsStillLiving, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NUMBEROF_BIRTHS_STILL_LIVING);
      try
      {
        VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberofBirthsStillLiving))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NUMBEROF_BIRTHS_STILL_LIVING__NUMBEROF_BIRTHS_STILL_LIVING_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NumberofBirthsStillLivingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(numberofBirthsStillLiving, context) }),
             new Object [] { numberofBirthsStillLiving }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNumberofBirthsStillLivingValue(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofBirthsStillLivingValue(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

  /**
   * The cached OCL invariant for the '{@link #validateNumberofBirthsStillLivingValue(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Still Living Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofBirthsStillLivingValue(NumberofBirthsStillLiving, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))
   * @param numberofBirthsStillLiving The receiving '<em><b>Numberof Births Still Living</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNumberofBirthsStillLivingValue(NumberofBirthsStillLiving numberofBirthsStillLiving, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NUMBEROF_BIRTHS_STILL_LIVING);
      try
      {
        VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_BIRTHS_STILL_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberofBirthsStillLiving))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NUMBEROF_BIRTHS_STILL_LIVING__NUMBEROF_BIRTHS_STILL_LIVING_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NumberofBirthsStillLivingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(numberofBirthsStillLiving, context) }),
             new Object [] { numberofBirthsStillLiving }));
      }
       
      return false;
    }
    return true;
  }

} // NumberofBirthsStillLivingOperations