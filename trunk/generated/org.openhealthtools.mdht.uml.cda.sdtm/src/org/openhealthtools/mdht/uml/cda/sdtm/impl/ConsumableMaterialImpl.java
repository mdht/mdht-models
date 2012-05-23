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

import org.openhealthtools.mdht.uml.cda.impl.ConsumableImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.ConsumableMaterialOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumable Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConsumableMaterialImpl extends ConsumableImpl implements ConsumableMaterial
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConsumableMaterialImpl()
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
    return SdtmPackage.Literals.CONSUMABLE_MATERIAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConsumableMaterialTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConsumableMaterialOperations.validateConsumableMaterialTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConsumableMaterialTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConsumableMaterialOperations.validateConsumableMaterialTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConsumableMaterialMedication(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConsumableMaterialOperations.validateConsumableMaterialMedication(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConsumableMaterialMedicationMedicationMaterialClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConsumableMaterialMedicationMedicationMaterialCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConsumableMaterialMedicationMedicationMaterialLotNumberText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialLotNumberText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConsumableMaterialMedicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConsumableMaterialOperations.validateConsumableMaterialMedicationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConsumableMaterialMedicationMedicationMaterialClassCodeConsumableMaterialMedicationMedicationMaterialClassCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialClassCodeConsumableMaterialMedicationMedicationMaterialClassCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConsumableMaterialMedicationMedicationMaterialCodeConsumableMaterialMedicationMedicationMaterialCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialCodeConsumableMaterialMedicationMedicationMaterialCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConsumableMaterialMedicationMedicationMaterialLotNumberTextConsumableMaterialMedicationMedicationMaterialLotNumberText1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialLotNumberTextConsumableMaterialMedicationMedicationMaterialLotNumberText1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsumableMaterial init() {
    	CDAUtil.init(this);
    	return this;
  }
} //ConsumableMaterialImpl
