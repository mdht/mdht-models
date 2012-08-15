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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations;

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

import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrSocialHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.HIVStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSocioBehavioralBooleanRiskFactorObservation;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util.TuberculosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection#validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Social History Section Tuberculosis Possible Exposure Location Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection#validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Social History Section Tuberculosis Socio Behavioral Boolean Risk Factor Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection#validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection#validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Social History Section HIV Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection#getTuberculosisPossibleExposureLocationActs() <em>Get Tuberculosis Possible Exposure Location Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection#getTuberculosisSocioBehavioralBooleanRiskFactorObservations() <em>Get Tuberculosis Socio Behavioral Boolean Risk Factor Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection#getSmokingStatusObservations() <em>Get Smoking Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection#getHIVStatusObservation() <em>Get HIV Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuberculosisPHCRSocialHistorySectionOperations extends PhcrSocialHistorySectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisPHCRSocialHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Social History Section Tuberculosis Possible Exposure Location Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(tuberculosis::TuberculosisPossibleExposureLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Social History Section Tuberculosis Possible Exposure Location Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(tuberculosis::TuberculosisPossibleExposureLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param tuberculosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct"),
						 new Object [] { tuberculosisPHCRSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Social History Section Tuberculosis Socio Behavioral Boolean Risk Factor Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tuberculosis::TuberculosisSocioBehavioralBooleanRiskFactorObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Social History Section Tuberculosis Socio Behavioral Boolean Risk Factor Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tuberculosis::TuberculosisSocioBehavioralBooleanRiskFactorObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param tuberculosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation"),
						 new Object [] { tuberculosisPHCRSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Social History Section Smoking Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tuberculosis::SmokingStatusObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Social History Section Smoking Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tuberculosis::SmokingStatusObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param tuberculosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisPHCRSocialHistorySectionSmokingStatusObservation"),
						 new Object [] { tuberculosisPHCRSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Social History Section HIV Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tuberculosis::HIVStatusObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Social History Section HIV Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tuberculosis::HIVStatusObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param tuberculosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisPHCRSocialHistorySectionHIVStatusObservation"),
						 new Object [] { tuberculosisPHCRSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTuberculosisPossibleExposureLocationActs(TuberculosisPHCRSocialHistorySection) <em>Get Tuberculosis Possible Exposure Location Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuberculosisPossibleExposureLocationActs(TuberculosisPHCRSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(tuberculosis::TuberculosisPossibleExposureLocationAct)).oclAsType(tuberculosis::TuberculosisPossibleExposureLocationAct)";

	/**
	 * The cached OCL query for the '{@link #getTuberculosisPossibleExposureLocationActs(TuberculosisPHCRSocialHistorySection) <em>Get Tuberculosis Possible Exposure Location Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuberculosisPossibleExposureLocationActs(TuberculosisPHCRSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(tuberculosis::TuberculosisPossibleExposureLocationAct)).oclAsType(tuberculosis::TuberculosisPossibleExposureLocationAct)
	 * @param tuberculosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<TuberculosisPossibleExposureLocationAct> getTuberculosisPossibleExposureLocationActs(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection) {
		if (GET_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION, TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(84));
			try {
				GET_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TuberculosisPossibleExposureLocationAct> result = (Collection<TuberculosisPossibleExposureLocationAct>) query.evaluate(tuberculosisPHCRSocialHistorySection);
		return new BasicEList.UnmodifiableEList<TuberculosisPossibleExposureLocationAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTuberculosisSocioBehavioralBooleanRiskFactorObservations(TuberculosisPHCRSocialHistorySection) <em>Get Tuberculosis Socio Behavioral Boolean Risk Factor Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuberculosisSocioBehavioralBooleanRiskFactorObservations(TuberculosisPHCRSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisSocioBehavioralBooleanRiskFactorObservation)).oclAsType(tuberculosis::TuberculosisSocioBehavioralBooleanRiskFactorObservation)";

	/**
	 * The cached OCL query for the '{@link #getTuberculosisSocioBehavioralBooleanRiskFactorObservations(TuberculosisPHCRSocialHistorySection) <em>Get Tuberculosis Socio Behavioral Boolean Risk Factor Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuberculosisSocioBehavioralBooleanRiskFactorObservations(TuberculosisPHCRSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisSocioBehavioralBooleanRiskFactorObservation)).oclAsType(tuberculosis::TuberculosisSocioBehavioralBooleanRiskFactorObservation)
	 * @param tuberculosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<TuberculosisSocioBehavioralBooleanRiskFactorObservation> getTuberculosisSocioBehavioralBooleanRiskFactorObservations(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection) {
		if (GET_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION, TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(85));
			try {
				GET_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TuberculosisSocioBehavioralBooleanRiskFactorObservation> result = (Collection<TuberculosisSocioBehavioralBooleanRiskFactorObservation>) query.evaluate(tuberculosisPHCRSocialHistorySection);
		return new BasicEList.UnmodifiableEList<TuberculosisSocioBehavioralBooleanRiskFactorObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSmokingStatusObservations(TuberculosisPHCRSocialHistorySection) <em>Get Smoking Status Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmokingStatusObservations(TuberculosisPHCRSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SMOKING_STATUS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::SmokingStatusObservation)).oclAsType(tuberculosis::SmokingStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getSmokingStatusObservations(TuberculosisPHCRSocialHistorySection) <em>Get Smoking Status Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmokingStatusObservations(TuberculosisPHCRSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SMOKING_STATUS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::SmokingStatusObservation)).oclAsType(tuberculosis::SmokingStatusObservation)
	 * @param tuberculosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<SmokingStatusObservation> getSmokingStatusObservations(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection) {
		if (GET_SMOKING_STATUS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION, TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(86));
			try {
				GET_SMOKING_STATUS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_SMOKING_STATUS_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SMOKING_STATUS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SmokingStatusObservation> result = (Collection<SmokingStatusObservation>) query.evaluate(tuberculosisPHCRSocialHistorySection);
		return new BasicEList.UnmodifiableEList<SmokingStatusObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHIVStatusObservation(TuberculosisPHCRSocialHistorySection) <em>Get HIV Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIVStatusObservation(TuberculosisPHCRSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HIV_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::HIVStatusObservation))->asSequence()->first().oclAsType(tuberculosis::HIVStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getHIVStatusObservation(TuberculosisPHCRSocialHistorySection) <em>Get HIV Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIVStatusObservation(TuberculosisPHCRSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HIV_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::HIVStatusObservation))->asSequence()->first().oclAsType(tuberculosis::HIVStatusObservation)
	 * @param tuberculosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HIVStatusObservation getHIVStatusObservation(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection) {
		if (GET_HIV_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION, TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(87));
			try {
				GET_HIV_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_HIV_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HIV_STATUS_OBSERVATION__EOCL_QRY);
		return (HIVStatusObservation) query.evaluate(tuberculosisPHCRSocialHistorySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(TuberculosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.7')
	 * @param tuberculosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSocialHistorySectionTemplateId(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SocialHistorySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tuberculosisPHCRSocialHistorySection, context) }),
						 new Object [] { tuberculosisPHCRSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

} // TuberculosisPHCRSocialHistorySectionOperations