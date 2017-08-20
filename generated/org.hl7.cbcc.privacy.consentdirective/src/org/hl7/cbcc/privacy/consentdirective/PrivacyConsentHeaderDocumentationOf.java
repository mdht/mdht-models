/**
 */
package org.hl7.cbcc.privacy.consentdirective;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.DocumentationOf;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy Consent Header Documentation Of</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage#getPrivacyConsentHeaderDocumentationOf()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PrivacyConsentHeaderDocumentationOfTemplateId PrivacyConsentHeaderDocumentationOfServiceEvent' templateId.root='2.16.840.1.113883.3.445.26'"
 * @generated
 */
public interface PrivacyConsentHeaderDocumentationOf extends DocumentationOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.445.26\')'"
	 * @generated
	 */
	boolean validatePrivacyConsentHeaderDocumentationOfTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consentdirective::PrivacyConsentHeaderDocumentationOfServiceEvent))'"
	 * @generated
	 */
	boolean validatePrivacyConsentHeaderDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentHeaderDocumentationOf init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentHeaderDocumentationOf init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PrivacyConsentHeaderDocumentationOf
