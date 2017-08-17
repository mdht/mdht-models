/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent;
import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scanned Privacy Consent</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent#validateScannedPrivacyConsentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent#validateScannedPrivacyConsentMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Mood Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent#validateScannedPrivacyConsentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent#validateScannedPrivacyConsentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScannedPrivacyConsentOperations extends ClinicalStatementOperations {
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
	
	protected static Constraint VALIDATE_SCANNED_PRIVACY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

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
	
	public static  boolean validateScannedPrivacyConsentTemplateId(ScannedPrivacyConsent scannedPrivacyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_PRIVACY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SCANNED_PRIVACY_CONSENT);
			try {
				VALIDATE_SCANNED_PRIVACY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_PRIVACY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_PRIVACY_CONSENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedPrivacyConsent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.SCANNED_PRIVACY_CONSENT__SCANNED_PRIVACY_CONSENT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateScannedPrivacyConsentTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(scannedPrivacyConsent, context) }),
						 new Object [] { scannedPrivacyConsent }));
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
	
	protected static Constraint VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

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
	
	public static  boolean validateScannedPrivacyConsentMoodCodeP(ScannedPrivacyConsent scannedPrivacyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SCANNED_PRIVACY_CONSENT);
			try {
				VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedPrivacyConsent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.SCANNED_PRIVACY_CONSENT__SCANNED_PRIVACY_CONSENT_MOOD_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateScannedPrivacyConsentMoodCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(scannedPrivacyConsent, context) }),
						 new Object [] { scannedPrivacyConsent }));
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
	protected static final String VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_ActMoodDocumentObservation) and "+
"let value : vocab::x_ActMoodDocumentObservation = self.moodCode.oclAsType(vocab::x_ActMoodDocumentObservation) in "+
"value = vocab::x_ActMoodDocumentObservation::DEF";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedPrivacyConsentMoodCode(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Privacy Consent Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedPrivacyConsentMoodCode(ScannedPrivacyConsent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

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
	
	public static  boolean validateScannedPrivacyConsentMoodCode(ScannedPrivacyConsent scannedPrivacyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SCANNED_PRIVACY_CONSENT);
			try {
				VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_PRIVACY_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedPrivacyConsent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.SCANNED_PRIVACY_CONSENT__SCANNED_PRIVACY_CONSENT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateScannedPrivacyConsentMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(scannedPrivacyConsent, context) }),
						 new Object [] { scannedPrivacyConsent }));
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
	
	protected static Constraint VALIDATE_SCANNED_PRIVACY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

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
	
	public static  boolean validateScannedPrivacyConsentValue(ScannedPrivacyConsent scannedPrivacyConsent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_PRIVACY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SCANNED_PRIVACY_CONSENT);
			try {
				VALIDATE_SCANNED_PRIVACY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_PRIVACY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_PRIVACY_CONSENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedPrivacyConsent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.SCANNED_PRIVACY_CONSENT__SCANNED_PRIVACY_CONSENT_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateScannedPrivacyConsentValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(scannedPrivacyConsent, context) }),
						 new Object [] { scannedPrivacyConsent }));
			}
			return false;
		}
		return true;
	}

} // ScannedPrivacyConsentOperations