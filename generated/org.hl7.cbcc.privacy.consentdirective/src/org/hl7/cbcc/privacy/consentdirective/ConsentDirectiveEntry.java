/**
 */
package org.hl7.cbcc.privacy.consentdirective;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.Entry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Directive Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage#getConsentDirectiveEntry()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ConsentDirectiveEntryTemplateId' templateId.root='2.16.840.1.113883.3.445.4' constraints.validation.warning='ConsentDirectiveEntryAct ConsentDirectiveEntryObservationMedia' constraints.validation.info='ConsentDirectiveEntryObservation'"
 * @generated
 */
public interface ConsentDirectiveEntry extends Entry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.445.4\')'"
	 * @generated
	 */
	boolean validateConsentDirectiveEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consentdirective::ConsentDirectiveStructuredDefinition))'"
	 * @generated
	 */
	boolean validateConsentDirectiveEntryAct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consentdirective::ComputablePolicyConsent))'"
	 * @generated
	 */
	boolean validateConsentDirectiveEntryObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.observationMedia->one(observationMedia : cda::ObservationMedia | not observationMedia.oclIsUndefined() and observationMedia.oclIsKindOf(consentdirective::ScannedPrivacyConsent))'"
	 * @generated
	 */
	boolean validateConsentDirectiveEntryObservationMedia(DiagnosticChain diagnostics, Map<Object, Object> context);
} // ConsentDirectiveEntry
