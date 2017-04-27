/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumable Material</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getConsumableMaterial()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable Material'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Consumable MaterialTemplateId Consumable MaterialTypeCode Consumable MaterialMedication Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindCodeP Consumable MaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP Consumable MaterialMedicationMedicationMaterialingredientRoleClassCode Consumable MaterialMedicationMedicationMaterialingredientRoleAssignedPerson Consumable MaterialMedicationMedicationMaterialClassCode Consumable MaterialMedicationMedicationMaterialCode Consumable MaterialMedicationMedicationMaterialCodeP Consumable MaterialMedicationMedicationMaterialLotNumberText Consumable MaterialMedicationClassCode' templateId.root='2.16.840.1.113883.10.20.23.26' typeCode='CSM' constraints.validation.query='Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindCodeP Consumable MaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP Consumable MaterialMedicationMedicationMaterialingredientRoleClassCode Consumable MaterialMedicationMedicationMaterialingredientRoleAssignedPerson Consumable MaterialMedicationMedicationMaterialClassCode Consumable MaterialMedicationMedicationMaterialCode Consumable MaterialMedicationMedicationMaterialCodeP Consumable MaterialMedicationMedicationMaterialLotNumberText Consumable MaterialMedicationClassCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConsumableMaterialMedication classCode='MANU' constraints.validation.error='Consumable MaterialMedicationClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindCodeP Consumable MaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP Consumable MaterialMedicationMedicationMaterialingredientRoleClassCode Consumable MaterialMedicationMedicationMaterialingredientRoleAssignedPerson Consumable MaterialMedicationMedicationMaterialClassCode Consumable MaterialMedicationMedicationMaterialCode Consumable MaterialMedicationMedicationMaterialCodeP Consumable MaterialMedicationMedicationMaterialLotNumberText' constraints.validation.query='Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindCodeP Consumable MaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP Consumable MaterialMedicationMedicationMaterialingredientRoleClassCode Consumable MaterialMedicationMedicationMaterialingredientRoleAssignedPerson Consumable MaterialMedicationMedicationMaterialClassCode Consumable MaterialMedicationMedicationMaterialCode Consumable MaterialMedicationMedicationMaterialCodeP Consumable MaterialMedicationMedicationMaterialLotNumberText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConsumableMaterialMedicationMedicationMaterial classCode='MMAT' constraints.validation.error='Consumable MaterialMedicationMedicationMaterialClassCode Consumable MaterialMedicationMedicationMaterialCode Consumable MaterialMedicationMedicationMaterialCodeP' determinerCode='KIND' code.codeSystem='locally defined' code.codeSystemName='Medication Item Type' formCode.codeSystem='2.16.840.1.113883.3.26.1.1' formCode.codeSystemName='NCI Thesaurus' constraints.validation.info='Consumable MaterialMedicationMedicationMaterialLotNumberText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConsumableMaterialMedicationMedicationMaterialasSpecializedKind classCode='ASSIGNED' constraints.validation.error='Consumable MaterialMedicationMedicationMaterialasSpecializedKindClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindCodeP Consumable MaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode' code.codeSystem='unknown' code.codeSystemName='Medication Class Type' constraints.validation.query='Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClass classCode='ORG' constraints.validation.error='Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode' determinerCode='KIND'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConsumableMaterialMedicationMedicationMaterialingredientRole classCode='ASSIGNED' constraints.validation.error='Consumable MaterialMedicationMedicationMaterialingredientRoleClassCode Consumable MaterialMedicationMedicationMaterialingredientRoleAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstance classCode='MMAT' constraints.validation.error='Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP' determinerCode='INSTANCE' code.codeSystem='unknown' code.codeSystemName='Substance Ingredient Type'"
 * @generated
 */
public interface ConsumableMaterial extends org.eclipse.mdht.uml.cda.Consumable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.26\')'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeCode=vocab::ParticipationType::CSM'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedication'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(cda::ManufacturedProduct))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..representedOrganization->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClassManufacturedMaterial::ORG)'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..representedOrganization->excluding(null)->reject(isDefined(\'determinerCode\') and determinerCode=vocab::EntityDeterminerDetermined::KIND)'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialasSpecializedKindClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject(isDefined(\'classCode\') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialasSpecializedKindCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'unknown\'))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialasSpecializedKindCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Material)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..assignedPerson->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClassRoot::MMAT)'"
	 * @generated
	 */
	boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..assignedPerson->excluding(null)->reject(isDefined(\'determinerCode\') and determinerCode=vocab::EntityDeterminer::INSTANCE)'"
	 * @generated
	 */
	boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..assignedPerson->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'unknown\'))'"
	 * @generated
	 */
	boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)..assignedPerson->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialingredientRoleClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject(isDefined(\'classCode\'))'"
	 * @generated
	 */
	boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialingredientRoleAssignedPerson'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null).->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Entity)))'"
	 * @generated
	 */
	boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleAssignedPerson(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClassManufacturedMaterial::MMAT)'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'locally defined\' and not value.code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateConsumableMaterialMedicationMedicationMaterialCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationMedicationMaterialLotNumberText'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null).manufacturedMaterial->excluding(null)->reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consumable MaterialMedicationClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedProduct->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::RoleClassManufacturedProduct::MANU)'"
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
    public ConsumableMaterial init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // ConsumableMaterial
