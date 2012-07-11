/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Body Weightat Delivery</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery#validateBodyWeightatDeliveryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery#validateBodyWeightatDeliveryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery#validateBodyWeightatDeliveryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery#validateBodyWeightatDeliveryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyWeightatDeliveryOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyWeightatDeliveryOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightatDeliveryTemplateId(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightatDeliveryTemplateId(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHTAT_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.14')";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightatDeliveryTemplateId(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightatDeliveryTemplateId(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHTAT_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.14')
   * @param bodyWeightatDelivery The receiving '<em><b>Body Weightat Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightatDeliveryTemplateId(BodyWeightatDelivery bodyWeightatDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHTAT_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BODY_WEIGHTAT_DELIVERY);
      try
      {
        VALIDATE_BODY_WEIGHTAT_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHTAT_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHTAT_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightatDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BODY_WEIGHTAT_DELIVERY__BODY_WEIGHTAT_DELIVERY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightatDeliveryTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightatDelivery, context) }),
             new Object [] { bodyWeightatDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightatDeliveryClassCode(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightatDeliveryClassCode(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHTAT_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightatDeliveryClassCode(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightatDeliveryClassCode(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHTAT_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param bodyWeightatDelivery The receiving '<em><b>Body Weightat Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightatDeliveryClassCode(BodyWeightatDelivery bodyWeightatDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHTAT_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BODY_WEIGHTAT_DELIVERY);
      try
      {
        VALIDATE_BODY_WEIGHTAT_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHTAT_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHTAT_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightatDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BODY_WEIGHTAT_DELIVERY__BODY_WEIGHTAT_DELIVERY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightatDeliveryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightatDelivery, context) }),
             new Object [] { bodyWeightatDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightatDeliveryCode(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightatDeliveryCode(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHTAT_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightatDeliveryCode(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightatDeliveryCode(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHTAT_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param bodyWeightatDelivery The receiving '<em><b>Body Weightat Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightatDeliveryCode(BodyWeightatDelivery bodyWeightatDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHTAT_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BODY_WEIGHTAT_DELIVERY);
      try
      {
        VALIDATE_BODY_WEIGHTAT_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHTAT_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHTAT_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightatDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BODY_WEIGHTAT_DELIVERY__BODY_WEIGHTAT_DELIVERY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightatDeliveryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightatDelivery, context) }),
             new Object [] { bodyWeightatDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightatDeliveryValue(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightatDeliveryValue(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHTAT_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightatDeliveryValue(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightatDeliveryValue(BodyWeightatDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHTAT_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))
   * @param bodyWeightatDelivery The receiving '<em><b>Body Weightat Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightatDeliveryValue(BodyWeightatDelivery bodyWeightatDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHTAT_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BODY_WEIGHTAT_DELIVERY);
      try
      {
        VALIDATE_BODY_WEIGHTAT_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHTAT_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHTAT_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeightatDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BODY_WEIGHTAT_DELIVERY__BODY_WEIGHTAT_DELIVERY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightatDeliveryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeightatDelivery, context) }),
             new Object [] { bodyWeightatDelivery }));
      }
       
      return false;
    }
    return true;
  }

} // BodyWeightatDeliveryOperations