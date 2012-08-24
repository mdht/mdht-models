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

import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Subject Data Human Clinical Trials</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Confidentiality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Human Clinical Subject Data Document Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsStudyRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Study Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsSubjectParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Subject Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#getHumanClinicalSubjectDataDocumentBody() <em>Get Human Clinical Subject Data Document Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectDataHumanClinicalTrialsOperations extends ClinicalDocumentOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubjectDataHumanClinicalTrialsOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsTemplateId(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsTemplateId(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.11')";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsTemplateId(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsTemplateId(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsTemplateId(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsClassCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsClassCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClinicalDocument::DOCCLIN";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsClassCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsClassCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsClassCode(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsCodeP(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsCodeP(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsCodeP(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsCodeP(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsCodeP(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsCode(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsConfidentialityCodeP(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Confidentiality Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsConfidentialityCodeP(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsConfidentialityCodeP(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Confidentiality Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsConfidentialityCodeP(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsConfidentialityCodeP(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsConfidentialityCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsConfidentialityCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Confidentiality Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsConfidentialityCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.5.25')";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsConfidentialityCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Confidentiality Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsConfidentialityCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsConfidentialityCode(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsConfidentialityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsEffectiveTime(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsEffectiveTime(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsEffectiveTime(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsEffectiveTime(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsEffectiveTime(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsId(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsId(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsId(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsId(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsId(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsLanguageCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Language Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsLanguageCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsLanguageCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Language Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsLanguageCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsLanguageCode(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_LANGUAGE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsLanguageCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsMoodCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsMoodCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsMoodCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsMoodCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsMoodCode(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsRealmCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Realm Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsRealmCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (not self.realmCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsRealmCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Realm Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsRealmCode(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsRealmCode(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_REALM_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsRealmCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsSetId(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Set Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsSetId(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsSetId(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Set Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsSetId(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsSetId(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SET_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsSetId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsVersionNumber(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Version Number</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsVersionNumber(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsVersionNumber(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Version Number</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsVersionNumber(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsVersionNumber(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_VERSION_NUMBER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsVersionNumber", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBody(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Human Clinical Subject Data Document Body</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBody(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(sdtm::Human Clinical Subject Data Document Body))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBody(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Human Clinical Subject Data Document Body</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBody(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBody(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBody", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsAuthorParticipation(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Author Participation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsAuthorParticipation(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsAuthorParticipation(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Author Participation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsAuthorParticipation(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsAuthorParticipation(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_AUTHOR_PARTICIPATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsAuthorParticipation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsStudyRelationship(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Study Relationship</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsStudyRelationship(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_STUDY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsStudyRelationship(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Study Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsStudyRelationship(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_STUDY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsStudyRelationship(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_STUDY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_STUDY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_STUDY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_STUDY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_STUDY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsStudyRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectDataHumanClinicalTrialsSubjectParticipation(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Subject Participation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsSubjectParticipation(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SUBJECT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectDataHumanClinicalTrialsSubjectParticipation(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Subject Participation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectDataHumanClinicalTrialsSubjectParticipation(SubjectDataHumanClinicalTrials, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SUBJECT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectDataHumanClinicalTrials The receiving '<em><b>Subject Data Human Clinical Trials</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectDataHumanClinicalTrialsSubjectParticipation(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SUBJECT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS);
      try
      {
        VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SUBJECT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SUBJECT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SUBJECT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectDataHumanClinicalTrials))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS__SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SUBJECT_PARTICIPATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectDataHumanClinicalTrialsSubjectParticipation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectDataHumanClinicalTrials, context) }),
             new Object [] { subjectDataHumanClinicalTrials }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getHumanClinicalSubjectDataDocumentBody(SubjectDataHumanClinicalTrials) <em>Get Human Clinical Subject Data Document Body</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumanClinicalSubjectDataDocumentBody(SubjectDataHumanClinicalTrials)
   * @generated
   * @ordered
   */
  protected static final String GET_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(sdtm::Human Clinical Subject Data Document Body))->asSequence()->any(true).oclAsType(sdtm::Human Clinical Subject Data Document Body)";

  /**
   * The cached OCL query for the '{@link #getHumanClinicalSubjectDataDocumentBody(SubjectDataHumanClinicalTrials) <em>Get Human Clinical Subject Data Document Body</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumanClinicalSubjectDataDocumentBody(SubjectDataHumanClinicalTrials)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  HumanClinicalSubjectDataDocumentBody getHumanClinicalSubjectDataDocumentBody(SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials)
  {
    if (GET_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS, SdtmPackage.Literals.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS.getEAllOperations().get(46));
      try
      {
        GET_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__EOCL_QRY = helper.createQuery(GET_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__EOCL_QRY);
    return (HumanClinicalSubjectDataDocumentBody) query.evaluate(subjectDataHumanClinicalTrials);
  }

} // SubjectDataHumanClinicalTrialsOperations