/**
 */
package org.hl7.cbcc.privacy.consentdirective;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purpose Of Use Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage#getPurposeOfUseSecurityObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP PurposeOfUseSecurityObservationValue PurposeOfUseSecurityObservationValueP' templateId.root='2.16.840.1.113883.3.445.22' code.code='SECCONOBS' code.codeSystem='2.16.840.1.113883.1.11.20471' code.codeSystemName='SecurityControlObservationValue' code.displayName='Security Control' constraints.validation.dependOn.SecurityObservationCode='SecurityObservationCodeP' value.codeSystem='2.16.840.1.113883.1.11.20471' value.codeSystemName='SecurityControlObservationValue' constraints.validation.dependOn.PurposeOfUseSecurityObservationValue='PurposeOfUseSecurityObservationValueP'"
 * @generated
 */
public interface PurposeOfUseSecurityObservation extends SecurityObservation {
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
	boolean validatePurposeOfUseSecurityObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.1.11.20471\' and (value.code = \'TREAT\' or value.code = \'ETREAT\' or value.code = \'HPAYMT\' or value.code = \'HRESCH\' or value.code = \'CLINTRCH\' or value.code = \' CLINTRL\'))'"
	 * @generated
	 */
	boolean validatePurposeOfUseSecurityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);
} // PurposeOfUseSecurityObservation
