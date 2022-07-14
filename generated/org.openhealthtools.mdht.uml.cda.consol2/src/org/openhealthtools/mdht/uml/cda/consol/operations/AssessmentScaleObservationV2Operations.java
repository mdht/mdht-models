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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment Scale Observation V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2DerivationExpr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Derivation Expr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2InterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2ReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Reference Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentScaleObservationV2Operations extends ClinicalStatementOperations {

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
	protected AssessmentScaleObservationV2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2TemplateId(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2TemplateId(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.69' and id.extension = '2022-06-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2TemplateId(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2TemplateId(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2TemplateId(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AssessmentScaleObservationV2AssessmentScaleObservationV2TemplateId", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleObservationV2AssessmentScaleObservationV2TemplateId"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2Id(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2Id(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2Id(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2Id(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2Id(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AssessmentScaleObservationV2AssessmentScaleObservationV2Id", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_ID,
						ConsolPlugin.INSTANCE.getString("AssessmentScaleObservationV2AssessmentScaleObservationV2Id"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2CodeP(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2CodeP(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2CodeP(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2CodeP(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2CodeP(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AssessmentScaleObservationV2AssessmentScaleObservationV2CodeP", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleObservationV2AssessmentScaleObservationV2CodeP"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2CodeP", passToken);
				}
				passToken.add(assessmentScaleObservationV2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2Code(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2Code(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2Code(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2Code(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2Code(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2CodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(assessmentScaleObservationV2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "AssessmentScaleObservationV2AssessmentScaleObservationV2Code", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_CODE,
						ConsolPlugin.INSTANCE.getString("AssessmentScaleObservationV2AssessmentScaleObservationV2Code"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2DerivationExpr(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Derivation Expr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2DerivationExpr(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_DERIVATION_EXPR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.derivationExpr.oclIsUndefined() or self.derivationExpr.isNullFlavorUndefined()) implies (not self.derivationExpr.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2DerivationExpr(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Derivation Expr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2DerivationExpr(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_DERIVATION_EXPR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2DerivationExpr(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleObservationV2AssessmentScaleObservationV2DerivationExpr", "INFO");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_DERIVATION_EXPR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_DERIVATION_EXPR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_DERIVATION_EXPR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_DERIVATION_EXPR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_DERIVATION_EXPR,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleObservationV2AssessmentScaleObservationV2DerivationExpr"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2StatusCodeP(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2StatusCodeP(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2StatusCodeP(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2StatusCodeP(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2StatusCodeP(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleObservationV2AssessmentScaleObservationV2StatusCodeP", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleObservationV2AssessmentScaleObservationV2StatusCodeP"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2StatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2StatusCodeP", passToken);
				}
				passToken.add(assessmentScaleObservationV2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2StatusCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2StatusCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2StatusCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2StatusCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2StatusCode(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2StatusCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(assessmentScaleObservationV2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "AssessmentScaleObservationV2AssessmentScaleObservationV2StatusCode", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleObservationV2AssessmentScaleObservationV2StatusCode"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2EffectiveTime(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2EffectiveTime(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2EffectiveTime(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2EffectiveTime(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2EffectiveTime(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleObservationV2AssessmentScaleObservationV2EffectiveTime", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleObservationV2AssessmentScaleObservationV2EffectiveTime"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2Value(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2Value(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2Value(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2Value(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2Value(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AssessmentScaleObservationV2AssessmentScaleObservationV2Value", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleObservationV2AssessmentScaleObservationV2Value"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2InterpretationCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2InterpretationCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2InterpretationCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2InterpretationCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2InterpretationCode(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleObservationV2AssessmentScaleObservationV2InterpretationCode", "INFO");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_INTERPRETATION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleObservationV2AssessmentScaleObservationV2InterpretationCode"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2ClassCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2ClassCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2ClassCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2ClassCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2ClassCode(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AssessmentScaleObservationV2AssessmentScaleObservationV2ClassCode", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleObservationV2AssessmentScaleObservationV2ClassCode"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2MoodCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2MoodCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2MoodCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2MoodCode(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2MoodCode(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AssessmentScaleObservationV2AssessmentScaleObservationV2MoodCode", "ERROR");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleObservationV2AssessmentScaleObservationV2MoodCode"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentScaleObservationV2ReferenceRange(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Reference Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2ReferenceRange(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->exists(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(cda::ReferenceRange))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentScaleObservationV2ReferenceRange(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Reference Range</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentScaleObservationV2ReferenceRange(AssessmentScaleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentScaleObservationV2 The receiving '<em><b>Assessment Scale Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentScaleObservationV2ReferenceRange(
			AssessmentScaleObservationV2 assessmentScaleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentScaleObservationV2AssessmentScaleObservationV2ReferenceRange", "INFO");

		if (VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2);
			try {
				VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentScaleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_SCALE_OBSERVATION_V2__ASSESSMENT_SCALE_OBSERVATION_V2_REFERENCE_RANGE,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentScaleObservationV2AssessmentScaleObservationV2ReferenceRange"),
						new Object[] { assessmentScaleObservationV2 }));
			}

			return false;
		}
		return true;
	}

} // AssessmentScaleObservationV2Operations
