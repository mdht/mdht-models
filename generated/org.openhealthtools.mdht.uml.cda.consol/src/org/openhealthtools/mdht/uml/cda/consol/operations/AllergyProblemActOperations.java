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
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Problem Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActAllergyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#getAllergyObservations() <em>Get Allergy Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyProblemActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyProblemActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActEffectiveTimeLow(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActEffectiveTimeLow(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.code = 'active') implies not self.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActEffectiveTimeLow(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActEffectiveTimeLow(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyProblemAct The receiving '<em><b>Allergy Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyProblemActEffectiveTimeLow(AllergyProblemAct allergyProblemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW,
					ConsolPlugin.INSTANCE.getString("AllergyProblemActEffectiveTimeLow"),
					new Object[] { allergyProblemAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActEffectiveTimeHigh(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActEffectiveTimeHigh(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.code = 'completed') implies not self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActEffectiveTimeHigh(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActEffectiveTimeHigh(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyProblemAct The receiving '<em><b>Allergy Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyProblemActEffectiveTimeHigh(AllergyProblemAct allergyProblemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH,
					ConsolPlugin.INSTANCE.getString("AllergyProblemActEffectiveTimeHigh"),
					new Object[] { allergyProblemAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActTemplateId(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActTemplateId(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.30')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActTemplateId(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActTemplateId(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyProblemAct The receiving '<em><b>Allergy Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyProblemActTemplateId(AllergyProblemAct allergyProblemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AllergyProblemActTemplateId"), new Object[] { allergyProblemAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActClassCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActClassCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActClassCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActClassCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyProblemAct The receiving '<em><b>Allergy Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyProblemActClassCode(AllergyProblemAct allergyProblemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyProblemActClassCode"), new Object[] { allergyProblemAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActMoodCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActMoodCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActMoodCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActMoodCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyProblemAct The receiving '<em><b>Allergy Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyProblemActMoodCode(AllergyProblemAct allergyProblemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyProblemActMoodCode"), new Object[] { allergyProblemAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActId(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActId(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActId(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActId(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyProblemAct The receiving '<em><b>Allergy Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyProblemActId(AllergyProblemAct allergyProblemAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_ID,
					ConsolPlugin.INSTANCE.getString("AllergyProblemActId"), new Object[] { allergyProblemAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '48765-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyProblemAct The receiving '<em><b>Allergy Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyProblemActCode(AllergyProblemAct allergyProblemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyProblemActCode"), new Object[] { allergyProblemAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActStatusCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActStatusCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "
			+ "value.code = 'active' or value.code = 'suspended' or value.code = 'aborted' or value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActStatusCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActStatusCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyProblemAct The receiving '<em><b>Allergy Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyProblemActStatusCode(AllergyProblemAct allergyProblemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyProblemActStatusCode"), new Object[] { allergyProblemAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActEffectiveTime(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActEffectiveTime(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActEffectiveTime(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActEffectiveTime(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyProblemAct The receiving '<em><b>Allergy Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyProblemActEffectiveTime(AllergyProblemAct allergyProblemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("AllergyProblemActEffectiveTime"),
					new Object[] { allergyProblemAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActAllergyObservation(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActAllergyObservation(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActAllergyObservation(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActAllergyObservation(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyProblemAct The receiving '<em><b>Allergy Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyProblemActAllergyObservation(AllergyProblemAct allergyProblemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyObservation"),
					new Object[] { allergyProblemAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergyObservations(AllergyProblemAct) <em>Get Allergy Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyObservations(AllergyProblemAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation)).oclAsType(consol::AllergyObservation)";

	/**
	 * The cached OCL query for the '{@link #getAllergyObservations(AllergyProblemAct) <em>Get Allergy Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyObservations(AllergyProblemAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<AllergyObservation> getAllergyObservations(AllergyProblemAct allergyProblemAct) {
		if (GET_ALLERGY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ALLERGY_PROBLEM_ACT,
				ConsolPackage.Literals.ALLERGY_PROBLEM_ACT.getEAllOperations().get(61));
			try {
				GET_ALLERGY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ALLERGY_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AllergyObservation> result = (Collection<AllergyObservation>) query.evaluate(allergyProblemAct);
		return new BasicEList.UnmodifiableEList<AllergyObservation>(result.size(), result.toArray());
	}

} // AllergyProblemActOperations
