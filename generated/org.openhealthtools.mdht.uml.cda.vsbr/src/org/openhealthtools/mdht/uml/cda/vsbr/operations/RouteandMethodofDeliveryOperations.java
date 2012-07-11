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

import org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Routeand Methodof Delivery</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery#validateRouteandMethodofDeliveryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery#validateRouteandMethodofDeliveryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery#validateRouteandMethodofDeliveryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery#validateRouteandMethodofDeliveryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery#validateRouteandMethodofDeliveryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery#validateRouteandMethodofDeliveryEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Entry Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteandMethodofDeliveryOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RouteandMethodofDeliveryOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateRouteandMethodofDeliveryTemplateId(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRouteandMethodofDeliveryTemplateId(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ROUTEAND_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.35')";

  /**
   * The cached OCL invariant for the '{@link #validateRouteandMethodofDeliveryTemplateId(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRouteandMethodofDeliveryTemplateId(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ROUTEAND_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.35')
   * @param routeandMethodofDelivery The receiving '<em><b>Routeand Methodof Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRouteandMethodofDeliveryTemplateId(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ROUTEAND_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ROUTEAND_METHODOF_DELIVERY);
      try
      {
        VALIDATE_ROUTEAND_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ROUTEAND_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ROUTEAND_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(routeandMethodofDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ROUTEAND_METHODOF_DELIVERY__ROUTEAND_METHODOF_DELIVERY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RouteandMethodofDeliveryTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(routeandMethodofDelivery, context) }),
             new Object [] { routeandMethodofDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRouteandMethodofDeliveryClassCode(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRouteandMethodofDeliveryClassCode(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ROUTEAND_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateRouteandMethodofDeliveryClassCode(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRouteandMethodofDeliveryClassCode(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ROUTEAND_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param routeandMethodofDelivery The receiving '<em><b>Routeand Methodof Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRouteandMethodofDeliveryClassCode(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ROUTEAND_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ROUTEAND_METHODOF_DELIVERY);
      try
      {
        VALIDATE_ROUTEAND_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ROUTEAND_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ROUTEAND_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(routeandMethodofDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ROUTEAND_METHODOF_DELIVERY__ROUTEAND_METHODOF_DELIVERY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RouteandMethodofDeliveryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(routeandMethodofDelivery, context) }),
             new Object [] { routeandMethodofDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRouteandMethodofDeliveryCode(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRouteandMethodofDeliveryCode(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ROUTEAND_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateRouteandMethodofDeliveryCode(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRouteandMethodofDeliveryCode(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ROUTEAND_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param routeandMethodofDelivery The receiving '<em><b>Routeand Methodof Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRouteandMethodofDeliveryCode(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ROUTEAND_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ROUTEAND_METHODOF_DELIVERY);
      try
      {
        VALIDATE_ROUTEAND_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ROUTEAND_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ROUTEAND_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(routeandMethodofDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ROUTEAND_METHODOF_DELIVERY__ROUTEAND_METHODOF_DELIVERY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RouteandMethodofDeliveryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(routeandMethodofDelivery, context) }),
             new Object [] { routeandMethodofDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRouteandMethodofDeliveryMoodCode(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRouteandMethodofDeliveryMoodCode(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ROUTEAND_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateRouteandMethodofDeliveryMoodCode(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRouteandMethodofDeliveryMoodCode(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ROUTEAND_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param routeandMethodofDelivery The receiving '<em><b>Routeand Methodof Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRouteandMethodofDeliveryMoodCode(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ROUTEAND_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ROUTEAND_METHODOF_DELIVERY);
      try
      {
        VALIDATE_ROUTEAND_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ROUTEAND_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ROUTEAND_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(routeandMethodofDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ROUTEAND_METHODOF_DELIVERY__ROUTEAND_METHODOF_DELIVERY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RouteandMethodofDeliveryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(routeandMethodofDelivery, context) }),
             new Object [] { routeandMethodofDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRouteandMethodofDeliveryValue(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRouteandMethodofDeliveryValue(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ROUTEAND_METHODOF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateRouteandMethodofDeliveryValue(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRouteandMethodofDeliveryValue(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ROUTEAND_METHODOF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))
   * @param routeandMethodofDelivery The receiving '<em><b>Routeand Methodof Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRouteandMethodofDeliveryValue(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ROUTEAND_METHODOF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ROUTEAND_METHODOF_DELIVERY);
      try
      {
        VALIDATE_ROUTEAND_METHODOF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ROUTEAND_METHODOF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ROUTEAND_METHODOF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(routeandMethodofDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ROUTEAND_METHODOF_DELIVERY__ROUTEAND_METHODOF_DELIVERY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RouteandMethodofDeliveryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(routeandMethodofDelivery, context) }),
             new Object [] { routeandMethodofDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRouteandMethodofDeliveryEntryRelationship(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Entry Relationship</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRouteandMethodofDeliveryEntryRelationship(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ROUTEAND_METHODOF_DELIVERY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateRouteandMethodofDeliveryEntryRelationship(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Routeand Methodof Delivery Entry Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRouteandMethodofDeliveryEntryRelationship(RouteandMethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ROUTEAND_METHODOF_DELIVERY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param routeandMethodofDelivery The receiving '<em><b>Routeand Methodof Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRouteandMethodofDeliveryEntryRelationship(RouteandMethodofDelivery routeandMethodofDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ROUTEAND_METHODOF_DELIVERY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ROUTEAND_METHODOF_DELIVERY);
      try
      {
        VALIDATE_ROUTEAND_METHODOF_DELIVERY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ROUTEAND_METHODOF_DELIVERY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ROUTEAND_METHODOF_DELIVERY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(routeandMethodofDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ROUTEAND_METHODOF_DELIVERY__ROUTEAND_METHODOF_DELIVERY_ENTRY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RouteandMethodofDeliveryEntryRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(routeandMethodofDelivery, context) }),
             new Object [] { routeandMethodofDelivery }));
      }
       
      return false;
    }
    return true;
  }

} // RouteandMethodofDeliveryOperations