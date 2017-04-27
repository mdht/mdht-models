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
 * A representation of the model object '<em><b>Medication Supply Order2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationSupplyOrder2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicationSupplyOrderTemplateId MedicationSupplyOrderContainsMedicationOrImmunization MedicationSupplyOrderInstructionInversionInd MedicationSupplyOrderStatusCode MedicationSupplyOrderStatusCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.17' templateId.extension='2014-06-09' constraints.validation.info='MedicationSupplyOrder2ContainsMedicationInformation2 MedicationSupplyOrder2ContainsImmunizationMedicationInformation2 MedicationSupplyOrderInstructions' constraints.validation.dependOn.MedicationSupplyOrderStatusCode='MedicationSupplyOrderStatusCodeP' constraints.validation.warning='MedicationSupplyOrderRepeatNumber'"
 * @generated
 */
public interface MedicationSupplyOrder2 extends MedicationSupplyOrder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.product.manufacturedProduct.oclIsTypeOf(consol::MedicationInformation2)'"
	 * @generated
	 */
	boolean validateMedicationSupplyOrder2ContainsMedicationInformation2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.product.manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation2)'"
	 * @generated
	 */
	boolean validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMedicationSupplyOrderStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2))->asSequence()->any(true).oclAsType(consol::Instruction2)'"
	 * @generated
	 */
	Instruction2 getConsolInstruction2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSupplyOrder2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSupplyOrder2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicationSupplyOrder2
