/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstructured Or Scanned Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>This section describes constraints that apply to the H and P Note and to other types of CDA
 * documents defined for general exchange. The template defined here should be reused
 * wherever these general header constraints are applied.</p>
 * <p>To support communication between the receiver of the document and the patient or any
 * other person or organization mentioned within it, the elements representing them will
 * be named.</p>
 * <p>When name, address, or telecom information is unknown and where these elements are
 * required to be present, as with CDA conformance if the information is unknown, these
 * elements will be represented using an appropriate value for the nullFlavor attribute on
 * the element.</p>
 * <p>Events occurring at a single point in time that are represented in the Clinical Document
 * header will in general be precise to the day. These point-in-time events are the time of
 * creation of the document; the starting time of a participation by an author, data
 * enterer, authenticator, or legal authenticator; or the starting and ending time of an
 * encounter.</p>
 * <p>Within the specification, all telephone numbers are to be encoded using a grammar
 * which is a restriction on the TEL data type and RFC 2806. It simplifies interchange between applications as
 * it removes optional URL components found in RFC 2806 that applications typically do
 * not know how to process, such as ISDN sub-address, phone context, or other dialing
 * parameters.</p>
 * <p>Organizations that wish to use OIDs should properly register their OID root and ensure
 * uniqueness of the OID roots used in identifiers. A large number of mechanisms exist
 * for obtaining OID roots for free or for a reasonable fee. HL7 maintains an OID registry
 * page from which organizations may request an OID root under the HL7 OID root. This
 * page can be accessed at: http://www.hl7.org/oid.</p>
 * <p>Another useful resource lists the many ways to obtain a registered OID Root for free or
 * a small fee anywhere in the world and is located at:</p>
 * <p>http://www.dclunie.com/medical-image-faq/html/part8.html#UIDRegistration.</p>
 * <p>The manner in which the OID root is obtained is not constrained by this DSTU.</p>
 * A variety of legacy paper, film, electronic and scanner outputted formats are used to store and exchange clinical documents. These formats are not designed for healthcare documentation, and furthermore, do not have a uniform mechanism to store healthcare metadata associated with the documents, including patient identifiers, demographics, encounter, order or service information. The association of structured, healthcare metadata with this kind of document is important to maintain the integrity of the patient health record as managed by the source system. It is necessary to provide a mechanism that allows such source metadata to be stored with the document.
 * <b>IMPORTANT NOTE:</b> <i>The HITSP C62 specification does not include a templateId for this doument type. The id 2.16.840.1.113883.3.88.11.62.1 is included in this model to support instance validation, but we are designing a solution to allow removal of this Id.</i>
 * <p>This section describes constraints that apply to the H and P Note and to other types of CDA
 * documents defined for general exchange. The template defined here should be reused
 * wherever these general header constraints are applied.</p>
 * <p>To support communication between the receiver of the document and the patient or any
 * other person or organization mentioned within it, the elements representing them will
 * be named.</p>
 * <p>When name, address, or telecom information is unknown and where these elements are
 * required to be present, as with CDA conformance if the information is unknown, these
 * elements will be represented using an appropriate value for the nullFlavor attribute on
 * the element.</p>
 * <p>Events occurring at a single point in time that are represented in the Clinical Document
 * header will in general be precise to the day. These point-in-time events are the time of
 * creation of the document; the starting time of a participation by an author, data
 * enterer, authenticator, or legal authenticator; or the starting and ending time of an
 * encounter.</p>
 * <p>Within the specification, all telephone numbers are to be encoded using a grammar
 * which is a restriction on the TEL data type and RFC 2806. It simplifies interchange between applications as
 * it removes optional URL components found in RFC 2806 that applications typically do
 * not know how to process, such as ISDN sub-address, phone context, or other dialing
 * parameters.</p>
 * <p>Organizations that wish to use OIDs should properly register their OID root and ensure
 * uniqueness of the OID roots used in identifiers. A large number of mechanisms exist
 * for obtaining OID roots for free or for a reasonable fee. HL7 maintains an OID registry
 * page from which organizations may request an OID root under the HL7 OID root. This
 * page can be accessed at: http://www.hl7.org/oid.</p>
 * <p>Another useful resource lists the many ways to obtain a registered OID Root for free or
 * a small fee anywhere in the world and is located at:</p>
 * <p>http://www.dclunie.com/medical-image-faq/html/part8.html#UIDRegistration.</p>
 * <p>The manner in which the OID root is obtained is not constrained by this DSTU.</p>
 * This document type is not intended to be a replacement for IHE's XDS-SD (Cross-Transaction Specifications and Content Specifications, Scanned Documents Module) profile. Rather, it serves a more generic use case. XDS-SD is specifically for scanned documents, and limits content to PDF-A or text. This Unstructured Documents implementation guide is applicable not only for scanned documents in non-PDF formats, but also for clinical documents produced through word processing applications, etc.
 * Used for documents that implement both HL7 Unstructured Documents and HITSP C62 based on IHE Scanned Documents.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getUnstructuredOrScannedDocument()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.19.1' constraints.validation.error='UnstructuredOrScannedDocumentTemplateId UnstructuredOrScannedDocumentPersonHasName UnstructuredOrScannedDocumentRolesShallHaveAddrAndTelecom UnstructuredOrScannedDocumentOrganizationsHaveContactInfo UnstructuredOrScannedDocumentTimePreciseToDay UnstructuredOrScannedDocumentTimePreciseToYear UnstructuredOrScannedDocumentTelephoneMatchesRegex UnstructuredOrScannedDocumentHasTelephoneDialingDigits UnstructuredOrScannedDocumentUnknownTelephoneUsesNullFlavor UnstructuredOrScannedDocumentTypeIdExtension UnstructuredOrScannedDocumentIdRootFormat UnstructuredOrScannedDocumentOidLength UnstructuredOrScannedDocumentLanguageCodeForm UnstructuredOrScannedDocumentSetIdAndVersionNumber UnstructuredOrScannedDocumentSetIdAndIdAreUnique UnstructuredOrScannedDocumentCopyTimeNotPresent UnstructuredOrScannedDocumentHasRecordTargetPatientRole UnstructuredOrScannedDocumentHasPatientBirthTime UnstructuredOrScannedDocumentHasAdministrativeGenderCode UnstructuredOrScannedDocumentHasAuthorTime UnstructuredOrScannedDocumentHasAssignedAuthorId UnstructuredOrScannedDocumentHasAssignedAuthorPersonOrDevice UnstructuredOrScannedDocumentHasDataEntererAssignedPerson UnstructuredOrScannedDocumentHasInformantAssignedPersonOrRelatedPerson UnstructuredOrScannedDocumentLegalAuthenticatorHasAssignedPerson UnstructuredOrScannedDocumentAuthenticatorHasAssignedPerson UnstructuredOrScannedDocumentTypeIdFixed UnstructuredOrScannedDocumentHasOneRecordTarget UnstructuredOrScannedDocumentHasAssignedAuthor UnstructuredOrScannedDocumentPatientRoleId UnstructuredOrScannedDocumentHasPatientRoleAddress UnstructuredOrScannedDocumentHasPatientName UnstructuredOrScannedDocumentHasPatientGenderCode UnstructuredOrScannedDocumentHasPatientBirthYear UnstructuredOrScannedDocumentHasScanningDevice UnstructuredOrScannedDocumentHasScanDataEnterer UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr UnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId UnstructuredOrScannedDocumentHasNonXMLBody UnstructuredOrScannedDocumentHasNonXMLBodyBinaryText UnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType UnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation UnstructuredOrScannedDocumentOnePatientPerDocument UnstructuredOrScannedDocumentPatientRoleHasId UnstructuredOrScannedDocumentAssignedAuthorHasAddr UnstructuredOrScannedDocumentAssignedAuthorHasTelecom UnstructuredOrScannedDocumentHasRepresentedCustodianOrganization UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom UnstructuredOrScannedDocumentHasNonXMLBodyText UnstructuredOrScannedDocumentHasTextReferenceOrRepresentation UnstructuredOrScannedDocumentHasTextMediaTypeValueSet UnstructuredOrScannedDocumentRealmCode UnstructuredOrScannedDocumentTypeId UnstructuredOrScannedDocumentId UnstructuredOrScannedDocumentCode UnstructuredOrScannedDocumentTitle UnstructuredOrScannedDocumentEffectiveTime UnstructuredOrScannedDocumentLanguageCode' constraints.validation.warning='UnstructuredOrScannedDocumentRolesShouldHaveAddrAndTelecom UnstructuredOrScannedDocumentTimePreciseToSecond UnstructuredOrScannedDocumentTimePreciseToYearAndDay UnstructuredOrScannedDocumentHasOriginalAuthor UnstructuredOrScannedDocumentNoStructuredData' realmCode.code='US' constraints.validation.info='UnstructuredOrScannedDocumentHasProviderOrganization UnstructuredOrScannedDocumentHasDataEntererTime UnstructuredOrScannedDocumentHasInformant'"
 * @generated
 */
public interface UnstructuredOrScannedDocument extends ClinicalDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- implemented in Java using XPath selector'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentPersonHasName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- implemented in Java using XPath selector'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentRolesShallHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- implemented in Java using XPath selector'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentRolesShouldHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- implemented in Java using XPath selector'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentOrganizationsHaveContactInfo(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- implemented in Java using XPath selector'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentTimePreciseToDay(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentTimePreciseToYear(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- implemented in Java using XPath selector'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentTelephoneMatchesRegex(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- implemented in Java using XPath selector'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasTelephoneDialingDigits(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- implemented in Java using XPath selector'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentUnknownTelephoneUsesNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.extension = 'POCD_HD000040'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeId.extension = \'POCD_HD000040\''"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentTypeIdExtension(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.id.matches(\'root\',\'([0-2])(.([1-9][0-9]*|0))+\') or self.id.matches(\'root\',\'([A-Fa-f0-9]{8})(\\\\\\\\-[A-Fa-f0-9]{4}){3}(\\\\\\\\-[A-Fa-f0-9]{12})\')'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentIdRootFormat(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentOidLength(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.languageCode.matches(\'code\',\'(([a-z]{2})(\\\\\\\\-[A-Z]{2})?)\')'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentLanguageCodeForm(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())
	 *    xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())\r\n   xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentSetIdAndVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())
	 *    implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())\r\n   implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentSetIdAndIdAreUnique(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.copyTime.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.copyTime.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentCopyTimeNotPresent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()
	 *       or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()\r\n   implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()\r\n      or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasPatientBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()
	 *       or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()\r\n   implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()\r\n      or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasAdministrativeGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasProviderOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() \r\n   or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasAssignedAuthorPersonOrDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasDataEntererAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasDataEntererTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->size() > 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->size() > 0'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasInformant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()
	 *    or not i.relatedEntity.relatedPerson.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()\r\n   or not i.relatedEntity.relatedPerson.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasInformantAssignedPersonOrRelatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentLegalAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |
	 *    not entity.assignedPerson.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |\r\n   not entity.assignedPerson.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- implemented in Java using XPath selector'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentTimePreciseToSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentTimePreciseToYearAndDay(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanOriginalAuthor))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanOriginalAuthor))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasOriginalAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanningDevice))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanningDevice))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasScanningDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(ihe::ScanDataEnterer)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(ihe::ScanDataEnterer)'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasScanDataEnterer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.custodian.assignedCustodian.representedCustodianOrganization.name.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.custodian.assignedCustodian.representedCustodianOrganization.name.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.custodian.assignedCustodian.representedCustodianOrganization.addr.oclIsUndefined()
	 *    and self.custodian.assignedCustodian.representedCustodianOrganization.addr.country->exists(c : datatypes::ADXP |
	 *       not c.oclIsUndefined() and c.getText().size() > 0)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.custodian.assignedCustodian.representedCustodianOrganization.addr.oclIsUndefined()\r\n   and self.custodian.assignedCustodian.representedCustodianOrganization.addr.country->exists(c : datatypes::ADXP |\r\n      not c.oclIsUndefined() and c.getText().size() > 0)'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(DiagnosticChain diagnostics,
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
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.19.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.19.1\')'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
	 * value.code = 'US'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = element.oclAsType(datatypes::CS) in \r\nvalue.code = \'US\'))'"
	 * @generated
	 */
	boolean validateUnstructuredOrScannedDocumentRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	 * @generated
	 */
	public UnstructuredOrScannedDocument init();
} // UnstructuredOrScannedDocument
