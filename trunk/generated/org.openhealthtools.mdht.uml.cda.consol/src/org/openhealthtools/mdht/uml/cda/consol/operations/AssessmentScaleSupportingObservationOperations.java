/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment Scale Supporting Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationValueTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Value Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentScaleSupportingObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentScaleSupportingObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationCodeCodeSystem(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Code Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationCodeCodeSystem(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.isNullFlavorDefined() or self.code.codeSystem = '2.16.840.1.113883.6.1' or self.code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationCodeCodeSystem(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Code Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationCodeCodeSystem(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservation The receiving '<em><b>Assessment Scale Supporting Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationCodeCodeSystem(
			AssessmentScaleSupportingObservation assessmentScaleSupportingObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentScaleSupportingObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE_CODE_SYSTEM,
					ConsolPlugin.INSTANCE.getString("AssessmentScaleSupportingObservationCodeCodeSystem"),
					new Object[] { assessmentScaleSupportingObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationValueTranslation(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Value Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationValueTranslation(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value.oclAsType(datatypes::CD).translation->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationValueTranslation(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Value Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationValueTranslation(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservation The receiving '<em><b>Assessment Scale Supporting Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationValueTranslation(
			AssessmentScaleSupportingObservation assessmentScaleSupportingObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentScaleSupportingObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE_TRANSLATION,
					ConsolPlugin.INSTANCE.getString("AssessmentScaleSupportingObservationValueTranslation"),
					new Object[] { assessmentScaleSupportingObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationTemplateId(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationTemplateId(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.86')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationTemplateId(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationTemplateId(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservation The receiving '<em><b>Assessment Scale Supporting Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationTemplateId(
			AssessmentScaleSupportingObservation assessmentScaleSupportingObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentScaleSupportingObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AssessmentScaleSupportingObservationTemplateId"),
					new Object[] { assessmentScaleSupportingObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationClassCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationClassCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationClassCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationClassCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservation The receiving '<em><b>Assessment Scale Supporting Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationClassCode(
			AssessmentScaleSupportingObservation assessmentScaleSupportingObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentScaleSupportingObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("AssessmentScaleSupportingObservationClassCode"),
					new Object[] { assessmentScaleSupportingObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationMoodCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationMoodCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationMoodCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationMoodCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservation The receiving '<em><b>Assessment Scale Supporting Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationMoodCode(
			AssessmentScaleSupportingObservation assessmentScaleSupportingObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentScaleSupportingObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("AssessmentScaleSupportingObservationMoodCode"),
					new Object[] { assessmentScaleSupportingObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservation The receiving '<em><b>Assessment Scale Supporting Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationCode(
			AssessmentScaleSupportingObservation assessmentScaleSupportingObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentScaleSupportingObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("AssessmentScaleSupportingObservationCode"),
					new Object[] { assessmentScaleSupportingObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationId(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationId(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationId(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationId(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservation The receiving '<em><b>Assessment Scale Supporting Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationId(
			AssessmentScaleSupportingObservation assessmentScaleSupportingObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentScaleSupportingObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("AssessmentScaleSupportingObservationId"),
					new Object[] { assessmentScaleSupportingObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationStatusCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationStatusCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationStatusCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationStatusCode(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservation The receiving '<em><b>Assessment Scale Supporting Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationStatusCode(
			AssessmentScaleSupportingObservation assessmentScaleSupportingObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentScaleSupportingObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("AssessmentScaleSupportingObservationStatusCode"),
					new Object[] { assessmentScaleSupportingObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationStatusCodeP(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationStatusCodeP(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationStatusCodeP(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationStatusCodeP(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservation The receiving '<em><b>Assessment Scale Supporting Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationStatusCodeP(
			AssessmentScaleSupportingObservation assessmentScaleSupportingObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentScaleSupportingObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("AssessmentScaleSupportingObservationStatusCodeP"),
					new Object[] { assessmentScaleSupportingObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationValue(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationValue(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationValue(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationValue(AssessmentScaleSupportingObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservation The receiving '<em><b>Assessment Scale Supporting Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationValue(
			AssessmentScaleSupportingObservation assessmentScaleSupportingObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentScaleSupportingObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("AssessmentScaleSupportingObservationValue"),
					new Object[] { assessmentScaleSupportingObservation }));
			}

			return false;
		}
		return true;
	}

} // AssessmentScaleSupportingObservationOperations
