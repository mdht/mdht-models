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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSAllergiesAndAdverseReactionsSectionTemplateId EMSAllergiesAndAdverseReactionsSectionCode EMSAllergiesAndAdverseReactionsSectionTitle EMSAllergiesAndAdverseReactionsSectionText EMSAllergiesAndAdverseReactionsSectionEntry1 EMSAllergiesAndAdverseReactionsSectionEntry2' templateId.root='2.16.840.1.113883.17.3.10.1.13' code.code='67841-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Allergies and Adverse Reactions  Section' title.mixed='EMS Allergies and Adverse Reactions'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntry constraints.validation.error='DerivedEntryEMSEnvironmentalAllergies'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergies constraints.validation.error='EMSMedicationAllergiesEMSExistenceOfDrugAllergy' constraints.validation.info='EMSMedicationAllergiesEMSDrugAllergy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSExistenceOfDrugAllergy code.code='67794-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Existence of drug allergy' constraints.validation.error='EMSExistenceOfDrugAllergyCode EMSExistenceOfDrugAllergyValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergy code.code='67850-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Drug allergy' constraints.validation.error='EMSDrugAllergyCode EMSDrugAllergyCodeP EMSDrugAllergyValue' constraints.validation.dependOn.EMSDrugAllergyCode='EMSDrugAllergyCodeP' value.code='106190000' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' value.displayName='allergy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergyEMSDrugAllergyParticipation constraints.validation.error='EMSDrugAllergyParticipationEMSDrugAllergyParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergyEMSDrugAllergyParticipationEMSDrugAllergyParticipantRole constraints.validation.error='EMSDrugAllergyParticipantRoleEMSDrugAllergyEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergyEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntity code.codeSystem='2.16.840.1.113883.6.88' code.codeSystemName='RxNorm' constraints.validation.error='EMSDrugAllergyEntityCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergies constraints.validation.error='EMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy' constraints.validation.info='EMSEnvironmentalAllergiesEMSEnvironmentalAllergy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy code.code='69747-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Existence of environmental allergy' constraints.validation.error='EMSExistenceOfEnvironmentalAllergyCode EMSExistenceOfEnvironmentalAllergyValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergy code.code='69748-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Known allergies to food or environmental agents' constraints.validation.error='EMSEnvironmentalAllergyCode EMSEnvironmentalAllergyValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface EMSAllergiesAndAdverseReactionsSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'67841-7\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateEMSAllergiesAndAdverseReactionsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	 * @generated
	 */
	boolean validateEMSAllergiesAndAdverseReactionsSectionEntry1(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	 * @generated
	 */
	boolean validateEMSAllergiesAndAdverseReactionsSectionEntry2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSAllergiesAndAdverseReactionsSection init();

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public EMSAllergiesAndAdverseReactionsSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSAllergiesAndAdverseReactionsSection
