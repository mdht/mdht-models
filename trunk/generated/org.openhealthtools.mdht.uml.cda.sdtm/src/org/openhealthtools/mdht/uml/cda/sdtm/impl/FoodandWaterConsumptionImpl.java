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

import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.FoodandWaterConsumptionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foodand Water Consumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FoodandWaterConsumptionImpl extends ObservationImpl implements FoodandWaterConsumption
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FoodandWaterConsumptionImpl()
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
    return SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionExclusionReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionExclusionReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFoodandWaterConsumptionGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return FoodandWaterConsumptionOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return FoodandWaterConsumptionOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExclusionReason getExclusionReason()
  {
    return FoodandWaterConsumptionOperations.getExclusionReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return FoodandWaterConsumptionOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FoodandWaterConsumption init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FoodandWaterConsumption init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //FoodandWaterConsumptionImpl
