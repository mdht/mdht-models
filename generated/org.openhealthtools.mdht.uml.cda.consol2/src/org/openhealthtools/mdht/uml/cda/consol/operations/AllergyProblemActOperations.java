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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCDCodeAndCodeSystemValues(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code And Code System Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#getAllergyObservations() <em>Get Allergy Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyProblemActOperations extends ClinicalStatementOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

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

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActEffectiveTimeLow", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW,
						ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyProblemActEffectiveTimeLow"),
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

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActEffectiveTimeHigh", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH,
						ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyProblemActEffectiveTimeHigh"),
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

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActTemplateId", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyProblemActTemplateId"),
						new Object[] { allergyProblemAct }));
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

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActClassCode", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyProblemActClassCode"),
						new Object[] { allergyProblemAct }));
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

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActMoodCode", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyProblemActMoodCode"),
						new Object[] { allergyProblemAct }));
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
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActId(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActId(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActId", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_ID,
						ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyProblemActId"),
						new Object[] { allergyProblemAct }));
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
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActCode", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_CODE,
						ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyProblemActCode"),
						new Object[] { allergyProblemAct }));
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
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " +
			"value.code = 'active' or value.code = 'suspended' or value.code = 'aborted' or value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActStatusCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActStatusCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActStatusCode", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyProblemActStatusCode"),
						new Object[] { allergyProblemAct }));
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

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActEffectiveTime", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyProblemActEffectiveTime"),
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

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActAllergyObservation", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				allergyProblemAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyProblemActAllergyObservation"),
						new Object[] { allergyProblemAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActCDCodeAndCodeSystemValues(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code And Code System Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActCDCodeAndCodeSystemValues(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_AND_CODE_SYSTEM_VALUES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject((code = 'CONC' and codeSystem = '2.16.840.1.113883.5.6') or (code = '48765-2' and codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActCDCodeAndCodeSystemValues(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code And Code System Values</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActCDCodeAndCodeSystemValues(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_AND_CODE_SYSTEM_VALUES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

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
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyProblemActCDCodeAndCodeSystemValues(AllergyProblemAct allergyProblemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActCDCodeAndCodeSystemValues", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_AND_CODE_SYSTEM_VALUES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_AND_CODE_SYSTEM_VALUES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_AND_CODE_SYSTEM_VALUES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_AND_CODE_SYSTEM_VALUES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			allergyProblemAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_CD_CODE_AND_CODE_SYSTEM_VALUES,
							ConsolPlugin.INSTANCE.getString(
								"AllergyProblemActAllergyProblemActCDCodeAndCodeSystemValues"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActCDCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActCDCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActCDCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActCDCode(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

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
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyProblemActCDCode(AllergyProblemAct allergyProblemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActCDCode", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			allergyProblemAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_CD_CODE,
							ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyProblemActCDCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActCDCodeSystem(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActCDCodeSystem(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not codeSystem.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActCDCodeSystem(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActCDCodeSystem(AllergyProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

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
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyProblemActCDCodeSystem(AllergyProblemAct allergyProblemAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AllergyProblemActAllergyProblemActCDCodeSystem", "ERROR");

		if (VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_PROBLEM_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			allergyProblemAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ALLERGY_PROBLEM_ACT__ALLERGY_PROBLEM_ACT_CD_CODE_SYSTEM,
							ConsolPlugin.INSTANCE.getString("AllergyProblemActAllergyProblemActCDCodeSystem"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
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

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ALLERGY_PROBLEM_ACT,
				ConsolPackage.Literals.ALLERGY_PROBLEM_ACT.getEAllOperations().get(64));
			try {
				GET_ALLERGY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ALLERGY_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ALLERGY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AllergyObservation> result = (Collection<AllergyObservation>) query.evaluate(allergyProblemAct);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

} // AllergyProblemActOperations
