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

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.NonHumanSubjectDataDocumentBody;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Human Subject Data Document Body</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanSubjectDataDocumentBody#validateNonHumanSubjectDataDocumentBodyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanSubjectDataDocumentBody#validateNonHumanSubjectDataDocumentBodyClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanSubjectDataDocumentBody#validateNonHumanSubjectDataDocumentBodyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanSubjectDataDocumentBody#validateNonHumanSubjectDataDocumentBodyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonHumanSubjectDataDocumentBody#validateNonHumanSubjectDataDocumentBodyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonHumanSubjectDataDocumentBodyOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonHumanSubjectDataDocumentBodyOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanSubjectDataDocumentBodyTemplateId(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanSubjectDataDocumentBodyTemplateId(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.15')";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanSubjectDataDocumentBodyTemplateId(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanSubjectDataDocumentBodyTemplateId(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.15')
   * @param nonHumanSubjectDataDocumentBody The receiving '<em><b>Non Human Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanSubjectDataDocumentBodyTemplateId(NonHumanSubjectDataDocumentBody nonHumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanSubjectDataDocumentBodyTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanSubjectDataDocumentBody, context) }),
             new Object [] { nonHumanSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanSubjectDataDocumentBodyClassCode(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanSubjectDataDocumentBodyClassCode(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanSubjectDataDocumentBodyClassCode(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanSubjectDataDocumentBodyClassCode(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT
   * @param nonHumanSubjectDataDocumentBody The receiving '<em><b>Non Human Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanSubjectDataDocumentBodyClassCode(NonHumanSubjectDataDocumentBody nonHumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanSubjectDataDocumentBodyClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanSubjectDataDocumentBody, context) }),
             new Object [] { nonHumanSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanSubjectDataDocumentBodyCode(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanSubjectDataDocumentBodyCode(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanSubjectDataDocumentBodyCode(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanSubjectDataDocumentBodyCode(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param nonHumanSubjectDataDocumentBody The receiving '<em><b>Non Human Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanSubjectDataDocumentBodyCode(NonHumanSubjectDataDocumentBody nonHumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanSubjectDataDocumentBodyCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanSubjectDataDocumentBody, context) }),
             new Object [] { nonHumanSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanSubjectDataDocumentBodyCodeP(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanSubjectDataDocumentBodyCodeP(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanSubjectDataDocumentBodyCodeP(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanSubjectDataDocumentBodyCodeP(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param nonHumanSubjectDataDocumentBody The receiving '<em><b>Non Human Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanSubjectDataDocumentBodyCodeP(NonHumanSubjectDataDocumentBody nonHumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanSubjectDataDocumentBodyCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanSubjectDataDocumentBody, context) }),
             new Object [] { nonHumanSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonHumanSubjectDataDocumentBodyMoodCode(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanSubjectDataDocumentBodyMoodCode(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateNonHumanSubjectDataDocumentBodyMoodCode(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Human Subject Data Document Body Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonHumanSubjectDataDocumentBodyMoodCode(NonHumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::ActMood::EVN
   * @param nonHumanSubjectDataDocumentBody The receiving '<em><b>Non Human Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonHumanSubjectDataDocumentBodyMoodCode(NonHumanSubjectDataDocumentBody nonHumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonHumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY__NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonHumanSubjectDataDocumentBodyMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonHumanSubjectDataDocumentBody, context) }),
             new Object [] { nonHumanSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

} // NonHumanSubjectDataDocumentBodyOperations