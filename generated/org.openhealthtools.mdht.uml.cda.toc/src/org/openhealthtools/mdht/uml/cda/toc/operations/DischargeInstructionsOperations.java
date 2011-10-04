/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions;
import org.openhealthtools.mdht.uml.cda.toc.ToCPackage;
import org.openhealthtools.mdht.uml.cda.toc.ToCPlugin;
import org.openhealthtools.mdht.uml.cda.toc.util.ToCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Instructions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsProblemListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsDischargeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getAllergiesReactionsSection() <em>Get Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getProblemListSection() <em>Get Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getDischargeDiagnosisSection() <em>Get Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeInstructionsOperations extends GeneralHeaderConstraintsOperations {
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
	protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PlanOfCareSection))";

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
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PlanOfCareSection))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeInstructionsPlanOfCareSection(DischargeInstructions dischargeInstructions,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION,
					ToCPlugin.INSTANCE.getString("DischargeInstructionsPlanOfCareSection"),
					new Object[] { dischargeInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeInstructionsAllergiesReactionsSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsAllergiesReactionsSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeInstructionsAllergiesReactionsSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Allergies Reactions Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsAllergiesReactionsSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeInstructionsAllergiesReactionsSection(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_ALLERGIES_REACTIONS_SECTION,
					ToCPlugin.INSTANCE.getString("DischargeInstructionsAllergiesReactionsSection"),
					new Object[] { dischargeInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeInstructionsProblemListSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Problem List Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsProblemListSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeInstructionsProblemListSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Problem List Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsProblemListSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeInstructionsProblemListSection(DischargeInstructions dischargeInstructions,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_PROBLEM_LIST_SECTION,
					ToCPlugin.INSTANCE.getString("DischargeInstructionsProblemListSection"),
					new Object[] { dischargeInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeInstructionsDischargeDiagnosisSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Discharge Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsDischargeDiagnosisSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::DischargeDiagnosisSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeInstructionsDischargeDiagnosisSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Discharge Diagnosis Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsDischargeDiagnosisSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_INSTRUCTIONS_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::DischargeDiagnosisSection))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeInstructionsDischargeDiagnosisSection(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_INSTRUCTIONS_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_DISCHARGE_DIAGNOSIS_SECTION,
					ToCPlugin.INSTANCE.getString("DischargeInstructionsDischargeDiagnosisSection"),
					new Object[] { dischargeInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeInstructionsAdvanceDirectivesSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsAdvanceDirectivesSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeInstructionsAdvanceDirectivesSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Advance Directives Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsAdvanceDirectivesSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeInstructionsAdvanceDirectivesSection(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION,
					ToCPlugin.INSTANCE.getString("DischargeInstructionsAdvanceDirectivesSection"),
					new Object[] { dischargeInstructions }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeInstructionsImmunizationsSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsImmunizationsSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeInstructionsImmunizationsSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeInstructionsImmunizationsSection(DischargeInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeInstructionsImmunizationsSection(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION,
					ToCPlugin.INSTANCE.getString("DischargeInstructionsImmunizationsSection"),
					new Object[] { dischargeInstructions }));
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
	protected static final String VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicalEquipmentSection))";

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
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicalEquipmentSection))
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeInstructionsMedicalEquipmentSection(
			DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.DISCHARGE_INSTRUCTIONS__DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION,
					ToCPlugin.INSTANCE.getString("DischargeInstructionsMedicalEquipmentSection"),
					new Object[] { dischargeInstructions }));
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
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PlanOfCareSection))->asSequence()->first().oclAsType(hitsp::PlanOfCareSection)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::PlanOfCareSection))->asSequence()->first().oclAsType(hitsp::PlanOfCareSection)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PlanOfCareSection getPlanOfCareSection(DischargeInstructions dischargeInstructions) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS,
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(73));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(dischargeInstructions);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesReactionsSection(DischargeInstructions) <em>Get Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))->asSequence()->first().oclAsType(hitsp::AllergiesReactionsSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesReactionsSection(DischargeInstructions) <em>Get Allergies Reactions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AllergiesReactionsSection))->asSequence()->first().oclAsType(hitsp::AllergiesReactionsSection)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergiesReactionsSection getAllergiesReactionsSection(DischargeInstructions dischargeInstructions) {
		if (GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS,
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(74));
			try {
				GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY);
		return (AllergiesReactionsSection) query.evaluate(dischargeInstructions);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemListSection(DischargeInstructions) <em>Get Problem List Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemListSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_LIST_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))->asSequence()->first().oclAsType(hitsp::ProblemListSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemListSection(DischargeInstructions) <em>Get Problem List Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemListSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_LIST_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ProblemListSection))->asSequence()->first().oclAsType(hitsp::ProblemListSection)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemListSection getProblemListSection(DischargeInstructions dischargeInstructions) {
		if (GET_PROBLEM_LIST_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS,
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(75));
			try {
				GET_PROBLEM_LIST_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_LIST_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_LIST_SECTION__EOCL_QRY);
		return (ProblemListSection) query.evaluate(dischargeInstructions);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDischargeDiagnosisSection(DischargeInstructions) <em>Get Discharge Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosisSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::DischargeDiagnosisSection))->asSequence()->first().oclAsType(hitsp::DischargeDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getDischargeDiagnosisSection(DischargeInstructions) <em>Get Discharge Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosisSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::DischargeDiagnosisSection))->asSequence()->first().oclAsType(hitsp::DischargeDiagnosisSection)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static DischargeDiagnosisSection getDischargeDiagnosisSection(DischargeInstructions dischargeInstructions) {
		if (GET_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS,
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(76));
			try {
				GET_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (DischargeDiagnosisSection) query.evaluate(dischargeInstructions);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSection(DischargeInstructions) <em>Get Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))->asSequence()->first().oclAsType(hitsp::AdvanceDirectivesSection)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSection(DischargeInstructions) <em>Get Advance Directives Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::AdvanceDirectivesSection))->asSequence()->first().oclAsType(hitsp::AdvanceDirectivesSection)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AdvanceDirectivesSection getAdvanceDirectivesSection(DischargeInstructions dischargeInstructions) {
		if (GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS,
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(77));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY);
		return (AdvanceDirectivesSection) query.evaluate(dischargeInstructions);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection(DischargeInstructions) <em>Get Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))->asSequence()->first().oclAsType(hitsp::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection(DischargeInstructions) <em>Get Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::ImmunizationsSection))->asSequence()->first().oclAsType(hitsp::ImmunizationsSection)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ImmunizationsSection getImmunizationsSection(DischargeInstructions dischargeInstructions) {
		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS,
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(78));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(dischargeInstructions);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentSection(DischargeInstructions) <em>Get Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(DischargeInstructions)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicalEquipmentSection))->asSequence()->first().oclAsType(hitsp::MedicalEquipmentSection)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hitsp::MedicalEquipmentSection))->asSequence()->first().oclAsType(hitsp::MedicalEquipmentSection)
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicalEquipmentSection getMedicalEquipmentSection(DischargeInstructions dischargeInstructions) {
		if (GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS,
				ToCPackage.Literals.DISCHARGE_INSTRUCTIONS.getEAllOperations().get(79));
			try {
				GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
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
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.1275.1.1.2')";

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
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.1275.1.1.2')
	 * @param dischargeInstructions The receiving '<em><b>Discharge Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralHeaderConstraintsTemplateId(DischargeInstructions dischargeInstructions,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ToCPackage.Literals.DISCHARGE_INSTRUCTIONS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ToCValidator.DIAGNOSTIC_SOURCE,
					ToCValidator.DISCHARGE_INSTRUCTIONS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"GeneralHeaderConstraintsTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									dischargeInstructions, context) }), new Object[] { dischargeInstructions }));
			}
			return false;
		}
		return true;
	}

} // DischargeInstructionsOperations
