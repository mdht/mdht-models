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

import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Characteristicof Laborand Delivery</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacteristicofLaborandDeliveryOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharacteristicofLaborandDeliveryOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicofLaborandDeliveryTemplateId(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryTemplateId(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.18')";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicofLaborandDeliveryTemplateId(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryTemplateId(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param characteristicofLaborandDelivery The receiving '<em><b>Characteristicof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicofLaborandDeliveryTemplateId(CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicofLaborandDeliveryTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicofLaborandDelivery, context) }),
             new Object [] { characteristicofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicofLaborandDeliveryClassCode(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryClassCode(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicofLaborandDeliveryClassCode(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryClassCode(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param characteristicofLaborandDelivery The receiving '<em><b>Characteristicof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicofLaborandDeliveryClassCode(CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicofLaborandDeliveryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicofLaborandDelivery, context) }),
             new Object [] { characteristicofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicofLaborandDeliveryMoodCode(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryMoodCode(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicofLaborandDeliveryMoodCode(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryMoodCode(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param characteristicofLaborandDelivery The receiving '<em><b>Characteristicof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicofLaborandDeliveryMoodCode(CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicofLaborandDeliveryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicofLaborandDelivery, context) }),
             new Object [] { characteristicofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicofLaborandDeliveryCodeP(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryCodeP(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicofLaborandDeliveryCodeP(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryCodeP(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param characteristicofLaborandDelivery The receiving '<em><b>Characteristicof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicofLaborandDeliveryCodeP(CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicofLaborandDeliveryCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicofLaborandDelivery, context) }),
             new Object [] { characteristicofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicofLaborandDeliveryCode(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryCode(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '73813-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicofLaborandDeliveryCode(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryCode(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param characteristicofLaborandDelivery The receiving '<em><b>Characteristicof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicofLaborandDeliveryCode(CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicofLaborandDeliveryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicofLaborandDelivery, context) }),
             new Object [] { characteristicofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicofLaborandDeliveryCodeVS(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Code VS</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryCodeVS(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '236958009' or value.code = '237001001' or value.code = '15028002' or value.code = '634621000124113' or value.code = '634771000124114' or value.code = '11612004' or value.code = '249135009' or value.code = '130955003' or value.code = '231064003' or value.code = '260413007'))";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicofLaborandDeliveryCodeVS(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Code VS</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryCodeVS(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param characteristicofLaborandDelivery The receiving '<em><b>Characteristicof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicofLaborandDeliveryCodeVS(CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_CODE_VS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicofLaborandDeliveryCodeVS", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicofLaborandDelivery, context) }),
             new Object [] { characteristicofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicofLaborandDeliveryValue(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryValue(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '236958009' or value.code = '237001001' or value.code = '15028002' or value.code = '634621000124113' or value.code = '634771000124114' or value.code = '11612004' or value.code = '249135009' or value.code = '130955003' or value.code = '231064003' or value.code = '260413007')))";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicofLaborandDeliveryValue(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryValue(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param characteristicofLaborandDelivery The receiving '<em><b>Characteristicof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicofLaborandDeliveryValue(CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicofLaborandDeliveryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicofLaborandDelivery, context) }),
             new Object [] { characteristicofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCharacteristicofLaborandDeliveryValueP(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryValueP(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateCharacteristicofLaborandDeliveryValueP(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCharacteristicofLaborandDeliveryValueP(CharacteristicofLaborandDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param characteristicofLaborandDelivery The receiving '<em><b>Characteristicof Laborand Delivery</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCharacteristicofLaborandDeliveryValueP(CharacteristicofLaborandDelivery characteristicofLaborandDelivery, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CHARACTERISTICOF_LABORAND_DELIVERY);
      try
      {
        VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(characteristicofLaborandDelivery))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CHARACTERISTICOF_LABORAND_DELIVERY__CHARACTERISTICOF_LABORAND_DELIVERY_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CharacteristicofLaborandDeliveryValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(characteristicofLaborandDelivery, context) }),
             new Object [] { characteristicofLaborandDelivery }));
      }
       
      return false;
    }
    return true;
  }

} // CharacteristicofLaborandDeliveryOperations