/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.QuestionnaireFindingOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class QuestionnaireFindingImpl extends ObservationImpl implements QuestionnaireFinding
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionnaireFindingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SdtmPackage.Literals.QUESTIONNAIRE_FINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingQuestionnaireCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingQuestionnaireCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingQuestionnaireSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingQuestionnaireSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingquestionnaireCategoryAssociationQuestionnaireCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireCategoryAssociationQuestionnaireCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateQuestionnaireFindingquestionnaireSubCategoryAssociationQuestionnaireSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireSubCategoryAssociationQuestionnaireSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return QuestionnaireFindingOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return QuestionnaireFindingOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return QuestionnaireFindingOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return QuestionnaireFindingOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionnaireFinding init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuestionnaireFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //QuestionnaireFindingImpl
