/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.SubstanceAdministration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Free Text Sig</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationFreeTextSig()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicationFreeTextSigTemplateId MedicationFreeTextSigTextReferenceValue MedicationFreeTextSigClassCode MedicationFreeTextSigMoodCode MedicationFreeTextSigCode MedicationFreeTextSigCodeP MedicationFreeTextSigText MedicationFreeTextSigConsumable MedicationFreeTextSigEDReference MedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor MedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug MedicationFreeTextSigConsumableManufacturedProduct' templateId.root='2.16.840.1.113883.10.20.22.4.147' classCode='SBADM' code.code='76662-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Instructions Medication' constraints.validation.warning='MedicationFreeTextSigEDTELValue' constraints.validation.query='MedicationFreeTextSigEDTELValue MedicationFreeTextSigEDReference MedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor MedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug MedicationFreeTextSigConsumableManufacturedProduct'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationFreeTextSigED constraints.validation.error='MedicationFreeTextSigEDReference' constraints.validation.warning='EDMedicationFreeTextSigEDTELValue' constraints.validation.query='EDMedicationFreeTextSigEDTELValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationFreeTextSigEDTEL constraints.validation.warning='MedicationFreeTextSigEDTELValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationFreeTextSigConsumable constraints.validation.error='MedicationFreeTextSigConsumableManufacturedProduct'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationFreeTextSigConsumableManufacturedProduct constraints.validation.error='MedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug nullFlavor='NA' constraints.validation.error='MedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor'"
 * @generated
 */
public interface MedicationFreeTextSig extends SubstanceAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.147\')'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClass::SBADM'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentSubstanceMood) and \r\nlet value : vocab::x_DocumentSubstanceMood = self.moodCode.oclAsType(vocab::x_DocumentSubstanceMood) in \r\nvalue = vocab::x_DocumentSubstanceMood::EVN or value = vocab::x_DocumentSubstanceMood::INT'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'76662-6\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable-&gt;one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigConsumable(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.text-&gt;excluding(null)-&gt;select(isNullFlavorUndefined()).reference-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (not value.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigEDTELValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.text-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((reference.oclIsUndefined() or reference.isNullFlavorUndefined()) implies (not reference.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigEDReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable-&gt;excluding(null).manufacturedProduct-&gt;excluding(null).manufacturedLabeledDrug-&gt;excluding(null)-&gt;reject(isDefined(\'nullFlavor\'))'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable-&gt;excluding(null).manufacturedProduct-&gt;excluding(null)-&gt;reject(manufacturedLabeledDrug-&gt;one(manufacturedLabeledDrug : cda::LabeledDrug | not manufacturedLabeledDrug.oclIsUndefined() and manufacturedLabeledDrug.oclIsKindOf(cda::LabeledDrug)))'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable-&gt;excluding(null)-&gt;reject(manufacturedProduct-&gt;one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(cda::ManufacturedProduct)))'"
	 * @generated
	 */
	boolean validateMedicationFreeTextSigConsumableManufacturedProduct(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationFreeTextSig init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationFreeTextSig init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicationFreeTextSig
