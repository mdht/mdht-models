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

import org.openhealthtools.mdht.uml.cda.vsbr.Plurality;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPlugin;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plurality</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Plurality#validatePluralityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Plurality#validatePluralityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Plurality#validatePluralityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Plurality#validatePluralityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Plurality#validatePluralityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PluralityOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PluralityOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validatePluralityTemplateId(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePluralityTemplateId(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PLURALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.31')";

  /**
   * The cached OCL invariant for the '{@link #validatePluralityTemplateId(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePluralityTemplateId(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PLURALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.31')
   * @param plurality The receiving '<em><b>Plurality</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePluralityTemplateId(Plurality plurality, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PLURALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PLURALITY);
      try
      {
        VALIDATE_PLURALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLURALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLURALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plurality))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PLURALITY__PLURALITY_TEMPLATE_ID,
             VsbrPlugin.INSTANCE.getString("PluralityTemplateId"),
             new Object [] { plurality }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePluralityClassCode(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePluralityClassCode(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PLURALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validatePluralityClassCode(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePluralityClassCode(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PLURALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param plurality The receiving '<em><b>Plurality</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePluralityClassCode(Plurality plurality, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PLURALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PLURALITY);
      try
      {
        VALIDATE_PLURALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLURALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLURALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plurality))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PLURALITY__PLURALITY_CLASS_CODE,
             VsbrPlugin.INSTANCE.getString("PluralityClassCode"),
             new Object [] { plurality }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePluralityCode(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePluralityCode(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PLURALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePluralityCode(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePluralityCode(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PLURALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param plurality The receiving '<em><b>Plurality</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePluralityCode(Plurality plurality, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PLURALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PLURALITY);
      try
      {
        VALIDATE_PLURALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLURALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLURALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plurality))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PLURALITY__PLURALITY_CODE,
             VsbrPlugin.INSTANCE.getString("PluralityCode"),
             new Object [] { plurality }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePluralityMoodCode(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePluralityMoodCode(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PLURALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validatePluralityMoodCode(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePluralityMoodCode(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PLURALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param plurality The receiving '<em><b>Plurality</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePluralityMoodCode(Plurality plurality, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PLURALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PLURALITY);
      try
      {
        VALIDATE_PLURALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLURALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLURALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plurality))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PLURALITY__PLURALITY_MOOD_CODE,
             VsbrPlugin.INSTANCE.getString("PluralityMoodCode"),
             new Object [] { plurality }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePluralityValue(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePluralityValue(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PLURALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

  /**
   * The cached OCL invariant for the '{@link #validatePluralityValue(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePluralityValue(Plurality, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PLURALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))
   * @param plurality The receiving '<em><b>Plurality</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePluralityValue(Plurality plurality, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PLURALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PLURALITY);
      try
      {
        VALIDATE_PLURALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLURALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLURALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plurality))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PLURALITY__PLURALITY_VALUE,
             VsbrPlugin.INSTANCE.getString("PluralityValue"),
             new Object [] { plurality }));
      }
       
      return false;
    }
    return true;
  }

} // PluralityOperations