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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.SocialHistoryObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory#validateSocialHistoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory#validateSocialHistoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory#validateSocialHistoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory#validateSocialHistoryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory#validateSocialHistoryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocialHistoryOperations extends SocialHistoryObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistoryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryTemplateId(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryTemplateId(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.19')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryTemplateId(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryTemplateId(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSocialHistoryTemplateId(SocialHistory socialHistory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_TEMPLATE_ID,
					HITSPPlugin.INSTANCE.getString("SocialHistoryTemplateId"), new Object[] { socialHistory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryCodeP(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryCodeP(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryCodeP(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryCodeP(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryCodeP(SocialHistory socialHistory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_CODE_P,
					HITSPPlugin.INSTANCE.getString("SocialHistoryCodeP"), new Object[] { socialHistory }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.hitsp.SocialHistoryCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.hitsp.SocialHistoryCodeP", passToken);
				}
				passToken.add(socialHistory);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '160573003' or value.code = '363908000' or value.code = '364703007' or value.code = '256235009' or value.code = '228272008' or value.code = '364393001' or value.code = '229819007' or value.code = '425400000'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSocialHistoryCode(SocialHistory socialHistory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.hitsp.SocialHistoryCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(socialHistory)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_CODE,
					HITSPPlugin.INSTANCE.getString("SocialHistoryCode"), new Object[] { socialHistory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryEffectiveTime(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryEffectiveTime(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryEffectiveTime(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryEffectiveTime(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSocialHistoryEffectiveTime(SocialHistory socialHistory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_EFFECTIVE_TIME,
					HITSPPlugin.INSTANCE.getString("SocialHistoryEffectiveTime"), new Object[] { socialHistory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryText(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryText(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryText(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryText(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSocialHistoryText(SocialHistory socialHistory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_TEXT,
					HITSPPlugin.INSTANCE.getString("SocialHistoryText"), new Object[] { socialHistory }));
			}

			return false;
		}
		return true;
	}

} // SocialHistoryOperations
