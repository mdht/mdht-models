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
 * A representation of the model object '<em><b>Discharge Diagnosis Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getDischargeDiagnosisSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HospitalDischargeDiagnosisSectionTemplateId HospitalDischargeDiagnosisSectionCode HospitalDischargeDiagnosisSectionCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.24' templateId.extension='2014-06-09' code.code='C-CDAV2-DDN' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Prognosis' constraints.validation.dependOn.HospitalDischargeDiagnosisSectionCode='HospitalDischargeDiagnosisSectionCodeP' constraints.validation.warning='HospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2'"
 * @generated
 */
public interface DischargeDiagnosisSection2 extends HospitalDischargeDiagnosisSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalDischargeDiagnosis2))'"
	 * @generated
	 */
	boolean validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalDischargeDiagnosis2))->asSequence()->any(true).oclAsType(consol::HospitalDischargeDiagnosis2)'"
	 * @generated
	 */
	HospitalDischargeDiagnosis2 getConsolHospitalDischargeDiagnosis2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDiagnosisSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDiagnosisSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DischargeDiagnosisSection2
