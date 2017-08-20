/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ServiceEventOperations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPlugin;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOfServiceEvent;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Consent Header Documentation Of Service Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOfServiceEvent#validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Service Event Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOfServiceEvent#validatePrivacyConsentHeaderDocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOfServiceEvent#validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Service Event Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivacyConsentHeaderDocumentationOfServiceEventOperations extends ServiceEventOperations {
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
	protected PrivacyConsentHeaderDocumentationOfServiceEventOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId(PrivacyConsentHeaderDocumentationOfServiceEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Service Event Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId(PrivacyConsentHeaderDocumentationOfServiceEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.3')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId(PrivacyConsentHeaderDocumentationOfServiceEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Service Event Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId(PrivacyConsentHeaderDocumentationOfServiceEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentHeaderDocumentationOfServiceEvent The receiving '<em><b>Privacy Consent Header Documentation Of Service Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId(
			PrivacyConsentHeaderDocumentationOfServiceEvent privacyConsentHeaderDocumentationOfServiceEvent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT);
			try {
				VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				privacyConsentHeaderDocumentationOfServiceEvent)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT__PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"PrivacyConsentHeaderDocumentationOfServiceEventPrivacyConsentHeaderDocumentationOfServiceEventTemplateId"),
						new Object[] { privacyConsentHeaderDocumentationOfServiceEvent }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentHeaderDocumentationOfServiceEventCode(PrivacyConsentHeaderDocumentationOfServiceEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Service Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderDocumentationOfServiceEventCode(PrivacyConsentHeaderDocumentationOfServiceEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentHeaderDocumentationOfServiceEventCode(PrivacyConsentHeaderDocumentationOfServiceEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Service Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderDocumentationOfServiceEventCode(PrivacyConsentHeaderDocumentationOfServiceEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentHeaderDocumentationOfServiceEvent The receiving '<em><b>Privacy Consent Header Documentation Of Service Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePrivacyConsentHeaderDocumentationOfServiceEventCode(
			PrivacyConsentHeaderDocumentationOfServiceEvent privacyConsentHeaderDocumentationOfServiceEvent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT);
			try {
				VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				privacyConsentHeaderDocumentationOfServiceEvent)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT__PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"PrivacyConsentHeaderDocumentationOfServiceEventPrivacyConsentHeaderDocumentationOfServiceEventCode"),
						new Object[] { privacyConsentHeaderDocumentationOfServiceEvent }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime(PrivacyConsentHeaderDocumentationOfServiceEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime(PrivacyConsentHeaderDocumentationOfServiceEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime(PrivacyConsentHeaderDocumentationOfServiceEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime(PrivacyConsentHeaderDocumentationOfServiceEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentHeaderDocumentationOfServiceEvent The receiving '<em><b>Privacy Consent Header Documentation Of Service Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime(
			PrivacyConsentHeaderDocumentationOfServiceEvent privacyConsentHeaderDocumentationOfServiceEvent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT);
			try {
				VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				privacyConsentHeaderDocumentationOfServiceEvent)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT__PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"PrivacyConsentHeaderDocumentationOfServiceEventPrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime"),
						new Object[] { privacyConsentHeaderDocumentationOfServiceEvent }));
			}

			return false;
		}
		return true;
	}

} // PrivacyConsentHeaderDocumentationOfServiceEventOperations
