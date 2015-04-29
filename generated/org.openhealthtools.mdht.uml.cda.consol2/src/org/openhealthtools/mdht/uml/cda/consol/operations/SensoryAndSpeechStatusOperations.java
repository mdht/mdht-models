/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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

import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Sensory And Speech Status</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensoryAndSpeechStatusOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensoryAndSpeechStatusOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusTemplateId(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusTemplateId(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.127')";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusTemplateId(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusTemplateId(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SENSORY_AND_SPEECH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSensoryAndSpeechStatusTemplateId(SensoryAndSpeechStatus sensoryAndSpeechStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				VALIDATE_SENSORY_AND_SPEECH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SENSORY_AND_SPEECH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SENSORY_AND_SPEECH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sensoryAndSpeechStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusTemplateId"),
					new Object[] { sensoryAndSpeechStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusClassCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusClassCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusClassCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusClassCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SENSORY_AND_SPEECH_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSensoryAndSpeechStatusClassCode(SensoryAndSpeechStatus sensoryAndSpeechStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				VALIDATE_SENSORY_AND_SPEECH_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SENSORY_AND_SPEECH_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SENSORY_AND_SPEECH_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sensoryAndSpeechStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusClassCode"),
					new Object[] { sensoryAndSpeechStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusMoodCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusMoodCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusMoodCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusMoodCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SENSORY_AND_SPEECH_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSensoryAndSpeechStatusMoodCode(SensoryAndSpeechStatus sensoryAndSpeechStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				VALIDATE_SENSORY_AND_SPEECH_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SENSORY_AND_SPEECH_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SENSORY_AND_SPEECH_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sensoryAndSpeechStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusMoodCode"),
					new Object[] { sensoryAndSpeechStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusCodeP(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusCodeP(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusCodeP(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusCodeP(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSensoryAndSpeechStatusCodeP(SensoryAndSpeechStatus sensoryAndSpeechStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sensoryAndSpeechStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusCodeP"),
					new Object[] { sensoryAndSpeechStatus }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatusCodeP", passToken);
				}
				passToken.add(sensoryAndSpeechStatus);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '47078008' or value.code = '405183003' or value.code = '373713005' or value.code = '397627001' or value.code = '397686008'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSensoryAndSpeechStatusCode(SensoryAndSpeechStatus sensoryAndSpeechStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(sensoryAndSpeechStatus)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sensoryAndSpeechStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusCode"),
					new Object[] { sensoryAndSpeechStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusStatusCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusStatusCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusStatusCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusStatusCode(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSensoryAndSpeechStatusStatusCode(SensoryAndSpeechStatus sensoryAndSpeechStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sensoryAndSpeechStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusStatusCode"),
					new Object[] { sensoryAndSpeechStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusStatusCodeP(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusStatusCodeP(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusStatusCodeP(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusStatusCodeP(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSensoryAndSpeechStatusStatusCodeP(SensoryAndSpeechStatus sensoryAndSpeechStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sensoryAndSpeechStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusStatusCodeP"),
					new Object[] { sensoryAndSpeechStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusEffectiveTime(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusEffectiveTime(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusEffectiveTime(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusEffectiveTime(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SENSORY_AND_SPEECH_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSensoryAndSpeechStatusEffectiveTime(SensoryAndSpeechStatus sensoryAndSpeechStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				VALIDATE_SENSORY_AND_SPEECH_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SENSORY_AND_SPEECH_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SENSORY_AND_SPEECH_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sensoryAndSpeechStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusEffectiveTime"),
					new Object[] { sensoryAndSpeechStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusValue(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusValue(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '11163003' or value.code = '260379002')))";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusValue(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusValue(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSensoryAndSpeechStatusValue(SensoryAndSpeechStatus sensoryAndSpeechStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sensoryAndSpeechStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_VALUE,
					ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusValue"),
					new Object[] { sensoryAndSpeechStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusValueP(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusValueP(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusValueP(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusValueP(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSensoryAndSpeechStatusValueP(SensoryAndSpeechStatus sensoryAndSpeechStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sensoryAndSpeechStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_VALUE_P,
					ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusValueP"),
					new Object[] { sensoryAndSpeechStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusAuthor(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusAuthor(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusAuthor(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusAuthor(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSensoryAndSpeechStatusAuthor(SensoryAndSpeechStatus sensoryAndSpeechStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sensoryAndSpeechStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_AUTHOR,
					ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusAuthor"),
					new Object[] { sensoryAndSpeechStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusAssessmentScaleObservation(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Assessment Scale Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusAssessmentScaleObservation(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AssessmentScaleObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusAssessmentScaleObservation(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Assessment Scale Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusAssessmentScaleObservation(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SENSORY_AND_SPEECH_STATUS_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSensoryAndSpeechStatusAssessmentScaleObservation(
			SensoryAndSpeechStatus sensoryAndSpeechStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				VALIDATE_SENSORY_AND_SPEECH_STATUS_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SENSORY_AND_SPEECH_STATUS_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SENSORY_AND_SPEECH_STATUS_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sensoryAndSpeechStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_ASSESSMENT_SCALE_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusAssessmentScaleObservation"),
					new Object[] { sensoryAndSpeechStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSensoryAndSpeechStatusAuthorTime(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusAuthorTime(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSensoryAndSpeechStatusAuthorTime(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSensoryAndSpeechStatusAuthorTime(SensoryAndSpeechStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sensoryAndSpeechStatus The receiving '<em><b>Sensory And Speech Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSensoryAndSpeechStatusAuthorTime(SensoryAndSpeechStatus sensoryAndSpeechStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(sensoryAndSpeechStatus);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SENSORY_AND_SPEECH_STATUS__SENSORY_AND_SPEECH_STATUS_AUTHOR_TIME,
						ConsolPlugin.INSTANCE.getString("SensoryAndSpeechStatusAuthorTime"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentScaleObservations(SensoryAndSpeechStatus) <em>Get Assessment Scale Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(SensoryAndSpeechStatus)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)).oclAsType(consol::AssessmentScaleObservation)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentScaleObservations(SensoryAndSpeechStatus) <em>Get Assessment Scale Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(SensoryAndSpeechStatus)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AssessmentScaleObservation> getAssessmentScaleObservations(
			SensoryAndSpeechStatus sensoryAndSpeechStatus) {
		if (GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS,
				ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS.getEAllOperations().get(64));
			try {
				GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentScaleObservation> result = (Collection<AssessmentScaleObservation>) query.evaluate(sensoryAndSpeechStatus);
		return new BasicEList.UnmodifiableEList<AssessmentScaleObservation>(result.size(), result.toArray());
	}

} // SensoryAndSpeechStatusOperations
