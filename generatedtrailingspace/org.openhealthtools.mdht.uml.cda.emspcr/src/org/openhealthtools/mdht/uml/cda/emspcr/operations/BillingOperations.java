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

import org.openhealthtools.mdht.uml.cda.emspcr.Billing;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Billing</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Billing#validateBillingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Billing#validateBillingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Billing#validateBillingLevelOfService(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Level Of Service</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Billing#getLevelOfService() <em>Get Level Of Service</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Billing#getBillingCondition() <em>Get Billing Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillingOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BillingOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateBillingTemplateId(Billing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBillingTemplateId(Billing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BILLING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.5')";

  /**
   * The cached OCL invariant for the '{@link #validateBillingTemplateId(Billing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBillingTemplateId(Billing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BILLING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.5')
   * @param billing The receiving '<em><b>Billing</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBillingTemplateId(Billing billing, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_BILLING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.BILLING);
      try
      {
        VALIDATE_BILLING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BILLING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(billing))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.BILLING__BILLING_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("BillingTemplateId"),
             new Object [] { billing }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBillingCode(Billing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBillingCode(Billing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BILLING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '67659‐3' and value.codeSystem = '2.16.840.1.113883.6.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateBillingCode(Billing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBillingCode(Billing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BILLING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
   * value.code = '67659‐3' and value.codeSystem = '2.16.840.1.113883.6.1'))
   * @param billing The receiving '<em><b>Billing</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBillingCode(Billing billing, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_BILLING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.BILLING);
      try
      {
        VALIDATE_BILLING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BILLING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(billing))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.BILLING__BILLING_CODE,
             EmspcrPlugin.INSTANCE.getString("BillingCode"),
             new Object [] { billing }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBillingLevelOfService(Billing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Level Of Service</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBillingLevelOfService(Billing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BILLING_LEVEL_OF_SERVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cda::Observation))";

  /**
   * The cached OCL invariant for the '{@link #validateBillingLevelOfService(Billing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Level Of Service</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBillingLevelOfService(Billing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BILLING_LEVEL_OF_SERVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cda::Observation))
   * @param billing The receiving '<em><b>Billing</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBillingLevelOfService(Billing billing, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_BILLING_LEVEL_OF_SERVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.BILLING);
      try
      {
        VALIDATE_BILLING_LEVEL_OF_SERVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_LEVEL_OF_SERVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BILLING_LEVEL_OF_SERVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(billing))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.BILLING__BILLING_LEVEL_OF_SERVICE,
             EmspcrPlugin.INSTANCE.getString("BillingLevelOfService"),
             new Object [] { billing }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getLevelOfService(Billing) <em>Get Level Of Service</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevelOfService(Billing)
   * @generated
   * @ordered
   */
  protected static final String GET_LEVEL_OF_SERVICE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getLevelOfService(Billing) <em>Get Level Of Service</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevelOfService(Billing)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_LEVEL_OF_SERVICE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param billing The receiving '<em><b>Billing</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getLevelOfService(Billing billing)
  {
    if (GET_LEVEL_OF_SERVICE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.BILLING, EmspcrPackage.Literals.BILLING.getEAllOperations().get(58));
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
    return (Observation) query.evaluate(billing);
  }

  /**
   * The cached OCL expression body for the '{@link #getBillingCondition(Billing) <em>Get Billing Condition</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBillingCondition(Billing)
   * @generated
   * @ordered
   */
  protected static final String GET_BILLING_CONDITION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getBillingCondition(Billing) <em>Get Billing Condition</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBillingCondition(Billing)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BILLING_CONDITION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param billing The receiving '<em><b>Billing</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getBillingCondition(Billing billing)
  {
    if (GET_BILLING_CONDITION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.BILLING, EmspcrPackage.Literals.BILLING.getEAllOperations().get(59));
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
    return (Observation) query.evaluate(billing);
  }

} // BillingOperations