/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discharge Medications Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getDischargeMedicationsSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HospitalDischargeMedicationsSectionEntriesOptionalTemplateId HospitalDischargeMedicationsSectionEntriesOptionalCode HospitalDischargeMedicationsSectionEntriesOptionalCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.11' templateId.extension='2015-08-01' code.code='75311-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Discharge medications' constraints.validation.dependOn.HospitalDischargeMedicationsSectionEntriesOptionalCode='HospitalDischargeMedicationsSectionEntriesOptionalCodeP' constraints.validation.warning='HospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication'"
 * @generated
 */
public interface DischargeMedicationsSectionEntriesOptional2 extends HospitalDischargeMedicationsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::DischargeMedication2)).oclAsType(consol::DischargeMedication2)'"
	 * @generated
	 */
	EList<DischargeMedication2> getConsolDischargeMedication2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeMedicationsSectionEntriesOptional2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeMedicationsSectionEntriesOptional2 init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // DischargeMedicationsSectionEntriesOptional2
