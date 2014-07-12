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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialLotNumberText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Lot Number Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Class Code</em>}</li>
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
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..representedOrganization->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClassOrganization::ORG)";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Determiner Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..representedOrganization->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::KIND)";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Determiner Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Name</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Name</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_NAME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject(isDefined('classCode') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
             new Object [] { consumableMaterial }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Represented Organization</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))";

  /**
   * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Represented Organization</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param consumableMaterial The receiving '<em><b>Consumable Material</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
      try
      {
        VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consumableMaterial))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
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

} // ConsumableMaterialOperations