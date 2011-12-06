/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationInformation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.22.4.23' constraints.validation.error='MedicationInformationTemplateId MedicationInformationHasMaterial MedicationInformationHasMaterialCode MedicationInformationHasMaterialCodeOriginalText MedicationInformationCodedProductName MedicationInformationCodedProductVocab MedicationInformationCodedBrandName MedicationInformationCodedBrandNameVocab MedicationInformationFreeTextProductName MedicationInformationFreeTextBrandName MedicationInformationClassCode' constraints.validation.warning='MedicationInformationHasMaterialCodeVocab MedicationInformationShouldHaveMaterialManufacturer' classCode='MANU' constraints.validation.info='MedicationInformationHasMaterialName MedicationInformationMayHaveMaterialManufacturer MedicationInformationCodedIngredientVocab MedicationInformationId'"
 * @generated
 */
public interface MedicationInformation extends ManufacturedProduct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.manufacturedMaterial.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationInformationHasMaterial(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.code.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.manufacturedMaterial.code.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationInformationHasMaterialCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.88' or self.manufacturedMaterial.code.codeSystem='2.16.840.1.113883.6.59' or self.manufacturedMaterial.code.codeSystem='2.16.840.1.113883.6.96'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial.code.codeSystem = \'2.16.840.1.113883.6.88\' or self.manufacturedMaterial.code.codeSystem=\'2.16.840.1.113883.6.59\' or self.manufacturedMaterial.code.codeSystem=\'2.16.840.1.113883.6.96\''"
	 * @generated
	 */
	boolean validateMedicationInformationHasMaterialCodeVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.code.originalText.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.manufacturedMaterial.code.originalText.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationInformationHasMaterialCodeOriginalText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.name.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.manufacturedMaterial.name.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationInformationHasMaterialName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturerOrganization->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturerOrganization->size() = 1'"
	 * @generated
	 */
	boolean validateMedicationInformationMayHaveMaterialManufacturer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->size() > 0 implies self.manufacturerOrganization->size() > 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.id->size() > 0 implies self.manufacturerOrganization->size() > 0'"
	 * @generated
	 */
	boolean validateMedicationInformationShouldHaveMaterialManufacturer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.code.code.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.manufacturedMaterial.code.code.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationInformationCodedProductName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.88'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial.code.codeSystem = \'2.16.840.1.113883.6.88\''"
	 * @generated
	 */
	boolean validateMedicationInformationCodedProductVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.4.9'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial.code.codeSystem = \'2.16.840.1.113883.4.9\''"
	 * @generated
	 */
	boolean validateMedicationInformationCodedIngredientVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.translation->size() > 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial.code.translation->size() > 0'"
	 * @generated
	 */
	boolean validateMedicationInformationCodedBrandName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.88' or self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.69'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial.code.codeSystem = \'2.16.840.1.113883.6.88\' or self.manufacturedMaterial.code.codeSystem = \'2.16.840.1.113883.6.69\''"
	 * @generated
	 */
	boolean validateMedicationInformationCodedBrandNameVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.code.originalText.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.manufacturedMaterial.code.originalText.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationInformationFreeTextProductName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.name.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.manufacturedMaterial.name.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationInformationFreeTextBrandName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.23')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.23\')'"
	 * @generated
	 */
	boolean validateMedicationInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	 * @generated
	 */
	boolean validateMedicationInformationId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\')'"
	 * @generated
	 */
	boolean validateMedicationInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationInformation init();
} // MedicationInformation
