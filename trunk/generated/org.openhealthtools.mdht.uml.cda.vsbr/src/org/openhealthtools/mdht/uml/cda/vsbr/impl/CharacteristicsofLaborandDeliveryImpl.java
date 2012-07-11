/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicsofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.CharacteristicsofLaborandDeliveryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristicsof Laborand Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CharacteristicsofLaborandDeliveryImpl extends ObservationImpl implements CharacteristicsofLaborandDelivery
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharacteristicsofLaborandDeliveryImpl()
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
    return VsbrPackage.Literals.CHARACTERISTICSOF_LABORAND_DELIVERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCharacteristicsofLaborandDeliveryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CharacteristicsofLaborandDeliveryOperations.validateCharacteristicsofLaborandDeliveryTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCharacteristicsofLaborandDeliveryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CharacteristicsofLaborandDeliveryOperations.validateCharacteristicsofLaborandDeliveryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCharacteristicsofLaborandDeliveryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CharacteristicsofLaborandDeliveryOperations.validateCharacteristicsofLaborandDeliveryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCharacteristicsofLaborandDeliveryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CharacteristicsofLaborandDeliveryOperations.validateCharacteristicsofLaborandDeliveryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCharacteristicsofLaborandDeliveryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CharacteristicsofLaborandDeliveryOperations.validateCharacteristicsofLaborandDeliveryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharacteristicsofLaborandDelivery init() {
    	CDAUtil.init(this);
    	return this;
  }
} //CharacteristicsofLaborandDeliveryImpl
