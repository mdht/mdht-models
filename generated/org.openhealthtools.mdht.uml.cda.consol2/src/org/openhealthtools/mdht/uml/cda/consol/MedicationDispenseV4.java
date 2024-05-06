/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Dispense V4</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationDispenseV4()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicationDispense2TemplateId MedicationDispenseV4Code MedicationDispenseV4CodeP MedicationDispenseStatusCode MedicationDispenseStatusCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.18' templateId.extension='2023-05-01' code.codeSystem='2.16.840.1.113883.4.642.4.1313' code.codeSystemName='MedicaitonDispenseStatus' statusCode.code='completed' constraints.validation.dependOn.MedicationDispenseStatusCode='MedicationDispenseStatusCodeP'"
 *        annotation="duplicates"
 * @generated
 */
public interface MedicationDispenseV4 extends MedicationDispense2 {
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
	boolean validateMedicationDispenseV4CodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.4.642.4.1313\' and (value.code = \'preparation\' or value.code = \'in-progress\' or value.code = \'cancelled\' or value.code = \'completed\' or value.code = \'entered-in-error\' or value.code = \'stopped\' or value.code = \'declined\' or value.code = \'unknown\'))'"
	 * @generated
	 */
	boolean validateMedicationDispenseV4Code(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseV4 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseV4 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicationDispenseV4
