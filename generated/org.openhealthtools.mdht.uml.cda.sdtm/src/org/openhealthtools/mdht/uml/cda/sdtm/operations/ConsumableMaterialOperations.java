/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ConsumableOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consumable Material</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialLotNumberText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Lot Number Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialClassCodeConsumableMaterialMedicationMedicationMaterialClassCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Class Code Consumable Material Medication Medication Material Class Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialCodeConsumableMaterialMedicationMedicationMaterialCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code Consumable Material Medication Medication Material Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialLotNumberTextConsumableMaterialMedicationMedicationMaterialLotNumberText1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Lot Number Text Consumable Material Medication Medication Material Lot Number Text1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsumableMaterialOperations extends ConsumableOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConsumableMaterialOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialTemplateId(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialTemplateId(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.58')";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialTemplateId(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialTemplateId(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.58')
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialTemplateId(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialTypeCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialTypeCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::ParticipationType::CSM";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialTypeCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialTypeCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.typeCode=vocab::ParticipationType::CSM
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialTypeCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CONSUMABLE_MATERIAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedication(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedication(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(cda::ManufacturedProduct))";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedication(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedication(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(cda::ManufacturedProduct))
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedication(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedication", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClassManufacturedMaterial::MMAT)";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClassManufacturedMaterial::MMAT)
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationMedicationMaterialClassCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationMedicationMaterialClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationMedicationMaterialCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationMedicationMaterialCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialLotNumberText(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Lot Number Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialLotNumberText(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialLotNumberText(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Lot Number Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialLotNumberText(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined()))
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationMedicationMaterialLotNumberText(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationMedicationMaterialLotNumberText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassManufacturedProduct::MANU)";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassManufacturedProduct::MANU)
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationClassCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialClassCodeConsumableMaterialMedicationMedicationMaterialClassCode1(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Class Code Consumable Material Medication Medication Material Class Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialClassCodeConsumableMaterialMedicationMedicationMaterialClassCode1(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null)->reject(manufacturedMaterial->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClassManufacturedMaterial::MMAT))";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialClassCodeConsumableMaterialMedicationMedicationMaterialClassCode1(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Class Code Consumable Material Medication Medication Material Class Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialClassCodeConsumableMaterialMedicationMedicationMaterialClassCode1(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null)->reject(manufacturedMaterial->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClassManufacturedMaterial::MMAT))
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationMedicationMaterialClassCodeConsumableMaterialMedicationMedicationMaterialClassCode1(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationMedicationMaterialClassCodeConsumableMaterialMedicationMedicationMaterialClassCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialCodeConsumableMaterialMedicationMedicationMaterialCode1(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code Consumable Material Medication Medication Material Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialCodeConsumableMaterialMedicationMedicationMaterialCode1(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null)->reject(manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialCodeConsumableMaterialMedicationMedicationMaterialCode1(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code Consumable Material Medication Medication Material Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialCodeConsumableMaterialMedicationMedicationMaterialCode1(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null)->reject(manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationMedicationMaterialCodeConsumableMaterialMedicationMedicationMaterialCode1(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationMedicationMaterialCodeConsumableMaterialMedicationMedicationMaterialCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialLotNumberTextConsumableMaterialMedicationMedicationMaterialLotNumberText1(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Lot Number Text Consumable Material Medication Medication Material Lot Number Text1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialLotNumberTextConsumableMaterialMedicationMedicationMaterialLotNumberText1(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null)->reject(manufacturedMaterial->excluding(null)->reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined())))";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialLotNumberTextConsumableMaterialMedicationMedicationMaterialLotNumberText1(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Lot Number Text Consumable Material Medication Medication Material Lot Number Text1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialLotNumberTextConsumableMaterialMedicationMedicationMaterialLotNumberText1(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null)->reject(manufacturedMaterial->excluding(null)->reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined())))
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationMedicationMaterialLotNumberTextConsumableMaterialMedicationMedicationMaterialLotNumberText1(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationMedicationMaterialLotNumberTextConsumableMaterialMedicationMedicationMaterialLotNumberText1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
      return false;
    }
    return true;
  }

} // ConsumableMaterialOperations