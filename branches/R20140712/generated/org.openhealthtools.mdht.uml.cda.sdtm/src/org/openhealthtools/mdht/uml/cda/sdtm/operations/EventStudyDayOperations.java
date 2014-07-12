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

import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Event Study Day</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay#validateEventStudyDayTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay#validateEventStudyDayClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay#validateEventStudyDayCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay#validateEventStudyDayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay#validateEventStudyDayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay#validateEventStudyDayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventStudyDayOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventStudyDayOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEventStudyDayTemplateId(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventStudyDayTemplateId(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EVENT_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.62')";

  /**
   * The cached OCL invariant for the '{@link #validateEventStudyDayTemplateId(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventStudyDayTemplateId(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EVENT_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param eventStudyDay The receiving '<em><b>Event Study Day</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEventStudyDayTemplateId(EventStudyDay eventStudyDay, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EVENT_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.EVENT_STUDY_DAY);
      try
      {
        VALIDATE_EVENT_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EVENT_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventStudyDay))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.EVENT_STUDY_DAY__EVENT_STUDY_DAY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventStudyDayTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventStudyDay, context) }),
             new Object [] { eventStudyDay }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEventStudyDayClassCode(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventStudyDayClassCode(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EVENT_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateEventStudyDayClassCode(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventStudyDayClassCode(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EVENT_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param eventStudyDay The receiving '<em><b>Event Study Day</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEventStudyDayClassCode(EventStudyDay eventStudyDay, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EVENT_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.EVENT_STUDY_DAY);
      try
      {
        VALIDATE_EVENT_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EVENT_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventStudyDay))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.EVENT_STUDY_DAY__EVENT_STUDY_DAY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventStudyDayClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventStudyDay, context) }),
             new Object [] { eventStudyDay }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEventStudyDayCodeP(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventStudyDayCodeP(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EVENT_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateEventStudyDayCodeP(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventStudyDayCodeP(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EVENT_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param eventStudyDay The receiving '<em><b>Event Study Day</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEventStudyDayCodeP(EventStudyDay eventStudyDay, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EVENT_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.EVENT_STUDY_DAY);
      try
      {
        VALIDATE_EVENT_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EVENT_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventStudyDay))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.EVENT_STUDY_DAY__EVENT_STUDY_DAY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventStudyDayCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventStudyDay, context) }),
             new Object [] { eventStudyDay }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEventStudyDayCode(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventStudyDayCode(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EVENT_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateEventStudyDayCode(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventStudyDayCode(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EVENT_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param eventStudyDay The receiving '<em><b>Event Study Day</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEventStudyDayCode(EventStudyDay eventStudyDay, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EVENT_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.EVENT_STUDY_DAY);
      try
      {
        VALIDATE_EVENT_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EVENT_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventStudyDay))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.EVENT_STUDY_DAY__EVENT_STUDY_DAY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventStudyDayCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventStudyDay, context) }),
             new Object [] { eventStudyDay }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEventStudyDayMoodCode(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventStudyDayMoodCode(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EVENT_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateEventStudyDayMoodCode(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventStudyDayMoodCode(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EVENT_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param eventStudyDay The receiving '<em><b>Event Study Day</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEventStudyDayMoodCode(EventStudyDay eventStudyDay, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EVENT_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.EVENT_STUDY_DAY);
      try
      {
        VALIDATE_EVENT_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EVENT_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventStudyDay))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.EVENT_STUDY_DAY__EVENT_STUDY_DAY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventStudyDayMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventStudyDay, context) }),
             new Object [] { eventStudyDay }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEventStudyDayValue(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventStudyDayValue(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EVENT_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

  /**
   * The cached OCL invariant for the '{@link #validateEventStudyDayValue(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventStudyDayValue(EventStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EVENT_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param eventStudyDay The receiving '<em><b>Event Study Day</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEventStudyDayValue(EventStudyDay eventStudyDay, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EVENT_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.EVENT_STUDY_DAY);
      try
      {
        VALIDATE_EVENT_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EVENT_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventStudyDay))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.EVENT_STUDY_DAY__EVENT_STUDY_DAY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EventStudyDayValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(eventStudyDay, context) }),
             new Object [] { eventStudyDay }));
      }
       
      return false;
    }
    return true;
  }

} // EventStudyDayOperations