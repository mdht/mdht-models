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
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ClinicalOfficeVisitSummaryOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Clinical Office Visit Summary</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ClinicalOfficeVisitSummaryImpl extends GeneralHeaderConstraintsImpl implements ClinicalOfficeVisitSummary {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClinicalOfficeVisitSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryReasonforVisit(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryReasonforVisit(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryCarePlanning(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryCarePlanning(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryDateOfvisit(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryDateOfvisit(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryVisitLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryVisitLocation(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryProviderNameAndContactInfo(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryProviderNameAndContactInfo(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryVitalSigns(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryVitalSigns(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations
				.validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummarySocialHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarySocialHistorySection(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryProblemSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryProblemSection(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryAllergiesSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryAllergiesSection(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryResultsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryResultsSection(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryProceduresSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryProceduresSection(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryImmunizationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryImmunizationsSection(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateClinicalOfficeVisitSummaryInstructionsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryInstructionsSection(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public InstructionsSection retrieveInstructionsSection() {
		return ClinicalOfficeVisitSummaryOperations.retrieveInstructionsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public MedicationsAdministeredSection retrieveMedicationsAdministeredSection() {
		return ClinicalOfficeVisitSummaryOperations.retrieveMedicationsAdministeredSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public SocialHistorySection getSocialHistorySection() {
		return ClinicalOfficeVisitSummaryOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ProblemSection getProblemSection() {
		return ClinicalOfficeVisitSummaryOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public MedicationsSection getMedicationsSection() {
		return ClinicalOfficeVisitSummaryOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public AllergiesSection getAllergiesSection() {
		return ClinicalOfficeVisitSummaryOperations.getAllergiesSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResultsSection getResultsSection() {
		return ClinicalOfficeVisitSummaryOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ProceduresSection getProceduresSection() {
		return ClinicalOfficeVisitSummaryOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ImmunizationsSection getImmunizationsSection() {
		return ClinicalOfficeVisitSummaryOperations.getImmunizationsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection getMedicationsAdministeredSection() {
		return ClinicalOfficeVisitSummaryOperations.getMedicationsAdministeredSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ClinicalOfficeVisitSummary init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ClinicalOfficeVisitSummary init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public InstructionsSection getInstructionsSection() {
		return ClinicalOfficeVisitSummaryOperations.getInstructionsSection(this);
	}
} // ClinicalOfficeVisitSummaryImpl
