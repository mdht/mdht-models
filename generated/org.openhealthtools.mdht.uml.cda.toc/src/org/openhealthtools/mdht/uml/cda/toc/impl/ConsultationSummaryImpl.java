/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.toc.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.cdt.impl.GeneralHeaderConstraintsImpl;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary;
import org.openhealthtools.mdht.uml.cda.toc.ToCPackage;
import org.openhealthtools.mdht.uml.cda.toc.operations.ConsultationSummaryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consultation Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConsultationSummaryImpl extends GeneralHeaderConstraintsImpl implements ConsultationSummary {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ConsultationSummaryImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ToCPackage.Literals.CONSULTATION_SUMMARY;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryAllergiesReactionsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryAllergiesReactionsSection(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryMedicationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryMedicationsSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryProblemListSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryProblemListSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummarySurgeriesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummarySurgeriesSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryDiagnosticResultsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryDiagnosticResultsSection(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryAdvanceDirectivesSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryAdvanceDirectivesSection(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryEncountersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryEncountersSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryFamilyHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryFamilyHistorySection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryFunctionalStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryFunctionalStatusSection(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryImmunizationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryImmunizationsSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryMedicalEquipmentSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryMedicalEquipmentSection(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryPayersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryPayersSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryPlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryPlanOfCareSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummarySocialHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummarySocialHistorySection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationSummaryVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateConsultationSummaryVitalSignsSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public AllergiesReactionsSection getAllergiesReactionsSection() {
		return ConsultationSummaryOperations.getAllergiesReactionsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public MedicationsSection getMedicationsSection() {
		return ConsultationSummaryOperations.getMedicationsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ProblemListSection getProblemListSection() {
		return ConsultationSummaryOperations.getProblemListSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public SurgeriesSection getSurgeriesSection() {
		return ConsultationSummaryOperations.getSurgeriesSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public DiagnosticResultsSection getDiagnosticResultsSection() {
		return ConsultationSummaryOperations.getDiagnosticResultsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public AdvanceDirectivesSection getAdvanceDirectivesSection() {
		return ConsultationSummaryOperations.getAdvanceDirectivesSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EncountersSection getEncountersSection() {
		return ConsultationSummaryOperations.getEncountersSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public FamilyHistorySection getFamilyHistorySection() {
		return ConsultationSummaryOperations.getFamilyHistorySection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public FunctionalStatusSection getFunctionalStatusSection() {
		return ConsultationSummaryOperations.getFunctionalStatusSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ImmunizationsSection getImmunizationsSection() {
		return ConsultationSummaryOperations.getImmunizationsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public MedicalEquipmentSection getMedicalEquipmentSection() {
		return ConsultationSummaryOperations.getMedicalEquipmentSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PayersSection getPayersSection() {
		return ConsultationSummaryOperations.getPayersSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PlanOfCareSection getPlanOfCareSection() {
		return ConsultationSummaryOperations.getPlanOfCareSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public SocialHistorySection getSocialHistorySection() {
		return ConsultationSummaryOperations.getSocialHistorySection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public VitalSignsSection getVitalSignsSection() {
		return ConsultationSummaryOperations.getVitalSignsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationSummaryOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public ConsultationSummary init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	@Override
	public ConsultationSummary init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ConsultationSummaryImpl
