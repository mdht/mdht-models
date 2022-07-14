/**
 */
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Code</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationV2StatusCodeP(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2StatusCodeP(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationV2StatusCodeP(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2StatusCodeP(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

	public static boolean validateAssessmentScaleSupportingObservationV2StatusCodeP(
			AssessmentScaleSupportingObservationV2 assessmentScaleSupportingObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2StatusCodeP",
			"ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleSupportingObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2StatusCodeP"),
						new Object[] { assessmentScaleSupportingObservationV2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2StatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2StatusCodeP",
						passToken);
				}
				passToken.add(assessmentScaleSupportingObservationV2);
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
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

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

		Object passToken = (context == null)
				? null
				: context.get(
					"org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2StatusCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(assessmentScaleSupportingObservationV2)) {
			// I have a free pass to short-circuit
			return true;
		}

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleSupportingObservationV2 The receiving '<em><b>Assessment Scale Supporting Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleSupportingObservationV2CodeP(
			AssessmentScaleSupportingObservationV2 assessmentScaleSupportingObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2CodeP", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleSupportingObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2CodeP"),
						new Object[] { assessmentScaleSupportingObservationV2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2CodeP",
						passToken);
				}
				passToken.add(assessmentScaleSupportingObservationV2);
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

	public static boolean validateAssessmentScaleSupportingObservationV2Code(
			AssessmentScaleSupportingObservationV2 assessmentScaleSupportingObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2CodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(assessmentScaleSupportingObservationV2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(
			context, "AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2Code", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleSupportingObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2__ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleSupportingObservationV2AssessmentScaleSupportingObservationV2Code"),
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
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationV2CodeP(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2CodeP(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationV2CodeP(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2CodeP(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleSupportingObservationV2Code(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2Code(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleSupportingObservationV2Code(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleSupportingObservationV2Code(AssessmentScaleSupportingObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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
