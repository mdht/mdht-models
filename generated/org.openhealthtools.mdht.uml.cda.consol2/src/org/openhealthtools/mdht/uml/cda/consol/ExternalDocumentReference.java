/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Document Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getExternalDocumentReference()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ExternalDocumentReferenceTemplateId ExternalDocumentReferenceClassCode ExternalDocumentReferenceMoodCode ExternalDocumentReferenceCode ExternalDocumentReferenceCodeP ExternalDocumentReferenceReference ExternalDocumentReferenceReferenceExternalDocumentMoodCode ExternalDocumentReferenceReferenceExternalDocumentId ExternalDocumentReferenceReferenceExternalDocumentCode ExternalDocumentReferenceReferenceTypeCode ExternalDocumentReferenceReferenceExternalDocument' templateId.root='2.16.840.1.113883.10.20.22.4.115' moodCode='EVN' code.code='DOCCLIN' code.codeSystem='2.16.840.1.113883.5.6' code.codeSystemName='HL7ActClass' code.displayName='Clinical Document' constraints.validation.dependOn.ExternalDocumentReferenceCode='ExternalDocumentReferenceCodeP' constraints.validation.info='ExternalDocumentReferenceReferenceExternalDocumentClassCode' constraints.validation.query='ExternalDocumentReferenceReferenceExternalDocumentClassCode ExternalDocumentReferenceReferenceExternalDocumentMoodCode ExternalDocumentReferenceReferenceExternalDocumentId ExternalDocumentReferenceReferenceExternalDocumentCode ExternalDocumentReferenceReferenceExternalDocumentSetId ExternalDocumentReferenceReferenceExternalDocumentVersionNumber ExternalDocumentReferenceReferenceTypeCode ExternalDocumentReferenceReferenceExternalDocument' constraints.validation.warning='ExternalDocumentReferenceReferenceExternalDocumentSetId ExternalDocumentReferenceReferenceExternalDocumentVersionNumber'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolExternalDocumentReferenceReference typeCode='REFR' constraints.validation.error='ExternalDocumentReferenceReferenceTypeCode ExternalDocumentReferenceReferenceExternalDocument'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolExternalDocumentReferenceReferenceExternalDocument classCode='DOCCLIN' constraints.validation.info='ExternalDocumentReferenceReferenceExternalDocumentClassCode' moodCode='EVN' constraints.validation.error='ExternalDocumentReferenceReferenceExternalDocumentMoodCode ExternalDocumentReferenceReferenceExternalDocumentId ExternalDocumentReferenceReferenceExternalDocumentCode' constraints.validation.warning='ExternalDocumentReferenceReferenceExternalDocumentSetId ExternalDocumentReferenceReferenceExternalDocumentVersionNumber'"
 * @generated
 */
public interface ExternalDocumentReference extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.115\')'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateExternalDocumentReferenceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'DOCCLIN\' and value.codeSystem = \'2.16.840.1.113883.5.6\')'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->one(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null).externalDocument->excluding(null)->reject(classCode=vocab::ActClassDocument::DOCCLIN)'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceReferenceExternalDocumentClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null).externalDocument->excluding(null)->reject(isDefined(\'moodCode\') and moodCode=vocab::ActMood::EVN)'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceReferenceExternalDocumentMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null).externalDocument->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceReferenceExternalDocumentId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null).externalDocument->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceReferenceExternalDocumentCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null).externalDocument->excluding(null)->reject((setId.oclIsUndefined() or setId.isNullFlavorUndefined()) implies (not setId.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceReferenceExternalDocumentSetId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null).externalDocument->excluding(null)->reject((versionNumber.oclIsUndefined() or versionNumber.isNullFlavorUndefined()) implies (not versionNumber.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceReferenceExternalDocumentVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceReferenceTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(cda::ExternalDocument)))'"
	 * @generated
	 */
	boolean validateExternalDocumentReferenceReferenceExternalDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocumentReference init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocumentReference init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ExternalDocumentReference
