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

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util.TuberculosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection#validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Relevant Dx Tests Section Tuberculosis Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection#validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Relevant Dx Tests Section Tuberculosis Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection#getTuberculosisResultOrganizers() <em>Get Tuberculosis Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection#getTuberculosisResultObservations() <em>Get Tuberculosis Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuberculosisPHCRRelevantDxTestsSectionOperations extends PhcrRelevantDxTestsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisPHCRRelevantDxTestsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer(TuberculosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Relevant Dx Tests Section Tuberculosis Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer(TuberculosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(tuberculosis::TuberculosisResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer(TuberculosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Relevant Dx Tests Section Tuberculosis Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer(TuberculosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(tuberculosis::TuberculosisResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param tuberculosisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer(TuberculosisPHCRRelevantDxTestsSection tuberculosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_ORGANIZER,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer"),
						 new Object [] { tuberculosisPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation(TuberculosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Relevant Dx Tests Section Tuberculosis Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation(TuberculosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tuberculosis::TuberculosisResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation(TuberculosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Relevant Dx Tests Section Tuberculosis Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation(TuberculosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tuberculosis::TuberculosisResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param tuberculosisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation(TuberculosisPHCRRelevantDxTestsSection tuberculosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_OBSERVATION,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation"),
						 new Object [] { tuberculosisPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTuberculosisResultOrganizers(TuberculosisPHCRRelevantDxTestsSection) <em>Get Tuberculosis Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuberculosisResultOrganizers(TuberculosisPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TUBERCULOSIS_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(tuberculosis::TuberculosisResultOrganizer)).oclAsType(tuberculosis::TuberculosisResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getTuberculosisResultOrganizers(TuberculosisPHCRRelevantDxTestsSection) <em>Get Tuberculosis Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuberculosisResultOrganizers(TuberculosisPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(tuberculosis::TuberculosisResultOrganizer)).oclAsType(tuberculosis::TuberculosisResultOrganizer)
	 * @param tuberculosisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<TuberculosisResultOrganizer> getTuberculosisResultOrganizers(TuberculosisPHCRRelevantDxTestsSection tuberculosisPHCRRelevantDxTestsSection) {
		if (GET_TUBERCULOSIS_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION, TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(72));
			try {
				GET_TUBERCULOSIS_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_RESULT_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TuberculosisResultOrganizer> result = (Collection<TuberculosisResultOrganizer>) query.evaluate(tuberculosisPHCRRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<TuberculosisResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTuberculosisResultObservations(TuberculosisPHCRRelevantDxTestsSection) <em>Get Tuberculosis Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuberculosisResultObservations(TuberculosisPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TUBERCULOSIS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisResultObservation)).oclAsType(tuberculosis::TuberculosisResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getTuberculosisResultObservations(TuberculosisPHCRRelevantDxTestsSection) <em>Get Tuberculosis Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuberculosisResultObservations(TuberculosisPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisResultObservation)).oclAsType(tuberculosis::TuberculosisResultObservation)
	 * @param tuberculosisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<TuberculosisResultObservation> getTuberculosisResultObservations(TuberculosisPHCRRelevantDxTestsSection tuberculosisPHCRRelevantDxTestsSection) {
		if (GET_TUBERCULOSIS_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION, TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(73));
			try {
				GET_TUBERCULOSIS_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_RESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TuberculosisResultObservation> result = (Collection<TuberculosisResultObservation>) query.evaluate(tuberculosisPHCRRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<TuberculosisResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(TuberculosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(TuberculosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(TuberculosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(TuberculosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.6')
	 * @param tuberculosisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResultsSectionTemplateId(TuberculosisPHCRRelevantDxTestsSection tuberculosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tuberculosisPHCRRelevantDxTestsSection, context) }),
						 new Object [] { tuberculosisPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

} // TuberculosisPHCRRelevantDxTestsSectionOperations