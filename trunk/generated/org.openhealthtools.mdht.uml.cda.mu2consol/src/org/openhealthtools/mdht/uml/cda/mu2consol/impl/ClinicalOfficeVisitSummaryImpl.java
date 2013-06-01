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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
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
 * <p>
 * </p>
 *
 * @generated
 */
public class ClinicalOfficeVisitSummaryImpl extends
		GeneralHeaderConstraintsImpl implements ClinicalOfficeVisitSummary {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected ClinicalOfficeVisitSummaryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryReasonforVisit(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryReasonforVisit(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryCarePlanning(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryCarePlanning(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryDateOfvisit(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryDateOfvisit(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryVisitLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryVisitLocation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryProviderNameAndContactInfo(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryProviderNameAndContactInfo(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryVitalSigns(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryVitalSigns(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummarySocialHistorySection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarySocialHistorySection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryProblemSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryProblemSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryMedicationsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryMedicationsSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryAllergiesSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryAllergiesSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryResultsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryResultsSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryProceduresSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryProceduresSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryImmunizationsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryImmunizationsSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateClinicalOfficeVisitSummaryInstructionsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryInstructionsSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public InstructionsSection retrieveInstructionsSection() {
    return ClinicalOfficeVisitSummaryOperations.retrieveInstructionsSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public MedicationsAdministeredSection retrieveMedicationsAdministeredSection() {
    return ClinicalOfficeVisitSummaryOperations.retrieveMedicationsAdministeredSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public SocialHistorySection getSocialHistorySection() {
    return ClinicalOfficeVisitSummaryOperations.getSocialHistorySection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public ProblemSection getProblemSection() {
    return ClinicalOfficeVisitSummaryOperations.getProblemSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public MedicationsSection getMedicationsSection() {
    return ClinicalOfficeVisitSummaryOperations.getMedicationsSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public AllergiesSection getAllergiesSection() {
    return ClinicalOfficeVisitSummaryOperations.getAllergiesSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public ResultsSection getResultsSection() {
    return ClinicalOfficeVisitSummaryOperations.getResultsSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public ProceduresSection getProceduresSection() {
    return ClinicalOfficeVisitSummaryOperations.getProceduresSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public ImmunizationsSection getImmunizationsSection() {
    return ClinicalOfficeVisitSummaryOperations.getImmunizationsSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection getMedicationsAdministeredSection() {
    return ClinicalOfficeVisitSummaryOperations.getMedicationsAdministeredSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public InstructionsSection getInstructionsSection() {
    return ClinicalOfficeVisitSummaryOperations.getInstructionsSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ClinicalOfficeVisitSummary init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ClinicalOfficeVisitSummary init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ClinicalOfficeVisitSummaryImpl
