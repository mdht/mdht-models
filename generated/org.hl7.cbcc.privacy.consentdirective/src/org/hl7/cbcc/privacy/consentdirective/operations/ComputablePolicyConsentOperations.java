/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPlugin;
import org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsent;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Computable Policy Consent</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsent#validateComputablePolicyConsentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsent#validateComputablePolicyConsentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsent#validateComputablePolicyConsentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsent#validateComputablePolicyConsentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsent#validateComputablePolicyConsentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComputablePolicyConsentOperations extends ClinicalStatementOperations {
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
	protected ComputablePolicyConsentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComputablePolicyConsentTemplateId(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComputablePolicyConsentTemplateId(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPUTABLE_POLICY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.16')";

	/**
	 * The cached OCL invariant for the '{@link #validateComputablePolicyConsentTemplateId(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComputablePolicyConsentTemplateId(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_COMPUTABLE_POLICY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param computablePolicyConsent The receiving '<em><b>Computable Policy Consent</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateComputablePolicyConsentTemplateId(ComputablePolicyConsent computablePolicyConsent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMPUTABLE_POLICY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.COMPUTABLE_POLICY_CONSENT);
			try {
				VALIDATE_COMPUTABLE_POLICY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COMPUTABLE_POLICY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COMPUTABLE_POLICY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				computablePolicyConsent)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.COMPUTABLE_POLICY_CONSENT__COMPUTABLE_POLICY_CONSENT_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ComputablePolicyConsentComputablePolicyConsentTemplateId"),
						new Object[] { computablePolicyConsent }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComputablePolicyConsentCodeP(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComputablePolicyConsentCodeP(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPUTABLE_POLICY_CONSENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateComputablePolicyConsentCodeP(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComputablePolicyConsentCodeP(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_COMPUTABLE_POLICY_CONSENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param computablePolicyConsent The receiving '<em><b>Computable Policy Consent</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateComputablePolicyConsentCodeP(ComputablePolicyConsent computablePolicyConsent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMPUTABLE_POLICY_CONSENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.COMPUTABLE_POLICY_CONSENT);
			try {
				VALIDATE_COMPUTABLE_POLICY_CONSENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_COMPUTABLE_POLICY_CONSENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COMPUTABLE_POLICY_CONSENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				computablePolicyConsent)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.COMPUTABLE_POLICY_CONSENT__COMPUTABLE_POLICY_CONSENT_CODE_P,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ComputablePolicyConsentComputablePolicyConsentCodeP"),
						new Object[] { computablePolicyConsent }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsentCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsentCodeP", passToken);
				}
				passToken.add(computablePolicyConsent);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComputablePolicyConsentCode(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComputablePolicyConsentCode(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPUTABLE_POLICY_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateComputablePolicyConsentCode(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComputablePolicyConsentCode(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_COMPUTABLE_POLICY_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param computablePolicyConsent The receiving '<em><b>Computable Policy Consent</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateComputablePolicyConsentCode(ComputablePolicyConsent computablePolicyConsent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsentCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(computablePolicyConsent)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_COMPUTABLE_POLICY_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.COMPUTABLE_POLICY_CONSENT);
			try {
				VALIDATE_COMPUTABLE_POLICY_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_COMPUTABLE_POLICY_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COMPUTABLE_POLICY_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				computablePolicyConsent)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.COMPUTABLE_POLICY_CONSENT__COMPUTABLE_POLICY_CONSENT_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("ComputablePolicyConsentComputablePolicyConsentCode"),
						new Object[] { computablePolicyConsent }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComputablePolicyConsentMoodCode(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComputablePolicyConsentMoodCode(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPUTABLE_POLICY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateComputablePolicyConsentMoodCode(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComputablePolicyConsentMoodCode(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_COMPUTABLE_POLICY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param computablePolicyConsent The receiving '<em><b>Computable Policy Consent</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateComputablePolicyConsentMoodCode(ComputablePolicyConsent computablePolicyConsent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMPUTABLE_POLICY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.COMPUTABLE_POLICY_CONSENT);
			try {
				VALIDATE_COMPUTABLE_POLICY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COMPUTABLE_POLICY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COMPUTABLE_POLICY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				computablePolicyConsent)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.COMPUTABLE_POLICY_CONSENT__COMPUTABLE_POLICY_CONSENT_MOOD_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ComputablePolicyConsentComputablePolicyConsentMoodCode"),
						new Object[] { computablePolicyConsent }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComputablePolicyConsentValue(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComputablePolicyConsentValue(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPUTABLE_POLICY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::ED)))";

	/**
	 * The cached OCL invariant for the '{@link #validateComputablePolicyConsentValue(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Computable Policy Consent Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComputablePolicyConsentValue(ComputablePolicyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_COMPUTABLE_POLICY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param computablePolicyConsent The receiving '<em><b>Computable Policy Consent</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateComputablePolicyConsentValue(ComputablePolicyConsent computablePolicyConsent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMPUTABLE_POLICY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.COMPUTABLE_POLICY_CONSENT);
			try {
				VALIDATE_COMPUTABLE_POLICY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_COMPUTABLE_POLICY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COMPUTABLE_POLICY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				computablePolicyConsent)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.COMPUTABLE_POLICY_CONSENT__COMPUTABLE_POLICY_CONSENT_VALUE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ComputablePolicyConsentComputablePolicyConsentValue"),
						new Object[] { computablePolicyConsent }));
			}

			return false;
		}
		return true;
	}

} // ComputablePolicyConsentOperations
