/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - modified OCL in VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
 *									   since it was not generated properly due to the nested model (templateId -> id)
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2;
import org.openhealthtools.mdht.uml.cda.consol.FindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateUSRealmHeader2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticImagingReport2Operations extends USRealmHeader2Operations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticImagingReport2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2Id(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2Id(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2Id(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2Id(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2Id(DiagnosticImagingReport2 diagnosticImagingReport2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DiagnosticImagingReport2DiagnosticImagingReport2Id", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_ID,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReport2DiagnosticImagingReport2Id"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2CodeP(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2CodeP(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2CodeP(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2CodeP(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2CodeP(DiagnosticImagingReport2 diagnosticImagingReport2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DiagnosticImagingReport2DiagnosticImagingReport2CodeP", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_CODE_P,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReport2DiagnosticImagingReport2CodeP"),
						new Object[] { diagnosticImagingReport2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2CodeP", passToken);
				}
				passToken.add(diagnosticImagingReport2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2Code(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2Code(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2Code(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2Code(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2Code(DiagnosticImagingReport2 diagnosticImagingReport2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(diagnosticImagingReport2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "DiagnosticImagingReport2DiagnosticImagingReport2Code", "WARNING");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_CODE,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReport2DiagnosticImagingReport2Code"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2InformationRecipient(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2InformationRecipient(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2InformationRecipient(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2InformationRecipient(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2InformationRecipient(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2InformationRecipient", "INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_INFORMATION_RECIPIENT,
						ConsolPlugin.INSTANCE.getString(
							"DiagnosticImagingReport2DiagnosticImagingReport2InformationRecipient"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2Participant(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2Participant(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2Participant(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2Participant(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2Participant(DiagnosticImagingReport2 diagnosticImagingReport2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DiagnosticImagingReport2DiagnosticImagingReport2Participant", "INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReport2DiagnosticImagingReport2Participant"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2InFulfillmentOf(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 In Fulfillment Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2InFulfillmentOf(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2InFulfillmentOf(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 In Fulfillment Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2InFulfillmentOf(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2InFulfillmentOf(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DiagnosticImagingReport2DiagnosticImagingReport2InFulfillmentOf", "INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF,
						ConsolPlugin.INSTANCE.getString(
							"DiagnosticImagingReport2DiagnosticImagingReport2InFulfillmentOf"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2DocumentationOf(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DocumentationOf(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2DocumentationOf(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DocumentationOf(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2DocumentationOf(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DiagnosticImagingReport2DiagnosticImagingReport2DocumentationOf", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF,
						ConsolPlugin.INSTANCE.getString(
							"DiagnosticImagingReport2DiagnosticImagingReport2DocumentationOf"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2RelatedDocument(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2RelatedDocument(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->one(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2RelatedDocument(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2RelatedDocument(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2RelatedDocument(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DiagnosticImagingReport2DiagnosticImagingReport2RelatedDocument", "INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT,
						ConsolPlugin.INSTANCE.getString(
							"DiagnosticImagingReport2DiagnosticImagingReport2RelatedDocument"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentOf(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOf(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentOf(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOf(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2ComponentOf(DiagnosticImagingReport2 diagnosticImagingReport2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentOf", "INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReport2DiagnosticImagingReport2ComponentOf"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2FindingsSection(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Findings Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2FindingsSection(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2FindingsSection(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Findings Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2FindingsSection(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2FindingsSection(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DiagnosticImagingReport2DiagnosticImagingReport2FindingsSection", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_FINDINGS_SECTION,
						ConsolPlugin.INSTANCE.getString(
							"DiagnosticImagingReport2DiagnosticImagingReport2FindingsSection"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2DICOMObjectCatalogSection(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 DICOM Object Catalog Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DICOMObjectCatalogSection(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DICOMObjectCatalogSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2DICOMObjectCatalogSection(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 DICOM Object Catalog Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DICOMObjectCatalogSection(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2DICOMObjectCatalogSection(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2DICOMObjectCatalogSection", "WARNING");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_DICOM_OBJECT_CATALOG_SECTION,
						ConsolPlugin.INSTANCE.getString(
							"DiagnosticImagingReport2DiagnosticImagingReport2DICOMObjectCatalogSection"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2Component2(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2Component2(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2Component2(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2Component2(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2Component2(DiagnosticImagingReport2 diagnosticImagingReport2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DiagnosticImagingReport2DiagnosticImagingReport2Component2", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT2,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReport2DiagnosticImagingReport2Component2"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2Informant(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2Informant(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(rim::Participation))->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2Informant(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2Informant(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiagnosticImagingReport2Informant(DiagnosticImagingReport2 diagnosticImagingReport2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DiagnosticImagingReport2DiagnosticImagingReport2Informant", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_INFORMANT,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReport2DiagnosticImagingReport2Informant"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 II Root OI Ds Must Be No More Than64 Characters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT_OI_DS_MUST_BE_NO_MORE_THAN64_CHARACTERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->excluding(null)->select(isNullFlavorUndefined())->reject(id.root.size() <= 64)";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 II Root OI Ds Must Be No More Than64 Characters</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT_OI_DS_MUST_BE_NO_MORE_THAN64_CHARACTERS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT_OI_DS_MUST_BE_NO_MORE_THAN64_CHARACTERS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT_OI_DS_MUST_BE_NO_MORE_THAN64_CHARACTERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT_OI_DS_MUST_BE_NO_MORE_THAN64_CHARACTERS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT_OI_DS_MUST_BE_NO_MORE_THAN64_CHARACTERS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_II_ROOT_OI_DS_MUST_BE_NO_MORE_THAN64_CHARACTERS,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2IIRoot(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 II Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2IIRoot(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2IIRoot(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 II Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2IIRoot(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2IIRoot(DiagnosticImagingReport2 diagnosticImagingReport2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DiagnosticImagingReport2DiagnosticImagingReport2IIRoot", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_II_ROOT,
							ConsolPlugin.INSTANCE.getString("DiagnosticImagingReport2DiagnosticImagingReport2IIRoot"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant Associated Entity Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() =  1))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant Associated Entity Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ParticipantAssociatedEntityPersonName", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ParticipantAssociatedEntityPersonName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson",
			"ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ParticipantAssociatedEntity(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ParticipantAssociatedEntity(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ParticipantAssociatedEntity(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ParticipantAssociatedEntity(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ParticipantAssociatedEntity(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ParticipantAssociatedEntity", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ParticipantAssociatedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2InFulfillmentOfOrderId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 In Fulfillment Of Order Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2InFulfillmentOfOrderId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->excluding(null).order->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2InFulfillmentOfOrderId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 In Fulfillment Of Order Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2InFulfillmentOfOrderId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2InFulfillmentOfOrderId(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2InFulfillmentOfOrderId", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER_ID,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2InFulfillmentOfOrderId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2InFulfillmentOfOrder(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 In Fulfillment Of Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2InFulfillmentOfOrder(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->excluding(null)->reject(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2InFulfillmentOfOrder(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 In Fulfillment Of Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2InFulfillmentOfOrder(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2InFulfillmentOfOrder(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2InFulfillmentOfOrder", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2InFulfillmentOfOrder"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassRoot::ACT)";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2DocumentationOfServiceEventClassCode", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2DocumentationOfServiceEventClassCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2DocumentationOfServiceEventId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DocumentationOfServiceEventId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2DocumentationOfServiceEventId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DocumentationOfServiceEventId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2DocumentationOfServiceEventId(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2DocumentationOfServiceEventId", "WARNING");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_ID,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2DocumentationOfServiceEventId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2DocumentationOfServiceEventCode(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DocumentationOfServiceEventCode(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2DocumentationOfServiceEventCode(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DocumentationOfServiceEventCode(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2DocumentationOfServiceEventCode(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2DocumentationOfServiceEventCode", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CODE,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2DocumentationOfServiceEventCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Physician Reading Study Performer2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_PHYSICIAN_READING_STUDY_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::PhysicianReadingStudyPerformer2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Physician Reading Study Performer2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_PHYSICIAN_READING_STUDY_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2",
			"WARNING");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_PHYSICIAN_READING_STUDY_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_PHYSICIAN_READING_STUDY_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_PHYSICIAN_READING_STUDY_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_PHYSICIAN_READING_STUDY_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_PHYSICIAN_READING_STUDY_PERFORMER2,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2DocumentationOfServiceEvent(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DocumentationOfServiceEvent(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2DocumentationOfServiceEvent(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2DocumentationOfServiceEvent(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2DocumentationOfServiceEvent(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2DocumentationOfServiceEvent", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2DocumentationOfServiceEvent"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document Parent Document II Oids Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_II_OIDS_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->excluding(null).parentDocument->excluding(null).id->excluding(null)->select(isNullFlavorUndefined())->reject(not root.oclIsUndefined() implies root.size() <= 64)";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document Parent Document II Oids Length</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_II_OIDS_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength",
			"ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_II_OIDS_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_II_OIDS_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_II_OIDS_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_II_OIDS_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_II_OIDS_LENGTH,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2RelatedDocumentParentDocumentId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document Parent Document Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2RelatedDocumentParentDocumentId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->excluding(null).parentDocument->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() =  1))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2RelatedDocumentParentDocumentId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document Parent Document Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2RelatedDocumentParentDocumentId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2RelatedDocumentParentDocumentId(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2RelatedDocumentParentDocumentId", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_ID,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2RelatedDocumentParentDocumentId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2RelatedDocumentParentDocument(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document Parent Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2RelatedDocumentParentDocument(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->excluding(null)->reject(parentDocument->one(parentDocument : cda::ParentDocument | not parentDocument.oclIsUndefined() and parentDocument.oclIsKindOf(cda::ParentDocument)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2RelatedDocumentParentDocument(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document Parent Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2RelatedDocumentParentDocument(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2RelatedDocumentParentDocument(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2RelatedDocumentParentDocument", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2RelatedDocumentParentDocument"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 8) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 8) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 8))))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS",
			"ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 12) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 12) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 12))))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS",
			"WARNING");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 14) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 14) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 14))))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS",
			"INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject((not value.oclIsUndefined() and value.size() > 8 implies value.size() >= 15) and ((not low.value.oclIsUndefined() and low.value.size() > 8 implies low.value.size() >= 15) and (not high.value.oclIsUndefined() and high.value.size() > 8 implies high.value.size() >= 15)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS",
			"WARNING");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Assign Person Or Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->size() = 1 or representedOrganization->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Assign Person Or Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization",
			"WARNING");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity",
			"ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (( not id->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterId", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime",
			"ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty",
			"INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Physicianof Record Participant2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PHYSICIANOF_RECORD_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(consol::PhysicianofRecordParticipant2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Physicianof Record Participant2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PHYSICIANOF_RECORD_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2",
			"WARNING");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PHYSICIANOF_RECORD_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PHYSICIANOF_RECORD_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PHYSICIANOF_RECORD_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PHYSICIANOF_RECORD_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PHYSICIANOF_RECORD_PARTICIPANT2,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounter(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounter(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentOfEncompassingEncounter(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentOfEncompassingEncounter(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentOfEncompassingEncounter(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounter", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentOfEncompassingEncounter"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Subject Fetus Subject Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT_FETUS_SUBJECT_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null).subject->excluding(null)->reject(relatedSubject->one(relatedSubject : cda::RelatedSubject | not relatedSubject.oclIsUndefined() and relatedSubject.oclIsKindOf(consol::FetusSubjectContext)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Subject Fetus Subject Context</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT_FETUS_SUBJECT_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext",
			"ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT_FETUS_SUBJECT_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT_FETUS_SUBJECT_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT_FETUS_SUBJECT_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT_FETUS_SUBJECT_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT_FETUS_SUBJECT_CONTEXT,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Sections Have Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(getAllSections()->forAll(section : cda::Section | not section.text.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Sections Have Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText",
			"ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SECTIONS_HAVE_TEXT,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '1.2.840.10008.2.16.4' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode",
			"WARNING");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP",
			"ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject((title.oclIsUndefined() or title.isNullFlavorUndefined()) implies (not title.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle",
			"WARNING");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TITLE,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(not text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText",
			"WARNING");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies subject->exists(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject",
			"INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor",
			"INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_AUTHOR,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Procedure Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_PROCEDURE_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ProcedureContext)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Procedure Context</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_PROCEDURE_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext",
			"INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_PROCEDURE_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_PROCEDURE_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_PROCEDURE_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_PROCEDURE_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_PROCEDURE_CONTEXT,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContext"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Text Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::TextObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Text Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation",
			"INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT_OBSERVATION,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Code Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CodeObservations)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Code Observations</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations",
			"INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_OBSERVATIONS,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservations"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Quantity Measurement Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::QuantityMeasurementObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Quantity Measurement Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation",
			"INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_QUANTITY_MEASUREMENT_OBSERVATION,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section SOP Instance Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject(nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::SOPInstanceObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section SOP Instance Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation",
			"INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SOP_INSTANCE_OBSERVATION,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cda::Section)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3Section",
			"ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3Section"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->exists(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBodyComponent3(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBodyComponent3(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3", "INFO");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBodyComponent3"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBody(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBody(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReport2ComponentStructuredBody(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReport2ComponentStructuredBody(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReport2ComponentStructuredBody(
			DiagnosticImagingReport2 diagnosticImagingReport2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBody", "ERROR");

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			diagnosticImagingReport2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY,
							ConsolPlugin.INSTANCE.getString(
								"DiagnosticImagingReport2DiagnosticImagingReport2ComponentStructuredBody"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingsSection(DiagnosticImagingReport2) <em>Get Findings Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingsSection(DiagnosticImagingReport2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDINGS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))->asSequence()->any(true).oclAsType(consol::FindingsSection)";

	/**
	 * The cached OCL query for the '{@link #getFindingsSection(DiagnosticImagingReport2) <em>Get Findings Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingsSection(DiagnosticImagingReport2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDINGS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FindingsSection getFindingsSection(DiagnosticImagingReport2 diagnosticImagingReport2) {

		if (GET_FINDINGS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2,
				ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2.getEAllOperations().get(406));
			try {
				GET_FINDINGS_SECTION__EOCL_QRY = helper.createQuery(GET_FINDINGS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FINDINGS_SECTION__EOCL_QRY);
		return (FindingsSection) query.evaluate(diagnosticImagingReport2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDICOMObjectCatalogSection(DiagnosticImagingReport2) <em>Get DICOM Object Catalog Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDICOMObjectCatalogSection(DiagnosticImagingReport2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DICOM_OBJECT_CATALOG_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DICOMObjectCatalogSection))->asSequence()->any(true).oclAsType(consol::DICOMObjectCatalogSection)";

	/**
	 * The cached OCL query for the '{@link #getDICOMObjectCatalogSection(DiagnosticImagingReport2) <em>Get DICOM Object Catalog Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDICOMObjectCatalogSection(DiagnosticImagingReport2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DICOM_OBJECT_CATALOG_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DICOMObjectCatalogSection getDICOMObjectCatalogSection(
			DiagnosticImagingReport2 diagnosticImagingReport2) {

		if (GET_DICOM_OBJECT_CATALOG_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2,
				ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2.getEAllOperations().get(407));
			try {
				GET_DICOM_OBJECT_CATALOG_SECTION__EOCL_QRY = helper.createQuery(
					GET_DICOM_OBJECT_CATALOG_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_DICOM_OBJECT_CATALOG_SECTION__EOCL_QRY);
		return (DICOMObjectCatalogSection) query.evaluate(diagnosticImagingReport2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2TemplateId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2TemplateId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.5' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2TemplateId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2TemplateId(DiagnosticImagingReport2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticImagingReport2 The receiving '<em><b>Diagnostic Imaging Report2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeader2TemplateId(DiagnosticImagingReport2 diagnosticImagingReport2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DiagnosticImagingReport2USRealmHeader2TemplateId", "ERROR");

		if (VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT2);
			try {
				VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				diagnosticImagingReport2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT2__US_REALM_HEADER2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReport2USRealmHeader2TemplateId"),
						new Object[] { diagnosticImagingReport2 }));
			}

			return false;
		}
		return true;
	}

} // DiagnosticImagingReport2Operations
