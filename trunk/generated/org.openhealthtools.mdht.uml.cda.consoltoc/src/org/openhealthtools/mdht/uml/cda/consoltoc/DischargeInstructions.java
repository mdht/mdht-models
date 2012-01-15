/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consoltoc;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discharge Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage#getDischargeInstructions()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.3.1275.1.1.2.1' constraints.validation.error='DischargeInstructionsTemplateId'"
 * @generated
 */
public interface DischargeInstructions extends GeneralHeaderConstraints
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PlanOfCareSection))->asSequence()->first().oclAsType(PlanOfCareSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PlanOfCareSection))->asSequence()->first().oclAsType(PlanOfCareSection)'"
	 * @generated
	 */
  PlanOfCareSection getPlanOfCareSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(AllergiesSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(AllergiesSectionEntriesOptional)'"
	 * @generated
	 */
  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(ProblemSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(ProblemSectionEntriesOptional)'"
	 * @generated
	 */
  ProblemSectionEntriesOptional getProblemSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalDischargeMedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(HospitalDischargeMedicationsSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalDischargeMedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(HospitalDischargeMedicationsSectionEntriesOptional)'"
	 * @generated
	 */
  HospitalDischargeMedicationsSectionEntriesOptional getHospitalDischargeMedicationsSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(AdvanceDirectivesSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(AdvanceDirectivesSectionEntriesOptional)'"
	 * @generated
	 */
  AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(ImmunizationsSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(ImmunizationsSectionEntriesOptional)'"
	 * @generated
	 */
  ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(MedicalEquipmentSection))->asSequence()->first().oclAsType(MedicalEquipmentSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(MedicalEquipmentSection))->asSequence()->first().oclAsType(MedicalEquipmentSection)'"
	 * @generated
	 */
  MedicalEquipmentSection getMedicalEquipmentSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(AdvanceDirectivesSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(AdvanceDirectivesSectionEntriesOptional)'"
	 * @generated
	 */
  AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional2();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DischargeInstructions init();
} // DischargeInstructions
