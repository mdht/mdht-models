/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Roleingredient Substance Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Roleingredient Substance Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Roleingredient Substance Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Roleingredient Substance Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialingredientRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialingredientRoleAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Role Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialLotNumberText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Lot Number Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsumableMaterialOperations extends org.eclipse.mdht.uml.cda.operations.ConsumableOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};


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
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.26')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialTemplateId(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialTemplateId(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialTemplateId(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
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
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialTypeCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
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
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedication(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedication", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
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
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..representedOrganization->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClassManufacturedMaterial::ORG)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
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
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..representedOrganization->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminerDetermined::KIND)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Determiner Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
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
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
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
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = code.oclAsType(datatypes::CE) in "+
"value.codeSystem = 'unknown'))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
						 new Object [] { consumableMaterial }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCodeP(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCodeP(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCodeP(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCodeP(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCodeP(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialasSpecializedKindCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
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
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Material)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
						 new Object [] { consumableMaterial }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Roleingredient Substance Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..assignedPerson->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClassRoot::MMAT)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Roleingredient Substance Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
						 new Object [] { consumableMaterial }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Roleingredient Substance Determiner Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..assignedPerson->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::INSTANCE)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Roleingredient Substance Determiner Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_DETERMINER_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
						 new Object [] { consumableMaterial }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Roleingredient Substance Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..assignedPerson->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = code.oclAsType(datatypes::CE) in "+
"value.codeSystem = 'unknown'))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Roleingredient Substance Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
						 new Object [] { consumableMaterial }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Roleingredient Substance Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..assignedPerson->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Roleingredient Substance Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLEINGREDIENT_SUBSTANCE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
						 new Object [] { consumableMaterial }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialingredientRoleClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialingredientRoleClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialingredientRoleClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialingredientRoleClassCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleClassCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialingredientRoleClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
						 new Object [] { consumableMaterial }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialingredientRoleAssignedPerson(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Role Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialingredientRoleAssignedPerson(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialingredientRoleAssignedPerson(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialingredient Role Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialingredientRoleAssignedPerson(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleAssignedPerson(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALINGREDIENT_ROLE_ASSIGNED_PERSON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialingredientRoleAssignedPerson", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
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
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialClassCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
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
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = code.oclAsType(datatypes::CE) in "+
"value.codeSystem = 'locally defined' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialCode(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
						 new Object [] { consumableMaterial }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsumableMaterialMedicationMedicationMaterialCodeP(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialCodeP(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsumableMaterialMedicationMedicationMaterialCodeP(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsumableMaterialMedicationMedicationMaterialCodeP(ConsumableMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialCodeP(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
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
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationMedicationMaterialLotNumberText(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationMedicationMaterialLotNumberText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
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
	
	protected static ThreadLocal<  Constraint> VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

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
	
	public static  boolean validateConsumableMaterialMedicationClassCode(ConsumableMaterial consumableMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONSUMABLE_MATERIAL);
			try {
				VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consumableMaterial)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONSUMABLE_MATERIAL__CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConsumableMaterialConsumableMaterialMedicationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consumableMaterial, context) }),
						 new Object [] { consumableMaterial }));
			}
			 
			return false;
		}
		return true;
	}

} // ConsumableMaterialOperations