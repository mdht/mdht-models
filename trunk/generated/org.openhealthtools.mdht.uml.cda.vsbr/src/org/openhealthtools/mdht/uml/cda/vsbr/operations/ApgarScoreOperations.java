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

import org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Apgar Score</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore#validateApgarScoreTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore#validateApgarScoreClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore#validateApgarScoreCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore#validateApgarScoreMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore#validateApgarScoreValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApgarScoreOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApgarScoreOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateApgarScoreTemplateId(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateApgarScoreTemplateId(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_APGAR_SCORE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.9')";

  /**
   * The cached OCL invariant for the '{@link #validateApgarScoreTemplateId(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateApgarScoreTemplateId(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_APGAR_SCORE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.9')
   * @param apgarScore The receiving '<em><b>Apgar Score</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateApgarScoreTemplateId(ApgarScore apgarScore, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_APGAR_SCORE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.APGAR_SCORE);
      try
      {
        VALIDATE_APGAR_SCORE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_APGAR_SCORE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_APGAR_SCORE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(apgarScore))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.APGAR_SCORE__APGAR_SCORE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ApgarScoreTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(apgarScore, context) }),
             new Object [] { apgarScore }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateApgarScoreClassCode(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateApgarScoreClassCode(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_APGAR_SCORE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateApgarScoreClassCode(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateApgarScoreClassCode(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_APGAR_SCORE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param apgarScore The receiving '<em><b>Apgar Score</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateApgarScoreClassCode(ApgarScore apgarScore, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_APGAR_SCORE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.APGAR_SCORE);
      try
      {
        VALIDATE_APGAR_SCORE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_APGAR_SCORE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_APGAR_SCORE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(apgarScore))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.APGAR_SCORE__APGAR_SCORE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ApgarScoreClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(apgarScore, context) }),
             new Object [] { apgarScore }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateApgarScoreCode(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateApgarScoreCode(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_APGAR_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateApgarScoreCode(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateApgarScoreCode(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_APGAR_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param apgarScore The receiving '<em><b>Apgar Score</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateApgarScoreCode(ApgarScore apgarScore, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_APGAR_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.APGAR_SCORE);
      try
      {
        VALIDATE_APGAR_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_APGAR_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_APGAR_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(apgarScore))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.APGAR_SCORE__APGAR_SCORE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ApgarScoreCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(apgarScore, context) }),
             new Object [] { apgarScore }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateApgarScoreMoodCode(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateApgarScoreMoodCode(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_APGAR_SCORE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateApgarScoreMoodCode(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateApgarScoreMoodCode(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_APGAR_SCORE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param apgarScore The receiving '<em><b>Apgar Score</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateApgarScoreMoodCode(ApgarScore apgarScore, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_APGAR_SCORE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.APGAR_SCORE);
      try
      {
        VALIDATE_APGAR_SCORE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_APGAR_SCORE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_APGAR_SCORE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(apgarScore))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.APGAR_SCORE__APGAR_SCORE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ApgarScoreMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(apgarScore, context) }),
             new Object [] { apgarScore }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateApgarScoreValue(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateApgarScoreValue(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_APGAR_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

  /**
   * The cached OCL invariant for the '{@link #validateApgarScoreValue(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateApgarScoreValue(ApgarScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_APGAR_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))
   * @param apgarScore The receiving '<em><b>Apgar Score</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateApgarScoreValue(ApgarScore apgarScore, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_APGAR_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.APGAR_SCORE);
      try
      {
        VALIDATE_APGAR_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_APGAR_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_APGAR_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(apgarScore))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.APGAR_SCORE__APGAR_SCORE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ApgarScoreValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(apgarScore, context) }),
             new Object [] { apgarScore }));
      }
       
      return false;
    }
    return true;
  }

} // ApgarScoreOperations