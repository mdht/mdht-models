/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment;
import org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.Results;
import org.openhealthtools.mdht.uml.cda.phmr.VitalSigns;
import org.openhealthtools.mdht.uml.cda.phmr.operations.PersonalHealthcareMonitoringReportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Healthcare Monitoring Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PersonalHealthcareMonitoringReportImpl extends GeneralHeaderConstraintsImpl implements PersonalHealthcareMonitoringReport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalHealthcareMonitoringReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePersonalHealthcareMonitoringReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePersonalHealthcareMonitoringReportVitalSigns(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportVitalSigns(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePersonalHealthcareMonitoringReportResults(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportResults(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePersonalHealthcareMonitoringReportMedicalEquipment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportMedicalEquipment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePersonalHealthcareMonitoringReportFunctionalStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportFunctionalStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePersonalHealthcareMonitoringReportMedication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePersonalHealthcareMonitoringReportPurpose(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportPurpose(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSigns getVitalSigns() {
		return PersonalHealthcareMonitoringReportOperations.getVitalSigns(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Results getResults() {
		return PersonalHealthcareMonitoringReportOperations.getResults(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicalEquipment getMedicalEquipment() {
		return PersonalHealthcareMonitoringReportOperations.getMedicalEquipment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusSection getFunctionalStatus() {
		return PersonalHealthcareMonitoringReportOperations.getFunctionalStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsSection getMedication() {
		return PersonalHealthcareMonitoringReportOperations.getMedication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PurposeSection getPurpose() {
		return PersonalHealthcareMonitoringReportOperations.getPurpose(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonalHealthcareMonitoringReport init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PersonalHealthcareMonitoringReport init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //PersonalHealthcareMonitoringReportImpl
