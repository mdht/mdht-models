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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mental Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MentalStatusObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MentalStatusObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationTemplateId(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationTemplateId(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.125')";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationTemplateId(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationTemplateId(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationTemplateId(MentalStatusObservation mentalStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationTemplateId"),
					new Object[] { mentalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationClassCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationClassCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationClassCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationClassCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationClassCode(MentalStatusObservation mentalStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationClassCode"),
					new Object[] { mentalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationMoodCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationMoodCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationMoodCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationMoodCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationMoodCode(MentalStatusObservation mentalStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationMoodCode"),
					new Object[] { mentalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationId(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationId(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationId(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationId(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationId(MentalStatusObservation mentalStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationId"),
					new Object[] { mentalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationCodeP(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationCodeP(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationCodeP(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationCodeP(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationCodeP(MentalStatusObservation mentalStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationCodeP"),
					new Object[] { mentalStatusObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservationCodeP", passToken);
				}
				passToken.add(mentalStatusObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '43173001' or value.code = '405051006' or value.code = '363871006' or value.code = '85256008' or value.code = '285231000' or value.code = '6942003'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationCode(MentalStatusObservation mentalStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(mentalStatusObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationCode"),
					new Object[] { mentalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationStatusCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationStatusCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationStatusCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationStatusCode(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationStatusCode(MentalStatusObservation mentalStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationStatusCode"),
					new Object[] { mentalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationStatusCodeP(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationStatusCodeP(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationStatusCodeP(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationStatusCodeP(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationStatusCodeP(MentalStatusObservation mentalStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationStatusCodeP"),
					new Object[] { mentalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationEffectiveTime(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationEffectiveTime(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationEffectiveTime(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationEffectiveTime(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationEffectiveTime(MentalStatusObservation mentalStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationEffectiveTime"),
					new Object[] { mentalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationValue(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationValue(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationValue(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationValue(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationValue(MentalStatusObservation mentalStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationValue"),
					new Object[] { mentalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationValueP(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationValueP(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationValueP(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationValueP(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationValueP(MentalStatusObservation mentalStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_VALUE_P,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationValueP"),
					new Object[] { mentalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationAssessmentScaleObservation(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Assessment Scale Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationAssessmentScaleObservation(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AssessmentScaleObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationAssessmentScaleObservation(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Assessment Scale Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationAssessmentScaleObservation(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationAssessmentScaleObservation(
			MentalStatusObservation mentalStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MENTAL_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationAssessmentScaleObservation"),
					new Object[] { mentalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservationAuthorParticipation(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationAuthorParticipation(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservationAuthorParticipation(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservationAuthorParticipation(MentalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation The receiving '<em><b>Mental Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservationAuthorParticipation(
			MentalStatusObservation mentalStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MENTAL_STATUS_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION__MENTAL_STATUS_OBSERVATION_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservationMentalStatusObservationAuthorParticipation"),
					new Object[] { mentalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentScaleObservations(MentalStatusObservation) <em>Get Assessment Scale Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(MentalStatusObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)).oclAsType(consol::AssessmentScaleObservation)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentScaleObservations(MentalStatusObservation) <em>Get Assessment Scale Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(MentalStatusObservation)
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
			MentalStatusObservation mentalStatusObservation) {
		if (GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION,
				ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION.getEAllOperations().get(64));
			try {
				GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentScaleObservation> result = (Collection<AssessmentScaleObservation>) query.evaluate(mentalStatusObservation);
		return new BasicEList.UnmodifiableEList<AssessmentScaleObservation>(result.size(), result.toArray());
	}

} // MentalStatusObservationOperations
