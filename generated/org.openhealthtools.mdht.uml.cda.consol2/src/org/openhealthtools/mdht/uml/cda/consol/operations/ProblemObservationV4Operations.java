/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Observation V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4IVLTS High</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemObservationV4Operations extends ProblemObservation2Operations {

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
	protected ProblemObservationV4Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4TemplateId(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4TemplateId(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.4' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4TemplateId(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4TemplateId(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationV4TemplateId(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4TemplateId", "ERROR");

		if (VALIDATE_PROBLEM_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				VALIDATE_PROBLEM_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4TemplateId"),
						new Object[] { problemObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4Id(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4Id(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4Id(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4Id(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_V4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationV4Id(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4Id", "ERROR");

		if (VALIDATE_PROBLEM_OBSERVATION_V4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				VALIDATE_PROBLEM_OBSERVATION_V4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_V4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PROBLEM_OBSERVATION_V4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			problemObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4_ID,
						ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4Id"),
						new Object[] { problemObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4CodeP(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4CodeP(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4CodeP(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4CodeP(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_V4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationV4CodeP(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4CodeP", "ERROR");

		if (VALIDATE_PROBLEM_OBSERVATION_V4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				VALIDATE_PROBLEM_OBSERVATION_V4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_V4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_OBSERVATION_V4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(problemObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4_CODE_P,
						ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4CodeP"),
						new Object[] { problemObservationV4 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4CodeP", passToken);
				}
				passToken.add(problemObservationV4);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4Code(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4Code(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006' or value.code = '373930000'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4Code(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4Code(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_V4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationV4Code(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(problemObservationV4)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4Code", "WARNING");

		if (VALIDATE_PROBLEM_OBSERVATION_V4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				VALIDATE_PROBLEM_OBSERVATION_V4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_V4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_OBSERVATION_V4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(problemObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4_CODE,
						ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4Code"),
						new Object[] { problemObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4StatusCodeP(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4StatusCodeP(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4StatusCodeP(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4StatusCodeP(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationV4StatusCodeP(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4StatusCodeP", "ERROR");

		if (VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4StatusCodeP"),
						new Object[] { problemObservationV4 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4StatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4StatusCodeP", passToken);
				}
				passToken.add(problemObservationV4);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4StatusCode(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4StatusCode(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4StatusCode(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4StatusCode(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationV4StatusCode(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4StatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(problemObservationV4)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4StatusCode", "ERROR");

		if (VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4StatusCode"),
						new Object[] { problemObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4EffectiveTime(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4EffectiveTime(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4EffectiveTime(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4EffectiveTime(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationV4EffectiveTime(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4EffectiveTime", "ERROR");

		if (VALIDATE_PROBLEM_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				VALIDATE_PROBLEM_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4EffectiveTime"),
						new Object[] { problemObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4Value(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4Value(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4Value(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4Value(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationV4Value(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4Value", "WARNING");

		if (VALIDATE_PROBLEM_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				VALIDATE_PROBLEM_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(problemObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4_VALUE,
						ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4Value"),
						new Object[] { problemObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4ValueP(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4ValueP(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4ValueP(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4ValueP(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationV4ValueP(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4ValueP", "ERROR");

		if (VALIDATE_PROBLEM_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				VALIDATE_PROBLEM_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4_VALUE_P,
						ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4ValueP"),
						new Object[] { problemObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4ClassCode(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4ClassCode(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4ClassCode(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4ClassCode(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_V4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationV4ClassCode(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4ClassCode", "ERROR");

		if (VALIDATE_PROBLEM_OBSERVATION_V4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				VALIDATE_PROBLEM_OBSERVATION_V4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_V4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_OBSERVATION_V4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4ClassCode"),
						new Object[] { problemObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4MoodCode(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4MoodCode(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4MoodCode(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4MoodCode(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_V4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationV4MoodCode(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4MoodCode", "ERROR");

		if (VALIDATE_PROBLEM_OBSERVATION_V4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				VALIDATE_PROBLEM_OBSERVATION_V4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_V4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_OBSERVATION_V4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4MoodCode"),
						new Object[] { problemObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4IVLTSLow(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4IVLTSLow(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4IVLTSLow(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4IVLTSLow(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProblemObservationV4IVLTSLow(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4IVLTSLow", "ERROR");

		if (VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			problemObservationV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4IVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationV4IVLTSHigh(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4IVLTSHigh(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationV4IVLTSHigh(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationV4IVLTSHigh(ProblemObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemObservationV4 The receiving '<em><b>Problem Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProblemObservationV4IVLTSHigh(ProblemObservationV4 problemObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemObservationV4ProblemObservationV4IVLTSHigh", "INFO");

		if (VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_OBSERVATION_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			problemObservationV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROBLEM_OBSERVATION_V4__PROBLEM_OBSERVATION_V4IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString("ProblemObservationV4ProblemObservationV4IVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // ProblemObservationV4Operations
