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
 * A representation of the model object '<em><b>Diagnostic Imaging Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getDiagnosticImagingReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DiagnosticImagingReportTemplateId GeneralHeaderConstraintsCode DiagnosticImagingReportId DiagnosticImagingReportInformant DiagnosticImagingReportDocumentationOf DiagnosticImagingReportFindingsSection' templateId.root='2.16.840.1.113883.10.20.22.1.5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.info='DiagnosticImagingReportInformationRecipient DiagnosticImagingReportParticipant1 DiagnosticImagingReportInFulfillmentOf DiagnosticImagingReportRelatedDocument DiagnosticImagingReportComponentOf'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportParticipant constraints.validation.error='ParticipantAssociatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportParticipantAssociatedEntity constraints.validation.error='AssociatedEntityAssociatedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportParticipantAssociatedEntityPerson constraints.validation.error='PersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportDocumentationOf constraints.validation.error='DocumentationOfServiceEvent3'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportDocumentationOfServiceEvent4 constraints.validation.error='ServiceEvent4ClassCode ServiceEvent4Code' classCode='ACT' constraints.validation.warning='ServiceEvent4Id ServiceEvent4PhysicianReadingStudyPerformer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportComponentOf constraints.validation.error='ComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportComponentOfEncompassingEncounter7 constraints.validation.error='EncompassingEncounter7EffectiveTime EncompassingEncounter7Id' constraints.validation.warning='EncompassingEncounter7PhysicianofRecordParticipant' constraints.validation.info='EncompassingEncounter7ResponsibleParty'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty constraints.validation.error='ResponsiblePartyAssignedEntity'"
 * @generated
 */
public interface DiagnosticImagingReport extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.5')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.1.5\')'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDiagnosticImagingReportId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(rim::Participation))->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(rim::Participation))->isEmpty()'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportInformant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(rim::Participation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(rim::Participation))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportInformationRecipient(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportParticipant1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.inFulfillmentOf->one(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->one(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportInFulfillmentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedDocument->one(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument->one(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportRelatedDocument(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))'"
	 * @generated
	 */
	boolean validateDiagnosticImagingReportFindingsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))->asSequence()->first().oclAsType(consol::FindingsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))->asSequence()->first().oclAsType(consol::FindingsSection)'"
	 * @generated
	 */
	FindingsSection getFindingsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticImagingReport init();
} // DiagnosticImagingReport
