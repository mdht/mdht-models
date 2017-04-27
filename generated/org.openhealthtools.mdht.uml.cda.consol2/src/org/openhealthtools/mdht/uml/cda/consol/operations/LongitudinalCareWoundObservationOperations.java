/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified OCL for VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP,
 *     								   VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP,
 *     								   VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP,
 *     								   VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP,
 *     							       VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP,
 *     								   VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_VALUE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
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
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2;
import org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic;
import org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Longitudinal Care Wound Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationWoundMeasurementObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Wound Measurement Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationWoundCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Wound Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationHighestPressureUlcerStage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Highest Pressure Ulcer Stage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Number Of Pressure Ulcers Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRCDValueTerminology(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCRCD Value Terminology</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCRCD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRNameP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Name P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CD Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#getWoundMeasurementObservations() <em>Get Wound Measurement Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#getWoundCharacteristicss() <em>Get Wound Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#getHighestPressureUlcerStage() <em>Get Highest Pressure Ulcer Stage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#getNumberOfPressureUlcersObservation2s() <em>Get Number Of Pressure Ulcers Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LongitudinalCareWoundObservationOperations extends ProblemObservation2Operations {
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
	protected LongitudinalCareWoundObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationClassCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationClassCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationClassCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationClassCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationClassCode(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationClassCode"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationMoodCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationMoodCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationMoodCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationMoodCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationMoodCode(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationMoodCode"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationCodeP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCodeP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationCodeP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCodeP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationCodeP(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationCodeP"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservationCodeP", passToken);
				}
				passToken.add(longitudinalCareWoundObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationCode(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(longitudinalCareWoundObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationCode"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationValueP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationValueP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationValueP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationValueP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationValueP(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationValueP"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservationValueP", passToken);
				}
				passToken.add(longitudinalCareWoundObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationValue(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationValue(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationValue(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationValue(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationValue(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservationValueP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(longitudinalCareWoundObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationValue"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationTargetSiteCodeP(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationTargetSiteCodeP"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationTargetSiteCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationTargetSiteCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationTargetSiteCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationTargetSiteCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationTargetSiteCodeP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationTargetSiteCodeP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (( not self.targetSiteCode->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationTargetSiteCodeP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationTargetSiteCodeP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationTargetSiteCode(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationTargetSiteCode"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationWoundMeasurementObservation(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Wound Measurement Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationWoundMeasurementObservation(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::WoundMeasurementObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationWoundMeasurementObservation(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Wound Measurement Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationWoundMeasurementObservation(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationWoundMeasurementObservation(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationWoundMeasurementObservation"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationWoundCharacteristics(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Wound Characteristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationWoundCharacteristics(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::WoundCharacteristic) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationWoundCharacteristics(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Wound Characteristics</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationWoundCharacteristics(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationWoundCharacteristics(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationWoundCharacteristics"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationHighestPressureUlcerStage(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Highest Pressure Ulcer Stage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationHighestPressureUlcerStage(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::HighestPressureUlcerStage) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationHighestPressureUlcerStage(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Highest Pressure Ulcer Stage</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationHighestPressureUlcerStage(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationHighestPressureUlcerStage(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationHighestPressureUlcerStage"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationAuthorParticipation(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationAuthorParticipation(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationAuthorParticipation(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationAuthorParticipation(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationAuthorParticipation(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationAuthorParticipation"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Number Of Pressure Ulcers Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Number Of Pressure Ulcers Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString(
							"LongitudinalCareWoundObservationLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationCDCRCDValueTerminology(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCRCD Value Terminology</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCDCRCDValueTerminology(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_VALUE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined()).value->excluding(null)->select(isNullFlavorUndefined())->reject(code = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationCDCRCDValueTerminology(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCRCD Value Terminology</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCDCRCDValueTerminology(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_VALUE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateLongitudinalCareWoundObservationCDCRCDValueTerminology(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_VALUE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_VALUE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_VALUE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_VALUE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			longitudinalCareWoundObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_VALUE_TERMINOLOGY,
							ConsolPlugin.INSTANCE.getString(
								"LongitudinalCareWoundObservationLongitudinalCareWoundObservationCDCRCDValueTerminology"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationCDCRCDCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCRCD Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCDCRCDCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined()).value->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationCDCRCDCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCRCD Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCDCRCDCode(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateLongitudinalCareWoundObservationCDCRCDCode(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			longitudinalCareWoundObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_CODE,
							ConsolPlugin.INSTANCE.getString(
								"LongitudinalCareWoundObservationLongitudinalCareWoundObservationCDCRCDCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationCDCRName(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCDCRName(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined() and name.oclIsKindOf(datatypes::CV) and " +
			"let value : datatypes::CV = name.oclAsType(datatypes::CV) in " +
			"value.code = '272741003' and value.codeSystem = '2.16.840.1.113883.6.96') )))";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationCDCRName(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCDCRName(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateLongitudinalCareWoundObservationCDCRName(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			longitudinalCareWoundObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME,
							ConsolPlugin.INSTANCE.getString(
								"LongitudinalCareWoundObservationLongitudinalCareWoundObservationCDCRName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationCDCRNameP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Name P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCDCRNameP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationCDCRNameP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Name P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCDCRNameP(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateLongitudinalCareWoundObservationCDCRNameP(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			longitudinalCareWoundObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME_P,
							ConsolPlugin.INSTANCE.getString(
								"LongitudinalCareWoundObservationLongitudinalCareWoundObservationCDCRNameP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationCDCRValue(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCDCRValue(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationCDCRValue(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCDCRValue(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateLongitudinalCareWoundObservationCDCRValue(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			longitudinalCareWoundObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_VALUE,
							ConsolPlugin.INSTANCE.getString(
								"LongitudinalCareWoundObservationLongitudinalCareWoundObservationCDCRValue"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLongitudinalCareWoundObservationCDQualifier(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CD Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCDQualifier(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((qualifier->isEmpty() or qualifier->exists(element | element.isNullFlavorUndefined())) implies (not qualifier->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateLongitudinalCareWoundObservationCDQualifier(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CD Qualifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLongitudinalCareWoundObservationCDQualifier(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateLongitudinalCareWoundObservationCDQualifier(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			longitudinalCareWoundObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__LONGITUDINAL_CARE_WOUND_OBSERVATION_CD_QUALIFIER,
							ConsolPlugin.INSTANCE.getString(
								"LongitudinalCareWoundObservationLongitudinalCareWoundObservationCDQualifier"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getWoundMeasurementObservations(LongitudinalCareWoundObservation) <em>Get Wound Measurement Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoundMeasurementObservations(LongitudinalCareWoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_WOUND_MEASUREMENT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::WoundMeasurementObservation)).oclAsType(consol::WoundMeasurementObservation)";

	/**
	 * The cached OCL query for the '{@link #getWoundMeasurementObservations(LongitudinalCareWoundObservation) <em>Get Wound Measurement Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoundMeasurementObservations(LongitudinalCareWoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_WOUND_MEASUREMENT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<WoundMeasurementObservation> getWoundMeasurementObservations(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation) {

		if (GET_WOUND_MEASUREMENT_OBSERVATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION,
				ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION.getEAllOperations().get(110));
			try {
				GET_WOUND_MEASUREMENT_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_WOUND_MEASUREMENT_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_WOUND_MEASUREMENT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<WoundMeasurementObservation> result = (Collection<WoundMeasurementObservation>) query.evaluate(
			longitudinalCareWoundObservation);
		return new BasicEList.UnmodifiableEList<WoundMeasurementObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getWoundCharacteristicss(LongitudinalCareWoundObservation) <em>Get Wound Characteristicss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoundCharacteristicss(LongitudinalCareWoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_WOUND_CHARACTERISTICSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::WoundCharacteristic)).oclAsType(consol::WoundCharacteristic)";

	/**
	 * The cached OCL query for the '{@link #getWoundCharacteristicss(LongitudinalCareWoundObservation) <em>Get Wound Characteristicss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoundCharacteristicss(LongitudinalCareWoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_WOUND_CHARACTERISTICSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<WoundCharacteristic> getWoundCharacteristicss(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation) {

		if (GET_WOUND_CHARACTERISTICSS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION,
				ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION.getEAllOperations().get(111));
			try {
				GET_WOUND_CHARACTERISTICSS__EOCL_QRY = helper.createQuery(GET_WOUND_CHARACTERISTICSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_WOUND_CHARACTERISTICSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<WoundCharacteristic> result = (Collection<WoundCharacteristic>) query.evaluate(
			longitudinalCareWoundObservation);
		return new BasicEList.UnmodifiableEList<WoundCharacteristic>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHighestPressureUlcerStage(LongitudinalCareWoundObservation) <em>Get Highest Pressure Ulcer Stage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestPressureUlcerStage(LongitudinalCareWoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HIGHEST_PRESSURE_ULCER_STAGE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HighestPressureUlcerStage))->asSequence()->any(true).oclAsType(consol::HighestPressureUlcerStage)";

	/**
	 * The cached OCL query for the '{@link #getHighestPressureUlcerStage(LongitudinalCareWoundObservation) <em>Get Highest Pressure Ulcer Stage</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestPressureUlcerStage(LongitudinalCareWoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HIGHEST_PRESSURE_ULCER_STAGE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HighestPressureUlcerStage getHighestPressureUlcerStage(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation) {

		if (GET_HIGHEST_PRESSURE_ULCER_STAGE__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION,
				ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION.getEAllOperations().get(112));
			try {
				GET_HIGHEST_PRESSURE_ULCER_STAGE__EOCL_QRY = helper.createQuery(
					GET_HIGHEST_PRESSURE_ULCER_STAGE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HIGHEST_PRESSURE_ULCER_STAGE__EOCL_QRY);
		return (HighestPressureUlcerStage) query.evaluate(longitudinalCareWoundObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNumberOfPressureUlcersObservation2s(LongitudinalCareWoundObservation) <em>Get Number Of Pressure Ulcers Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPressureUlcersObservation2s(LongitudinalCareWoundObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation2)).oclAsType(consol::NumberOfPressureUlcersObservation2)";

	/**
	 * The cached OCL query for the '{@link #getNumberOfPressureUlcersObservation2s(LongitudinalCareWoundObservation) <em>Get Number Of Pressure Ulcers Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPressureUlcersObservation2s(LongitudinalCareWoundObservation)
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
			LongitudinalCareWoundObservation longitudinalCareWoundObservation) {

		if (GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION,
				ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION.getEAllOperations().get(113));
			try {
				GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NumberOfPressureUlcersObservation2> result = (Collection<NumberOfPressureUlcersObservation2>) query.evaluate(
			longitudinalCareWoundObservation);
		return new BasicEList.UnmodifiableEList<NumberOfPressureUlcersObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.114' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(LongitudinalCareWoundObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param longitudinalCareWoundObservation The receiving '<em><b>Longitudinal Care Wound Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationTemplateId(
			LongitudinalCareWoundObservation longitudinalCareWoundObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				longitudinalCareWoundObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LONGITUDINAL_CARE_WOUND_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("LongitudinalCareWoundObservationProblemObservationTemplateId"),
						new Object[] { longitudinalCareWoundObservation }));
			}

			return false;
		}
		return true;
	}

} // LongitudinalCareWoundObservationOperations
