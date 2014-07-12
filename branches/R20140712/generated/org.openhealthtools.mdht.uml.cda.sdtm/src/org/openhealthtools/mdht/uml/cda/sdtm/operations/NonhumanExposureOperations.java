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

import org.openhealthtools.mdht.uml.cda.operations.SubstanceAdministrationOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Exposure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureConsumableMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Consumable Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureDoseAdjustmentReasonAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Dose Adjustment Reason Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonhumanExposureOperations extends SubstanceAdministrationOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonhumanExposureOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureTemplateId(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureTemplateId(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.21')";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureTemplateId(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureTemplateId(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureTemplateId(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureClassCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureClassCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureClassCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureClassCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureClassCode(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureDoseQuantity(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Dose Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureDoseQuantity(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureDoseQuantity(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Dose Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureDoseQuantity(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureDoseQuantity(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_DOSE_QUANTITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureEffectiveTime(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureEffectiveTime(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureEffectiveTime(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureEffectiveTime(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureEffectiveTime(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureId(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureId(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureId(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureId(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureId(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureMoodCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureMoodCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureMoodCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureMoodCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureMoodCode(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureRouteCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Route Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureRouteCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureRouteCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Route Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureRouteCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureRouteCode(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_ROUTE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureRouteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureMaxDoseQuantity(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Max Dose Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureMaxDoseQuantity(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureMaxDoseQuantity(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Max Dose Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureMaxDoseQuantity(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureMaxDoseQuantity(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_MAX_DOSE_QUANTITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureMaxDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureText(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureText(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureText(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureText(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureText(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureApproachSiteCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Approach Site Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureApproachSiteCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | element.oclIsTypeOf(datatypes::CE)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureApproachSiteCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Approach Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureApproachSiteCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureApproachSiteCode(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_APPROACH_SITE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureApproachSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureConsumableMaterial(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Consumable Material</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureConsumableMaterial(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(sdtm::Consumable Material))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureConsumableMaterial(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Consumable Material</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureConsumableMaterial(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureConsumableMaterial(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_CONSUMABLE_MATERIAL,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureConsumableMaterial", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureDoseAdjustmentReasonAssociation(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Dose Adjustment Reason Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureDoseAdjustmentReasonAssociation(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureDoseAdjustmentReasonAssociation(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Dose Adjustment Reason Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureDoseAdjustmentReasonAssociation(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureDoseAdjustmentReasonAssociation(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureDoseAdjustmentReasonAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureTimingReference(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureTimingReference(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureTimingReference(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureTimingReference(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureTimingReference(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposureStudyDayPeriod(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureStudyDayPeriod(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposureStudyDayPeriod(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposureStudyDayPeriod(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposureStudyDayPeriod(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSURE_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposureStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::CAUS)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode(NonhumanExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanExposure The receiving '<em><b>Nonhuman Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode(NonhumanExposure nonhumanExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE);
      try
      {
        VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_EXPOSURE__NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanExposuredoseAdjustmentReasonAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanExposure, context) }),
             new Object [] { nonhumanExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(NonhumanExposure) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(NonhumanExposure)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getTimingReference(NonhumanExposure) <em>Get Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(NonhumanExposure)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(NonhumanExposure nonhumanExposure)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE, SdtmPackage.Literals.NONHUMAN_EXPOSURE.getEAllOperations().get(71));
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
    return (TimingReference) query.evaluate(nonhumanExposure);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(NonhumanExposure) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(NonhumanExposure)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(NonhumanExposure) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(NonhumanExposure)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(NonhumanExposure nonhumanExposure)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_EXPOSURE, SdtmPackage.Literals.NONHUMAN_EXPOSURE.getEAllOperations().get(72));
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
    return (StudyDayPeriod) query.evaluate(nonhumanExposure);
  }

} // NonhumanExposureOperations