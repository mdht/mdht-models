/**
 */
package org.hl7.cbcc.privacy.consentdirective;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.ObservationMedia;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scanned Privacy Consent</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage#getScannedPrivacyConsent()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ScannedPrivacyConsentTemplateId ScannedPrivacyConsentMoodCode ScannedPrivacyConsentMoodCodeP ScannedPrivacyConsentValue' templateId.root='2.16.840.1.113883.3.445.15' moodCode='DEF' constraints.validation.dependOn.ScannedPrivacyConsentMoodCode='ScannedPrivacyConsentMoodCodeP'"
 * @generated
 */
public interface ScannedPrivacyConsent extends ObservationMedia {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.445.15\')'"
	 * @generated
	 */
	boolean validateScannedPrivacyConsentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateScannedPrivacyConsentMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_ActMoodDocumentObservation) and \nlet value : vocab::x_ActMoodDocumentObservation = self.moodCode.oclAsType(vocab::x_ActMoodDocumentObservation) in \nvalue = vocab::x_ActMoodDocumentObservation::DEF'"
	 * @generated
	 */
	boolean validateScannedPrivacyConsentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.value.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateScannedPrivacyConsentValue(DiagnosticChain diagnostics, Map<Object, Object> context);
} // ScannedPrivacyConsent
