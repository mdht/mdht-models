/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.DocumentationOfOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOf;
import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Consent Header Documentation Of</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOf#validatePrivacyConsentHeaderDocumentationOfTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOf#validatePrivacyConsentHeaderDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Service Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivacyConsentHeaderDocumentationOfOperations extends DocumentationOfOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyConsentHeaderDocumentationOfOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentHeaderDocumentationOfTemplateId(PrivacyConsentHeaderDocumentationOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderDocumentationOfTemplateId(PrivacyConsentHeaderDocumentationOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.26')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentHeaderDocumentationOfTemplateId(PrivacyConsentHeaderDocumentationOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderDocumentationOfTemplateId(PrivacyConsentHeaderDocumentationOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentHeaderDocumentationOf The receiving '<em><b>Privacy Consent Header Documentation Of</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentHeaderDocumentationOfTemplateId(PrivacyConsentHeaderDocumentationOf privacyConsentHeaderDocumentationOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF);
			try {
				VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentHeaderDocumentationOf)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF__PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentHeaderDocumentationOfTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentHeaderDocumentationOf, context) }),
						 new Object [] { privacyConsentHeaderDocumentationOf }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyConsentHeaderDocumentationOfServiceEvent(PrivacyConsentHeaderDocumentationOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderDocumentationOfServiceEvent(PrivacyConsentHeaderDocumentationOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consentdirective::PrivacyConsentHeaderDocumentationOfServiceEvent))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyConsentHeaderDocumentationOfServiceEvent(PrivacyConsentHeaderDocumentationOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Header Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyConsentHeaderDocumentationOfServiceEvent(PrivacyConsentHeaderDocumentationOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyConsentHeaderDocumentationOf The receiving '<em><b>Privacy Consent Header Documentation Of</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrivacyConsentHeaderDocumentationOfServiceEvent(PrivacyConsentHeaderDocumentationOf privacyConsentHeaderDocumentationOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF);
			try {
				VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(privacyConsentHeaderDocumentationOf)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF__PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrivacyConsentHeaderDocumentationOfServiceEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(privacyConsentHeaderDocumentationOf, context) }),
						 new Object [] { privacyConsentHeaderDocumentationOf }));
			}
			return false;
		}
		return true;
	}

} // PrivacyConsentHeaderDocumentationOfOperations