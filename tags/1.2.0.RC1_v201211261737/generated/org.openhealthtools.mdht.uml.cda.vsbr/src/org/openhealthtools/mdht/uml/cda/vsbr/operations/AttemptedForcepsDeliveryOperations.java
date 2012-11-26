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

import org.openhealthtools.mdht.uml.cda.vsbr.AttemptedForcepsDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Attempted Forceps Delivery</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AttemptedForcepsDelivery#validateAttemptedForcepsDeliveryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AttemptedForcepsDelivery#validateAttemptedForcepsDeliveryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AttemptedForcepsDelivery#validateAttemptedForcepsDeliveryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AttemptedForcepsDelivery#validateAttemptedForcepsDeliveryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AttemptedForcepsDelivery#validateAttemptedForcepsDeliveryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttemptedForcepsDeliveryOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttemptedForcepsDeliveryOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateAttemptedForcepsDeliveryTemplateId(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedForcepsDeliveryTemplateId(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.10')";

  /**
   * The cached OCL invariant for the '{@link #validateAttemptedForcepsDeliveryTemplateId(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedForcepsDeliveryTemplateId(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.10')
   * @param attemptedForcepsDelivery The receiving '<em><b>Attempted Forceps Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAttemptedForcepsDeliveryTemplateId(AttemptedForcepsDelivery attemptedForcepsDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ATTEMPTED_FORCEPS_DELIVERY);
      try
      {
        VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(attemptedForcepsDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ATTEMPTED_FORCEPS_DELIVERY__ATTEMPTED_FORCEPS_DELIVERY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AttemptedForcepsDeliveryTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(attemptedForcepsDelivery, context) }),
             new Object [] { attemptedForcepsDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAttemptedForcepsDeliveryClassCode(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedForcepsDeliveryClassCode(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateAttemptedForcepsDeliveryClassCode(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedForcepsDeliveryClassCode(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param attemptedForcepsDelivery The receiving '<em><b>Attempted Forceps Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAttemptedForcepsDeliveryClassCode(AttemptedForcepsDelivery attemptedForcepsDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ATTEMPTED_FORCEPS_DELIVERY);
      try
      {
        VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(attemptedForcepsDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ATTEMPTED_FORCEPS_DELIVERY__ATTEMPTED_FORCEPS_DELIVERY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AttemptedForcepsDeliveryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(attemptedForcepsDelivery, context) }),
             new Object [] { attemptedForcepsDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAttemptedForcepsDeliveryCode(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedForcepsDeliveryCode(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateAttemptedForcepsDeliveryCode(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedForcepsDeliveryCode(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param attemptedForcepsDelivery The receiving '<em><b>Attempted Forceps Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAttemptedForcepsDeliveryCode(AttemptedForcepsDelivery attemptedForcepsDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ATTEMPTED_FORCEPS_DELIVERY);
      try
      {
        VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(attemptedForcepsDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ATTEMPTED_FORCEPS_DELIVERY__ATTEMPTED_FORCEPS_DELIVERY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AttemptedForcepsDeliveryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(attemptedForcepsDelivery, context) }),
             new Object [] { attemptedForcepsDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAttemptedForcepsDeliveryMoodCode(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedForcepsDeliveryMoodCode(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateAttemptedForcepsDeliveryMoodCode(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedForcepsDeliveryMoodCode(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param attemptedForcepsDelivery The receiving '<em><b>Attempted Forceps Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAttemptedForcepsDeliveryMoodCode(AttemptedForcepsDelivery attemptedForcepsDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ATTEMPTED_FORCEPS_DELIVERY);
      try
      {
        VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(attemptedForcepsDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ATTEMPTED_FORCEPS_DELIVERY__ATTEMPTED_FORCEPS_DELIVERY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AttemptedForcepsDeliveryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(attemptedForcepsDelivery, context) }),
             new Object [] { attemptedForcepsDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAttemptedForcepsDeliveryValue(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedForcepsDeliveryValue(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateAttemptedForcepsDeliveryValue(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Forceps Delivery Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedForcepsDeliveryValue(AttemptedForcepsDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param attemptedForcepsDelivery The receiving '<em><b>Attempted Forceps Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAttemptedForcepsDeliveryValue(AttemptedForcepsDelivery attemptedForcepsDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ATTEMPTED_FORCEPS_DELIVERY);
      try
      {
        VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ATTEMPTED_FORCEPS_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(attemptedForcepsDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ATTEMPTED_FORCEPS_DELIVERY__ATTEMPTED_FORCEPS_DELIVERY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AttemptedForcepsDeliveryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(attemptedForcepsDelivery, context) }),
             new Object [] { attemptedForcepsDelivery }));
      }
       
      return false;
    }
    return true;
  }

} // AttemptedForcepsDeliveryOperations