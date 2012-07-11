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

import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborandDeliverySectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Laborand Delivery Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LaborandDeliverySectionImpl extends SectionImpl implements LaborandDeliverySection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LaborandDeliverySectionImpl()
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
    return VsbrPackage.Literals.LABORAND_DELIVERY_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliverySectionOperations.validateLaborandDeliverySectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliverySectionOperations.validateLaborandDeliverySectionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliverySectionOperations.validateLaborandDeliverySectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliverySectionOperations.validateLaborandDeliverySectionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliverySectionOperations.validateLaborandDeliverySectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySectionLaborandDeliveryInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliverySectionOperations.validateLaborandDeliverySectionLaborandDeliveryInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliverySectionBodyWeightatDelivery(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliverySectionOperations.validateLaborandDeliverySectionBodyWeightatDelivery(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaborandDeliveryInformation getLaborandDeliveryInformation()
  {
    return LaborandDeliverySectionOperations.getLaborandDeliveryInformation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyWeightatDelivery getBodyWeightatDelivery()
  {
    return LaborandDeliverySectionOperations.getBodyWeightatDelivery(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaborandDeliverySection init() {
    	CDAUtil.init(this);
    	return this;
  }
} //LaborandDeliverySectionImpl
