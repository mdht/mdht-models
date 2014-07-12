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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSignsAndSymptomsObservation;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util.StrepPneumoValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseObservation#validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Observation Strep Pneumo Signs And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseObservation#getStrepPneumoSignsAndSymptomsObservations() <em>Get Strep Pneumo Signs And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrepPneumoCaseObservationOperations extends CaseObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrepPneumoCaseObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation(StrepPneumoCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Observation Strep Pneumo Signs And Symptoms Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation(StrepPneumoCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREP_PNEUMO_CASE_OBSERVATION_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(streppneumo::StrepPneumoSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation(StrepPneumoCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Observation Strep Pneumo Signs And Symptoms Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation(StrepPneumoCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_CASE_OBSERVATION_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(streppneumo::StrepPneumoSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param strepPneumoCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation(StrepPneumoCaseObservation strepPneumoCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STREP_PNEUMO_CASE_OBSERVATION_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_OBSERVATION);
			try {
				VALIDATE_STREP_PNEUMO_CASE_OBSERVATION_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_CASE_OBSERVATION_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_CASE_OBSERVATION_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_CASE_OBSERVATION__STREP_PNEUMO_CASE_OBSERVATION_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION,
						 StrepPneumoPlugin.INSTANCE.getString("StrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation"),
						 new Object [] { strepPneumoCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getStrepPneumoSignsAndSymptomsObservations(StrepPneumoCaseObservation) <em>Get Strep Pneumo Signs And Symptoms Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoSignsAndSymptomsObservations(StrepPneumoCaseObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(streppneumo::StrepPneumoSignsAndSymptomsObservation)).oclAsType(streppneumo::StrepPneumoSignsAndSymptomsObservation)";

	/**
	 * The cached OCL query for the '{@link #getStrepPneumoSignsAndSymptomsObservations(StrepPneumoCaseObservation) <em>Get Strep Pneumo Signs And Symptoms Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoSignsAndSymptomsObservations(StrepPneumoCaseObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(streppneumo::StrepPneumoSignsAndSymptomsObservation)).oclAsType(streppneumo::StrepPneumoSignsAndSymptomsObservation)
	 * @param strepPneumoCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<StrepPneumoSignsAndSymptomsObservation> getStrepPneumoSignsAndSymptomsObservations(StrepPneumoCaseObservation strepPneumoCaseObservation) {
		if (GET_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_OBSERVATION, StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_OBSERVATION.getEAllOperations().get(78));
			try {
				GET_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StrepPneumoSignsAndSymptomsObservation> result = (Collection<StrepPneumoSignsAndSymptomsObservation>) query.evaluate(strepPneumoCaseObservation);
		return new BasicEList.UnmodifiableEList<StrepPneumoSignsAndSymptomsObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(StrepPneumoCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(StrepPneumoCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.125')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(StrepPneumoCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(StrepPneumoCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.125')
	 * @param strepPneumoCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProblemObservationTemplateId(StrepPneumoCaseObservation strepPneumoCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProblemObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(strepPneumoCaseObservation, context) }),
						 new Object [] { strepPneumoCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // StrepPneumoCaseObservationOperations