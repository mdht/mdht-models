/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admission Diagnosis Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdmissionDiagnosisSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HospitalAdmissionDiagnosisSectionTemplateId HospitalAdmissionDiagnosisSectionCode HospitalAdmissionDiagnosisSectionCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.43' templateId.extension='2014-06-09' code.code='42347-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Admission diagnosis' constraints.validation.dependOn.HospitalAdmissionDiagnosisSectionCode='HospitalAdmissionDiagnosisSectionCodeP' constraints.validation.warning='HospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis'"
 * @generated
 */
public interface AdmissionDiagnosisSection2 extends HospitalAdmissionDiagnosisSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalAdmissionDiagnosis2))->asSequence()->any(true).oclAsType(consol::HospitalAdmissionDiagnosis2)'"
	 * @generated
	 */
	HospitalAdmissionDiagnosis2 getConsolHospitalAdmissionDiagnosis2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionDiagnosisSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionDiagnosisSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdmissionDiagnosisSection2
