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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations;

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
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.util.TularemiaValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tularemia Case Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation#validateTularemiaCaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation#validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Observation Tularemia Signs And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation#validateTularemiaCaseObservationLocationOfLesionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Observation Location Of Lesion Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation#getTularemiaSignsAndSymptomsObservations() <em>Get Tularemia Signs And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation#getLocationOfLesionObservations() <em>Get Location Of Lesion Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TularemiaCaseObservationOperations extends CaseObservationOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TularemiaCaseObservationOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTularemiaCaseObservationValue(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseObservationValue(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TULAREMIA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

		/**
	 * The cached OCL invariant for the '{@link #validateTularemiaCaseObservationValue(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseObservationValue(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TULAREMIA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
	 * @param tularemiaCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTularemiaCaseObservationValue(TularemiaCaseObservation tularemiaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TULAREMIA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_CASE_OBSERVATION);
			try {
				VALIDATE_TULAREMIA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_CASE_OBSERVATION__TULAREMIA_CASE_OBSERVATION_VALUE,
						 TularemiaPlugin.INSTANCE.getString("TularemiaCaseObservationValue"),
						 new Object [] { tularemiaCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Observation Tularemia Signs And Symptoms Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TULAREMIA_CASE_OBSERVATION_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(tularemia::TularemiaSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

		/**
	 * The cached OCL invariant for the '{@link #validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Observation Tularemia Signs And Symptoms Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TULAREMIA_CASE_OBSERVATION_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(tularemia::TularemiaSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param tularemiaCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation(TularemiaCaseObservation tularemiaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TULAREMIA_CASE_OBSERVATION_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_CASE_OBSERVATION);
			try {
				VALIDATE_TULAREMIA_CASE_OBSERVATION_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_CASE_OBSERVATION_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_CASE_OBSERVATION_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_CASE_OBSERVATION__TULAREMIA_CASE_OBSERVATION_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION,
						 TularemiaPlugin.INSTANCE.getString("TularemiaCaseObservationTularemiaSignsAndSymptomsObservation"),
						 new Object [] { tularemiaCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validateTularemiaCaseObservationLocationOfLesionObservation(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Observation Location Of Lesion Observation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseObservationLocationOfLesionObservation(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TULAREMIA_CASE_OBSERVATION_LOCATION_OF_LESION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(tularemia::LocationOfLesionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

  /**
	 * The cached OCL invariant for the '{@link #validateTularemiaCaseObservationLocationOfLesionObservation(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Observation Location Of Lesion Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseObservationLocationOfLesionObservation(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_TULAREMIA_CASE_OBSERVATION_LOCATION_OF_LESION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(tularemia::LocationOfLesionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param tularemiaCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateTularemiaCaseObservationLocationOfLesionObservation(TularemiaCaseObservation tularemiaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TULAREMIA_CASE_OBSERVATION_LOCATION_OF_LESION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_CASE_OBSERVATION);
			try {
				VALIDATE_TULAREMIA_CASE_OBSERVATION_LOCATION_OF_LESION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_CASE_OBSERVATION_LOCATION_OF_LESION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_CASE_OBSERVATION_LOCATION_OF_LESION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_CASE_OBSERVATION__TULAREMIA_CASE_OBSERVATION_LOCATION_OF_LESION_OBSERVATION,
						 TularemiaPlugin.INSTANCE.getString("TularemiaCaseObservationLocationOfLesionObservation"),
						 new Object [] { tularemiaCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #getTularemiaSignsAndSymptomsObservations(TularemiaCaseObservation) <em>Get Tularemia Signs And Symptoms Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTularemiaSignsAndSymptomsObservations(TularemiaCaseObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tularemia::TularemiaSignsAndSymptomsObservation)).oclAsType(tularemia::TularemiaSignsAndSymptomsObservation)";

		/**
	 * The cached OCL query for the '{@link #getTularemiaSignsAndSymptomsObservations(TularemiaCaseObservation) <em>Get Tularemia Signs And Symptoms Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTularemiaSignsAndSymptomsObservations(TularemiaCaseObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tularemia::TularemiaSignsAndSymptomsObservation)).oclAsType(tularemia::TularemiaSignsAndSymptomsObservation)
	 * @param tularemiaCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<TularemiaSignsAndSymptomsObservation> getTularemiaSignsAndSymptomsObservations(TularemiaCaseObservation tularemiaCaseObservation) {
		if (GET_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_CASE_OBSERVATION, TularemiaPackage.Literals.TULAREMIA_CASE_OBSERVATION.getEAllOperations().get(81));
			try {
				GET_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TularemiaSignsAndSymptomsObservation> result = (Collection<TularemiaSignsAndSymptomsObservation>) query.evaluate(tularemiaCaseObservation);
		return new BasicEList.UnmodifiableEList<TularemiaSignsAndSymptomsObservation>(result.size(), result.toArray());
	}

		/**
	 * The cached OCL expression body for the '{@link #getLocationOfLesionObservations(TularemiaCaseObservation) <em>Get Location Of Lesion Observations</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLocationOfLesionObservations(TularemiaCaseObservation)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_LOCATION_OF_LESION_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tularemia::LocationOfLesionObservation)).oclAsType(tularemia::LocationOfLesionObservation)";

  /**
	 * The cached OCL query for the '{@link #getLocationOfLesionObservations(TularemiaCaseObservation) <em>Get Location Of Lesion Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLocationOfLesionObservations(TularemiaCaseObservation)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_LOCATION_OF_LESION_OBSERVATIONS__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tularemia::LocationOfLesionObservation)).oclAsType(tularemia::LocationOfLesionObservation)
	 * @param tularemiaCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  EList<LocationOfLesionObservation> getLocationOfLesionObservations(TularemiaCaseObservation tularemiaCaseObservation)
  {
		if (GET_LOCATION_OF_LESION_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_CASE_OBSERVATION, TularemiaPackage.Literals.TULAREMIA_CASE_OBSERVATION.getEAllOperations().get(82));
			try {
				GET_LOCATION_OF_LESION_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_LOCATION_OF_LESION_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LOCATION_OF_LESION_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<LocationOfLesionObservation> result = (Collection<LocationOfLesionObservation>) query.evaluate(tularemiaCaseObservation);
		return new BasicEList.UnmodifiableEList<LocationOfLesionObservation>(result.size(), result.toArray());
	}

  /**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.46')";

  /**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(TularemiaCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.46')
	 * @param tularemiaCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateProblemObservationTemplateId(TularemiaCaseObservation tularemiaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_CASE_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProblemObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tularemiaCaseObservation, context) }),
						 new Object [] { tularemiaCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // TularemiaCaseObservationOperations