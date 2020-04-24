/**
 */
package org.hl7.security.ds4p.contentprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage#getPrivacyAnnotation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PrivacyAnnotationTemplateId PrivacyAnnotationClassCode PrivacyAnnotationMoodCode PrivacyAnnotationStatusCode PrivacyAnnotationStatusCodeP PrivacyAnnotationConfidentialityCodeSecurityObservation' templateId.root='2.16.840.1.113883.3.3251.1.4' classCode='CLUSTER' moodCode='EVN' statusCode.code='active' constraints.validation.dependOn.PrivacyAnnotationStatusCode='PrivacyAnnotationStatusCodeP' constraints.validation.info='PrivacyAnnotationObligationPolicySecurityObservation PrivacyAnnotationRefrainPolicySecurityObservation PrivacyAnnotationPurposeOfUseSecurityObservation'"
 * @generated
 */
public interface PrivacyAnnotation extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.3251.1.4\')'"
	 * @generated
	 */
	boolean validatePrivacyAnnotationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\')'"
	 * @generated
	 */
	boolean validatePrivacyAnnotationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePrivacyAnnotationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.statusCode.oclIsUndefined()'"
	 * @generated
	 */
	boolean validatePrivacyAnnotationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \r\nvalue.code = \'active\''"
	 * @generated
	 */
	boolean validatePrivacyAnnotationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(contentprofile::ObligationPolicySecurityObservation))'"
	 * @generated
	 */
	boolean validatePrivacyAnnotationObligationPolicySecurityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(contentprofile::RefrainPolicySecurityObservation))'"
	 * @generated
	 */
	boolean validatePrivacyAnnotationRefrainPolicySecurityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(contentprofile::PurposeOfUseSecurityObservation))'"
	 * @generated
	 */
	boolean validatePrivacyAnnotationPurposeOfUseSecurityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(contentprofile::ConfidentialitySecurityObservation))'"
	 * @generated
	 */
	boolean validatePrivacyAnnotationConfidentialityCodeSecurityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(contentprofile::ObligationPolicySecurityObservation)).oclAsType(contentprofile::ObligationPolicySecurityObservation)'"
	 * @generated
	 */
	EList<ObligationPolicySecurityObservation> getObligationPolicySecurityObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(contentprofile::RefrainPolicySecurityObservation)).oclAsType(contentprofile::RefrainPolicySecurityObservation)'"
	 * @generated
	 */
	EList<RefrainPolicySecurityObservation> getRefrainPolicySecurityObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(contentprofile::PurposeOfUseSecurityObservation)).oclAsType(contentprofile::PurposeOfUseSecurityObservation)'"
	 * @generated
	 */
	EList<PurposeOfUseSecurityObservation> getPurposeOfUseSecurityObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(contentprofile::ConfidentialitySecurityObservation))-&gt;asSequence()-&gt;any(true).oclAsType(contentprofile::ConfidentialitySecurityObservation)'"
	 * @generated
	 */
	ConfidentialitySecurityObservation getConfidentialityCodeSecurityObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyAnnotation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyAnnotation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PrivacyAnnotation
