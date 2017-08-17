/**
 */
package org.hl7.cbcc.privacy.consentdirective;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confidentiality Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage#getConfidentialitySecurityObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP ConfidentialitySecurityObservationValue' templateId.root='2.16.840.1.113883.3.445.12' code.code='SECCLASSOBS' code.codeSystem='2.16.840.1.113883.1.11.20471' code.codeSystemName='SecurityControlObservationValue' code.displayName='Security Category' constraints.validation.dependOn.SecurityObservationCode='SecurityObservationCodeP'"
 * @generated
 */
public interface ConfidentialitySecurityObservation extends SecurityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.value->isEmpty()'"
	 * @generated
	 */
	boolean validateConfidentialitySecurityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);
} // ConfidentialitySecurityObservation
