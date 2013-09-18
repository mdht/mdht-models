/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Postprocedure Diagnosis</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis#validatePostprocedureDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis#validatePostprocedureDiagnosisClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis#validatePostprocedureDiagnosisMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis#validatePostprocedureDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis#validatePostprocedureDiagnosisProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis#getProblemObservations() <em>Get Problem Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostprocedureDiagnosisOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostprocedureDiagnosisOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisTemplateId(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisTemplateId(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.51')";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisTemplateId(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisTemplateId(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postprocedureDiagnosis The receiving '<em><b>Postprocedure Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostprocedureDiagnosisTemplateId(PostprocedureDiagnosis postprocedureDiagnosis,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			postprocedureDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POSTPROCEDURE_DIAGNOSIS__POSTPROCEDURE_DIAGNOSIS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisPostprocedureDiagnosisTemplateId"),
					new Object[] { postprocedureDiagnosis }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisClassCode(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisClassCode(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisClassCode(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisClassCode(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postprocedureDiagnosis The receiving '<em><b>Postprocedure Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostprocedureDiagnosisClassCode(PostprocedureDiagnosis postprocedureDiagnosis,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			postprocedureDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POSTPROCEDURE_DIAGNOSIS__POSTPROCEDURE_DIAGNOSIS_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisPostprocedureDiagnosisClassCode"),
					new Object[] { postprocedureDiagnosis }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisMoodCode(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisMoodCode(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisMoodCode(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisMoodCode(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postprocedureDiagnosis The receiving '<em><b>Postprocedure Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostprocedureDiagnosisMoodCode(PostprocedureDiagnosis postprocedureDiagnosis,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			postprocedureDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POSTPROCEDURE_DIAGNOSIS__POSTPROCEDURE_DIAGNOSIS_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisPostprocedureDiagnosisMoodCode"),
					new Object[] { postprocedureDiagnosis }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisCode(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisCode(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '59769-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisCode(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisCode(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postprocedureDiagnosis The receiving '<em><b>Postprocedure Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostprocedureDiagnosisCode(PostprocedureDiagnosis postprocedureDiagnosis,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			postprocedureDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POSTPROCEDURE_DIAGNOSIS__POSTPROCEDURE_DIAGNOSIS_CODE,
					ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisPostprocedureDiagnosisCode"),
					new Object[] { postprocedureDiagnosis }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisProblemObservation(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisProblemObservation(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisProblemObservation(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisProblemObservation(PostprocedureDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postprocedureDiagnosis The receiving '<em><b>Postprocedure Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostprocedureDiagnosisProblemObservation(
			PostprocedureDiagnosis postprocedureDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			postprocedureDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POSTPROCEDURE_DIAGNOSIS__POSTPROCEDURE_DIAGNOSIS_PROBLEM_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisPostprocedureDiagnosisProblemObservation"),
					new Object[] { postprocedureDiagnosis }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemObservations(PostprocedureDiagnosis) <em>Get Problem Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservations(PostprocedureDiagnosis)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation)).oclAsType(consol::ProblemObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemObservations(PostprocedureDiagnosis) <em>Get Problem Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservations(PostprocedureDiagnosis)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProblemObservation> getProblemObservations(PostprocedureDiagnosis postprocedureDiagnosis) {
		if (GET_PROBLEM_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS,
				ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS.getEAllOperations().get(56));
			try {
				GET_PROBLEM_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PROBLEM_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemObservation> result = (Collection<ProblemObservation>) query.evaluate(postprocedureDiagnosis);
		return new BasicEList.UnmodifiableEList<ProblemObservation>(result.size(), result.toArray());
	}

} // PostprocedureDiagnosisOperations
