/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment Scale Supporting Observation V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2CodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentScaleSupportingObservationV2Operations extends ClinicalStatementOperations {

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
	protected AssessmentScaleSupportingObservationV2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationV2CodeCodeSystem(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Code Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2CodeCodeSystem(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.isNullFlavorDefined() or self.code.codeSystem = '2.16.840.1.113883.6.1'";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationV2CodeCodeSystem(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Code Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2CodeCodeSystem(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservationV2 The receiving '<em><b>Assessment Scale Supporting Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationV2CodeCodeSystem(
			AssessmentScaleSupportingObservationV2 assessmentScaleSupportingObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2CodeCodeSystem",
			"ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleSupportingObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_CODE_SYSTEM,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2CodeCodeSystem"),
						new Object[] { assessmentScaleSupportingObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationV2TemplateId(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2TemplateId(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.86' and id.extension = '2022-06-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationV2TemplateId(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2TemplateId(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservationV2 The receiving '<em><b>Assessment Scale Supporting Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationV2TemplateId(
			AssessmentScaleSupportingObservationV2 assessmentScaleSupportingObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2TemplateId", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleSupportingObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2TemplateId"),
						new Object[] { assessmentScaleSupportingObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationV2Id(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2Id(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationV2Id(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2Id(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservationV2 The receiving '<em><b>Assessment Scale Supporting Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationV2Id(
			AssessmentScaleSupportingObservationV2 assessmentScaleSupportingObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2Id", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleSupportingObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_ID,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2Id"),
						new Object[] { assessmentScaleSupportingObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationV2StatusCode(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2StatusCode(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationV2StatusCode(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2StatusCode(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservationV2 The receiving '<em><b>Assessment Scale Supporting Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationV2StatusCode(
			AssessmentScaleSupportingObservationV2 assessmentScaleSupportingObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2StatusCode", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleSupportingObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2StatusCode"),
						new Object[] { assessmentScaleSupportingObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservationV2 The receiving '<em><b>Assessment Scale Supporting Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationV2Value(
			AssessmentScaleSupportingObservationV2 assessmentScaleSupportingObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2Value", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleSupportingObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2Value"),
						new Object[] { assessmentScaleSupportingObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationV2ClassCode(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2ClassCode(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationV2ClassCode(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2ClassCode(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservationV2 The receiving '<em><b>Assessment Scale Supporting Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationV2ClassCode(
			AssessmentScaleSupportingObservationV2 assessmentScaleSupportingObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2ClassCode", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleSupportingObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2ClassCode"),
						new Object[] { assessmentScaleSupportingObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationV2MoodCode(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2MoodCode(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationV2MoodCode(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2MoodCode(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationV2Value(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2Value(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationV2Value(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2Value(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservationV2 The receiving '<em><b>Assessment Scale Supporting Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationV2MoodCode(
			AssessmentScaleSupportingObservationV2 assessmentScaleSupportingObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2MoodCode", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleSupportingObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2MoodCode"),
						new Object[] { assessmentScaleSupportingObservationV2 }));
			}

			return false;
		}
		return true;
	}

} // AssessmentScaleSupportingObservationV2Operations
