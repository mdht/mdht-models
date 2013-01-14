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
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.VDTInpatientSummaryOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>VDT Inpatient Summary</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VDTInpatientSummaryImpl extends ViewDownloadTransmitSummaryImpl
		implements VDTInpatientSummary {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected VDTInpatientSummaryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryEffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryEffectiveTime(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryLocation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryLocation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryPreoperativeDiagnosisEntry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryPreoperativeDiagnosisEntry(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryHospitalDischargeInstructionsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryHospitalDischargeInstructionsSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryChiefComplaintSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryChiefComplaintSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryReasonForVisitSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryReasonForVisitSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryChiefComplaintAndReasonForVisitSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryChiefComplaintAndReasonForVisitSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryHospitalDischargeMedicationsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryHospitalDischargeMedicationsSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryPreoperativeDiagnosisSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryPreoperativeDiagnosisSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryHospitalAdmissionMedicationsSectionEntriesOptional(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryHospitalAdmissionMedicationsSectionEntriesOptional(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection() {
    return VDTInpatientSummaryOperations.getHospitalDischargeInstructionsSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection() {
    return VDTInpatientSummaryOperations.getHospitalAdmissionDiagnosisSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public ChiefComplaintSection getChiefComplaintSection() {
    return VDTInpatientSummaryOperations.getChiefComplaintSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public ReasonForVisitSection getReasonForVisitSection() {
    return VDTInpatientSummaryOperations.getReasonForVisitSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection() {
    return VDTInpatientSummaryOperations.getChiefComplaintAndReasonForVisitSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection() {
    return VDTInpatientSummaryOperations.getHospitalDischargeMedicationsSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public PreoperativeDiagnosisSection getPreoperativeDiagnosisSection() {
    return VDTInpatientSummaryOperations.getPreoperativeDiagnosisSection(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public HospitalAdmissionMedicationsSectionEntriesOptional getHospitalAdmissionMedicationsSectionEntriesOptional() {
    return VDTInpatientSummaryOperations.getHospitalAdmissionMedicationsSectionEntriesOptional(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public VDTInpatientSummary init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public VDTInpatientSummary init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // VDTInpatientSummaryImpl
