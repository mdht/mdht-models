/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.AssignedEntity;
import org.eclipse.mdht.uml.cda.AssociatedEntity;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Component1;
import org.eclipse.mdht.uml.cda.Component2;
import org.eclipse.mdht.uml.cda.Component3;
import org.eclipse.mdht.uml.cda.DocumentationOf;
import org.eclipse.mdht.uml.cda.EncompassingEncounter;
import org.eclipse.mdht.uml.cda.InFulfillmentOf;
import org.eclipse.mdht.uml.cda.Order;
import org.eclipse.mdht.uml.cda.ParentDocument;
import org.eclipse.mdht.uml.cda.Participant1;
import org.eclipse.mdht.uml.cda.Person;
import org.eclipse.mdht.uml.cda.RelatedDocument;
import org.eclipse.mdht.uml.cda.ResponsibleParty;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.StructuredBody;
import org.eclipse.mdht.uml.cda.Subject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.ActClassRoot;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2;
import org.openhealthtools.mdht.uml.cda.consol.FetusSubjectContext;
import org.openhealthtools.mdht.uml.cda.consol.FindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2;
import org.openhealthtools.mdht.uml.cda.consol.operations.DiagnosticImagingReport2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Imaging Report2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2InformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2InFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2RelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2FindingsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DICOMObjectCatalogSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 DICOM Object Catalog Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2Component2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2Informant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 II Root OI Ds Must Be No More Than64 Characters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2IIRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 II Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant Associated Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2InFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2InFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 In Fulfillment Of Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DocumentationOfServiceEventId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Physician Reading Study Performer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document Parent Document II Oids Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2RelatedDocumentParentDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document Parent Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2RelatedDocumentParentDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document Parent Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Assign Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Physicianof Record Participant2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Subject Fetus Subject Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Sections Have Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Procedure Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Text Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Code Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Quantity Measurement Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#getFindingsSection() <em>Get Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#getDICOMObjectCatalogSection() <em>Get DICOM Object Catalog Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DiagnosticImagingReport2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2Id() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2IdTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2Id",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();
				target.setId(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Id(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2CodeP() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2CodePTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2CodeP(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2Code() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2CodeTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2Code",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE("notChecked", "2.16.840.1.113883.6.1"));
			}

			@Override
			protected void setDependency(DiagnosticImagingReport2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Code(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2InformationRecipient() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2InformationRecipientTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2InformationRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();
				target.getInformationRecipients().add(CDAFactory.eINSTANCE.createInformationRecipient());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2InformationRecipient(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2InformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2Participant() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ParticipantTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2Participant", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(p);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Participant(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2InFulfillmentOf() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2InFulfillmentOfTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2InFulfillmentOf",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				InFulfillmentOf ifo = CDAFactory.eINSTANCE.createInFulfillmentOf();
				target.getInFulfillmentOfs().add(ifo);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2InFulfillmentOf(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2InFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DocumentationOf() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DocumentationOfTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DocumentationOf",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				DocumentationOf docOf = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(docOf);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOf(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2RelatedDocument() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2RelatedDocumentTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2RelatedDocument",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				RelatedDocument rd = CDAFactory.eINSTANCE.createRelatedDocument();
				target.getRelatedDocuments().add(rd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2RelatedDocument(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2RelatedDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOf() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOf", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(cof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOf(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2FindingsSection() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2FindingsSectionTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2FindingsSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

				/* FindingsSection */
				FindingsSection section =

				ConsolFactory.eINSTANCE.createFindingsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2FindingsSection(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2FindingsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DICOMObjectCatalogSection() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DICOMObjectCatalogSectionTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DICOMObjectCatalogSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

				/* DICOMObjectCatalogSection */
				DICOMObjectCatalogSection section =

				ConsolFactory.eINSTANCE.createDICOMObjectCatalogSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DICOMObjectCatalogSection(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DICOMObjectCatalogSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2Component2() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2Component2TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2Component2", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Component2(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2Component2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2Informant() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2InformantTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2Informant", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				target.getInformants().add(CDAFactory.eINSTANCE.createInformant12());
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getInformants().clear();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Informant(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2InformantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64CharactersTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT_OI_DS_MUST_BE_NO_MORE_THAN64_CHARACTERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				// 65 characters, 1 over
				II id = DatatypesFactory.eINSTANCE.createII(
					"02345678901234567890223456789032345678904234567890523456789062345");
				target.setId(id);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				// 64 characters (or less)
				target.getId().setRoot("0234567890123456789022345678903234567890423456789052345678906234");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64CharactersTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2IIRoot() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2IIRootTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2IIRoot",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Note: (incorrectly) generated OCL modified in operations

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				target.setId(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getId().setRoot("root");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2IIRoot(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2IIRootTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonNameTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				Person ap = CDAFactory.eINSTANCE.createPerson();
				ae.setAssociatedPerson(ap);
				par.setAssociatedEntity(ae);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getParticipants().clear();
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				Person ap = CDAFactory.eINSTANCE.createPerson();
				ap.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				ae.setAssociatedPerson(ap);
				par.setAssociatedEntity(ae);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setAssociatedEntity(ae);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getParticipants().clear();
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				Person ap = CDAFactory.eINSTANCE.createPerson();
				ae.setAssociatedPerson(ap);
				par.setAssociatedEntity(ae);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ParticipantAssociatedEntity() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ParticipantAssociatedEntityTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ParticipantAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getParticipants().clear();
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setAssociatedEntity(ae);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ParticipantAssociatedEntity(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ParticipantAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2InFulfillmentOfOrderId() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2InFulfillmentOfOrderIdTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2InFulfillmentOfOrderId",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				InFulfillmentOf ifo = CDAFactory.eINSTANCE.createInFulfillmentOf();
				target.getInFulfillmentOfs().add(ifo);
				Order order = CDAFactory.eINSTANCE.createOrder();
				ifo.setOrder(order);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				II id = DatatypesFactory.eINSTANCE.createII();
				for (InFulfillmentOf ifo : target.getInFulfillmentOfs()) {
					ifo.getOrder().getIds().add(id);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2InFulfillmentOfOrderId(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2InFulfillmentOfOrderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2InFulfillmentOfOrder() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2InFulfillmentOfOrderTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2InFulfillmentOfOrder",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				InFulfillmentOf ifo = CDAFactory.eINSTANCE.createInFulfillmentOf();
				target.getInFulfillmentOfs().add(ifo);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Order order = CDAFactory.eINSTANCE.createOrder();
				for (InFulfillmentOf ifo : target.getInFulfillmentOfs()) {
					ifo.setOrder(order);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2InFulfillmentOfOrder(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2InFulfillmentOfOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DocumentationOfServiceEventClassCode() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setClassCode(ActClassRoot.ACT);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DocumentationOfServiceEventId() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DocumentationOfServiceEventIdTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DocumentationOfServiceEventId",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.getIds().add(DatatypesFactory.eINSTANCE.createII());
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEventId(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DocumentationOfServiceEventIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DocumentationOfServiceEventCode() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DocumentationOfServiceEventCodeTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DocumentationOfServiceEventCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setCode(DatatypesFactory.eINSTANCE.createCE());
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEventCode(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DocumentationOfServiceEventCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_PHYSICIAN_READING_STUDY_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(dof);
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (DocumentationOf doc : target.getDocumentationOfs()) {
					doc.getServiceEvent().getPerformers().add(
						ConsolFactory.eINSTANCE.createPhysicianReadingStudyPerformer2().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DocumentationOfServiceEvent() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DocumentationOfServiceEventTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEvent(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLengthTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_II_OIDS_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				RelatedDocument rdoc = CDAFactory.eINSTANCE.createRelatedDocument();
				target.getRelatedDocuments().add(rdoc);
				ParentDocument pdoc = CDAFactory.eINSTANCE.createParentDocument();
				rdoc.setParentDocument(pdoc);
				// 65 characters, 1 over
				II id = DatatypesFactory.eINSTANCE.createII(
					"02345678901234567890223456789032345678904234567890523456789062345");
				pdoc.getIds().add(id);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (RelatedDocument rdoc : target.getRelatedDocuments()) {
					for (II id : rdoc.getParentDocument().getIds()) {
						// 64 characters or less (64)
						id.setRoot("0234567890123456789022345678903234567890423456789052345678906234");
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLengthTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2RelatedDocumentParentDocumentId() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2RelatedDocumentParentDocumentIdTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2RelatedDocumentParentDocumentId",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				RelatedDocument rd = CDAFactory.eINSTANCE.createRelatedDocument();
				target.getRelatedDocuments().add(rd);
				ParentDocument pd = CDAFactory.eINSTANCE.createParentDocument();
				rd.setParentDocument(pd);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (RelatedDocument rd : target.getRelatedDocuments()) {
					rd.getParentDocument().getIds().add(DatatypesFactory.eINSTANCE.createII());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2RelatedDocumentParentDocumentId(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2RelatedDocumentParentDocumentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2RelatedDocumentParentDocument() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2RelatedDocumentParentDocumentTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2RelatedDocumentParentDocument",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				RelatedDocument rd = CDAFactory.eINSTANCE.createRelatedDocument();
				target.getRelatedDocuments().add(rd);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				ParentDocument pd = CDAFactory.eINSTANCE.createParentDocument();
				for (RelatedDocument rd : target.getRelatedDocuments()) {
					rd.setParentDocument(pd);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2RelatedDocumentParentDocument(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2RelatedDocumentParentDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTSTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_DAY);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTSTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_MINUTE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTSTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE);
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_SECOND);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTSTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(
					PRECISE_TO_SECOND_WITH_TIMEZONE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganizationTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				rp.setAssignedEntity(ae);
				ee.setResponsibleParty(rp);
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				rp.setAssignedEntity(ae);
				ee.setResponsibleParty(rp);
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				ee.setResponsibleParty(rp);
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				rp.setAssignedEntity(ae);
				ee.setResponsibleParty(rp);
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterId() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterIdTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ee.getIds().add(DatatypesFactory.eINSTANCE.createII());
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ee.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				ee.setResponsibleParty(rp);
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PHYSICIANOF_RECORD_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				PhysicianofRecordParticipant2 rp2 = ConsolFactory.eINSTANCE.createPhysicianofRecordParticipant2().init();
				ee.getEncounterParticipants().add(rp2);
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounter() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				target.setComponentOf(CDAFactory.eINSTANCE.createComponent1());
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				comp.setEncompassingEncounter(ee);
				target.setComponentOf(comp);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounter(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContextTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT_FETUS_SUBJECT_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c3.setSection(sec);
				Subject sub = CDAFactory.eINSTANCE.createSubject();
				sec.setSubject(sub);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				FetusSubjectContext fsc = ConsolFactory.eINSTANCE.createFetusSubjectContext().init();
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.getSection().getSubject().setRelatedSubject(fsc);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveTextTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAllergiesSection().init());
				target.addSection(ConsolFactory.eINSTANCE.createAdvanceDirectivesSection().init());
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (Section sec : target.getAllSections()) {
					sec.createStrucDocText("Sample Narrative Text");
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c3.setSection(sec);
				CE code = DatatypesFactory.eINSTANCE.createCE();
				sec.setCode(code);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.getSection().setCode(DatatypesFactory.eINSTANCE.createCE("notChecked", "1.2.840.10008.2.16.4"));
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodePTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c3.setSection(sec);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.getSection().setCode(DatatypesFactory.eINSTANCE.createCE());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitleTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c3.setSection(sec);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.getSection().setTitle(DatatypesFactory.eINSTANCE.createST());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c3.setSection(sec);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.getSection().setText(CDAFactory.eINSTANCE.createStrucDocText());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c3.setSection(sec);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.getSection().setSubject(CDAFactory.eINSTANCE.createSubject());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthorTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c3.setSection(sec);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.getSection().getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContextTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_PROCEDURE_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c3.setSection(sec);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.getSection().addAct(ConsolFactory.eINSTANCE.createProcedureContext().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservationTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c3.setSection(sec);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.getSection().addObservation(ConsolFactory.eINSTANCE.createTextObservation().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservationsTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c3.setSection(sec);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.getSection().addObservation(ConsolFactory.eINSTANCE.createCodeObservations().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservationTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c3.setSection(sec);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.getSection().addObservation(
						ConsolFactory.eINSTANCE.createQuantityMeasurementObservation().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservationTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c3.setSection(sec);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.getSection().addObservation(ConsolFactory.eINSTANCE.createSOPInstanceObservation().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				sb.getComponents().add(c3);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Section sec = CDAFactory.eINSTANCE.createSection();
				for (Component3 c : target.getComponent().getStructuredBody().getComponents()) {
					c.setSection(sec);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				c2.setStructuredBody(sb);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				Component3 c3 = CDAFactory.eINSTANCE.createComponent3();
				target.getComponent().getStructuredBody().getComponents().add(c3);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBody() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBody",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				target.getComponent().setStructuredBody(sb);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBody(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFindingsSection() {

		DiagnosticImagingReport2 target = objectFactory.create();
		target.getFindingsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDICOMObjectCatalogSection() {

		DiagnosticImagingReport2 target = objectFactory.create();
		target.getDICOMObjectCatalogSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<DiagnosticImagingReport2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateGeneralHeaderConstraintsTemplateId(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DiagnosticImagingReport2Operations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<DiagnosticImagingReport2> {
		public DiagnosticImagingReport2 create() {
			return ConsolFactory.eINSTANCE.createDiagnosticImagingReport2();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends DiagnosticImagingReport2Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // DiagnosticImagingReport2Operations
