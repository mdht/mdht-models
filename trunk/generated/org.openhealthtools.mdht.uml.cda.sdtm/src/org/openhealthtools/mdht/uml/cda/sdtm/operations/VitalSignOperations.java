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

import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Sign</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignAssociatedPosition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Associated Position</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignEventStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionpositionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionpositionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionpositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionpositionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionpositionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Position Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionPosition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Position Position</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#getEventStudyDay() <em>Get Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VitalSignOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignTemplateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignTemplateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.36')";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignTemplateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignTemplateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.36')
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignTemplateId(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignClassCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignClassCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignClassCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignClassCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignClassCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.3.26.1.1')
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignMoodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignMoodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignMoodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignMoodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignMoodCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignValue(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignStatusCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignStatusCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignStatusCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignStatusCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignStatusCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignInterpretationCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignInterpretationCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty() and self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystemName = 'TrialDataIntepretations'))";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignInterpretationCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignInterpretationCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty() and self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
   * value.codeSystemName = 'TrialDataIntepretations'))
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignInterpretationCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignInterpretationCodeP(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignInterpretationCodeP(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignInterpretationCodeP(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignInterpretationCodeP(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignInterpretationCodeP(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_INTERPRETATION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignInterpretationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignTargetSiteCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Target Site Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignTargetSiteCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignTargetSiteCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Target Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignTargetSiteCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignTargetSiteCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_TARGET_SITE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignEffectiveTime(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignEffectiveTime(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignEffectiveTime(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignEffectiveTime(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignEffectiveTime(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignAssociatedPosition(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Associated Position</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignAssociatedPosition(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignAssociatedPosition(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Associated Position</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignAssociatedPosition(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignAssociatedPosition(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_ASSOCIATED_POSITION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignAssociatedPosition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignEventStudyDay(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Event Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignEventStudyDay(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignEventStudyDay(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Event Study Day</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignEventStudyDay(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignEventStudyDay(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_EVENT_STUDY_DAY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignEventStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignPlannedStudyDay(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignPlannedStudyDay(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Planned Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignPlannedStudyDay(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Planned Study Day</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignPlannedStudyDay(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Planned Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignPlannedStudyDay(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_PLANNED_STUDY_DAY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignPlannedStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignTimingReference(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignTimingReference(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignTimingReference(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignTimingReference(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignTimingReference(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignNonPerformanceReason(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignNonPerformanceReason(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignNonPerformanceReason(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignNonPerformanceReason(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignNonPerformanceReason(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGN_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignassociatedPositionpositionClassCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionpositionClassCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignassociatedPositionpositionClassCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionpositionClassCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignassociatedPositionpositionClassCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGNASSOCIATED_POSITIONPOSITION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignassociatedPositionpositionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignassociatedPositionpositionCodeP(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionpositionCodeP(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignassociatedPositionpositionCodeP(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionpositionCodeP(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignassociatedPositionpositionCodeP(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignassociatedPositionpositionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignassociatedPositionpositionCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionpositionCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignassociatedPositionpositionCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionpositionCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignassociatedPositionpositionCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignassociatedPositionpositionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignassociatedPositionpositionMoodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionpositionMoodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignassociatedPositionpositionMoodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionpositionMoodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignassociatedPositionpositionMoodCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGNASSOCIATED_POSITIONPOSITION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignassociatedPositionpositionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignassociatedPositionpositionValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionpositionValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignassociatedPositionpositionValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionpositionValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::CE))))
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignassociatedPositionpositionValue(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGNASSOCIATED_POSITIONPOSITION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignassociatedPositionpositionValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignassociatedPositionTypeCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Position Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionTypeCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGNASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignassociatedPositionTypeCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Position Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionTypeCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGNASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignassociatedPositionTypeCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGNASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGNASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGNASSOCIATED_POSITION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignassociatedPositionTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVitalSignassociatedPositionPosition(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Position Position</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionPosition(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VITAL_SIGNASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateVitalSignassociatedPositionPosition(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Position Position</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVitalSignassociatedPositionPosition(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VITAL_SIGNASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVitalSignassociatedPositionPosition(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_VITAL_SIGNASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VITAL_SIGN);
      try
      {
        VALIDATE_VITAL_SIGNASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VITAL_SIGN__VITAL_SIGNASSOCIATED_POSITION_POSITION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VitalSignassociatedPositionPosition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
             new Object [] { vitalSign }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getEventStudyDay(VitalSign) <em>Get Event Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventStudyDay(VitalSign)
   * @generated
   * @ordered
   */
  protected static final String GET_EVENT_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Study Day))->asSequence()->first().oclAsType(sdtm::Event Study Day)";

  /**
   * The cached OCL query for the '{@link #getEventStudyDay(VitalSign) <em>Get Event Study Day</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventStudyDay(VitalSign)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EVENT_STUDY_DAY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Study Day))->asSequence()->first().oclAsType(sdtm::Event Study Day)
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EventStudyDay getEventStudyDay(VitalSign vitalSign)
  {
    if (GET_EVENT_STUDY_DAY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VITAL_SIGN, SdtmPackage.Literals.VITAL_SIGN.getEAllOperations().get(71));
      try
      {
        GET_EVENT_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_EVENT_STUDY_DAY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_STUDY_DAY__EOCL_QRY);
    return (EventStudyDay) query.evaluate(vitalSign);
  }

  /**
   * The cached OCL expression body for the '{@link #getPlannedStudyDay(VitalSign) <em>Get Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(VitalSign)
   * @generated
   * @ordered
   */
  protected static final String GET_PLANNED_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Planned Study Day))->asSequence()->first().oclAsType(sdtm::Planned Study Day)";

  /**
   * The cached OCL query for the '{@link #getPlannedStudyDay(VitalSign) <em>Get Planned Study Day</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(VitalSign)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PLANNED_STUDY_DAY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Planned Study Day))->asSequence()->first().oclAsType(sdtm::Planned Study Day)
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  PlannedStudyDay getPlannedStudyDay(VitalSign vitalSign)
  {
    if (GET_PLANNED_STUDY_DAY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VITAL_SIGN, SdtmPackage.Literals.VITAL_SIGN.getEAllOperations().get(72));
      try
      {
        GET_PLANNED_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_PLANNED_STUDY_DAY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_STUDY_DAY__EOCL_QRY);
    return (PlannedStudyDay) query.evaluate(vitalSign);
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(VitalSign) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(VitalSign)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->first().oclAsType(sdtm::Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getTimingReference(VitalSign) <em>Get Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(VitalSign)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->first().oclAsType(sdtm::Timing Reference)
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(VitalSign vitalSign)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VITAL_SIGN, SdtmPackage.Literals.VITAL_SIGN.getEAllOperations().get(73));
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
    return (TimingReference) query.evaluate(vitalSign);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(VitalSign) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(VitalSign)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(VitalSign) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(VitalSign)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)
   * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(VitalSign vitalSign)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VITAL_SIGN, SdtmPackage.Literals.VITAL_SIGN.getEAllOperations().get(74));
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
    return (NonPerformanceReason) query.evaluate(vitalSign);
  }

} // VitalSignOperations