/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Body Weight Gain</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyWeightGainOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyWeightGainOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainTemplateId(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainTemplateId(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.44')";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainTemplateId(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainTemplateId(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainTemplateId(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainClassCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainClassCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainClassCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainClassCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainClassCode(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainCode(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainId(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainId(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainId(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainId(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainId(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainMoodCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainMoodCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainMoodCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainMoodCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainMoodCode(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainValue(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainValue(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainValue(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainValue(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainValue(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainStatusCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainStatusCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainStatusCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainStatusCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainStatusCode(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainEffectiveTime(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainEffectiveTime(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainEffectiveTime(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainEffectiveTime(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainEffectiveTime(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainInterpretationCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainInterpretationCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainInterpretationCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainInterpretationCode(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainInterpretationCode(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainNonPerformanceReason(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainNonPerformanceReason(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainNonPerformanceReason(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainNonPerformanceReason(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainNonPerformanceReason(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainStudyDayPeriod(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainStudyDayPeriod(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period))";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainStudyDayPeriod(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainStudyDayPeriod(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainStudyDayPeriod(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainTimingReference(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainTimingReference(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference))";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainTimingReference(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainTimingReference(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainTimingReference(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightGainExclusionReason(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Exclusion Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainExclusionReason(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_GAIN_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Exclusion Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightGainExclusionReason(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Exclusion Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightGainExclusionReason(BodyWeightGain, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_GAIN_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeightGain The receiving '<em><b>Body Weight Gain</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightGainExclusionReason(BodyWeightGain bodyWeightGain, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_GAIN_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN);
      try
      {
        VALIDATE_BODY_WEIGHT_GAIN_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_GAIN_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_GAIN_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightGain))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT_GAIN__BODY_WEIGHT_GAIN_EXCLUSION_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightGainExclusionReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightGain, context) }),
             new Object [] { bodyWeightGain }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(BodyWeightGain) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(BodyWeightGain)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(BodyWeightGain) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(BodyWeightGain)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(BodyWeightGain bodyWeightGain)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN, SdtmPackage.Literals.BODY_WEIGHT_GAIN.getEAllOperations().get(64));
      try
      {
        GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
    return (NonPerformanceReason) query.evaluate(bodyWeightGain);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(BodyWeightGain) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(BodyWeightGain)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(BodyWeightGain) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(BodyWeightGain)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(BodyWeightGain bodyWeightGain)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN, SdtmPackage.Literals.BODY_WEIGHT_GAIN.getEAllOperations().get(65));
      try
      {
        GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
    return (StudyDayPeriod) query.evaluate(bodyWeightGain);
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(BodyWeightGain) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(BodyWeightGain)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getTimingReference(BodyWeightGain) <em>Get Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(BodyWeightGain)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(BodyWeightGain bodyWeightGain)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN, SdtmPackage.Literals.BODY_WEIGHT_GAIN.getEAllOperations().get(66));
      try
      {
        GET_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_TIMING_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TIMING_REFERENCE__EOCL_QRY);
    return (TimingReference) query.evaluate(bodyWeightGain);
  }

  /**
   * The cached OCL expression body for the '{@link #getExclusionReason(BodyWeightGain) <em>Get Exclusion Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionReason(BodyWeightGain)
   * @generated
   * @ordered
   */
  protected static final String GET_EXCLUSION_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Exclusion Reason))->asSequence()->any(true).oclAsType(sdtm::Exclusion Reason)";

  /**
   * The cached OCL query for the '{@link #getExclusionReason(BodyWeightGain) <em>Get Exclusion Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionReason(BodyWeightGain)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EXCLUSION_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ExclusionReason getExclusionReason(BodyWeightGain bodyWeightGain)
  {
    if (GET_EXCLUSION_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.BODY_WEIGHT_GAIN, SdtmPackage.Literals.BODY_WEIGHT_GAIN.getEAllOperations().get(67));
      try
      {
        GET_EXCLUSION_REASON__EOCL_QRY = helper.createQuery(GET_EXCLUSION_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EXCLUSION_REASON__EOCL_QRY);
    return (ExclusionReason) query.evaluate(bodyWeightGain);
  }

} // BodyWeightGainOperations