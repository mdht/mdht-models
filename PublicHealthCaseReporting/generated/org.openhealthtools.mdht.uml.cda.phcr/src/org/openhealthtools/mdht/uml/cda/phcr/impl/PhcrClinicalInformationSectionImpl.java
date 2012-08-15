/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrClinicalInformationSectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhcrClinicalInformationSectionImpl extends SectionImpl implements PhcrClinicalInformationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhcrClinicalInformationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.PHCR_CLINICAL_INFORMATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrClinicalInformationSectionPatientConditionConstraint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionPatientConditionConstraint(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrClinicalInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrClinicalInformationSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrClinicalInformationSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrClinicalInformationSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrClinicalInformationSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrClinicalInformationSectionCaseObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionCaseObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrClinicalInformationSectionPatientConditionAliveObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionPatientConditionAliveObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseObservation getCaseObservation() {
		return PhcrClinicalInformationSectionOperations.getCaseObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientConditionAliveObservation getPatientConditionAliveObservation() {
		return PhcrClinicalInformationSectionOperations.getPatientConditionAliveObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientConditionDeceasedObservation getPatientConditionDeceasedObservation() {
		return PhcrClinicalInformationSectionOperations.getPatientConditionDeceasedObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhcrRelevantMedicalConditionHistoryObservation> getPhcrRelevantMedicalConditionHistoryObservations() {
		return PhcrClinicalInformationSectionOperations.getPhcrRelevantMedicalConditionHistoryObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhcrClinicalInformationSection init() {
    	CDAUtil.init(this);
    	return this;
	}
	  
} //PhcrClinicalInformationSectionImpl
