/**
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Intervention Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActAdvanceDirectiveObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Advance Directive Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActImmunizationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Immunization Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActProcedureActivityAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActInterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActProcedureActivityObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActProcedureActivityProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEncounterActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Encounter Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActNonMedicinalSupplyActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Non Medicinal Supply Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedEncounter2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Encounter2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedSupply2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Supply2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActNutritionRecommendation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Nutrition Recommendation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryReferenceDocInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Doc Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryReferenceGoalObs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Goal Obs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActHandoffCommunicationParticipants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Handoff Communication Participants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Immunization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getAdvanceDirectiveObservation2s() <em>Get Advance Directive Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getImmunizationActivity2s() <em>Get Immunization Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getMedicationActivity2s() <em>Get Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getProcedureActivityAct2s() <em>Get Procedure Activity Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getInterventionActs() <em>Get Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getProcedureActivityObservation2s() <em>Get Procedure Activity Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getProcedureActivityProcedure2s() <em>Get Procedure Activity Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getEncounterActivity2s() <em>Get Encounter Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getNonMedicinalSupplyActivity2s() <em>Get Non Medicinal Supply Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedAct2s() <em>Get Planned Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedEncounter2s() <em>Get Planned Encounter2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedObservation2s() <em>Get Planned Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedProcedure2s() <em>Get Planned Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedMedicationActivity2s() <em>Get Planned Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedSupply2s() <em>Get Planned Supply2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getNutritionRecommendations() <em>Get Nutrition Recommendations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getEntryReferenceDocInstances() <em>Get Entry Reference Doc Instances</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getEntryReferenceGoalObs() <em>Get Entry Reference Goal Obs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getHandoffCommunicationParticipantss() <em>Get Handoff Communication Participantss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedImmunizationActivities() <em>Get Planned Immunization Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedInterventionActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedInterventionActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActTemplateId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActTemplateId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.146' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActTemplateId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActTemplateId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActTemplateId(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActTemplateId"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActClassCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActClassCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActClassCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActClassCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActClassCode(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActClassCode"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActMoodCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActMoodCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActMoodCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActMoodCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActMoodCodeP(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_MOOD_CODE_P,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActMoodCodeP"),
						new Object[] { plannedInterventionAct }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActMoodCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActMoodCodeP", passToken);
				}
				passToken.add(plannedInterventionAct);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActMoodCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActMoodCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentActMood) and " +
			"let value : vocab::x_DocumentActMood = self.moodCode.oclAsType(vocab::x_DocumentActMood) in " +
			"value = vocab::x_DocumentActMood::APT or value = vocab::x_DocumentActMood::ARQ or value = vocab::x_DocumentActMood::INT or value = vocab::x_DocumentActMood::PRMS or value = vocab::x_DocumentActMood::PRP or value = vocab::x_DocumentActMood::RQO";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActMoodCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActMoodCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActMoodCode(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActMoodCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(plannedInterventionAct)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActMoodCode"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActId(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ID,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActId"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActCodeP(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_CODE_P,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActCodeP"),
						new Object[] { plannedInterventionAct }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActCodeP", passToken);
				}
				passToken.add(plannedInterventionAct);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '362956003' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActCode(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(plannedInterventionAct)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActCode"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActStatusCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActStatusCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActStatusCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActStatusCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActStatusCode(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActStatusCode"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActStatusCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActStatusCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActStatusCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActStatusCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActStatusCodeP(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActStatusCodeP"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEffectiveTime(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEffectiveTime(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEffectiveTime(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEffectiveTime(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActEffectiveTime(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEffectiveTime"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActAuthorParticipation(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActAuthorParticipation(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActAuthorParticipation(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActAuthorParticipation(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActAuthorParticipation(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActAuthorParticipation"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActAdvanceDirectiveObservation2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Advance Directive Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActAdvanceDirectiveObservation2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AdvanceDirectiveObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActAdvanceDirectiveObservation2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Advance Directive Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActAdvanceDirectiveObservation2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActAdvanceDirectiveObservation2(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActAdvanceDirectiveObservation2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActImmunizationActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Immunization Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActImmunizationActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::ImmunizationActivity2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActImmunizationActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Immunization Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActImmunizationActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActImmunizationActivity2(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActImmunizationActivity2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActMedicationActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Medication Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActMedicationActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActMedicationActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Medication Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActMedicationActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActMedicationActivity2(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActMedicationActivity2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActProcedureActivityAct2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Act2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActProcedureActivityAct2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::ProcedureActivityAct2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActProcedureActivityAct2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Act2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActProcedureActivityAct2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActProcedureActivityAct2(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActProcedureActivityAct2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActInterventionAct(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Intervention Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActInterventionAct(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::InterventionAct) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActInterventionAct(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Intervention Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActInterventionAct(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActInterventionAct(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_INTERVENTION_ACT,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActInterventionAct"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActProcedureActivityObservation2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActProcedureActivityObservation2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProcedureActivityObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActProcedureActivityObservation2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActProcedureActivityObservation2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActProcedureActivityObservation2(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActProcedureActivityObservation2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActProcedureActivityProcedure2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Procedure2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActProcedureActivityProcedure2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(consol::ProcedureActivityProcedure2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActProcedureActivityProcedure2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Procedure2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActProcedureActivityProcedure2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActProcedureActivityProcedure2(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActProcedureActivityProcedure2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEncounterActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Encounter Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEncounterActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.encounter.oclIsUndefined() and entryRelationship.encounter.oclIsKindOf(consol::EncounterActivity2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEncounterActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Encounter Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEncounterActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActEncounterActivity2(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActEncounterActivity2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActInstruction2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActInstruction2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActInstruction2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Instruction2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActInstruction2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActInstruction2(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_INSTRUCTION2,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActInstruction2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActNonMedicinalSupplyActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Non Medicinal Supply Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActNonMedicinalSupplyActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActNonMedicinalSupplyActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Non Medicinal Supply Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActNonMedicinalSupplyActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActNonMedicinalSupplyActivity2(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActNonMedicinalSupplyActivity2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedAct2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Act2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedAct2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PlannedAct2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedAct2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Act2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedAct2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActPlannedAct2(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_ACT2,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActPlannedAct2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedEncounter2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Encounter2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedEncounter2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.encounter.oclIsUndefined() and entryRelationship.encounter.oclIsKindOf(consol::PlannedEncounter2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedEncounter2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Encounter2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedEncounter2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActPlannedEncounter2(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActPlannedEncounter2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedObservation2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedObservation2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PlannedObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedObservation2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedObservation2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActPlannedObservation2(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActPlannedObservation2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedProcedure2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Procedure2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedProcedure2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(consol::PlannedProcedure2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedProcedure2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Procedure2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedProcedure2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActPlannedProcedure2(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActPlannedProcedure2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedMedicationActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Medication Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedMedicationActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::PlannedMedicationActivity2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedMedicationActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Medication Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedMedicationActivity2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActPlannedMedicationActivity2(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActPlannedMedicationActivity2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedSupply2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Supply2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedSupply2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::PlannedSupply2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedSupply2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Supply2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedSupply2(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActPlannedSupply2(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActPlannedSupply2"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActNutritionRecommendation(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Nutrition Recommendation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActNutritionRecommendation(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::NutritionRecommendation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActNutritionRecommendation(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Nutrition Recommendation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActNutritionRecommendation(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActNutritionRecommendation(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActNutritionRecommendation"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryReferenceDocInstance(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Doc Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryReferenceDocInstance(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_DOC_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryReferenceDocInstance(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Doc Instance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryReferenceDocInstance(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_DOC_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActEntryReferenceDocInstance(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_DOC_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_DOC_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_DOC_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_DOC_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_DOC_INSTANCE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActEntryReferenceDocInstance"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryReferenceGoalObs(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Goal Obs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryReferenceGoalObs(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryReferenceGoalObs(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Goal Obs</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryReferenceGoalObs(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActEntryReferenceGoalObs(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_GOAL_OBS,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActEntryReferenceGoalObs"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActHandoffCommunicationParticipants(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Handoff Communication Participants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActHandoffCommunicationParticipants(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::HandoffCommunicationParticipants) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActHandoffCommunicationParticipants(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Handoff Communication Participants</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActHandoffCommunicationParticipants(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActHandoffCommunicationParticipants(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActHandoffCommunicationParticipants"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedImmunizationActivity(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Immunization Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedImmunizationActivity(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::PlannedImmunizationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedImmunizationActivity(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Immunization Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedImmunizationActivity(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActPlannedImmunizationActivity(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY,
						ConsolPlugin.INSTANCE.getString(
							"PlannedInterventionActPlannedInterventionActPlannedImmunizationActivity"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActReference(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActReference"),
						new Object[] { plannedInterventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActReferenceTypeCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActReferenceTypeCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActReferenceTypeCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActReferenceTypeCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedInterventionActReferenceTypeCode(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			plannedInterventionAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PlannedInterventionActPlannedInterventionActReferenceTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActReferenceExternalDocumentReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference External Document Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActReferenceExternalDocumentReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActReferenceExternalDocumentReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference External Document Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActReferenceExternalDocumentReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedInterventionActReferenceExternalDocumentReference(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			plannedInterventionAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE,
							ConsolPlugin.INSTANCE.getString(
								"PlannedInterventionActPlannedInterventionActReferenceExternalDocumentReference"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectiveObservation2s(PlannedInterventionAct) <em>Get Advance Directive Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectiveObservation2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveObservation2)).oclAsType(consol::AdvanceDirectiveObservation2)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectiveObservation2s(PlannedInterventionAct) <em>Get Advance Directive Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectiveObservation2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AdvanceDirectiveObservation2> getAdvanceDirectiveObservation2s(
			PlannedInterventionAct plannedInterventionAct) {
		if (GET_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(86));
			try {
				GET_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AdvanceDirectiveObservation2> result = (Collection<AdvanceDirectiveObservation2>) query.evaluate(
			plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<AdvanceDirectiveObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationActivity2s(PlannedInterventionAct) <em>Get Immunization Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationActivity2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATION_ACTIVITY2S__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity2)).oclAsType(consol::ImmunizationActivity2)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationActivity2s(PlannedInterventionAct) <em>Get Immunization Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationActivity2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATION_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ImmunizationActivity2> getImmunizationActivity2s(
			PlannedInterventionAct plannedInterventionAct) {
		if (GET_IMMUNIZATION_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(87));
			try {
				GET_IMMUNIZATION_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_IMMUNIZATION_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATION_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ImmunizationActivity2> result = (Collection<ImmunizationActivity2>) query.evaluate(
			plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<ImmunizationActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationActivity2s(PlannedInterventionAct) <em>Get Medication Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivity2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_ACTIVITY2S__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity2)).oclAsType(consol::MedicationActivity2)";

	/**
	 * The cached OCL query for the '{@link #getMedicationActivity2s(PlannedInterventionAct) <em>Get Medication Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivity2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MedicationActivity2> getMedicationActivity2s(PlannedInterventionAct plannedInterventionAct) {
		if (GET_MEDICATION_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(88));
			try {
				GET_MEDICATION_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationActivity2> result = (Collection<MedicationActivity2>) query.evaluate(
			plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<MedicationActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureActivityAct2s(PlannedInterventionAct) <em>Get Procedure Activity Act2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityAct2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ACTIVITY_ACT2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProcedureActivityAct2)).oclAsType(consol::ProcedureActivityAct2)";

	/**
	 * The cached OCL query for the '{@link #getProcedureActivityAct2s(PlannedInterventionAct) <em>Get Procedure Activity Act2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityAct2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITY_ACT2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProcedureActivityAct2> getProcedureActivityAct2s(
			PlannedInterventionAct plannedInterventionAct) {
		if (GET_PROCEDURE_ACTIVITY_ACT2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(89));
			try {
				GET_PROCEDURE_ACTIVITY_ACT2S__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ACTIVITY_ACT2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ACTIVITY_ACT2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityAct2> result = (Collection<ProcedureActivityAct2>) query.evaluate(
			plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<ProcedureActivityAct2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInterventionActs(PlannedInterventionAct) <em>Get Intervention Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionActs(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERVENTION_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InterventionAct)).oclAsType(consol::InterventionAct)";

	/**
	 * The cached OCL query for the '{@link #getInterventionActs(PlannedInterventionAct) <em>Get Intervention Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionActs(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERVENTION_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<InterventionAct> getInterventionActs(PlannedInterventionAct plannedInterventionAct) {
		if (GET_INTERVENTION_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(90));
			try {
				GET_INTERVENTION_ACTS__EOCL_QRY = helper.createQuery(GET_INTERVENTION_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERVENTION_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InterventionAct> result = (Collection<InterventionAct>) query.evaluate(plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<InterventionAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureActivityObservation2s(PlannedInterventionAct) <em>Get Procedure Activity Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityObservation2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProcedureActivityObservation2)).oclAsType(consol::ProcedureActivityObservation2)";

	/**
	 * The cached OCL query for the '{@link #getProcedureActivityObservation2s(PlannedInterventionAct) <em>Get Procedure Activity Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityObservation2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProcedureActivityObservation2> getProcedureActivityObservation2s(
			PlannedInterventionAct plannedInterventionAct) {
		if (GET_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(91));
			try {
				GET_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityObservation2> result = (Collection<ProcedureActivityObservation2>) query.evaluate(
			plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<ProcedureActivityObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureActivityProcedure2s(PlannedInterventionAct) <em>Get Procedure Activity Procedure2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityProcedure2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)).oclAsType(consol::ProcedureActivityProcedure2)";

	/**
	 * The cached OCL query for the '{@link #getProcedureActivityProcedure2s(PlannedInterventionAct) <em>Get Procedure Activity Procedure2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityProcedure2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProcedureActivityProcedure2> getProcedureActivityProcedure2s(
			PlannedInterventionAct plannedInterventionAct) {
		if (GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(92));
			try {
				GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY = helper.createQuery(
					GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityProcedure2> result = (Collection<ProcedureActivityProcedure2>) query.evaluate(
			plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<ProcedureActivityProcedure2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncounterActivity2s(PlannedInterventionAct) <em>Get Encounter Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterActivity2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTER_ACTIVITY2S__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivity2)).oclAsType(consol::EncounterActivity2)";

	/**
	 * The cached OCL query for the '{@link #getEncounterActivity2s(PlannedInterventionAct) <em>Get Encounter Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterActivity2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTER_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EncounterActivity2> getEncounterActivity2s(PlannedInterventionAct plannedInterventionAct) {
		if (GET_ENCOUNTER_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(93));
			try {
				GET_ENCOUNTER_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_ENCOUNTER_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTER_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EncounterActivity2> result = (Collection<EncounterActivity2>) query.evaluate(plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<EncounterActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstruction2s(PlannedInterventionAct) <em>Get Instruction2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTION2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getInstruction2s(PlannedInterventionAct) <em>Get Instruction2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Instruction2> getInstruction2s(PlannedInterventionAct plannedInterventionAct) {
		if (GET_INSTRUCTION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(94));
			try {
				GET_INSTRUCTION2S__EOCL_QRY = helper.createQuery(GET_INSTRUCTION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instruction2> result = (Collection<Instruction2>) query.evaluate(plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<Instruction2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonMedicinalSupplyActivity2s(PlannedInterventionAct) <em>Get Non Medicinal Supply Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMedicinalSupplyActivity2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2)).oclAsType(consol::NonMedicinalSupplyActivity2)";

	/**
	 * The cached OCL query for the '{@link #getNonMedicinalSupplyActivity2s(PlannedInterventionAct) <em>Get Non Medicinal Supply Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMedicinalSupplyActivity2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NonMedicinalSupplyActivity2> getNonMedicinalSupplyActivity2s(
			PlannedInterventionAct plannedInterventionAct) {
		if (GET_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(95));
			try {
				GET_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY = helper.createQuery(
					GET_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonMedicinalSupplyActivity2> result = (Collection<NonMedicinalSupplyActivity2>) query.evaluate(
			plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<NonMedicinalSupplyActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedAct2s(PlannedInterventionAct) <em>Get Planned Act2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedAct2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_ACT2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedAct2)).oclAsType(consol::PlannedAct2)";

	/**
	 * The cached OCL query for the '{@link #getPlannedAct2s(PlannedInterventionAct) <em>Get Planned Act2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedAct2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_ACT2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedAct2> getPlannedAct2s(PlannedInterventionAct plannedInterventionAct) {
		if (GET_PLANNED_ACT2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(96));
			try {
				GET_PLANNED_ACT2S__EOCL_QRY = helper.createQuery(GET_PLANNED_ACT2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_ACT2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedAct2> result = (Collection<PlannedAct2>) query.evaluate(plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<PlannedAct2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedEncounter2s(PlannedInterventionAct) <em>Get Planned Encounter2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedEncounter2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_ENCOUNTER2S__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlannedEncounter2)).oclAsType(consol::PlannedEncounter2)";

	/**
	 * The cached OCL query for the '{@link #getPlannedEncounter2s(PlannedInterventionAct) <em>Get Planned Encounter2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedEncounter2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_ENCOUNTER2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedEncounter2> getPlannedEncounter2s(PlannedInterventionAct plannedInterventionAct) {
		if (GET_PLANNED_ENCOUNTER2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(97));
			try {
				GET_PLANNED_ENCOUNTER2S__EOCL_QRY = helper.createQuery(GET_PLANNED_ENCOUNTER2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_ENCOUNTER2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedEncounter2> result = (Collection<PlannedEncounter2>) query.evaluate(plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<PlannedEncounter2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedObservation2s(PlannedInterventionAct) <em>Get Planned Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedObservation2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlannedObservation2)).oclAsType(consol::PlannedObservation2)";

	/**
	 * The cached OCL query for the '{@link #getPlannedObservation2s(PlannedInterventionAct) <em>Get Planned Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedObservation2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedObservation2> getPlannedObservation2s(PlannedInterventionAct plannedInterventionAct) {
		if (GET_PLANNED_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(98));
			try {
				GET_PLANNED_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_PLANNED_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedObservation2> result = (Collection<PlannedObservation2>) query.evaluate(
			plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<PlannedObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedProcedure2s(PlannedInterventionAct) <em>Get Planned Procedure2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedProcedure2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_PROCEDURE2S__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlannedProcedure2)).oclAsType(consol::PlannedProcedure2)";

	/**
	 * The cached OCL query for the '{@link #getPlannedProcedure2s(PlannedInterventionAct) <em>Get Planned Procedure2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedProcedure2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_PROCEDURE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedProcedure2> getPlannedProcedure2s(PlannedInterventionAct plannedInterventionAct) {
		if (GET_PLANNED_PROCEDURE2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(99));
			try {
				GET_PLANNED_PROCEDURE2S__EOCL_QRY = helper.createQuery(GET_PLANNED_PROCEDURE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_PROCEDURE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedProcedure2> result = (Collection<PlannedProcedure2>) query.evaluate(plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<PlannedProcedure2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedMedicationActivity2s(PlannedInterventionAct) <em>Get Planned Medication Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedMedicationActivity2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_MEDICATION_ACTIVITY2S__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedMedicationActivity2)).oclAsType(consol::PlannedMedicationActivity2)";

	/**
	 * The cached OCL query for the '{@link #getPlannedMedicationActivity2s(PlannedInterventionAct) <em>Get Planned Medication Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedMedicationActivity2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_MEDICATION_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedMedicationActivity2> getPlannedMedicationActivity2s(
			PlannedInterventionAct plannedInterventionAct) {
		if (GET_PLANNED_MEDICATION_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(100));
			try {
				GET_PLANNED_MEDICATION_ACTIVITY2S__EOCL_QRY = helper.createQuery(
					GET_PLANNED_MEDICATION_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_MEDICATION_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedMedicationActivity2> result = (Collection<PlannedMedicationActivity2>) query.evaluate(
			plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<PlannedMedicationActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedSupply2s(PlannedInterventionAct) <em>Get Planned Supply2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedSupply2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_SUPPLY2S__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlannedSupply2)).oclAsType(consol::PlannedSupply2)";

	/**
	 * The cached OCL query for the '{@link #getPlannedSupply2s(PlannedInterventionAct) <em>Get Planned Supply2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedSupply2s(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_SUPPLY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedSupply2> getPlannedSupply2s(PlannedInterventionAct plannedInterventionAct) {
		if (GET_PLANNED_SUPPLY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(101));
			try {
				GET_PLANNED_SUPPLY2S__EOCL_QRY = helper.createQuery(GET_PLANNED_SUPPLY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_SUPPLY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedSupply2> result = (Collection<PlannedSupply2>) query.evaluate(plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<PlannedSupply2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionRecommendations(PlannedInterventionAct) <em>Get Nutrition Recommendations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionRecommendations(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_RECOMMENDATIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NutritionRecommendation)).oclAsType(consol::NutritionRecommendation)";

	/**
	 * The cached OCL query for the '{@link #getNutritionRecommendations(PlannedInterventionAct) <em>Get Nutrition Recommendations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionRecommendations(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_RECOMMENDATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NutritionRecommendation> getNutritionRecommendations(
			PlannedInterventionAct plannedInterventionAct) {
		if (GET_NUTRITION_RECOMMENDATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(102));
			try {
				GET_NUTRITION_RECOMMENDATIONS__EOCL_QRY = helper.createQuery(GET_NUTRITION_RECOMMENDATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUTRITION_RECOMMENDATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NutritionRecommendation> result = (Collection<NutritionRecommendation>) query.evaluate(
			plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<NutritionRecommendation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEntryReferenceDocInstances(PlannedInterventionAct) <em>Get Entry Reference Doc Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceDocInstances(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENTRY_REFERENCE_DOC_INSTANCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)).oclAsType(consol::EntryReference)";

	/**
	 * The cached OCL query for the '{@link #getEntryReferenceDocInstances(PlannedInterventionAct) <em>Get Entry Reference Doc Instances</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceDocInstances(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENTRY_REFERENCE_DOC_INSTANCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EntryReference> getEntryReferenceDocInstances(PlannedInterventionAct plannedInterventionAct) {
		if (GET_ENTRY_REFERENCE_DOC_INSTANCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(103));
			try {
				GET_ENTRY_REFERENCE_DOC_INSTANCES__EOCL_QRY = helper.createQuery(
					GET_ENTRY_REFERENCE_DOC_INSTANCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY_REFERENCE_DOC_INSTANCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EntryReference> result = (Collection<EntryReference>) query.evaluate(plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<EntryReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEntryReferenceGoalObs(PlannedInterventionAct) <em>Get Entry Reference Goal Obs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceGoalObs(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENTRY_REFERENCE_GOAL_OBS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference))->asSequence()->any(true).oclAsType(consol::EntryReference)";

	/**
	 * The cached OCL query for the '{@link #getEntryReferenceGoalObs(PlannedInterventionAct) <em>Get Entry Reference Goal Obs</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceGoalObs(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENTRY_REFERENCE_GOAL_OBS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EntryReference getEntryReferenceGoalObs(PlannedInterventionAct plannedInterventionAct) {
		if (GET_ENTRY_REFERENCE_GOAL_OBS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(104));
			try {
				GET_ENTRY_REFERENCE_GOAL_OBS__EOCL_QRY = helper.createQuery(GET_ENTRY_REFERENCE_GOAL_OBS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY_REFERENCE_GOAL_OBS__EOCL_QRY);
		return (EntryReference) query.evaluate(plannedInterventionAct);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHandoffCommunicationParticipantss(PlannedInterventionAct) <em>Get Handoff Communication Participantss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandoffCommunicationParticipantss(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HANDOFF_COMMUNICATION_PARTICIPANTSS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HandoffCommunicationParticipants)).oclAsType(consol::HandoffCommunicationParticipants)";

	/**
	 * The cached OCL query for the '{@link #getHandoffCommunicationParticipantss(PlannedInterventionAct) <em>Get Handoff Communication Participantss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandoffCommunicationParticipantss(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HANDOFF_COMMUNICATION_PARTICIPANTSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<HandoffCommunicationParticipants> getHandoffCommunicationParticipantss(
			PlannedInterventionAct plannedInterventionAct) {
		if (GET_HANDOFF_COMMUNICATION_PARTICIPANTSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(105));
			try {
				GET_HANDOFF_COMMUNICATION_PARTICIPANTSS__EOCL_QRY = helper.createQuery(
					GET_HANDOFF_COMMUNICATION_PARTICIPANTSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HANDOFF_COMMUNICATION_PARTICIPANTSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HandoffCommunicationParticipants> result = (Collection<HandoffCommunicationParticipants>) query.evaluate(
			plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<HandoffCommunicationParticipants>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedImmunizationActivities(PlannedInterventionAct) <em>Get Planned Immunization Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedImmunizationActivities(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_IMMUNIZATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedImmunizationActivity)).oclAsType(consol::PlannedImmunizationActivity)";

	/**
	 * The cached OCL query for the '{@link #getPlannedImmunizationActivities(PlannedInterventionAct) <em>Get Planned Immunization Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedImmunizationActivities(PlannedInterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_IMMUNIZATION_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedImmunizationActivity> getPlannedImmunizationActivities(
			PlannedInterventionAct plannedInterventionAct) {
		if (GET_PLANNED_IMMUNIZATION_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT,
				ConsolPackage.Literals.PLANNED_INTERVENTION_ACT.getEAllOperations().get(106));
			try {
				GET_PLANNED_IMMUNIZATION_ACTIVITIES__EOCL_QRY = helper.createQuery(
					GET_PLANNED_IMMUNIZATION_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_IMMUNIZATION_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedImmunizationActivity> result = (Collection<PlannedImmunizationActivity>) query.evaluate(
			plannedInterventionAct);
		return new BasicEList.UnmodifiableEList<PlannedImmunizationActivity>(result.size(), result.toArray());
	}

} // PlannedInterventionActOperations
