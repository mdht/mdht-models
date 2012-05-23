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

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Epoch</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudyEpochOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudyEpochOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyEpochTemplateId(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochTemplateId(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_EPOCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.71')";

  /**
   * The cached OCL invariant for the '{@link #validateStudyEpochTemplateId(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochTemplateId(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_EPOCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.71')
   * @param studyEpoch The receiving '<em><b>Study Epoch</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyEpochTemplateId(StudyEpoch studyEpoch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_STUDY_EPOCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_EPOCH);
      try
      {
        VALIDATE_STUDY_EPOCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_EPOCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_EPOCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyEpoch))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_EPOCH__STUDY_EPOCH_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyEpochTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyEpoch, context) }),
             new Object [] { studyEpoch }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyEpochClassCode(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochClassCode(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_EPOCH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.classCode.oclIsUndefined() and self.classCode.oclIsKindOf(vocab::x_ActClassDocumentEntryAct)";

  /**
   * The cached OCL invariant for the '{@link #validateStudyEpochClassCode(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochClassCode(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_EPOCH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.classCode.oclIsUndefined() and self.classCode.oclIsKindOf(vocab::x_ActClassDocumentEntryAct)
   * @param studyEpoch The receiving '<em><b>Study Epoch</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyEpochClassCode(StudyEpoch studyEpoch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_STUDY_EPOCH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_EPOCH);
      try
      {
        VALIDATE_STUDY_EPOCH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_EPOCH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_EPOCH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyEpoch))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_EPOCH__STUDY_EPOCH_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyEpochClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyEpoch, context) }),
             new Object [] { studyEpoch }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyEpochClassCodeP(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Class Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochClassCodeP(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_EPOCH_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

  /**
   * The cached OCL invariant for the '{@link #validateStudyEpochClassCodeP(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Class Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochClassCodeP(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_EPOCH_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
   * @param studyEpoch The receiving '<em><b>Study Epoch</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyEpochClassCodeP(StudyEpoch studyEpoch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_STUDY_EPOCH_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_EPOCH);
      try
      {
        VALIDATE_STUDY_EPOCH_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_EPOCH_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_EPOCH_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyEpoch))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_EPOCH__STUDY_EPOCH_CLASS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyEpochClassCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyEpoch, context) }),
             new Object [] { studyEpoch }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyEpochCodeP(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochCodeP(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_EPOCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStudyEpochCodeP(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochCodeP(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_EPOCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param studyEpoch The receiving '<em><b>Study Epoch</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyEpochCodeP(StudyEpoch studyEpoch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_STUDY_EPOCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_EPOCH);
      try
      {
        VALIDATE_STUDY_EPOCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_EPOCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_EPOCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyEpoch))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_EPOCH__STUDY_EPOCH_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyEpochCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyEpoch, context) }),
             new Object [] { studyEpoch }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyEpochCode(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochCode(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_EPOCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateStudyEpochCode(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochCode(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_EPOCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.3.26.1.1')
   * @param studyEpoch The receiving '<em><b>Study Epoch</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyEpochCode(StudyEpoch studyEpoch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_STUDY_EPOCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_EPOCH);
      try
      {
        VALIDATE_STUDY_EPOCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_EPOCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_EPOCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyEpoch))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_EPOCH__STUDY_EPOCH_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyEpochCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyEpoch, context) }),
             new Object [] { studyEpoch }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyEpochText(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochText(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_EPOCH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStudyEpochText(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochText(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_EPOCH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
   * @param studyEpoch The receiving '<em><b>Study Epoch</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyEpochText(StudyEpoch studyEpoch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_STUDY_EPOCH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_EPOCH);
      try
      {
        VALIDATE_STUDY_EPOCH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_EPOCH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_EPOCH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyEpoch))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_EPOCH__STUDY_EPOCH_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyEpochText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyEpoch, context) }),
             new Object [] { studyEpoch }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyEpochMoodCode(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochMoodCode(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_EPOCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
   * The cached OCL invariant for the '{@link #validateStudyEpochMoodCode(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyEpochMoodCode(StudyEpoch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_EPOCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('moodCode')
   * @param studyEpoch The receiving '<em><b>Study Epoch</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyEpochMoodCode(StudyEpoch studyEpoch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_STUDY_EPOCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_EPOCH);
      try
      {
        VALIDATE_STUDY_EPOCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_EPOCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_EPOCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyEpoch))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_EPOCH__STUDY_EPOCH_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyEpochMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyEpoch, context) }),
             new Object [] { studyEpoch }));
      }
      return false;
    }
    return true;
  }

} // StudyEpochOperations