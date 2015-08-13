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

import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivitySupplyOperations;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

import org.openhealthtools.mdht.uml.cda.operations.SupplyOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Plan Of Care Activity Non Medicinal Supply</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply#validateHearingPlanOfCareActivityNonMedicinalSupplyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply#validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply#validateHearingPlanOfCareActivityNonMedicinalSupplyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply#validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply#validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply#validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply#validatePlanOfCareActivitySupplyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareActivityNonMedicinalSupplyOperations extends PlanOfCareActivitySupplyOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HearingPlanOfCareActivityNonMedicinalSupplyOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivityNonMedicinalSupplyCode(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityNonMedicinalSupplyCode(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = 'IHE-TSC-7.3.1.1.2.5.9.001' or value.code = 'IHE-TSC-7.3.1.1.2.5.9.002' or value.code = 'IHE-TSC-7.3.1.1.2.5.9.003' or value.code = 'IHE-TSC-7.3.1.1.2.5.9.004'))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivityNonMedicinalSupplyCode(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityNonMedicinalSupplyCode(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityNonMedicinalSupply The receiving '<em><b>Hearing Plan Of Care Activity Non Medicinal Supply</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivityNonMedicinalSupplyCode(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityNonMedicinalSupply))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivityNonMedicinalSupplyCode"),
             new Object [] { hearingPlanOfCareActivityNonMedicinalSupply }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityNonMedicinalSupply The receiving '<em><b>Hearing Plan Of Care Activity Non Medicinal Supply</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityNonMedicinalSupply))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_CODE_P,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivityNonMedicinalSupplyCodeP"),
             new Object [] { hearingPlanOfCareActivityNonMedicinalSupply }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivityNonMedicinalSupplyText(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityNonMedicinalSupplyText(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivityNonMedicinalSupplyText(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityNonMedicinalSupplyText(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityNonMedicinalSupply The receiving '<em><b>Hearing Plan Of Care Activity Non Medicinal Supply</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivityNonMedicinalSupplyText(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityNonMedicinalSupply))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_TEXT,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivityNonMedicinalSupplyText"),
             new Object [] { hearingPlanOfCareActivityNonMedicinalSupply }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityNonMedicinalSupply The receiving '<em><b>Hearing Plan Of Care Activity Non Medicinal Supply</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityNonMedicinalSupply))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_EFFECTIVE_TIME,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime"),
             new Object [] { hearingPlanOfCareActivityNonMedicinalSupply }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityNonMedicinalSupply The receiving '<em><b>Hearing Plan Of Care Activity Non Medicinal Supply</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityNonMedicinalSupply))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_QUANTITY,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivityNonMedicinalSupplyQuantity"),
             new Object [] { hearingPlanOfCareActivityNonMedicinalSupply }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Participant</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Activity Non Medicinal Supply Participant</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityNonMedicinalSupply The receiving '<em><b>Hearing Plan Of Care Activity Non Medicinal Supply</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityNonMedicinalSupply))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY_PARTICIPANT,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareActivityNonMedicinalSupplyParticipant"),
             new Object [] { hearingPlanOfCareActivityNonMedicinalSupply }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePlanOfCareActivitySupplyTemplateId(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePlanOfCareActivitySupplyTemplateId(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.7')";

  /**
   * The cached OCL invariant for the '{@link #validatePlanOfCareActivitySupplyTemplateId(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePlanOfCareActivitySupplyTemplateId(HearingPlanOfCareActivityNonMedicinalSupply, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareActivityNonMedicinalSupply The receiving '<em><b>Hearing Plan Of Care Activity Non Medicinal Supply</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePlanOfCareActivitySupplyTemplateId(HearingPlanOfCareActivityNonMedicinalSupply hearingPlanOfCareActivityNonMedicinalSupply, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY);
      try
      {
        VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareActivityNonMedicinalSupply))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID,
             HPOCPlugin.INSTANCE.getString("PlanOfCareActivitySupplyTemplateId"),
             new Object [] { hearingPlanOfCareActivityNonMedicinalSupply }));
      }
       
      return false;
    }
    return true;
  }

} // HearingPlanOfCareActivityNonMedicinalSupplyOperations