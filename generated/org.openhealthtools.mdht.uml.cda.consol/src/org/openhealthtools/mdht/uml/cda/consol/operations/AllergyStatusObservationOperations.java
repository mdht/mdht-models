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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyStatusObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyStatusObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyStatusObservationTemplateId(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyStatusObservationTemplateId(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.28')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyStatusObservationTemplateId(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyStatusObservationTemplateId(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyStatusObservation The receiving '<em><b>Allergy Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyStatusObservationTemplateId(AllergyStatusObservation allergyStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_STATUS_OBSERVATION);
			try {
				VALIDATE_ALLERGY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_STATUS_OBSERVATION__ALLERGY_STATUS_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AllergyStatusObservationTemplateId"),
					new Object[] { allergyStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyStatusObservationClassCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyStatusObservationClassCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyStatusObservationClassCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyStatusObservationClassCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyStatusObservation The receiving '<em><b>Allergy Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyStatusObservationClassCode(AllergyStatusObservation allergyStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_STATUS_OBSERVATION);
			try {
				VALIDATE_ALLERGY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_STATUS_OBSERVATION__ALLERGY_STATUS_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyStatusObservationClassCode"),
					new Object[] { allergyStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyStatusObservationMoodCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyStatusObservationMoodCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyStatusObservationMoodCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyStatusObservationMoodCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyStatusObservation The receiving '<em><b>Allergy Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyStatusObservationMoodCode(AllergyStatusObservation allergyStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_STATUS_OBSERVATION);
			try {
				VALIDATE_ALLERGY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_STATUS_OBSERVATION__ALLERGY_STATUS_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyStatusObservationMoodCode"),
					new Object[] { allergyStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyStatusObservationCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyStatusObservationCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '33999-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyStatusObservationCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyStatusObservationCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyStatusObservation The receiving '<em><b>Allergy Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyStatusObservationCode(AllergyStatusObservation allergyStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_STATUS_OBSERVATION);
			try {
				VALIDATE_ALLERGY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_STATUS_OBSERVATION__ALLERGY_STATUS_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyStatusObservationCode"),
					new Object[] { allergyStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyStatusObservationStatusCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyStatusObservationStatusCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyStatusObservationStatusCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyStatusObservationStatusCode(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyStatusObservation The receiving '<em><b>Allergy Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyStatusObservationStatusCode(AllergyStatusObservation allergyStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_STATUS_OBSERVATION);
			try {
				VALIDATE_ALLERGY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_STATUS_OBSERVATION__ALLERGY_STATUS_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyStatusObservationStatusCode"),
					new Object[] { allergyStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyStatusObservationValue(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyStatusObservationValue(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = element.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '55561003' or value.code = '73425007' or value.code = '413322009')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyStatusObservationValue(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyStatusObservationValue(AllergyStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyStatusObservation The receiving '<em><b>Allergy Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyStatusObservationValue(AllergyStatusObservation allergyStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_STATUS_OBSERVATION);
			try {
				VALIDATE_ALLERGY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_STATUS_OBSERVATION__ALLERGY_STATUS_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("AllergyStatusObservationValue"),
					new Object[] { allergyStatusObservation }));
			}

			return false;
		}
		return true;
	}

} // AllergyStatusObservationOperations
