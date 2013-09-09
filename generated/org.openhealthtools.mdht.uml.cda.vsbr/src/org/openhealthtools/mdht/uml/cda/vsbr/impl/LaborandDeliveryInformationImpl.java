/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborandDeliveryInformationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Laborand Delivery Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LaborandDeliveryInformationImpl extends ActImpl implements LaborandDeliveryInformation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LaborandDeliveryInformationImpl()
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
    return VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationAttendantParticipation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationAttendantParticipation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationEntryRelationship(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationHomeBirthPlan(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationHomeBirthPlan(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationMaternalTransfer(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationMaternalTransfer(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationParticipatingLocation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationParticipatingLocation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationMaternalMorbidities(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationMaternalMorbidities(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationRiskFactors(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationRiskFactors(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationCertifierParticipation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationCertifierParticipation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CharacteristicofLaborandDelivery> getCharacteristicsofLaborandDeliveries()
  {
    return LaborandDeliveryInformationOperations.getCharacteristicsofLaborandDeliveries(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedHomeBirth getHomeBirthPlan()
  {
    return LaborandDeliveryInformationOperations.getHomeBirthPlan(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaternalTransfer getMaternalTransfer()
  {
    return LaborandDeliveryInformationOperations.getMaternalTransfer(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MaternalMorbidity> getMaternalMorbiditiess()
  {
    return LaborandDeliveryInformationOperations.getMaternalMorbiditiess(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PregnancyRiskFactor> getRiskFactorss()
  {
    return LaborandDeliveryInformationOperations.getRiskFactorss(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaborandDeliveryInformation init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LaborandDeliveryInformation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //LaborandDeliveryInformationImpl
