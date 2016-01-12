/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivityEncounterOperations;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityEncounter;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Plan Of Care Activity Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityEncounter#validateHearingPlanOfCareActivityEncounterEffectiveTimeLowHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Effective Time Low High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityEncounter#validateHearingPlanOfCareActivityEncounterCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityEncounter#validateHearingPlanOfCareActivityEncounterCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityEncounter#validateHearingPlanOfCareActivityEncounterStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityEncounter#validateHearingPlanOfCareActivityEncounterText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareActivityEncounterOperations extends PlanOfCareActivityEncounterOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected HearingPlanOfCareActivityEncounterOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivityEncounterEffectiveTimeLowHigh(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Effective Time Low High</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityEncounterEffectiveTimeLowHigh(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.low.hasContent()  and self.effectiveTime.high.hasContent()";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivityEncounterEffectiveTimeLowHigh(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Effective Time Low High</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityEncounterEffectiveTimeLowHigh(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityEncounter The receiving '<em><b>Hearing Plan Of Care Activity Encounter</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivityEncounterEffectiveTimeLowHigh(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityEncounter))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_EFFECTIVE_TIME_LOW_HIGH,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivityEncounterEffectiveTimeLowHigh"),
             new Object [] { hearingPlanOfCareActivityEncounter }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivityEncounterCode(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityEncounterCode(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = 'IHE-TSC-7.3.1.1.2.5.5.001' or value.code = 'IHE-TSC-7.3.1.1.2.5.5.002' or value.code = 'IHE-TSC-7.3.1.1.2.5.5.003' or value.code = 'IHE-TSC-7.3.1.1.2.5.5.004' or value.code = 'IHE-TSC-7.3.1.1.2.5.5.005' or value.code = 'IHE-TSC-7.3.1.1.2.5.5.006'))";

	/**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivityEncounterCode(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityEncounterCode(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityEncounter The receiving '<em><b>Hearing Plan Of Care Activity Encounter</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateHearingPlanOfCareActivityEncounterCode(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityEncounter))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivityEncounterCode"),
             new Object [] { hearingPlanOfCareActivityEncounter }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivityEncounterCodeP(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityEncounterCodeP(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivityEncounterCodeP(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityEncounterCodeP(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityEncounter The receiving '<em><b>Hearing Plan Of Care Activity Encounter</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivityEncounterCodeP(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityEncounter))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CODE_P,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivityEncounterCodeP"),
             new Object [] { hearingPlanOfCareActivityEncounter }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivityEncounterStatusCode(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityEncounterStatusCode(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivityEncounterStatusCode(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityEncounterStatusCode(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityEncounter The receiving '<em><b>Hearing Plan Of Care Activity Encounter</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivityEncounterStatusCode(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityEncounter))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_STATUS_CODE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivityEncounterStatusCode"),
             new Object [] { hearingPlanOfCareActivityEncounter }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivityEncounterText(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityEncounterText(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivityEncounterText(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Encounter Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityEncounterText(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityEncounter The receiving '<em><b>Hearing Plan Of Care Activity Encounter</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivityEncounterText(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityEncounter))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEXT,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivityEncounterText"),
             new Object [] { hearingPlanOfCareActivityEncounter }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePlanOfCareActivityEncounterTemplateId(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlanOfCareActivityEncounterTemplateId(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.3')";

	/**
   * The cached OCL invariant for the '{@link #validatePlanOfCareActivityEncounterTemplateId(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlanOfCareActivityEncounterTemplateId(HearingPlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityEncounter The receiving '<em><b>Hearing Plan Of Care Activity Encounter</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePlanOfCareActivityEncounterTemplateId(HearingPlanOfCareActivityEncounter hearingPlanOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
      try
      {
        VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityEncounter))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID,
             HPOCPlugin.INSTANCE.getString("PlanOfCareActivityEncounterTemplateId"),
             new Object [] { hearingPlanOfCareActivityEncounter }));
      }
       
      return false;
    }
    return true;
  }

} // HearingPlanOfCareActivityEncounterOperations