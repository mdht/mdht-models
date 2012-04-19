/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSInjuryIncidentDescriptionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Injury Incident Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSInjuryIncidentDescriptionImpl extends SectionImpl implements EMSInjuryIncidentDescription
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSInjuryIncidentDescriptionImpl()
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
    return EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSInjuryIncidentDescriptionOperations.validateEMSInjuryIncidentDescriptionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSInjuryIncidentDescriptionOperations.validateEMSInjuryIncidentDescriptionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation getInjuryCauseCategory()
  {
    return EMSInjuryIncidentDescriptionOperations.getInjuryCauseCategory(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation getInjuryMechanism()
  {
    return EMSInjuryIncidentDescriptionOperations.getInjuryMechanism(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation getTraumaCenterCriteria()
  {
    return EMSInjuryIncidentDescriptionOperations.getTraumaCenterCriteria(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation getInjuryRiskFactor()
  {
    return EMSInjuryIncidentDescriptionOperations.getInjuryRiskFactor(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation getVehicleImpactArea()
  {
    return EMSInjuryIncidentDescriptionOperations.getVehicleImpactArea(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation getPatientLocationInVehicle()
  {
    return EMSInjuryIncidentDescriptionOperations.getPatientLocationInVehicle(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation getVehicleOccupantSafetyEquipment()
  {
    return EMSInjuryIncidentDescriptionOperations.getVehicleOccupantSafetyEquipment(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation getAirbagDeploymentStatus()
  {
    return EMSInjuryIncidentDescriptionOperations.getAirbagDeploymentStatus(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation getHeightOfFall()
  {
    return EMSInjuryIncidentDescriptionOperations.getHeightOfFall(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSInjuryIncidentDescription init() {
    	CDAUtil.init(this);
    	return this;
  }
} //EMSInjuryIncidentDescriptionImpl
