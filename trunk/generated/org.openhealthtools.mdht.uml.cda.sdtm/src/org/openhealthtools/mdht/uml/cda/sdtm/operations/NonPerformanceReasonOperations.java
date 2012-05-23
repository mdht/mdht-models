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

import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Performance Reason</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason#validateNonPerformanceReasonTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason#validateNonPerformanceReasonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason#validateNonPerformanceReasonCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason#validateNonPerformanceReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason#validateNonPerformanceReasonMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason#validateNonPerformanceReasonValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonPerformanceReasonOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonPerformanceReasonOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonPerformanceReasonTemplateId(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonPerformanceReasonTemplateId(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_PERFORMANCE_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.64')";

  /**
   * The cached OCL invariant for the '{@link #validateNonPerformanceReasonTemplateId(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonPerformanceReasonTemplateId(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_PERFORMANCE_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.64')
   * @param nonPerformanceReason The receiving '<em><b>Non Performance Reason</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonPerformanceReasonTemplateId(NonPerformanceReason nonPerformanceReason, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_PERFORMANCE_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_PERFORMANCE_REASON);
      try
      {
        VALIDATE_NON_PERFORMANCE_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_PERFORMANCE_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_PERFORMANCE_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonPerformanceReason))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_PERFORMANCE_REASON__NON_PERFORMANCE_REASON_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonPerformanceReasonTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonPerformanceReason, context) }),
             new Object [] { nonPerformanceReason }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonPerformanceReasonClassCode(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonPerformanceReasonClassCode(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_PERFORMANCE_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateNonPerformanceReasonClassCode(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonPerformanceReasonClassCode(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_PERFORMANCE_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param nonPerformanceReason The receiving '<em><b>Non Performance Reason</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonPerformanceReasonClassCode(NonPerformanceReason nonPerformanceReason, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_PERFORMANCE_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_PERFORMANCE_REASON);
      try
      {
        VALIDATE_NON_PERFORMANCE_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_PERFORMANCE_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_PERFORMANCE_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonPerformanceReason))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_PERFORMANCE_REASON__NON_PERFORMANCE_REASON_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonPerformanceReasonClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonPerformanceReason, context) }),
             new Object [] { nonPerformanceReason }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonPerformanceReasonCodeP(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonPerformanceReasonCodeP(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_PERFORMANCE_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonPerformanceReasonCodeP(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonPerformanceReasonCodeP(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_PERFORMANCE_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param nonPerformanceReason The receiving '<em><b>Non Performance Reason</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonPerformanceReasonCodeP(NonPerformanceReason nonPerformanceReason, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_PERFORMANCE_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_PERFORMANCE_REASON);
      try
      {
        VALIDATE_NON_PERFORMANCE_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_PERFORMANCE_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_PERFORMANCE_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonPerformanceReason))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_PERFORMANCE_REASON__NON_PERFORMANCE_REASON_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonPerformanceReasonCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonPerformanceReason, context) }),
             new Object [] { nonPerformanceReason }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonPerformanceReasonCode(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonPerformanceReasonCode(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_PERFORMANCE_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateNonPerformanceReasonCode(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonPerformanceReasonCode(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_PERFORMANCE_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')
   * @param nonPerformanceReason The receiving '<em><b>Non Performance Reason</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonPerformanceReasonCode(NonPerformanceReason nonPerformanceReason, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_PERFORMANCE_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_PERFORMANCE_REASON);
      try
      {
        VALIDATE_NON_PERFORMANCE_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_PERFORMANCE_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_PERFORMANCE_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonPerformanceReason))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_PERFORMANCE_REASON__NON_PERFORMANCE_REASON_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonPerformanceReasonCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonPerformanceReason, context) }),
             new Object [] { nonPerformanceReason }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonPerformanceReasonMoodCode(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonPerformanceReasonMoodCode(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_PERFORMANCE_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateNonPerformanceReasonMoodCode(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonPerformanceReasonMoodCode(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_PERFORMANCE_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param nonPerformanceReason The receiving '<em><b>Non Performance Reason</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonPerformanceReasonMoodCode(NonPerformanceReason nonPerformanceReason, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_PERFORMANCE_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_PERFORMANCE_REASON);
      try
      {
        VALIDATE_NON_PERFORMANCE_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_PERFORMANCE_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_PERFORMANCE_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonPerformanceReason))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_PERFORMANCE_REASON__NON_PERFORMANCE_REASON_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonPerformanceReasonMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonPerformanceReason, context) }),
             new Object [] { nonPerformanceReason }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonPerformanceReasonValue(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonPerformanceReasonValue(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_PERFORMANCE_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))";

  /**
   * The cached OCL invariant for the '{@link #validateNonPerformanceReasonValue(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonPerformanceReasonValue(NonPerformanceReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_PERFORMANCE_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))
   * @param nonPerformanceReason The receiving '<em><b>Non Performance Reason</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonPerformanceReasonValue(NonPerformanceReason nonPerformanceReason, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_PERFORMANCE_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_PERFORMANCE_REASON);
      try
      {
        VALIDATE_NON_PERFORMANCE_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_PERFORMANCE_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_PERFORMANCE_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonPerformanceReason))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_PERFORMANCE_REASON__NON_PERFORMANCE_REASON_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonPerformanceReasonValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonPerformanceReason, context) }),
             new Object [] { nonPerformanceReason }));
      }
      return false;
    }
    return true;
  }

} // NonPerformanceReasonOperations