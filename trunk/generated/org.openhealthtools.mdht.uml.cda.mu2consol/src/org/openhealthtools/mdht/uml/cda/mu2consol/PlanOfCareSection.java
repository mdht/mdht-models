/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Plan Of Care Section</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getPlanOfCareSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mu2consolPlanOfCareSectionPlanOfCareActivityObservation Mu2consolPlanOfCareSectionTemplateId Mu2consolPlanOfCareSectionCarePlanningForPlanOfCare' templateId.root='2.16.840.1.113883.10.20.22.2.10'"
 * @generated
 */
public interface PlanOfCareSection extends
		org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getActs()->exists(a : cda::Act |
	 * a.oclIsKindOf(consol::PlanOfCareActivityAct)) or
	 * self.getObservations()->exists(o : cda::Observation |
	 * o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or
	 * self.getEncounters()->exists(e : cda::Encounter |
	 * e.oclIsKindOf(consol::PlanOfCareActivityEncounter))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::PlanOfCareActivityAct)) or self.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or self.getEncounters()->exists(e : cda::Encounter | e.oclIsKindOf(consol::PlanOfCareActivityEncounter))'"
	 * @generated
	 */
	boolean validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PlanOfCareActivityObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PlanOfCareActivityObservation))'"
	 * @generated
	 */
	boolean validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlanOfCareActivityAct)).oclAsType(consol::PlanOfCareActivityAct)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlanOfCareActivityAct)).oclAsType(consol::PlanOfCareActivityAct)'"
	 * @generated
	 */
	EList<PlanOfCareActivityAct> getMu2consolPlanOfCareActivityActs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlanOfCareActivityEncounter)).oclAsType(consol::PlanOfCareActivityEncounter)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlanOfCareActivityEncounter)).oclAsType(consol::PlanOfCareActivityEncounter)'"
	 * @generated
	 */
	EList<PlanOfCareActivityEncounter> getMu2consolPlanOfCareActivityEncounters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlanOfCareActivityObservation)).oclAsType(consol::PlanOfCareActivityObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlanOfCareActivityObservation)).oclAsType(consol::PlanOfCareActivityObservation)'"
	 * @generated
	 */
	EList<PlanOfCareActivityObservation> getMu2consolPlanOfCareActivityObservations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public PlanOfCareSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // PlanOfCareSection
