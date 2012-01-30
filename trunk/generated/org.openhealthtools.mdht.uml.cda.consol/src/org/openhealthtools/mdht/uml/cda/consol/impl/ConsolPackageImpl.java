/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsolPackageImpl extends EPackageImpl implements ConsolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "consol.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraints_RecordTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordTarget_PatientRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientRole_PatientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patient_GuardianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patient_LanguageCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patient_BirthplaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass birthplace_PlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientRole_ProviderOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraints_ComponentOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOf_EncompassingEncounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraints_AuthorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass author_AssignedAuthorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignedAuthor_AuthoringDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraints_PersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraints_DataEntererEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEnterer_AssignedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraints_CustodianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custodian_AssignedCustodianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignedCustodian_CustodianOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraints_InformationRecipientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationRecipient_IntendedRecipientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intendedRecipient_OrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraints_LegalAuthenticatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalAuthenticator_AssignedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraints_AuthenticatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticator_AssignedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraints_InformantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informant_AssignedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informant_RelatedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraints_ParticipantSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraints_InFulfillmentOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inFulfillmentOf_OrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyProblemActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactionObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass severityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ageObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonMedicinalSupplyActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstance_ScopingEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstance_PlayingDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispense_ProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationSupplyOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationSupplyOrder_ProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drugVehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationFullfillmentInstructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemConcernActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuityOfCareDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuityOfCareDocument_DocumentationOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationOf_ServiceEvent3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEvent3_PerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performer_AssignedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuityOfCareDocument_AuthorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass author_AssignedAuthor3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectivesSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergiesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergiesSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encountersSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payersSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityEncounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivitySubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivitySupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proceduresSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proceduresSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryDeathObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialHistoryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pregnancyObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estimatedDateOfDeliveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalEquipmentSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalStatusSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialHistoryStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposeSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposeActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectivesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveObservation_ReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reference_ExternalDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveObservation_CustodianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custodian_CustodianRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custodianRole_CustodianEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveObservation_VerifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveVerificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encountersSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterActivitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDeliveryLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRefusalReasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insuranceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payerEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coveredPartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policySubscriberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyOfPastIllnessSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chiefComplaintSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonForReferralSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyOfPresentIllnessSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalAdmissionDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalAdmissionMedicationsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admissionMedicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeMedicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargePhysicalSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chiefComplaintAndReasonForVisitSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonForVisitSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedInformantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterPerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterPerformerAssignedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyObservationParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyObservationParticipantRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyObservationPlayingEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anesthesiaSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dicomObjectCatalogSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seriesActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sopInstanceObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposeofReferenceObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedFramesObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalConsultationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interventionsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operativeNoteFluidSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operativeNoteSurgicalProcedureSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedProcedureSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postoperativeDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postprocedureDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postprocedureDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preoperativeDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureDescriptionSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureDispositionSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEstimatedBloodLossSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureFindingsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureImplantsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureIndicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureSpecimensTakenSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectiveSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consultationNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consultationNote_ComponentOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOf_EncompassingEncounter2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encompassingEncounter2_ResponsiblePartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encompassingEncounter2_EncounterParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyAndPhysicalNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyAndPhysicalNote_ComponentOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOf_EncompassingEncounter4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encompassingEncounter4_ResponsiblePartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encompassingEncounter4_EncounterParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operativeNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operativeNote_DocumentationOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationOf_ServiceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEvent_PrimaryPerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureNote_ComponentOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOf_EncompassingEncounter5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encompassingEncounter5_LocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass location_HealthCareFacilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encompassingEncounter5_EncounterParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureNote_IndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureNote_PrimaryCarePhysicianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureNote_ProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provider_AssociatedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureNote_DocumentationOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationOf_ServiceEvent1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEvent1_PrimaryPerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressNote_DocumentationOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationOf_ServiceEvent2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressNote_ComponentOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOf_EncompassingEncounter6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encompassingEncounter6_LocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass location_HealthCareFacility1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preoperativeDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalAdmissionDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseAssignedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationMedicationInformationManufacturedMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticImagingReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticImagingReport_ParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participant_AssociatedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associatedEntity_PersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticImagingReport_InFulfillmentOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticImagingReport_DocumentationOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationOf_ServiceEvent4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticImagingReport_RelatedDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticImagingReport_ComponentOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOf_EncompassingEncounter7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encompassingEncounter7_ResponsiblePartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsibleParty_AssignedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicianReadingStudyPerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicianReadingStudyPerformer_AssignedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicianofRecordParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicianofRecordParticipant_AssignedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignedEntity_AssignedPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityMeasurementObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeObservationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsAdministeredSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalExamSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalStatusSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewOfSystemsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalCourseSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentAndPlanSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageSpokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportGuardianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surgicalDrainsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredDocument_RecordTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordTarget_PatientRole2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredDocument_AuthorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass author_AssignedAuthor2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredDocument_CustodianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custodian_AssignedCustodian3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignedCustodian3_CustodianOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredDocument_ComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass component_NonXMLBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scanOriginalAuthorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scanningDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scanDataEntererEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredOrScannedDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referralSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeSummary_ComponentOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOf_EncompassingEncounter3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encompassingEncounter3_ResponsiblePartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encompassingEncounter3_EncounterParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeDietSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeMedicationsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preconditionForSubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationMedicationInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureSpecimenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedurePerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEncounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationInformationManufacturedMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistorySubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeStudiesSummarySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeMedicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeInstructionsSectionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConsolPackageImpl() {
		super(eNS_URI, ConsolFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConsolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ConsolPackage init() {
		if (isInited) {
			return (ConsolPackage) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);
		}

		// Obtain or create and register package
		ConsolPackageImpl theConsolPackage = (ConsolPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConsolPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new ConsolPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CDAPackage.eINSTANCE.eClass();

		// Load packages
		theConsolPackage.loadPackage();

		// Fix loaded packages
		theConsolPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theConsolPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return ConsolValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theConsolPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConsolPackage.eNS_URI, theConsolPackage);
		return theConsolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints() {
		if (generalHeaderConstraintsEClass == null) {
			generalHeaderConstraintsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				0);
		}
		return generalHeaderConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints_RecordTarget() {
		if (generalHeaderConstraints_RecordTargetEClass == null) {
			generalHeaderConstraints_RecordTargetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(1);
		}
		return generalHeaderConstraints_RecordTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordTarget_PatientRole() {
		if (recordTarget_PatientRoleEClass == null) {
			recordTarget_PatientRoleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				2);
		}
		return recordTarget_PatientRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientRole_Patient() {
		if (patientRole_PatientEClass == null) {
			patientRole_PatientEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				3);
		}
		return patientRole_PatientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient_Guardian() {
		if (patient_GuardianEClass == null) {
			patient_GuardianEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				4);
		}
		return patient_GuardianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient_LanguageCommunication() {
		if (patient_LanguageCommunicationEClass == null) {
			patient_LanguageCommunicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				5);
		}
		return patient_LanguageCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient_Birthplace() {
		if (patient_BirthplaceEClass == null) {
			patient_BirthplaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				6);
		}
		return patient_BirthplaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBirthplace_Place() {
		if (birthplace_PlaceEClass == null) {
			birthplace_PlaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				7);
		}
		return birthplace_PlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientRole_ProviderOrganization() {
		if (patientRole_ProviderOrganizationEClass == null) {
			patientRole_ProviderOrganizationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(8);
		}
		return patientRole_ProviderOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints_ComponentOf() {
		if (generalHeaderConstraints_ComponentOfEClass == null) {
			generalHeaderConstraints_ComponentOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(9);
		}
		return generalHeaderConstraints_ComponentOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentOf_EncompassingEncounter() {
		if (componentOf_EncompassingEncounterEClass == null) {
			componentOf_EncompassingEncounterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(10);
		}
		return componentOf_EncompassingEncounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints_Author() {
		if (generalHeaderConstraints_AuthorEClass == null) {
			generalHeaderConstraints_AuthorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(11);
		}
		return generalHeaderConstraints_AuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthor_AssignedAuthor() {
		if (author_AssignedAuthorEClass == null) {
			author_AssignedAuthorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				12);
		}
		return author_AssignedAuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignedAuthor_AuthoringDevice() {
		if (assignedAuthor_AuthoringDeviceEClass == null) {
			assignedAuthor_AuthoringDeviceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(13);
		}
		return assignedAuthor_AuthoringDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints_Person() {
		if (generalHeaderConstraints_PersonEClass == null) {
			generalHeaderConstraints_PersonEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(14);
		}
		return generalHeaderConstraints_PersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints_DataEnterer() {
		if (generalHeaderConstraints_DataEntererEClass == null) {
			generalHeaderConstraints_DataEntererEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(15);
		}
		return generalHeaderConstraints_DataEntererEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataEnterer_AssignedEntity() {
		if (dataEnterer_AssignedEntityEClass == null) {
			dataEnterer_AssignedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				16);
		}
		return dataEnterer_AssignedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints_Custodian() {
		if (generalHeaderConstraints_CustodianEClass == null) {
			generalHeaderConstraints_CustodianEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(17);
		}
		return generalHeaderConstraints_CustodianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustodian_AssignedCustodian() {
		if (custodian_AssignedCustodianEClass == null) {
			custodian_AssignedCustodianEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				18);
		}
		return custodian_AssignedCustodianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignedCustodian_CustodianOrganization() {
		if (assignedCustodian_CustodianOrganizationEClass == null) {
			assignedCustodian_CustodianOrganizationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(19);
		}
		return assignedCustodian_CustodianOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints_InformationRecipient() {
		if (generalHeaderConstraints_InformationRecipientEClass == null) {
			generalHeaderConstraints_InformationRecipientEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(20);
		}
		return generalHeaderConstraints_InformationRecipientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationRecipient_IntendedRecipient() {
		if (informationRecipient_IntendedRecipientEClass == null) {
			informationRecipient_IntendedRecipientEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(21);
		}
		return informationRecipient_IntendedRecipientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntendedRecipient_Organization() {
		if (intendedRecipient_OrganizationEClass == null) {
			intendedRecipient_OrganizationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(22);
		}
		return intendedRecipient_OrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints_LegalAuthenticator() {
		if (generalHeaderConstraints_LegalAuthenticatorEClass == null) {
			generalHeaderConstraints_LegalAuthenticatorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(23);
		}
		return generalHeaderConstraints_LegalAuthenticatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegalAuthenticator_AssignedEntity() {
		if (legalAuthenticator_AssignedEntityEClass == null) {
			legalAuthenticator_AssignedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(24);
		}
		return legalAuthenticator_AssignedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints_Authenticator() {
		if (generalHeaderConstraints_AuthenticatorEClass == null) {
			generalHeaderConstraints_AuthenticatorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(25);
		}
		return generalHeaderConstraints_AuthenticatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticator_AssignedEntity() {
		if (authenticator_AssignedEntityEClass == null) {
			authenticator_AssignedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				26);
		}
		return authenticator_AssignedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints_Informant() {
		if (generalHeaderConstraints_InformantEClass == null) {
			generalHeaderConstraints_InformantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(27);
		}
		return generalHeaderConstraints_InformantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformant_AssignedEntity() {
		if (informant_AssignedEntityEClass == null) {
			informant_AssignedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				28);
		}
		return informant_AssignedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformant_RelatedEntity() {
		if (informant_RelatedEntityEClass == null) {
			informant_RelatedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				29);
		}
		return informant_RelatedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints_ParticipantSupport() {
		if (generalHeaderConstraints_ParticipantSupportEClass == null) {
			generalHeaderConstraints_ParticipantSupportEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(30);
		}
		return generalHeaderConstraints_ParticipantSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints_InFulfillmentOf() {
		if (generalHeaderConstraints_InFulfillmentOfEClass == null) {
			generalHeaderConstraints_InFulfillmentOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(31);
		}
		return generalHeaderConstraints_InFulfillmentOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInFulfillmentOf_Order() {
		if (inFulfillmentOf_OrderEClass == null) {
			inFulfillmentOf_OrderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				32);
		}
		return inFulfillmentOf_OrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyProblemAct() {
		if (allergyProblemActEClass == null) {
			allergyProblemActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				33);
		}
		return allergyProblemActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyObservation() {
		if (allergyObservationEClass == null) {
			allergyObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				34);
		}
		return allergyObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactionObservation() {
		if (reactionObservationEClass == null) {
			reactionObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				35);
		}
		return reactionObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeverityObservation() {
		if (severityObservationEClass == null) {
			severityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				36);
		}
		return severityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyStatusObservation() {
		if (allergyStatusObservationEClass == null) {
			allergyStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				50);
		}
		return allergyStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgeObservation() {
		if (ageObservationEClass == null) {
			ageObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				51);
		}
		return ageObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthStatusObservation() {
		if (healthStatusObservationEClass == null) {
			healthStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				52);
		}
		return healthStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		if (commentEClass == null) {
			commentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				53);
		}
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationActivity() {
		if (medicationActivityEClass == null) {
			medicationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				40);
		}
		return medicationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonMedicinalSupplyActivity() {
		if (nonMedicinalSupplyActivityEClass == null) {
			nonMedicinalSupplyActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				56);
		}
		return nonMedicinalSupplyActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstance() {
		if (productInstanceEClass == null) {
			productInstanceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				47);
		}
		return productInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstance_ScopingEntity() {
		if (productInstance_ScopingEntityEClass == null) {
			productInstance_ScopingEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				48);
		}
		return productInstance_ScopingEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstance_PlayingDevice() {
		if (productInstance_PlayingDeviceEClass == null) {
			productInstance_PlayingDeviceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				49);
		}
		return productInstance_PlayingDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructions() {
		if (instructionsEClass == null) {
			instructionsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				43);
		}
		return instructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndication() {
		if (indicationEClass == null) {
			indicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				38);
		}
		return indicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispense() {
		if (medicationDispenseEClass == null) {
			medicationDispenseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				44);
		}
		return medicationDispenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispense_Product() {
		if (medicationDispense_ProductEClass == null) {
			medicationDispense_ProductEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				45);
		}
		return medicationDispense_ProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationSupplyOrder() {
		if (medicationSupplyOrderEClass == null) {
			medicationSupplyOrderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				41);
		}
		return medicationSupplyOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationSupplyOrder_Product() {
		if (medicationSupplyOrder_ProductEClass == null) {
			medicationSupplyOrder_ProductEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				42);
		}
		return medicationSupplyOrder_ProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrugVehicle() {
		if (drugVehicleEClass == null) {
			drugVehicleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				46);
		}
		return drugVehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalReference() {
		if (internalReferenceEClass == null) {
			internalReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				54);
		}
		return internalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationType() {
		if (medicationTypeEClass == null) {
			medicationTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				55);
		}
		return medicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationFullfillmentInstructions() {
		if (medicationFullfillmentInstructionsEClass == null) {
			medicationFullfillmentInstructionsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(57);
		}
		return medicationFullfillmentInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemConcernAct() {
		if (problemConcernActEClass == null) {
			problemConcernActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				58);
		}
		return problemConcernActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemObservation() {
		if (problemObservationEClass == null) {
			problemObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				59);
		}
		return problemObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemStatus() {
		if (problemStatusEClass == null) {
			problemStatusEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				60);
		}
		return problemStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuityOfCareDocument() {
		if (continuityOfCareDocumentEClass == null) {
			continuityOfCareDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				61);
		}
		return continuityOfCareDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuityOfCareDocument_DocumentationOf() {
		if (continuityOfCareDocument_DocumentationOfEClass == null) {
			continuityOfCareDocument_DocumentationOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(62);
		}
		return continuityOfCareDocument_DocumentationOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationOf_ServiceEvent3() {
		if (documentationOf_ServiceEvent3EClass == null) {
			documentationOf_ServiceEvent3EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				63);
		}
		return documentationOf_ServiceEvent3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceEvent3_Performer() {
		if (serviceEvent3_PerformerEClass == null) {
			serviceEvent3_PerformerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				64);
		}
		return serviceEvent3_PerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformer_AssignedEntity() {
		if (performer_AssignedEntityEClass == null) {
			performer_AssignedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				65);
		}
		return performer_AssignedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuityOfCareDocument_Author() {
		if (continuityOfCareDocument_AuthorEClass == null) {
			continuityOfCareDocument_AuthorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(66);
		}
		return continuityOfCareDocument_AuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthor_AssignedAuthor3() {
		if (author_AssignedAuthor3EClass == null) {
			author_AssignedAuthor3EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				67);
		}
		return author_AssignedAuthor3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectivesSectionEntriesOptional() {
		if (advanceDirectivesSectionEntriesOptionalEClass == null) {
			advanceDirectivesSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(83);
		}
		return advanceDirectivesSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergiesSection() {
		if (allergiesSectionEClass == null) {
			allergiesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				68);
		}
		return allergiesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergiesSectionEntriesOptional() {
		if (allergiesSectionEntriesOptionalEClass == null) {
			allergiesSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(69);
		}
		return allergiesSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersSectionEntriesOptional() {
		if (encountersSectionEntriesOptionalEClass == null) {
			encountersSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(92);
		}
		return encountersSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationsSectionEntriesOptional() {
		if (immunizationsSectionEntriesOptionalEClass == null) {
			immunizationsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(99);
		}
		return immunizationsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayersSection() {
		if (payersSectionEClass == null) {
			payersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				103);
		}
		return payersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverageActivity() {
		if (coverageActivityEClass == null) {
			coverageActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				104);
		}
		return coverageActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyActivity() {
		if (policyActivityEClass == null) {
			policyActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				105);
		}
		return policyActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationActivity() {
		if (authorizationActivityEClass == null) {
			authorizationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				106);
		}
		return authorizationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsSection() {
		if (medicationsSectionEClass == null) {
			medicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				70);
		}
		return medicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsSectionEntriesOptional() {
		if (medicationsSectionEntriesOptionalEClass == null) {
			medicationsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(71);
		}
		return medicationsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareSection() {
		if (planOfCareSectionEClass == null) {
			planOfCareSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				107);
		}
		return planOfCareSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityAct() {
		if (planOfCareActivityActEClass == null) {
			planOfCareActivityActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				108);
		}
		return planOfCareActivityActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityEncounter() {
		if (planOfCareActivityEncounterEClass == null) {
			planOfCareActivityEncounterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				109);
		}
		return planOfCareActivityEncounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityObservation() {
		if (planOfCareActivityObservationEClass == null) {
			planOfCareActivityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				110);
		}
		return planOfCareActivityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityProcedure() {
		if (planOfCareActivityProcedureEClass == null) {
			planOfCareActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				111);
		}
		return planOfCareActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivitySubstanceAdministration() {
		if (planOfCareActivitySubstanceAdministrationEClass == null) {
			planOfCareActivitySubstanceAdministrationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(112);
		}
		return planOfCareActivitySubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivitySupply() {
		if (planOfCareActivitySupplyEClass == null) {
			planOfCareActivitySupplyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				113);
		}
		return planOfCareActivitySupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProceduresSection() {
		if (proceduresSectionEClass == null) {
			proceduresSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				74);
		}
		return proceduresSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProceduresSectionEntriesOptional() {
		if (proceduresSectionEntriesOptionalEClass == null) {
			proceduresSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(75);
		}
		return proceduresSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivityObservation() {
		if (procedureActivityObservationEClass == null) {
			procedureActivityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				76);
		}
		return procedureActivityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivityAct() {
		if (procedureActivityActEClass == null) {
			procedureActivityActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				77);
		}
		return procedureActivityActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivityProcedure() {
		if (procedureActivityProcedureEClass == null) {
			procedureActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				37);
		}
		return procedureActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsSectionEntriesOptional() {
		if (vitalSignsSectionEntriesOptionalEClass == null) {
			vitalSignsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(118);
		}
		return vitalSignsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistorySection() {
		if (familyHistorySectionEClass == null) {
			familyHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				94);
		}
		return familyHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryOrganizer() {
		if (familyHistoryOrganizerEClass == null) {
			familyHistoryOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				95);
		}
		return familyHistoryOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryObservation() {
		if (familyHistoryObservationEClass == null) {
			familyHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				96);
		}
		return familyHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryDeathObservation() {
		if (familyHistoryDeathObservationEClass == null) {
			familyHistoryDeathObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				97);
		}
		return familyHistoryDeathObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistorySection() {
		if (socialHistorySectionEClass == null) {
			socialHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				114);
		}
		return socialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistoryObservation() {
		if (socialHistoryObservationEClass == null) {
			socialHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				115);
		}
		return socialHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPregnancyObservation() {
		if (pregnancyObservationEClass == null) {
			pregnancyObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				116);
		}
		return pregnancyObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstimatedDateOfDelivery() {
		if (estimatedDateOfDeliveryEClass == null) {
			estimatedDateOfDeliveryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				117);
		}
		return estimatedDateOfDeliveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsSection() {
		if (resultsSectionEClass == null) {
			resultsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				78);
		}
		return resultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsSectionEntriesOptional() {
		if (resultsSectionEntriesOptionalEClass == null) {
			resultsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				79);
		}
		return resultsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultOrganizer() {
		if (resultOrganizerEClass == null) {
			resultOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				80);
		}
		return resultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultObservation() {
		if (resultObservationEClass == null) {
			resultObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				81);
		}
		return resultObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalEquipmentSection() {
		if (medicalEquipmentSectionEClass == null) {
			medicalEquipmentSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				102);
		}
		return medicalEquipmentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalStatusSection() {
		if (functionalStatusSectionEClass == null) {
			functionalStatusSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				98);
		}
		return functionalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemSection() {
		if (problemSectionEClass == null) {
			problemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				72);
		}
		return problemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemSectionEntriesOptional() {
		if (problemSectionEntriesOptionalEClass == null) {
			problemSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				73);
		}
		return problemSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistoryStatusObservation() {
		if (socialHistoryStatusObservationEClass == null) {
			socialHistoryStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(121);
		}
		return socialHistoryStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurposeSection() {
		if (purposeSectionEClass == null) {
			purposeSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				122);
		}
		return purposeSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurposeActivity() {
		if (purposeActivityEClass == null) {
			purposeActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				123);
		}
		return purposeActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectivesSection() {
		if (advanceDirectivesSectionEClass == null) {
			advanceDirectivesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				82);
		}
		return advanceDirectivesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveObservation() {
		if (advanceDirectiveObservationEClass == null) {
			advanceDirectiveObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				84);
		}
		return advanceDirectiveObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveObservation_Reference() {
		if (advanceDirectiveObservation_ReferenceEClass == null) {
			advanceDirectiveObservation_ReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(85);
		}
		return advanceDirectiveObservation_ReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference_ExternalDocument() {
		if (reference_ExternalDocumentEClass == null) {
			reference_ExternalDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				86);
		}
		return reference_ExternalDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveObservation_Custodian() {
		if (advanceDirectiveObservation_CustodianEClass == null) {
			advanceDirectiveObservation_CustodianEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(87);
		}
		return advanceDirectiveObservation_CustodianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustodian_CustodianRole() {
		if (custodian_CustodianRoleEClass == null) {
			custodian_CustodianRoleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				88);
		}
		return custodian_CustodianRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustodianRole_CustodianEntity() {
		if (custodianRole_CustodianEntityEClass == null) {
			custodianRole_CustodianEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				89);
		}
		return custodianRole_CustodianEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveObservation_Verifier() {
		if (advanceDirectiveObservation_VerifierEClass == null) {
			advanceDirectiveObservation_VerifierEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(90);
		}
		return advanceDirectiveObservation_VerifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveVerification() {
		if (advanceDirectiveVerificationEClass == null) {
			advanceDirectiveVerificationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				124);
		}
		return advanceDirectiveVerificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveStatusObservation() {
		if (advanceDirectiveStatusObservationEClass == null) {
			advanceDirectiveStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(125);
		}
		return advanceDirectiveStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersSection() {
		if (encountersSectionEClass == null) {
			encountersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				91);
		}
		return encountersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterActivities() {
		if (encounterActivitiesEClass == null) {
			encounterActivitiesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				93);
		}
		return encounterActivitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDeliveryLocation() {
		if (serviceDeliveryLocationEClass == null) {
			serviceDeliveryLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				39);
		}
		return serviceDeliveryLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounter() {
		if (encounterEClass == null) {
			encounterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				126);
		}
		return encounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationsSection() {
		if (immunizationsSectionEClass == null) {
			immunizationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				127);
		}
		return immunizationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationActivity() {
		if (immunizationActivityEClass == null) {
			immunizationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				100);
		}
		return immunizationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRefusalReason() {
		if (immunizationRefusalReasonEClass == null) {
			immunizationRefusalReasonEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				101);
		}
		return immunizationRefusalReasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsuranceProvider() {
		if (insuranceProviderEClass == null) {
			insuranceProviderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				128);
		}
		return insuranceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayerEntry() {
		if (payerEntryEClass == null) {
			payerEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				129);
		}
		return payerEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoveredParty() {
		if (coveredPartyEClass == null) {
			coveredPartyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				130);
		}
		return coveredPartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicySubscriber() {
		if (policySubscriberEClass == null) {
			policySubscriberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				131);
		}
		return policySubscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReference() {
		if (externalReferenceEClass == null) {
			externalReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				132);
		}
		return externalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupport() {
		if (supportEClass == null) {
			supportEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				133);
		}
		return supportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsSection() {
		if (vitalSignsSectionEClass == null) {
			vitalSignsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				134);
		}
		return vitalSignsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsOrganizer() {
		if (vitalSignsOrganizerEClass == null) {
			vitalSignsOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				119);
		}
		return vitalSignsOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignObservation() {
		if (vitalSignObservationEClass == null) {
			vitalSignObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				120);
		}
		return vitalSignObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryOfPastIllnessSection() {
		if (historyOfPastIllnessSectionEClass == null) {
			historyOfPastIllnessSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				135);
		}
		return historyOfPastIllnessSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChiefComplaintSection() {
		if (chiefComplaintSectionEClass == null) {
			chiefComplaintSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				136);
		}
		return chiefComplaintSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasonForReferralSection() {
		if (reasonForReferralSectionEClass == null) {
			reasonForReferralSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				137);
		}
		return reasonForReferralSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryOfPresentIllnessSection() {
		if (historyOfPresentIllnessSectionEClass == null) {
			historyOfPresentIllnessSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(138);
		}
		return historyOfPresentIllnessSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalAdmissionDiagnosisSection() {
		if (hospitalAdmissionDiagnosisSectionEClass == null) {
			hospitalAdmissionDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(139);
		}
		return hospitalAdmissionDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargeDiagnosisSection() {
		if (hospitalDischargeDiagnosisSectionEClass == null) {
			hospitalDischargeDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(173);
		}
		return hospitalDischargeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalAdmissionMedicationsSectionEntriesOptional() {
		if (hospitalAdmissionMedicationsSectionEntriesOptionalEClass == null) {
			hospitalAdmissionMedicationsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(140);
		}
		return hospitalAdmissionMedicationsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdmissionMedication() {
		if (admissionMedicationEClass == null) {
			admissionMedicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				141);
		}
		return admissionMedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargeMedicationsSection() {
		if (hospitalDischargeMedicationsSectionEClass == null) {
			hospitalDischargeMedicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(192);
		}
		return hospitalDischargeMedicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargePhysicalSection() {
		if (hospitalDischargePhysicalSectionEClass == null) {
			hospitalDischargePhysicalSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(182);
		}
		return hospitalDischargePhysicalSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChiefComplaintAndReasonForVisitSection() {
		if (chiefComplaintAndReasonForVisitSectionEClass == null) {
			chiefComplaintAndReasonForVisitSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(179);
		}
		return chiefComplaintAndReasonForVisitSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasonForVisitSection() {
		if (reasonForVisitSectionEClass == null) {
			reasonForVisitSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				184);
		}
		return reasonForVisitSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedInformant() {
		if (relatedInformantEClass == null) {
			relatedInformantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				193);
		}
		return relatedInformantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterPerformer() {
		if (encounterPerformerEClass == null) {
			encounterPerformerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				194);
		}
		return encounterPerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterPerformerAssignedEntity() {
		if (encounterPerformerAssignedEntityEClass == null) {
			encounterPerformerAssignedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(195);
		}
		return encounterPerformerAssignedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyObservationParticipant() {
		if (allergyObservationParticipantEClass == null) {
			allergyObservationParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				196);
		}
		return allergyObservationParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyObservationParticipantRole() {
		if (allergyObservationParticipantRoleEClass == null) {
			allergyObservationParticipantRoleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(197);
		}
		return allergyObservationParticipantRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyObservationPlayingEntity() {
		if (allergyObservationPlayingEntityEClass == null) {
			allergyObservationPlayingEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(198);
		}
		return allergyObservationPlayingEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnesthesiaSection() {
		if (anesthesiaSectionEClass == null) {
			anesthesiaSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				199);
		}
		return anesthesiaSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplicationsSection() {
		if (complicationsSectionEClass == null) {
			complicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				200);
		}
		return complicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDICOMObjectCatalogSection() {
		if (dicomObjectCatalogSectionEClass == null) {
			dicomObjectCatalogSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				201);
		}
		return dicomObjectCatalogSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyAct() {
		if (studyActEClass == null) {
			studyActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				202);
		}
		return studyActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeriesAct() {
		if (seriesActEClass == null) {
			seriesActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				203);
		}
		return seriesActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSOPInstanceObservation() {
		if (sopInstanceObservationEClass == null) {
			sopInstanceObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				204);
		}
		return sopInstanceObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurposeofReferenceObservation() {
		if (purposeofReferenceObservationEClass == null) {
			purposeofReferenceObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				205);
		}
		return purposeofReferenceObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencedFramesObservation() {
		if (referencedFramesObservationEClass == null) {
			referencedFramesObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				206);
		}
		return referencedFramesObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundaryObservation() {
		if (boundaryObservationEClass == null) {
			boundaryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				207);
		}
		return boundaryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindingsSection() {
		if (findingsSectionEClass == null) {
			findingsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				208);
		}
		return findingsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalConsultationsSection() {
		if (hospitalConsultationsSectionEClass == null) {
			hospitalConsultationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				180);
		}
		return hospitalConsultationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterventionsSection() {
		if (interventionsSectionEClass == null) {
			interventionsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				209);
		}
		return interventionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalHistorySection() {
		if (medicalHistorySectionEClass == null) {
			medicalHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				210);
		}
		return medicalHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveSection() {
		if (objectiveSectionEClass == null) {
			objectiveSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				211);
		}
		return objectiveSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperativeNoteFluidSection() {
		if (operativeNoteFluidSectionEClass == null) {
			operativeNoteFluidSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				212);
		}
		return operativeNoteFluidSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperativeNoteSurgicalProcedureSection() {
		if (operativeNoteSurgicalProcedureSectionEClass == null) {
			operativeNoteSurgicalProcedureSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(213);
		}
		return operativeNoteSurgicalProcedureSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlannedProcedureSection() {
		if (plannedProcedureSectionEClass == null) {
			plannedProcedureSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				214);
		}
		return plannedProcedureSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostoperativeDiagnosisSection() {
		if (postoperativeDiagnosisSectionEClass == null) {
			postoperativeDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				215);
		}
		return postoperativeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostprocedureDiagnosisSection() {
		if (postprocedureDiagnosisSectionEClass == null) {
			postprocedureDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				216);
		}
		return postprocedureDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostprocedureDiagnosis() {
		if (postprocedureDiagnosisEClass == null) {
			postprocedureDiagnosisEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				217);
		}
		return postprocedureDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreoperativeDiagnosisSection() {
		if (preoperativeDiagnosisSectionEClass == null) {
			preoperativeDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				218);
		}
		return preoperativeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureDescriptionSection() {
		if (procedureDescriptionSectionEClass == null) {
			procedureDescriptionSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				219);
		}
		return procedureDescriptionSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureDispositionSection() {
		if (procedureDispositionSectionEClass == null) {
			procedureDispositionSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				220);
		}
		return procedureDispositionSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureEstimatedBloodLossSection() {
		if (procedureEstimatedBloodLossSectionEClass == null) {
			procedureEstimatedBloodLossSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(221);
		}
		return procedureEstimatedBloodLossSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureFindingsSection() {
		if (procedureFindingsSectionEClass == null) {
			procedureFindingsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				222);
		}
		return procedureFindingsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureImplantsSection() {
		if (procedureImplantsSectionEClass == null) {
			procedureImplantsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				223);
		}
		return procedureImplantsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureIndicationsSection() {
		if (procedureIndicationsSectionEClass == null) {
			procedureIndicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				224);
		}
		return procedureIndicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureSpecimensTakenSection() {
		if (procedureSpecimensTakenSectionEClass == null) {
			procedureSpecimensTakenSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(225);
		}
		return procedureSpecimensTakenSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectiveSection() {
		if (subjectiveSectionEClass == null) {
			subjectiveSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				226);
		}
		return subjectiveSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsultationNote() {
		if (consultationNoteEClass == null) {
			consultationNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				227);
		}
		return consultationNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsultationNote_ComponentOf() {
		if (consultationNote_ComponentOfEClass == null) {
			consultationNote_ComponentOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				228);
		}
		return consultationNote_ComponentOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentOf_EncompassingEncounter2() {
		if (componentOf_EncompassingEncounter2EClass == null) {
			componentOf_EncompassingEncounter2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(229);
		}
		return componentOf_EncompassingEncounter2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncompassingEncounter2_ResponsibleParty() {
		if (encompassingEncounter2_ResponsiblePartyEClass == null) {
			encompassingEncounter2_ResponsiblePartyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(230);
		}
		return encompassingEncounter2_ResponsiblePartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncompassingEncounter2_EncounterParticipant() {
		if (encompassingEncounter2_EncounterParticipantEClass == null) {
			encompassingEncounter2_EncounterParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(231);
		}
		return encompassingEncounter2_EncounterParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentSection() {
		if (assessmentSectionEClass == null) {
			assessmentSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				232);
		}
		return assessmentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryAndPhysicalNote() {
		if (historyAndPhysicalNoteEClass == null) {
			historyAndPhysicalNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				233);
		}
		return historyAndPhysicalNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryAndPhysicalNote_ComponentOf() {
		if (historyAndPhysicalNote_ComponentOfEClass == null) {
			historyAndPhysicalNote_ComponentOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(234);
		}
		return historyAndPhysicalNote_ComponentOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentOf_EncompassingEncounter4() {
		if (componentOf_EncompassingEncounter4EClass == null) {
			componentOf_EncompassingEncounter4EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(235);
		}
		return componentOf_EncompassingEncounter4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncompassingEncounter4_ResponsibleParty() {
		if (encompassingEncounter4_ResponsiblePartyEClass == null) {
			encompassingEncounter4_ResponsiblePartyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(236);
		}
		return encompassingEncounter4_ResponsiblePartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncompassingEncounter4_EncounterParticipant() {
		if (encompassingEncounter4_EncounterParticipantEClass == null) {
			encompassingEncounter4_EncounterParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(237);
		}
		return encompassingEncounter4_EncounterParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperativeNote() {
		if (operativeNoteEClass == null) {
			operativeNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				238);
		}
		return operativeNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperativeNote_DocumentationOf() {
		if (operativeNote_DocumentationOfEClass == null) {
			operativeNote_DocumentationOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				239);
		}
		return operativeNote_DocumentationOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationOf_ServiceEvent() {
		if (documentationOf_ServiceEventEClass == null) {
			documentationOf_ServiceEventEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				240);
		}
		return documentationOf_ServiceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceEvent_PrimaryPerformer() {
		if (serviceEvent_PrimaryPerformerEClass == null) {
			serviceEvent_PrimaryPerformerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				241);
		}
		return serviceEvent_PrimaryPerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureNote() {
		if (procedureNoteEClass == null) {
			procedureNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				242);
		}
		return procedureNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureNote_ComponentOf() {
		if (procedureNote_ComponentOfEClass == null) {
			procedureNote_ComponentOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				243);
		}
		return procedureNote_ComponentOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentOf_EncompassingEncounter5() {
		if (componentOf_EncompassingEncounter5EClass == null) {
			componentOf_EncompassingEncounter5EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(244);
		}
		return componentOf_EncompassingEncounter5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncompassingEncounter5_Location() {
		if (encompassingEncounter5_LocationEClass == null) {
			encompassingEncounter5_LocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(245);
		}
		return encompassingEncounter5_LocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation_HealthCareFacility() {
		if (location_HealthCareFacilityEClass == null) {
			location_HealthCareFacilityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				246);
		}
		return location_HealthCareFacilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncompassingEncounter5_EncounterParticipant() {
		if (encompassingEncounter5_EncounterParticipantEClass == null) {
			encompassingEncounter5_EncounterParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(247);
		}
		return encompassingEncounter5_EncounterParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureNote_Individual() {
		if (procedureNote_IndividualEClass == null) {
			procedureNote_IndividualEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				248);
		}
		return procedureNote_IndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureNote_PrimaryCarePhysician() {
		if (procedureNote_PrimaryCarePhysicianEClass == null) {
			procedureNote_PrimaryCarePhysicianEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(249);
		}
		return procedureNote_PrimaryCarePhysicianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureNote_Provider() {
		if (procedureNote_ProviderEClass == null) {
			procedureNote_ProviderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				250);
		}
		return procedureNote_ProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider_AssociatedEntity() {
		if (provider_AssociatedEntityEClass == null) {
			provider_AssociatedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				251);
		}
		return provider_AssociatedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureNote_DocumentationOf() {
		if (procedureNote_DocumentationOfEClass == null) {
			procedureNote_DocumentationOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				252);
		}
		return procedureNote_DocumentationOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationOf_ServiceEvent1() {
		if (documentationOf_ServiceEvent1EClass == null) {
			documentationOf_ServiceEvent1EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				253);
		}
		return documentationOf_ServiceEvent1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceEvent1_PrimaryPerformer() {
		if (serviceEvent1_PrimaryPerformerEClass == null) {
			serviceEvent1_PrimaryPerformerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(254);
		}
		return serviceEvent1_PrimaryPerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressNote() {
		if (progressNoteEClass == null) {
			progressNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				255);
		}
		return progressNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressNote_DocumentationOf() {
		if (progressNote_DocumentationOfEClass == null) {
			progressNote_DocumentationOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				256);
		}
		return progressNote_DocumentationOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationOf_ServiceEvent2() {
		if (documentationOf_ServiceEvent2EClass == null) {
			documentationOf_ServiceEvent2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				257);
		}
		return documentationOf_ServiceEvent2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressNote_ComponentOf() {
		if (progressNote_ComponentOfEClass == null) {
			progressNote_ComponentOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				258);
		}
		return progressNote_ComponentOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentOf_EncompassingEncounter6() {
		if (componentOf_EncompassingEncounter6EClass == null) {
			componentOf_EncompassingEncounter6EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(259);
		}
		return componentOf_EncompassingEncounter6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncompassingEncounter6_Location() {
		if (encompassingEncounter6_LocationEClass == null) {
			encompassingEncounter6_LocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(260);
		}
		return encompassingEncounter6_LocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation_HealthCareFacility1() {
		if (location_HealthCareFacility1EClass == null) {
			location_HealthCareFacility1EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				261);
		}
		return location_HealthCareFacility1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreoperativeDiagnosis() {
		if (preoperativeDiagnosisEClass == null) {
			preoperativeDiagnosisEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				262);
		}
		return preoperativeDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionsSection() {
		if (instructionsSectionEClass == null) {
			instructionsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				263);
		}
		return instructionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalAdmissionDiagnosis() {
		if (hospitalAdmissionDiagnosisEClass == null) {
			hospitalAdmissionDiagnosisEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				264);
		}
		return hospitalAdmissionDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispenseAssignedEntity() {
		if (medicationDispenseAssignedEntityEClass == null) {
			medicationDispenseAssignedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(265);
		}
		return medicationDispenseAssignedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationMedicationInformationManufacturedMaterial() {
		if (immunizationMedicationInformationManufacturedMaterialEClass == null) {
			immunizationMedicationInformationManufacturedMaterialEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(266);
		}
		return immunizationMedicationInformationManufacturedMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticImagingReport() {
		if (diagnosticImagingReportEClass == null) {
			diagnosticImagingReportEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				267);
		}
		return diagnosticImagingReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticImagingReport_Participant() {
		if (diagnosticImagingReport_ParticipantEClass == null) {
			diagnosticImagingReport_ParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(268);
		}
		return diagnosticImagingReport_ParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant_AssociatedEntity() {
		if (participant_AssociatedEntityEClass == null) {
			participant_AssociatedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				269);
		}
		return participant_AssociatedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociatedEntity_Person() {
		if (associatedEntity_PersonEClass == null) {
			associatedEntity_PersonEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				270);
		}
		return associatedEntity_PersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticImagingReport_InFulfillmentOf() {
		if (diagnosticImagingReport_InFulfillmentOfEClass == null) {
			diagnosticImagingReport_InFulfillmentOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(271);
		}
		return diagnosticImagingReport_InFulfillmentOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticImagingReport_DocumentationOf() {
		if (diagnosticImagingReport_DocumentationOfEClass == null) {
			diagnosticImagingReport_DocumentationOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(272);
		}
		return diagnosticImagingReport_DocumentationOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationOf_ServiceEvent4() {
		if (documentationOf_ServiceEvent4EClass == null) {
			documentationOf_ServiceEvent4EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				273);
		}
		return documentationOf_ServiceEvent4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticImagingReport_RelatedDocument() {
		if (diagnosticImagingReport_RelatedDocumentEClass == null) {
			diagnosticImagingReport_RelatedDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(274);
		}
		return diagnosticImagingReport_RelatedDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticImagingReport_ComponentOf() {
		if (diagnosticImagingReport_ComponentOfEClass == null) {
			diagnosticImagingReport_ComponentOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(275);
		}
		return diagnosticImagingReport_ComponentOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentOf_EncompassingEncounter7() {
		if (componentOf_EncompassingEncounter7EClass == null) {
			componentOf_EncompassingEncounter7EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(276);
		}
		return componentOf_EncompassingEncounter7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncompassingEncounter7_ResponsibleParty() {
		if (encompassingEncounter7_ResponsiblePartyEClass == null) {
			encompassingEncounter7_ResponsiblePartyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(277);
		}
		return encompassingEncounter7_ResponsiblePartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsibleParty_AssignedEntity() {
		if (responsibleParty_AssignedEntityEClass == null) {
			responsibleParty_AssignedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(278);
		}
		return responsibleParty_AssignedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicianReadingStudyPerformer() {
		if (physicianReadingStudyPerformerEClass == null) {
			physicianReadingStudyPerformerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(279);
		}
		return physicianReadingStudyPerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicianReadingStudyPerformer_AssignedEntity() {
		if (physicianReadingStudyPerformer_AssignedEntityEClass == null) {
			physicianReadingStudyPerformer_AssignedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(280);
		}
		return physicianReadingStudyPerformer_AssignedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicianofRecordParticipant() {
		if (physicianofRecordParticipantEClass == null) {
			physicianofRecordParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				281);
		}
		return physicianofRecordParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicianofRecordParticipant_AssignedEntity() {
		if (physicianofRecordParticipant_AssignedEntityEClass == null) {
			physicianofRecordParticipant_AssignedEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(282);
		}
		return physicianofRecordParticipant_AssignedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignedEntity_AssignedPerson() {
		if (assignedEntity_AssignedPersonEClass == null) {
			assignedEntity_AssignedPersonEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				283);
		}
		return assignedEntity_AssignedPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextObservation() {
		if (textObservationEClass == null) {
			textObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				284);
		}
		return textObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityMeasurementObservation() {
		if (quantityMeasurementObservationEClass == null) {
			quantityMeasurementObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(285);
		}
		return quantityMeasurementObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeObservations() {
		if (codeObservationsEClass == null) {
			codeObservationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				286);
		}
		return codeObservationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureContext() {
		if (procedureContextEClass == null) {
			procedureContextEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				287);
		}
		return procedureContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsAdministeredSection() {
		if (medicationsAdministeredSectionEClass == null) {
			medicationsAdministeredSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(142);
		}
		return medicationsAdministeredSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalExamSection() {
		if (physicalExamSectionEClass == null) {
			physicalExamSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				143);
		}
		return physicalExamSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralStatusSection() {
		if (generalStatusSectionEClass == null) {
			generalStatusSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				144);
		}
		return generalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReviewOfSystemsSection() {
		if (reviewOfSystemsSectionEClass == null) {
			reviewOfSystemsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				145);
		}
		return reviewOfSystemsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalCourseSection() {
		if (hospitalCourseSectionEClass == null) {
			hospitalCourseSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				178);
		}
		return hospitalCourseSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentAndPlanSection() {
		if (assessmentAndPlanSectionEClass == null) {
			assessmentAndPlanSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				146);
		}
		return assessmentAndPlanSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageSpoken() {
		if (languageSpokenEClass == null) {
			languageSpokenEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				147);
		}
		return languageSpokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareProvider() {
		if (healthcareProviderEClass == null) {
			healthcareProviderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				148);
		}
		return healthcareProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportGuardian() {
		if (supportGuardianEClass == null) {
			supportGuardianEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				149);
		}
		return supportGuardianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportParticipant() {
		if (supportParticipantEClass == null) {
			supportParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				150);
		}
		return supportParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurgicalDrainsSection() {
		if (surgicalDrainsSectionEClass == null) {
			surgicalDrainsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				151);
		}
		return surgicalDrainsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredDocument() {
		if (unstructuredDocumentEClass == null) {
			unstructuredDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				152);
		}
		return unstructuredDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredDocument_RecordTarget() {
		if (unstructuredDocument_RecordTargetEClass == null) {
			unstructuredDocument_RecordTargetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(153);
		}
		return unstructuredDocument_RecordTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordTarget_PatientRole2() {
		if (recordTarget_PatientRole2EClass == null) {
			recordTarget_PatientRole2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				154);
		}
		return recordTarget_PatientRole2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredDocument_Author() {
		if (unstructuredDocument_AuthorEClass == null) {
			unstructuredDocument_AuthorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				155);
		}
		return unstructuredDocument_AuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthor_AssignedAuthor2() {
		if (author_AssignedAuthor2EClass == null) {
			author_AssignedAuthor2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				156);
		}
		return author_AssignedAuthor2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredDocument_Custodian() {
		if (unstructuredDocument_CustodianEClass == null) {
			unstructuredDocument_CustodianEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(157);
		}
		return unstructuredDocument_CustodianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustodian_AssignedCustodian3() {
		if (custodian_AssignedCustodian3EClass == null) {
			custodian_AssignedCustodian3EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				158);
		}
		return custodian_AssignedCustodian3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignedCustodian3_CustodianOrganization() {
		if (assignedCustodian3_CustodianOrganizationEClass == null) {
			assignedCustodian3_CustodianOrganizationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(159);
		}
		return assignedCustodian3_CustodianOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredDocument_Component() {
		if (unstructuredDocument_ComponentEClass == null) {
			unstructuredDocument_ComponentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(160);
		}
		return unstructuredDocument_ComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent_NonXMLBody() {
		if (component_NonXMLBodyEClass == null) {
			component_NonXMLBodyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				161);
		}
		return component_NonXMLBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScanOriginalAuthor() {
		if (scanOriginalAuthorEClass == null) {
			scanOriginalAuthorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				162);
		}
		return scanOriginalAuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScanningDevice() {
		if (scanningDeviceEClass == null) {
			scanningDeviceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				163);
		}
		return scanningDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScanDataEnterer() {
		if (scanDataEntererEClass == null) {
			scanDataEntererEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				164);
		}
		return scanDataEntererEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationInformation() {
		if (medicationInformationEClass == null) {
			medicationInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				165);
		}
		return medicationInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredOrScannedDocument() {
		if (unstructuredOrScannedDocumentEClass == null) {
			unstructuredOrScannedDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				166);
		}
		return unstructuredOrScannedDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferralSummary() {
		if (referralSummaryEClass == null) {
			referralSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				167);
		}
		return referralSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeSummary() {
		if (dischargeSummaryEClass == null) {
			dischargeSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				168);
		}
		return dischargeSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeSummary_ComponentOf() {
		if (dischargeSummary_ComponentOfEClass == null) {
			dischargeSummary_ComponentOfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				169);
		}
		return dischargeSummary_ComponentOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentOf_EncompassingEncounter3() {
		if (componentOf_EncompassingEncounter3EClass == null) {
			componentOf_EncompassingEncounter3EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(170);
		}
		return componentOf_EncompassingEncounter3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncompassingEncounter3_ResponsibleParty() {
		if (encompassingEncounter3_ResponsiblePartyEClass == null) {
			encompassingEncounter3_ResponsiblePartyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(171);
		}
		return encompassingEncounter3_ResponsiblePartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncompassingEncounter3_EncounterParticipant() {
		if (encompassingEncounter3_EncounterParticipantEClass == null) {
			encompassingEncounter3_EncounterParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(172);
		}
		return encompassingEncounter3_EncounterParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeDietSection() {
		if (dischargeDietSectionEClass == null) {
			dischargeDietSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				175);
		}
		return dischargeDietSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargeMedicationsSectionEntriesOptional() {
		if (hospitalDischargeMedicationsSectionEntriesOptionalEClass == null) {
			hospitalDischargeMedicationsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(176);
		}
		return hospitalDischargeMedicationsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreconditionForSubstanceAdministration() {
		if (preconditionForSubstanceAdministrationEClass == null) {
			preconditionForSubstanceAdministrationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(185);
		}
		return preconditionForSubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationMedicationInformation() {
		if (immunizationMedicationInformationEClass == null) {
			immunizationMedicationInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(186);
		}
		return immunizationMedicationInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureSpecimen() {
		if (procedureSpecimenEClass == null) {
			procedureSpecimenEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				187);
		}
		return procedureSpecimenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedurePerformer() {
		if (procedurePerformerEClass == null) {
			procedurePerformerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				188);
		}
		return procedurePerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureEncounter() {
		if (procedureEncounterEClass == null) {
			procedureEncounterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				189);
		}
		return procedureEncounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationInformationManufacturedMaterial() {
		if (medicationInformationManufacturedMaterialEClass == null) {
			medicationInformationManufacturedMaterialEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(190);
		}
		return medicationInformationManufacturedMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistorySubject() {
		if (familyHistorySubjectEClass == null) {
			familyHistorySubjectEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				191);
		}
		return familyHistorySubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargeStudiesSummarySection() {
		if (hospitalDischargeStudiesSummarySectionEClass == null) {
			hospitalDischargeStudiesSummarySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(183);
		}
		return hospitalDischargeStudiesSummarySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeMedication() {
		if (dischargeMedicationEClass == null) {
			dischargeMedicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				177);
		}
		return dischargeMedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargeDiagnosis() {
		if (hospitalDischargeDiagnosisEClass == null) {
			hospitalDischargeDiagnosisEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				174);
		}
		return hospitalDischargeDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargeInstructionsSection() {
		if (hospitalDischargeInstructionsSectionEClass == null) {
			hospitalDischargeInstructionsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(181);
		}
		return hospitalDischargeInstructionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolFactory getConsolFactory() {
		return (ConsolFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) {
			return;
		}
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) {
			return;
		}
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.openhealthtools.mdht.uml.cda.consol." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} // ConsolPackageImpl
