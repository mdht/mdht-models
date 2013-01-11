/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Current Medication Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSCurrentMedicationSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='EMS Current Medications Section' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Current Medications Section' templateId.root='2.16.840.1.113883.17.3.10.1.15' constraints.validation.error='EMSCurrentMedicationSectionTemplateId EMSCurrentMedicationSectionCode EMSCurrentMedicationSectionTitle EMSCurrentMedicationSectionText EMSCurrentMedicationSectionEntry1 EMSCurrentMedicationSectionEntry2 EMSCurrentMedicationSectionEntry3' code.codeSystemName='LOINC' code.code='67844-1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnMedicationEntry constraints.validation.error='OnMedicationEntryCurrentlyOnMedication'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnMedicationEntryCurrentlyOnMedication code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Currently on medication' constraints.validation.error='CurrentlyOnMedicationCode CurrentlyOnMedicationValue' code.codeSystemName='LOINC' code.code='67791-4'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnAnticoagulantsEntry constraints.validation.error='OnAnticoagulantsEntryPatientOnAnticoagulants'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionOnAnticoagulantsEntryPatientOnAnticoagulants code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Patient on anticoagulants' constraints.validation.error='PatientOnAnticoagulantsCode PatientOnAnticoagulantsValue' code.codeSystemName='LOINC' code.code='69749-0'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntry constraints.validation.info='CurrentMedicationEntryEMSCurrentMedication'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedication constraints.validation.dependOn.EMSCurrentMedicationRouteCode='EMSCurrentMedicationRouteCodeP' constraints.validation.error='EMSCurrentMedicationRouteCode EMSCurrentMedicationEMSCurrentMedicationConsumable' routeCode.codeSystem='2.16.840.1.113883.3.26.1.1.1' constraints.validation.warning='EMSCurrentMedicationDoseQuantity EMSCurrentMedicationRouteCodeP' routeCode.codeSystemName='FDA Route of Administration' constraints.validation.info='EMSCurrentMedicationNegationInd EMSCurrentMedicationNullFlavor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumable constraints.validation.error='EMSCurrentMedicationConsumableManufacturedProduct'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProduct constraints.validation.error='EMSCurrentMedicationProductManufacturedLabeledDrug'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentMedicationEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrug code.codeSystem='2.16.840.1.113883.6.88' constraints.validation.error='EMSCurrentMedicationDrugCode EMSCurrentMedicationDrugCodeP' code.codeSystemName='RxNorm'"
 * @generated
 */
public interface EMSCurrentMedicationSection extends Section {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.15')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.15\')'"
   * @generated
   */
	boolean validateEMSCurrentMedicationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67844-1' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67844-1\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
	boolean validateEMSCurrentMedicationSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Current Medications Section')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Current Medications Section\')'"
   * @generated
   */
	boolean validateEMSCurrentMedicationSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSCurrentMedicationSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCurrentMedicationSection::OnMedicationEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCurrentMedicationSection::OnMedicationEntry))'"
   * @generated
   */
	boolean validateEMSCurrentMedicationSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCurrentMedicationSection::OnAnticoagulantsEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCurrentMedicationSection::OnAnticoagulantsEntry))'"
   * @generated
   */
	boolean validateEMSCurrentMedicationSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCurrentMedicationSection::CurrentMedicationEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCurrentMedicationSection::CurrentMedicationEntry))'"
   * @generated
   */
	boolean validateEMSCurrentMedicationSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCurrentMedicationSection::OnMedicationEntry))->asSequence()->first().oclAsType(emspcr::EMSCurrentMedicationSection::OnMedicationEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCurrentMedicationSection::OnMedicationEntry))->asSequence()->first().oclAsType(emspcr::EMSCurrentMedicationSection::OnMedicationEntry)'"
   * @generated
   */
  void getEntry1();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCurrentMedicationSection::OnAnticoagulantsEntry))->asSequence()->first().oclAsType(emspcr::EMSCurrentMedicationSection::OnAnticoagulantsEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCurrentMedicationSection::OnAnticoagulantsEntry))->asSequence()->first().oclAsType(emspcr::EMSCurrentMedicationSection::OnAnticoagulantsEntry)'"
   * @generated
   */
  void getEntry2();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCurrentMedicationSection::CurrentMedicationEntry))->asSequence()->first().oclAsType(emspcr::EMSCurrentMedicationSection::CurrentMedicationEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCurrentMedicationSection::CurrentMedicationEntry))->asSequence()->first().oclAsType(emspcr::EMSCurrentMedicationSection::CurrentMedicationEntry)'"
   * @generated
   */
  void getEntry3();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSCurrentMedicationSection init();
} // EMSCurrentMedicationSection
