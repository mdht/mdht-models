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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Activity Start Timing Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePoint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityStartTimingReferenceOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityStartTimingReferenceOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceTemplateId(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceTemplateId(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.55')";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceTemplateId(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceTemplateId(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceTemplateId(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceClassCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceClassCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceClassCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceClassCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceClassCode(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceCodeP(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceCodeP(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceCodeP(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceCodeP(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceCodeP(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceCode(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceEffectiveTime(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceEffectiveTime(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceEffectiveTime(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceEffectiveTime(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceEffectiveTime(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceId(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceId(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceId(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceId(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceId(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceMoodCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceMoodCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceMoodCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceMoodCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceMoodCode(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociation(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociation(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociation(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociation(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceActivityStartAnchorAssociation(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceActivityStartAnchorAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject(classCode=vocab::x_ActClassDocumentEntryAct::ACT)";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCode(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeP(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeP(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeP(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeP(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeP(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCode(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTime(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTime(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTime(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTime(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTime(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCode(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationTypeCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationTypeCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationTypeCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationTypeCode(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceActivityStartAnchorAssociationTypeCode(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceActivityStartAnchorAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePoint(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePoint(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cda::Act)))";

  /**
   * The cached OCL invariant for the '{@link #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePoint(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePoint(ActivityStartTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param activityStartTimingReference The receiving '<em><b>Activity Start Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePoint(ActivityStartTimingReference activityStartTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_START_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityStartTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_START_TIMING_REFERENCE__ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePoint", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityStartTimingReference, context) }),
             new Object [] { activityStartTimingReference }));
      }
       
      return false;
    }
    return true;
  }

} // ActivityStartTimingReferenceOperations