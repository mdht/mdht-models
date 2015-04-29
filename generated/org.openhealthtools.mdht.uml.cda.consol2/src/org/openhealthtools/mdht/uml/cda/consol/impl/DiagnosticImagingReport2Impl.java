/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2;
import org.openhealthtools.mdht.uml.cda.consol.FindingsSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.DiagnosticImagingReport2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Imaging Report2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DiagnosticImagingReport2Impl extends USRealmHeader2Impl implements DiagnosticImagingReport2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticImagingReport2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2InformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2InformationRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2Participant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Participant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2InFulfillmentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2InFulfillmentOf(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2DocumentationOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOf(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2RelatedDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2RelatedDocument(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOf(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2FindingsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2FindingsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2DICOMObjectCatalogSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DICOMObjectCatalogSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2Component2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Component2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2Informant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Informant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2IIRoot(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2IIRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ParticipantAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ParticipantAssociatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2InFulfillmentOfOrderId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2InFulfillmentOfOrderId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2InFulfillmentOfOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2InFulfillmentOfOrder(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2DocumentationOfServiceEventId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEventId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2DocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEventCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2DocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEvent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2RelatedDocumentParentDocumentId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2RelatedDocumentParentDocumentId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2RelatedDocumentParentDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2RelatedDocumentParentDocument(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReport2ComponentStructuredBody(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBody(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindingsSection getFindingsSection() {
		return DiagnosticImagingReport2Operations.getFindingsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICOMObjectCatalogSection getDICOMObjectCatalogSection() {
		return DiagnosticImagingReport2Operations.getDICOMObjectCatalogSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport2Operations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagnosticImagingReport2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagnosticImagingReport2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DiagnosticImagingReport2Impl
