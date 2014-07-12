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
package org.openhealthtools.mdht.uml.cda.phcr.hepb.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.util.HepbValidator;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrSocialHistorySectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BSocial History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Job Related Body Fluid Exposure Risk Frequency Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Acute Hepatitis BPossible Exposure Location And Type Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#getJobRelatedBodyFluidExposureRiskFrequencyObservations() <em>Get Job Related Body Fluid Exposure Risk Frequency Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#getAcuteHepatitisBPossibleExposureLocationAndTypeActs() <em>Get Acute Hepatitis BPossible Exposure Location And Type Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations() <em>Get Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations() <em>Get Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBSocialHistorySectionOperations extends PhcrSocialHistorySectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBSocialHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Job Related Body Fluid Exposure Risk Frequency Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::JobRelatedBodyFluidExposureRiskFrequencyObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Job Related Body Fluid Exposure Risk Frequency Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::JobRelatedBodyFluidExposureRiskFrequencyObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param acuteHepatitisBSocialHistorySection The receiving '<em><b>Acute Hepatitis BSocial History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation"),
						 new Object [] { acuteHepatitisBSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Acute Hepatitis BPossible Exposure Location And Type Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hepb::AcuteHepatitisBPossibleExposureLocationAndTypeAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Acute Hepatitis BPossible Exposure Location And Type Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hepb::AcuteHepatitisBPossibleExposureLocationAndTypeAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param acuteHepatitisBSocialHistorySection The receiving '<em><b>Acute Hepatitis BSocial History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct"),
						 new Object [] { acuteHepatitisBSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param acuteHepatitisBSocialHistorySection The receiving '<em><b>Acute Hepatitis BSocial History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation"),
						 new Object [] { acuteHepatitisBSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation ) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation ) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param acuteHepatitisBSocialHistorySection The receiving '<em><b>Acute Hepatitis BSocial History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation"),
						 new Object [] { acuteHepatitisBSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getJobRelatedBodyFluidExposureRiskFrequencyObservations(AcuteHepatitisBSocialHistorySection) <em>Get Job Related Body Fluid Exposure Risk Frequency Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobRelatedBodyFluidExposureRiskFrequencyObservations(AcuteHepatitisBSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::JobRelatedBodyFluidExposureRiskFrequencyObservation)).oclAsType(hepb::JobRelatedBodyFluidExposureRiskFrequencyObservation)";

	/**
	 * The cached OCL query for the '{@link #getJobRelatedBodyFluidExposureRiskFrequencyObservations(AcuteHepatitisBSocialHistorySection) <em>Get Job Related Body Fluid Exposure Risk Frequency Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobRelatedBodyFluidExposureRiskFrequencyObservations(AcuteHepatitisBSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATIONS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::JobRelatedBodyFluidExposureRiskFrequencyObservation)).oclAsType(hepb::JobRelatedBodyFluidExposureRiskFrequencyObservation)
	 * @param acuteHepatitisBSocialHistorySection The receiving '<em><b>Acute Hepatitis BSocial History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<JobRelatedBodyFluidExposureRiskFrequencyObservation> getJobRelatedBodyFluidExposureRiskFrequencyObservations(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection) {
		if (GET_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION, HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION.getEAllOperations().get(84));
			try {
				GET_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<JobRelatedBodyFluidExposureRiskFrequencyObservation> result = (Collection<JobRelatedBodyFluidExposureRiskFrequencyObservation>) query.evaluate(acuteHepatitisBSocialHistorySection);
		return new BasicEList.UnmodifiableEList<JobRelatedBodyFluidExposureRiskFrequencyObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAcuteHepatitisBPossibleExposureLocationAndTypeActs(AcuteHepatitisBSocialHistorySection) <em>Get Acute Hepatitis BPossible Exposure Location And Type Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBPossibleExposureLocationAndTypeActs(AcuteHepatitisBSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hepb::AcuteHepatitisBPossibleExposureLocationAndTypeAct)).oclAsType(hepb::AcuteHepatitisBPossibleExposureLocationAndTypeAct)";

	/**
	 * The cached OCL query for the '{@link #getAcuteHepatitisBPossibleExposureLocationAndTypeActs(AcuteHepatitisBSocialHistorySection) <em>Get Acute Hepatitis BPossible Exposure Location And Type Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBPossibleExposureLocationAndTypeActs(AcuteHepatitisBSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hepb::AcuteHepatitisBPossibleExposureLocationAndTypeAct)).oclAsType(hepb::AcuteHepatitisBPossibleExposureLocationAndTypeAct)
	 * @param acuteHepatitisBSocialHistorySection The receiving '<em><b>Acute Hepatitis BSocial History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<AcuteHepatitisBPossibleExposureLocationAndTypeAct> getAcuteHepatitisBPossibleExposureLocationAndTypeActs(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection) {
		if (GET_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION, HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION.getEAllOperations().get(85));
			try {
				GET_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AcuteHepatitisBPossibleExposureLocationAndTypeAct> result = (Collection<AcuteHepatitisBPossibleExposureLocationAndTypeAct>) query.evaluate(acuteHepatitisBSocialHistorySection);
		return new BasicEList.UnmodifiableEList<AcuteHepatitisBPossibleExposureLocationAndTypeAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations(AcuteHepatitisBSocialHistorySection) <em>Get Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations(AcuteHepatitisBSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation)).oclAsType(hepb::AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation)";

	/**
	 * The cached OCL query for the '{@link #getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations(AcuteHepatitisBSocialHistorySection) <em>Get Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations(AcuteHepatitisBSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATIONS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation)).oclAsType(hepb::AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation)
	 * @param acuteHepatitisBSocialHistorySection The receiving '<em><b>Acute Hepatitis BSocial History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation> getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection) {
		if (GET_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION, HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION.getEAllOperations().get(86));
			try {
				GET_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation> result = (Collection<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation>) query.evaluate(acuteHepatitisBSocialHistorySection);
		return new BasicEList.UnmodifiableEList<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations(AcuteHepatitisBSocialHistorySection) <em>Get Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations(AcuteHepatitisBSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation )).oclAsType(hepb::AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation )";

	/**
	 * The cached OCL query for the '{@link #getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations(AcuteHepatitisBSocialHistorySection) <em>Get Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations(AcuteHepatitisBSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATIONS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation )).oclAsType(hepb::AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation )
	 * @param acuteHepatitisBSocialHistorySection The receiving '<em><b>Acute Hepatitis BSocial History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation> getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection) {
		if (GET_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION, HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION.getEAllOperations().get(87));
			try {
				GET_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation> result = (Collection<AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation>) query.evaluate(acuteHepatitisBSocialHistorySection);
		return new BasicEList.UnmodifiableEList<AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.11')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(AcuteHepatitisBSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.11')
	 * @param acuteHepatitisBSocialHistorySection The receiving '<em><b>Acute Hepatitis BSocial History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSocialHistorySectionTemplateId(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SocialHistorySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBSocialHistorySection, context) }),
						 new Object [] { acuteHepatitisBSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

} // AcuteHepatitisBSocialHistorySectionOperations