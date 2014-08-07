/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Information2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationInformation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicationInformationTemplateId MedicationInformationManufacturedMaterial MedicationInformation2MedicationInformationManufacturedMaterialCodeOriginalText MedicationInformation2MedicationInformationManufacturedMaterialCodeTranslation MedicationInformation2MedicationInformationManufacturedMaterialReference MedicationInformation2MedicationInformationManufacturedMaterialOriginalTextReferenceValue MedicationInformation2MedicationInformationManufacturedMaterialReferenceValue MedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCodeP MedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCode' templateId.root='2.16.840.1.113883.10.20.22.4.23.2' constraints.validation.info='MedicationInformation2MedicationInformationManufacturedMaterialCETranslation' constraints.validation.query='MedicationInformation2MedicationInformationManufacturedMaterialCETranslation MedicationInformation2MedicationInformationManufacturedMaterialCodeOriginalText MedicationInformation2MedicationInformationManufacturedMaterialCodeTranslation MedicationInformation2MedicationInformationManufacturedMaterialReference MedicationInformation2MedicationInformationManufacturedMaterialOriginalTextReferenceValue MedicationInformation2MedicationInformationManufacturedMaterialReferenceValue MedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCodeP MedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCode' constraints.validation.dependOn.MedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCode='MedicationInformationMedicationInformationManufacturedMaterialCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationInformation2MedicationInformationManufacturedMaterial code.codeSystem='2.16.840.1.113883.6.88' code.codeSystemName='RxNorm' constraints.validation.error='MedicationInformationMedicationInformationManufacturedMaterialCode MedicationInformationMedicationInformationManufacturedMaterialCodeP' constraints.validation.dependOn.MedicationInformationMedicationInformationManufacturedMaterialCode='MedicationInformationMedicationInformationManufacturedMaterialCodeP' constraints.validation.info='MedicationInformation2MedicationInformationManufacturedMaterialCETranslation' constraints.validation.query='MedicationInformation2MedicationInformationManufacturedMaterialCETranslation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationInformation2MedicationInformationManufacturedMaterialCE constraints.validation.info='MedicationInformation2MedicationInformationManufacturedMaterialCETranslation'"
 * @generated
 */
public interface MedicationInformation2 extends MedicationInformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (not translation->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateMedicationInformation2MedicationInformationManufacturedMaterialCodeOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateMedicationInformation2MedicationInformationManufacturedMaterialCodeTranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateMedicationInformation2MedicationInformationManufacturedMaterialReference(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateMedicationInformation2MedicationInformationManufacturedMaterialOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateMedicationInformation2MedicationInformationManufacturedMaterialReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateMedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.88\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateMedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationInformation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationInformation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicationInformation2
