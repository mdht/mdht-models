/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId UnstructuredDocumentRecordTarget UnstructuredDocumentAuthor UnstructuredDocumentComponent UnstructuredDocumentCustodian UnstructuredDocumentRecordTargetPatientRole2Id UnstructuredDocumentRecordTargetPatientRole2 UnstructuredDocumentAuthorAssignedAuthor2Addr UnstructuredDocumentAuthorAssignedAuthor2Telecom UnstructuredDocumentAuthorAssignedAuthor2 UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization UnstructuredDocumentCustodianAssignedCustodian2' templateId.root='2.16.840.1.113883.10.20.22.1.10' constraints.validation.query='UnstructuredDocumentRecordTargetPatientRole2Id UnstructuredDocumentRecordTargetPatientRole2 UnstructuredDocumentAuthorAssignedAuthor2Addr UnstructuredDocumentAuthorAssignedAuthor2Telecom UnstructuredDocumentAuthorAssignedAuthor2 UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization UnstructuredDocumentCustodianAssignedCustodian2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocumentRecordTarget constraints.validation.error='UnstructuredDocumentRecordTargetPatientRole2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocumentRecordTargetPatientRole2 constraints.validation.error='UnstructuredDocumentRecordTargetPatientRole2Id'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocumentAuthor constraints.validation.error='UnstructuredDocumentAuthorAssignedAuthor2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocumentAuthorAssignedAuthor2 constraints.validation.error='UnstructuredDocumentAuthorAssignedAuthor2Addr UnstructuredDocumentAuthorAssignedAuthor2Telecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocumentCustodian constraints.validation.error='UnstructuredDocumentCustodianAssignedCustodian2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocumentCustodianAssignedCustodian3 constraints.validation.error='UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization constraints.validation.error='UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUnstructuredDocumentComponentNonXMLBody constraints.validation.error='UnstructuredDocumentComponentNonXMLBodyHasReferenceOrRepresentation UnstructuredDocumentComponentNonXMLBodyMediaTypeFileFormats UnstructuredDocumentComponentNonXMLBodyText'"
 * @generated
 */
public interface UnstructuredDocument extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentRecordTargetPatientRole2Id(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentRecordTargetPatientRole2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentAuthorAssignedAuthor2Addr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (telecom->size() = 1))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentAuthorAssignedAuthor2Telecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentAuthorAssignedAuthor2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((telecom.oclIsUndefined() or telecom.isNullFlavorUndefined()) implies (not telecom.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null)->reject(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization)))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))'"
	 * @generated
	 */
	boolean validateUnstructuredDocumentCustodianAssignedCustodian2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredDocument init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredDocument init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // UnstructuredDocument
