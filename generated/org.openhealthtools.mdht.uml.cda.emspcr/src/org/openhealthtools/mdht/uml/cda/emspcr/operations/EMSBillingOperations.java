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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Billing</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling#validateEMSBillingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling#validateEMSBillingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling#validateEMSBillingLevelOfService(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Level Of Service</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling#getLevelOfService() <em>Get Level Of Service</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling#getBillingCondition() <em>Get Billing Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSBillingOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSBillingOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSBillingTemplateId(EMSBilling, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSBillingTemplateId(EMSBilling, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_BILLING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.5')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSBillingTemplateId(EMSBilling, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSBillingTemplateId(EMSBilling, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_BILLING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.5')
   * @param emsBilling The receiving '<em><b>EMS Billing</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSBillingTemplateId(EMSBilling emsBilling, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_EMS_BILLING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_BILLING);
      try
      {
        VALIDATE_EMS_BILLING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_BILLING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_BILLING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsBilling))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_BILLING__EMS_BILLING_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSBillingTemplateId"),
             new Object [] { emsBilling }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSBillingCode(EMSBilling, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSBillingCode(EMSBilling, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_BILLING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67659-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSBillingCode(EMSBilling, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSBillingCode(EMSBilling, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_BILLING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67659-3' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param emsBilling The receiving '<em><b>EMS Billing</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSBillingCode(EMSBilling emsBilling, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_EMS_BILLING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_BILLING);
      try
      {
        VALIDATE_EMS_BILLING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_BILLING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_BILLING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsBilling))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_BILLING__EMS_BILLING_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSBillingCode"),
             new Object [] { emsBilling }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSBillingLevelOfService(EMSBilling, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Level Of Service</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSBillingLevelOfService(EMSBilling, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_BILLING_LEVEL_OF_SERVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cda::Observation))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSBillingLevelOfService(EMSBilling, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Level Of Service</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSBillingLevelOfService(EMSBilling, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_BILLING_LEVEL_OF_SERVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cda::Observation))
   * @param emsBilling The receiving '<em><b>EMS Billing</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSBillingLevelOfService(EMSBilling emsBilling, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_EMS_BILLING_LEVEL_OF_SERVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_BILLING);
      try
      {
        VALIDATE_EMS_BILLING_LEVEL_OF_SERVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_BILLING_LEVEL_OF_SERVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_BILLING_LEVEL_OF_SERVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsBilling))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_BILLING__EMS_BILLING_LEVEL_OF_SERVICE,
             EmspcrPlugin.INSTANCE.getString("EMSBillingLevelOfService"),
             new Object [] { emsBilling }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getLevelOfService(EMSBilling) <em>Get Level Of Service</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevelOfService(EMSBilling)
   * @generated
   * @ordered
   */
  protected static final String GET_LEVEL_OF_SERVICE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getLevelOfService(EMSBilling) <em>Get Level Of Service</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevelOfService(EMSBilling)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_LEVEL_OF_SERVICE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param emsBilling The receiving '<em><b>EMS Billing</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getLevelOfService(EMSBilling emsBilling)
  {
    if (GET_LEVEL_OF_SERVICE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_BILLING, EmspcrPackage.Literals.EMS_BILLING.getEAllOperations().get(58));
      try
      {
        GET_LEVEL_OF_SERVICE__EOCL_QRY = helper.createQuery(GET_LEVEL_OF_SERVICE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_LEVEL_OF_SERVICE__EOCL_QRY);
    return (Observation) query.evaluate(emsBilling);
  }

  /**
   * The cached OCL expression body for the '{@link #getBillingCondition(EMSBilling) <em>Get Billing Condition</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBillingCondition(EMSBilling)
   * @generated
   * @ordered
   */
  protected static final String GET_BILLING_CONDITION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getBillingCondition(EMSBilling) <em>Get Billing Condition</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBillingCondition(EMSBilling)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BILLING_CONDITION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param emsBilling The receiving '<em><b>EMS Billing</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getBillingCondition(EMSBilling emsBilling)
  {
    if (GET_BILLING_CONDITION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_BILLING, EmspcrPackage.Literals.EMS_BILLING.getEAllOperations().get(59));
      try
      {
        GET_BILLING_CONDITION__EOCL_QRY = helper.createQuery(GET_BILLING_CONDITION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BILLING_CONDITION__EOCL_QRY);
    return (Observation) query.evaluate(emsBilling);
  }

} // EMSBillingOperations