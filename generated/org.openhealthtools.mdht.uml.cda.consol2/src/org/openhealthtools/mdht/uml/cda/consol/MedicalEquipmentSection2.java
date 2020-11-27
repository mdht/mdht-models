/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medical Equipment Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicalEquipmentSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicalEquipmentSection2TemplateId MedicalEquipmentSectionCode MedicalEquipmentSectionCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.23' templateId.extension='2014-06-09' constraints.validation.dependOn.MedicalEquipmentSectionCode='MedicalEquipmentSectionCodeP' constraints.validation.warning='MedicalEquipmentSectionNonMedicinalSupplyActivity MedicalEquipmentSection2ProcedureActivityProcedure2' constraints.validation.info='MedicalEquipmentSection2MedicalEquipmentOrganizer'"
 *        annotation="duplicates"
 * @generated
 */
public interface MedicalEquipmentSection2 extends MedicalEquipmentSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.23\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMedicalEquipmentSection2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::MedicalEquipmentOrganizer))'"
	 * @generated
	 */
	boolean validateMedicalEquipmentSection2MedicalEquipmentOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::ProcedureActivityProcedure2))'"
	 * @generated
	 */
	boolean validateMedicalEquipmentSection2ProcedureActivityProcedure2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()-&gt;select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2)).oclAsType(consol::NonMedicinalSupplyActivity2)'"
	 * @generated
	 */
	EList<NonMedicinalSupplyActivity2> getConsolNonMedicinalSupplyActivity2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()-&gt;select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::MedicalEquipmentOrganizer)).oclAsType(consol::MedicalEquipmentOrganizer)'"
	 * @generated
	 */
	EList<MedicalEquipmentOrganizer> getMedicalEquipmentOrganizers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()-&gt;select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)).oclAsType(consol::ProcedureActivityProcedure2)'"
	 * @generated
	 */
	EList<ProcedureActivityProcedure2> getProcedureActivityProcedure2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicalEquipmentSection2
