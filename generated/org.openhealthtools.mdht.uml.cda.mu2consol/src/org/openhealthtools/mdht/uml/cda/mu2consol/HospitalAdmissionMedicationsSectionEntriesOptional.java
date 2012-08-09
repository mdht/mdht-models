/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Hospital Admission Medications Section Entries Optional</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getHospitalAdmissionMedicationsSectionEntriesOptional()
 * @model annotation=
 *        "http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='mu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication mu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity'"
 * @generated
 */
public interface HospitalAdmissionMedicationsSectionEntriesOptional
		extends
		org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined()
	 * and entry.act.oclIsKindOf(consol::AdmissionMedication))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AdmissionMedication))'"
	 * @generated
	 */
	boolean validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not
	 * entry.substanceAdministration.oclIsUndefined() and
	 * entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity))'"
	 * @generated
	 */
	boolean validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalMedicationActivity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and
	 * act.oclIsKindOf
	 * (consol::AdmissionMedication)).oclAsType(consol::AdmissionMedication)
	 * <!-- end-model-doc -->
	 * 
	 * @model required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AdmissionMedication)).oclAsType(consol::AdmissionMedication)'"
	 * @generated
	 */
	EList<AdmissionMedication> getmu2consolAdmissionMedications();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration :
	 * cda::SubstanceAdministration | not
	 * substanceAdministration.oclIsUndefined() and
	 * substanceAdministration.oclIsKindOf
	 * (consol::MedicationActivity))->asSequence
	 * ()->any(true).oclAsType(consol::MedicationActivity) <!-- end-model-doc
	 * -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity))->asSequence()->any(true).oclAsType(consol::MedicationActivity)'"
	 * @generated
	 */
	MedicationActivity getMedicationActivity();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HospitalAdmissionMedicationsSectionEntriesOptional init();
} // HospitalAdmissionMedicationsSectionEntriesOptional
