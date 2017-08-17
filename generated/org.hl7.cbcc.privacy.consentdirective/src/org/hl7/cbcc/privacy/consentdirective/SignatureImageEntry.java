/**
 */
package org.hl7.cbcc.privacy.consentdirective;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.Entry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature Image Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage#getSignatureImageEntry()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SignatureImageEntryTemplateId SignatureImageEntryObservationMedia' templateId.root='2.16.840.1.113883.3.445.20'"
 * @generated
 */
public interface SignatureImageEntry extends Entry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.445.20\')'"
	 * @generated
	 */
	boolean validateSignatureImageEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.observationMedia->one(observationMedia : cda::ObservationMedia | not observationMedia.oclIsUndefined() and observationMedia.oclIsKindOf(consentdirective::SignatureImageObservation))'"
	 * @generated
	 */
	boolean validateSignatureImageEntryObservationMedia(DiagnosticChain diagnostics, Map<Object, Object> context);
} // SignatureImageEntry
