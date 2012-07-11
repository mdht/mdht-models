/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsbr.AttemptedForcepsDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.AttemptedVacuumExtraction;
import org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicsofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities;
import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures;
import org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery;
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
  public boolean validateLaborandDeliveryInformationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationCode(this, diagnostics, context);
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
  public boolean validateLaborandDeliveryInformationParticipant(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationParticipant(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationPerformer(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationPerformer(this, diagnostics, context);
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
  public boolean validateLaborandDeliveryInformationHomeBirthPlanAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationHomeBirthPlanAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationTransferAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationTransferAssociation(this, diagnostics, context);
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
  public boolean validateLaborandDeliveryInformationMaternalMorbidities(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationMaternalMorbidities(this, diagnostics, context);
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
  public boolean validateLaborandDeliveryInformationLaborOnsets(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationLaborOnsets(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationObstetricProcedures(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationObstetricProcedures(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationAttemptedForcepsDelivery(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationAttemptedForcepsDelivery(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationAttemptedVacuumExtraction(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationAttemptedVacuumExtraction(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationFetalPresentation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationFetalPresentation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationRouteandMethodofDelivery(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationRouteandMethodofDelivery(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationBodyWeightatDelivery(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationBodyWeightatDelivery(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MaternalMorbidities> getMaternalMorbiditiess()
  {
    return LaborandDeliveryInformationOperations.getMaternalMorbiditiess(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CharacteristicsofLaborandDelivery> getCharacteristicsofLaborandDeliveries()
  {
    return LaborandDeliveryInformationOperations.getCharacteristicsofLaborandDeliveries(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LaborOnsets> getLaborOnsetss()
  {
    return LaborandDeliveryInformationOperations.getLaborOnsetss(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ObstetricProcedures> getObstetricProceduress()
  {
    return LaborandDeliveryInformationOperations.getObstetricProceduress(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttemptedForcepsDelivery getAttemptedForcepsDelivery()
  {
    return LaborandDeliveryInformationOperations.getAttemptedForcepsDelivery(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttemptedVacuumExtraction getAttemptedVacuumExtraction()
  {
    return LaborandDeliveryInformationOperations.getAttemptedVacuumExtraction(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetalPresentation getFetalPresentation()
  {
    return LaborandDeliveryInformationOperations.getFetalPresentation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RouteandMethodofDelivery getRouteandMethodofDelivery()
  {
    return LaborandDeliveryInformationOperations.getRouteandMethodofDelivery(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyWeightatDelivery getBodyWeightatDelivery()
  {
    return LaborandDeliveryInformationOperations.getBodyWeightatDelivery(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaborandDeliveryInformation init() {
    	CDAUtil.init(this);
    	return this;
  }
} //LaborandDeliveryInformationImpl
