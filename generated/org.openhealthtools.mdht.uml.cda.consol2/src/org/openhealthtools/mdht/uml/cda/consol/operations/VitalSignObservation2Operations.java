/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified VALIDATE_VITAL_SIGN_OBSERVATION2_PQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP due to inline datatype OCL generation issue
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Sign Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignObservation2Operations extends VitalSignObservationOperations {
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
	protected VitalSignObservation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservation2TemplateId(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservation2TemplateId(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.27' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignObservation2TemplateId(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservation2TemplateId(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGN_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignObservation2 The receiving '<em><b>Vital Sign Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignObservation2TemplateId(VitalSignObservation2 vitalSignObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignObservation2VitalSignObservation2TemplateId", "ERROR");

		if (VALIDATE_VITAL_SIGN_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN_OBSERVATION2);
			try {
				VALIDATE_VITAL_SIGN_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGN_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGN_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGN_OBSERVATION2__VITAL_SIGN_OBSERVATION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("VitalSignObservation2VitalSignObservation2TemplateId"),
						new Object[] { vitalSignObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservationInterpretationCodeP(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Interpretation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationInterpretationCodeP(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignObservationInterpretationCodeP(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Interpretation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationInterpretationCodeP(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignObservation2 The receiving '<em><b>Vital Sign Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignObservationInterpretationCodeP(VitalSignObservation2 vitalSignObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignObservation2VitalSignObservationInterpretationCodeP", "INFO");

		if (VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN_OBSERVATION2);
			try {
				VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGN_OBSERVATION2__VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("VitalSignObservation2VitalSignObservationInterpretationCodeP"),
						new Object[] { vitalSignObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.VitalSignObservationInterpretationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.VitalSignObservationInterpretationCodeP", passToken);
				}
				passToken.add(vitalSignObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservation2AuthorParticipation(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservation2AuthorParticipation(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignObservation2AuthorParticipation(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservation2AuthorParticipation(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGN_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignObservation2 The receiving '<em><b>Vital Sign Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignObservation2AuthorParticipation(VitalSignObservation2 vitalSignObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignObservation2VitalSignObservation2AuthorParticipation", "WARNING");

		if (VALIDATE_VITAL_SIGN_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN_OBSERVATION2);
			try {
				VALIDATE_VITAL_SIGN_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGN_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGN_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGN_OBSERVATION2__VITAL_SIGN_OBSERVATION2_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString(
							"VitalSignObservation2VitalSignObservation2AuthorParticipation"),
						new Object[] { vitalSignObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservation2PQUnit(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 PQ Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservation2PQUnit(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION2_PQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (isDefined('unit') )))";

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservationTextReference(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationTextReference(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignObservationTextReference(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationTextReference(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignObservation2 The receiving '<em><b>Vital Sign Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignObservationTextReference(VitalSignObservation2 vitalSignObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignObservation2VitalSignObservationTextReference", "INFO");

		if (VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN_OBSERVATION2);
			try {
				VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGN_OBSERVATION2__VITAL_SIGN_OBSERVATION_TEXT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("VitalSignObservation2VitalSignObservationTextReference"),
						new Object[] { vitalSignObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservationReferenceValue(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationReferenceValue(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignObservationReferenceValue(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationReferenceValue(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGN_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignObservation2 The receiving '<em><b>Vital Sign Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignObservationReferenceValue(VitalSignObservation2 vitalSignObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignObservation2VitalSignObservationReferenceValue", "INFO");

		if (VALIDATE_VITAL_SIGN_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN_OBSERVATION2);
			try {
				VALIDATE_VITAL_SIGN_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGN_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGN_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGN_OBSERVATION2__VITAL_SIGN_OBSERVATION_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("VitalSignObservation2VitalSignObservationReferenceValue"),
						new Object[] { vitalSignObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservationTextReferenceValue(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationTextReferenceValue(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignObservationTextReferenceValue(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationTextReferenceValue(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignObservation2 The receiving '<em><b>Vital Sign Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignObservationTextReferenceValue(VitalSignObservation2 vitalSignObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignObservation2VitalSignObservationTextReferenceValue", "INFO");

		if (VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN_OBSERVATION2);
			try {
				VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGN_OBSERVATION2__VITAL_SIGN_OBSERVATION_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("VitalSignObservation2VitalSignObservationTextReferenceValue"),
						new Object[] { vitalSignObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservationEffectiveTime(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationEffectiveTime(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignObservationEffectiveTime(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationEffectiveTime(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGN_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignObservation2 The receiving '<em><b>Vital Sign Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignObservationEffectiveTime(VitalSignObservation2 vitalSignObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignObservation2VitalSignObservationEffectiveTime", "ERROR");

		if (VALIDATE_VITAL_SIGN_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN_OBSERVATION2);
			try {
				VALIDATE_VITAL_SIGN_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGN_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGN_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGN_OBSERVATION2__VITAL_SIGN_OBSERVATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("VitalSignObservation2VitalSignObservationEffectiveTime"),
						new Object[] { vitalSignObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservationValue(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * TODO - Issue when inherited constraint is losing the type constraint
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationValue(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignObservationValue(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationValue(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignObservation2 The receiving '<em><b>Vital Sign Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignObservationValue(VitalSignObservation2 vitalSignObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignObservation2VitalSignObservationValue", "ERROR");

		if (VALIDATE_VITAL_SIGN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN_OBSERVATION2);
			try {
				VALIDATE_VITAL_SIGN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_VITAL_SIGN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vitalSignObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGN_OBSERVATION2__VITAL_SIGN_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString("VitalSignObservation2VitalSignObservationValue"),
						new Object[] { vitalSignObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservationText(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationText(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (true)";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignObservationText(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationText(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGN_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignObservation2 The receiving '<em><b>Vital Sign Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignObservationText(VitalSignObservation2 vitalSignObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignObservation2VitalSignObservationText", "ERROR");

		if (VALIDATE_VITAL_SIGN_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN_OBSERVATION2);
			try {
				VALIDATE_VITAL_SIGN_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_VITAL_SIGN_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGN_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vitalSignObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGN_OBSERVATION2__VITAL_SIGN_OBSERVATION_TEXT,
						ConsolPlugin.INSTANCE.getString("VitalSignObservation2VitalSignObservationText"),
						new Object[] { vitalSignObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservationInterpretationCode(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationInterpretationCode(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = element.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.83' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignObservationInterpretationCode(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationInterpretationCode(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignObservation2 The receiving '<em><b>Vital Sign Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignObservationInterpretationCode(VitalSignObservation2 vitalSignObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.VitalSignObservationInterpretationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(vitalSignObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "VitalSignObservation2VitalSignObservationInterpretationCode", "ERROR");

		if (VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN_OBSERVATION2);
			try {
				VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGN_OBSERVATION2__VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE,
						ConsolPlugin.INSTANCE.getString("VitalSignObservation2VitalSignObservationInterpretationCode"),
						new Object[] { vitalSignObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservationAuthor(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationAuthor(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignObservationAuthor(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationAuthor(VitalSignObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGN_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignObservation2 The receiving '<em><b>Vital Sign Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignObservationAuthor(VitalSignObservation2 vitalSignObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignObservation2VitalSignObservationAuthor", "ERROR");

		if (VALIDATE_VITAL_SIGN_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN_OBSERVATION2);
			try {
				VALIDATE_VITAL_SIGN_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_VITAL_SIGN_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGN_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGN_OBSERVATION2__VITAL_SIGN_OBSERVATION_AUTHOR,
						ConsolPlugin.INSTANCE.getString("VitalSignObservation2VitalSignObservationAuthor"),
						new Object[] { vitalSignObservation2 }));
			}

			return false;
		}
		return true;
	}

} // VitalSignObservation2Operations
