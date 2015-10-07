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
 * A representation of the model object '<em><b>Immunization Medication Information2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getImmunizationMedicationInformation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ImmunizationMedicationInformationTemplateId ImmunizationMedicationInformationManufacturedMaterial ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText' templateId.root='2.16.840.1.113883.10.20.22.4.54' templateId.extension='2014-06-09' constraints.validation.info='ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation' constraints.validation.query='ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText' constraints.validation.dependOn.ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation='ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP' constraints.validation.dependOn.ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode='ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterial constraints.validation.info='ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation ImmunizationMedicationInformationManufacturedMaterialImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP ImmunizationMedicationInformationManufacturedMaterialImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation' code.codeSystemName='' constraints.validation.error='ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText' constraints.validation.dependOn.ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode='ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP' constraints.validation.query='ImmunizationMedicationInformationManufacturedMaterialImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP ImmunizationMedicationInformationManufacturedMaterialImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation' constraints.validation.dependOn.ImmunizationMedicationInformationManufacturedMaterialImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation='ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCE constraints.validation.info='ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP' constraints.validation.dependOn.ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation='ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP'"
 * @generated
 */
public interface ImmunizationMedicationInformation2 extends ImmunizationMedicationInformation {
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
	boolean validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())) )))'"
	 * @generated
	 */
	boolean validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation(
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
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(
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
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationMedicationInformation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationMedicationInformation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ImmunizationMedicationInformation2
