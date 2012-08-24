/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Consumable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumable Material</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getConsumableMaterial()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Consumable MaterialTemplateId Consumable MaterialTypeCode Consumable MaterialMedication Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName Consumable MaterialMedicationMedicationMaterialasSpecializedKindClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization Consumable MaterialMedicationMedicationMaterialClassCode Consumable MaterialMedicationMedicationMaterialCode Consumable MaterialMedicationClassCode' templateId.root='2.16.840.1.113883.10.20.23.58' typeCode='CSM' constraints.validation.query='Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName Consumable MaterialMedicationMedicationMaterialasSpecializedKindClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization Consumable MaterialMedicationMedicationMaterialClassCode Consumable MaterialMedicationMedicationMaterialCode Consumable MaterialMedicationMedicationMaterialLotNumberText Consumable MaterialMedicationClassCode' constraints.validation.info='Consumable MaterialMedicationMedicationMaterialLotNumberText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConsumableMaterialMedication classCode='MANU' constraints.validation.error='MedicationClassCode MedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode MedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode MedicationMedicationMaterialasSpecializedKindsubstanceClassName MedicationMedicationMaterialasSpecializedKindClassCode MedicationMedicationMaterialasSpecializedKindCode MedicationMedicationMaterialasSpecializedKindRepresentedOrganization MedicationMedicationMaterialClassCode MedicationMedicationMaterialCode' constraints.validation.query='MedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode MedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode MedicationMedicationMaterialasSpecializedKindsubstanceClassName MedicationMedicationMaterialasSpecializedKindClassCode MedicationMedicationMaterialasSpecializedKindCode MedicationMedicationMaterialasSpecializedKindRepresentedOrganization MedicationMedicationMaterialClassCode MedicationMedicationMaterialCode MedicationMedicationMaterialLotNumberText' constraints.validation.info='MedicationMedicationMaterialLotNumberText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConsumableMaterialMedicationMedicationMaterial classCode='MMAT' constraints.validation.error='MedicationMaterialClassCode MedicationMaterialCode' determinerCode='KIND' constraints.validation.info='MedicationMaterialLotNumberText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConsumableMaterialMedicationMedicationMaterialasSpecializedKind classCode='ASSIGNED' constraints.validation.error='asSpecializedKindClassCode asSpecializedKindCode asSpecializedKindRepresentedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClass classCode='ORG' constraints.validation.error='substanceClassClassCode substanceClassDeterminerCode substanceClassName' determinerCode='KIND'"
 * @generated
 */
public interface ConsumableMaterial extends Consumable
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
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
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..representedOrganization->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClassOrganization::ORG)'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..representedOrganization->excluding(null)->reject(isDefined(\'determinerCode\') and determinerCode=vocab::EntityDeterminer::KIND)'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject(isDefined(\'classCode\') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))'"
   * @generated
   */
  boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
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
   * @generated
   */
  public ConsumableMaterial init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConsumableMaterial init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ConsumableMaterial
