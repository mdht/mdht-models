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
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.util.fluValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection#validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section Influenza Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection#validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section Influenza Imaging Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection#getInfluenzaResultObservations() <em>Get Influenza Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection#getInfluenzaImagingObservations() <em>Get Influenza Imaging Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations extends PhcrRelevantDxTestsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section Influenza Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(flu::InfluenzaResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section Influenza Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(flu::InfluenzaResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection The receiving '<em><b>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION);
			try {
				VALIDATE_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_RESULT_OBSERVATION,
						 FluPlugin.INSTANCE.getString("InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation"),
						 new Object [] { influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section Influenza Imaging Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(flu::InfluenzaImagingObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section Influenza Imaging Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(flu::InfluenzaImagingObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection The receiving '<em><b>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION);
			try {
				VALIDATE_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_IMAGING_OBSERVATION,
						 FluPlugin.INSTANCE.getString("InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation"),
						 new Object [] { influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaResultObservations(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) <em>Get Influenza Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaResultObservations(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaResultObservation)).oclAsType(flu::InfluenzaResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaResultObservations(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) <em>Get Influenza Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaResultObservations(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaResultObservation)).oclAsType(flu::InfluenzaResultObservation)
	 * @param influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection The receiving '<em><b>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<InfluenzaResultObservation> getInfluenzaResultObservations(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) {
		if (GET_INFLUENZA_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION, fluPackage.Literals.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION.getEAllOperations().get(72));
			try {
				GET_INFLUENZA_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_INFLUENZA_RESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InfluenzaResultObservation> result = (Collection<InfluenzaResultObservation>) query.evaluate(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
		return new BasicEList.UnmodifiableEList<InfluenzaResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaImagingObservations(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) <em>Get Influenza Imaging Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaImagingObservations(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_IMAGING_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaImagingObservation)).oclAsType(flu::InfluenzaImagingObservation)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaImagingObservations(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) <em>Get Influenza Imaging Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaImagingObservations(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_IMAGING_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaImagingObservation)).oclAsType(flu::InfluenzaImagingObservation)
	 * @param influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection The receiving '<em><b>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<InfluenzaImagingObservation> getInfluenzaImagingObservations(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) {
		if (GET_INFLUENZA_IMAGING_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION, fluPackage.Literals.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION.getEAllOperations().get(73));
			try {
				GET_INFLUENZA_IMAGING_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_INFLUENZA_IMAGING_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_IMAGING_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InfluenzaImagingObservation> result = (Collection<InfluenzaImagingObservation>) query.evaluate(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
		return new BasicEList.UnmodifiableEList<InfluenzaImagingObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.51')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.51')
	 * @param influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection The receiving '<em><b>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResultsSectionTemplateId(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__RESULTS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, context) }),
						 new Object [] { influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection }));
			}
			 
			return false;
		}
		return true;
	}

} // InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations