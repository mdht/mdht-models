/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Injury Incident Description</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription#validateEMSInjuryIncidentDescriptionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription#validateEMSInjuryIncidentDescriptionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription#getInjuryCauseCategory() <em>Get Injury Cause Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription#getInjuryMechanism() <em>Get Injury Mechanism</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription#getTraumaCenterCriteria() <em>Get Trauma Center Criteria</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription#getInjuryRiskFactor() <em>Get Injury Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription#getVehicleImpactArea() <em>Get Vehicle Impact Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription#getPatientLocationInVehicle() <em>Get Patient Location In Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription#getVehicleOccupantSafetyEquipment() <em>Get Vehicle Occupant Safety Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription#getAirbagDeploymentStatus() <em>Get Airbag Deployment Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription#getHeightOfFall() <em>Get Height Of Fall</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSInjuryIncidentDescriptionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSInjuryIncidentDescriptionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionTemplateId(EMSInjuryIncidentDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionTemplateId(EMSInjuryIncidentDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.17')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionTemplateId(EMSInjuryIncidentDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionTemplateId(EMSInjuryIncidentDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.17')
   * @param emsInjuryIncidentDescription The receiving '<em><b>EMS Injury Incident Description</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSInjuryIncidentDescriptionTemplateId(EMSInjuryIncidentDescription emsInjuryIncidentDescription, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescription))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION__EMS_INJURY_INCIDENT_DESCRIPTION_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionTemplateId"),
             new Object [] { emsInjuryIncidentDescription }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionCode(EMSInjuryIncidentDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionCode(EMSInjuryIncidentDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '11374-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionCode(EMSInjuryIncidentDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSInjuryIncidentDescriptionCode(EMSInjuryIncidentDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '11374-6' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param emsInjuryIncidentDescription The receiving '<em><b>EMS Injury Incident Description</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSInjuryIncidentDescriptionCode(EMSInjuryIncidentDescription emsInjuryIncidentDescription, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION);
      try
      {
        VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsInjuryIncidentDescription))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION__EMS_INJURY_INCIDENT_DESCRIPTION_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionCode"),
             new Object [] { emsInjuryIncidentDescription }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getInjuryCauseCategory(EMSInjuryIncidentDescription) <em>Get Injury Cause Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInjuryCauseCategory(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static final String GET_INJURY_CAUSE_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getInjuryCauseCategory(EMSInjuryIncidentDescription) <em>Get Injury Cause Category</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInjuryCauseCategory(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_INJURY_CAUSE_CATEGORY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param emsInjuryIncidentDescription The receiving '<em><b>EMS Injury Incident Description</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getInjuryCauseCategory(EMSInjuryIncidentDescription emsInjuryIncidentDescription)
  {
    if (GET_INJURY_CAUSE_CATEGORY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION.getEAllOperations().get(57));
      try
      {
        GET_INJURY_CAUSE_CATEGORY__EOCL_QRY = helper.createQuery(GET_INJURY_CAUSE_CATEGORY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_INJURY_CAUSE_CATEGORY__EOCL_QRY);
    return (Observation) query.evaluate(emsInjuryIncidentDescription);
  }

  /**
   * The cached OCL expression body for the '{@link #getInjuryMechanism(EMSInjuryIncidentDescription) <em>Get Injury Mechanism</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInjuryMechanism(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static final String GET_INJURY_MECHANISM__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getInjuryMechanism(EMSInjuryIncidentDescription) <em>Get Injury Mechanism</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInjuryMechanism(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_INJURY_MECHANISM__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param emsInjuryIncidentDescription The receiving '<em><b>EMS Injury Incident Description</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getInjuryMechanism(EMSInjuryIncidentDescription emsInjuryIncidentDescription)
  {
    if (GET_INJURY_MECHANISM__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION.getEAllOperations().get(58));
      try
      {
        GET_INJURY_MECHANISM__EOCL_QRY = helper.createQuery(GET_INJURY_MECHANISM__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_INJURY_MECHANISM__EOCL_QRY);
    return (Observation) query.evaluate(emsInjuryIncidentDescription);
  }

  /**
   * The cached OCL expression body for the '{@link #getTraumaCenterCriteria(EMSInjuryIncidentDescription) <em>Get Trauma Center Criteria</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraumaCenterCriteria(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static final String GET_TRAUMA_CENTER_CRITERIA__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getTraumaCenterCriteria(EMSInjuryIncidentDescription) <em>Get Trauma Center Criteria</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraumaCenterCriteria(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TRAUMA_CENTER_CRITERIA__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param emsInjuryIncidentDescription The receiving '<em><b>EMS Injury Incident Description</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getTraumaCenterCriteria(EMSInjuryIncidentDescription emsInjuryIncidentDescription)
  {
    if (GET_TRAUMA_CENTER_CRITERIA__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION.getEAllOperations().get(59));
      try
      {
        GET_TRAUMA_CENTER_CRITERIA__EOCL_QRY = helper.createQuery(GET_TRAUMA_CENTER_CRITERIA__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TRAUMA_CENTER_CRITERIA__EOCL_QRY);
    return (Observation) query.evaluate(emsInjuryIncidentDescription);
  }

  /**
   * The cached OCL expression body for the '{@link #getInjuryRiskFactor(EMSInjuryIncidentDescription) <em>Get Injury Risk Factor</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInjuryRiskFactor(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static final String GET_INJURY_RISK_FACTOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getInjuryRiskFactor(EMSInjuryIncidentDescription) <em>Get Injury Risk Factor</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInjuryRiskFactor(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_INJURY_RISK_FACTOR__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param emsInjuryIncidentDescription The receiving '<em><b>EMS Injury Incident Description</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getInjuryRiskFactor(EMSInjuryIncidentDescription emsInjuryIncidentDescription)
  {
    if (GET_INJURY_RISK_FACTOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION.getEAllOperations().get(60));
      try
      {
        GET_INJURY_RISK_FACTOR__EOCL_QRY = helper.createQuery(GET_INJURY_RISK_FACTOR__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_INJURY_RISK_FACTOR__EOCL_QRY);
    return (Observation) query.evaluate(emsInjuryIncidentDescription);
  }

  /**
   * The cached OCL expression body for the '{@link #getVehicleImpactArea(EMSInjuryIncidentDescription) <em>Get Vehicle Impact Area</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVehicleImpactArea(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static final String GET_VEHICLE_IMPACT_AREA__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getVehicleImpactArea(EMSInjuryIncidentDescription) <em>Get Vehicle Impact Area</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVehicleImpactArea(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_VEHICLE_IMPACT_AREA__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param emsInjuryIncidentDescription The receiving '<em><b>EMS Injury Incident Description</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getVehicleImpactArea(EMSInjuryIncidentDescription emsInjuryIncidentDescription)
  {
    if (GET_VEHICLE_IMPACT_AREA__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION.getEAllOperations().get(61));
      try
      {
        GET_VEHICLE_IMPACT_AREA__EOCL_QRY = helper.createQuery(GET_VEHICLE_IMPACT_AREA__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_VEHICLE_IMPACT_AREA__EOCL_QRY);
    return (Observation) query.evaluate(emsInjuryIncidentDescription);
  }

  /**
   * The cached OCL expression body for the '{@link #getPatientLocationInVehicle(EMSInjuryIncidentDescription) <em>Get Patient Location In Vehicle</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatientLocationInVehicle(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static final String GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getPatientLocationInVehicle(EMSInjuryIncidentDescription) <em>Get Patient Location In Vehicle</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatientLocationInVehicle(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param emsInjuryIncidentDescription The receiving '<em><b>EMS Injury Incident Description</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getPatientLocationInVehicle(EMSInjuryIncidentDescription emsInjuryIncidentDescription)
  {
    if (GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION.getEAllOperations().get(62));
      try
      {
        GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_QRY = helper.createQuery(GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_QRY);
    return (Observation) query.evaluate(emsInjuryIncidentDescription);
  }

  /**
   * The cached OCL expression body for the '{@link #getVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescription) <em>Get Vehicle Occupant Safety Equipment</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static final String GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescription) <em>Get Vehicle Occupant Safety Equipment</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param emsInjuryIncidentDescription The receiving '<em><b>EMS Injury Incident Description</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescription emsInjuryIncidentDescription)
  {
    if (GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION.getEAllOperations().get(63));
      try
      {
        GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_QRY = helper.createQuery(GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_QRY);
    return (Observation) query.evaluate(emsInjuryIncidentDescription);
  }

  /**
   * The cached OCL expression body for the '{@link #getAirbagDeploymentStatus(EMSInjuryIncidentDescription) <em>Get Airbag Deployment Status</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAirbagDeploymentStatus(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static final String GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getAirbagDeploymentStatus(EMSInjuryIncidentDescription) <em>Get Airbag Deployment Status</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAirbagDeploymentStatus(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param emsInjuryIncidentDescription The receiving '<em><b>EMS Injury Incident Description</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getAirbagDeploymentStatus(EMSInjuryIncidentDescription emsInjuryIncidentDescription)
  {
    if (GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION.getEAllOperations().get(64));
      try
      {
        GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_QRY = helper.createQuery(GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_QRY);
    return (Observation) query.evaluate(emsInjuryIncidentDescription);
  }

  /**
   * The cached OCL expression body for the '{@link #getHeightOfFall(EMSInjuryIncidentDescription) <em>Get Height Of Fall</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeightOfFall(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static final String GET_HEIGHT_OF_FALL__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getHeightOfFall(EMSInjuryIncidentDescription) <em>Get Height Of Fall</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeightOfFall(EMSInjuryIncidentDescription)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_HEIGHT_OF_FALL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param emsInjuryIncidentDescription The receiving '<em><b>EMS Injury Incident Description</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getHeightOfFall(EMSInjuryIncidentDescription emsInjuryIncidentDescription)
  {
    if (GET_HEIGHT_OF_FALL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION.getEAllOperations().get(65));
      try
      {
        GET_HEIGHT_OF_FALL__EOCL_QRY = helper.createQuery(GET_HEIGHT_OF_FALL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HEIGHT_OF_FALL__EOCL_QRY);
    return (Observation) query.evaluate(emsInjuryIncidentDescription);
  }

} // EMSInjuryIncidentDescriptionOperations