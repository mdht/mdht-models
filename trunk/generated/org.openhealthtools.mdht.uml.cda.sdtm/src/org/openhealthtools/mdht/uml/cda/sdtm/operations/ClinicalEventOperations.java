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

import org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventClinicalEventCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Clinical Event Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventClinicalEventSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Clinical Event Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventActivityStartTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Activity Start Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventActivityEndTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Activity End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getActivityStartTimingReference() <em>Get Activity Start Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getActivityEndTimingReference() <em>Get Activity End Timing Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalEventOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClinicalEventOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventTemplateId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventTemplateId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.28')";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventTemplateId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventTemplateId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.28')
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventTemplateId(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventClassCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventClassCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventClassCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventClassCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventClassCode(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventCode(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventEffectiveTime(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventEffectiveTime(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventEffectiveTime(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventEffectiveTime(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventEffectiveTime(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventId(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventMoodCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventMoodCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventMoodCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventMoodCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventMoodCode(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventStatusCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventStatusCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventStatusCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventStatusCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventStatusCode(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventValue(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventValue(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventValue(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventValue(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventValue(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventClinicalEventCategoryAssociation(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Clinical Event Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventClinicalEventCategoryAssociation(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventClinicalEventCategoryAssociation(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Clinical Event Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventClinicalEventCategoryAssociation(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventClinicalEventCategoryAssociation(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_CLINICAL_EVENT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventClinicalEventSubCategoryAssociation(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Clinical Event Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventClinicalEventSubCategoryAssociation(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventClinicalEventSubCategoryAssociation(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Clinical Event Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventClinicalEventSubCategoryAssociation(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventClinicalEventSubCategoryAssociation(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_CLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventPreSpecifiedEvent(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventPreSpecifiedEvent(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Pre-Specified Event) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventPreSpecifiedEvent(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Pre Specified Event</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventPreSpecifiedEvent(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Pre-Specified Event) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventPreSpecifiedEvent(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_PRE_SPECIFIED_EVENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventPreSpecifiedEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventNonPerformanceReason(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventNonPerformanceReason(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventNonPerformanceReason(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventNonPerformanceReason(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventNonPerformanceReason(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventBodySystemorOrganClass(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventBodySystemorOrganClass(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Body System or Organ Class) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventBodySystemorOrganClass(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Body Systemor Organ Class</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventBodySystemorOrganClass(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Body System or Organ Class) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventBodySystemorOrganClass(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventDataCollection(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventDataCollection(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventDataCollection(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventDataCollection(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventDataCollection(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventEventSeverity(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Event Severity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventEventSeverity(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Severity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventEventSeverity(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Event Severity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventEventSeverity(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Severity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventEventSeverity(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_EVENT_SEVERITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventEventSeverity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventActivityStartTimingReference(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Activity Start Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventActivityStartTimingReference(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Activity Start Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventActivityStartTimingReference(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Activity Start Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventActivityStartTimingReference(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Activity Start Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventActivityStartTimingReference(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_ACTIVITY_START_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventActivityStartTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventActivityEndTimingReference(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Activity End Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventActivityEndTimingReference(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENT_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Activity End Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventActivityEndTimingReference(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Activity End Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventActivityEndTimingReference(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENT_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Activity End Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventActivityEndTimingReference(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENT_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENT_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENT_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENT_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_ACTIVITY_END_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventActivityEndTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventclinicalEventCategoryAssociationTypeCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventclinicalEventCategoryAssociationTypeCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventclinicalEventCategoryAssociationTypeCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventclinicalEventCategoryAssociationTypeCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventclinicalEventCategoryAssociationTypeCode(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventclinicalEventCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalEventclinicalEventSubCategoryAssociationTypeCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventclinicalEventSubCategoryAssociationTypeCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalEventclinicalEventSubCategoryAssociationTypeCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalEventclinicalEventSubCategoryAssociationTypeCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalEventclinicalEventSubCategoryAssociationTypeCode(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
      try
      {
        VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventclinicalEventSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
             new Object [] { clinicalEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getPreSpecifiedEvent(ClinicalEvent) <em>Get Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_PRE_SPECIFIED_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pre-Specified Event))->asSequence()->first().oclAsType(sdtm::Pre-Specified Event)";

  /**
   * The cached OCL query for the '{@link #getPreSpecifiedEvent(ClinicalEvent) <em>Get Pre Specified Event</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PRE_SPECIFIED_EVENT__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pre-Specified Event))->asSequence()->first().oclAsType(sdtm::Pre-Specified Event)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  PreSpecifiedEvent getPreSpecifiedEvent(ClinicalEvent clinicalEvent)
  {
    if (GET_PRE_SPECIFIED_EVENT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(68));
      try
      {
        GET_PRE_SPECIFIED_EVENT__EOCL_QRY = helper.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_QRY);
    return (PreSpecifiedEvent) query.evaluate(clinicalEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(ClinicalEvent) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(ClinicalEvent) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(ClinicalEvent clinicalEvent)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(69));
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
    return (NonPerformanceReason) query.evaluate(clinicalEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(ClinicalEvent) <em>Get Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body System or Organ Class))->asSequence()->first().oclAsType(sdtm::Body System or Organ Class)";

  /**
   * The cached OCL query for the '{@link #getBodySystemorOrganClass(ClinicalEvent) <em>Get Body Systemor Organ Class</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body System or Organ Class))->asSequence()->first().oclAsType(sdtm::Body System or Organ Class)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  BodySystemorOrganClass getBodySystemorOrganClass(ClinicalEvent clinicalEvent)
  {
    if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(70));
      try
      {
        GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
    return (BodySystemorOrganClass) query.evaluate(clinicalEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(ClinicalEvent) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->first().oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(ClinicalEvent) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->first().oclAsType(sdtm::Data Collection)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(ClinicalEvent clinicalEvent)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(71));
      try
      {
        GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
    return (DataCollection) query.evaluate(clinicalEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getEventSeverity(ClinicalEvent) <em>Get Event Severity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSeverity(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_EVENT_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Severity))->asSequence()->first().oclAsType(sdtm::Event Severity)";

  /**
   * The cached OCL query for the '{@link #getEventSeverity(ClinicalEvent) <em>Get Event Severity</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSeverity(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EVENT_SEVERITY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Severity))->asSequence()->first().oclAsType(sdtm::Event Severity)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EventSeverity getEventSeverity(ClinicalEvent clinicalEvent)
  {
    if (GET_EVENT_SEVERITY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(72));
      try
      {
        GET_EVENT_SEVERITY__EOCL_QRY = helper.createQuery(GET_EVENT_SEVERITY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_SEVERITY__EOCL_QRY);
    return (EventSeverity) query.evaluate(clinicalEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getActivityStartTimingReference(ClinicalEvent) <em>Get Activity Start Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityStartTimingReference(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Activity Start Timing Reference))->asSequence()->first().oclAsType(sdtm::Activity Start Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getActivityStartTimingReference(ClinicalEvent) <em>Get Activity Start Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityStartTimingReference(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Activity Start Timing Reference))->asSequence()->first().oclAsType(sdtm::Activity Start Timing Reference)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  ActivityStartTimingReference getActivityStartTimingReference(ClinicalEvent clinicalEvent)
  {
    if (GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(73));
      try
      {
        GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_QRY);
    return (ActivityStartTimingReference) query.evaluate(clinicalEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getActivityEndTimingReference(ClinicalEvent) <em>Get Activity End Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityEndTimingReference(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Activity End Timing Reference))->asSequence()->first().oclAsType(sdtm::Activity End Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getActivityEndTimingReference(ClinicalEvent) <em>Get Activity End Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityEndTimingReference(ClinicalEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Activity End Timing Reference))->asSequence()->first().oclAsType(sdtm::Activity End Timing Reference)
   * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  ActivityEndTimingReference getActivityEndTimingReference(ClinicalEvent clinicalEvent)
  {
    if (GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(74));
      try
      {
        GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_QRY);
    return (ActivityEndTimingReference) query.evaluate(clinicalEvent);
  }

} // ClinicalEventOperations