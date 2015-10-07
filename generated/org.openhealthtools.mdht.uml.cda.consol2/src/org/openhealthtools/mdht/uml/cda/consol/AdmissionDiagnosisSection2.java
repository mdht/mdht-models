/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admission Diagnosis Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdmissionDiagnosisSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HospitalAdmissionDiagnosisSectionTemplateId HospitalAdmissionDiagnosisSectionCode HospitalAdmissionDiagnosisSectionCodeP AdmissionDiagnosisSection2CETranslation AdmissionDiagnosisSection2CETranslationP' templateId.root='2.16.840.1.113883.10.20.22.2.43' templateId.extension='2015-08-01' code.code='46241-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Hospital Admission diagnosis' constraints.validation.dependOn.HospitalAdmissionDiagnosisSectionCode='HospitalAdmissionDiagnosisSectionCodeP' constraints.validation.warning='HospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis' constraints.validation.query='AdmissionDiagnosisSection2CETranslation AdmissionDiagnosisSection2CETranslationP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdmissionDiagnosisSection2CE translation.code='42347-5' translation.codeSystem='2.16.840.1.113883.6.1' translation.codeSystemName='LOINC' translation.displayName='Admission Diagnosis' constraints.validation.error='AdmissionDiagnosisSection2CETranslation AdmissionDiagnosisSection2CETranslationP'"
 * @generated
 */
public interface AdmissionDiagnosisSection2 extends HospitalAdmissionDiagnosisSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1 and translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.code = \'42347-5\' and value.codeSystem = \'2.16.840.1.113883.6.1\')) )))'"
	 * @generated
	 */
	boolean validateAdmissionDiagnosisSection2CETranslation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1) )))'"
	 * @generated
	 */
	boolean validateAdmissionDiagnosisSection2CETranslationP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
