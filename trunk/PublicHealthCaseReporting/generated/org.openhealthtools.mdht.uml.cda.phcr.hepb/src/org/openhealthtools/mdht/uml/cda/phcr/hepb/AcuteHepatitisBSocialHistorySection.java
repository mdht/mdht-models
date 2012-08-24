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
package org.openhealthtools.mdht.uml.cda.phcr.hepb;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acute Hepatitis BSocial History Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage#getAcuteHepatitisBSocialHistorySection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AcuteHepatitisBSocialHistorySectionTemplateId' templateId.root='2.16.840.1.113883.10.20.15.2.11' constraints.validation.warning='AcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation AcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation' constraints.validation.info='AcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct AcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation '"
 * @generated
 */
public interface AcuteHepatitisBSocialHistorySection extends PhcrSocialHistorySection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::JobRelatedBodyFluidExposureRiskFrequencyObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
   * @generated
   */
	boolean validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hepb::AcuteHepatitisBPossibleExposureLocationAndTypeAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
   * @generated
   */
	boolean validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
   * @generated
   */
	boolean validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation ) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
   * @generated
   */
	boolean validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::JobRelatedBodyFluidExposureRiskFrequencyObservation)).oclAsType(hepb::JobRelatedBodyFluidExposureRiskFrequencyObservation)'"
   * @generated
   */
	EList<JobRelatedBodyFluidExposureRiskFrequencyObservation> getJobRelatedBodyFluidExposureRiskFrequencyObservations();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hepb::AcuteHepatitisBPossibleExposureLocationAndTypeAct)).oclAsType(hepb::AcuteHepatitisBPossibleExposureLocationAndTypeAct)'"
   * @generated
   */
	EList<AcuteHepatitisBPossibleExposureLocationAndTypeAct> getAcuteHepatitisBPossibleExposureLocationAndTypeActs();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation)).oclAsType(hepb::AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation)'"
   * @generated
   */
	EList<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation> getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation )).oclAsType(hepb::AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation )'"
   * @generated
   */
	EList<AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation> getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBSocialHistorySection init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AcuteHepatitisBSocialHistorySection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AcuteHepatitisBSocialHistorySection
