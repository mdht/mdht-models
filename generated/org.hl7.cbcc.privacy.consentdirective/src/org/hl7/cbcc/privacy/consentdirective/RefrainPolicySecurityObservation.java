/**
 */
package org.hl7.cbcc.privacy.consentdirective;

import java.lang.Iterable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refrain Policy Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage#getRefrainPolicySecurityObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP SecurityObservationValueP' templateId.root='2.16.840.1.113883.3.445.23' code.code='SECCONOBS' code.codeSystem='2.16.840.1.113883.1.11.20471' code.codeSystemName='SecurityControlObservationValue' code.displayName='Security Control Observation Type' constraints.validation.dependOn.SecurityObservationCode='SecurityObservationCodeP' value.codeSystem='2.16.840.1.113883.1.11.20471' value.codeSystemName='SecurityControlObservationValue' constraints.validation.warning='SecurityObservationValue' constraints.validation.dependOn.SecurityObservationValue='SecurityObservationValueP'"
 * @generated
 */
public interface RefrainPolicySecurityObservation extends SecurityObservation {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefrainPolicySecurityObservation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefrainPolicySecurityObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // RefrainPolicySecurityObservation
