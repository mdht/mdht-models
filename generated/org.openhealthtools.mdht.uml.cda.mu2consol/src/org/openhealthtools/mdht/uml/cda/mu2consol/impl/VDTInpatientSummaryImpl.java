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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryAdmissionDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryAdmissionDate(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryDischargeDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryDischargeDate(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryAdmissionDischargeLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryAdmissionDischargeLocation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryMedications(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryMedications(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVDTInpatientSummaryReasonforHospitalization(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return VDTInpatientSummaryOperations.validateVDTInpatientSummaryReasonforHospitalization(this, diagnostics, context);
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
	public HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection() {
    return VDTInpatientSummaryOperations.getHospitalDischargeInstructionsSection(this);
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
