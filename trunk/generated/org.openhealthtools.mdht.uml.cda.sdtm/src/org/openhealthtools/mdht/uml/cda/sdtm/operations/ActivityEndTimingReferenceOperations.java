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

import org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Activity End Timing Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityEndTimingReferenceOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityEndTimingReferenceOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceTemplateId(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceTemplateId(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.54')";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceTemplateId(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceTemplateId(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.54')
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceTemplateId(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceClassCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceClassCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceClassCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceClassCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceClassCode(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceCodeP(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceCodeP(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceCodeP(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceCodeP(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceCodeP(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.3.26.1.1')
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceCode(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceEffectiveTime(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceEffectiveTime(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceEffectiveTime(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceEffectiveTime(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceEffectiveTime(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceId(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceId(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceId(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceId(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceId(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceMoodCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceMoodCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceMoodCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceMoodCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_DocumentActMood::EVN
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceMoodCode(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociation(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociation(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociation(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociation(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceActivityEndAnchorAssociation(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceActivityEndAnchorAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject(classCode=vocab::x_ActClassDocumentEntryAct::ACT)";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).act->excluding(null)->reject(classCode=vocab::x_ActClassDocumentEntryAct::ACT)
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).act->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).act->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).act->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).act->excluding(null)->reject(isDefined('moodCode'))
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cda::Act)))";

  /**
   * The cached OCL invariant for the '{@link #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint(ActivityEndTimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cda::Act)))
   * @param activityEndTimingReference The receiving '<em><b>Activity End Timing Reference</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint(ActivityEndTimingReference activityEndTimingReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ACTIVITY_END_TIMING_REFERENCE);
      try
      {
        VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(activityEndTimingReference))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ACTIVITY_END_TIMING_REFERENCE__ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityEndTimingReference, context) }),
             new Object [] { activityEndTimingReference }));
      }
      return false;
    }
    return true;
  }

} // ActivityEndTimingReferenceOperations