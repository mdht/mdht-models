/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Treatment Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlannedObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlannedEncounter2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Encounter2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlannedAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlannedProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlannedMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlannedSupply2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Supply2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2HandoffCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Handoff Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2NutritionRecommendations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Nutrition Recommendations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedObservation2s() <em>Get Consol Planned Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedEncounter2s() <em>Get Consol Planned Encounter2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedAct2s() <em>Get Consol Planned Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedProcedure2s() <em>Get Consol Planned Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedMedicationActivity2s() <em>Get Consol Planned Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedSupply2s() <em>Get Consol Planned Supply2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolInstruction2s() <em>Get Consol Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getHandoffCommunications() <em>Get Handoff Communications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getNutritionRecommendationss() <em>Get Nutrition Recommendationss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfTreatmentSection2Operations extends PlanOfCareSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfTreatmentSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlannedObservation2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlannedObservation2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PlannedObservation2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlannedObservation2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlannedObservation2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlannedObservation2(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_PLANNED_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlannedObservation2"),
					new Object[] { planOfTreatmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlannedEncounter2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Encounter2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlannedEncounter2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::PlannedEncounter2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlannedEncounter2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Encounter2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlannedEncounter2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlannedEncounter2(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_PLANNED_ENCOUNTER2,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlannedEncounter2"),
					new Object[] { planOfTreatmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlannedAct2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Act2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlannedAct2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PlannedAct2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlannedAct2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Act2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlannedAct2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlannedAct2(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_PLANNED_ACT2,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlannedAct2"),
					new Object[] { planOfTreatmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlannedProcedure2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Procedure2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlannedProcedure2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::PlannedProcedure2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlannedProcedure2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Procedure2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlannedProcedure2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlannedProcedure2(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_PLANNED_PROCEDURE2,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlannedProcedure2"),
					new Object[] { planOfTreatmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlannedMedicationActivity2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Medication Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlannedMedicationActivity2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::PlannedMedicationActivity2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlannedMedicationActivity2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Medication Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlannedMedicationActivity2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlannedMedicationActivity2(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_PLANNED_MEDICATION_ACTIVITY2,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlannedMedicationActivity2"),
					new Object[] { planOfTreatmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlannedSupply2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Supply2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlannedSupply2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::PlannedSupply2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlannedSupply2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Supply2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlannedSupply2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlannedSupply2(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_PLANNED_SUPPLY2,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlannedSupply2"),
					new Object[] { planOfTreatmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionInstruction2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionInstruction2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::Instruction2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionInstruction2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instruction2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionInstruction2(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionInstruction2(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_INSTRUCTION2,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionInstruction2"),
					new Object[] { planOfTreatmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2HandoffCommunication(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Handoff Communication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2HandoffCommunication(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HandoffCommunication))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2HandoffCommunication(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Handoff Communication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2HandoffCommunication(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfTreatmentSection2HandoffCommunication(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION,
					ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2HandoffCommunication"),
					new Object[] { planOfTreatmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2NutritionRecommendations(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Nutrition Recommendations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2NutritionRecommendations(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::NutritionRecommendations))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2NutritionRecommendations(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Nutrition Recommendations</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2NutritionRecommendations(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfTreatmentSection2NutritionRecommendations(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATIONS,
					ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2NutritionRecommendations"),
					new Object[] { planOfTreatmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedObservation2s(PlanOfTreatmentSection2) <em>Get Consol Planned Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedObservation2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlannedObservation2)).oclAsType(consol::PlannedObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedObservation2s(PlanOfTreatmentSection2) <em>Get Consol Planned Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedObservation2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedObservation2> getConsolPlannedObservation2s(
			PlanOfTreatmentSection2 planOfTreatmentSection2) {
		if (GET_CONSOL_PLANNED_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2,
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(83));
			try {
				GET_CONSOL_PLANNED_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_PLANNED_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedObservation2> result = (Collection<PlannedObservation2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedEncounter2s(PlanOfTreatmentSection2) <em>Get Consol Planned Encounter2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedEncounter2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_ENCOUNTER2S__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlannedEncounter2)).oclAsType(consol::PlannedEncounter2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedEncounter2s(PlanOfTreatmentSection2) <em>Get Consol Planned Encounter2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedEncounter2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_ENCOUNTER2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedEncounter2> getConsolPlannedEncounter2s(PlanOfTreatmentSection2 planOfTreatmentSection2) {
		if (GET_CONSOL_PLANNED_ENCOUNTER2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2,
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(84));
			try {
				GET_CONSOL_PLANNED_ENCOUNTER2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_ENCOUNTER2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_PLANNED_ENCOUNTER2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedEncounter2> result = (Collection<PlannedEncounter2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedEncounter2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedAct2s(PlanOfTreatmentSection2) <em>Get Consol Planned Act2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedAct2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_ACT2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedAct2)).oclAsType(consol::PlannedAct2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedAct2s(PlanOfTreatmentSection2) <em>Get Consol Planned Act2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedAct2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_ACT2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedAct2> getConsolPlannedAct2s(PlanOfTreatmentSection2 planOfTreatmentSection2) {
		if (GET_CONSOL_PLANNED_ACT2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2,
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(85));
			try {
				GET_CONSOL_PLANNED_ACT2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_ACT2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_PLANNED_ACT2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedAct2> result = (Collection<PlannedAct2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedAct2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedProcedure2s(PlanOfTreatmentSection2) <em>Get Consol Planned Procedure2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedProcedure2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_PROCEDURE2S__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlannedProcedure2)).oclAsType(consol::PlannedProcedure2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedProcedure2s(PlanOfTreatmentSection2) <em>Get Consol Planned Procedure2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedProcedure2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_PROCEDURE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedProcedure2> getConsolPlannedProcedure2s(PlanOfTreatmentSection2 planOfTreatmentSection2) {
		if (GET_CONSOL_PLANNED_PROCEDURE2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2,
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(86));
			try {
				GET_CONSOL_PLANNED_PROCEDURE2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_PROCEDURE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_PLANNED_PROCEDURE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedProcedure2> result = (Collection<PlannedProcedure2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedProcedure2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedMedicationActivity2s(PlanOfTreatmentSection2) <em>Get Consol Planned Medication Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedMedicationActivity2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_MEDICATION_ACTIVITY2S__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedMedicationActivity2)).oclAsType(consol::PlannedMedicationActivity2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedMedicationActivity2s(PlanOfTreatmentSection2) <em>Get Consol Planned Medication Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedMedicationActivity2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_MEDICATION_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedMedicationActivity2> getConsolPlannedMedicationActivity2s(
			PlanOfTreatmentSection2 planOfTreatmentSection2) {
		if (GET_CONSOL_PLANNED_MEDICATION_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2,
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(87));
			try {
				GET_CONSOL_PLANNED_MEDICATION_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_MEDICATION_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_PLANNED_MEDICATION_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedMedicationActivity2> result = (Collection<PlannedMedicationActivity2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedMedicationActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedSupply2s(PlanOfTreatmentSection2) <em>Get Consol Planned Supply2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedSupply2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_SUPPLY2S__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlannedSupply2)).oclAsType(consol::PlannedSupply2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedSupply2s(PlanOfTreatmentSection2) <em>Get Consol Planned Supply2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedSupply2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_SUPPLY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedSupply2> getConsolPlannedSupply2s(PlanOfTreatmentSection2 planOfTreatmentSection2) {
		if (GET_CONSOL_PLANNED_SUPPLY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2,
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(88));
			try {
				GET_CONSOL_PLANNED_SUPPLY2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_SUPPLY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_PLANNED_SUPPLY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedSupply2> result = (Collection<PlannedSupply2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedSupply2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolInstruction2s(PlanOfTreatmentSection2) <em>Get Consol Instruction2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstruction2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INSTRUCTION2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getConsolInstruction2s(PlanOfTreatmentSection2) <em>Get Consol Instruction2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstruction2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INSTRUCTION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Instruction2> getConsolInstruction2s(PlanOfTreatmentSection2 planOfTreatmentSection2) {
		if (GET_CONSOL_INSTRUCTION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2,
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(89));
			try {
				GET_CONSOL_INSTRUCTION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_INSTRUCTION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_INSTRUCTION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instruction2> result = (Collection<Instruction2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<Instruction2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHandoffCommunications(PlanOfTreatmentSection2) <em>Get Handoff Communications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandoffCommunications(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HANDOFF_COMMUNICATIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HandoffCommunication)).oclAsType(consol::HandoffCommunication)";

	/**
	 * The cached OCL query for the '{@link #getHandoffCommunications(PlanOfTreatmentSection2) <em>Get Handoff Communications</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandoffCommunications(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HANDOFF_COMMUNICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<HandoffCommunication> getHandoffCommunications(PlanOfTreatmentSection2 planOfTreatmentSection2) {
		if (GET_HANDOFF_COMMUNICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2,
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(90));
			try {
				GET_HANDOFF_COMMUNICATIONS__EOCL_QRY = helper.createQuery(GET_HANDOFF_COMMUNICATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HANDOFF_COMMUNICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HandoffCommunication> result = (Collection<HandoffCommunication>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<HandoffCommunication>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionRecommendationss(PlanOfTreatmentSection2) <em>Get Nutrition Recommendationss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionRecommendationss(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_RECOMMENDATIONSS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NutritionRecommendations)).oclAsType(consol::NutritionRecommendations)";

	/**
	 * The cached OCL query for the '{@link #getNutritionRecommendationss(PlanOfTreatmentSection2) <em>Get Nutrition Recommendationss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionRecommendationss(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_RECOMMENDATIONSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NutritionRecommendations> getNutritionRecommendationss(
			PlanOfTreatmentSection2 planOfTreatmentSection2) {
		if (GET_NUTRITION_RECOMMENDATIONSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2,
				ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(91));
			try {
				GET_NUTRITION_RECOMMENDATIONSS__EOCL_QRY = helper.createQuery(GET_NUTRITION_RECOMMENDATIONSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUTRITION_RECOMMENDATIONSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NutritionRecommendations> result = (Collection<NutritionRecommendations>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<NutritionRecommendations>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionTemplateId(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionTemplateId(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.10.2')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionTemplateId(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionTemplateId(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionTemplateId(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionTemplateId"),
					new Object[] { planOfTreatmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_CODE_P,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionCodeP"), new Object[] { planOfTreatmentSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSectionCodeP", passToken);
				}
				passToken.add(planOfTreatmentSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionCode(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCode(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '18776-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionCode(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCode(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionCode(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(planOfTreatmentSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionCode"), new Object[] { planOfTreatmentSection2 }));
			}

			return false;
		}
		return true;
	}

} // PlanOfTreatmentSection2Operations
