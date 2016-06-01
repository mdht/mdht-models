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
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HealthStatusObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthStatusObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusObservationHasTextReference(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationHasTextReference(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusObservationHasTextReference(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationHasTextReference(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusObservation The receiving '<em><b>Health Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusObservationHasTextReference(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION);
			try {
				VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				healthStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE,
						ConsolPlugin.INSTANCE.getString(
							"HealthStatusObservationHealthStatusObservationHasTextReference"),
						new Object[] { healthStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusObservationTextReferenceValue(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationTextReferenceValue(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->forAll(reference->size() = 1) implies self.text->forAll(reference->one(value->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusObservationTextReferenceValue(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationTextReferenceValue(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusObservation The receiving '<em><b>Health Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusObservationTextReferenceValue(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION);
			try {
				VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				healthStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"HealthStatusObservationHealthStatusObservationTextReferenceValue"),
						new Object[] { healthStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusObservationHasTextReferenceValue(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Has Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationHasTextReferenceValue(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusObservationHasTextReferenceValue(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Has Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationHasTextReferenceValue(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusObservation The receiving '<em><b>Health Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusObservationHasTextReferenceValue(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION);
			try {
				VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				healthStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"HealthStatusObservationHealthStatusObservationHasTextReferenceValue"),
						new Object[] { healthStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusObservationTemplateId(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationTemplateId(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusObservationTemplateId(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationTemplateId(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusObservation The receiving '<em><b>Health Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusObservationTemplateId(HealthStatusObservation healthStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION);
			try {
				VALIDATE_HEALTH_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_HEALTH_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("HealthStatusObservationHealthStatusObservationTemplateId"),
						new Object[] { healthStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusObservationClassCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationClassCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusObservationClassCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationClassCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusObservation The receiving '<em><b>Health Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusObservationClassCode(HealthStatusObservation healthStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION);
			try {
				VALIDATE_HEALTH_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_HEALTH_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("HealthStatusObservationHealthStatusObservationClassCode"),
						new Object[] { healthStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusObservationMoodCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationMoodCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusObservationMoodCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationMoodCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusObservation The receiving '<em><b>Health Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusObservationMoodCode(HealthStatusObservation healthStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION);
			try {
				VALIDATE_HEALTH_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_HEALTH_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("HealthStatusObservationHealthStatusObservationMoodCode"),
						new Object[] { healthStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusObservationCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '11323-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusObservationCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusObservation The receiving '<em><b>Health Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusObservationCode(HealthStatusObservation healthStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION);
			try {
				VALIDATE_HEALTH_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_HEALTH_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("HealthStatusObservationHealthStatusObservationCode"),
						new Object[] { healthStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusObservationText(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationText(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusObservationText(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationText(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusObservation The receiving '<em><b>Health Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusObservationText(HealthStatusObservation healthStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION);
			try {
				VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_TEXT,
						ConsolPlugin.INSTANCE.getString("HealthStatusObservationHealthStatusObservationText"),
						new Object[] { healthStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusObservationStatusCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationStatusCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusObservationStatusCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationStatusCode(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusObservation The receiving '<em><b>Health Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusObservationStatusCode(HealthStatusObservation healthStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION);
			try {
				VALIDATE_HEALTH_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_HEALTH_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("HealthStatusObservationHealthStatusObservationStatusCode"),
						new Object[] { healthStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusObservationValue(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationValue(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '81323004' or value.code = '313386006' or value.code = '162467007' or value.code = '161901003' or value.code = '271593001' or value.code = '21134002' or value.code = '161045001' or value.code = '419099009' or value.code = '135818000' or value.code = '135815002')))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusObservationValue(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationValue(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusObservation The receiving '<em><b>Health Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusObservationValue(HealthStatusObservation healthStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION);
			try {
				VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString("HealthStatusObservationHealthStatusObservationValue"),
						new Object[] { healthStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusObservationValueP(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationValueP(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusObservationValueP(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusObservationValueP(HealthStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusObservation The receiving '<em><b>Health Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusObservationValueP(HealthStatusObservation healthStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION);
			try {
				VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString("HealthStatusObservationHealthStatusObservationValueP"),
						new Object[] { healthStatusObservation }));
			}

			return false;
		}
		return true;
	}

} // HealthStatusObservationOperations
