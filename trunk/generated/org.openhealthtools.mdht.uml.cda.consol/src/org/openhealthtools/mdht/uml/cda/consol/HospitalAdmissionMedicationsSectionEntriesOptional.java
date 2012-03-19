/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospital Admission Medications Section Entries Optional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Hospital Admission Medications section defines the relevant medications administered prior to admission to the facility. The currently active medications must be listed.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getHospitalAdmissionMedicationsSectionEntriesOptional()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystem='2.16.840.1.113883.6.1' code.displayName='MEDICATIONS ON ADMISSION' templateId.root='2.16.840.1.113883.10.20.22.2.44' constraints.validation.error='HospitalAdmissionMedicationsSectionEntriesOptionalTemplateId HospitalAdmissionMedicationsSectionEntriesOptionalCode HospitalAdmissionMedicationsSectionEntriesOptionalText HospitalAdmissionMedicationsSectionEntriesOptionalTitle' code.codeSystemName='LOINC' constraints.validation.warning='HospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication' code.code='42346-7'"
 * @generated
 */
public interface HospitalAdmissionMedicationsSectionEntriesOptional extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.44')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.44\')'"
	 * @generated
	 */
	boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '42346-7' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'42346-7\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AdmissionMedication))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AdmissionMedication))'"
	 * @generated
	 */
	boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AdmissionMedication)).oclAsType(consol::AdmissionMedication)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AdmissionMedication)).oclAsType(consol::AdmissionMedication)'"
	 * @generated
	 */
	EList<AdmissionMedication> getAdmissionMedications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionMedicationsSectionEntriesOptional init();
} // HospitalAdmissionMedicationsSectionEntriesOptional
