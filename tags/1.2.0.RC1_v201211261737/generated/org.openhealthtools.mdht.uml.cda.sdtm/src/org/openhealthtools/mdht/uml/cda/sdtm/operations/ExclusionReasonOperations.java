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

import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Exclusion Reason</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason#validateExclusionReasonTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason#validateExclusionReasonCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason#validateExclusionReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason#validateExclusionReasonMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason#validateExclusionReasonValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExclusionReasonOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExclusionReasonOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateExclusionReasonTemplateId(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateExclusionReasonTemplateId(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EXCLUSION_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.76')";

  /**
   * The cached OCL invariant for the '{@link #validateExclusionReasonTemplateId(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateExclusionReasonTemplateId(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EXCLUSION_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param exclusionReason The receiving '<em><b>Exclusion Reason</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateExclusionReasonTemplateId(ExclusionReason exclusionReason, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EXCLUSION_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.EXCLUSION_REASON);
      try
      {
        VALIDATE_EXCLUSION_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXCLUSION_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EXCLUSION_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(exclusionReason))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.EXCLUSION_REASON__EXCLUSION_REASON_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ExclusionReasonTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(exclusionReason, context) }),
             new Object [] { exclusionReason }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateExclusionReasonCodeP(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateExclusionReasonCodeP(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EXCLUSION_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateExclusionReasonCodeP(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateExclusionReasonCodeP(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EXCLUSION_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param exclusionReason The receiving '<em><b>Exclusion Reason</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateExclusionReasonCodeP(ExclusionReason exclusionReason, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EXCLUSION_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.EXCLUSION_REASON);
      try
      {
        VALIDATE_EXCLUSION_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXCLUSION_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EXCLUSION_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(exclusionReason))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.EXCLUSION_REASON__EXCLUSION_REASON_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ExclusionReasonCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(exclusionReason, context) }),
             new Object [] { exclusionReason }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateExclusionReasonCode(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateExclusionReasonCode(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EXCLUSION_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateExclusionReasonCode(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateExclusionReasonCode(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EXCLUSION_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param exclusionReason The receiving '<em><b>Exclusion Reason</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateExclusionReasonCode(ExclusionReason exclusionReason, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EXCLUSION_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.EXCLUSION_REASON);
      try
      {
        VALIDATE_EXCLUSION_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXCLUSION_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EXCLUSION_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(exclusionReason))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.EXCLUSION_REASON__EXCLUSION_REASON_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ExclusionReasonCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(exclusionReason, context) }),
             new Object [] { exclusionReason }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateExclusionReasonMoodCode(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateExclusionReasonMoodCode(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EXCLUSION_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateExclusionReasonMoodCode(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateExclusionReasonMoodCode(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EXCLUSION_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param exclusionReason The receiving '<em><b>Exclusion Reason</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateExclusionReasonMoodCode(ExclusionReason exclusionReason, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EXCLUSION_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.EXCLUSION_REASON);
      try
      {
        VALIDATE_EXCLUSION_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXCLUSION_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EXCLUSION_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(exclusionReason))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.EXCLUSION_REASON__EXCLUSION_REASON_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ExclusionReasonMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(exclusionReason, context) }),
             new Object [] { exclusionReason }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateExclusionReasonValue(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateExclusionReasonValue(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EXCLUSION_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateExclusionReasonValue(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateExclusionReasonValue(ExclusionReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EXCLUSION_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param exclusionReason The receiving '<em><b>Exclusion Reason</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateExclusionReasonValue(ExclusionReason exclusionReason, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EXCLUSION_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.EXCLUSION_REASON);
      try
      {
        VALIDATE_EXCLUSION_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXCLUSION_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EXCLUSION_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(exclusionReason))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.EXCLUSION_REASON__EXCLUSION_REASON_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ExclusionReasonValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(exclusionReason, context) }),
             new Object [] { exclusionReason }));
      }
       
      return false;
    }
    return true;
  }

} // ExclusionReasonOperations