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
import org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scanned Privacy Consent</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent#validateScannedPrivacyConsentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent#validateScannedPrivacyConsentMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Mood Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent#validateScannedPrivacyConsentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent#validateScannedPrivacyConsentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScannedPrivacyConsentOperations extends ClinicalStatementOperations {
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
	protected ScannedPrivacyConsentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedPrivacyConsentTemplateId(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedPrivacyConsentTemplateId(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_PRIVACY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.15')";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedPrivacyConsentTemplateId(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedPrivacyConsentTemplateId(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SCANNED_PRIVACY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scannedPrivacyConsent The receiving '<em><b>Scanned Privacy Consent</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScannedPrivacyConsentTemplateId(ScannedPrivacyConsent scannedPrivacyConsent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCANNED_PRIVACY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SCANNED_PRIVACY_CONSENT);
			try {
				VALIDATE_SCANNED_PRIVACY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SCANNED_PRIVACY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SCANNED_PRIVACY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				scannedPrivacyConsent)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.SCANNED_PRIVACY_CONSENT__SCANNED_PRIVACY_CONSENT_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ScannedPrivacyConsentScannedPrivacyConsentTemplateId"),
						new Object[] { scannedPrivacyConsent }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedPrivacyConsentMoodCodeP(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Mood Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedPrivacyConsentMoodCodeP(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedPrivacyConsentMoodCodeP(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Mood Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedPrivacyConsentMoodCodeP(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scannedPrivacyConsent The receiving '<em><b>Scanned Privacy Consent</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScannedPrivacyConsentMoodCodeP(ScannedPrivacyConsent scannedPrivacyConsent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SCANNED_PRIVACY_CONSENT);
			try {
				VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				scannedPrivacyConsent)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.SCANNED_PRIVACY_CONSENT__SCANNED_PRIVACY_CONSENT_MOOD_CODE_P,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ScannedPrivacyConsentScannedPrivacyConsentMoodCodeP"),
						new Object[] { scannedPrivacyConsent }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsentMoodCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsentMoodCodeP", passToken);
				}
				passToken.add(scannedPrivacyConsent);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedPrivacyConsentMoodCode(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedPrivacyConsentMoodCode(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_ActMoodDocumentObservation) and " +
			"let value : vocab::x_ActMoodDocumentObservation = self.moodCode.oclAsType(vocab::x_ActMoodDocumentObservation) in " +
			"value = vocab::x_ActMoodDocumentObservation::DEF";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedPrivacyConsentMoodCode(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedPrivacyConsentMoodCode(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scannedPrivacyConsent The receiving '<em><b>Scanned Privacy Consent</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScannedPrivacyConsentMoodCode(ScannedPrivacyConsent scannedPrivacyConsent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsentMoodCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(scannedPrivacyConsent)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SCANNED_PRIVACY_CONSENT);
			try {
				VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				scannedPrivacyConsent)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.SCANNED_PRIVACY_CONSENT__SCANNED_PRIVACY_CONSENT_MOOD_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("ScannedPrivacyConsentScannedPrivacyConsentMoodCode"),
						new Object[] { scannedPrivacyConsent }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedPrivacyConsentValue(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedPrivacyConsentValue(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_PRIVACY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedPrivacyConsentValue(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedPrivacyConsentValue(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SCANNED_PRIVACY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scannedPrivacyConsent The receiving '<em><b>Scanned Privacy Consent</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScannedPrivacyConsentValue(ScannedPrivacyConsent scannedPrivacyConsent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCANNED_PRIVACY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SCANNED_PRIVACY_CONSENT);
			try {
				VALIDATE_SCANNED_PRIVACY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SCANNED_PRIVACY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SCANNED_PRIVACY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				scannedPrivacyConsent)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.SCANNED_PRIVACY_CONSENT__SCANNED_PRIVACY_CONSENT_VALUE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("ScannedPrivacyConsentScannedPrivacyConsentValue"),
						new Object[] { scannedPrivacyConsent }));
			}

			return false;
		}
		return true;
	}

} // ScannedPrivacyConsentOperations
