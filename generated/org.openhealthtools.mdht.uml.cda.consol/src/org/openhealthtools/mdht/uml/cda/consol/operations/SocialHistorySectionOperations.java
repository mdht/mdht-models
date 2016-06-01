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
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionSocialHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Social History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionPregnancyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Pregnancy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionTobaccoUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Tobacco Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#getSocialHistoryObservations() <em>Get Social History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#getPregnancyObservations() <em>Get Pregnancy Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#getSmokingStatusObservations() <em>Get Smoking Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#getTobaccoUses() <em>Get Tobacco Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocialHistorySectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.17')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionTemplateId(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			socialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("SocialHistorySectionSocialHistorySectionTemplateId"),
						new Object[] { socialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionCode(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionCode(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '29762-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionCode(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionCode(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionCode(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			socialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("SocialHistorySectionSocialHistorySectionCode"),
						new Object[] { socialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionCodeP(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionCodeP(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionCodeP(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionCodeP(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionCodeP(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			socialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("SocialHistorySectionSocialHistorySectionCodeP"),
						new Object[] { socialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionTitle(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTitle(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTitle(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTitle(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionTitle(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			socialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TITLE,
						ConsolPlugin.INSTANCE.getString("SocialHistorySectionSocialHistorySectionTitle"),
						new Object[] { socialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionText(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionText(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionText(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionText(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionText(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			socialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEXT,
						ConsolPlugin.INSTANCE.getString("SocialHistorySectionSocialHistorySectionText"),
						new Object[] { socialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionSocialHistoryObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Social History Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionSocialHistoryObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::SocialHistoryObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionSocialHistoryObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Social History Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionSocialHistoryObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionSocialHistoryObservation(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				socialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"SocialHistorySectionSocialHistorySectionSocialHistoryObservation"),
						new Object[] { socialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionPregnancyObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Pregnancy Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionPregnancyObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PregnancyObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionPregnancyObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Pregnancy Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionPregnancyObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionPregnancyObservation(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				socialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("SocialHistorySectionSocialHistorySectionPregnancyObservation"),
						new Object[] { socialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionSmokingStatusObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Smoking Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionSmokingStatusObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::SmokingStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionSmokingStatusObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Smoking Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionSmokingStatusObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionSmokingStatusObservation(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				socialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"SocialHistorySectionSocialHistorySectionSmokingStatusObservation"),
						new Object[] { socialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionTobaccoUse(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Tobacco Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTobaccoUse(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::TobaccoUse))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTobaccoUse(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Tobacco Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTobaccoUse(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionTobaccoUse(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			socialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TOBACCO_USE,
						ConsolPlugin.INSTANCE.getString("SocialHistorySectionSocialHistorySectionTobaccoUse"),
						new Object[] { socialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistoryObservations(SocialHistorySection) <em>Get Social History Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistoryObservations(SocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SocialHistoryObservation)).oclAsType(consol::SocialHistoryObservation)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistoryObservations(SocialHistorySection) <em>Get Social History Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistoryObservations(SocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SocialHistoryObservation> getSocialHistoryObservations(
			SocialHistorySection socialHistorySection) {
		if (GET_SOCIAL_HISTORY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION,
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION.getEAllOperations().get(64));
			try {
				GET_SOCIAL_HISTORY_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_SOCIAL_HISTORY_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SocialHistoryObservation> result = (Collection<SocialHistoryObservation>) query.evaluate(
			socialHistorySection);
		return new BasicEList.UnmodifiableEList<SocialHistoryObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPregnancyObservations(SocialHistorySection) <em>Get Pregnancy Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyObservations(SocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREGNANCY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PregnancyObservation)).oclAsType(consol::PregnancyObservation)";

	/**
	 * The cached OCL query for the '{@link #getPregnancyObservations(SocialHistorySection) <em>Get Pregnancy Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyObservations(SocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREGNANCY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PregnancyObservation> getPregnancyObservations(SocialHistorySection socialHistorySection) {
		if (GET_PREGNANCY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION,
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION.getEAllOperations().get(65));
			try {
				GET_PREGNANCY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PREGNANCY_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREGNANCY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PregnancyObservation> result = (Collection<PregnancyObservation>) query.evaluate(
			socialHistorySection);
		return new BasicEList.UnmodifiableEList<PregnancyObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSmokingStatusObservations(SocialHistorySection) <em>Get Smoking Status Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmokingStatusObservations(SocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SMOKING_STATUS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SmokingStatusObservation)).oclAsType(consol::SmokingStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getSmokingStatusObservations(SocialHistorySection) <em>Get Smoking Status Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmokingStatusObservations(SocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SMOKING_STATUS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SmokingStatusObservation> getSmokingStatusObservations(
			SocialHistorySection socialHistorySection) {
		if (GET_SMOKING_STATUS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION,
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION.getEAllOperations().get(66));
			try {
				GET_SMOKING_STATUS_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_SMOKING_STATUS_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SMOKING_STATUS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SmokingStatusObservation> result = (Collection<SmokingStatusObservation>) query.evaluate(
			socialHistorySection);
		return new BasicEList.UnmodifiableEList<SmokingStatusObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTobaccoUses(SocialHistorySection) <em>Get Tobacco Uses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTobaccoUses(SocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TOBACCO_USES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::TobaccoUse)).oclAsType(consol::TobaccoUse)";

	/**
	 * The cached OCL query for the '{@link #getTobaccoUses(SocialHistorySection) <em>Get Tobacco Uses</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTobaccoUses(SocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TOBACCO_USES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<TobaccoUse> getTobaccoUses(SocialHistorySection socialHistorySection) {
		if (GET_TOBACCO_USES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION,
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION.getEAllOperations().get(67));
			try {
				GET_TOBACCO_USES__EOCL_QRY = helper.createQuery(GET_TOBACCO_USES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TOBACCO_USES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TobaccoUse> result = (Collection<TobaccoUse>) query.evaluate(socialHistorySection);
		return new BasicEList.UnmodifiableEList<TobaccoUse>(result.size(), result.toArray());
	}

} // SocialHistorySectionOperations
