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
 * A representation of the model object '<em><b>Confidentiality Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage#getConfidentialitySecurityObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP ConfidentialitySecurityObservationValue ConfidentialitySecurityObservationValueP' templateId.root='2.16.840.1.113883.3.445.12' code.code='SECCLASSOBS' code.codeSystem='2.16.840.1.113883.1.11.20471' code.codeSystemName='SecurityControlObservationValue' code.displayName='Security Category' constraints.validation.dependOn.SecurityObservationCode='SecurityObservationCodeP' value.codeSystem='2.16.840.1.113883.5.25' value.codeSystemName='ConfidentialityCode' constraints.validation.dependOn.ConfidentialitySecurityObservationValue='ConfidentialitySecurityObservationValueP'"
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
	boolean validateConfidentialitySecurityObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.25\')'"
	 * @generated
	 */
	boolean validateConfidentialitySecurityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidentialitySecurityObservation init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public ConfidentialitySecurityObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ConfidentialitySecurityObservation
