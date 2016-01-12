/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivitySubstanceAdministrationOperations;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Medication Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Medication Dispense</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Reaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validateHearingPlanOfCareActivitySubstanceAdministrationPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministration#validatePlanOfCareActivitySubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareActivitySubstanceAdministrationOperations extends PlanOfCareActivitySubstanceAdministrationOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HearingPlanOfCareActivitySubstanceAdministrationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = 'IHE-TSC-7.3.1.1.2.5.8.001' or value.code = 'IHE-TSC-7.3.1.1.2.5.8.002' or value.code = 'IHE-TSC-7.3.1.1.2.5.8.003' or value.code = 'IHE-TSC-7.3.1.1.2.5.8.004'))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationCode(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CODE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationCode"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationText(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationText(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationText(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationText(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationText(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEXT,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationText"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationStatusCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationStatusCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationStatusCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationStatusCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationStatusCode(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_STATUS_CODE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationStatusCode"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationRepeatNumber(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Repeat Number</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationRepeatNumber(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationRepeatNumber(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Repeat Number</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationRepeatNumber(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationRepeatNumber(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_REPEAT_NUMBER,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationRepeatNumber"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationRouteCodeP(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Route Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationRouteCodeP(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationRouteCodeP(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Route Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationRouteCodeP(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationRouteCodeP(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE_P,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationRouteCodeP"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministrationRouteCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministrationRouteCodeP", passToken);
        }
        passToken.add(hearingPlanOfCareActivitySubstanceAdministration);
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationRouteCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Route Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationRouteCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationRouteCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Route Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationRouteCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationRouteCode(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministrationRouteCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingPlanOfCareActivitySubstanceAdministration)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ROUTE_CODE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationRouteCode"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Administration Unit Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Administration Unit Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE_P,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP", passToken);
        }
        passToken.add(hearingPlanOfCareActivitySubstanceAdministration);
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Administration Unit Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C42887' or value.code = 'C42888' or value.code = 'C42960' or value.code = 'C42971' or value.code = 'C42889' or value.code = 'C42892' or value.code = 'C42890' or value.code = 'C43451' or value.code = 'C42891' or value.code = 'C25158' or value.code = 'C42895' or value.code = 'C42896' or value.code = 'C42917' or value.code = 'C42902' or value.code = 'C42904' or value.code = 'C42916' or value.code = 'C42928' or value.code = 'C42936' or value.code = 'C42954' or value.code = 'C45414' or value.code = 'C42678' or value.code = 'C60884' or value.code = 'C60891' or value.code = 'C42900' or value.code = 'C42919' or value.code = 'C28944' or value.code = 'C60897' or value.code = 'C42901' or value.code = 'C45415' or value.code = 'C47890' or value.code = 'C43525' or value.code = 'C42679' or value.code = 'C42763' or value.code = 'C17423' or value.code = 'C42912' or value.code = 'C42913' or value.code = 'C42915' or value.code = 'C42929' or value.code = 'C60926' or value.code = 'C42932' or value.code = 'C42920' or value.code = 'C42984' or value.code = 'C60927' or value.code = 'C60928' or value.code = 'C60929' or value.code = 'C42933' or value.code = 'C42934' or value.code = 'C42906' or value.code = 'C60930' or value.code = 'C48193' or value.code = 'C42937' or value.code = 'C45416' or value.code = 'C42938' or value.code = 'C42903' or value.code = 'C42909' or value.code = 'C42939' or value.code = 'C42940' or value.code = 'C42921' or value.code = 'C42941' or value.code = 'C42894' or value.code = 'C42978' or value.code = 'C42942' or value.code = 'C42944' or value.code = 'C60931' or value.code = 'C42946' or value.code = 'C42914' or value.code = 'C42950' or value.code = 'C42974' or value.code = 'C42976' or value.code = 'C42977' or value.code = 'C42959' or value.code = 'C42957' or value.code = 'C42958' or value.code = 'C42956' or value.code = 'C42945' or value.code = 'C42899' or value.code = 'C42995' or value.code = 'C42926' or value.code = 'C42951' or value.code = 'C42988' or value.code = 'C60933' or value.code = 'C42922' or value.code = 'C47915' or value.code = 'C42947' or value.code = 'C42948' or value.code = 'C47916' or value.code = 'C45413' or value.code = 'C42949' or value.code = 'C42952' or value.code = 'C42953' or value.code = 'C60934' or value.code = 'C29167' or value.code = 'C60957' or value.code = 'C60958' or value.code = 'C42955' or value.code = 'C29269' or value.code = 'C42965' or value.code = 'C42966' or value.code = 'C60984' or value.code = 'C47887' or value.code = 'C42967' or value.code = 'C42907' or value.code = 'C60985' or value.code = 'C42968' or value.code = 'C42923' or value.code = 'C42911' or value.code = 'C42969' or value.code = 'C42943' or value.code = 'C42918' or value.code = 'C25394' or value.code = 'C42970' or value.code = 'C47913' or value.code = 'C42972' or value.code = 'C42908' or value.code = 'C42973' or value.code = 'C42975' or value.code = 'C42961' or value.code = 'C60988' or value.code = 'C42979' or value.code = 'C42980' or value.code = 'C42981' or value.code = 'C42982' or value.code = 'C42983' or value.code = 'C42986' or value.code = 'C42898' or value.code = 'C42987' or value.code = 'C60994' or value.code = 'C42935' or value.code = 'C60992' or value.code = 'C47912' or value.code = 'C42989' or value.code = 'C42962' or value.code = 'C42990' or value.code = 'C42991' or value.code = 'C47914' or value.code = 'C42993' or value.code = 'C42924' or value.code = 'C42994' or value.code = 'C42925' or value.code = 'C60995' or value.code = 'C47889' or value.code = 'C47898' or value.code = 'C42996' or value.code = 'C42998' or value.code = 'C42893' or value.code = 'C42897' or value.code = 'C60997' or value.code = 'C42905' or value.code = 'C42997' or value.code = 'C42910' or value.code = 'C42927' or value.code = 'C42931' or value.code = 'C42930' or value.code = 'C61004' or value.code = 'C61005' or value.code = 'C42964' or value.code = 'C42963' or value.code = 'C42999' or value.code = 'C61006' or value.code = 'C42985' or value.code = 'C42992' or value.code = 'C47892' or value.code = 'C47897' or value.code = 'C43000' or value.code = 'C43001' or value.code = 'C43002' or value.code = 'C43003'))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Administration Unit Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingPlanOfCareActivitySubstanceAdministration)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ADMINISTRATION_UNIT_CODE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationEffectiveTime(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationEffectiveTime(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->forAll(element | element.oclIsTypeOf(datatypes::PIVL_TS)))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationEffectiveTime(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationEffectiveTime(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationEffectiveTime(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_EFFECTIVE_TIME,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationEffectiveTime"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Approach Site Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Approach Site Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE_P,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP", passToken);
        }
        passToken.add(hearingPlanOfCareActivitySubstanceAdministration);
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Approach Site Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Approach Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingPlanOfCareActivitySubstanceAdministration)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_APPROACH_SITE_CODE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationDoseQuantity(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Dose Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationDoseQuantity(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationDoseQuantity(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Dose Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationDoseQuantity(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationDoseQuantity(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_DOSE_QUANTITY,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationDoseQuantity"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationRateQuantity(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Rate Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationRateQuantity(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationRateQuantity(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Rate Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationRateQuantity(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationRateQuantity(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_RATE_QUANTITY,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationRateQuantity"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Max Dose Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Max Dose Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MAX_DOSE_QUANTITY,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationConsumable(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Consumable</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationConsumable(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationConsumable(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Consumable</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationConsumable(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationConsumable(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_CONSUMABLE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationConsumable"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationPerformer(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Performer</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationPerformer(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationPerformer(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Performer</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationPerformer(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationPerformer(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PERFORMER,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationPerformer"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationParticipant(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Participant</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationParticipant(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationParticipant(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Participant</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationParticipant(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationParticipant(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PARTICIPANT,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationParticipant"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Indication</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Indication</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INDICATION,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Instructions</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Instructions</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_INSTRUCTIONS,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Medication Supply</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Medication Supply</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Medication Dispense</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Medication Dispense</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Reaction</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_REACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Entry Relationship Reaction</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_REACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_REACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_REACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_REACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_REACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_RELATIONSHIP_REACTION,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationPrecondition(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Precondition</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationPrecondition(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.oclIsUndefined() and precondition.oclIsKindOf(cda::Precondition))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivitySubstanceAdministrationPrecondition(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Substance Administration Precondition</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivitySubstanceAdministrationPrecondition(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivitySubstanceAdministrationPrecondition(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_PRECONDITION,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivitySubstanceAdministrationPrecondition"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePlanOfCareActivitySubstanceAdministrationTemplateId(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePlanOfCareActivitySubstanceAdministrationTemplateId(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.6')";

  /**
   * The cached OCL invariant for the '{@link #validatePlanOfCareActivitySubstanceAdministrationTemplateId(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePlanOfCareActivitySubstanceAdministrationTemplateId(HearingPlanOfCareActivitySubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivitySubstanceAdministration The receiving '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePlanOfCareActivitySubstanceAdministrationTemplateId(HearingPlanOfCareActivitySubstanceAdministration hearingPlanOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);
      try
      {
        VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivitySubstanceAdministration))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID,
             HPOCPlugin.INSTANCE.getString("PlanOfCareActivitySubstanceAdministrationTemplateId"),
             new Object [] { hearingPlanOfCareActivitySubstanceAdministration }));
      }
       
      return false;
    }
    return true;
  }

} // HearingPlanOfCareActivitySubstanceAdministrationOperations