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

import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Numberof Live Birthsnow Dead</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead#validateNumberofLiveBirthsnowDeadTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead#validateNumberofLiveBirthsnowDeadClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead#validateNumberofLiveBirthsnowDeadCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead#validateNumberofLiveBirthsnowDeadMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead#validateNumberofLiveBirthsnowDeadValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberofLiveBirthsnowDeadOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberofLiveBirthsnowDeadOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateNumberofLiveBirthsnowDeadTemplateId(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofLiveBirthsnowDeadTemplateId(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.28')";

  /**
   * The cached OCL invariant for the '{@link #validateNumberofLiveBirthsnowDeadTemplateId(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofLiveBirthsnowDeadTemplateId(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.28')
   * @param numberofLiveBirthsnowDead The receiving '<em><b>Numberof Live Birthsnow Dead</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNumberofLiveBirthsnowDeadTemplateId(NumberofLiveBirthsnowDead numberofLiveBirthsnowDead, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHSNOW_DEAD);
      try
      {
        VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberofLiveBirthsnowDead))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NUMBEROF_LIVE_BIRTHSNOW_DEAD__NUMBEROF_LIVE_BIRTHSNOW_DEAD_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NumberofLiveBirthsnowDeadTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(numberofLiveBirthsnowDead, context) }),
             new Object [] { numberofLiveBirthsnowDead }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNumberofLiveBirthsnowDeadClassCode(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofLiveBirthsnowDeadClassCode(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateNumberofLiveBirthsnowDeadClassCode(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofLiveBirthsnowDeadClassCode(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param numberofLiveBirthsnowDead The receiving '<em><b>Numberof Live Birthsnow Dead</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNumberofLiveBirthsnowDeadClassCode(NumberofLiveBirthsnowDead numberofLiveBirthsnowDead, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHSNOW_DEAD);
      try
      {
        VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberofLiveBirthsnowDead))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NUMBEROF_LIVE_BIRTHSNOW_DEAD__NUMBEROF_LIVE_BIRTHSNOW_DEAD_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NumberofLiveBirthsnowDeadClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(numberofLiveBirthsnowDead, context) }),
             new Object [] { numberofLiveBirthsnowDead }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNumberofLiveBirthsnowDeadCode(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofLiveBirthsnowDeadCode(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNumberofLiveBirthsnowDeadCode(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofLiveBirthsnowDeadCode(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param numberofLiveBirthsnowDead The receiving '<em><b>Numberof Live Birthsnow Dead</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNumberofLiveBirthsnowDeadCode(NumberofLiveBirthsnowDead numberofLiveBirthsnowDead, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHSNOW_DEAD);
      try
      {
        VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberofLiveBirthsnowDead))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NUMBEROF_LIVE_BIRTHSNOW_DEAD__NUMBEROF_LIVE_BIRTHSNOW_DEAD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NumberofLiveBirthsnowDeadCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(numberofLiveBirthsnowDead, context) }),
             new Object [] { numberofLiveBirthsnowDead }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNumberofLiveBirthsnowDeadMoodCode(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofLiveBirthsnowDeadMoodCode(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateNumberofLiveBirthsnowDeadMoodCode(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofLiveBirthsnowDeadMoodCode(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param numberofLiveBirthsnowDead The receiving '<em><b>Numberof Live Birthsnow Dead</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNumberofLiveBirthsnowDeadMoodCode(NumberofLiveBirthsnowDead numberofLiveBirthsnowDead, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHSNOW_DEAD);
      try
      {
        VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberofLiveBirthsnowDead))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NUMBEROF_LIVE_BIRTHSNOW_DEAD__NUMBEROF_LIVE_BIRTHSNOW_DEAD_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NumberofLiveBirthsnowDeadMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(numberofLiveBirthsnowDead, context) }),
             new Object [] { numberofLiveBirthsnowDead }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNumberofLiveBirthsnowDeadValue(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofLiveBirthsnowDeadValue(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

  /**
   * The cached OCL invariant for the '{@link #validateNumberofLiveBirthsnowDeadValue(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Birthsnow Dead Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNumberofLiveBirthsnowDeadValue(NumberofLiveBirthsnowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))
   * @param numberofLiveBirthsnowDead The receiving '<em><b>Numberof Live Birthsnow Dead</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNumberofLiveBirthsnowDeadValue(NumberofLiveBirthsnowDead numberofLiveBirthsnowDead, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHSNOW_DEAD);
      try
      {
        VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_LIVE_BIRTHSNOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberofLiveBirthsnowDead))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NUMBEROF_LIVE_BIRTHSNOW_DEAD__NUMBEROF_LIVE_BIRTHSNOW_DEAD_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NumberofLiveBirthsnowDeadValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(numberofLiveBirthsnowDead, context) }),
             new Object [] { numberofLiveBirthsnowDead }));
      }
       
      return false;
    }
    return true;
  }

} // NumberofLiveBirthsnowDeadOperations