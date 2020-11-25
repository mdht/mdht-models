/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospital Discharge Medications Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getHospitalDischargeMedicationsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HospitalDischargeMedicationsSectionEntriesOptionalTemplateId HospitalDischargeMedicationsSectionEntriesOptionalCode HospitalDischargeMedicationsSectionEntriesOptionalCodeP HospitalDischargeMedicationsSectionEntriesOptionalText HospitalDischargeMedicationsSectionEntriesOptionalTitle HospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication' templateId.root='2.16.840.1.113883.10.20.22.2.11.1' constraints.validation.dependOn.HospitalDischargeMedicationsSectionEntriesOptionalCode='HospitalDischargeMedicationsSectionEntriesOptionalCodeP'"
 *        annotation="duplicates"
 * @generated
 */
public interface HospitalDischargeMedicationsSection extends HospitalDischargeMedicationsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::DischargeMedication)).oclAsType(consol::DischargeMedication)'"
	 * @generated
	 */
	EList<DischargeMedication> getConsolDischargeMedications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HospitalDischargeMedicationsSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HospitalDischargeMedicationsSection
