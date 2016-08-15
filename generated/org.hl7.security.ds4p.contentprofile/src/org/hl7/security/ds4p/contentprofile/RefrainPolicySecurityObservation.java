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
 * A representation of the model object '<em><b>Refrain Policy Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage#getRefrainPolicySecurityObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SecurityObservationTemplateId RefrainPolicySecurityObservationCode RefrainPolicySecurityObservationCodeP RefrainPolicySecurityObservationValue RefrainPolicySecurityObservationValueP' templateId.root='2.16.840.1.113883.3.445.23' code.code='SECCONOBS' code.codeSystem='2.16.840.1.113883.1.11.20471' code.codeSystemName='SecurityControlObservationValue' code.displayName='Security Control Observation Type' constraints.validation.dependOn.RefrainPolicySecurityObservationCode='RefrainPolicySecurityObservationCodeP' value.codeSystem='2.16.840.1.113883.1.11.20471' value.codeSystemName='SecurityControlObservationValue' constraints.validation.dependOn.RefrainPolicySecurityObservationValue='RefrainPolicySecurityObservationValueP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/contentprofileRefrainPolicySecurityObservationConfidentialitySecurityObservation constraints.validation.error='SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP RefrainPolicySecurityObservationConfidentialitySecurityObservationValue RefrainPolicySecurityObservationConfidentialitySecurityObservationValueP' templateId.root='2.16.840.1.113883.3.445.12' code.code='SECCLASSOBS' code.codeSystem='2.16.840.1.113883.1.11.20471' code.codeSystemName='SecurityControlObservationValue' code.displayName='Security Category' constraints.validation.dependOn.SecurityObservationCode='SecurityObservationCodeP' value.codeSystem='2.16.840.1.113883.5.25' value.codeSystemName='ConfidentialityCode' constraints.validation.dependOn.RefrainPolicySecurityObservationConfidentialitySecurityObservationValue='RefrainPolicySecurityObservationConfidentialitySecurityObservationValueP'"
 * @generated
 */
public interface RefrainPolicySecurityObservation extends SecurityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateRefrainPolicySecurityObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'SECCONOBS\' and value.codeSystem = \'2.16.840.1.113883.1.11.20471\''"
	 * @generated
	 */
	boolean validateRefrainPolicySecurityObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRefrainPolicySecurityObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.1.11.20471\' and (value.code = \'NORDSCLCD\' or value.code = \'NOMOU\'))'"
	 * @generated
	 */
	boolean validateRefrainPolicySecurityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
