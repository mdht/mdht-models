/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified OCL for VALIDATE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP,
 *     								   VALIDATE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP,
 *     								   VALIDATE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP,
 *     								   VALIDATE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP,
 *     							       VALIDATE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
 *     								   due to inline datatype OCL generation issues 
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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2;
import org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation;
import org.openhealthtools.mdht.uml.cda.consol.WoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Wound Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationWoundMeasurementObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Wound Measurement Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationWoundCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Wound Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationHighestPressureUlcerStage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Highest Pressure Ulcer Stage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationNumberOfPressureUlcersObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Number Of Pressure Ulcers Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCDCRCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCRCD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCDCRName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCR Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCDCRNameP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCR Name P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCDCRValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCR Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCDQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CD Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#getWoundMeasurementObservations() <em>Get Wound Measurement Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#getWoundCharacteristicss() <em>Get Wound Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#getHighestPressureUlcerStage() <em>Get Highest Pressure Ulcer Stage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#getNumberOfPressureUlcersObservation2s() <em>Get Number Of Pressure Ulcers Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WoundObservationOperations extends ProblemObservation2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WoundObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationClassCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationClassCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationClassCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationClassCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationClassCode(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("WoundObservationClassCode"), new Object[] { woundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationMoodCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationMoodCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationMoodCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationMoodCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationMoodCode(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("WoundObservationMoodCode"), new Object[] { woundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationCodeP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCodeP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationCodeP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCodeP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationCodeP(WoundObservation woundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("WoundObservationCodeP"), new Object[] { woundObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.WoundObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.WoundObservationCodeP", passToken);
				}
				passToken.add(woundObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationCode(WoundObservation woundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.WoundObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(woundObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("WoundObservationCode"), new Object[] { woundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationValue(WoundObservation woundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.WoundObservationValueP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(woundObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("WoundObservationValue"), new Object[] { woundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationValueP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationValueP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationValueP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationValueP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationValue(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationValue(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationValue(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationValue(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationValueP(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_VALUE_P,
					ConsolPlugin.INSTANCE.getString("WoundObservationValueP"), new Object[] { woundObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.WoundObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.WoundObservationValueP", passToken);
				}
				passToken.add(woundObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationTargetSiteCodeP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationTargetSiteCodeP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationTargetSiteCodeP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationTargetSiteCodeP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationTargetSiteCodeP(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_TARGET_SITE_CODE_P,
					ConsolPlugin.INSTANCE.getString("WoundObservationTargetSiteCodeP"),
					new Object[] { woundObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.WoundObservationTargetSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.WoundObservationTargetSiteCodeP", passToken);
				}
				passToken.add(woundObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationTargetSiteCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationTargetSiteCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationTargetSiteCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationTargetSiteCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationTargetSiteCode(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.WoundObservationTargetSiteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(woundObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_TARGET_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("WoundObservationTargetSiteCode"),
					new Object[] { woundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationWoundMeasurementObservation(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Wound Measurement Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationWoundMeasurementObservation(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::WoundMeasurementObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationWoundMeasurementObservation(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Wound Measurement Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationWoundMeasurementObservation(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationWoundMeasurementObservation(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("WoundObservationWoundMeasurementObservation"),
					new Object[] { woundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationWoundCharacteristics(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Wound Characteristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationWoundCharacteristics(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::WoundCharacteristics) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationWoundCharacteristics(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Wound Characteristics</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationWoundCharacteristics(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationWoundCharacteristics(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_WOUND_CHARACTERISTICS,
					ConsolPlugin.INSTANCE.getString("WoundObservationWoundCharacteristics"),
					new Object[] { woundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationHighestPressureUlcerStage(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Highest Pressure Ulcer Stage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationHighestPressureUlcerStage(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::HighestPressureUlcerStage) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationHighestPressureUlcerStage(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Highest Pressure Ulcer Stage</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationHighestPressureUlcerStage(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationHighestPressureUlcerStage(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE,
					ConsolPlugin.INSTANCE.getString("WoundObservationHighestPressureUlcerStage"),
					new Object[] { woundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationAuthorParticipation(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationAuthorParticipation(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationAuthorParticipation(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationAuthorParticipation(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationAuthorParticipation(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("WoundObservationAuthorParticipation"),
					new Object[] { woundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationNumberOfPressureUlcersObservation2(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Number Of Pressure Ulcers Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationNumberOfPressureUlcersObservation2(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationNumberOfPressureUlcersObservation2(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Number Of Pressure Ulcers Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationNumberOfPressureUlcersObservation2(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundObservationNumberOfPressureUlcersObservation2(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("WoundObservationNumberOfPressureUlcersObservation2"),
					new Object[] { woundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationCDCRCDCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCRCD Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCDCRCDCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined()).value->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationCDCRCDCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCRCD Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCDCRCDCode(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateWoundObservationCDCRCDCode(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(woundObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_CDCRCD_CODE,
						ConsolPlugin.INSTANCE.getString("WoundObservationCDCRCDCode"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationCDCRName(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCR Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCDCRName(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined() and name.oclIsKindOf(datatypes::CV) and "
			+ "let value : datatypes::CV = name.oclAsType(datatypes::CV) in "
			+ "value.code = '272741003' and value.codeSystem = '2.16.840.1.113883.6.96') )))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationCDCRName(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCR Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCDCRName(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateWoundObservationCDCRName(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(woundObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_CDCR_NAME,
						ConsolPlugin.INSTANCE.getString("WoundObservationCDCRName"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationCDCRNameP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCR Name P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCDCRNameP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationCDCRNameP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCR Name P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCDCRNameP(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateWoundObservationCDCRNameP(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(woundObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_CDCR_NAME_P,
						ConsolPlugin.INSTANCE.getString("WoundObservationCDCRNameP"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationCDCRValue(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCR Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCDCRValue(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationCDCRValue(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCR Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCDCRValue(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateWoundObservationCDCRValue(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(woundObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_CDCR_VALUE,
						ConsolPlugin.INSTANCE.getString("WoundObservationCDCRValue"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundObservationCDQualifier(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CD Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCDQualifier(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((qualifier->isEmpty() or qualifier->exists(element | element.isNullFlavorUndefined())) implies (not qualifier->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundObservationCDQualifier(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CD Qualifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundObservationCDQualifier(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateWoundObservationCDQualifier(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(woundObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.WOUND_OBSERVATION__WOUND_OBSERVATION_CD_QUALIFIER,
						ConsolPlugin.INSTANCE.getString("WoundObservationCDQualifier"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getWoundMeasurementObservations(WoundObservation) <em>Get Wound Measurement Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoundMeasurementObservations(WoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_WOUND_MEASUREMENT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::WoundMeasurementObservation)).oclAsType(consol::WoundMeasurementObservation)";

	/**
	 * The cached OCL query for the '{@link #getWoundMeasurementObservations(WoundObservation) <em>Get Wound Measurement Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoundMeasurementObservations(WoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_WOUND_MEASUREMENT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<WoundMeasurementObservation> getWoundMeasurementObservations(WoundObservation woundObservation) {
		if (GET_WOUND_MEASUREMENT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.WOUND_OBSERVATION,
				ConsolPackage.Literals.WOUND_OBSERVATION.getEAllOperations().get(113));
			try {
				GET_WOUND_MEASUREMENT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_WOUND_MEASUREMENT_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_WOUND_MEASUREMENT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<WoundMeasurementObservation> result = (Collection<WoundMeasurementObservation>) query.evaluate(woundObservation);
		return new BasicEList.UnmodifiableEList<WoundMeasurementObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getWoundCharacteristicss(WoundObservation) <em>Get Wound Characteristicss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoundCharacteristicss(WoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_WOUND_CHARACTERISTICSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::WoundCharacteristics)).oclAsType(consol::WoundCharacteristics)";

	/**
	 * The cached OCL query for the '{@link #getWoundCharacteristicss(WoundObservation) <em>Get Wound Characteristicss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoundCharacteristicss(WoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_WOUND_CHARACTERISTICSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<WoundCharacteristics> getWoundCharacteristicss(WoundObservation woundObservation) {
		if (GET_WOUND_CHARACTERISTICSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.WOUND_OBSERVATION,
				ConsolPackage.Literals.WOUND_OBSERVATION.getEAllOperations().get(114));
			try {
				GET_WOUND_CHARACTERISTICSS__EOCL_QRY = helper.createQuery(GET_WOUND_CHARACTERISTICSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_WOUND_CHARACTERISTICSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<WoundCharacteristics> result = (Collection<WoundCharacteristics>) query.evaluate(woundObservation);
		return new BasicEList.UnmodifiableEList<WoundCharacteristics>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHighestPressureUlcerStage(WoundObservation) <em>Get Highest Pressure Ulcer Stage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestPressureUlcerStage(WoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HIGHEST_PRESSURE_ULCER_STAGE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HighestPressureUlcerStage))->asSequence()->any(true).oclAsType(consol::HighestPressureUlcerStage)";

	/**
	 * The cached OCL query for the '{@link #getHighestPressureUlcerStage(WoundObservation) <em>Get Highest Pressure Ulcer Stage</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestPressureUlcerStage(WoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HIGHEST_PRESSURE_ULCER_STAGE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HighestPressureUlcerStage getHighestPressureUlcerStage(WoundObservation woundObservation) {
		if (GET_HIGHEST_PRESSURE_ULCER_STAGE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.WOUND_OBSERVATION,
				ConsolPackage.Literals.WOUND_OBSERVATION.getEAllOperations().get(115));
			try {
				GET_HIGHEST_PRESSURE_ULCER_STAGE__EOCL_QRY = helper.createQuery(GET_HIGHEST_PRESSURE_ULCER_STAGE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HIGHEST_PRESSURE_ULCER_STAGE__EOCL_QRY);
		return (HighestPressureUlcerStage) query.evaluate(woundObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNumberOfPressureUlcersObservation2s(WoundObservation) <em>Get Number Of Pressure Ulcers Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPressureUlcersObservation2s(WoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation2)).oclAsType(consol::NumberOfPressureUlcersObservation2)";

	/**
	 * The cached OCL query for the '{@link #getNumberOfPressureUlcersObservation2s(WoundObservation) <em>Get Number Of Pressure Ulcers Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPressureUlcersObservation2s(WoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NumberOfPressureUlcersObservation2> getNumberOfPressureUlcersObservation2s(
			WoundObservation woundObservation) {
		if (GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.WOUND_OBSERVATION,
				ConsolPackage.Literals.WOUND_OBSERVATION.getEAllOperations().get(116));
			try {
				GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NumberOfPressureUlcersObservation2> result = (Collection<NumberOfPressureUlcersObservation2>) query.evaluate(woundObservation);
		return new BasicEList.UnmodifiableEList<NumberOfPressureUlcersObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.114')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(WoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundObservation The receiving '<em><b>Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationTemplateId(WoundObservation woundObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ProblemObservationTemplateId"), new Object[] { woundObservation }));
			}

			return false;
		}
		return true;
	}

} // WoundObservationOperations
