/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubstanceUseOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubstanceUseImpl extends SubstanceAdministrationImpl implements SubstanceUse
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubstanceUseImpl()
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
    return SdtmPackage.Literals.SUBSTANCE_USE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseDoseQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseMaxDoseQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseRouteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseConsumableMaterial(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseConsumableMaterial(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseSubstanceUseCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseSubstanceUseCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseSubstanceUseSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseSubstanceUseSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUsePreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUsePreSpecifiedEvent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseActivityStartTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseActivityStartTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseActivityEndTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseActivityEndTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUseStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUseStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUsesubstanceUseCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUsesubstanceUseCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubstanceUseOperations.validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreSpecifiedEvent getPreSpecifiedEvent()
  {
    return SubstanceUseOperations.getPreSpecifiedEvent(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return SubstanceUseOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityStartTimingReference getActivityStartTimingReference()
  {
    return SubstanceUseOperations.getActivityStartTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityEndTimingReference getActivityEndTimingReference()
  {
    return SubstanceUseOperations.getActivityEndTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return SubstanceUseOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return SubstanceUseOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstanceUse init() {
    	CDAUtil.init(this);
    	return this;
  }
} //SubstanceUseImpl
