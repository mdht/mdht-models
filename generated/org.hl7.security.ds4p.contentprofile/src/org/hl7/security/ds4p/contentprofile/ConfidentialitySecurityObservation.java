/**
 */
package org.hl7.security.ds4p.contentprofile;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confidentiality Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage#getConfidentialitySecurityObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP SecurityObservationValue' templateId.root='2.16.840.1.113883.3.445.12' code.code='SECCLASSOBS' code.codeSystem='2.16.840.1.113883.1.11.20471' code.codeSystemName='SecurityControlObservationValue' code.displayName='Security Category' constraints.validation.dependOn.SecurityObservationCode='SecurityObservationCodeP'"
 * @generated
 */
public interface ConfidentialitySecurityObservation extends SecurityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialitySecurityObservation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialitySecurityObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ConfidentialitySecurityObservation
