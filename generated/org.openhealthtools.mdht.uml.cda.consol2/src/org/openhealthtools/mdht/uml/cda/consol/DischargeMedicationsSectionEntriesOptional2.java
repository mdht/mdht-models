/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discharge Medications Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getDischargeMedicationsSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HospitalDischargeMedicationsSectionEntriesOptionalTemplateId HospitalDischargeMedicationsSectionEntriesOptionalCode HospitalDischargeMedicationsSectionEntriesOptionalCodeP DischargeMedicationsSectionEntriesOptional2CETranslation DischargeMedicationsSectionEntriesOptional2CETranslationP' templateId.root='2.16.840.1.113883.10.20.22.2.11' templateId.extension='2015-08-01' constraints.validation.dependOn.HospitalDischargeMedicationsSectionEntriesOptionalCode='HospitalDischargeMedicationsSectionEntriesOptionalCodeP' constraints.validation.warning='HospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication' constraints.validation.query='DischargeMedicationsSectionEntriesOptional2CETranslation DischargeMedicationsSectionEntriesOptional2CETranslationP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDischargeMedicationsSectionEntriesOptional2CE translation.code='75311-1' translation.codeSystem='2.16.840.1.113883.6.1' translation.codeSystemName='LOINC' translation.displayName='Discharge Medications' constraints.validation.error='DischargeMedicationsSectionEntriesOptional2CETranslation DischargeMedicationsSectionEntriesOptional2CETranslationP'"
 *        annotation="duplicates"
 * @generated
 */
public interface DischargeMedicationsSectionEntriesOptional2
		extends HospitalDischargeMedicationsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((translation-&gt;isEmpty() or translation-&gt;exists(element | element.isNullFlavorUndefined())) implies (translation-&gt;size() = 1 and translation-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.code = \'75311-1\' and value.codeSystem = \'2.16.840.1.113883.6.1\')) )))'"
	 * @generated
	 */
	boolean validateDischargeMedicationsSectionEntriesOptional2CETranslation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateDischargeMedicationsSectionEntriesOptional2CETranslationP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::DischargeMedication2)).oclAsType(consol::DischargeMedication2)'"
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
