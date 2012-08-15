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
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBTherapeuticRegimenAct_JobRelatedBodyFluidExposureRiskFrequencyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBSocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrSocialHistorySectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acute Hepatitis BSocial History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBSocialHistorySectionImpl extends PhcrSocialHistorySectionImpl implements AcuteHepatitisBSocialHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBSocialHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBSocialHistorySectionOperations.validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBSocialHistorySectionOperations.validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBSocialHistorySectionOperations.validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBSocialHistorySectionOperations.validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobRelatedBodyFluidExposureRiskFrequencyObservation> getJobRelatedBodyFluidExposureRiskFrequencyObservations() {
		return AcuteHepatitisBSocialHistorySectionOperations.getJobRelatedBodyFluidExposureRiskFrequencyObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcuteHepatitisBPossibleExposureLocationAndTypeAct> getAcuteHepatitisBPossibleExposureLocationAndTypeActs() {
		return AcuteHepatitisBSocialHistorySectionOperations.getAcuteHepatitisBPossibleExposureLocationAndTypeActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation> getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations() {
		return AcuteHepatitisBSocialHistorySectionOperations.getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation> getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations() {
		return AcuteHepatitisBSocialHistorySectionOperations.getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuteHepatitisBSocialHistorySection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //AcuteHepatitisBSocialHistorySectionImpl
