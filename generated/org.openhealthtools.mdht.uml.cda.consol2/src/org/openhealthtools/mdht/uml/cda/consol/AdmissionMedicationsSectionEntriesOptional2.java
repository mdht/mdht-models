/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admission Medications Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdmissionMedicationsSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HospitalAdmissionMedicationsSectionEntriesOptionalTemplateId HospitalAdmissionMedicationsSectionEntriesOptionalCode HospitalAdmissionMedicationsSectionEntriesOptionalCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.44' templateId.extension='2015-08-01' constraints.validation.dependOn.HospitalAdmissionMedicationsSectionEntriesOptionalCode='HospitalAdmissionMedicationsSectionEntriesOptionalCodeP' constraints.validation.warning='HospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication'"
 *        annotation="duplicates"
 * @generated
 */
public interface AdmissionMedicationsSectionEntriesOptional2
		extends HospitalAdmissionMedicationsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AdmissionMedication2)).oclAsType(consol::AdmissionMedication2)'"
	 * @generated
	 */
	EList<AdmissionMedication2> getConsolAdmissionMedication2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionMedicationsSectionEntriesOptional2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AdmissionMedicationsSectionEntriesOptional2 init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdmissionMedicationsSectionEntriesOptional2
