/**
 */
package org.hl7.cbcc.privacy.consentdirective;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.Author;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy Consent Header Author</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage#getPrivacyConsentHeaderAuthor()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PrivacyConsentHeaderAuthorTemplateId PrivacyConsentHeaderAuthorFunctionCode PrivacyConsentHeaderAuthorTime PrivacyConsentHeaderAuthorAssignedAuthor' templateId.root='2.16.840.1.113883.3.445.2' functionCode.codeSystem='2.16.840.1.113883.5.88' functionCode.codeSystemName='ParticipationFunction' constraints.validation.info='PrivacyConsentHeaderAuthorFunctionCodeP' constraints.validation.dependOn.PrivacyConsentHeaderAuthorFunctionCode='PrivacyConsentHeaderAuthorFunctionCodeP'"
 * @generated
 */
public interface PrivacyConsentHeaderAuthor extends Author {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.445.2\')'"
	 * @generated
	 */
	boolean validatePrivacyConsentHeaderAuthorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.functionCode.oclIsUndefined()'"
	 * @generated
	 */
	boolean validatePrivacyConsentHeaderAuthorFunctionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.functionCode.oclIsUndefined() and self.functionCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.88\' and (value.code = \'FAMMEMB\' or value.code = \'CHILD\' or value.code = \'CHLDINLAW\' or value.code = \'EXT\' or value.code = \'PRN\' or value.code = \'SIB\' or value.code = \'SPS\')'"
	 * @generated
	 */
	boolean validatePrivacyConsentHeaderAuthorFunctionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.time.oclIsUndefined()'"
	 * @generated
	 */
	boolean validatePrivacyConsentHeaderAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(rim::Role))'"
	 * @generated
	 */
	boolean validatePrivacyConsentHeaderAuthorAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);
} // PrivacyConsentHeaderAuthor
