/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scanned Document</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getScannedDocument()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ScannedDocumentTemplateId ScannedDocumentTypeIdFixed ScannedDocumentHasOneRecordTarget ScannedDocumentHasAssignedAuthor ScannedDocumentPatientRoleId ScannedDocumentHasPatientRoleAddress ScannedDocumentHasPatientName ScannedDocumentHasPatientGenderCode ScannedDocumentHasPatientBirthYear ScannedDocumentHasScanningDevice ScannedDocumentHasScanDataEnterer ScannedDocumentHasRepresentedCustodianOrganizationName ScannedDocumentHasRepresentedCustodianOrganizationAddr ScannedDocumentLegalAuthenticatorAssignedEntityId ScannedDocumentHasNonXMLBody ScannedDocumentHasNonXMLBodyBinaryText ScannedDocumentHasNonXMLBodyTextMediaType ScannedDocumentHasNonXMLBodyTextRepresentation ScannedDocumentCode ScannedDocumentConfidentialityCode ScannedDocumentEffectiveTime ScannedDocumentId ScannedDocumentLanguageCode ScannedDocumentTypeId ScannedDocumentScanningDevice ScannedDocumentScanDataEnterer' templateId.root='1.3.6.1.4.1.19376.1.2.20' constraints.validation.warning='ScannedDocumentHasOriginalAuthor ScannedDocumentTitle ScannedDocumentScanOriginalAuthor' constraints.validation.info='ScannedDocumentLegalAuthenticator ScannedDocumentDocumentationOf'"
 * @generated
 */
public interface ScannedDocument extends ClinicalDocument {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeId.root = \'2.16.840.1.113883.1.3\' and self.typeId.extension = \'POCD_HD000040\''"
	* @generated
	*/
	boolean validateScannedDocumentTypeIdFixed(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->size() = 1'"
	* @generated
	*/
	boolean validateScannedDocumentHasOneRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() \r\n   or not author.assignedAuthor.representedOrganization.oclIsUndefined())'"
	* @generated
	*/
	boolean validateScannedDocumentHasAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()\r\n   and target.patientRole.id->forAll(roleId : datatypes::II | not roleId.root.oclIsUndefined()\r\n   and not roleId.extension.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateScannedDocumentPatientRoleId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()\r\n   and target.patientRole.addr->exists(address : datatypes::AD | address.country->exists(c : datatypes::ADXP |\r\n   not c.oclIsUndefined() and c.getText().size() > 0)))'"
	* @generated
	*/
	boolean validateScannedDocumentHasPatientRoleAddress(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.patient.oclIsUndefined()\r\n   and target.patientRole.patient.name->exists(name: datatypes::PN |\r\n      not name.given->isEmpty() and not name.family->isEmpty()))'"
	* @generated
	*/
	boolean validateScannedDocumentHasPatientName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(target : cda::RecordTarget |\r\n   not target.patientRole.patient.administrativeGenderCode.oclIsUndefined())'"
	* @generated
	*/
	boolean validateScannedDocumentHasPatientGenderCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(target : cda::RecordTarget |\r\n   not target.patientRole.patient.birthTime.oclIsUndefined())'"
	* @generated
	*/
	boolean validateScannedDocumentHasPatientBirthYear(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanOriginalAuthor))'"
	* @generated
	*/
	boolean validateScannedDocumentHasOriginalAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanningDevice))'"
	* @generated
	*/
	boolean validateScannedDocumentHasScanningDevice(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(ihe::ScanDataEnterer)'"
	* @generated
	*/
	boolean validateScannedDocumentHasScanDataEnterer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.custodian.assignedCustodian.representedCustodianOrganization.name.oclIsUndefined()'"
	* @generated
	*/
	boolean validateScannedDocumentHasRepresentedCustodianOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.custodian.assignedCustodian.representedCustodianOrganization.addr.oclIsUndefined()\r\n   and self.custodian.assignedCustodian.representedCustodianOrganization.addr.country->exists(c : datatypes::ADXP |\r\n      not c.oclIsUndefined() and c.getText().size() > 0)'"
	* @generated
	*/
	boolean validateScannedDocumentHasRepresentedCustodianOrganizationAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator.assignedEntity.id->size() > 0 implies (\r\n   self.legalAuthenticator.assignedEntity.id->forAll(ident : datatypes::II |\r\n      not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateScannedDocumentLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.component.nonXMLBody.oclIsUndefined()'"
	* @generated
	*/
	boolean validateScannedDocumentHasNonXMLBody(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.component.nonXMLBody.text.oclIsUndefined()'"
	* @generated
	*/
	boolean validateScannedDocumentHasNonXMLBodyBinaryText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component.nonXMLBody.text.mediaType = \'application/pdf\' or self.component.nonXMLBody.text.mediaType = \'text/plain\''"
	* @generated
	*/
	boolean validateScannedDocumentHasNonXMLBodyTextMediaType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64'"
	* @generated
	*/
	boolean validateScannedDocumentHasNonXMLBodyTextRepresentation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.2.20\')'"
	* @generated
	*/
	boolean validateScannedDocumentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateScannedDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())'"
	* @generated
	*/
	boolean validateScannedDocumentConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	* @generated
	*/
	boolean validateScannedDocumentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())'"
	* @generated
	*/
	boolean validateScannedDocumentId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())'"
	* @generated
	*/
	boolean validateScannedDocumentLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	* @generated
	*/
	boolean validateScannedDocumentTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())'"
	* @generated
	*/
	boolean validateScannedDocumentTypeId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanOriginalAuthor))'"
	* @generated
	*/
	boolean validateScannedDocumentScanOriginalAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanningDevice))'"
	* @generated
	*/
	boolean validateScannedDocumentScanningDevice(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(ihe::ScanDataEnterer))'"
	* @generated
	*/
	boolean validateScannedDocumentScanDataEnterer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(rim::Participation))'"
	* @generated
	*/
	boolean validateScannedDocumentLegalAuthenticator(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(rim::ActRelationship))'"
	* @generated
	*/
	boolean validateScannedDocumentDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ScannedDocument init();

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public ScannedDocument init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ScannedDocument
