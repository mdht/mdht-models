/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation;

import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Obligation Policy Security Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation#validateObligationPolicySecurityObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obligation Policy Security Observation Value P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation#validateObligationPolicySecurityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obligation Policy Security Observation Value</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation#validateSecurityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation#validateSecurityObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation#validateSecurityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObligationPolicySecurityObservationOperations extends SecurityObservationOperations {

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
	protected ObligationPolicySecurityObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObligationPolicySecurityObservationValueP(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obligation Policy Security Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObligationPolicySecurityObservationValueP(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.value->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateObligationPolicySecurityObservationValueP(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obligation Policy Security Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObligationPolicySecurityObservationValueP(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param obligationPolicySecurityObservation The receiving '<em><b>Obligation Policy Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateObligationPolicySecurityObservationValueP(
			ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.OBLIGATION_POLICY_SECURITY_OBSERVATION);
			try {
				VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				obligationPolicySecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.OBLIGATION_POLICY_SECURITY_OBSERVATION__OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE_P,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"ObligationPolicySecurityObservationObligationPolicySecurityObservationValueP"),
						new Object[] { obligationPolicySecurityObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservationValueP", passToken);
				}
				passToken.add(obligationPolicySecurityObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObligationPolicySecurityObservationValue(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obligation Policy Security Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObligationPolicySecurityObservationValue(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = element.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.1.11.20471' and (value.code = 'CPLYCD' or value.code = 'ENCRYPT'))";

	/**
	 * The cached OCL invariant for the '{@link #validateObligationPolicySecurityObservationValue(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obligation Policy Security Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObligationPolicySecurityObservationValue(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param obligationPolicySecurityObservation The receiving '<em><b>Obligation Policy Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateObligationPolicySecurityObservationValue(
			ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservationValueP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(obligationPolicySecurityObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.OBLIGATION_POLICY_SECURITY_OBSERVATION);
			try {
				VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				obligationPolicySecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.OBLIGATION_POLICY_SECURITY_OBSERVATION__OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"ObligationPolicySecurityObservationObligationPolicySecurityObservationValue"),
						new Object[] { obligationPolicySecurityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSecurityObservationTemplateId(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationTemplateId(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateSecurityObservationTemplateId(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationTemplateId(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param obligationPolicySecurityObservation The receiving '<em><b>Obligation Policy Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSecurityObservationTemplateId(
			ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.OBLIGATION_POLICY_SECURITY_OBSERVATION);
			try {
				VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				obligationPolicySecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.OBLIGATION_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"ObligationPolicySecurityObservationSecurityObservationTemplateId"),
						new Object[] { obligationPolicySecurityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSecurityObservationCodeP(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationCodeP(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSecurityObservationCodeP(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationCodeP(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param obligationPolicySecurityObservation The receiving '<em><b>Obligation Policy Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSecurityObservationCodeP(
			ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.OBLIGATION_POLICY_SECURITY_OBSERVATION);
			try {
				VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				obligationPolicySecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.OBLIGATION_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE_P,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"ObligationPolicySecurityObservationSecurityObservationCodeP"),
						new Object[] { obligationPolicySecurityObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.hl7.security.ds4p.contentprofile.SecurityObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.hl7.security.ds4p.contentprofile.SecurityObservationCodeP", passToken);
				}
				passToken.add(obligationPolicySecurityObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSecurityObservationCode(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationCode(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'SECCONOBS' and value.codeSystem = '2.16.840.1.113883.1.11.20457'";

	/**
	 * The cached OCL invariant for the '{@link #validateSecurityObservationCode(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationCode(ObligationPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param obligationPolicySecurityObservation The receiving '<em><b>Obligation Policy Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSecurityObservationCode(
			ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.hl7.security.ds4p.contentprofile.SecurityObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(obligationPolicySecurityObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.OBLIGATION_POLICY_SECURITY_OBSERVATION);
			try {
				VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			obligationPolicySecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.OBLIGATION_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"ObligationPolicySecurityObservationSecurityObservationCode"),
						new Object[] { obligationPolicySecurityObservation }));
			}

			return false;
		}
		return true;
	}

} // ObligationPolicySecurityObservationOperations
