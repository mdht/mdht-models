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
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.util.fluValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.CaseObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Influenza Case Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation#validateInfluenzaCaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation#validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Observation Influenza Signs And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation#getInfluenzaSignsAndSymptomsObservations() <em>Get Influenza Signs And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluenzaCaseObservationOperations extends CaseObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaCaseObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaCaseObservationValue(InfluenzaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseObservationValue(InfluenzaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaCaseObservationValue(InfluenzaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseObservationValue(InfluenzaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))
	 * @param influenzaCaseObservation The receiving '<em><b>Influenza Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaCaseObservationValue(InfluenzaCaseObservation influenzaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_CASE_OBSERVATION);
			try {
				VALIDATE_INFLUENZA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_CASE_OBSERVATION__INFLUENZA_CASE_OBSERVATION_VALUE,
						 FluPlugin.INSTANCE.getString("InfluenzaCaseObservationValue"),
						 new Object [] { influenzaCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation(InfluenzaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Observation Influenza Signs And Symptoms Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation(InfluenzaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_CASE_OBSERVATION_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(flu::InfluenzaSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation(InfluenzaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Observation Influenza Signs And Symptoms Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation(InfluenzaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_CASE_OBSERVATION_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(flu::InfluenzaSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param influenzaCaseObservation The receiving '<em><b>Influenza Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation(InfluenzaCaseObservation influenzaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_CASE_OBSERVATION_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_CASE_OBSERVATION);
			try {
				VALIDATE_INFLUENZA_CASE_OBSERVATION_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_CASE_OBSERVATION_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_CASE_OBSERVATION_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_CASE_OBSERVATION__INFLUENZA_CASE_OBSERVATION_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION,
						 FluPlugin.INSTANCE.getString("InfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation"),
						 new Object [] { influenzaCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaSignsAndSymptomsObservations(InfluenzaCaseObservation) <em>Get Influenza Signs And Symptoms Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaSignsAndSymptomsObservations(InfluenzaCaseObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaSignsAndSymptomsObservation)).oclAsType(flu::InfluenzaSignsAndSymptomsObservation)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaSignsAndSymptomsObservations(InfluenzaCaseObservation) <em>Get Influenza Signs And Symptoms Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaSignsAndSymptomsObservations(InfluenzaCaseObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaSignsAndSymptomsObservation)).oclAsType(flu::InfluenzaSignsAndSymptomsObservation)
	 * @param influenzaCaseObservation The receiving '<em><b>Influenza Case Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<InfluenzaSignsAndSymptomsObservation> getInfluenzaSignsAndSymptomsObservations(InfluenzaCaseObservation influenzaCaseObservation) {
		if (GET_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_CASE_OBSERVATION, fluPackage.Literals.INFLUENZA_CASE_OBSERVATION.getEAllOperations().get(79));
			try {
				GET_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InfluenzaSignsAndSymptomsObservation> result = (Collection<InfluenzaSignsAndSymptomsObservation>) query.evaluate(influenzaCaseObservation);
		return new BasicEList.UnmodifiableEList<InfluenzaSignsAndSymptomsObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(InfluenzaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(InfluenzaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.78')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(InfluenzaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(InfluenzaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.78')
	 * @param influenzaCaseObservation The receiving '<em><b>Influenza Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProblemObservationTemplateId(InfluenzaCaseObservation influenzaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_CASE_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProblemObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(influenzaCaseObservation, context) }),
						 new Object [] { influenzaCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // InfluenzaCaseObservationOperations