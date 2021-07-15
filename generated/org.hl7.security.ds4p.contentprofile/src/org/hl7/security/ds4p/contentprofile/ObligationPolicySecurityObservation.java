/**
 */
package org.hl7.security.ds4p.contentprofile;

import java.lang.Iterable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obligation Policy Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage#getObligationPolicySecurityObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP SecurityObservationValueP' templateId.root='2.16.840.1.113883.3.445.14' code.code='SECCONOBS' code.codeSystem='2.16.840.1.113883.1.11.20457' code.codeSystemName='SecurityObservationTypeCodeSystem' code.displayName='Security Control' constraints.validation.dependOn.SecurityObservationCode='SecurityObservationCodeP' value.codeSystemName='' constraints.validation.warning='SecurityObservationValue' constraints.validation.dependOn.SecurityObservationValue='SecurityObservationValueP'"
 *        annotation="duplicates"
 * @generated
 */
public interface ObligationPolicySecurityObservation extends SecurityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligationPolicySecurityObservation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligationPolicySecurityObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ObligationPolicySecurityObservation
