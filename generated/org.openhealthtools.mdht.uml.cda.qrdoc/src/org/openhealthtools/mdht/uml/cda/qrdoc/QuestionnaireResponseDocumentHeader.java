/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Response Document Header</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage#getQuestionnaireResponseDocumentHeader()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='QuestionnaireResponseDocumentHeaderTemplateId QuestionnaireResponseDocumentHeaderConfidentialityCode QuestionnaireResponseDocumentHeaderEffectiveTime QuestionnaireResponseDocumentHeaderId QuestionnaireResponseDocumentHeaderLanguageCode QuestionnaireResponseDocumentHeaderRealmCode QuestionnaireResponseDocumentHeaderTitle QuestionnaireResponseDocumentHeaderTypeId QuestionnaireResponseDocumentHeaderRecordTarget QuestionnaireResponseDocumentHeaderAuthor QuestionnaireResponseDocumentHeaderCustodian' templateId.root='2.16.840.1.113883.10.20.33' constraints.validation.info='QuestionnaireResponseDocumentHeaderDataEnterer QuestionnaireResponseDocumentHeaderInformant QuestionnaireResponseDocumentHeaderInformationRecipient' constraints.validation.warning='QuestionnaireResponseDocumentHeaderLegalAuthenticator QuestionnaireResponseDocumentHeaderInFulfillmentOf'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderRecordTarget constraints.validation.error='QuestionnaireResponseDocumentHeaderRecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderRecordTargetPatientRole constraints.validation.error='QuestionnaireResponseDocumentHeaderRecordTargetPatientRoleAddr QuestionnaireResponseDocumentHeaderRecordTargetPatientRoleId QuestionnaireResponseDocumentHeaderRecordTargetPatientRoleTelecom QuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatient constraints.validation.error='QuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatientAdministrativeGenderCode QuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatientBirthTime QuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatientName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthor constraints.validation.error='QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorCode QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorId' constraints.validation.warning='QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAssignedAuthoringDevice QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorPerson constraints.validation.error='QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorPersonTemplateId QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorPersonName' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAuthoringDevice constraints.validation.error='QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderDataEnterer constraints.validation.error='QuestionnaireResponseDocumentHeaderDataEntererAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderDataEntererAssignedEntity constraints.validation.error='QuestionnaireResponseDocumentHeaderDataEntererAssignedEntityAddr QuestionnaireResponseDocumentHeaderDataEntererAssignedEntityId QuestionnaireResponseDocumentHeaderDataEntererAssignedEntityTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformant12AssignedEntity constraints.validation.warning='QuestionnaireResponseDocumentHeaderInformant12AssignedEntityAddr QuestionnaireResponseDocumentHeaderInformant12AssignedEntityId' constraints.validation.info='QuestionnaireResponseDocumentHeaderInformant12AssignedEntityCode' constraints.validation.error='QuestionnaireResponseDocumentHeaderInformant12AssignedEntityAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformant12RelatedEntity constraints.validation.warning='QuestionnaireResponseDocumentHeaderInformant12RelatedEntityAddr' constraints.validation.info='QuestionnaireResponseDocumentHeaderInformant12RelatedEntityCode' constraints.validation.error='QuestionnaireResponseDocumentHeaderInformant12RelatedEntityRelatedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformant12RelatedEntityPerson constraints.validation.error='QuestionnaireResponseDocumentHeaderInformant12RelatedEntityPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderCustodian constraints.validation.error='QuestionnaireResponseDocumentHeaderCustodianAssignedCustodian'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderCustodianAssignedCustodian constraints.validation.error='QuestionnaireResponseDocumentHeaderCustodianAssignedCustodianRepresentedCustodianOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganization constraints.validation.error='QuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganizationAddr QuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganizationId QuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganizationTelecom QuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganizationName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipient constraints.validation.warning='QuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientId' constraints.validation.info='QuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientInformationRecipient QuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientReceivedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientPerson constraints.validation.error='QuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticator signatureCode.code='S' constraints.validation.error='QuestionnaireResponseDocumentHeaderLegalAuthenticatorSignatureCode QuestionnaireResponseDocumentHeaderLegalAuthenticatorSignatureCodeP QuestionnaireResponseDocumentHeaderLegalAuthenticatorTime QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntity' constraints.validation.dependOn.QuestionnaireResponseDocumentHeaderLegalAuthenticatorSignatureCode='QuestionnaireResponseDocumentHeaderLegalAuthenticatorSignatureCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntity constraints.validation.error='QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityAddr QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityId QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTelecom QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityAssignedPerson QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTELUse' constraints.validation.info='QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityCode' constraints.validation.query='QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTELUse'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityPerson constraints.validation.error='QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTEL constraints.validation.error='QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTELUse'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderParticipant constraints.validation.error='QuestionnaireResponseDocumentHeaderParticipantTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInFulfillmentOf constraints.validation.error='QuestionnaireResponseDocumentHeaderInFulfillmentOfOrder'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInFulfillmentOfOrder constraints.validation.error='QuestionnaireResponseDocumentHeaderInFulfillmentOfOrderTemplateId' templateId.root='null'"
 * @generated
 */
public interface QuestionnaireResponseDocumentHeader extends ClinicalDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.33\')'"
	 * @generated
	 */
	boolean validateQuestionnaireResponseDocumentHeaderTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateQuestionnaireResponseDocumentHeaderConfidentialityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateQuestionnaireResponseDocumentHeaderEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateQuestionnaireResponseDocumentHeaderId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateQuestionnaireResponseDocumentHeaderLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1)'"
	 * @generated
	 */
	boolean validateQuestionnaireResponseDocumentHeaderRealmCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateQuestionnaireResponseDocumentHeaderTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateQuestionnaireResponseDocumentHeaderTypeId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateQuestionnaireResponseDocumentHeaderRecordTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validateQuestionnaireResponseDocumentHeaderAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))'"
	 * @generated
	 */
	boolean validateQuestionnaireResponseDocumentHeaderDataEnterer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->exists(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))'"
	 * @generated
	 */
	boolean validateQuestionnaireResponseDocumentHeaderInformant(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateQuestionnaireResponseDocumentHeaderCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))'"
	 * @generated
	 */
	boolean validateQuestionnaireResponseDocumentHeaderInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))'"
	 * @generated
	 */
	boolean validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))'"
	 * @generated
	 */
	boolean validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseDocumentHeader init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QuestionnaireResponseDocumentHeader init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // QuestionnaireResponseDocumentHeader
