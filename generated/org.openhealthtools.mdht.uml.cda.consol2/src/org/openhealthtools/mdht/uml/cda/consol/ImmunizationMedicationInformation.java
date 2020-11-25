/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.ManufacturedProduct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Medication Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getImmunizationMedicationInformation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ImmunizationMedicationInformationTemplateId ImmunizationMedicationInformationClassCode ImmunizationMedicationInformationManufacturedMaterial ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode' templateId.root='2.16.840.1.113883.10.20.22.4.54' classCode='MANU' constraints.validation.info='ImmunizationMedicationInformationId ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation' constraints.validation.warning='ImmunizationMedicationInformationManufacturerOrganization ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText' constraints.validation.query='ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterial constraints.validation.warning='ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText' constraints.validation.info='ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation' code.codeSystem='2.16.840.1.113883.12.292' code.codeSystemName='Vaccines administered (CVX)' constraints.validation.error='ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode'"
 * @generated
 */
public interface ImmunizationMedicationInformation extends ManufacturedProduct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.54\')'"
	 * @generated
	 */
	boolean validateImmunizationMedicationInformationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\') and self.classCode=vocab::RoleClassManufacturedProduct::MANU'"
	 * @generated
	 */
	boolean validateImmunizationMedicationInformationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id-&gt;isEmpty() or self.id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.id-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validateImmunizationMedicationInformationId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturerOrganization-&gt;one(manufacturerOrganization : cda::Organization | not manufacturerOrganization.oclIsUndefined() and manufacturerOrganization.oclIsKindOf(rim::Entity))'"
	 * @generated
	 */
	boolean validateImmunizationMedicationInformationManufacturerOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial-&gt;one(manufacturedMaterial : cda::Material | not manufacturedMaterial.oclIsUndefined() and manufacturedMaterial.oclIsKindOf(cda::Material))'"
	 * @generated
	 */
	boolean validateImmunizationMedicationInformationManufacturedMaterial(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial-&gt;excluding(null)-&gt;reject(code.originalText-&gt;size() = 1)'"
	 * @generated
	 */
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial-&gt;excluding(null)-&gt;reject(code.originalText-&gt;size() = 1 implies code.originalText-&gt;one(reference-&gt;size() = 1))'"
	 * @generated
	 */
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial-&gt;excluding(null)-&gt;reject(code.originalText.reference-&gt;size() = 1 implies code.originalText.reference.value-&gt;size() = 1)'"
	 * @generated
	 */
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial-&gt;excluding(null)-&gt;reject(code-&gt;size() = 1 implies code.translation-&gt;size() &gt; 0)'"
	 * @generated
	 */
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.12.292\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial-&gt;excluding(null)-&gt;reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationMedicationInformation init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ImmunizationMedicationInformation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ImmunizationMedicationInformation
