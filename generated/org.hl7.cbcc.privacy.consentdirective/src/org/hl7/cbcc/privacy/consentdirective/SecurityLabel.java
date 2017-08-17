/**
 */
package org.hl7.cbcc.privacy.consentdirective;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Label</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage#getSecurityLabel()
 * @model abstract="true"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SecurityLabelTemplateId SecurityLabelComponent' templateId.root='2.16.840.1.113883.3.445.24'"
 * @generated
 */
public interface SecurityLabel extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.445.24\')'"
	 * @generated
	 */
	boolean validateSecurityLabelTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(consentdirective::SecurityObservation))'"
	 * @generated
	 */
	boolean validateSecurityLabelComponent(DiagnosticChain diagnostics, Map<Object, Object> context);
} // SecurityLabel
