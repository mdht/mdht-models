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
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Indication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationCodeNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndicationOperations extends ClinicalStatementOperations {
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
	protected IndicationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIndicationCodeNullFlavor(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationCodeNullFlavor(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INDICATION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value.nullFlavor->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateIndicationCodeNullFlavor(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationCodeNullFlavor(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INDICATION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param indication The receiving '<em><b>Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIndicationCodeNullFlavor(Indication indication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "IndicationIndicationCodeNullFlavor", "INFO");

		if (VALIDATE_INDICATION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INDICATION);
			try {
				VALIDATE_INDICATION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INDICATION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_INDICATION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(indication)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INDICATION__INDICATION_CODE_NULL_FLAVOR,
						ConsolPlugin.INSTANCE.getString("IndicationIndicationCodeNullFlavor"),
						new Object[] { indication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIndicationTemplateId(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationTemplateId(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.19')";

	/**
	 * The cached OCL invariant for the '{@link #validateIndicationTemplateId(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationTemplateId(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param indication The receiving '<em><b>Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIndicationTemplateId(Indication indication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "IndicationIndicationTemplateId", "ERROR");

		if (VALIDATE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INDICATION);
			try {
				VALIDATE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			indication)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INDICATION__INDICATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("IndicationIndicationTemplateId"),
						new Object[] { indication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIndicationClassCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationClassCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateIndicationClassCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationClassCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param indication The receiving '<em><b>Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIndicationClassCode(Indication indication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "IndicationIndicationClassCode", "ERROR");

		if (VALIDATE_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INDICATION);
			try {
				VALIDATE_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			indication)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INDICATION__INDICATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("IndicationIndicationClassCode"), new Object[] { indication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIndicationMoodCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationMoodCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateIndicationMoodCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationMoodCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param indication The receiving '<em><b>Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIndicationMoodCode(Indication indication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "IndicationIndicationMoodCode", "ERROR");

		if (VALIDATE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INDICATION);
			try {
				VALIDATE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			indication)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INDICATION__INDICATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("IndicationIndicationMoodCode"), new Object[] { indication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIndicationId(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationId(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() =  1)";

	/**
	 * The cached OCL invariant for the '{@link #validateIndicationId(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationId(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param indication The receiving '<em><b>Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIndicationId(Indication indication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "IndicationIndicationId", "ERROR");

		if (VALIDATE_INDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INDICATION);
			try {
				VALIDATE_INDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			indication)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.INDICATION__INDICATION_ID,
						ConsolPlugin.INSTANCE.getString("IndicationIndicationId"), new Object[] { indication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIndicationCodeP(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationCodeP(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateIndicationCodeP(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationCodeP(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param indication The receiving '<em><b>Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIndicationCodeP(Indication indication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "IndicationIndicationCodeP", "ERROR");

		if (VALIDATE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INDICATION);
			try {
				VALIDATE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			indication)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INDICATION__INDICATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("IndicationIndicationCodeP"), new Object[] { indication }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.IndicationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.IndicationCodeP", passToken);
				}
				passToken.add(indication);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIndicationCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006' or value.code = '373930000'))";

	/**
	 * The cached OCL invariant for the '{@link #validateIndicationCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param indication The receiving '<em><b>Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIndicationCode(Indication indication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.IndicationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(indication)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "IndicationIndicationCode", "WARNING");

		if (VALIDATE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INDICATION);
			try {
				VALIDATE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			indication)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INDICATION__INDICATION_CODE,
						ConsolPlugin.INSTANCE.getString("IndicationIndicationCode"), new Object[] { indication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIndicationStatusCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationStatusCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateIndicationStatusCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationStatusCode(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param indication The receiving '<em><b>Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIndicationStatusCode(Indication indication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "IndicationIndicationStatusCode", "ERROR");

		if (VALIDATE_INDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INDICATION);
			try {
				VALIDATE_INDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			indication)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INDICATION__INDICATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("IndicationIndicationStatusCode"),
						new Object[] { indication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIndicationEffectiveTime(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationEffectiveTime(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateIndicationEffectiveTime(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationEffectiveTime(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param indication The receiving '<em><b>Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIndicationEffectiveTime(Indication indication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "IndicationIndicationEffectiveTime", "WARNING");

		if (VALIDATE_INDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INDICATION);
			try {
				VALIDATE_INDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			indication)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INDICATION__INDICATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("IndicationIndicationEffectiveTime"),
						new Object[] { indication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIndicationValue(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationValue(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateIndicationValue(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationValue(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param indication The receiving '<em><b>Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIndicationValue(Indication indication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "IndicationIndicationValue", "WARNING");

		if (VALIDATE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INDICATION);
			try {
				VALIDATE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			indication)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INDICATION__INDICATION_VALUE,
						ConsolPlugin.INSTANCE.getString("IndicationIndicationValue"), new Object[] { indication }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIndicationValueP(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationValueP(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty())  and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateIndicationValueP(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIndicationValueP(Indication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param indication The receiving '<em><b>Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIndicationValueP(Indication indication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "IndicationIndicationValueP", "WARNING");

		if (VALIDATE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INDICATION);
			try {
				VALIDATE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			indication)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INDICATION__INDICATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString("IndicationIndicationValueP"), new Object[] { indication }));
			}

			return false;
		}
		return true;
	}

} // IndicationOperations
