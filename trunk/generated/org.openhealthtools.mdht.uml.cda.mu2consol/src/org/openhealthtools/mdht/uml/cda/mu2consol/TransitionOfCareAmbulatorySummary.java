/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Transition Of Care Ambulatory Summary</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getTransitionOfCareAmbulatorySummary()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='TransitionOfCareAmbulatorySummaryProviderNameAndContactInfo TransitionOfCareAmbulatorySummaryReasonForReferral TransitionOfCareAmbulatorySummaryEncounterDiagnoses TransitionOfCareAmbulatorySummaryMedicationsSection'"
 * @generated
 */
public interface TransitionOfCareAmbulatorySummary extends SummaryOfCareRecord {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->notEmpty() and self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->exists(assignedEntity->excluding(null).assignedPerson->excluding(null).name->notEmpty() and assignedEntity->excluding(null).addr->notEmpty() and assignedEntity->excluding(null).telecom->notEmpty())) or (self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->notEmpty() and self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->exists(assignedEntity->excluding(null).assignedPerson->excluding(null).name->notEmpty() and assignedEntity->excluding(null).addr->notEmpty() and assignedEntity->excluding(null).telecom->notEmpty())) or (self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->notEmpty() and self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->exists(assignedEntity->excluding(null).assignedPerson->excluding(null).name->notEmpty() and assignedEntity->excluding(null).addr->notEmpty() and assignedEntity->excluding(null).telecom->notEmpty()))'"
	 * @generated
	 */
	boolean validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PlanOfCareSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentAndPlanSection)) or self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::ReasonForReferralSection))'"
	 * @generated
	 */
	boolean validateTransitionOfCareAmbulatorySummaryReasonForReferral(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSections()->exists( osec : cda::Section | not osec.oclIsUndefined() and osec.nullFlavor <> vocab::NullFlavor::NI implies  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::AssessmentSection) and sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) )  ) or (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::AssessmentAndPlanSection) and sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) )  ) or (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::PostoperativeDiagnosisSection) and sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) )  ) or (  self.getSections()->exists(sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::ProblemSection) and ( sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::ProblemConcernAct) or sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) ) ) )  ) or (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection) and sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::HospitalAdmissionDiagnosis)) )  ) or (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::HospitalDischargeDiagnosisSection) and sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::HospitalDischargeDiagnosis)) )  ) or (  self.getSections()->exists(sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::EncountersSection) and ( sec.getEncounters()->exists(enc : cda::Encounter | not enc.oclIsUndefined() and enc.oclIsKindOf(consol::EncounterActivities) or sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::EncounterDiagnosis)) ) ) )  )  )'"
	 * @generated
	 */
	boolean validateTransitionOfCareAmbulatorySummaryEncounterDiagnoses(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))'"
	 * @generated
	 */
	boolean validateTransitionOfCareAmbulatorySummaryMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)'"
	 * @generated
	 */
	MedicationsSection getMedicationsSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionOfCareAmbulatorySummary init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public TransitionOfCareAmbulatorySummary init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // TransitionOfCareAmbulatorySummary
