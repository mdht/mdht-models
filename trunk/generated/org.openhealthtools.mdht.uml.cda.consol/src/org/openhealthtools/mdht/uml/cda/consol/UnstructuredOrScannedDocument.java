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
 * A representation of the model object '<em><b>Unstructured Or Scanned Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A variety of legacy paper, film, electronic and scanner outputted formats are used to store and exchange clinical documents. These formats are not designed for healthcare documentation, and furthermore, do not have a uniform mechanism to store healthcare metadata associated with the documents, including patient identifiers, demographics, encounter, order or service information. The association of structured, healthcare metadata with this kind of document is important to maintain the integrity of the patient health record as managed by the source system. It is necessary to provide a mechanism that allows such source metadata to be stored with the document.
 * <b>IMPORTANT NOTE:</b> <i>The HITSP C62 specification does not include a templateId for this doument type. The id 2.16.840.1.113883.3.88.11.62.1 is included in this model to support instance validation, but we are designing a solution to allow removal of this Id.</i>
 * This document type is not intended to be a replacement for IHE's XDS-SD (Cross-Transaction Specifications and Content Specifications, Scanned Documents Module) profile. Rather, it serves a more generic use case. XDS-SD is specifically for scanned documents, and limits content to PDF-A or text. This Unstructured Documents implementation guide is applicable not only for scanned documents in non-PDF formats, but also for clinical documents produced through word processing applications, etc.
 * Used for documents that implement both HL7 Unstructured Documents and HITSP C62 based on IHE Scanned Documents.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getUnstructuredOrScannedDocument()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.19.1' constraints.validation.error='UnstructuredOrScannedDocumentTemplateId UnstructuredOrScannedDocumentTypeIdFixed UnstructuredOrScannedDocumentHasOneRecordTarget UnstructuredOrScannedDocumentHasAssignedAuthor UnstructuredOrScannedDocumentPatientRoleId UnstructuredOrScannedDocumentHasPatientRoleAddress UnstructuredOrScannedDocumentHasPatientName UnstructuredOrScannedDocumentHasPatientGenderCode UnstructuredOrScannedDocumentHasPatientBirthYear UnstructuredOrScannedDocumentHasScanningDevice UnstructuredOrScannedDocumentHasScanDataEnterer UnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId UnstructuredOrScannedDocumentHasNonXMLBody UnstructuredOrScannedDocumentHasNonXMLBodyBinaryText UnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType UnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation UnstructuredOrScannedDocumentOnePatientPerDocument UnstructuredOrScannedDocumentPatientRoleHasId UnstructuredOrScannedDocumentAssignedAuthorHasAddr UnstructuredOrScannedDocumentAssignedAuthorHasTelecom UnstructuredOrScannedDocumentHasRepresentedCustodianOrganization UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr UnstructuredOrScannedDocumentHasNonXMLBodyText UnstructuredOrScannedDocumentHasTextReferenceOrRepresentation UnstructuredOrScannedDocumentHasTextMediaTypeValueSet UnstructuredOrScannedDocumentCode UnstructuredOrScannedDocumentEffectiveTime UnstructuredOrScannedDocumentId UnstructuredOrScannedDocumentLanguageCode UnstructuredOrScannedDocumentTypeId UnstructuredOrScannedDocumentScanningDevice UnstructuredOrScannedDocumentScanDataEnterer UnstructuredOrScannedDocumentCustodian' constraints.validation.warning='UnstructuredOrScannedDocumentHasOriginalAuthor UnstructuredOrScannedDocumentNoStructuredData UnstructuredOrScannedDocumentTitle UnstructuredOrScannedDocumentScanOriginalAuthor' constraints.validation.info='UnstructuredOrScannedDocumentLegalAuthenticator UnstructuredOrScannedDocumentDocumentationOf'"
 * @generated
 */
public interface UnstructuredOrScannedDocument extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.root = '2.16.840.1.113883.1.3' and self.typeId.extension = 'POCD_HD000040'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeId.root = \'2.16.840.1.113883.1.3\' and self.typeId.extension = \'POCD_HD000040\''"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentTypeIdFixed(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->size() = 1'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasOneRecordTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.representedOrganization.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() \r\n   or not author.assignedAuthor.representedOrganization.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    and target.patientRole.id->forAll(roleId : datatypes::II | not roleId.root.oclIsUndefined()
	 *    and not roleId.extension.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()\r\n   and target.patientRole.id->forAll(roleId : datatypes::II | not roleId.root.oclIsUndefined()\r\n   and not roleId.extension.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentPatientRoleId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    and target.patientRole.addr->exists(address : datatypes::AD | address.country->exists(c : datatypes::ADXP |
	 *    not c.oclIsUndefined() and c.getText().size() > 0)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()\r\n   and target.patientRole.addr->exists(address : datatypes::AD | address.country->exists(c : datatypes::ADXP |\r\n   not c.oclIsUndefined() and c.getText().size() > 0)))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasPatientRoleAddress(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.patient.oclIsUndefined()
	 *    and target.patientRole.patient.name->exists(name: datatypes::PN |
	 *       not name.given->isEmpty() and not name.family->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.patient.oclIsUndefined()\r\n   and target.patientRole.patient.name->exists(name: datatypes::PN |\r\n      not name.given->isEmpty() and not name.family->isEmpty()))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasPatientName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->one(target : cda::RecordTarget |
	 *    not target.patientRole.patient.administrativeGenderCode.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(target : cda::RecordTarget |\r\n   not target.patientRole.patient.administrativeGenderCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasPatientGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->one(target : cda::RecordTarget |
	 *    not target.patientRole.patient.birthTime.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(target : cda::RecordTarget |\r\n   not target.patientRole.patient.birthTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasPatientBirthYear(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::ScanOriginalAuthor))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::ScanOriginalAuthor))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasOriginalAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::ScanningDevice))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::ScanningDevice))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasScanningDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(consol::ScanDataEnterer)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(consol::ScanDataEnterer)'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasScanDataEnterer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.legalAuthenticator.assignedEntity.id->size() > 0 implies (
	 *    self.legalAuthenticator.assignedEntity.id->forAll(ident : datatypes::II |
	 *       not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator.assignedEntity.id->size() > 0 implies (\r\n   self.legalAuthenticator.assignedEntity.id->forAll(ident : datatypes::II |\r\n      not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.component.nonXMLBody.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.component.nonXMLBody.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasNonXMLBody(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.component.nonXMLBody.text.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.component.nonXMLBody.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.nonXMLBody.text.mediaType = 'application/pdf' or self.component.nonXMLBody.text.mediaType = 'text/plain'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component.nonXMLBody.text.mediaType = \'application/pdf\' or self.component.nonXMLBody.text.mediaType = \'text/plain\''"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.structuredBody.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component.structuredBody.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentNoStructuredData(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->one(record : cda::RecordTarget | not record.patientRole.oclIsUndefined() and not record.patientRole.patient.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(record : cda::RecordTarget | not record.patientRole.oclIsUndefined() and not record.patientRole.patient.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentOnePatientPerDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not recordTarget.patientRole.id->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not recordTarget.patientRole.id->isEmpty()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentPatientRoleHasId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not author.assignedAuthor.addr->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not author.assignedAuthor.addr->isEmpty()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not author.assignedAuthor.telecom->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not author.assignedAuthor.telecom->isEmpty()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not custodian.assignedCustodian.representedCustodianOrganization.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.id->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not custodian.assignedCustodian.representedCustodianOrganization.id->isEmpty()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.name.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not custodian.assignedCustodian.representedCustodianOrganization.name.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.telecom.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not custodian.assignedCustodian.representedCustodianOrganization.telecom.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.addr.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not custodian.assignedCustodian.representedCustodianOrganization.addr.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.component.nonXMLBody.text.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.component.nonXMLBody.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.component.nonXMLBody.text.reference.oclIsUndefined() and self.component.nonXMLBody.text.reference.isDefined('value')) or (self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64 and self.component.nonXMLBody.text.isDefined('mediaType') and self.component.nonXMLBody.text.getText().size() > 0)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(not self.component.nonXMLBody.text.reference.oclIsUndefined() and self.component.nonXMLBody.text.reference.isDefined(\'value\')) or (self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64 and self.component.nonXMLBody.text.isDefined(\'mediaType\') and self.component.nonXMLBody.text.getText().size() > 0)'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.nonXMLBody.text.isDefined('mediaType') implies (self.component.nonXMLBody.text.mediaType = 'application/msword' or self.component.nonXMLBody.text.mediaType = 'application/pdf' or self.component.nonXMLBody.text.mediaType = 'text/plain' or self.component.nonXMLBody.text.mediaType = 'text/rtf' or self.component.nonXMLBody.text.mediaType = 'text/html' or self.component.nonXMLBody.text.mediaType = 'image/gif' or self.component.nonXMLBody.text.mediaType = 'image/tiff' or self.component.nonXMLBody.text.mediaType = 'image/jpeg' or self.component.nonXMLBody.text.mediaType = 'image/png')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component.nonXMLBody.text.isDefined(\'mediaType\') implies (self.component.nonXMLBody.text.mediaType = \'application/msword\' or self.component.nonXMLBody.text.mediaType = \'application/pdf\' or self.component.nonXMLBody.text.mediaType = \'text/plain\' or self.component.nonXMLBody.text.mediaType = \'text/rtf\' or self.component.nonXMLBody.text.mediaType = \'text/html\' or self.component.nonXMLBody.text.mediaType = \'image/gif\' or self.component.nonXMLBody.text.mediaType = \'image/tiff\' or self.component.nonXMLBody.text.mediaType = \'image/jpeg\' or self.component.nonXMLBody.text.mediaType = \'image/png\')'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentTypeId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentScanOriginalAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentScanningDevice(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentScanDataEnterer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(rim::Participation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(rim::Participation))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentLegalAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(rim::ActRelationship))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(rim::ActRelationship))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentDocumentationOf(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(rim::Participation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(rim::Participation))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredOrScannedDocument init();
} // UnstructuredOrScannedDocument
