/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.hepb.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBPHCRClinicalInformationSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrClinicalInformationSectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acute Hepatitis BPHCR Clinical Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBPHCRClinicalInformationSectionImpl extends PhcrClinicalInformationSectionImpl implements AcuteHepatitisBPHCRClinicalInformationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBPHCRClinicalInformationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPHCRClinicalInformationSectionOperations.validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPHCRClinicalInformationSectionOperations.validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPHCRClinicalInformationSectionOperations.validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPHCRClinicalInformationSectionOperations.validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuteHepatitisBCaseObservation getAcuteHepatitisBCaseObservation() {
		return AcuteHepatitisBPHCRClinicalInformationSectionOperations.getAcuteHepatitisBCaseObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcuteHepatitisBRiskAssociatedProcedure> getAcuteHepatitisBRiskAssociatedProcedures() {
		return AcuteHepatitisBPHCRClinicalInformationSectionOperations.getAcuteHepatitisBRiskAssociatedProcedures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViralHepatitisHistoryObservation> getViralHepatitisHistoryObservations() {
		return AcuteHepatitisBPHCRClinicalInformationSectionOperations.getViralHepatitisHistoryObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STDHistoryObservation> getSTDHistoryObservations() {
		return AcuteHepatitisBPHCRClinicalInformationSectionOperations.getSTDHistoryObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhcrClinicalInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPHCRClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuteHepatitisBPHCRClinicalInformationSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //AcuteHepatitisBPHCRClinicalInformationSectionImpl
