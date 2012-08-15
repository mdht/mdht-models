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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionProblemObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.util.CocciValidator;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantMedicalConditionHistoryObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides Immunosuppressed Medical Condition History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionHistoryObservation#validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Immunosuppressed Medical Condition History Observation Coccidioides Immunosuppressed Medical Condition Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionHistoryObservation#getCoccidioidesImmunosuppressedMedicalConditionProblemObservation() <em>Get Coccidioides Immunosuppressed Medical Condition Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoccidioidesImmunosuppressedMedicalConditionHistoryObservationOperations extends PhcrRelevantMedicalConditionHistoryObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoccidioidesImmunosuppressedMedicalConditionHistoryObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Immunosuppressed Medical Condition History Observation Coccidioides Immunosuppressed Medical Condition Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cocci::CoccidioidesImmunosuppressedMedicalConditionProblemObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Immunosuppressed Medical Condition History Observation Coccidioides Immunosuppressed Medical Condition Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cocci::CoccidioidesImmunosuppressedMedicalConditionProblemObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param coccidioidesImmunosuppressedMedicalConditionHistoryObservation The receiving '<em><b>Coccidioides Immunosuppressed Medical Condition History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation coccidioidesImmunosuppressedMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CocciPackage.Literals.COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION);
			try {
				VALIDATE_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesImmunosuppressedMedicalConditionHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CocciValidator.DIAGNOSTIC_SOURCE,
						 CocciValidator.COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION__COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION,
						 CocciPlugin.INSTANCE.getString("CoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation"),
						 new Object [] { coccidioidesImmunosuppressedMedicalConditionHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation) <em>Get Coccidioides Immunosuppressed Medical Condition Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cocci::CoccidioidesImmunosuppressedMedicalConditionProblemObservation))->asSequence()->first().oclAsType(cocci::CoccidioidesImmunosuppressedMedicalConditionProblemObservation)";

	/**
	 * The cached OCL query for the '{@link #getCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation) <em>Get Coccidioides Immunosuppressed Medical Condition Problem Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cocci::CoccidioidesImmunosuppressedMedicalConditionProblemObservation))->asSequence()->first().oclAsType(cocci::CoccidioidesImmunosuppressedMedicalConditionProblemObservation)
	 * @param coccidioidesImmunosuppressedMedicalConditionHistoryObservation The receiving '<em><b>Coccidioides Immunosuppressed Medical Condition History Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  CoccidioidesImmunosuppressedMedicalConditionProblemObservation getCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation coccidioidesImmunosuppressedMedicalConditionHistoryObservation) {
		if (GET_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION, CocciPackage.Literals.COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION.getEAllOperations().get(61));
			try {
				GET_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__EOCL_QRY);
		return (CoccidioidesImmunosuppressedMedicalConditionProblemObservation) query.evaluate(coccidioidesImmunosuppressedMedicalConditionHistoryObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.94')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.94')
	 * @param coccidioidesImmunosuppressedMedicalConditionHistoryObservation The receiving '<em><b>Coccidioides Immunosuppressed Medical Condition History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation coccidioidesImmunosuppressedMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CocciPackage.Literals.COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION);
			try {
				VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesImmunosuppressedMedicalConditionHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CocciValidator.DIAGNOSTIC_SOURCE,
						 CocciValidator.COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrRelevantMedicalConditionHistoryObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, context) }),
						 new Object [] { coccidioidesImmunosuppressedMedicalConditionHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // CoccidioidesImmunosuppressedMedicalConditionHistoryObservationOperations