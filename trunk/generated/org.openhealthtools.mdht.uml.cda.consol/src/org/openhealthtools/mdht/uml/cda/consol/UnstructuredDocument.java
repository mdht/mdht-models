/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstructured Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An unstructured document is a document which is used when the patient record is captured in an unstructured format that is encapsulated within an image file or as unstructured text in an electronic file such as a word processing or Portable Document Format (PDF) document. 
 * There is a need to raise the level of interoperability for these documents to provide full access to the longitudinal patient record across a continuum of care. Until this gap is addressed, image and multi-media files will continue to be a portion of the patient record that remains difficult to access and share with all participants in a patient's care. The Unstructured Document type addresses this gap by providing consistent guidance on the use of CDA for such documents.
 * An Unstructured Document (UD) document type can (1) include unstructured content, such as a graphic, directly in a text element with a mediaType attribute, or (2) reference a single document file, such as a word-processing document, using a text/reference element.
 * For guidance on how to handle multiple files, on the selection of media types for this IG, and on the identification of external files, see the subsections which follow the constraints below.
 * IHE's XDS-SD (Cross-Transaction Specifications and Content Specifications, Scanned Documents Module) profile addresses a similar, more restricted use case, specifically for scanned documents or documents electronically created from existing text sources, and limits content to PDF-A or text. This Unstructured Documents implementation guide is applicable not only for scanned documents in non-PDF formats, but also for clinical documents produced through word processing applications, etc. 
 * For conformance with both specifications, please review the appendix on XDS-SD and US Realm Clinical Document Header Comparison and ensure that your documents at a minimum conform to all the SHALL constraints from either specification .
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getUnstructuredDocument()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.21.1.10' constraints.validation.error='UnstructuredDocumentTemplateId UnstructuredDocumentRecordTarget UnstructuredDocumentAuthor UnstructuredDocumentComponent UnstructuredDocumentCustodian UnstructuredDocumentRecordTargetPatientRole2Id UnstructuredDocumentAuthorAssignedAuthor2Addr UnstructuredDocumentAuthorAssignedAuthor2Telecom UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom UnstructuredDocumentCustodianAssignedCustodian2'"
 * @generated
 */
public interface UnstructuredDocument extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.1.10')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.21.1.10\')'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) then self.recordTarget.patientRole->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1)) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) then self.recordTarget.patientRole->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1)) else true endif'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentRecordTargetPatientRole2Id(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1)) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1)) else true endif'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentAuthorAssignedAuthor2Addr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (telecom->size() = 1)) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (telecom->size() = 1)) else true endif'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentAuthorAssignedAuthor2Telecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1)) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1)) else true endif'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((telecom.oclIsUndefined() or telecom.isNullFlavorUndefined()) implies (not telecom.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((telecom.oclIsUndefined() or telecom.isNullFlavorUndefined()) implies (not telecom.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.custodian->exists(not oclIsUndefined()) then self.custodian->forAll(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.custodian->exists(not oclIsUndefined()) then self.custodian->forAll(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian))) else true endif'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentCustodianAssignedCustodian2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredDocument init();
} // UnstructuredDocument
