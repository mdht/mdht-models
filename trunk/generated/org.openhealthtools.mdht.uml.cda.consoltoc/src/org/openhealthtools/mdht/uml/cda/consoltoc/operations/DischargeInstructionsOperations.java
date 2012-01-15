/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consoltoc.operations;

import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;

import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage;
import org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions;
import org.openhealthtools.mdht.uml.cda.consoltoc.util.ConsoltocValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Instructions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getHospitalDischargeMedicationsSectionEntriesOptional() <em>Get Hospital Discharge Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getAdvanceDirectivesSectionEntriesOptional() <em>Get Advance Directives Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getAdvanceDirectivesSectionEntriesOptional2() <em>Get Advance Directives Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeInstructionsOperations extends GeneralHeaderConstraintsOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DischargeInstructionsOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(DischargeInstructions) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PlanOfCareSection))->asSequence()->first().oclAsType(PlanOfCareSection)";

  /**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(DischargeInstructions) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PlanOfCareSection))->asSequence()->first().oclAsType(PlanOfCareSection)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  PlanOfCareSection getPlanOfCareSection(DischargeInstructions dischargeInstructions)
  {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(136));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(dischargeInstructions);
	}

  /**
	 * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(DischargeInstructions) <em>Get Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(AllergiesSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(DischargeInstructions) <em>Get Allergies Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(AllergiesSectionEntriesOptional)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(DischargeInstructions dischargeInstructions)
  {
		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(137));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (AllergiesSectionEntriesOptional) query.evaluate(dischargeInstructions);
	}

  /**
	 * The cached OCL expression body for the '{@link #getProblemSectionEntriesOptional(DischargeInstructions) <em>Get Problem Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(ProblemSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getProblemSectionEntriesOptional(DischargeInstructions) <em>Get Problem Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(ProblemSectionEntriesOptional)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ProblemSectionEntriesOptional getProblemSectionEntriesOptional(DischargeInstructions dischargeInstructions)
  {
		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(138));
			try {
				GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProblemSectionEntriesOptional) query.evaluate(dischargeInstructions);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeInstructions) <em>Get Hospital Discharge Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalDischargeMedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(HospitalDischargeMedicationsSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeInstructions) <em>Get Hospital Discharge Medications Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HospitalDischargeMedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(HospitalDischargeMedicationsSectionEntriesOptional)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HospitalDischargeMedicationsSectionEntriesOptional getHospitalDischargeMedicationsSectionEntriesOptional(DischargeInstructions dischargeInstructions)
  {
		if (GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(139));
			try {
				GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (HospitalDischargeMedicationsSectionEntriesOptional) query.evaluate(dischargeInstructions);
	}

  /**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSectionEntriesOptional(DischargeInstructions) <em>Get Advance Directives Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSectionEntriesOptional(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(AdvanceDirectivesSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSectionEntriesOptional(DischargeInstructions) <em>Get Advance Directives Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSectionEntriesOptional(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(AdvanceDirectivesSectionEntriesOptional)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional(DischargeInstructions dischargeInstructions)
  {
		if (GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(140));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (AdvanceDirectivesSectionEntriesOptional) query.evaluate(dischargeInstructions);
	}

  /**
	 * The cached OCL expression body for the '{@link #getImmunizationsSectionEntriesOptional(DischargeInstructions) <em>Get Immunizations Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(ImmunizationsSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getImmunizationsSectionEntriesOptional(DischargeInstructions) <em>Get Immunizations Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(ImmunizationsSectionEntriesOptional)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional(DischargeInstructions dischargeInstructions)
  {
		if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(141));
			try {
				GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ImmunizationsSectionEntriesOptional) query.evaluate(dischargeInstructions);
	}

  /**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentSection(DischargeInstructions) <em>Get Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(MedicalEquipmentSection))->asSequence()->first().oclAsType(MedicalEquipmentSection)";

  /**
	 * The cached OCL query for the '{@link #getMedicalEquipmentSection(DischargeInstructions) <em>Get Medical Equipment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(MedicalEquipmentSection))->asSequence()->first().oclAsType(MedicalEquipmentSection)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  MedicalEquipmentSection getMedicalEquipmentSection(DischargeInstructions dischargeInstructions)
  {
		if (GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(142));
			try {
				GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY);
		return (MedicalEquipmentSection) query.evaluate(dischargeInstructions);
	}

  /**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSectionEntriesOptional2(DischargeInstructions) <em>Get Advance Directives Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSectionEntriesOptional2(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(AdvanceDirectivesSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSectionEntriesOptional2(DischargeInstructions) <em>Get Advance Directives Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSectionEntriesOptional2(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(AdvanceDirectivesSectionEntriesOptional)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional2(DischargeInstructions dischargeInstructions)
  {
		if (GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(143));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (AdvanceDirectivesSectionEntriesOptional) query.evaluate(dischargeInstructions);
	}

  /**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.1275.1.1.2.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.1275.1.1.2.1')
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateGeneralHeaderConstraintsTemplateId(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_INSTRUCTIONS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dischargeInstructions, context) }),
						 new Object [] { dischargeInstructions }));
			}
			return false;
		}
		return true;
	}

} // DischargeInstructionsOperations