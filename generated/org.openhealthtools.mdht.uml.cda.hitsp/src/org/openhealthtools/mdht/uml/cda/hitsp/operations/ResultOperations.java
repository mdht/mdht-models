/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultObservationOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Result#validateResultTypeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Type Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Result#validateResultLaboratoryResultsValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Laboratory Results Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Result#validateResultValuePresence(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value Presence</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Result#validateResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Result#validateResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Result#validateResultEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Result#validateResultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultOperations extends ResultObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultTypeCodeSystem(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Type Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultTypeCodeSystem(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_TYPE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.codeSystem = '2.16.840.1.113883.6.1' or self.code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateResultTypeCodeSystem(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Type Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultTypeCodeSystem(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_TYPE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.codeSystem = '2.16.840.1.113883.6.1' or self.code.codeSystem = '2.16.840.1.113883.6.96'
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultTypeCodeSystem(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_TYPE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_TYPE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_TYPE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_TYPE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.RESULT__RESULT_TYPE_CODE_SYSTEM,
					HITSPPlugin.INSTANCE.getString("ResultTypeCodeSystem"), new Object[] { result }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultLaboratoryResultsValueSet(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Laboratory Results Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultLaboratoryResultsValueSet(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_LABORATORY_RESULTS_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.codeSystem = '2.16.840.1.113883.6.1'";

	/**
	 * The cached OCL invariant for the '{@link #validateResultLaboratoryResultsValueSet(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Laboratory Results Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultLaboratoryResultsValueSet(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_LABORATORY_RESULTS_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.codeSystem = '2.16.840.1.113883.6.1'
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultLaboratoryResultsValueSet(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_LABORATORY_RESULTS_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_LABORATORY_RESULTS_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_LABORATORY_RESULTS_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_LABORATORY_RESULTS_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			result)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.RESULT__RESULT_LABORATORY_RESULTS_VALUE_SET,
					HITSPPlugin.INSTANCE.getString("ResultLaboratoryResultsValueSet"), new Object[] { result }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultValuePresence(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value Presence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultValuePresence(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.moodCode = vocab::x_ActMoodDocumentObservation::EVN or self.moodCode = vocab::x_ActMoodDocumentObservation::EVN)"
			+ "    implies (not self.value->isEmpty()) and"
			+ "  (self.moodCode = vocab::x_ActMoodDocumentObservation::INT or self.moodCode = vocab::x_ActMoodDocumentObservation::PRP)"
			+ "   implies (self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultValuePresence(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value Presence</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultValuePresence(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.moodCode = vocab::x_ActMoodDocumentObservation::EVN or self.moodCode = vocab::x_ActMoodDocumentObservation::EVN)
	 *     implies (not self.value->isEmpty()) and
	 *   (self.moodCode = vocab::x_ActMoodDocumentObservation::INT or self.moodCode = vocab::x_ActMoodDocumentObservation::PRP)
	 *    implies (self.value->isEmpty())
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultValuePresence(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE, HITSPValidator.RESULT__RESULT_VALUE_PRESENCE,
					HITSPPlugin.INSTANCE.getString("ResultValuePresence"), new Object[] { result }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultTemplateId(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultTemplateId(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.15.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultTemplateId(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultTemplateId(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.15.1')
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultTemplateId(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE, HITSPValidator.RESULT__RESULT_TEMPLATE_ID,
					HITSPPlugin.INSTANCE.getString("ResultTemplateId"), new Object[] { result }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE, HITSPValidator.RESULT__RESULT_CODE,
					HITSPPlugin.INSTANCE.getString("ResultCode"), new Object[] { result }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultEffectiveTime(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultEffectiveTime(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultEffectiveTime(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultEffectiveTime(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultEffectiveTime(Result result, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE, HITSPValidator.RESULT__RESULT_EFFECTIVE_TIME,
					HITSPPlugin.INSTANCE.getString("ResultEffectiveTime"), new Object[] { result }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultValue(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultValue(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultValue(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultValue(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultValue(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE, HITSPValidator.RESULT__RESULT_VALUE,
					HITSPPlugin.INSTANCE.getString("ResultValue"), new Object[] { result }));
			}

			return false;
		}
		return true;
	}

} // ResultOperations
