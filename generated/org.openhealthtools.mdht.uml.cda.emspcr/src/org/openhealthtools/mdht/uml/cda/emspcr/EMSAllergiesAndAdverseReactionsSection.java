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
 * A representation of the model object '<em><b>EMS Allergies And Adverse Reactions Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSAllergiesAndAdverseReactionsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='EMS Allergies and Adverse Reactions' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Allergies and Adverse Reactions  Section' templateId.root='2.16.840.1.113883.17.3.10.1.13' constraints.validation.error='EMSAllergiesAndAdverseReactionsSectionTemplateId EMSAllergiesAndAdverseReactionsSectionCode EMSAllergiesAndAdverseReactionsSectionTitle EMSAllergiesAndAdverseReactionsSectionText EMSAllergiesAndAdverseReactionsSectionEntry1 EMSAllergiesAndAdverseReactionsSectionEntry2' code.codeSystemName='LOINC' code.code='67841-7'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntry constraints.validation.error='MedicationAllergyEntryEMSExistenceOfDrugAllergyObservation' constraints.validation.info='MedicationAllergyEntryEMSDrugAllergyObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSExistenceOfDrugAllergyObservation code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Existence of drug allergy' constraints.validation.error='EMSExistenceOfDrugAllergyObservationCode EMSExistenceOfDrugAllergyObservationValue' code.codeSystemName='LOINC' code.code='67794-8'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservation constraints.validation.dependOn.EMSDrugAllergyObservationCode='EMSDrugAllergyObservationCodeP' value.displayName='allergy' value.codeSystemName='SNOMEDCT' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Drug allergy' value.code='106190000' constraints.validation.error='EMSDrugAllergyObservationCode EMSDrugAllergyObservationCodeP EMSDrugAllergyObservationValue EMSDrugAllergyObservationEMSDrugAllergyParticipation' code.codeSystemName='LOINC' code.code='67850-8' value.codeSystem='2.16.840.1.113883.6.96'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipation constraints.validation.error='EMSDrugAllergyParticipationEMSDrugAllergyParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationEMSDrugAllergyParticipantRole constraints.validation.error='EMSDrugAllergyParticipantRoleEMSDrugAllergyEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionMedicationAllergyEntryEMSDrugAllergyObservationEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntity code.codeSystem='2.16.840.1.113883.6.88' constraints.validation.error='EMSDrugAllergyEntityCode' code.codeSystemName='RxNorm'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntry constraints.validation.error='EnvironmentalAllergyEntryEMSEnvironmentalAllergies'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergies constraints.validation.error='EMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy' constraints.validation.info='EMSEnvironmentalAllergiesEMSEnvironmentalAllergy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Existence of environmental allergy' constraints.validation.error='EMSExistenceOfEnvironmentalAllergyCode EMSExistenceOfEnvironmentalAllergyValue' code.codeSystemName='LOINC' code.code='69747-4'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergyEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergy value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Known allergies to food or environmental agents' constraints.validation.error='EMSEnvironmentalAllergyCode EMSEnvironmentalAllergyValue' code.codeSystemName='LOINC' code.code='69748-2' value.codeSystem='2.16.840.1.113883.6.1'"
 * @generated
 */
public interface EMSAllergiesAndAdverseReactionsSection extends Section {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.13')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.13\')'"
   * @generated
   */
	boolean validateEMSAllergiesAndAdverseReactionsSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67841-7' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67841-7\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
	boolean validateEMSAllergiesAndAdverseReactionsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Allergies and Adverse Reactions')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Allergies and Adverse Reactions\')'"
   * @generated
   */
	boolean validateEMSAllergiesAndAdverseReactionsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSAllergiesAndAdverseReactionsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::MedicationAllergyEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::MedicationAllergyEntry))'"
   * @generated
   */
	boolean validateEMSAllergiesAndAdverseReactionsSectionEntry1(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::EnvironmentalAllergyEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::EnvironmentalAllergyEntry))'"
   * @generated
   */
	boolean validateEMSAllergiesAndAdverseReactionsSectionEntry2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::MedicationAllergyEntry))->asSequence()->first().oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection::MedicationAllergyEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::MedicationAllergyEntry))->asSequence()->first().oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection::MedicationAllergyEntry)'"
   * @generated
   */
  void getEntry1();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::EnvironmentalAllergyEntry))->asSequence()->first().oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection::EnvironmentalAllergyEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::EnvironmentalAllergyEntry))->asSequence()->first().oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection::EnvironmentalAllergyEntry)'"
   * @generated
   */
  void getEntry2();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSAllergiesAndAdverseReactionsSection init();
} // EMSAllergiesAndAdverseReactionsSection
