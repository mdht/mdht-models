/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProgressNoteOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProgressNoteImpl extends GeneralHeaderConstraintsImpl implements ProgressNote {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ProgressNoteImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROGRESS_NOTE;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOf(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOf(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteAssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteAssessmentSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNotePlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNotePlanOfCareSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteAssessmentAndPlanSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteAssessmentAndPlanSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteAllergiesSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteAllergiesSectionEntriesOptional(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteChiefComplaintSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteChiefComplaintSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteInterventionsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteInterventionsSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteMedicationsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteMedicationsSectionEntriesOptional(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteObjectiveSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteObjectiveSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNotePhysicalExamSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNotePhysicalExamSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteProblemSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteProblemSectionEntriesOptional(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteResultsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteResultsSectionEntriesOptional(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteReviewOfSystemsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteSubjectiveSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteSubjectiveSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteVitalSignsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteVitalSignsSectionEntriesOptional(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteInstructionsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteInstructionsSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteDocumentationOfServiceEvent2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2TemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteDocumentationOfServiceEvent2ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2ClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteDocumentationOfServiceEvent2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteComponentOfEncompassingEncounter6Id(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6Id(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteComponentOfEncompassingEncounter6Location(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6Location(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProgressNoteComponentOfEncompassingEncounter6(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public AssessmentSection getAssessmentSection() {
		return ProgressNoteOperations.getAssessmentSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PlanOfCareSection getPlanOfCareSection() {
		return ProgressNoteOperations.getPlanOfCareSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public AssessmentAndPlanSection getAssessmentAndPlanSection() {
		return ProgressNoteOperations.getAssessmentAndPlanSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional() {
		return ProgressNoteOperations.getAllergiesSectionEntriesOptional(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ChiefComplaintSection getChiefComplaintSection() {
		return ProgressNoteOperations.getChiefComplaintSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public InterventionsSection getInterventionsSection() {
		return ProgressNoteOperations.getInterventionsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional() {
		return ProgressNoteOperations.getMedicationsSectionEntriesOptional(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ObjectiveSection getObjectiveSection() {
		return ProgressNoteOperations.getObjectiveSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PhysicalExamSection getPhysicalExamSection() {
		return ProgressNoteOperations.getPhysicalExamSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ProblemSectionEntriesOptional getProblemSectionEntriesOptional() {
		return ProgressNoteOperations.getProblemSectionEntriesOptional(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ResultsSectionEntriesOptional getResultsSectionEntriesOptional() {
		return ProgressNoteOperations.getResultsSectionEntriesOptional(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return ProgressNoteOperations.getReviewOfSystemsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public SubjectiveSection getSubjectiveSection() {
		return ProgressNoteOperations.getSubjectiveSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional() {
		return ProgressNoteOperations.getVitalSignsSectionEntriesOptional(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public InstructionsSection getInstructionsSection() {
		return ProgressNoteOperations.getInstructionsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public ProgressNote init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgressNote init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProgressNoteImpl
