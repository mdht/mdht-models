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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation#validateIHESocialHistoryObservationNoRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation#validateIHESocialHistoryObservationNoInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation#validateIHESocialHistoryObservationNoMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation#validateIHESocialHistoryObservationNoTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation#validateIHESocialHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation#validateIHESocialHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocialHistoryObservationOperations extends SimpleObservationOperations {
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
	 * The cached OCL expression body for the '{@link #validateIHESocialHistoryObservationNoRepeatNumber(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHESocialHistoryObservationNoRepeatNumber(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.repeatNumber->size() = 0";

	/**
	 * The cached OCL invariant for the '{@link #validateIHESocialHistoryObservationNoRepeatNumber(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHESocialHistoryObservationNoRepeatNumber(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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

	public static boolean validateIHESocialHistoryObservationNoRepeatNumber(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.SOCIAL_HISTORY_OBSERVATION__IHE_SOCIAL_HISTORY_OBSERVATION_NO_REPEAT_NUMBER,
						IHEPlugin.INSTANCE.getString(
							"SocialHistoryObservationIHESocialHistoryObservationNoRepeatNumber"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHESocialHistoryObservationNoInterpretationCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHESocialHistoryObservationNoInterpretationCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.interpretationCode->size() = 0";

	/**
	 * The cached OCL invariant for the '{@link #validateIHESocialHistoryObservationNoInterpretationCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHESocialHistoryObservationNoInterpretationCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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

	public static boolean validateIHESocialHistoryObservationNoInterpretationCode(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.SOCIAL_HISTORY_OBSERVATION__IHE_SOCIAL_HISTORY_OBSERVATION_NO_INTERPRETATION_CODE,
						IHEPlugin.INSTANCE.getString(
							"SocialHistoryObservationIHESocialHistoryObservationNoInterpretationCode"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHESocialHistoryObservationNoMethodCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHESocialHistoryObservationNoMethodCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.methodCode->size() = 0";

	/**
	 * The cached OCL invariant for the '{@link #validateIHESocialHistoryObservationNoMethodCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHESocialHistoryObservationNoMethodCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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

	public static boolean validateIHESocialHistoryObservationNoMethodCode(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.SOCIAL_HISTORY_OBSERVATION__IHE_SOCIAL_HISTORY_OBSERVATION_NO_METHOD_CODE,
						IHEPlugin.INSTANCE.getString("SocialHistoryObservationIHESocialHistoryObservationNoMethodCode"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHESocialHistoryObservationNoTargetSiteCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHESocialHistoryObservationNoTargetSiteCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->size() = 0";

	/**
	 * The cached OCL invariant for the '{@link #validateIHESocialHistoryObservationNoTargetSiteCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHESocialHistoryObservationNoTargetSiteCode(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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

	public static boolean validateIHESocialHistoryObservationNoTargetSiteCode(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.SOCIAL_HISTORY_OBSERVATION__IHE_SOCIAL_HISTORY_OBSERVATION_NO_TARGET_SITE_CODE,
						IHEPlugin.INSTANCE.getString(
							"SocialHistoryObservationIHESocialHistoryObservationNoTargetSiteCode"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHESocialHistoryObservationTemplateId(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHESocialHistoryObservationTemplateId(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.13.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateIHESocialHistoryObservationTemplateId(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHESocialHistoryObservationTemplateId(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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

	public static boolean validateIHESocialHistoryObservationTemplateId(
			SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.SOCIAL_HISTORY_OBSERVATION__IHE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID,
						IHEPlugin.INSTANCE.getString("SocialHistoryObservationIHESocialHistoryObservationTemplateId"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHESocialHistoryObservationValue(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHESocialHistoryObservationValue(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateIHESocialHistoryObservationValue(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHESocialHistoryObservationValue(SocialHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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

	public static boolean validateIHESocialHistoryObservationValue(SocialHistoryObservation socialHistoryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.SOCIAL_HISTORY_OBSERVATION);
			try {
				VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.SOCIAL_HISTORY_OBSERVATION__IHE_SOCIAL_HISTORY_OBSERVATION_VALUE,
						IHEPlugin.INSTANCE.getString("SocialHistoryObservationIHESocialHistoryObservationValue"),
						new Object[] { socialHistoryObservation }));
			}

			return false;
		}
		return true;
	}

} // SocialHistoryObservationOperations
