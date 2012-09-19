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
package org.openhealthtools.mdht.uml.cda.phcr.hib.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.hib.HibCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibSignsAndSymptoms;

import org.openhealthtools.mdht.uml.cda.phcr.hib.util.HibValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.CaseObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibCaseObservation#validateHibCaseObservationHibSignsAndSymptoms(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Case Observation Hib Signs And Symptoms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibCaseObservation#getHibSignsAndSymptomss() <em>Get Hib Signs And Symptomss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HibCaseObservationOperations extends CaseObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HibCaseObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHibCaseObservationHibSignsAndSymptoms(HibCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Case Observation Hib Signs And Symptoms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHibCaseObservationHibSignsAndSymptoms(HibCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIB_CASE_OBSERVATION_HIB_SIGNS_AND_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(hib::HibSignsAndSymptoms) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateHibCaseObservationHibSignsAndSymptoms(HibCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Case Observation Hib Signs And Symptoms</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHibCaseObservationHibSignsAndSymptoms(HibCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HIB_CASE_OBSERVATION_HIB_SIGNS_AND_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(hib::HibSignsAndSymptoms) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param hibCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHibCaseObservationHibSignsAndSymptoms(HibCaseObservation hibCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HIB_CASE_OBSERVATION_HIB_SIGNS_AND_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_CASE_OBSERVATION);
			try {
				VALIDATE_HIB_CASE_OBSERVATION_HIB_SIGNS_AND_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIB_CASE_OBSERVATION_HIB_SIGNS_AND_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIB_CASE_OBSERVATION_HIB_SIGNS_AND_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_CASE_OBSERVATION__HIB_CASE_OBSERVATION_HIB_SIGNS_AND_SYMPTOMS,
						 HibPlugin.INSTANCE.getString("HibCaseObservationHibSignsAndSymptoms"),
						 new Object [] { hibCaseObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHibSignsAndSymptomss(HibCaseObservation) <em>Get Hib Signs And Symptomss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibSignsAndSymptomss(HibCaseObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HIB_SIGNS_AND_SYMPTOMSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hib::HibSignsAndSymptoms)).oclAsType(hib::HibSignsAndSymptoms)";

	/**
	 * The cached OCL query for the '{@link #getHibSignsAndSymptomss(HibCaseObservation) <em>Get Hib Signs And Symptomss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibSignsAndSymptomss(HibCaseObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HIB_SIGNS_AND_SYMPTOMSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hib::HibSignsAndSymptoms)).oclAsType(hib::HibSignsAndSymptoms)
	 * @param hibCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<HibSignsAndSymptoms> getHibSignsAndSymptomss(HibCaseObservation hibCaseObservation) {
		if (GET_HIB_SIGNS_AND_SYMPTOMSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HibPackage.Literals.HIB_CASE_OBSERVATION, HibPackage.Literals.HIB_CASE_OBSERVATION.getEAllOperations().get(77));
			try {
				GET_HIB_SIGNS_AND_SYMPTOMSS__EOCL_QRY = helper.createQuery(GET_HIB_SIGNS_AND_SYMPTOMSS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HIB_SIGNS_AND_SYMPTOMSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HibSignsAndSymptoms> result = (Collection<HibSignsAndSymptoms>) query.evaluate(hibCaseObservation);
		return new BasicEList.UnmodifiableEList<HibSignsAndSymptoms>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(HibCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(HibCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.134')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(HibCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(HibCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.134')
	 * @param hibCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProblemObservationTemplateId(HibCaseObservation hibCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_CASE_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProblemObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(hibCaseObservation, context) }),
						 new Object [] { hibCaseObservation }));
			}
			return false;
		}
		return true;
	}

} // HibCaseObservationOperations