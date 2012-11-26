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

import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicsofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Characteristicsof Laborand Delivery</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicsofLaborandDelivery#validateCharacteristicsofLaborandDeliveryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicsofLaborandDelivery#validateCharacteristicsofLaborandDeliveryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicsofLaborandDelivery#validateCharacteristicsofLaborandDeliveryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicsofLaborandDelivery#validateCharacteristicsofLaborandDeliveryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicsofLaborandDelivery#validateCharacteristicsofLaborandDeliveryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacteristicsofLaborandDeliveryOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharacteristicsofLaborandDeliveryOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicsofLaborandDeliveryTemplateId(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicsofLaborandDeliveryTemplateId(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.15')";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicsofLaborandDeliveryTemplateId(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicsofLaborandDeliveryTemplateId(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.15')
   * @param characteristicsofLaborandDelivery The receiving '<em><b>Characteristicsof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicsofLaborandDeliveryTemplateId(CharacteristicsofLaborandDelivery characteristicsofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICSOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicsofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICSOF_LABORAND_DELIVERY__CHARACTERISTICSOF_LABORAND_DELIVERY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicsofLaborandDeliveryTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicsofLaborandDelivery, context) }),
             new Object [] { characteristicsofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicsofLaborandDeliveryClassCode(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicsofLaborandDeliveryClassCode(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicsofLaborandDeliveryClassCode(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicsofLaborandDeliveryClassCode(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param characteristicsofLaborandDelivery The receiving '<em><b>Characteristicsof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicsofLaborandDeliveryClassCode(CharacteristicsofLaborandDelivery characteristicsofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICSOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicsofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICSOF_LABORAND_DELIVERY__CHARACTERISTICSOF_LABORAND_DELIVERY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicsofLaborandDeliveryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicsofLaborandDelivery, context) }),
             new Object [] { characteristicsofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicsofLaborandDeliveryCode(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicsofLaborandDeliveryCode(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicsofLaborandDeliveryCode(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicsofLaborandDeliveryCode(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param characteristicsofLaborandDelivery The receiving '<em><b>Characteristicsof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicsofLaborandDeliveryCode(CharacteristicsofLaborandDelivery characteristicsofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICSOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicsofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICSOF_LABORAND_DELIVERY__CHARACTERISTICSOF_LABORAND_DELIVERY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicsofLaborandDeliveryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicsofLaborandDelivery, context) }),
             new Object [] { characteristicsofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicsofLaborandDeliveryMoodCode(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicsofLaborandDeliveryMoodCode(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicsofLaborandDeliveryMoodCode(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicsofLaborandDeliveryMoodCode(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param characteristicsofLaborandDelivery The receiving '<em><b>Characteristicsof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicsofLaborandDeliveryMoodCode(CharacteristicsofLaborandDelivery characteristicsofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICSOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicsofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICSOF_LABORAND_DELIVERY__CHARACTERISTICSOF_LABORAND_DELIVERY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicsofLaborandDeliveryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicsofLaborandDelivery, context) }),
             new Object [] { characteristicsofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicsofLaborandDeliveryValue(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicsofLaborandDeliveryValue(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicsofLaborandDeliveryValue(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicsof Laborand Delivery Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicsofLaborandDeliveryValue(CharacteristicsofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param characteristicsofLaborandDelivery The receiving '<em><b>Characteristicsof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicsofLaborandDeliveryValue(CharacteristicsofLaborandDelivery characteristicsofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICSOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICSOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicsofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICSOF_LABORAND_DELIVERY__CHARACTERISTICSOF_LABORAND_DELIVERY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicsofLaborandDeliveryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicsofLaborandDelivery, context) }),
             new Object [] { characteristicsofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

} // CharacteristicsofLaborandDeliveryOperations