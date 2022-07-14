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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocialHistoryObservationOperations extends ClinicalStatementOperations {
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
	protected SocialHistoryObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationOriginalText(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationOriginalText(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() implies not self.code.originalText.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationOriginalText(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationOriginalText(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistoryObservation The receiving '<em><b>Social History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationOriginalText(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SocialHistoryObservationSocialHistoryObservationOriginalText", "WARNING");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_ORIGINAL_TEXT,
						ConsolPlugin.INSTANCE.getString("SocialHistoryObservationSocialHistoryObservationOriginalText"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationReference(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationReference(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.originalText.oclIsUndefined() implies not self.code.originalText.reference.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationReference(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationReference(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistoryObservation The receiving '<em><b>Social History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationReference(SocialHistoryObservation socialHistoryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SocialHistoryObservationSocialHistoryObservationReference", "WARNING");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_REFERENCE,
						ConsolPlugin.INSTANCE.getString("SocialHistoryObservationSocialHistoryObservationReference"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationReferenceValue(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationReferenceValue(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.originalText.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.code.originalText.reference.value.substring(2, self.code.originalText.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationReferenceValue(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationReferenceValue(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistoryObservation The receiving '<em><b>Social History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationReferenceValue(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SocialHistoryObservationSocialHistoryObservationReferenceValue", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"SocialHistoryObservationSocialHistoryObservationReferenceValue"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationTemplateId(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationTemplateId(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.38')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationTemplateId(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationTemplateId(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistoryObservation The receiving '<em><b>Social History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationTemplateId(SocialHistoryObservation socialHistoryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SocialHistoryObservationSocialHistoryObservationTemplateId", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("SocialHistoryObservationSocialHistoryObservationTemplateId"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationClassCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationClassCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationClassCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationClassCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistoryObservation The receiving '<em><b>Social History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationClassCode(SocialHistoryObservation socialHistoryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SocialHistoryObservationSocialHistoryObservationClassCode", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("SocialHistoryObservationSocialHistoryObservationClassCode"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationMoodCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationMoodCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationMoodCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationMoodCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistoryObservation The receiving '<em><b>Social History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationMoodCode(SocialHistoryObservation socialHistoryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SocialHistoryObservationSocialHistoryObservationMoodCode", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("SocialHistoryObservationSocialHistoryObservationMoodCode"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationId(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationId(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationId(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationId(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistoryObservation The receiving '<em><b>Social History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationId(SocialHistoryObservation socialHistoryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SocialHistoryObservationSocialHistoryObservationId", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SOCIAL_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_ID,
						ConsolPlugin.INSTANCE.getString("SocialHistoryObservationSocialHistoryObservationId"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationCodeP(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationCodeP(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationCodeP(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationCodeP(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistoryObservation The receiving '<em><b>Social History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationCodeP(SocialHistoryObservation socialHistoryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SocialHistoryObservationSocialHistoryObservationCodeP", "WARNING");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("SocialHistoryObservationSocialHistoryObservationCodeP"),
						new Object[] { socialHistoryObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationCodeP", passToken);
				}
				passToken.add(socialHistoryObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '229819007' or value.code = '256235009' or value.code = '160573003' or value.code = '364393001' or value.code = '364703007' or value.code = '425400000' or value.code = '363908000' or value.code = '228272008' or value.code = '105421008' or value.code = '302160007' or value.code = '423514004' or value.code = '102487004' or value.code = '424483007' or value.code = '442133001' or value.code = '446996006'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistoryObservation The receiving '<em><b>Social History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationCode(SocialHistoryObservation socialHistoryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(socialHistoryObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "SocialHistoryObservationSocialHistoryObservationCode", "WARNING");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("SocialHistoryObservationSocialHistoryObservationCode"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationStatusCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationStatusCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationStatusCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationStatusCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistoryObservation The receiving '<em><b>Social History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationStatusCode(SocialHistoryObservation socialHistoryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SocialHistoryObservationSocialHistoryObservationStatusCode", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("SocialHistoryObservationSocialHistoryObservationStatusCode"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationValue(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationValue(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationValue(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationValue(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistoryObservation The receiving '<em><b>Social History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationValue(SocialHistoryObservation socialHistoryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SocialHistoryObservationSocialHistoryObservationValue", "WARNING");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString("SocialHistoryObservationSocialHistoryObservationValue"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

} // SocialHistoryObservationOperations
