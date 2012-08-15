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

import org.openhealthtools.mdht.uml.cda.phcr.operations.CaseObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSignsAndSymptomsObservation;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util.TuberculosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Observation Tuberculosis Signs And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Observation Tuberculosis Site Of TB Disease Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#getTuberculosisSignsAndSymptomsObservations() <em>Get Tuberculosis Signs And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#getTuberculosisSiteOfTBDiseaseObservations() <em>Get Tuberculosis Site Of TB Disease Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#validateCaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuberculosisCaseObservationOperations extends CaseObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisCaseObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Observation Tuberculosis Signs And Symptoms Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(tuberculosis::TuberculosisSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Observation Tuberculosis Signs And Symptoms Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(tuberculosis::TuberculosisSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param tuberculosisCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(TuberculosisCaseObservation tuberculosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_OBSERVATION);
			try {
				VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_CASE_OBSERVATION__TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation"),
						 new Object [] { tuberculosisCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Observation Tuberculosis Site Of TB Disease Observation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(tuberculosis::TuberculosisSiteOfTBDiseaseObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

  /**
	 * The cached OCL invariant for the '{@link #validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Observation Tuberculosis Site Of TB Disease Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(tuberculosis::TuberculosisSiteOfTBDiseaseObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param tuberculosisCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(TuberculosisCaseObservation tuberculosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_OBSERVATION);
			try {
				VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_CASE_OBSERVATION__TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation"),
						 new Object [] { tuberculosisCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #getTuberculosisSignsAndSymptomsObservations(TuberculosisCaseObservation) <em>Get Tuberculosis Signs And Symptoms Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuberculosisSignsAndSymptomsObservations(TuberculosisCaseObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisSignsAndSymptomsObservation)).oclAsType(tuberculosis::TuberculosisSignsAndSymptomsObservation)";

	/**
	 * The cached OCL query for the '{@link #getTuberculosisSignsAndSymptomsObservations(TuberculosisCaseObservation) <em>Get Tuberculosis Signs And Symptoms Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuberculosisSignsAndSymptomsObservations(TuberculosisCaseObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisSignsAndSymptomsObservation)).oclAsType(tuberculosis::TuberculosisSignsAndSymptomsObservation)
	 * @param tuberculosisCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<TuberculosisSignsAndSymptomsObservation> getTuberculosisSignsAndSymptomsObservations(TuberculosisCaseObservation tuberculosisCaseObservation) {
		if (GET_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_OBSERVATION, TuberculosisPackage.Literals.TUBERCULOSIS_CASE_OBSERVATION.getEAllOperations().get(80));
			try {
				GET_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TuberculosisSignsAndSymptomsObservation> result = (Collection<TuberculosisSignsAndSymptomsObservation>) query.evaluate(tuberculosisCaseObservation);
		return new BasicEList.UnmodifiableEList<TuberculosisSignsAndSymptomsObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTuberculosisSiteOfTBDiseaseObservations(TuberculosisCaseObservation) <em>Get Tuberculosis Site Of TB Disease Observations</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTuberculosisSiteOfTBDiseaseObservations(TuberculosisCaseObservation)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisSiteOfTBDiseaseObservation)).oclAsType(tuberculosis::TuberculosisSiteOfTBDiseaseObservation)";

  /**
	 * The cached OCL query for the '{@link #getTuberculosisSiteOfTBDiseaseObservations(TuberculosisCaseObservation) <em>Get Tuberculosis Site Of TB Disease Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTuberculosisSiteOfTBDiseaseObservations(TuberculosisCaseObservation)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATIONS__EOCL_QRY;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisSiteOfTBDiseaseObservation)).oclAsType(tuberculosis::TuberculosisSiteOfTBDiseaseObservation)
	 * @param tuberculosisCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  EList<TuberculosisSiteOfTBDiseaseObservation> getTuberculosisSiteOfTBDiseaseObservations(TuberculosisCaseObservation tuberculosisCaseObservation)
  {
		if (GET_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_OBSERVATION, TuberculosisPackage.Literals.TUBERCULOSIS_CASE_OBSERVATION.getEAllOperations().get(81));
			try {
				GET_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TuberculosisSiteOfTBDiseaseObservation> result = (Collection<TuberculosisSiteOfTBDiseaseObservation>) query.evaluate(tuberculosisCaseObservation);
		return new BasicEList.UnmodifiableEList<TuberculosisSiteOfTBDiseaseObservation>(result.size(), result.toArray());
	}

  /**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.54')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.54')
	 * @param tuberculosisCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProblemObservationTemplateId(TuberculosisCaseObservation tuberculosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProblemObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tuberculosisCaseObservation, context) }),
						 new Object [] { tuberculosisCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaseObservationValue(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaseObservationValue(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCaseObservationValue(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaseObservationValue(TuberculosisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))
	 * @param tuberculosisCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCaseObservationValue(TuberculosisCaseObservation tuberculosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_OBSERVATION);
			try {
				VALIDATE_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_CASE_OBSERVATION__CASE_OBSERVATION_VALUE,
						 TuberculosisPlugin.INSTANCE.getString("CaseObservationValue"),
						 new Object [] { tuberculosisCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // TuberculosisCaseObservationOperations