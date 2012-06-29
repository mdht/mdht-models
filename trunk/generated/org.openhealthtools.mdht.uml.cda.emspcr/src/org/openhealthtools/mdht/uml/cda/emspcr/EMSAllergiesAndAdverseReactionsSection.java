/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Allergies And Adverse Reactions Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSAllergiesAndAdverseReactionsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSAllergiesAndAdverseReactionsSectionTemplateId EMSAllergiesAndAdverseReactionsSectionCode EMSAllergiesAndAdverseReactionsSectionEntry1 EMSAllergiesAndAdverseReactionsSectionEntry2' templateId.root='2.16.840.1.113883.17.3.10.1.13' code.code='67841?7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Allergies and Adverse Reactions' title.mixed='EMS Allergies and Adverse Reactions' constraints.validation.warning='EMSAllergiesAndAdverseReactionsSectionTitle'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntry constraints.validation.error='DerivedEntryEMSMedicationAllergies'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergies constraints.validation.error='EMSMedicationAllergiesEMSExistenceOfDrugAllergy' constraints.validation.info='EMSMedicationAllergiesEMSDrugAllergy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSExistenceOfDrugAllergy code.code='67794?8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Existence of drug allergy' constraints.validation.error='EMSExistenceOfDrugAllergyCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergy value.code='106190000' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' value.displayName='allergy' constraints.validation.error='EMSDrugAllergyValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergyEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntity code.codeSystem='2.16.840.1.113883.6.88' code.codeSystemName='RxNorm' constraints.validation.error='EMSDrugAllergyEntityCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergies constraints.validation.error='EMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy' constraints.validation.info='EMSEnvironmentalAllergiesEMSEnvironmentalAllergy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy code.code='69747?4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Existence of environmental allergy' constraints.validation.error='EMSExistenceOfEnvironmentalAllergyCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergy code.code='69748?2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Known allergies to food or environmental agents' constraints.validation.error='EMSEnvironmentalAllergyCode EMSEnvironmentalAllergyValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface EMSAllergiesAndAdverseReactionsSection extends DerivedCDASection
{
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
  boolean validateEMSAllergiesAndAdverseReactionsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67841?7' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67841?7\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateEMSAllergiesAndAdverseReactionsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Allergies and Adverse Reactions')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = \'EMS Allergies and Adverse Reactions\')'"
   * @generated
   */
  boolean validateEMSAllergiesAndAdverseReactionsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSAllergiesAndAdverseReactionsSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSAllergiesAndAdverseReactionsSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSAllergiesAndAdverseReactionsSection init();
} // EMSAllergiesAndAdverseReactionsSection
