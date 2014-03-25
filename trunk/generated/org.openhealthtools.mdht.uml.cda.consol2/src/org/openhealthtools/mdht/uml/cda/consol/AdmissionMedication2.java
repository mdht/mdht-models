/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admission Medication2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdmissionMedication2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AdmissionMedicationTemplateId AdmissionMedicationCode AdmissionMedicationCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.36.2' code.code='42346-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Medications on Admission' constraints.validation.dependOn.AdmissionMedicationCode='AdmissionMedicationCodeP'"
 * @generated
 */
public interface AdmissionMedication2 extends AdmissionMedication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionMedication2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionMedication2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdmissionMedication2
