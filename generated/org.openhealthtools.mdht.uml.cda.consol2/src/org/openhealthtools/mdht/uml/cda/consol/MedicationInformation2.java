/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Information2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationInformation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicationInformation2TemplateId MedicationInformationManufacturedMaterial MedicationInformationMedicationInformationManufacturedMaterialCodeP MedicationInformationMedicationInformationManufacturedMaterialCode' templateId.root='2.16.840.1.113883.10.20.22.4.23' templateId.extension='2014-06-09' constraints.validation.info='MedicationInformation2MedicationInformationManufacturedMaterialCETranslation MedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText MedicationInformationMedicationInformationManufacturedMaterialCodeTranslation MedicationInformationMedicationInformationManufacturedMaterialReference MedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue MedicationInformationMedicationInformationManufacturedMaterialReferenceValue' constraints.validation.query='MedicationInformation2MedicationInformationManufacturedMaterialCETranslation MedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText MedicationInformationMedicationInformationManufacturedMaterialCodeTranslation MedicationInformationMedicationInformationManufacturedMaterialReference MedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue MedicationInformationMedicationInformationManufacturedMaterialReferenceValue MedicationInformationMedicationInformationManufacturedMaterialCodeP MedicationInformationMedicationInformationManufacturedMaterialCode' constraints.validation.dependOn.MedicationInformationMedicationInformationManufacturedMaterialCode='MedicationInformationMedicationInformationManufacturedMaterialCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationInformation2MedicationInformationManufacturedMaterial constraints.validation.info='MedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText MedicationInformationMedicationInformationManufacturedMaterialCodeTranslation MedicationInformationMedicationInformationManufacturedMaterialReference MedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue MedicationInformationMedicationInformationManufacturedMaterialReferenceValue MedicationInformationManufacturedMaterialMedicationInformation2MedicationInformationManufacturedMaterialCETranslation' code.codeSystem='2.16.840.1.113883.6.88' code.codeSystemName='RxNorm' constraints.validation.error='MedicationInformationMedicationInformationManufacturedMaterialCode MedicationInformationMedicationInformationManufacturedMaterialCodeP' constraints.validation.dependOn.MedicationInformationMedicationInformationManufacturedMaterialCode='MedicationInformationMedicationInformationManufacturedMaterialCodeP' constraints.validation.query='MedicationInformationManufacturedMaterialMedicationInformation2MedicationInformationManufacturedMaterialCETranslation'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.23\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMedicationInformation2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial-&gt;excluding(null).code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((translation-&gt;isEmpty() or translation-&gt;exists(element | element.isNullFlavorUndefined())) implies (not translation-&gt;isEmpty()) )))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial-&gt;excluding(null)-&gt;reject(true)'"
	 * @generated
	 */
	boolean validateMedicationInformationMedicationInformationManufacturedMaterialReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateMedicationInformationMedicationInformationManufacturedMaterialCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationInformation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationInformation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicationInformation2
