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

import org.openhealthtools.mdht.uml.cda.vsbr.Height;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPlugin;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Height</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Height#validateHeightTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Height#validateHeightClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Height#validateHeightCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Height#validateHeightMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Height#validateHeightValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeightOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeightOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateHeightTemplateId(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHeightTemplateId(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.21')";

  /**
   * The cached OCL invariant for the '{@link #validateHeightTemplateId(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHeightTemplateId(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.21')
   * @param height The receiving '<em><b>Height</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHeightTemplateId(Height height, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.HEIGHT);
      try
      {
        VALIDATE_HEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(height))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.HEIGHT__HEIGHT_TEMPLATE_ID,
             VsbrPlugin.INSTANCE.getString("HeightTemplateId"),
             new Object [] { height }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHeightClassCode(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHeightClassCode(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateHeightClassCode(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHeightClassCode(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param height The receiving '<em><b>Height</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHeightClassCode(Height height, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.HEIGHT);
      try
      {
        VALIDATE_HEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(height))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.HEIGHT__HEIGHT_CLASS_CODE,
             VsbrPlugin.INSTANCE.getString("HeightClassCode"),
             new Object [] { height }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHeightCode(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHeightCode(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHeightCode(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHeightCode(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param height The receiving '<em><b>Height</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHeightCode(Height height, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.HEIGHT);
      try
      {
        VALIDATE_HEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(height))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.HEIGHT__HEIGHT_CODE,
             VsbrPlugin.INSTANCE.getString("HeightCode"),
             new Object [] { height }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHeightMoodCode(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHeightMoodCode(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateHeightMoodCode(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHeightMoodCode(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param height The receiving '<em><b>Height</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHeightMoodCode(Height height, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.HEIGHT);
      try
      {
        VALIDATE_HEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(height))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.HEIGHT__HEIGHT_MOOD_CODE,
             VsbrPlugin.INSTANCE.getString("HeightMoodCode"),
             new Object [] { height }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHeightValue(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHeightValue(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

  /**
   * The cached OCL invariant for the '{@link #validateHeightValue(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHeightValue(Height, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))
   * @param height The receiving '<em><b>Height</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHeightValue(Height height, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.HEIGHT);
      try
      {
        VALIDATE_HEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(height))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.HEIGHT__HEIGHT_VALUE,
             VsbrPlugin.INSTANCE.getString("HeightValue"),
             new Object [] { height }));
      }
       
      return false;
    }
    return true;
  }

} // HeightOperations