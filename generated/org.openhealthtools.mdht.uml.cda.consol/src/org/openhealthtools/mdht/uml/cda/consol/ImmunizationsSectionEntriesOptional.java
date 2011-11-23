/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunizations Section Entries Optional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The Medications section defines a patient's current medications and pertinent medication
 *     history. At a minimum, the currently active medications should be listed, with an entire medication history as an
 *     option, particularly when the summary document is used for comprehensive data export. The section may also include a
 *     patient's prescription history, and enables the determination of the source of a medication list (e.g. from a pharmacy
 *     system vs. from the patient).
 * </p>
 * <p>Reconciliation of conflicting medication information from various sources is enabled both by indicating the source of information and by indicating whether the source is reporting intended or actual medication use. For instance, a physician may intend for a patient to be on a particular dose, but the patient may actually be taking a different dose; a pharmacy may fill a prescription for a particular dose only to then have the patient's physician lower the dose without notifying the pharmacy. Therefore, medication and supply activities can be expressed in CCD in either the "EVN" (event) mood or the "INT" (intent) mood. Medication activities in "INT" mood are not orders (which are represented in the Plan of Care section), but rather are reflections of what a clinician intends a patient to be taking. Medication activities in "EVN" mood reflect actual use. A pharmacy system will typically report what was actually filled (supply event), along with intended use (substance administration intent). A physician will often report intended use (substance administration and supply intent). A patient or family member will typically report actual use (substance administration event).</p>
 * <p>The Immunizations section defines a patient's current immunization status and pertinent immunization history. The primary use case for the Immunization section is to enable communication of a patient's immunization status. The section should include current immunization status, and may contain the entire immunization history that is relevant to the period of time being summarized.</p>
 * <p>This section is optional, however it is strongly recommended that it be present in cases of pediatric care and in other cases when such information is available.</p>
 * The immunizations section shall contain a narrative description of the immunizations administered to the patient in the
 * past. It shall include entries for medication administration as described in the Entry Content Modules.
 * <p>
 *     The Immunizations Section contains information describing the immunizations administered to the
 *     patient. 
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getImmunizationsSectionEntriesOptional()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.22.2.2' constraints.validation.error='ImmunizationsSectionEntriesOptionalTemplateId ImmunizationsSectionEntriesOptionalHasMedicationOrSupplyActivity'"
 * @generated
 */
public interface ImmunizationsSectionEntriesOptional extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(activity : cda::SubstanceAdministration | activity.oclIsKindOf(consol::MedicationActivity))
	 *    or self.getSupplies()->exists(activity : cda::Supply | activity.oclIsKindOf(consol::SupplyActivity))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(activity : cda::SubstanceAdministration | activity.oclIsKindOf(consol::MedicationActivity))\r\n   or self.getSupplies()->exists(activity : cda::Supply | activity.oclIsKindOf(consol::SupplyActivity))'"
	 * @generated
	 */
	boolean validateImmunizationsSectionEntriesOptionalHasMedicationOrSupplyActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.2')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.2\')'"
	 * @generated
	 */
	boolean validateImmunizationsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSectionEntriesOptional init();
} // ImmunizationsSectionEntriesOptional
