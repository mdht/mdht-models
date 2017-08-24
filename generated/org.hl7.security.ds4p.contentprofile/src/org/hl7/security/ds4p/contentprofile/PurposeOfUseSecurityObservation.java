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
 * A representation of the model object '<em><b>Purpose Of Use Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage#getPurposeOfUseSecurityObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SecurityObservationTemplateId PurposeOfUseSecurityObservationCode PurposeOfUseSecurityObservationCodeP PurposeOfUseSecurityObservationValue PurposeOfUseSecurityObservationValueP' templateId.root='2.16.840.1.113883.3.445.22' code.code='SECCONOBS' code.codeSystem='2.16.840.1.113883.1.11.20471' code.codeSystemName='SecurityControlObservationValue' code.displayName='Security Control' constraints.validation.dependOn.PurposeOfUseSecurityObservationCode='PurposeOfUseSecurityObservationCodeP' value.codeSystem='2.16.840.1.113883.5.1063' value.codeSystemName='SecurityObservationValueCodeSystem' constraints.validation.dependOn.PurposeOfUseSecurityObservationValue='PurposeOfUseSecurityObservationValueP'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined()'"
	 * @generated
	 */
	boolean validatePurposeOfUseSecurityObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePurposeOfUseSecurityObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.1063\' and (value.code = \'TREAT\' or value.code = \'ETREAT\' or value.code = \'HPAYMT\' or value.code = \'HRESCH\' or value.code = \'CLINTRCH\' or value.code = \' CLINTRL\'))'"
	 * @generated
	 */
	boolean validatePurposeOfUseSecurityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeOfUseSecurityObservation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeOfUseSecurityObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PurposeOfUseSecurityObservation
