/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discharge Diagnosis Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getDischargeDiagnosisSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DischargeDiagnosisSection2TemplateId HospitalDischargeDiagnosisSectionCode HospitalDischargeDiagnosisSectionCodeP DischargeDiagnosisSection2CETranslation DischargeDiagnosisSection2CETranslationP' templateId.root='2.16.840.1.113883.10.20.22.2.24' templateId.extension='2015-08-01' constraints.validation.dependOn.HospitalDischargeDiagnosisSectionCode='HospitalDischargeDiagnosisSectionCodeP' constraints.validation.warning='HospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis' constraints.validation.query='DischargeDiagnosisSection2CETranslation DischargeDiagnosisSection2CETranslationP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDischargeDiagnosisSection2CE translation.code='78375-3' translation.codeSystem='2.16.840.1.113883.6.1' translation.codeSystemName='LOINC' translation.displayName='Discharge Diagnosis' constraints.validation.error='DischargeDiagnosisSection2CETranslation DischargeDiagnosisSection2CETranslationP'"
 *        annotation="duplicates"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.24\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateDischargeDiagnosisSection2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((translation-&gt;isEmpty() or translation-&gt;exists(element | element.isNullFlavorUndefined())) implies (translation-&gt;size() = 1 and translation-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.code = \'78375-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')) )))'"
	 * @generated
	 */
	boolean validateDischargeDiagnosisSection2CETranslation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((translation-&gt;isEmpty() or translation-&gt;exists(element | element.isNullFlavorUndefined())) implies (translation-&gt;size() =  1) )))'"
	 * @generated
	 */
	boolean validateDischargeDiagnosisSection2CETranslationP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalDischargeDiagnosis2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::HospitalDischargeDiagnosis2)'"
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
