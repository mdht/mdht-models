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

import org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Timeof Death</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeofDeathOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeofDeathOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateTimeofDeathTemplateId(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathTemplateId(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.13')";

  /**
   * The cached OCL invariant for the '{@link #validateTimeofDeathTemplateId(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathTemplateId(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.13')
   * @param timeofDeath The receiving '<em><b>Timeof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTimeofDeathTemplateId(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.TIMEOF_DEATH);
      try
      {
        VALIDATE_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(timeofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.TIMEOF_DEATH__TIMEOF_DEATH_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimeofDeathTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timeofDeath, context) }),
             new Object [] { timeofDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateTimeofDeathClassCode(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathClassCode(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateTimeofDeathClassCode(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathClassCode(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param timeofDeath The receiving '<em><b>Timeof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTimeofDeathClassCode(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.TIMEOF_DEATH);
      try
      {
        VALIDATE_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(timeofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.TIMEOF_DEATH__TIMEOF_DEATH_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimeofDeathClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timeofDeath, context) }),
             new Object [] { timeofDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateTimeofDeathCodeP(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathCodeP(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateTimeofDeathCodeP(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathCodeP(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined()
   * @param timeofDeath The receiving '<em><b>Timeof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTimeofDeathCodeP(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.TIMEOF_DEATH);
      try
      {
        VALIDATE_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(timeofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.TIMEOF_DEATH__TIMEOF_DEATH_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimeofDeathCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timeofDeath, context) }),
             new Object [] { timeofDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateTimeofDeathCode(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathCode(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '31211-6' and value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validateTimeofDeathCode(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathCode(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = '31211-6' and value.codeSystem = '2.16.840.1.113883.6.1'
   * @param timeofDeath The receiving '<em><b>Timeof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTimeofDeathCode(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.TIMEOF_DEATH);
      try
      {
        VALIDATE_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(timeofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.TIMEOF_DEATH__TIMEOF_DEATH_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimeofDeathCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timeofDeath, context) }),
             new Object [] { timeofDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateTimeofDeathEffectiveTime(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathEffectiveTime(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateTimeofDeathEffectiveTime(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathEffectiveTime(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param timeofDeath The receiving '<em><b>Timeof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTimeofDeathEffectiveTime(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.TIMEOF_DEATH);
      try
      {
        VALIDATE_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(timeofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.TIMEOF_DEATH__TIMEOF_DEATH_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimeofDeathEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timeofDeath, context) }),
             new Object [] { timeofDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateTimeofDeathMoodCode(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathMoodCode(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateTimeofDeathMoodCode(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathMoodCode(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param timeofDeath The receiving '<em><b>Timeof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTimeofDeathMoodCode(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.TIMEOF_DEATH);
      try
      {
        VALIDATE_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(timeofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.TIMEOF_DEATH__TIMEOF_DEATH_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimeofDeathMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timeofDeath, context) }),
             new Object [] { timeofDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateTimeofDeathText(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathText(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateTimeofDeathText(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTimeofDeathText(TimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
   * @param timeofDeath The receiving '<em><b>Timeof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTimeofDeathText(TimeofDeath timeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.TIMEOF_DEATH);
      try
      {
        VALIDATE_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(timeofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.TIMEOF_DEATH__TIMEOF_DEATH_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimeofDeathText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timeofDeath, context) }),
             new Object [] { timeofDeath }));
      }
       
      return false;
    }
    return true;
  }

} // TimeofDeathOperations