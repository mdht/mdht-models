/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Of Treatment Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPlanOfTreatmentSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PlanOfTreatmentSection2TemplateId PlanOfCareSectionCode PlanOfCareSectionCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.10' templateId.extension='2014-06-09' constraints.validation.dependOn.PlanOfCareSectionCode='PlanOfCareSectionCodeP' constraints.validation.info='PlanOfCareSectionPlanOfCareActivityObservation PlanOfCareSectionPlanOfCareActivityEncounter PlanOfCareSectionPlanOfCareActivityAct PlanOfCareSectionPlanOfCareActivityProcedure PlanOfCareSectionPlanOfCareActivitySubstanceAdministration PlanOfCareSectionPlanOfCareActivitySupply PlanOfCareSectionInstructions PlanOfTreatmentSection2HandoffCommunication PlanOfTreatmentSection2NutritionRecommendation PlanOfTreatmentSection2PlannedImmunizationActivity PlanOfTreatmentSection2GoalObservation'"
 * @generated
 */
public interface PlanOfTreatmentSection2 extends PlanOfCareSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.10\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HandoffCommunicationParticipants))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2HandoffCommunication(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::NutritionRecommendation))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2NutritionRecommendation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::PlannedImmunizationActivity))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2PlannedImmunizationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::GoalObservation))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2GoalObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlannedObservation2)).oclAsType(consol::PlannedObservation2)'"
	 * @generated
	 */
	EList<PlannedObservation2> getConsolPlannedObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEncounters()-&gt;select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlannedEncounter2)).oclAsType(consol::PlannedEncounter2)'"
	 * @generated
	 */
	EList<PlannedEncounter2> getConsolPlannedEncounter2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedAct2)).oclAsType(consol::PlannedAct2)'"
	 * @generated
	 */
	EList<PlannedAct2> getConsolPlannedAct2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()-&gt;select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlannedProcedure2)).oclAsType(consol::PlannedProcedure2)'"
	 * @generated
	 */
	EList<PlannedProcedure2> getConsolPlannedProcedure2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()-&gt;select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedMedicationActivity2)).oclAsType(consol::PlannedMedicationActivity2)'"
	 * @generated
	 */
	EList<PlannedMedicationActivity2> getConsolPlannedMedicationActivity2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()-&gt;select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlannedSupply2)).oclAsType(consol::PlannedSupply2)'"
	 * @generated
	 */
	EList<PlannedSupply2> getConsolPlannedSupply2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)).oclAsType(consol::Instruction2)'"
	 * @generated
	 */
	EList<Instruction2> getConsolInstruction2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HandoffCommunicationParticipants)).oclAsType(consol::HandoffCommunicationParticipants)'"
	 * @generated
	 */
	EList<HandoffCommunicationParticipants> getHandoffCommunications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NutritionRecommendation)).oclAsType(consol::NutritionRecommendation)'"
	 * @generated
	 */
	EList<NutritionRecommendation> getNutritionRecommendations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()-&gt;select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedImmunizationActivity)).oclAsType(consol::PlannedImmunizationActivity)'"
	 * @generated
	 */
	EList<PlannedImmunizationActivity> getPlannedImmunizationActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::GoalObservation)).oclAsType(consol::GoalObservation)'"
	 * @generated
	 */
	EList<GoalObservation> getGoalObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfTreatmentSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfTreatmentSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PlanOfTreatmentSection2
