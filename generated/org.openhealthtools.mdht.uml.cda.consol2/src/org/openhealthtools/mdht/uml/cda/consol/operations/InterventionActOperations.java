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

import org.eclipse.emf.ecore.EObject;
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
import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Intervention Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActNutritionRecommendation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Nutrition Recommendation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActInterventionEntryReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Intervention Entry Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActGoalObsEntryReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Goal Obs Entry Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActAdvanceDirectiveObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Advance Directive Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActImmunizationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Immunization Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActProcedureActivityAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActProcedureActivityObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActProcedureActivityProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEncounterActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Encounter Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActNonMedicinalSupplyActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Non Medicinal Supply Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActHandoffCommunicationParticipants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Handoff Communication Participants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActPlannedInterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getInterventionActs() <em>Get Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getNutritionRecommendations() <em>Get Nutrition Recommendations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getInterventionEntryReferences() <em>Get Intervention Entry References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getAdvanceDirectiveObservation2s() <em>Get Advance Directive Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getImmunizationActivity2s() <em>Get Immunization Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getMedicationActivity2s() <em>Get Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getProcedureActivityAct2s() <em>Get Procedure Activity Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getProcedureActivityObservation2s() <em>Get Procedure Activity Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getProcedureActivityProcedure2s() <em>Get Procedure Activity Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getEncounterActivity2s() <em>Get Encounter Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getNonMedicinalSupplyActivity2s() <em>Get Non Medicinal Supply Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getHandoffCommunicationParticipantss() <em>Get Handoff Communication Participantss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getPlannedInterventionActs() <em>Get Planned Intervention Acts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterventionActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterventionActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActTemplateId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActTemplateId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.131')";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActTemplateId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActTemplateId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActTemplateId(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActTemplateId"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActClassCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActClassCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActClassCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActClassCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActClassCode(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActClassCode"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActMoodCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActMoodCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActMoodCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActMoodCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActMoodCode(InterventionAct interventionAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActMoodCode"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActId(InterventionAct interventionAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ID,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActId"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActCodeP(InterventionAct interventionAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_CODE_P,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActCodeP"),
					new Object[] { interventionAct }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.InterventionActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.InterventionActCodeP", passToken);
				}
				passToken.add(interventionAct);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '362956003' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActCode(InterventionAct interventionAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.InterventionActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(interventionAct)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_CODE,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActCode"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActStatusCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActStatusCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActStatusCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActStatusCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActStatusCode(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActStatusCode"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActStatusCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActStatusCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActStatusCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActStatusCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActStatusCodeP(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActStatusCodeP"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEffectiveTime(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEffectiveTime(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEffectiveTime(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEffectiveTime(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActEffectiveTime(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEffectiveTime"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionAct(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionAct(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::InterventionAct) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionAct(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionAct(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionAct(InterventionAct interventionAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionAct"), new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActNutritionRecommendation(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Nutrition Recommendation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActNutritionRecommendation(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::NutritionRecommendation))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActNutritionRecommendation(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Nutrition Recommendation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActNutritionRecommendation(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActNutritionRecommendation(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_NUTRITION_RECOMMENDATION,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActNutritionRecommendation"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActInterventionEntryReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Intervention Entry Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActInterventionEntryReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActInterventionEntryReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Intervention Entry Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActInterventionEntryReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActInterventionEntryReference(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INTERVENTION_ACT_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_INTERVENTION_ENTRY_REFERENCE,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActInterventionEntryReference"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActGoalObsEntryReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Goal Obs Entry Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActGoalObsEntryReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActGoalObsEntryReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Goal Obs Entry Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActGoalObsEntryReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActGoalObsEntryReference(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActGoalObsEntryReference"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActAuthorParticipation(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActAuthorParticipation(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActAuthorParticipation(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActAuthorParticipation(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActAuthorParticipation(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActAuthorParticipation"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActAdvanceDirectiveObservation2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Advance Directive Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActAdvanceDirectiveObservation2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AdvanceDirectiveObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActAdvanceDirectiveObservation2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Advance Directive Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActAdvanceDirectiveObservation2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActAdvanceDirectiveObservation2(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActAdvanceDirectiveObservation2"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActImmunizationActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Immunization Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActImmunizationActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::ImmunizationActivity2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActImmunizationActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Immunization Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActImmunizationActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActImmunizationActivity2(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActImmunizationActivity2"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActMedicationActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Medication Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActMedicationActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActMedicationActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Medication Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActMedicationActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActMedicationActivity2(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_MEDICATION_ACTIVITY2,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActMedicationActivity2"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActProcedureActivityAct2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Act2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActProcedureActivityAct2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::ProcedureActivityAct2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActProcedureActivityAct2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Act2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActProcedureActivityAct2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActProcedureActivityAct2(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActProcedureActivityAct2"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActProcedureActivityObservation2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActProcedureActivityObservation2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProcedureActivityObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActProcedureActivityObservation2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActProcedureActivityObservation2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActProcedureActivityObservation2(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActProcedureActivityObservation2"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActProcedureActivityProcedure2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Procedure2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActProcedureActivityProcedure2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(consol::ProcedureActivityProcedure2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActProcedureActivityProcedure2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Procedure2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActProcedureActivityProcedure2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActProcedureActivityProcedure2(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActProcedureActivityProcedure2"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEncounterActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Encounter Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEncounterActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.encounter.oclIsUndefined() and entryRelationship.encounter.oclIsKindOf(consol::EncounterActivity2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEncounterActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Encounter Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEncounterActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActEncounterActivity2(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENCOUNTER_ACTIVITY2,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEncounterActivity2"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActNonMedicinalSupplyActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Non Medicinal Supply Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActNonMedicinalSupplyActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActNonMedicinalSupplyActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Non Medicinal Supply Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActNonMedicinalSupplyActivity2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActNonMedicinalSupplyActivity2(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActNonMedicinalSupplyActivity2"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActInstruction2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActInstruction2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActInstruction2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Instruction2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActInstruction2(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActInstruction2(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_INSTRUCTION2,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActInstruction2"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActHandoffCommunicationParticipants(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Handoff Communication Participants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActHandoffCommunicationParticipants(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::HandoffCommunicationParticipants) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActHandoffCommunicationParticipants(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Handoff Communication Participants</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActHandoffCommunicationParticipants(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActHandoffCommunicationParticipants(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActHandoffCommunicationParticipants"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActPlannedInterventionAct(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Intervention Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActPlannedInterventionAct(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PlannedInterventionAct) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActPlannedInterventionAct(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Intervention Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActPlannedInterventionAct(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActPlannedInterventionAct(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_PLANNED_INTERVENTION_ACT,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActPlannedInterventionAct"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActReference(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("InterventionActInterventionActReference"),
					new Object[] { interventionAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActReferenceTypeCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActReferenceTypeCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActReferenceTypeCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActReferenceTypeCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateInterventionActReferenceTypeCode(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_REFERENCE_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("InterventionActInterventionActReferenceTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActReferenceExternalDocumentReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference External Document Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActReferenceExternalDocumentReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActReferenceExternalDocumentReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference External Document Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActReferenceExternalDocumentReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateInterventionActReferenceExternalDocumentReference(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("InterventionActInterventionActReferenceExternalDocumentReference"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInterventionActs(InterventionAct) <em>Get Intervention Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionActs(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERVENTION_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InterventionAct)).oclAsType(consol::InterventionAct)";

	/**
	 * The cached OCL query for the '{@link #getInterventionActs(InterventionAct) <em>Get Intervention Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionActs(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERVENTION_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<InterventionAct> getInterventionActs(InterventionAct interventionAct) {
		if (GET_INTERVENTION_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(79));
			try {
				GET_INTERVENTION_ACTS__EOCL_QRY = helper.createQuery(GET_INTERVENTION_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERVENTION_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InterventionAct> result = (Collection<InterventionAct>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<InterventionAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionRecommendations(InterventionAct) <em>Get Nutrition Recommendations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionRecommendations(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_RECOMMENDATIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NutritionRecommendation)).oclAsType(consol::NutritionRecommendation)";

	/**
	 * The cached OCL query for the '{@link #getNutritionRecommendations(InterventionAct) <em>Get Nutrition Recommendations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionRecommendations(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_RECOMMENDATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NutritionRecommendation> getNutritionRecommendations(InterventionAct interventionAct) {
		if (GET_NUTRITION_RECOMMENDATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(80));
			try {
				GET_NUTRITION_RECOMMENDATIONS__EOCL_QRY = helper.createQuery(GET_NUTRITION_RECOMMENDATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUTRITION_RECOMMENDATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NutritionRecommendation> result = (Collection<NutritionRecommendation>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<NutritionRecommendation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInterventionEntryReferences(InterventionAct) <em>Get Intervention Entry References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionEntryReferences(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERVENTION_ENTRY_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)).oclAsType(consol::EntryReference)";

	/**
	 * The cached OCL query for the '{@link #getInterventionEntryReferences(InterventionAct) <em>Get Intervention Entry References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionEntryReferences(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERVENTION_ENTRY_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EntryReference> getInterventionEntryReferences(InterventionAct interventionAct) {
		if (GET_INTERVENTION_ENTRY_REFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(81));
			try {
				GET_INTERVENTION_ENTRY_REFERENCES__EOCL_QRY = helper.createQuery(GET_INTERVENTION_ENTRY_REFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERVENTION_ENTRY_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EntryReference> result = (Collection<EntryReference>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<EntryReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectiveObservation2s(InterventionAct) <em>Get Advance Directive Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectiveObservation2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveObservation2)).oclAsType(consol::AdvanceDirectiveObservation2)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectiveObservation2s(InterventionAct) <em>Get Advance Directive Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectiveObservation2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AdvanceDirectiveObservation2> getAdvanceDirectiveObservation2s(InterventionAct interventionAct) {
		if (GET_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(82));
			try {
				GET_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AdvanceDirectiveObservation2> result = (Collection<AdvanceDirectiveObservation2>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<AdvanceDirectiveObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationActivity2s(InterventionAct) <em>Get Immunization Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationActivity2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATION_ACTIVITY2S__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity2)).oclAsType(consol::ImmunizationActivity2)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationActivity2s(InterventionAct) <em>Get Immunization Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationActivity2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATION_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ImmunizationActivity2> getImmunizationActivity2s(InterventionAct interventionAct) {
		if (GET_IMMUNIZATION_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(83));
			try {
				GET_IMMUNIZATION_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_IMMUNIZATION_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATION_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ImmunizationActivity2> result = (Collection<ImmunizationActivity2>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<ImmunizationActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationActivity2s(InterventionAct) <em>Get Medication Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivity2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_ACTIVITY2S__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity2)).oclAsType(consol::MedicationActivity2)";

	/**
	 * The cached OCL query for the '{@link #getMedicationActivity2s(InterventionAct) <em>Get Medication Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivity2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MedicationActivity2> getMedicationActivity2s(InterventionAct interventionAct) {
		if (GET_MEDICATION_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(84));
			try {
				GET_MEDICATION_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationActivity2> result = (Collection<MedicationActivity2>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<MedicationActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureActivityAct2s(InterventionAct) <em>Get Procedure Activity Act2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityAct2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ACTIVITY_ACT2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProcedureActivityAct2)).oclAsType(consol::ProcedureActivityAct2)";

	/**
	 * The cached OCL query for the '{@link #getProcedureActivityAct2s(InterventionAct) <em>Get Procedure Activity Act2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityAct2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITY_ACT2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProcedureActivityAct2> getProcedureActivityAct2s(InterventionAct interventionAct) {
		if (GET_PROCEDURE_ACTIVITY_ACT2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(85));
			try {
				GET_PROCEDURE_ACTIVITY_ACT2S__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ACTIVITY_ACT2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ACTIVITY_ACT2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityAct2> result = (Collection<ProcedureActivityAct2>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<ProcedureActivityAct2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureActivityObservation2s(InterventionAct) <em>Get Procedure Activity Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityObservation2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProcedureActivityObservation2)).oclAsType(consol::ProcedureActivityObservation2)";

	/**
	 * The cached OCL query for the '{@link #getProcedureActivityObservation2s(InterventionAct) <em>Get Procedure Activity Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityObservation2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProcedureActivityObservation2> getProcedureActivityObservation2s(InterventionAct interventionAct) {
		if (GET_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(86));
			try {
				GET_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityObservation2> result = (Collection<ProcedureActivityObservation2>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<ProcedureActivityObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureActivityProcedure2s(InterventionAct) <em>Get Procedure Activity Procedure2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityProcedure2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)).oclAsType(consol::ProcedureActivityProcedure2)";

	/**
	 * The cached OCL query for the '{@link #getProcedureActivityProcedure2s(InterventionAct) <em>Get Procedure Activity Procedure2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityProcedure2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProcedureActivityProcedure2> getProcedureActivityProcedure2s(InterventionAct interventionAct) {
		if (GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(87));
			try {
				GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityProcedure2> result = (Collection<ProcedureActivityProcedure2>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<ProcedureActivityProcedure2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncounterActivity2s(InterventionAct) <em>Get Encounter Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterActivity2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTER_ACTIVITY2S__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivity2)).oclAsType(consol::EncounterActivity2)";

	/**
	 * The cached OCL query for the '{@link #getEncounterActivity2s(InterventionAct) <em>Get Encounter Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterActivity2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTER_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EncounterActivity2> getEncounterActivity2s(InterventionAct interventionAct) {
		if (GET_ENCOUNTER_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(88));
			try {
				GET_ENCOUNTER_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_ENCOUNTER_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTER_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EncounterActivity2> result = (Collection<EncounterActivity2>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<EncounterActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonMedicinalSupplyActivity2s(InterventionAct) <em>Get Non Medicinal Supply Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMedicinalSupplyActivity2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2)).oclAsType(consol::NonMedicinalSupplyActivity2)";

	/**
	 * The cached OCL query for the '{@link #getNonMedicinalSupplyActivity2s(InterventionAct) <em>Get Non Medicinal Supply Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMedicinalSupplyActivity2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NonMedicinalSupplyActivity2> getNonMedicinalSupplyActivity2s(InterventionAct interventionAct) {
		if (GET_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(89));
			try {
				GET_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonMedicinalSupplyActivity2> result = (Collection<NonMedicinalSupplyActivity2>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<NonMedicinalSupplyActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstruction2s(InterventionAct) <em>Get Instruction2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTION2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getInstruction2s(InterventionAct) <em>Get Instruction2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Instruction2> getInstruction2s(InterventionAct interventionAct) {
		if (GET_INSTRUCTION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(90));
			try {
				GET_INSTRUCTION2S__EOCL_QRY = helper.createQuery(GET_INSTRUCTION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instruction2> result = (Collection<Instruction2>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<Instruction2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHandoffCommunicationParticipantss(InterventionAct) <em>Get Handoff Communication Participantss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandoffCommunicationParticipantss(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HANDOFF_COMMUNICATION_PARTICIPANTSS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HandoffCommunicationParticipants)).oclAsType(consol::HandoffCommunicationParticipants)";

	/**
	 * The cached OCL query for the '{@link #getHandoffCommunicationParticipantss(InterventionAct) <em>Get Handoff Communication Participantss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandoffCommunicationParticipantss(InterventionAct)
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
			InterventionAct interventionAct) {
		if (GET_HANDOFF_COMMUNICATION_PARTICIPANTSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(91));
			try {
				GET_HANDOFF_COMMUNICATION_PARTICIPANTSS__EOCL_QRY = helper.createQuery(GET_HANDOFF_COMMUNICATION_PARTICIPANTSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HANDOFF_COMMUNICATION_PARTICIPANTSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HandoffCommunicationParticipants> result = (Collection<HandoffCommunicationParticipants>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<HandoffCommunicationParticipants>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedInterventionActs(InterventionAct) <em>Get Planned Intervention Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedInterventionActs(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_INTERVENTION_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedInterventionAct)).oclAsType(consol::PlannedInterventionAct)";

	/**
	 * The cached OCL query for the '{@link #getPlannedInterventionActs(InterventionAct) <em>Get Planned Intervention Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedInterventionActs(InterventionAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_INTERVENTION_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedInterventionAct> getPlannedInterventionActs(InterventionAct interventionAct) {
		if (GET_PLANNED_INTERVENTION_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTION_ACT,
				ConsolPackage.Literals.INTERVENTION_ACT.getEAllOperations().get(92));
			try {
				GET_PLANNED_INTERVENTION_ACTS__EOCL_QRY = helper.createQuery(GET_PLANNED_INTERVENTION_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_INTERVENTION_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedInterventionAct> result = (Collection<PlannedInterventionAct>) query.evaluate(interventionAct);
		return new BasicEList.UnmodifiableEList<PlannedInterventionAct>(result.size(), result.toArray());
	}

} // InterventionActOperations
