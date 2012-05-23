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

import org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Questionnaire Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingQuestionnaireCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Questionnaire Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingQuestionnaireSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Questionnaire Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingBaselineIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Baseline Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingDerivedDataIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Derived Data Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getBaselineIndicator() <em>Get Baseline Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getDerivedDataIndicator() <em>Get Derived Data Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireFindingOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionnaireFindingOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingTemplateId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingTemplateId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.34')";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingTemplateId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingTemplateId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.34')
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingTemplateId(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingClassCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingClassCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingClassCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingClassCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingClassCode(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingCode(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingEffectiveTime(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingEffectiveTime(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingEffectiveTime(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingEffectiveTime(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingEffectiveTime(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingId(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingId(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingMoodCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingMoodCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingMoodCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingMoodCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingMoodCode(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingValue(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingValue(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingValue(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingValue(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingValue(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingStatusCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingStatusCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingStatusCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingStatusCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingStatusCode(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingGroupIdentifier(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingGroupIdentifier(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier))";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingGroupIdentifier(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingGroupIdentifier(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier))
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingGroupIdentifier(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingQuestionnaireCategoryAssociation(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Questionnaire Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingQuestionnaireCategoryAssociation(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingQuestionnaireCategoryAssociation(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Questionnaire Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingQuestionnaireCategoryAssociation(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingQuestionnaireCategoryAssociation(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_QUESTIONNAIRE_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingQuestionnaireCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingQuestionnaireSubCategoryAssociation(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Questionnaire Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingQuestionnaireSubCategoryAssociation(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingQuestionnaireSubCategoryAssociation(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Questionnaire Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingQuestionnaireSubCategoryAssociation(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingQuestionnaireSubCategoryAssociation(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_QUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingQuestionnaireSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingNonPerformanceReason(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingNonPerformanceReason(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingNonPerformanceReason(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingNonPerformanceReason(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingNonPerformanceReason(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingBaselineIndicator(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Baseline Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingBaselineIndicator(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Baseline Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingBaselineIndicator(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Baseline Indicator</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingBaselineIndicator(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Baseline Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingBaselineIndicator(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_BASELINE_INDICATOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingBaselineIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingDerivedDataIndicator(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Derived Data Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingDerivedDataIndicator(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Derived Data Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingDerivedDataIndicator(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Derived Data Indicator</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingDerivedDataIndicator(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Derived Data Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingDerivedDataIndicator(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_DERIVED_DATA_INDICATOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingDerivedDataIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingTimingReference(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingTimingReference(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingTimingReference(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingTimingReference(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingTimingReference(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingDataCollection(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingDataCollection(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingDataCollection(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingDataCollection(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingDataCollection(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDING_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCode(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingquestionnaireCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode(QuestionnaireFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode(QuestionnaireFinding questionnaireFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING);
      try
      {
        VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(questionnaireFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.QUESTIONNAIRE_FINDING__QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "QuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(questionnaireFinding, context) }),
             new Object [] { questionnaireFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(QuestionnaireFinding) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(QuestionnaireFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(QuestionnaireFinding) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(QuestionnaireFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(QuestionnaireFinding questionnaireFinding)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(67));
      try
      {
        GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
    return (GroupIdentifier) query.evaluate(questionnaireFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(QuestionnaireFinding) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(QuestionnaireFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(QuestionnaireFinding) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(QuestionnaireFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(QuestionnaireFinding questionnaireFinding)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(68));
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
    return (NonPerformanceReason) query.evaluate(questionnaireFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getBaselineIndicator(QuestionnaireFinding) <em>Get Baseline Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaselineIndicator(QuestionnaireFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_BASELINE_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Baseline Indicator))->asSequence()->first().oclAsType(sdtm::Baseline Indicator)";

  /**
   * The cached OCL query for the '{@link #getBaselineIndicator(QuestionnaireFinding) <em>Get Baseline Indicator</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaselineIndicator(QuestionnaireFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BASELINE_INDICATOR__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Baseline Indicator))->asSequence()->first().oclAsType(sdtm::Baseline Indicator)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  BaselineIndicator getBaselineIndicator(QuestionnaireFinding questionnaireFinding)
  {
    if (GET_BASELINE_INDICATOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(69));
      try
      {
        GET_BASELINE_INDICATOR__EOCL_QRY = helper.createQuery(GET_BASELINE_INDICATOR__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BASELINE_INDICATOR__EOCL_QRY);
    return (BaselineIndicator) query.evaluate(questionnaireFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getDerivedDataIndicator(QuestionnaireFinding) <em>Get Derived Data Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedDataIndicator(QuestionnaireFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_DERIVED_DATA_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Derived Data Indicator))->asSequence()->first().oclAsType(sdtm::Derived Data Indicator)";

  /**
   * The cached OCL query for the '{@link #getDerivedDataIndicator(QuestionnaireFinding) <em>Get Derived Data Indicator</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedDataIndicator(QuestionnaireFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DERIVED_DATA_INDICATOR__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Derived Data Indicator))->asSequence()->first().oclAsType(sdtm::Derived Data Indicator)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DerivedDataIndicator getDerivedDataIndicator(QuestionnaireFinding questionnaireFinding)
  {
    if (GET_DERIVED_DATA_INDICATOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(70));
      try
      {
        GET_DERIVED_DATA_INDICATOR__EOCL_QRY = helper.createQuery(GET_DERIVED_DATA_INDICATOR__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DERIVED_DATA_INDICATOR__EOCL_QRY);
    return (DerivedDataIndicator) query.evaluate(questionnaireFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(QuestionnaireFinding) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(QuestionnaireFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->first().oclAsType(sdtm::Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getTimingReference(QuestionnaireFinding) <em>Get Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(QuestionnaireFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->first().oclAsType(sdtm::Timing Reference)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(QuestionnaireFinding questionnaireFinding)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(71));
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
    return (TimingReference) query.evaluate(questionnaireFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(QuestionnaireFinding) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(QuestionnaireFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->first().oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(QuestionnaireFinding) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(QuestionnaireFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->first().oclAsType(sdtm::Data Collection)
   * @param questionnaireFinding The receiving '<em><b>Questionnaire Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(QuestionnaireFinding questionnaireFinding)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.QUESTIONNAIRE_FINDING, SdtmPackage.Literals.QUESTIONNAIRE_FINDING.getEAllOperations().get(72));
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
    return (DataCollection) query.evaluate(questionnaireFinding);
  }

} // QuestionnaireFindingOperations