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

import org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Locationof Death</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationofDeathOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocationofDeathOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationofDeathTemplateId(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathTemplateId(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATIONOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.10')";

  /**
   * The cached OCL invariant for the '{@link #validateLocationofDeathTemplateId(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathTemplateId(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LOCATIONOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.10')
   * @param locationofDeath The receiving '<em><b>Locationof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLocationofDeathTemplateId(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATIONOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.LOCATIONOF_DEATH);
      try
      {
        VALIDATE_LOCATIONOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATIONOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATIONOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.LOCATIONOF_DEATH__LOCATIONOF_DEATH_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LocationofDeathTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(locationofDeath, context) }),
             new Object [] { locationofDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationofDeathClassCode(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathClassCode(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATIONOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
   * The cached OCL invariant for the '{@link #validateLocationofDeathClassCode(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathClassCode(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LOCATIONOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('classCode')
   * @param locationofDeath The receiving '<em><b>Locationof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLocationofDeathClassCode(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATIONOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.LOCATIONOF_DEATH);
      try
      {
        VALIDATE_LOCATIONOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATIONOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATIONOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.LOCATIONOF_DEATH__LOCATIONOF_DEATH_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LocationofDeathClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(locationofDeath, context) }),
             new Object [] { locationofDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationofDeathCodeP(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathCodeP(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATIONOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateLocationofDeathCodeP(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathCodeP(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LOCATIONOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined()
   * @param locationofDeath The receiving '<em><b>Locationof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLocationofDeathCodeP(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATIONOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.LOCATIONOF_DEATH);
      try
      {
        VALIDATE_LOCATIONOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATIONOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATIONOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.LOCATIONOF_DEATH__LOCATIONOF_DEATH_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LocationofDeathCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(locationofDeath, context) }),
             new Object [] { locationofDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationofDeathCode(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathCode(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATIONOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'LOINC TBD' and value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validateLocationofDeathCode(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathCode(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LOCATIONOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = 'LOINC TBD' and value.codeSystem = '2.16.840.1.113883.6.1'
   * @param locationofDeath The receiving '<em><b>Locationof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLocationofDeathCode(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATIONOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.LOCATIONOF_DEATH);
      try
      {
        VALIDATE_LOCATIONOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATIONOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATIONOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.LOCATIONOF_DEATH__LOCATIONOF_DEATH_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LocationofDeathCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(locationofDeath, context) }),
             new Object [] { locationofDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationofDeathMoodCode(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathMoodCode(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATIONOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
   * The cached OCL invariant for the '{@link #validateLocationofDeathMoodCode(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathMoodCode(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LOCATIONOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('moodCode')
   * @param locationofDeath The receiving '<em><b>Locationof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLocationofDeathMoodCode(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATIONOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.LOCATIONOF_DEATH);
      try
      {
        VALIDATE_LOCATIONOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATIONOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATIONOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.LOCATIONOF_DEATH__LOCATIONOF_DEATH_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LocationofDeathMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(locationofDeath, context) }),
             new Object [] { locationofDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationofDeathText(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathText(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATIONOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateLocationofDeathText(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathText(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LOCATIONOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
   * @param locationofDeath The receiving '<em><b>Locationof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLocationofDeathText(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATIONOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.LOCATIONOF_DEATH);
      try
      {
        VALIDATE_LOCATIONOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATIONOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATIONOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.LOCATIONOF_DEATH__LOCATIONOF_DEATH_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LocationofDeathText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(locationofDeath, context) }),
             new Object [] { locationofDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationofDeathValue(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathValue(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATIONOF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::AD)))";

  /**
   * The cached OCL invariant for the '{@link #validateLocationofDeathValue(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationofDeathValue(LocationofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LOCATIONOF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::AD)))
   * @param locationofDeath The receiving '<em><b>Locationof Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLocationofDeathValue(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATIONOF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.LOCATIONOF_DEATH);
      try
      {
        VALIDATE_LOCATIONOF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATIONOF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATIONOF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationofDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.LOCATIONOF_DEATH__LOCATIONOF_DEATH_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LocationofDeathValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(locationofDeath, context) }),
             new Object [] { locationofDeath }));
      }
       
      return false;
    }
    return true;
  }

} // LocationofDeathOperations