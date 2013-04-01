/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.operations;

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
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Relevant Medical Condition History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#getProblemObservations() <em>Get Problem Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhcrRelevantMedicalConditionHistoryObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhcrRelevantMedicalConditionHistoryObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.62')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.62')
	 * @param phcrRelevantMedicalConditionHistoryObservation The receiving '<em><b>Relevant Medical Condition History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION);
			try {
				VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantMedicalConditionHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID,
						 PhcrPlugin.INSTANCE.getString("PhcrRelevantMedicalConditionHistoryObservationTemplateId"),
						 new Object [] { phcrRelevantMedicalConditionHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationClassCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationClassCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationClassCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationClassCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param phcrRelevantMedicalConditionHistoryObservation The receiving '<em><b>Relevant Medical Condition History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrRelevantMedicalConditionHistoryObservationClassCode(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION);
			try {
				VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantMedicalConditionHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CLASS_CODE,
						 PhcrPlugin.INSTANCE.getString("PhcrRelevantMedicalConditionHistoryObservationClassCode"),
						 new Object [] { phcrRelevantMedicalConditionHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationCodeP(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationCodeP(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationCodeP(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationCodeP(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param phcrRelevantMedicalConditionHistoryObservation The receiving '<em><b>Relevant Medical Condition History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrRelevantMedicalConditionHistoryObservationCodeP(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION);
			try {
				VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantMedicalConditionHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrRelevantMedicalConditionHistoryObservationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(phcrRelevantMedicalConditionHistoryObservation, context) }),
						 new Object [] { phcrRelevantMedicalConditionHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')
	 * @param phcrRelevantMedicalConditionHistoryObservation The receiving '<em><b>Relevant Medical Condition History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrRelevantMedicalConditionHistoryObservationCode(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION);
			try {
				VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantMedicalConditionHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE,
						 PhcrPlugin.INSTANCE.getString("PhcrRelevantMedicalConditionHistoryObservationCode"),
						 new Object [] { phcrRelevantMedicalConditionHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param phcrRelevantMedicalConditionHistoryObservation The receiving '<em><b>Relevant Medical Condition History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION);
			try {
				VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantMedicalConditionHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_EFFECTIVE_TIME,
						 PhcrPlugin.INSTANCE.getString("PhcrRelevantMedicalConditionHistoryObservationEffectiveTime"),
						 new Object [] { phcrRelevantMedicalConditionHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param phcrRelevantMedicalConditionHistoryObservation The receiving '<em><b>Relevant Medical Condition History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION);
			try {
				VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantMedicalConditionHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_MOOD_CODE,
						 PhcrPlugin.INSTANCE.getString("PhcrRelevantMedicalConditionHistoryObservationMoodCode"),
						 new Object [] { phcrRelevantMedicalConditionHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.negationInd.oclIsUndefined()
	 * @param phcrRelevantMedicalConditionHistoryObservation The receiving '<em><b>Relevant Medical Condition History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION);
			try {
				VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantMedicalConditionHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_NEGATION_IND,
						 PhcrPlugin.INSTANCE.getString("PhcrRelevantMedicalConditionHistoryObservationNegationInd"),
						 new Object [] { phcrRelevantMedicalConditionHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param phcrRelevantMedicalConditionHistoryObservation The receiving '<em><b>Relevant Medical Condition History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION);
			try {
				VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantMedicalConditionHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE,
						 PhcrPlugin.INSTANCE.getString("PhcrRelevantMedicalConditionHistoryObservationStatusCode"),
						 new Object [] { phcrRelevantMedicalConditionHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param phcrRelevantMedicalConditionHistoryObservation The receiving '<em><b>Relevant Medical Condition History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION);
			try {
				VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantMedicalConditionHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrRelevantMedicalConditionHistoryObservationStatusCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(phcrRelevantMedicalConditionHistoryObservation, context) }),
						 new Object [] { phcrRelevantMedicalConditionHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::ProblemObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(PhcrRelevantMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::ProblemObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param phcrRelevantMedicalConditionHistoryObservation The receiving '<em><b>Relevant Medical Condition History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION);
			try {
				VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrRelevantMedicalConditionHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_PROBLEM_OBSERVATION,
						 PhcrPlugin.INSTANCE.getString("PhcrRelevantMedicalConditionHistoryObservationProblemObservation"),
						 new Object [] { phcrRelevantMedicalConditionHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemObservations(PhcrRelevantMedicalConditionHistoryObservation) <em>Get Problem Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservations(PhcrRelevantMedicalConditionHistoryObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ProblemObservation)).oclAsType(ccd::ProblemObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemObservations(PhcrRelevantMedicalConditionHistoryObservation) <em>Get Problem Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservations(PhcrRelevantMedicalConditionHistoryObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ProblemObservation)).oclAsType(ccd::ProblemObservation)
	 * @param phcrRelevantMedicalConditionHistoryObservation The receiving '<em><b>Relevant Medical Condition History Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<ProblemObservation> getProblemObservations(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation) {
		if (GET_PROBLEM_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION, PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION.getEAllOperations().get(61));
			try {
				GET_PROBLEM_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PROBLEM_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemObservation> result = (Collection<ProblemObservation>) query.evaluate(phcrRelevantMedicalConditionHistoryObservation);
		return new BasicEList.UnmodifiableEList<ProblemObservation>(result.size(), result.toArray());
	}

} // PhcrRelevantMedicalConditionHistoryObservationOperations