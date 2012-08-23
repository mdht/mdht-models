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
package org.openhealthtools.mdht.uml.cda.phcr.flu.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.flu.FluPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.util.fluValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrSocialHistorySectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Influenza PHCR Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection#validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Social History Section Influenza Employment Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection#validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Social History Section Influenza Possible Exposure Location Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection#getInfluenzaEmploymentStatusObservation() <em>Get Influenza Employment Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection#getInfluenzaPossibleExposureLocationActs() <em>Get Influenza Possible Exposure Location Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluenzaPHCRSocialHistorySectionOperations extends PhcrSocialHistorySectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaPHCRSocialHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation(InfluenzaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Social History Section Influenza Employment Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation(InfluenzaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(flu::InfluenzaEmploymentStatusObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation(InfluenzaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Social History Section Influenza Employment Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation(InfluenzaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(flu::InfluenzaEmploymentStatusObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param influenzaPHCRSocialHistorySection The receiving '<em><b>Influenza PHCR Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation(InfluenzaPHCRSocialHistorySection influenzaPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaPHCRSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION,
						 FluPlugin.INSTANCE.getString("InfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation"),
						 new Object [] { influenzaPHCRSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct(InfluenzaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Social History Section Influenza Possible Exposure Location Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct(InfluenzaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(flu::InfluenzaPossibleExposureLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct(InfluenzaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Social History Section Influenza Possible Exposure Location Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct(InfluenzaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(flu::InfluenzaPossibleExposureLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param influenzaPHCRSocialHistorySection The receiving '<em><b>Influenza PHCR Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct(InfluenzaPHCRSocialHistorySection influenzaPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaPHCRSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT,
						 FluPlugin.INSTANCE.getString("InfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct"),
						 new Object [] { influenzaPHCRSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaEmploymentStatusObservation(InfluenzaPHCRSocialHistorySection) <em>Get Influenza Employment Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaEmploymentStatusObservation(InfluenzaPHCRSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaEmploymentStatusObservation))->asSequence()->first().oclAsType(flu::InfluenzaEmploymentStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaEmploymentStatusObservation(InfluenzaPHCRSocialHistorySection) <em>Get Influenza Employment Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaEmploymentStatusObservation(InfluenzaPHCRSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaEmploymentStatusObservation))->asSequence()->first().oclAsType(flu::InfluenzaEmploymentStatusObservation)
	 * @param influenzaPHCRSocialHistorySection The receiving '<em><b>Influenza PHCR Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  InfluenzaEmploymentStatusObservation getInfluenzaEmploymentStatusObservation(InfluenzaPHCRSocialHistorySection influenzaPHCRSocialHistorySection) {
		if (GET_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION, fluPackage.Literals.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(81));
			try {
				GET_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__EOCL_QRY);
		return (InfluenzaEmploymentStatusObservation) query.evaluate(influenzaPHCRSocialHistorySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaPossibleExposureLocationActs(InfluenzaPHCRSocialHistorySection) <em>Get Influenza Possible Exposure Location Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaPossibleExposureLocationActs(InfluenzaPHCRSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(flu::InfluenzaPossibleExposureLocationAct)).oclAsType(flu::InfluenzaPossibleExposureLocationAct)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaPossibleExposureLocationActs(InfluenzaPHCRSocialHistorySection) <em>Get Influenza Possible Exposure Location Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaPossibleExposureLocationActs(InfluenzaPHCRSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(flu::InfluenzaPossibleExposureLocationAct)).oclAsType(flu::InfluenzaPossibleExposureLocationAct)
	 * @param influenzaPHCRSocialHistorySection The receiving '<em><b>Influenza PHCR Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<InfluenzaPossibleExposureLocationAct> getInfluenzaPossibleExposureLocationActs(InfluenzaPHCRSocialHistorySection influenzaPHCRSocialHistorySection) {
		if (GET_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION, fluPackage.Literals.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(82));
			try {
				GET_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY = helper.createQuery(GET_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InfluenzaPossibleExposureLocationAct> result = (Collection<InfluenzaPossibleExposureLocationAct>) query.evaluate(influenzaPHCRSocialHistorySection);
		return new BasicEList.UnmodifiableEList<InfluenzaPossibleExposureLocationAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(InfluenzaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(InfluenzaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.49')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(InfluenzaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(InfluenzaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.49')
	 * @param influenzaPHCRSocialHistorySection The receiving '<em><b>Influenza PHCR Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSocialHistorySectionTemplateId(InfluenzaPHCRSocialHistorySection influenzaPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaPHCRSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SocialHistorySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(influenzaPHCRSocialHistorySection, context) }),
						 new Object [] { influenzaPHCRSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

} // InfluenzaPHCRSocialHistorySectionOperations