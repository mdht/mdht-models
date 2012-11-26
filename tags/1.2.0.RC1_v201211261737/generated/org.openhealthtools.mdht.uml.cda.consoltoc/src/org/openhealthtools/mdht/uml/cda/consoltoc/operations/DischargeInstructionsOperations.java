/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
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
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPlugin;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Hospital Discharge Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Advance Directives Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getHospitalDischargeMedicationsSectionEntriesOptional() <em>Get Hospital Discharge Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getAdvanceDirectivesSectionEntriesOptional() <em>Get Advance Directives Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateDischargeInstructionsPlanOfCareSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsPlanOfCareSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeInstructionsPlanOfCareSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsPlanOfCareSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeInstructionsPlanOfCareSection(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeInstructionsPlanOfCareSection"),
						 new Object [] { dischargeInstructions }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeInstructionsAllergiesSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsAllergiesSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeInstructionsAllergiesSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Allergies Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsAllergiesSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeInstructionsAllergiesSectionEntriesOptional(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_ALLERGIES_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("DischargeInstructionsAllergiesSectionEntriesOptional"),
						 new Object [] { dischargeInstructions }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeInstructionsProblemSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Problem Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsProblemSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeInstructionsProblemSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Problem Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsProblemSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeInstructionsProblemSectionEntriesOptional(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_PROBLEM_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("DischargeInstructionsProblemSectionEntriesOptional"),
						 new Object [] { dischargeInstructions }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Hospital Discharge Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Hospital Discharge Medications Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_INSTRUCTIONS_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSectionEntriesOptional))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_INSTRUCTIONS_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("DischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional"),
						 new Object [] { dischargeInstructions }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Advance Directives Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Advance Directives Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("DischargeInstructionsAdvanceDirectivesSectionEntriesOptional"),
						 new Object [] { dischargeInstructions }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeInstructionsImmunizationsSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Immunizations Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsImmunizationsSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeInstructionsImmunizationsSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Immunizations Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsImmunizationsSectionEntriesOptional(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeInstructionsImmunizationsSectionEntriesOptional(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("DischargeInstructionsImmunizationsSectionEntriesOptional"),
						 new Object [] { dischargeInstructions }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeInstructionsMedicalEquipmentSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsMedicalEquipmentSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeInstructionsMedicalEquipmentSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Medical Equipment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsMedicalEquipmentSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeInstructionsMedicalEquipmentSection(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeInstructionsMedicalEquipmentSection"),
						 new Object [] { dischargeInstructions }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(DischargeInstructions) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  PlanOfCareSection getPlanOfCareSection(DischargeInstructions dischargeInstructions)
  {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(297));
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
  protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(DischargeInstructions dischargeInstructions)
  {
		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(298));
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
  protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProblemSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProblemSectionEntriesOptional)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ProblemSectionEntriesOptional getProblemSectionEntriesOptional(DischargeInstructions dischargeInstructions)
  {
		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(299));
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
  protected static final String GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::HospitalDischargeMedicationsSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::HospitalDischargeMedicationsSectionEntriesOptional)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HospitalDischargeMedicationsSectionEntriesOptional getHospitalDischargeMedicationsSectionEntriesOptional(DischargeInstructions dischargeInstructions)
  {
		if (GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(300));
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
  protected static final String GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSectionEntriesOptional)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional(DischargeInstructions dischargeInstructions)
  {
		if (GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(301));
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
  protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ImmunizationsSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ImmunizationsSectionEntriesOptional)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional(DischargeInstructions dischargeInstructions)
  {
		if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(302));
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
  protected static final String GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  MedicalEquipmentSection getMedicalEquipmentSection(DischargeInstructions dischargeInstructions)
  {
		if (GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS, ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(303));
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