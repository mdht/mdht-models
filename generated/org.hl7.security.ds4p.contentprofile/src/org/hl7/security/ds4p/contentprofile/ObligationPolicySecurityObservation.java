/**
 */
package org.hl7.security.ds4p.contentprofile;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obligation Policy Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage#getObligationPolicySecurityObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP ObligationPolicySecurityObservationValueP' templateId.root='2.16.840.1.113883.3.445.14' code.code='SECCONOBS' code.codeSystem='2.16.840.1.113883.1.11.20457' code.codeSystemName='SecurityObservationTypeCodeSystem' code.displayName='Security Control' constraints.validation.dependOn.SecurityObservationCode='SecurityObservationCodeP' value.codeSystem='2.16.840.1.113883.1.11.20471' value.codeSystemName='SecurityControlObservationValue' constraints.validation.warning='ObligationPolicySecurityObservationValue' constraints.validation.dependOn.ObligationPolicySecurityObservationValue='ObligationPolicySecurityObservationValueP'"
 * @generated
 */
public interface ObligationPolicySecurityObservation extends SecurityObservation {
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
	boolean validateObligationPolicySecurityObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.1.11.20471\' and (value.code = \'CPLYCD\' or value.code = \'ENCRYPT\'))'"
	 * @generated
	 */
	boolean validateObligationPolicySecurityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
