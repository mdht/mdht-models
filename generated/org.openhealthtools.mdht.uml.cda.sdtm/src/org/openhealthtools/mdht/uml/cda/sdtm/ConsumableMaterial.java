/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Consumable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumable Material</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getConsumableMaterial()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.23.58' constraints.validation.error='Consumable MaterialTemplateId Consumable MaterialTypeCode Consumable MaterialMedication Consumable MaterialMedicationMedicationMaterialClassCode Consumable MaterialMedicationMedicationMaterialCode Consumable MaterialMedicationClassCode Consumable MaterialMedicationMedicationMaterialClassCodeConsumable MaterialMedicationMedicationMaterialClassCode1 Consumable MaterialMedicationMedicationMaterialCodeConsumable MaterialMedicationMedicationMaterialCode1' typeCode='CSM' constraints.validation.query='Consumable MaterialMedicationMedicationMaterialClassCode Consumable MaterialMedicationMedicationMaterialCode Consumable MaterialMedicationMedicationMaterialLotNumberText Consumable MaterialMedicationClassCode Consumable MaterialMedicationMedicationMaterialClassCodeConsumable MaterialMedicationMedicationMaterialClassCode1 Consumable MaterialMedicationMedicationMaterialCodeConsumable MaterialMedicationMedicationMaterialCode1 Consumable MaterialMedicationMedicationMaterialLotNumberTextConsumable MaterialMedicationMedicationMaterialLotNumberText1' constraints.validation.info='Consumable MaterialMedicationMedicationMaterialLotNumberText Consumable MaterialMedicationMedicationMaterialLotNumberTextConsumable MaterialMedicationMedicationMaterialLotNumberText1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConsumableMaterialMedication constraints.validation.error='MedicationClassCode MedicationMedicationMaterialClassCode MedicationMedicationMaterialCode' classCode='MANU' constraints.validation.query='MedicationMedicationMaterialClassCode MedicationMedicationMaterialCode MedicationMedicationMaterialLotNumberText' constraints.validation.info='MedicationMedicationMaterialLotNumberText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConsumableMaterialMedicationMedicationMaterial constraints.validation.error='MedicationMaterialClassCode MedicationMaterialCode' determinerCode='KIND' classCode='MMAT' constraints.validation.info='MedicationMaterialLotNumberText'"
 * @generated
 */
public interface ConsumableMaterial extends Consumable
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.58')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.58\')'"
   * @generated
   */
  boolean validateConsumableMaterialTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.typeCode=vocab::ParticipationType::CSM
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeCode=vocab::ParticipationType::CSM'"
   * @generated
   */
  boolean validateConsumableMaterialTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(cda::ManufacturedProduct))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(cda::ManufacturedProduct))'"
   * @generated
   */
  boolean validateConsumableMaterialMedication(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClassManufacturedMaterial::MMAT)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClassManufacturedMaterial::MMAT)'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationMedicationMaterialClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationMedicationMaterialCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined()))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined()))'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationMedicationMaterialLotNumberText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassManufacturedProduct::MANU)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::RoleClassManufacturedProduct::MANU)'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null)->reject(manufacturedMaterial->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClassManufacturedMaterial::MMAT))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null)->reject(manufacturedMaterial->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClassManufacturedMaterial::MMAT))'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationMedicationMaterialClassCodeConsumableMaterialMedicationMedicationMaterialClassCode1(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null)->reject(manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null)->reject(manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationMedicationMaterialCodeConsumableMaterialMedicationMedicationMaterialCode1(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.manufacturedProduct->excluding(null)->reject(manufacturedMaterial->excluding(null)->reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined())))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null)->reject(manufacturedMaterial->excluding(null)->reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined())))'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationMedicationMaterialLotNumberTextConsumableMaterialMedicationMedicationMaterialLotNumberText1(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsumableMaterial init();
} // ConsumableMaterial
