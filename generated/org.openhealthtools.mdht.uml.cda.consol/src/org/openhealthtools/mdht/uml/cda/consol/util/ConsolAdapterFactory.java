/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.AssociatedEntity;
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.Birthplace;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.Device;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.ExternalDocument;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.HealthCareFacility;
import org.openhealthtools.mdht.uml.cda.InFulfillmentOf;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.IntendedRecipient;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.Location;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.NonXMLBody;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Order;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.Place;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Product;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.RelatedDocument;
import org.openhealthtools.mdht.uml.cda.RelatedEntity;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.Subject;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;

import org.openhealthtools.mdht.uml.cda.consol.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;
import org.openhealthtools.mdht.uml.hl7.rim.Entity;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage
 * @generated
 */
public class ConsolAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConsolPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConsolPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsolSwitch<Adapter> modelSwitch = new ConsolSwitch<Adapter>() {
			@Override
			public Adapter caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
				return createGeneralHeaderConstraintsAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints_RecordTarget(GeneralHeaderConstraints_RecordTarget object) {
				return createGeneralHeaderConstraints_RecordTargetAdapter();
			}
			@Override
			public Adapter caseRecordTarget_PatientRole(RecordTarget_PatientRole object) {
				return createRecordTarget_PatientRoleAdapter();
			}
			@Override
			public Adapter casePatientRole_Patient(PatientRole_Patient object) {
				return createPatientRole_PatientAdapter();
			}
			@Override
			public Adapter casePatient_Guardian(Patient_Guardian object) {
				return createPatient_GuardianAdapter();
			}
			@Override
			public Adapter casePatient_LanguageCommunication(Patient_LanguageCommunication object) {
				return createPatient_LanguageCommunicationAdapter();
			}
			@Override
			public Adapter casePatient_Birthplace(Patient_Birthplace object) {
				return createPatient_BirthplaceAdapter();
			}
			@Override
			public Adapter caseBirthplace_Place(Birthplace_Place object) {
				return createBirthplace_PlaceAdapter();
			}
			@Override
			public Adapter casePatientRole_ProviderOrganization(PatientRole_ProviderOrganization object) {
				return createPatientRole_ProviderOrganizationAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints_ComponentOf(GeneralHeaderConstraints_ComponentOf object) {
				return createGeneralHeaderConstraints_ComponentOfAdapter();
			}
			@Override
			public Adapter caseComponentOf_EncompassingEncounter(ComponentOf_EncompassingEncounter object) {
				return createComponentOf_EncompassingEncounterAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints_Author(GeneralHeaderConstraints_Author object) {
				return createGeneralHeaderConstraints_AuthorAdapter();
			}
			@Override
			public Adapter caseAuthor_AssignedAuthor(Author_AssignedAuthor object) {
				return createAuthor_AssignedAuthorAdapter();
			}
			@Override
			public Adapter caseAssignedAuthor_AuthoringDevice(AssignedAuthor_AuthoringDevice object) {
				return createAssignedAuthor_AuthoringDeviceAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints_Person(GeneralHeaderConstraints_Person object) {
				return createGeneralHeaderConstraints_PersonAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints_DataEnterer(GeneralHeaderConstraints_DataEnterer object) {
				return createGeneralHeaderConstraints_DataEntererAdapter();
			}
			@Override
			public Adapter caseDataEnterer_AssignedEntity(DataEnterer_AssignedEntity object) {
				return createDataEnterer_AssignedEntityAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints_Custodian(GeneralHeaderConstraints_Custodian object) {
				return createGeneralHeaderConstraints_CustodianAdapter();
			}
			@Override
			public Adapter caseCustodian_AssignedCustodian(Custodian_AssignedCustodian object) {
				return createCustodian_AssignedCustodianAdapter();
			}
			@Override
			public Adapter caseAssignedCustodian_CustodianOrganization(AssignedCustodian_CustodianOrganization object) {
				return createAssignedCustodian_CustodianOrganizationAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints_InformationRecipient(GeneralHeaderConstraints_InformationRecipient object) {
				return createGeneralHeaderConstraints_InformationRecipientAdapter();
			}
			@Override
			public Adapter caseInformationRecipient_IntendedRecipient(InformationRecipient_IntendedRecipient object) {
				return createInformationRecipient_IntendedRecipientAdapter();
			}
			@Override
			public Adapter caseIntendedRecipient_Organization(IntendedRecipient_Organization object) {
				return createIntendedRecipient_OrganizationAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints_LegalAuthenticator(GeneralHeaderConstraints_LegalAuthenticator object) {
				return createGeneralHeaderConstraints_LegalAuthenticatorAdapter();
			}
			@Override
			public Adapter caseLegalAuthenticator_AssignedEntity(LegalAuthenticator_AssignedEntity object) {
				return createLegalAuthenticator_AssignedEntityAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints_Authenticator(GeneralHeaderConstraints_Authenticator object) {
				return createGeneralHeaderConstraints_AuthenticatorAdapter();
			}
			@Override
			public Adapter caseAuthenticator_AssignedEntity(Authenticator_AssignedEntity object) {
				return createAuthenticator_AssignedEntityAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints_Informant(GeneralHeaderConstraints_Informant object) {
				return createGeneralHeaderConstraints_InformantAdapter();
			}
			@Override
			public Adapter caseInformant_AssignedEntity(Informant_AssignedEntity object) {
				return createInformant_AssignedEntityAdapter();
			}
			@Override
			public Adapter caseInformant_RelatedEntity(Informant_RelatedEntity object) {
				return createInformant_RelatedEntityAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints_ParticipantSupport(GeneralHeaderConstraints_ParticipantSupport object) {
				return createGeneralHeaderConstraints_ParticipantSupportAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints_InFulfillmentOf(GeneralHeaderConstraints_InFulfillmentOf object) {
				return createGeneralHeaderConstraints_InFulfillmentOfAdapter();
			}
			@Override
			public Adapter caseInFulfillmentOf_Order(InFulfillmentOf_Order object) {
				return createInFulfillmentOf_OrderAdapter();
			}
			@Override
			public Adapter caseAllergyProblemAct(AllergyProblemAct object) {
				return createAllergyProblemActAdapter();
			}
			@Override
			public Adapter caseAllergyObservation(AllergyObservation object) {
				return createAllergyObservationAdapter();
			}
			@Override
			public Adapter caseReactionObservation(ReactionObservation object) {
				return createReactionObservationAdapter();
			}
			@Override
			public Adapter caseSeverityObservation(SeverityObservation object) {
				return createSeverityObservationAdapter();
			}
			@Override
			public Adapter caseProcedureActivityProcedure(ProcedureActivityProcedure object) {
				return createProcedureActivityProcedureAdapter();
			}
			@Override
			public Adapter caseIndication(Indication object) {
				return createIndicationAdapter();
			}
			@Override
			public Adapter caseServiceDeliveryLocation(ServiceDeliveryLocation object) {
				return createServiceDeliveryLocationAdapter();
			}
			@Override
			public Adapter caseMedicationActivity(MedicationActivity object) {
				return createMedicationActivityAdapter();
			}
			@Override
			public Adapter caseMedicationSupplyOrder(MedicationSupplyOrder object) {
				return createMedicationSupplyOrderAdapter();
			}
			@Override
			public Adapter caseMedicationSupplyOrder_Product(MedicationSupplyOrder_Product object) {
				return createMedicationSupplyOrder_ProductAdapter();
			}
			@Override
			public Adapter caseInstructions(Instructions object) {
				return createInstructionsAdapter();
			}
			@Override
			public Adapter caseMedicationDispense(MedicationDispense object) {
				return createMedicationDispenseAdapter();
			}
			@Override
			public Adapter caseMedicationDispense_Product(MedicationDispense_Product object) {
				return createMedicationDispense_ProductAdapter();
			}
			@Override
			public Adapter caseDrugVehicle(DrugVehicle object) {
				return createDrugVehicleAdapter();
			}
			@Override
			public Adapter caseProductInstance(ProductInstance object) {
				return createProductInstanceAdapter();
			}
			@Override
			public Adapter caseProductInstance_ScopingEntity(ProductInstance_ScopingEntity object) {
				return createProductInstance_ScopingEntityAdapter();
			}
			@Override
			public Adapter caseProductInstance_PlayingDevice(ProductInstance_PlayingDevice object) {
				return createProductInstance_PlayingDeviceAdapter();
			}
			@Override
			public Adapter caseAllergyStatusObservation(AllergyStatusObservation object) {
				return createAllergyStatusObservationAdapter();
			}
			@Override
			public Adapter caseAgeObservation(AgeObservation object) {
				return createAgeObservationAdapter();
			}
			@Override
			public Adapter caseHealthStatusObservation(HealthStatusObservation object) {
				return createHealthStatusObservationAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseInternalReference(InternalReference object) {
				return createInternalReferenceAdapter();
			}
			@Override
			public Adapter caseMedicationType(MedicationType object) {
				return createMedicationTypeAdapter();
			}
			@Override
			public Adapter caseNonMedicinalSupplyActivity(NonMedicinalSupplyActivity object) {
				return createNonMedicinalSupplyActivityAdapter();
			}
			@Override
			public Adapter caseMedicationFullfillmentInstructions(MedicationFullfillmentInstructions object) {
				return createMedicationFullfillmentInstructionsAdapter();
			}
			@Override
			public Adapter caseProblemConcernAct(ProblemConcernAct object) {
				return createProblemConcernActAdapter();
			}
			@Override
			public Adapter caseProblemObservation(ProblemObservation object) {
				return createProblemObservationAdapter();
			}
			@Override
			public Adapter caseProblemStatus(ProblemStatus object) {
				return createProblemStatusAdapter();
			}
			@Override
			public Adapter caseContinuityOfCareDocument(ContinuityOfCareDocument object) {
				return createContinuityOfCareDocumentAdapter();
			}
			@Override
			public Adapter caseContinuityOfCareDocument_DocumentationOf(ContinuityOfCareDocument_DocumentationOf object) {
				return createContinuityOfCareDocument_DocumentationOfAdapter();
			}
			@Override
			public Adapter caseDocumentationOf_ServiceEvent3(DocumentationOf_ServiceEvent3 object) {
				return createDocumentationOf_ServiceEvent3Adapter();
			}
			@Override
			public Adapter caseServiceEvent3_Performer(ServiceEvent3_Performer object) {
				return createServiceEvent3_PerformerAdapter();
			}
			@Override
			public Adapter casePerformer_AssignedEntity(Performer_AssignedEntity object) {
				return createPerformer_AssignedEntityAdapter();
			}
			@Override
			public Adapter caseContinuityOfCareDocument_Author(ContinuityOfCareDocument_Author object) {
				return createContinuityOfCareDocument_AuthorAdapter();
			}
			@Override
			public Adapter caseAuthor_AssignedAuthor3(Author_AssignedAuthor3 object) {
				return createAuthor_AssignedAuthor3Adapter();
			}
			@Override
			public Adapter caseAllergiesSection(AllergiesSection object) {
				return createAllergiesSectionAdapter();
			}
			@Override
			public Adapter caseAllergiesSectionEntriesOptional(AllergiesSectionEntriesOptional object) {
				return createAllergiesSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseMedicationsSection(MedicationsSection object) {
				return createMedicationsSectionAdapter();
			}
			@Override
			public Adapter caseMedicationsSectionEntriesOptional(MedicationsSectionEntriesOptional object) {
				return createMedicationsSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseProblemSection(ProblemSection object) {
				return createProblemSectionAdapter();
			}
			@Override
			public Adapter caseProblemSectionEntriesOptional(ProblemSectionEntriesOptional object) {
				return createProblemSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseProceduresSection(ProceduresSection object) {
				return createProceduresSectionAdapter();
			}
			@Override
			public Adapter caseProceduresSectionEntriesOptional(ProceduresSectionEntriesOptional object) {
				return createProceduresSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseProcedureActivityObservation(ProcedureActivityObservation object) {
				return createProcedureActivityObservationAdapter();
			}
			@Override
			public Adapter caseProcedureActivityAct(ProcedureActivityAct object) {
				return createProcedureActivityActAdapter();
			}
			@Override
			public Adapter caseResultsSection(ResultsSection object) {
				return createResultsSectionAdapter();
			}
			@Override
			public Adapter caseResultsSectionEntriesOptional(ResultsSectionEntriesOptional object) {
				return createResultsSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseResultOrganizer(ResultOrganizer object) {
				return createResultOrganizerAdapter();
			}
			@Override
			public Adapter caseResultObservation(ResultObservation object) {
				return createResultObservationAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectivesSection(AdvanceDirectivesSection object) {
				return createAdvanceDirectivesSectionAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectivesSectionEntriesOptional(AdvanceDirectivesSectionEntriesOptional object) {
				return createAdvanceDirectivesSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectiveObservation(AdvanceDirectiveObservation object) {
				return createAdvanceDirectiveObservationAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectiveObservation_Reference(AdvanceDirectiveObservation_Reference object) {
				return createAdvanceDirectiveObservation_ReferenceAdapter();
			}
			@Override
			public Adapter caseReference_ExternalDocument(Reference_ExternalDocument object) {
				return createReference_ExternalDocumentAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectiveObservation_Custodian(AdvanceDirectiveObservation_Custodian object) {
				return createAdvanceDirectiveObservation_CustodianAdapter();
			}
			@Override
			public Adapter caseCustodian_CustodianRole(Custodian_CustodianRole object) {
				return createCustodian_CustodianRoleAdapter();
			}
			@Override
			public Adapter caseCustodianRole_CustodianEntity(CustodianRole_CustodianEntity object) {
				return createCustodianRole_CustodianEntityAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectiveObservation_Verifier(AdvanceDirectiveObservation_Verifier object) {
				return createAdvanceDirectiveObservation_VerifierAdapter();
			}
			@Override
			public Adapter caseEncountersSection(EncountersSection object) {
				return createEncountersSectionAdapter();
			}
			@Override
			public Adapter caseEncountersSectionEntriesOptional(EncountersSectionEntriesOptional object) {
				return createEncountersSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseEncounterActivities(EncounterActivities object) {
				return createEncounterActivitiesAdapter();
			}
			@Override
			public Adapter caseFamilyHistorySection(FamilyHistorySection object) {
				return createFamilyHistorySectionAdapter();
			}
			@Override
			public Adapter caseFamilyHistoryOrganizer(FamilyHistoryOrganizer object) {
				return createFamilyHistoryOrganizerAdapter();
			}
			@Override
			public Adapter caseFamilyHistoryObservation(FamilyHistoryObservation object) {
				return createFamilyHistoryObservationAdapter();
			}
			@Override
			public Adapter caseFamilyHistoryDeathObservation(FamilyHistoryDeathObservation object) {
				return createFamilyHistoryDeathObservationAdapter();
			}
			@Override
			public Adapter caseFunctionalStatusSection(FunctionalStatusSection object) {
				return createFunctionalStatusSectionAdapter();
			}
			@Override
			public Adapter caseImmunizationsSectionEntriesOptional(ImmunizationsSectionEntriesOptional object) {
				return createImmunizationsSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseImmunizationActivity(ImmunizationActivity object) {
				return createImmunizationActivityAdapter();
			}
			@Override
			public Adapter caseImmunizationRefusalReason(ImmunizationRefusalReason object) {
				return createImmunizationRefusalReasonAdapter();
			}
			@Override
			public Adapter caseMedicalEquipmentSection(MedicalEquipmentSection object) {
				return createMedicalEquipmentSectionAdapter();
			}
			@Override
			public Adapter casePayersSection(PayersSection object) {
				return createPayersSectionAdapter();
			}
			@Override
			public Adapter caseCoverageActivity(CoverageActivity object) {
				return createCoverageActivityAdapter();
			}
			@Override
			public Adapter casePolicyActivity(PolicyActivity object) {
				return createPolicyActivityAdapter();
			}
			@Override
			public Adapter casePolicyActivity_Payer(PolicyActivity_Payer object) {
				return createPolicyActivity_PayerAdapter();
			}
			@Override
			public Adapter casePayer_PayerAssignedEntity(Payer_PayerAssignedEntity object) {
				return createPayer_PayerAssignedEntityAdapter();
			}
			@Override
			public Adapter casePayerAssignedEntity_PayerOrganization(PayerAssignedEntity_PayerOrganization object) {
				return createPayerAssignedEntity_PayerOrganizationAdapter();
			}
			@Override
			public Adapter casePolicyActivity_Guarantor(PolicyActivity_Guarantor object) {
				return createPolicyActivity_GuarantorAdapter();
			}
			@Override
			public Adapter caseGuarantor_GuarantorAssignedEntity(Guarantor_GuarantorAssignedEntity object) {
				return createGuarantor_GuarantorAssignedEntityAdapter();
			}
			@Override
			public Adapter caseAuthorizationActivity(AuthorizationActivity object) {
				return createAuthorizationActivityAdapter();
			}
			@Override
			public Adapter casePlanOfCareSection(PlanOfCareSection object) {
				return createPlanOfCareSectionAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivityAct(PlanOfCareActivityAct object) {
				return createPlanOfCareActivityActAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivityEncounter(PlanOfCareActivityEncounter object) {
				return createPlanOfCareActivityEncounterAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivityObservation(PlanOfCareActivityObservation object) {
				return createPlanOfCareActivityObservationAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivityProcedure(PlanOfCareActivityProcedure object) {
				return createPlanOfCareActivityProcedureAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivitySubstanceAdministration(PlanOfCareActivitySubstanceAdministration object) {
				return createPlanOfCareActivitySubstanceAdministrationAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivitySupply(PlanOfCareActivitySupply object) {
				return createPlanOfCareActivitySupplyAdapter();
			}
			@Override
			public Adapter caseSocialHistorySection(SocialHistorySection object) {
				return createSocialHistorySectionAdapter();
			}
			@Override
			public Adapter caseSocialHistoryObservation(SocialHistoryObservation object) {
				return createSocialHistoryObservationAdapter();
			}
			@Override
			public Adapter casePregnancyObservation(PregnancyObservation object) {
				return createPregnancyObservationAdapter();
			}
			@Override
			public Adapter caseEstimatedDateOfDelivery(EstimatedDateOfDelivery object) {
				return createEstimatedDateOfDeliveryAdapter();
			}
			@Override
			public Adapter caseVitalSignsSectionEntriesOptional(VitalSignsSectionEntriesOptional object) {
				return createVitalSignsSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseVitalSignsOrganizer(VitalSignsOrganizer object) {
				return createVitalSignsOrganizerAdapter();
			}
			@Override
			public Adapter caseVitalSignObservation(VitalSignObservation object) {
				return createVitalSignObservationAdapter();
			}
			@Override
			public Adapter caseSocialHistoryStatusObservation(SocialHistoryStatusObservation object) {
				return createSocialHistoryStatusObservationAdapter();
			}
			@Override
			public Adapter casePurposeSection(PurposeSection object) {
				return createPurposeSectionAdapter();
			}
			@Override
			public Adapter casePurposeActivity(PurposeActivity object) {
				return createPurposeActivityAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectiveVerification(AdvanceDirectiveVerification object) {
				return createAdvanceDirectiveVerificationAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectiveStatusObservation(AdvanceDirectiveStatusObservation object) {
				return createAdvanceDirectiveStatusObservationAdapter();
			}
			@Override
			public Adapter caseEncounter(Encounter object) {
				return createEncounterAdapter();
			}
			@Override
			public Adapter caseImmunizationsSection(ImmunizationsSection object) {
				return createImmunizationsSectionAdapter();
			}
			@Override
			public Adapter caseInsuranceProvider(InsuranceProvider object) {
				return createInsuranceProviderAdapter();
			}
			@Override
			public Adapter casePayerEntry(PayerEntry object) {
				return createPayerEntryAdapter();
			}
			@Override
			public Adapter caseCoveredParty(CoveredParty object) {
				return createCoveredPartyAdapter();
			}
			@Override
			public Adapter casePolicySubscriber(PolicySubscriber object) {
				return createPolicySubscriberAdapter();
			}
			@Override
			public Adapter caseExternalReference(ExternalReference object) {
				return createExternalReferenceAdapter();
			}
			@Override
			public Adapter caseSupport(Support object) {
				return createSupportAdapter();
			}
			@Override
			public Adapter caseVitalSignsSection(VitalSignsSection object) {
				return createVitalSignsSectionAdapter();
			}
			@Override
			public Adapter caseHistoryOfPastIllnessSection(HistoryOfPastIllnessSection object) {
				return createHistoryOfPastIllnessSectionAdapter();
			}
			@Override
			public Adapter caseChiefComplaintSection(ChiefComplaintSection object) {
				return createChiefComplaintSectionAdapter();
			}
			@Override
			public Adapter caseReasonForReferralSection(ReasonForReferralSection object) {
				return createReasonForReferralSectionAdapter();
			}
			@Override
			public Adapter caseHistoryOfPresentIllnessSection(HistoryOfPresentIllnessSection object) {
				return createHistoryOfPresentIllnessSectionAdapter();
			}
			@Override
			public Adapter caseHospitalAdmissionDiagnosisSection(HospitalAdmissionDiagnosisSection object) {
				return createHospitalAdmissionDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseHospitalAdmissionMedicationsSectionEntriesOptional(HospitalAdmissionMedicationsSectionEntriesOptional object) {
				return createHospitalAdmissionMedicationsSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseAdmissionMedication(AdmissionMedication object) {
				return createAdmissionMedicationAdapter();
			}
			@Override
			public Adapter caseMedicationsAdministeredSection(MedicationsAdministeredSection object) {
				return createMedicationsAdministeredSectionAdapter();
			}
			@Override
			public Adapter casePhysicalExamSection(PhysicalExamSection object) {
				return createPhysicalExamSectionAdapter();
			}
			@Override
			public Adapter caseGeneralStatusSection(GeneralStatusSection object) {
				return createGeneralStatusSectionAdapter();
			}
			@Override
			public Adapter caseReviewOfSystemsSection(ReviewOfSystemsSection object) {
				return createReviewOfSystemsSectionAdapter();
			}
			@Override
			public Adapter caseAssessmentAndPlanSection(AssessmentAndPlanSection object) {
				return createAssessmentAndPlanSectionAdapter();
			}
			@Override
			public Adapter caseLanguageSpoken(LanguageSpoken object) {
				return createLanguageSpokenAdapter();
			}
			@Override
			public Adapter caseHealthcareProvider(HealthcareProvider object) {
				return createHealthcareProviderAdapter();
			}
			@Override
			public Adapter caseSupportGuardian(SupportGuardian object) {
				return createSupportGuardianAdapter();
			}
			@Override
			public Adapter caseSupportParticipant(SupportParticipant object) {
				return createSupportParticipantAdapter();
			}
			@Override
			public Adapter caseSurgicalDrainsSection(SurgicalDrainsSection object) {
				return createSurgicalDrainsSectionAdapter();
			}
			@Override
			public Adapter caseUnstructuredDocument(UnstructuredDocument object) {
				return createUnstructuredDocumentAdapter();
			}
			@Override
			public Adapter caseUnstructuredDocument_RecordTarget(UnstructuredDocument_RecordTarget object) {
				return createUnstructuredDocument_RecordTargetAdapter();
			}
			@Override
			public Adapter caseRecordTarget_PatientRole2(RecordTarget_PatientRole2 object) {
				return createRecordTarget_PatientRole2Adapter();
			}
			@Override
			public Adapter caseUnstructuredDocument_Author(UnstructuredDocument_Author object) {
				return createUnstructuredDocument_AuthorAdapter();
			}
			@Override
			public Adapter caseAuthor_AssignedAuthor2(Author_AssignedAuthor2 object) {
				return createAuthor_AssignedAuthor2Adapter();
			}
			@Override
			public Adapter caseUnstructuredDocument_Custodian(UnstructuredDocument_Custodian object) {
				return createUnstructuredDocument_CustodianAdapter();
			}
			@Override
			public Adapter caseCustodian_AssignedCustodian3(Custodian_AssignedCustodian3 object) {
				return createCustodian_AssignedCustodian3Adapter();
			}
			@Override
			public Adapter caseAssignedCustodian3_CustodianOrganization(AssignedCustodian3_CustodianOrganization object) {
				return createAssignedCustodian3_CustodianOrganizationAdapter();
			}
			@Override
			public Adapter caseUnstructuredDocument_Component(UnstructuredDocument_Component object) {
				return createUnstructuredDocument_ComponentAdapter();
			}
			@Override
			public Adapter caseComponent_NonXMLBody(Component_NonXMLBody object) {
				return createComponent_NonXMLBodyAdapter();
			}
			@Override
			public Adapter caseScanOriginalAuthor(ScanOriginalAuthor object) {
				return createScanOriginalAuthorAdapter();
			}
			@Override
			public Adapter caseScanningDevice(ScanningDevice object) {
				return createScanningDeviceAdapter();
			}
			@Override
			public Adapter caseScanDataEnterer(ScanDataEnterer object) {
				return createScanDataEntererAdapter();
			}
			@Override
			public Adapter caseMedicationInformation(MedicationInformation object) {
				return createMedicationInformationAdapter();
			}
			@Override
			public Adapter caseUnstructuredOrScannedDocument(UnstructuredOrScannedDocument object) {
				return createUnstructuredOrScannedDocumentAdapter();
			}
			@Override
			public Adapter caseReferralSummary(ReferralSummary object) {
				return createReferralSummaryAdapter();
			}
			@Override
			public Adapter caseDischargeSummary(DischargeSummary object) {
				return createDischargeSummaryAdapter();
			}
			@Override
			public Adapter caseDischargeSummary_ComponentOf(DischargeSummary_ComponentOf object) {
				return createDischargeSummary_ComponentOfAdapter();
			}
			@Override
			public Adapter caseComponentOf_EncompassingEncounter3(ComponentOf_EncompassingEncounter3 object) {
				return createComponentOf_EncompassingEncounter3Adapter();
			}
			@Override
			public Adapter caseEncompassingEncounter3_ResponsibleParty(EncompassingEncounter3_ResponsibleParty object) {
				return createEncompassingEncounter3_ResponsiblePartyAdapter();
			}
			@Override
			public Adapter caseEncompassingEncounter3_EncounterParticipant(EncompassingEncounter3_EncounterParticipant object) {
				return createEncompassingEncounter3_EncounterParticipantAdapter();
			}
			@Override
			public Adapter caseHospitalDischargeDiagnosisSection(HospitalDischargeDiagnosisSection object) {
				return createHospitalDischargeDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseHospitalDischargeDiagnosis(HospitalDischargeDiagnosis object) {
				return createHospitalDischargeDiagnosisAdapter();
			}
			@Override
			public Adapter caseDischargeDietSection(DischargeDietSection object) {
				return createDischargeDietSectionAdapter();
			}
			@Override
			public Adapter caseHospitalDischargeMedicationsSectionEntriesOptional(HospitalDischargeMedicationsSectionEntriesOptional object) {
				return createHospitalDischargeMedicationsSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseDischargeMedication(DischargeMedication object) {
				return createDischargeMedicationAdapter();
			}
			@Override
			public Adapter caseHospitalCourseSection(HospitalCourseSection object) {
				return createHospitalCourseSectionAdapter();
			}
			@Override
			public Adapter caseChiefComplaintAndReasonForVisitSection(ChiefComplaintAndReasonForVisitSection object) {
				return createChiefComplaintAndReasonForVisitSectionAdapter();
			}
			@Override
			public Adapter caseHospitalConsultationsSection(HospitalConsultationsSection object) {
				return createHospitalConsultationsSectionAdapter();
			}
			@Override
			public Adapter caseHospitalDischargeInstructionsSection(HospitalDischargeInstructionsSection object) {
				return createHospitalDischargeInstructionsSectionAdapter();
			}
			@Override
			public Adapter caseHospitalDischargePhysicalSection(HospitalDischargePhysicalSection object) {
				return createHospitalDischargePhysicalSectionAdapter();
			}
			@Override
			public Adapter caseHospitalDischargeStudiesSummarySection(HospitalDischargeStudiesSummarySection object) {
				return createHospitalDischargeStudiesSummarySectionAdapter();
			}
			@Override
			public Adapter caseReasonForVisitSection(ReasonForVisitSection object) {
				return createReasonForVisitSectionAdapter();
			}
			@Override
			public Adapter casePreconditionForSubstanceAdministration(PreconditionForSubstanceAdministration object) {
				return createPreconditionForSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseImmunizationMedicationInformation(ImmunizationMedicationInformation object) {
				return createImmunizationMedicationInformationAdapter();
			}
			@Override
			public Adapter caseProcedureSpecimen(ProcedureSpecimen object) {
				return createProcedureSpecimenAdapter();
			}
			@Override
			public Adapter caseProcedurePerformer(ProcedurePerformer object) {
				return createProcedurePerformerAdapter();
			}
			@Override
			public Adapter caseProcedureEncounter(ProcedureEncounter object) {
				return createProcedureEncounterAdapter();
			}
			@Override
			public Adapter caseMedicationInformationManufacturedMaterial(MedicationInformationManufacturedMaterial object) {
				return createMedicationInformationManufacturedMaterialAdapter();
			}
			@Override
			public Adapter caseFamilyHistorySubject(FamilyHistorySubject object) {
				return createFamilyHistorySubjectAdapter();
			}
			@Override
			public Adapter caseHospitalDischargeMedicationsSection(HospitalDischargeMedicationsSection object) {
				return createHospitalDischargeMedicationsSectionAdapter();
			}
			@Override
			public Adapter caseRelatedInformant(RelatedInformant object) {
				return createRelatedInformantAdapter();
			}
			@Override
			public Adapter caseEncounterPerformer(EncounterPerformer object) {
				return createEncounterPerformerAdapter();
			}
			@Override
			public Adapter caseEncounterPerformerAssignedEntity(EncounterPerformerAssignedEntity object) {
				return createEncounterPerformerAssignedEntityAdapter();
			}
			@Override
			public Adapter caseAllergyObservationParticipant(AllergyObservationParticipant object) {
				return createAllergyObservationParticipantAdapter();
			}
			@Override
			public Adapter caseAllergyObservationParticipantRole(AllergyObservationParticipantRole object) {
				return createAllergyObservationParticipantRoleAdapter();
			}
			@Override
			public Adapter caseAllergyObservationPlayingEntity(AllergyObservationPlayingEntity object) {
				return createAllergyObservationPlayingEntityAdapter();
			}
			@Override
			public Adapter caseAnesthesiaSection(AnesthesiaSection object) {
				return createAnesthesiaSectionAdapter();
			}
			@Override
			public Adapter caseComplicationsSection(ComplicationsSection object) {
				return createComplicationsSectionAdapter();
			}
			@Override
			public Adapter caseDICOMObjectCatalogSection(DICOMObjectCatalogSection object) {
				return createDICOMObjectCatalogSectionAdapter();
			}
			@Override
			public Adapter caseStudyAct(StudyAct object) {
				return createStudyActAdapter();
			}
			@Override
			public Adapter caseSeriesAct(SeriesAct object) {
				return createSeriesActAdapter();
			}
			@Override
			public Adapter caseSOPInstanceObservation(SOPInstanceObservation object) {
				return createSOPInstanceObservationAdapter();
			}
			@Override
			public Adapter casePurposeofReferenceObservation(PurposeofReferenceObservation object) {
				return createPurposeofReferenceObservationAdapter();
			}
			@Override
			public Adapter caseReferencedFramesObservation(ReferencedFramesObservation object) {
				return createReferencedFramesObservationAdapter();
			}
			@Override
			public Adapter caseBoundaryObservation(BoundaryObservation object) {
				return createBoundaryObservationAdapter();
			}
			@Override
			public Adapter caseFindingsSection(FindingsSection object) {
				return createFindingsSectionAdapter();
			}
			@Override
			public Adapter caseInterventionsSection(InterventionsSection object) {
				return createInterventionsSectionAdapter();
			}
			@Override
			public Adapter caseMedicalHistorySection(MedicalHistorySection object) {
				return createMedicalHistorySectionAdapter();
			}
			@Override
			public Adapter caseObjectiveSection(ObjectiveSection object) {
				return createObjectiveSectionAdapter();
			}
			@Override
			public Adapter caseOperativeNoteFluidSection(OperativeNoteFluidSection object) {
				return createOperativeNoteFluidSectionAdapter();
			}
			@Override
			public Adapter caseOperativeNoteSurgicalProcedureSection(OperativeNoteSurgicalProcedureSection object) {
				return createOperativeNoteSurgicalProcedureSectionAdapter();
			}
			@Override
			public Adapter casePlannedProcedureSection(PlannedProcedureSection object) {
				return createPlannedProcedureSectionAdapter();
			}
			@Override
			public Adapter casePostoperativeDiagnosisSection(PostoperativeDiagnosisSection object) {
				return createPostoperativeDiagnosisSectionAdapter();
			}
			@Override
			public Adapter casePostprocedureDiagnosisSection(PostprocedureDiagnosisSection object) {
				return createPostprocedureDiagnosisSectionAdapter();
			}
			@Override
			public Adapter casePostprocedureDiagnosis(PostprocedureDiagnosis object) {
				return createPostprocedureDiagnosisAdapter();
			}
			@Override
			public Adapter casePreoperativeDiagnosisSection(PreoperativeDiagnosisSection object) {
				return createPreoperativeDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseProcedureDescriptionSection(ProcedureDescriptionSection object) {
				return createProcedureDescriptionSectionAdapter();
			}
			@Override
			public Adapter caseProcedureDispositionSection(ProcedureDispositionSection object) {
				return createProcedureDispositionSectionAdapter();
			}
			@Override
			public Adapter caseProcedureEstimatedBloodLossSection(ProcedureEstimatedBloodLossSection object) {
				return createProcedureEstimatedBloodLossSectionAdapter();
			}
			@Override
			public Adapter caseProcedureFindingsSection(ProcedureFindingsSection object) {
				return createProcedureFindingsSectionAdapter();
			}
			@Override
			public Adapter caseProcedureImplantsSection(ProcedureImplantsSection object) {
				return createProcedureImplantsSectionAdapter();
			}
			@Override
			public Adapter caseProcedureIndicationsSection(ProcedureIndicationsSection object) {
				return createProcedureIndicationsSectionAdapter();
			}
			@Override
			public Adapter caseProcedureSpecimensTakenSection(ProcedureSpecimensTakenSection object) {
				return createProcedureSpecimensTakenSectionAdapter();
			}
			@Override
			public Adapter caseSubjectiveSection(SubjectiveSection object) {
				return createSubjectiveSectionAdapter();
			}
			@Override
			public Adapter caseConsultationNote(ConsultationNote object) {
				return createConsultationNoteAdapter();
			}
			@Override
			public Adapter caseConsultationNote_ComponentOf(ConsultationNote_ComponentOf object) {
				return createConsultationNote_ComponentOfAdapter();
			}
			@Override
			public Adapter caseComponentOf_EncompassingEncounter2(ComponentOf_EncompassingEncounter2 object) {
				return createComponentOf_EncompassingEncounter2Adapter();
			}
			@Override
			public Adapter caseEncompassingEncounter2_ResponsibleParty(EncompassingEncounter2_ResponsibleParty object) {
				return createEncompassingEncounter2_ResponsiblePartyAdapter();
			}
			@Override
			public Adapter caseEncompassingEncounter2_EncounterParticipant(EncompassingEncounter2_EncounterParticipant object) {
				return createEncompassingEncounter2_EncounterParticipantAdapter();
			}
			@Override
			public Adapter caseAssessmentSection(AssessmentSection object) {
				return createAssessmentSectionAdapter();
			}
			@Override
			public Adapter caseHistoryAndPhysicalNote(HistoryAndPhysicalNote object) {
				return createHistoryAndPhysicalNoteAdapter();
			}
			@Override
			public Adapter caseHistoryAndPhysicalNote_ComponentOf(HistoryAndPhysicalNote_ComponentOf object) {
				return createHistoryAndPhysicalNote_ComponentOfAdapter();
			}
			@Override
			public Adapter caseComponentOf_EncompassingEncounter4(ComponentOf_EncompassingEncounter4 object) {
				return createComponentOf_EncompassingEncounter4Adapter();
			}
			@Override
			public Adapter caseEncompassingEncounter4_ResponsibleParty(EncompassingEncounter4_ResponsibleParty object) {
				return createEncompassingEncounter4_ResponsiblePartyAdapter();
			}
			@Override
			public Adapter caseEncompassingEncounter4_EncounterParticipant(EncompassingEncounter4_EncounterParticipant object) {
				return createEncompassingEncounter4_EncounterParticipantAdapter();
			}
			@Override
			public Adapter caseOperativeNote(OperativeNote object) {
				return createOperativeNoteAdapter();
			}
			@Override
			public Adapter caseOperativeNote_DocumentationOf(OperativeNote_DocumentationOf object) {
				return createOperativeNote_DocumentationOfAdapter();
			}
			@Override
			public Adapter caseDocumentationOf_ServiceEvent(DocumentationOf_ServiceEvent object) {
				return createDocumentationOf_ServiceEventAdapter();
			}
			@Override
			public Adapter caseServiceEvent_PrimaryPerformer(ServiceEvent_PrimaryPerformer object) {
				return createServiceEvent_PrimaryPerformerAdapter();
			}
			@Override
			public Adapter caseProcedureNote(ProcedureNote object) {
				return createProcedureNoteAdapter();
			}
			@Override
			public Adapter caseProcedureNote_ComponentOf(ProcedureNote_ComponentOf object) {
				return createProcedureNote_ComponentOfAdapter();
			}
			@Override
			public Adapter caseComponentOf_EncompassingEncounter5(ComponentOf_EncompassingEncounter5 object) {
				return createComponentOf_EncompassingEncounter5Adapter();
			}
			@Override
			public Adapter caseEncompassingEncounter5_Location(EncompassingEncounter5_Location object) {
				return createEncompassingEncounter5_LocationAdapter();
			}
			@Override
			public Adapter caseLocation_HealthCareFacility(Location_HealthCareFacility object) {
				return createLocation_HealthCareFacilityAdapter();
			}
			@Override
			public Adapter caseEncompassingEncounter5_EncounterParticipant(EncompassingEncounter5_EncounterParticipant object) {
				return createEncompassingEncounter5_EncounterParticipantAdapter();
			}
			@Override
			public Adapter caseProcedureNote_Individual(ProcedureNote_Individual object) {
				return createProcedureNote_IndividualAdapter();
			}
			@Override
			public Adapter caseProcedureNote_PrimaryCarePhysician(ProcedureNote_PrimaryCarePhysician object) {
				return createProcedureNote_PrimaryCarePhysicianAdapter();
			}
			@Override
			public Adapter caseProcedureNote_Provider(ProcedureNote_Provider object) {
				return createProcedureNote_ProviderAdapter();
			}
			@Override
			public Adapter caseProvider_AssociatedEntity(Provider_AssociatedEntity object) {
				return createProvider_AssociatedEntityAdapter();
			}
			@Override
			public Adapter caseProcedureNote_DocumentationOf(ProcedureNote_DocumentationOf object) {
				return createProcedureNote_DocumentationOfAdapter();
			}
			@Override
			public Adapter caseDocumentationOf_ServiceEvent1(DocumentationOf_ServiceEvent1 object) {
				return createDocumentationOf_ServiceEvent1Adapter();
			}
			@Override
			public Adapter caseServiceEvent1_PrimaryPerformer(ServiceEvent1_PrimaryPerformer object) {
				return createServiceEvent1_PrimaryPerformerAdapter();
			}
			@Override
			public Adapter caseProgressNote(ProgressNote object) {
				return createProgressNoteAdapter();
			}
			@Override
			public Adapter caseProgressNote_DocumentationOf(ProgressNote_DocumentationOf object) {
				return createProgressNote_DocumentationOfAdapter();
			}
			@Override
			public Adapter caseDocumentationOf_ServiceEvent2(DocumentationOf_ServiceEvent2 object) {
				return createDocumentationOf_ServiceEvent2Adapter();
			}
			@Override
			public Adapter caseProgressNote_ComponentOf(ProgressNote_ComponentOf object) {
				return createProgressNote_ComponentOfAdapter();
			}
			@Override
			public Adapter caseComponentOf_EncompassingEncounter6(ComponentOf_EncompassingEncounter6 object) {
				return createComponentOf_EncompassingEncounter6Adapter();
			}
			@Override
			public Adapter caseEncompassingEncounter6_Location(EncompassingEncounter6_Location object) {
				return createEncompassingEncounter6_LocationAdapter();
			}
			@Override
			public Adapter caseLocation_HealthCareFacility1(Location_HealthCareFacility1 object) {
				return createLocation_HealthCareFacility1Adapter();
			}
			@Override
			public Adapter casePreoperativeDiagnosis(PreoperativeDiagnosis object) {
				return createPreoperativeDiagnosisAdapter();
			}
			@Override
			public Adapter caseInstructionsSection(InstructionsSection object) {
				return createInstructionsSectionAdapter();
			}
			@Override
			public Adapter caseHospitalAdmissionDiagnosis(HospitalAdmissionDiagnosis object) {
				return createHospitalAdmissionDiagnosisAdapter();
			}
			@Override
			public Adapter caseMedicationDispenseAssignedEntity(MedicationDispenseAssignedEntity object) {
				return createMedicationDispenseAssignedEntityAdapter();
			}
			@Override
			public Adapter caseImmunizationMedicationInformationManufacturedMaterial(ImmunizationMedicationInformationManufacturedMaterial object) {
				return createImmunizationMedicationInformationManufacturedMaterialAdapter();
			}
			@Override
			public Adapter caseDiagnosticImagingReport(DiagnosticImagingReport object) {
				return createDiagnosticImagingReportAdapter();
			}
			@Override
			public Adapter caseDiagnosticImagingReport_Participant(DiagnosticImagingReport_Participant object) {
				return createDiagnosticImagingReport_ParticipantAdapter();
			}
			@Override
			public Adapter caseParticipant_AssociatedEntity(Participant_AssociatedEntity object) {
				return createParticipant_AssociatedEntityAdapter();
			}
			@Override
			public Adapter caseAssociatedEntity_Person(AssociatedEntity_Person object) {
				return createAssociatedEntity_PersonAdapter();
			}
			@Override
			public Adapter caseDiagnosticImagingReport_InFulfillmentOf(DiagnosticImagingReport_InFulfillmentOf object) {
				return createDiagnosticImagingReport_InFulfillmentOfAdapter();
			}
			@Override
			public Adapter caseDiagnosticImagingReport_DocumentationOf(DiagnosticImagingReport_DocumentationOf object) {
				return createDiagnosticImagingReport_DocumentationOfAdapter();
			}
			@Override
			public Adapter caseDocumentationOf_ServiceEvent4(DocumentationOf_ServiceEvent4 object) {
				return createDocumentationOf_ServiceEvent4Adapter();
			}
			@Override
			public Adapter caseDiagnosticImagingReport_RelatedDocument(DiagnosticImagingReport_RelatedDocument object) {
				return createDiagnosticImagingReport_RelatedDocumentAdapter();
			}
			@Override
			public Adapter caseDiagnosticImagingReport_ComponentOf(DiagnosticImagingReport_ComponentOf object) {
				return createDiagnosticImagingReport_ComponentOfAdapter();
			}
			@Override
			public Adapter caseComponentOf_EncompassingEncounter7(ComponentOf_EncompassingEncounter7 object) {
				return createComponentOf_EncompassingEncounter7Adapter();
			}
			@Override
			public Adapter caseEncompassingEncounter7_ResponsibleParty(EncompassingEncounter7_ResponsibleParty object) {
				return createEncompassingEncounter7_ResponsiblePartyAdapter();
			}
			@Override
			public Adapter caseResponsibleParty_AssignedEntity(ResponsibleParty_AssignedEntity object) {
				return createResponsibleParty_AssignedEntityAdapter();
			}
			@Override
			public Adapter casePhysicianReadingStudyPerformer(PhysicianReadingStudyPerformer object) {
				return createPhysicianReadingStudyPerformerAdapter();
			}
			@Override
			public Adapter casePhysicianReadingStudyPerformer_AssignedEntity(PhysicianReadingStudyPerformer_AssignedEntity object) {
				return createPhysicianReadingStudyPerformer_AssignedEntityAdapter();
			}
			@Override
			public Adapter casePhysicianofRecordParticipant(PhysicianofRecordParticipant object) {
				return createPhysicianofRecordParticipantAdapter();
			}
			@Override
			public Adapter casePhysicianofRecordParticipant_AssignedEntity(PhysicianofRecordParticipant_AssignedEntity object) {
				return createPhysicianofRecordParticipant_AssignedEntityAdapter();
			}
			@Override
			public Adapter caseAssignedEntity_AssignedPerson(AssignedEntity_AssignedPerson object) {
				return createAssignedEntity_AssignedPersonAdapter();
			}
			@Override
			public Adapter caseTextObservation(TextObservation object) {
				return createTextObservationAdapter();
			}
			@Override
			public Adapter caseQuantityMeasurementObservation(QuantityMeasurementObservation object) {
				return createQuantityMeasurementObservationAdapter();
			}
			@Override
			public Adapter caseCodeObservations(CodeObservations object) {
				return createCodeObservationsAdapter();
			}
			@Override
			public Adapter caseProcedureContext(ProcedureContext object) {
				return createProcedureContextAdapter();
			}
			@Override
			public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
				return createInfrastructureRootAdapter();
			}
			@Override
			public Adapter caseAct(Act object) {
				return createActAdapter();
			}
			@Override
			public Adapter caseClinicalDocument(ClinicalDocument object) {
				return createClinicalDocumentAdapter();
			}
			@Override
			public Adapter caseParticipation(Participation object) {
				return createParticipationAdapter();
			}
			@Override
			public Adapter caseRecordTarget(RecordTarget object) {
				return createRecordTargetAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter casePatientRole(PatientRole object) {
				return createPatientRoleAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter casePatient(Patient object) {
				return createPatientAdapter();
			}
			@Override
			public Adapter caseGuardian(Guardian object) {
				return createGuardianAdapter();
			}
			@Override
			public Adapter caseLanguageCommunication(LanguageCommunication object) {
				return createLanguageCommunicationAdapter();
			}
			@Override
			public Adapter caseBirthplace(Birthplace object) {
				return createBirthplaceAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter caseActRelationship(ActRelationship object) {
				return createActRelationshipAdapter();
			}
			@Override
			public Adapter caseComponent1(Component1 object) {
				return createComponent1Adapter();
			}
			@Override
			public Adapter caseEncompassingEncounter(EncompassingEncounter object) {
				return createEncompassingEncounterAdapter();
			}
			@Override
			public Adapter caseAuthor(Author object) {
				return createAuthorAdapter();
			}
			@Override
			public Adapter caseAssignedAuthor(AssignedAuthor object) {
				return createAssignedAuthorAdapter();
			}
			@Override
			public Adapter caseAuthoringDevice(AuthoringDevice object) {
				return createAuthoringDeviceAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseDataEnterer(DataEnterer object) {
				return createDataEntererAdapter();
			}
			@Override
			public Adapter caseAssignedEntity(AssignedEntity object) {
				return createAssignedEntityAdapter();
			}
			@Override
			public Adapter caseCustodian(Custodian object) {
				return createCustodianAdapter();
			}
			@Override
			public Adapter caseAssignedCustodian(AssignedCustodian object) {
				return createAssignedCustodianAdapter();
			}
			@Override
			public Adapter caseCustodianOrganization(CustodianOrganization object) {
				return createCustodianOrganizationAdapter();
			}
			@Override
			public Adapter caseInformationRecipient(InformationRecipient object) {
				return createInformationRecipientAdapter();
			}
			@Override
			public Adapter caseIntendedRecipient(IntendedRecipient object) {
				return createIntendedRecipientAdapter();
			}
			@Override
			public Adapter caseLegalAuthenticator(LegalAuthenticator object) {
				return createLegalAuthenticatorAdapter();
			}
			@Override
			public Adapter caseAuthenticator(Authenticator object) {
				return createAuthenticatorAdapter();
			}
			@Override
			public Adapter caseInformant12(Informant12 object) {
				return createInformant12Adapter();
			}
			@Override
			public Adapter caseRelatedEntity(RelatedEntity object) {
				return createRelatedEntityAdapter();
			}
			@Override
			public Adapter caseParticipant1(Participant1 object) {
				return createParticipant1Adapter();
			}
			@Override
			public Adapter caseInFulfillmentOf(InFulfillmentOf object) {
				return createInFulfillmentOfAdapter();
			}
			@Override
			public Adapter caseOrder(Order object) {
				return createOrderAdapter();
			}
			@Override
			public Adapter caseClinicalStatement(ClinicalStatement object) {
				return createClinicalStatementAdapter();
			}
			@Override
			public Adapter caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
				return createCDA_ActAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseProcedure(Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseParticipantRole(ParticipantRole object) {
				return createParticipantRoleAdapter();
			}
			@Override
			public Adapter caseSubstanceAdministration(SubstanceAdministration object) {
				return createSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseSupply(Supply object) {
				return createSupplyAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseCDA_Entity(org.openhealthtools.mdht.uml.cda.Entity object) {
				return createCDA_EntityAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseDocumentationOf(DocumentationOf object) {
				return createDocumentationOfAdapter();
			}
			@Override
			public Adapter caseServiceEvent(ServiceEvent object) {
				return createServiceEventAdapter();
			}
			@Override
			public Adapter casePerformer1(Performer1 object) {
				return createPerformer1Adapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseOrganizer(Organizer object) {
				return createOrganizerAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseExternalDocument(ExternalDocument object) {
				return createExternalDocumentAdapter();
			}
			@Override
			public Adapter caseParticipant2(Participant2 object) {
				return createParticipant2Adapter();
			}
			@Override
			public Adapter casePlayingEntity(PlayingEntity object) {
				return createPlayingEntityAdapter();
			}
			@Override
			public Adapter caseCDA_Encounter(org.openhealthtools.mdht.uml.cda.Encounter object) {
				return createCDA_EncounterAdapter();
			}
			@Override
			public Adapter casePerformer2(Performer2 object) {
				return createPerformer2Adapter();
			}
			@Override
			public Adapter caseComponent2(Component2 object) {
				return createComponent2Adapter();
			}
			@Override
			public Adapter caseNonXMLBody(NonXMLBody object) {
				return createNonXMLBodyAdapter();
			}
			@Override
			public Adapter caseManufacturedProduct(ManufacturedProduct object) {
				return createManufacturedProductAdapter();
			}
			@Override
			public Adapter caseResponsibleParty(ResponsibleParty object) {
				return createResponsiblePartyAdapter();
			}
			@Override
			public Adapter caseEncounterParticipant(EncounterParticipant object) {
				return createEncounterParticipantAdapter();
			}
			@Override
			public Adapter casePrecondition(Precondition object) {
				return createPreconditionAdapter();
			}
			@Override
			public Adapter caseSpecimen(Specimen object) {
				return createSpecimenAdapter();
			}
			@Override
			public Adapter caseMaterial(Material object) {
				return createMaterialAdapter();
			}
			@Override
			public Adapter caseSubject(Subject object) {
				return createSubjectAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseHealthCareFacility(HealthCareFacility object) {
				return createHealthCareFacilityAdapter();
			}
			@Override
			public Adapter caseAssociatedEntity(AssociatedEntity object) {
				return createAssociatedEntityAdapter();
			}
			@Override
			public Adapter caseRelatedDocument(RelatedDocument object) {
				return createRelatedDocumentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_RecordTarget <em>General Header Constraints Record Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_RecordTarget
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraints_RecordTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole <em>Record Target Patient Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole
	 * @generated
	 */
	public Adapter createRecordTarget_PatientRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient <em>Patient Role Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient
	 * @generated
	 */
	public Adapter createPatientRole_PatientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian <em>Patient Guardian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian
	 * @generated
	 */
	public Adapter createPatient_GuardianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Patient_LanguageCommunication <em>Patient Language Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Patient_LanguageCommunication
	 * @generated
	 */
	public Adapter createPatient_LanguageCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Patient_Birthplace <em>Patient Birthplace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Patient_Birthplace
	 * @generated
	 */
	public Adapter createPatient_BirthplaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Birthplace_Place <em>Birthplace Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Birthplace_Place
	 * @generated
	 */
	public Adapter createBirthplace_PlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_ProviderOrganization <em>Patient Role Provider Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PatientRole_ProviderOrganization
	 * @generated
	 */
	public Adapter createPatientRole_ProviderOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_ComponentOf <em>General Header Constraints Component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_ComponentOf
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraints_ComponentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter <em>Component Of Encompassing Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter
	 * @generated
	 */
	public Adapter createComponentOf_EncompassingEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Author <em>General Header Constraints Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Author
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraints_AuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor <em>Author Assigned Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor
	 * @generated
	 */
	public Adapter createAuthor_AssignedAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor_AuthoringDevice <em>Assigned Author Authoring Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor_AuthoringDevice
	 * @generated
	 */
	public Adapter createAssignedAuthor_AuthoringDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Person <em>General Header Constraints Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Person
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraints_PersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_DataEnterer <em>General Header Constraints Data Enterer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_DataEnterer
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraints_DataEntererAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DataEnterer_AssignedEntity <em>Data Enterer Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DataEnterer_AssignedEntity
	 * @generated
	 */
	public Adapter createDataEnterer_AssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Custodian <em>General Header Constraints Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Custodian
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraints_CustodianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Custodian_AssignedCustodian <em>Custodian Assigned Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Custodian_AssignedCustodian
	 * @generated
	 */
	public Adapter createCustodian_AssignedCustodianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian_CustodianOrganization <em>Assigned Custodian Custodian Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian_CustodianOrganization
	 * @generated
	 */
	public Adapter createAssignedCustodian_CustodianOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_InformationRecipient <em>General Header Constraints Information Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_InformationRecipient
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraints_InformationRecipientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InformationRecipient_IntendedRecipient <em>Information Recipient Intended Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InformationRecipient_IntendedRecipient
	 * @generated
	 */
	public Adapter createInformationRecipient_IntendedRecipientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.IntendedRecipient_Organization <em>Intended Recipient Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.IntendedRecipient_Organization
	 * @generated
	 */
	public Adapter createIntendedRecipient_OrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_LegalAuthenticator <em>General Header Constraints Legal Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_LegalAuthenticator
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraints_LegalAuthenticatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.LegalAuthenticator_AssignedEntity <em>Legal Authenticator Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.LegalAuthenticator_AssignedEntity
	 * @generated
	 */
	public Adapter createLegalAuthenticator_AssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Authenticator <em>General Header Constraints Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Authenticator
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraints_AuthenticatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Authenticator_AssignedEntity <em>Authenticator Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Authenticator_AssignedEntity
	 * @generated
	 */
	public Adapter createAuthenticator_AssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Informant <em>General Header Constraints Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Informant
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraints_InformantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Informant_AssignedEntity <em>Informant Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Informant_AssignedEntity
	 * @generated
	 */
	public Adapter createInformant_AssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Informant_RelatedEntity <em>Informant Related Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Informant_RelatedEntity
	 * @generated
	 */
	public Adapter createInformant_RelatedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_ParticipantSupport <em>General Header Constraints Participant Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_ParticipantSupport
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraints_ParticipantSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_InFulfillmentOf <em>General Header Constraints In Fulfillment Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_InFulfillmentOf
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraints_InFulfillmentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InFulfillmentOf_Order <em>In Fulfillment Of Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InFulfillmentOf_Order
	 * @generated
	 */
	public Adapter createInFulfillmentOf_OrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct <em>Allergy Problem Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct
	 * @generated
	 */
	public Adapter createAllergyProblemActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation <em>Allergy Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyObservation
	 * @generated
	 */
	public Adapter createAllergyObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation <em>Reaction Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReactionObservation
	 * @generated
	 */
	public Adapter createReactionObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation <em>Severity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SeverityObservation
	 * @generated
	 */
	public Adapter createSeverityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation <em>Allergy Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation
	 * @generated
	 */
	public Adapter createAllergyStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation <em>Age Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AgeObservation
	 * @generated
	 */
	public Adapter createAgeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation <em>Health Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation
	 * @generated
	 */
	public Adapter createHealthStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity <em>Medication Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationActivity
	 * @generated
	 */
	public Adapter createMedicationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity <em>Non Medicinal Supply Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity
	 * @generated
	 */
	public Adapter createNonMedicinalSupplyActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProductInstance
	 * @generated
	 */
	public Adapter createProductInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance_ScopingEntity <em>Product Instance Scoping Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProductInstance_ScopingEntity
	 * @generated
	 */
	public Adapter createProductInstance_ScopingEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance_PlayingDevice <em>Product Instance Playing Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProductInstance_PlayingDevice
	 * @generated
	 */
	public Adapter createProductInstance_PlayingDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Instructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Instructions
	 * @generated
	 */
	public Adapter createInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Indication <em>Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Indication
	 * @generated
	 */
	public Adapter createIndicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense <em>Medication Dispense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationDispense
	 * @generated
	 */
	public Adapter createMedicationDispenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense_Product <em>Medication Dispense Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationDispense_Product
	 * @generated
	 */
	public Adapter createMedicationDispense_ProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder <em>Medication Supply Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder
	 * @generated
	 */
	public Adapter createMedicationSupplyOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder_Product <em>Medication Supply Order Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder_Product
	 * @generated
	 */
	public Adapter createMedicationSupplyOrder_ProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DrugVehicle <em>Drug Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DrugVehicle
	 * @generated
	 */
	public Adapter createDrugVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InternalReference <em>Internal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InternalReference
	 * @generated
	 */
	public Adapter createInternalReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationType <em>Medication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationType
	 * @generated
	 */
	public Adapter createMedicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions <em>Medication Fullfillment Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions
	 * @generated
	 */
	public Adapter createMedicationFullfillmentInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct <em>Problem Concern Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct
	 * @generated
	 */
	public Adapter createProblemConcernActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation <em>Problem Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemObservation
	 * @generated
	 */
	public Adapter createProblemObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus <em>Problem Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemStatus
	 * @generated
	 */
	public Adapter createProblemStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument <em>Continuity Of Care Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument
	 * @generated
	 */
	public Adapter createContinuityOfCareDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument_DocumentationOf <em>Continuity Of Care Document Documentation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument_DocumentationOf
	 * @generated
	 */
	public Adapter createContinuityOfCareDocument_DocumentationOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3 <em>Documentation Of Service Event3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3
	 * @generated
	 */
	public Adapter createDocumentationOf_ServiceEvent3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ServiceEvent3_Performer <em>Service Event3 Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ServiceEvent3_Performer
	 * @generated
	 */
	public Adapter createServiceEvent3_PerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Performer_AssignedEntity <em>Performer Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Performer_AssignedEntity
	 * @generated
	 */
	public Adapter createPerformer_AssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument_Author <em>Continuity Of Care Document Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument_Author
	 * @generated
	 */
	public Adapter createContinuityOfCareDocument_AuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor3 <em>Author Assigned Author3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor3
	 * @generated
	 */
	public Adapter createAuthor_AssignedAuthor3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional <em>Advance Directives Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional
	 * @generated
	 */
	public Adapter createAdvanceDirectivesSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection <em>Allergies Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergiesSection
	 * @generated
	 */
	public Adapter createAllergiesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional <em>Allergies Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional
	 * @generated
	 */
	public Adapter createAllergiesSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional <em>Encounters Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional
	 * @generated
	 */
	public Adapter createEncountersSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional <em>Immunizations Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createImmunizationsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection <em>Payers Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PayersSection
	 * @generated
	 */
	public Adapter createPayersSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity <em>Coverage Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CoverageActivity
	 * @generated
	 */
	public Adapter createCoverageActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity <em>Policy Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PolicyActivity
	 * @generated
	 */
	public Adapter createPolicyActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Payer <em>Policy Activity Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Payer
	 * @generated
	 */
	public Adapter createPolicyActivity_PayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Payer_PayerAssignedEntity <em>Payer Payer Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Payer_PayerAssignedEntity
	 * @generated
	 */
	public Adapter createPayer_PayerAssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PayerAssignedEntity_PayerOrganization <em>Payer Assigned Entity Payer Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PayerAssignedEntity_PayerOrganization
	 * @generated
	 */
	public Adapter createPayerAssignedEntity_PayerOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Guarantor <em>Policy Activity Guarantor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Guarantor
	 * @generated
	 */
	public Adapter createPolicyActivity_GuarantorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Guarantor_GuarantorAssignedEntity <em>Guarantor Guarantor Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Guarantor_GuarantorAssignedEntity
	 * @generated
	 */
	public Adapter createGuarantor_GuarantorAssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity <em>Authorization Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity
	 * @generated
	 */
	public Adapter createAuthorizationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection <em>Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsSection
	 * @generated
	 */
	public Adapter createMedicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional <em>Medications Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createMedicationsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection
	 * @generated
	 */
	public Adapter createPlanOfCareSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct <em>Plan Of Care Activity Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct
	 * @generated
	 */
	public Adapter createPlanOfCareActivityActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter <em>Plan Of Care Activity Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter
	 * @generated
	 */
	public Adapter createPlanOfCareActivityEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation <em>Plan Of Care Activity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation
	 * @generated
	 */
	public Adapter createPlanOfCareActivityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure <em>Plan Of Care Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure
	 * @generated
	 */
	public Adapter createPlanOfCareActivityProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration <em>Plan Of Care Activity Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration
	 * @generated
	 */
	public Adapter createPlanOfCareActivitySubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply <em>Plan Of Care Activity Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply
	 * @generated
	 */
	public Adapter createPlanOfCareActivitySupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection <em>Procedures Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProceduresSection
	 * @generated
	 */
	public Adapter createProceduresSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional <em>Procedures Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional
	 * @generated
	 */
	public Adapter createProceduresSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation <em>Procedure Activity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation
	 * @generated
	 */
	public Adapter createProcedureActivityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct <em>Procedure Activity Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct
	 * @generated
	 */
	public Adapter createProcedureActivityActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure <em>Procedure Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure
	 * @generated
	 */
	public Adapter createProcedureActivityProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional <em>Vital Signs Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createVitalSignsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection <em>Family History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection
	 * @generated
	 */
	public Adapter createFamilyHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer <em>Family History Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer
	 * @generated
	 */
	public Adapter createFamilyHistoryOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation <em>Family History Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation
	 * @generated
	 */
	public Adapter createFamilyHistoryObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation <em>Family History Death Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation
	 * @generated
	 */
	public Adapter createFamilyHistoryDeathObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection
	 * @generated
	 */
	public Adapter createSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation <em>Social History Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation
	 * @generated
	 */
	public Adapter createSocialHistoryObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation <em>Pregnancy Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation
	 * @generated
	 */
	public Adapter createPregnancyObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery <em>Estimated Date Of Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery
	 * @generated
	 */
	public Adapter createEstimatedDateOfDeliveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection <em>Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultsSection
	 * @generated
	 */
	public Adapter createResultsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional <em>Results Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createResultsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer
	 * @generated
	 */
	public Adapter createResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultObservation
	 * @generated
	 */
	public Adapter createResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection <em>Medical Equipment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection
	 * @generated
	 */
	public Adapter createMedicalEquipmentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection <em>Functional Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection
	 * @generated
	 */
	public Adapter createFunctionalStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection <em>Problem Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemSection
	 * @generated
	 */
	public Adapter createProblemSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional <em>Problem Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional
	 * @generated
	 */
	public Adapter createProblemSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation <em>Social History Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation
	 * @generated
	 */
	public Adapter createSocialHistoryStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PurposeSection <em>Purpose Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PurposeSection
	 * @generated
	 */
	public Adapter createPurposeSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PurposeActivity <em>Purpose Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PurposeActivity
	 * @generated
	 */
	public Adapter createPurposeActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection <em>Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection
	 * @generated
	 */
	public Adapter createAdvanceDirectivesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation <em>Advance Directive Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Reference <em>Advance Directive Observation Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Reference
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservation_ReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Reference_ExternalDocument <em>Reference External Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Reference_ExternalDocument
	 * @generated
	 */
	public Adapter createReference_ExternalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Custodian <em>Advance Directive Observation Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Custodian
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservation_CustodianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Custodian_CustodianRole <em>Custodian Custodian Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Custodian_CustodianRole
	 * @generated
	 */
	public Adapter createCustodian_CustodianRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CustodianRole_CustodianEntity <em>Custodian Role Custodian Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CustodianRole_CustodianEntity
	 * @generated
	 */
	public Adapter createCustodianRole_CustodianEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Verifier <em>Advance Directive Observation Verifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Verifier
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservation_VerifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveVerification <em>Advance Directive Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveVerification
	 * @generated
	 */
	public Adapter createAdvanceDirectiveVerificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation <em>Advance Directive Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation
	 * @generated
	 */
	public Adapter createAdvanceDirectiveStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection <em>Encounters Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncountersSection
	 * @generated
	 */
	public Adapter createEncountersSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities <em>Encounter Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncounterActivities
	 * @generated
	 */
	public Adapter createEncounterActivitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation <em>Service Delivery Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation
	 * @generated
	 */
	public Adapter createServiceDeliveryLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Encounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Encounter
	 * @generated
	 */
	public Adapter createEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection <em>Immunizations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection
	 * @generated
	 */
	public Adapter createImmunizationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity <em>Immunization Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity
	 * @generated
	 */
	public Adapter createImmunizationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason <em>Immunization Refusal Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason
	 * @generated
	 */
	public Adapter createImmunizationRefusalReasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider <em>Insurance Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider
	 * @generated
	 */
	public Adapter createInsuranceProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry <em>Payer Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PayerEntry
	 * @generated
	 */
	public Adapter createPayerEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CoveredParty <em>Covered Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CoveredParty
	 * @generated
	 */
	public Adapter createCoveredPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PolicySubscriber <em>Policy Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PolicySubscriber
	 * @generated
	 */
	public Adapter createPolicySubscriberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimen <em>Procedure Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimen
	 * @generated
	 */
	public Adapter createProcedureSpecimenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer <em>Procedure Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer
	 * @generated
	 */
	public Adapter createProcedurePerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEncounter <em>Procedure Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureEncounter
	 * @generated
	 */
	public Adapter createProcedureEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformationManufacturedMaterial <em>Medication Information Manufactured Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationInformationManufacturedMaterial
	 * @generated
	 */
	public Adapter createMedicationInformationManufacturedMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject <em>Family History Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject
	 * @generated
	 */
	public Adapter createFamilyHistorySubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection <em>Hospital Discharge Studies Summary Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection
	 * @generated
	 */
	public Adapter createHospitalDischargeStudiesSummarySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication <em>Discharge Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeMedication
	 * @generated
	 */
	public Adapter createDischargeMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis <em>Hospital Discharge Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis
	 * @generated
	 */
	public Adapter createHospitalDischargeDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection <em>Hospital Discharge Instructions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection
	 * @generated
	 */
	public Adapter createHospitalDischargeInstructionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ExternalReference
	 * @generated
	 */
	public Adapter createExternalReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Support <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Support
	 * @generated
	 */
	public Adapter createSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection
	 * @generated
	 */
	public Adapter createVitalSignsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer <em>Vital Signs Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer
	 * @generated
	 */
	public Adapter createVitalSignsOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation <em>Vital Sign Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation
	 * @generated
	 */
	public Adapter createVitalSignObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection <em>History Of Past Illness Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection
	 * @generated
	 */
	public Adapter createHistoryOfPastIllnessSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection <em>Chief Complaint Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection
	 * @generated
	 */
	public Adapter createChiefComplaintSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection <em>Reason For Referral Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection
	 * @generated
	 */
	public Adapter createReasonForReferralSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection <em>History Of Present Illness Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection
	 * @generated
	 */
	public Adapter createHistoryOfPresentIllnessSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection <em>Hospital Admission Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection
	 * @generated
	 */
	public Adapter createHospitalAdmissionDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection <em>Hospital Discharge Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection
	 * @generated
	 */
	public Adapter createHospitalDischargeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional <em>Hospital Admission Medications Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createHospitalAdmissionMedicationsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication <em>Admission Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication
	 * @generated
	 */
	public Adapter createAdmissionMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection <em>Hospital Discharge Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection
	 * @generated
	 */
	public Adapter createHospitalDischargeMedicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection <em>Hospital Discharge Physical Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection
	 * @generated
	 */
	public Adapter createHospitalDischargePhysicalSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection <em>Chief Complaint And Reason For Visit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection
	 * @generated
	 */
	public Adapter createChiefComplaintAndReasonForVisitSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection <em>Reason For Visit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection
	 * @generated
	 */
	public Adapter createReasonForVisitSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.RelatedInformant <em>Related Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.RelatedInformant
	 * @generated
	 */
	public Adapter createRelatedInformantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncounterPerformer <em>Encounter Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncounterPerformer
	 * @generated
	 */
	public Adapter createEncounterPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncounterPerformerAssignedEntity <em>Encounter Performer Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncounterPerformerAssignedEntity
	 * @generated
	 */
	public Adapter createEncounterPerformerAssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection <em>Medications Administered Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection
	 * @generated
	 */
	public Adapter createMedicationsAdministeredSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection <em>Physical Exam Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection
	 * @generated
	 */
	public Adapter createPhysicalExamSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection <em>General Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection
	 * @generated
	 */
	public Adapter createGeneralStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection <em>Review Of Systems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection
	 * @generated
	 */
	public Adapter createReviewOfSystemsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection <em>Hospital Course Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection
	 * @generated
	 */
	public Adapter createHospitalCourseSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection
	 * @generated
	 */
	public Adapter createAssessmentAndPlanSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.LanguageSpoken <em>Language Spoken</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.LanguageSpoken
	 * @generated
	 */
	public Adapter createLanguageSpokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HealthcareProvider <em>Healthcare Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HealthcareProvider
	 * @generated
	 */
	public Adapter createHealthcareProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SupportGuardian <em>Support Guardian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SupportGuardian
	 * @generated
	 */
	public Adapter createSupportGuardianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SupportParticipant <em>Support Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SupportParticipant
	 * @generated
	 */
	public Adapter createSupportParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection <em>Surgical Drains Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection
	 * @generated
	 */
	public Adapter createSurgicalDrainsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument <em>Unstructured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument
	 * @generated
	 */
	public Adapter createUnstructuredDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument_RecordTarget <em>Unstructured Document Record Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument_RecordTarget
	 * @generated
	 */
	public Adapter createUnstructuredDocument_RecordTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole2 <em>Record Target Patient Role2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole2
	 * @generated
	 */
	public Adapter createRecordTarget_PatientRole2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument_Author <em>Unstructured Document Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument_Author
	 * @generated
	 */
	public Adapter createUnstructuredDocument_AuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor2 <em>Author Assigned Author2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor2
	 * @generated
	 */
	public Adapter createAuthor_AssignedAuthor2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument_Custodian <em>Unstructured Document Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument_Custodian
	 * @generated
	 */
	public Adapter createUnstructuredDocument_CustodianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Custodian_AssignedCustodian3 <em>Custodian Assigned Custodian3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Custodian_AssignedCustodian3
	 * @generated
	 */
	public Adapter createCustodian_AssignedCustodian3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian3_CustodianOrganization <em>Assigned Custodian3 Custodian Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian3_CustodianOrganization
	 * @generated
	 */
	public Adapter createAssignedCustodian3_CustodianOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument_Component <em>Unstructured Document Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument_Component
	 * @generated
	 */
	public Adapter createUnstructuredDocument_ComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Component_NonXMLBody <em>Component Non XML Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Component_NonXMLBody
	 * @generated
	 */
	public Adapter createComponent_NonXMLBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ScanOriginalAuthor <em>Scan Original Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ScanOriginalAuthor
	 * @generated
	 */
	public Adapter createScanOriginalAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ScanningDevice <em>Scanning Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ScanningDevice
	 * @generated
	 */
	public Adapter createScanningDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ScanDataEnterer <em>Scan Data Enterer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ScanDataEnterer
	 * @generated
	 */
	public Adapter createScanDataEntererAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation <em>Medication Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationInformation
	 * @generated
	 */
	public Adapter createMedicationInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument <em>Unstructured Or Scanned Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument
	 * @generated
	 */
	public Adapter createUnstructuredOrScannedDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReferralSummary <em>Referral Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReferralSummary
	 * @generated
	 */
	public Adapter createReferralSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary <em>Discharge Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeSummary
	 * @generated
	 */
	public Adapter createDischargeSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary_ComponentOf <em>Discharge Summary Component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeSummary_ComponentOf
	 * @generated
	 */
	public Adapter createDischargeSummary_ComponentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3 <em>Component Of Encompassing Encounter3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3
	 * @generated
	 */
	public Adapter createComponentOf_EncompassingEncounter3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_ResponsibleParty <em>Encompassing Encounter3 Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_ResponsibleParty
	 * @generated
	 */
	public Adapter createEncompassingEncounter3_ResponsiblePartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_EncounterParticipant <em>Encompassing Encounter3 Encounter Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_EncounterParticipant
	 * @generated
	 */
	public Adapter createEncompassingEncounter3_EncounterParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection <em>Discharge Diet Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection
	 * @generated
	 */
	public Adapter createDischargeDietSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional <em>Hospital Discharge Medications Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createHospitalDischargeMedicationsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration <em>Precondition For Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration
	 * @generated
	 */
	public Adapter createPreconditionForSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation <em>Immunization Medication Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation
	 * @generated
	 */
	public Adapter createImmunizationMedicationInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	public Adapter createInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
	public Adapter createClinicalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Act
	 * @generated
	 */
	public Adapter createCDA_ActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration
	 * @generated
	 */
	public Adapter createSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Supply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Supply
	 * @generated
	 */
	public Adapter createSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Entity
	 * @generated
	 */
	public Adapter createCDA_EntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole <em>Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole
	 * @generated
	 */
	public Adapter createParticipantRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Encounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter
	 * @generated
	 */
	public Adapter createCDA_EncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Organizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer
	 * @generated
	 */
	public Adapter createOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Participation <em>Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Participation
	 * @generated
	 */
	public Adapter createParticipationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Participant2 <em>Participant2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Participant2
	 * @generated
	 */
	public Adapter createParticipant2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.ActRelationship <em>Act Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.ActRelationship
	 * @generated
	 */
	public Adapter createActRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.LanguageCommunication <em>Language Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.LanguageCommunication
	 * @generated
	 */
	public Adapter createLanguageCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationParticipant <em>Allergy Observation Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyObservationParticipant
	 * @generated
	 */
	public Adapter createAllergyObservationParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationParticipantRole <em>Allergy Observation Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyObservationParticipantRole
	 * @generated
	 */
	public Adapter createAllergyObservationParticipantRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity <em>Allergy Observation Playing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity
	 * @generated
	 */
	public Adapter createAllergyObservationPlayingEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection <em>Anesthesia Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection
	 * @generated
	 */
	public Adapter createAnesthesiaSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection <em>Complications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection
	 * @generated
	 */
	public Adapter createComplicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection <em>DICOM Object Catalog Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection
	 * @generated
	 */
	public Adapter createDICOMObjectCatalogSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct <em>Study Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.StudyAct
	 * @generated
	 */
	public Adapter createStudyActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct <em>Series Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SeriesAct
	 * @generated
	 */
	public Adapter createSeriesActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation <em>SOP Instance Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation
	 * @generated
	 */
	public Adapter createSOPInstanceObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation <em>Purposeof Reference Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation
	 * @generated
	 */
	public Adapter createPurposeofReferenceObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation <em>Referenced Frames Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation
	 * @generated
	 */
	public Adapter createReferencedFramesObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation <em>Boundary Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation
	 * @generated
	 */
	public Adapter createBoundaryObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FindingsSection <em>Findings Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FindingsSection
	 * @generated
	 */
	public Adapter createFindingsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection <em>Hospital Consultations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection
	 * @generated
	 */
	public Adapter createHospitalConsultationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection <em>Interventions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InterventionsSection
	 * @generated
	 */
	public Adapter createInterventionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection <em>Medical History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection
	 * @generated
	 */
	public Adapter createMedicalHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection <em>Objective Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection
	 * @generated
	 */
	public Adapter createObjectiveSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection <em>Operative Note Fluid Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection
	 * @generated
	 */
	public Adapter createOperativeNoteFluidSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection <em>Operative Note Surgical Procedure Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection
	 * @generated
	 */
	public Adapter createOperativeNoteSurgicalProcedureSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection <em>Planned Procedure Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection
	 * @generated
	 */
	public Adapter createPlannedProcedureSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection <em>Postoperative Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection
	 * @generated
	 */
	public Adapter createPostoperativeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection <em>Postprocedure Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection
	 * @generated
	 */
	public Adapter createPostprocedureDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis <em>Postprocedure Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis
	 * @generated
	 */
	public Adapter createPostprocedureDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection <em>Preoperative Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection
	 * @generated
	 */
	public Adapter createPreoperativeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection <em>Procedure Description Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection
	 * @generated
	 */
	public Adapter createProcedureDescriptionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection <em>Procedure Disposition Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection
	 * @generated
	 */
	public Adapter createProcedureDispositionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection <em>Procedure Estimated Blood Loss Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection
	 * @generated
	 */
	public Adapter createProcedureEstimatedBloodLossSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection <em>Procedure Findings Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection
	 * @generated
	 */
	public Adapter createProcedureFindingsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection <em>Procedure Implants Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection
	 * @generated
	 */
	public Adapter createProcedureImplantsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection <em>Procedure Indications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection
	 * @generated
	 */
	public Adapter createProcedureIndicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection <em>Procedure Specimens Taken Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection
	 * @generated
	 */
	public Adapter createProcedureSpecimensTakenSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection <em>Subjective Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection
	 * @generated
	 */
	public Adapter createSubjectiveSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote <em>Consultation Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ConsultationNote
	 * @generated
	 */
	public Adapter createConsultationNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote_ComponentOf <em>Consultation Note Component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ConsultationNote_ComponentOf
	 * @generated
	 */
	public Adapter createConsultationNote_ComponentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter2 <em>Component Of Encompassing Encounter2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter2
	 * @generated
	 */
	public Adapter createComponentOf_EncompassingEncounter2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter2_ResponsibleParty <em>Encompassing Encounter2 Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter2_ResponsibleParty
	 * @generated
	 */
	public Adapter createEncompassingEncounter2_ResponsiblePartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter2_EncounterParticipant <em>Encompassing Encounter2 Encounter Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter2_EncounterParticipant
	 * @generated
	 */
	public Adapter createEncompassingEncounter2_EncounterParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentSection <em>Assessment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssessmentSection
	 * @generated
	 */
	public Adapter createAssessmentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote <em>History And Physical Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote
	 * @generated
	 */
	public Adapter createHistoryAndPhysicalNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote_ComponentOf <em>History And Physical Note Component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote_ComponentOf
	 * @generated
	 */
	public Adapter createHistoryAndPhysicalNote_ComponentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4 <em>Component Of Encompassing Encounter4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4
	 * @generated
	 */
	public Adapter createComponentOf_EncompassingEncounter4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter4_ResponsibleParty <em>Encompassing Encounter4 Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter4_ResponsibleParty
	 * @generated
	 */
	public Adapter createEncompassingEncounter4_ResponsiblePartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter4_EncounterParticipant <em>Encompassing Encounter4 Encounter Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter4_EncounterParticipant
	 * @generated
	 */
	public Adapter createEncompassingEncounter4_EncounterParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote <em>Operative Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.OperativeNote
	 * @generated
	 */
	public Adapter createOperativeNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote_DocumentationOf <em>Operative Note Documentation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.OperativeNote_DocumentationOf
	 * @generated
	 */
	public Adapter createOperativeNote_DocumentationOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent <em>Documentation Of Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent
	 * @generated
	 */
	public Adapter createDocumentationOf_ServiceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ServiceEvent_PrimaryPerformer <em>Service Event Primary Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ServiceEvent_PrimaryPerformer
	 * @generated
	 */
	public Adapter createServiceEvent_PrimaryPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote <em>Procedure Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureNote
	 * @generated
	 */
	public Adapter createProcedureNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_ComponentOf <em>Procedure Note Component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_ComponentOf
	 * @generated
	 */
	public Adapter createProcedureNote_ComponentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter5 <em>Component Of Encompassing Encounter5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter5
	 * @generated
	 */
	public Adapter createComponentOf_EncompassingEncounter5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter5_Location <em>Encompassing Encounter5 Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter5_Location
	 * @generated
	 */
	public Adapter createEncompassingEncounter5_LocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Location_HealthCareFacility <em>Location Health Care Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Location_HealthCareFacility
	 * @generated
	 */
	public Adapter createLocation_HealthCareFacilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter5_EncounterParticipant <em>Encompassing Encounter5 Encounter Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter5_EncounterParticipant
	 * @generated
	 */
	public Adapter createEncompassingEncounter5_EncounterParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_Individual <em>Procedure Note Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_Individual
	 * @generated
	 */
	public Adapter createProcedureNote_IndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_PrimaryCarePhysician <em>Procedure Note Primary Care Physician</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_PrimaryCarePhysician
	 * @generated
	 */
	public Adapter createProcedureNote_PrimaryCarePhysicianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_Provider <em>Procedure Note Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_Provider
	 * @generated
	 */
	public Adapter createProcedureNote_ProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Provider_AssociatedEntity <em>Provider Associated Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Provider_AssociatedEntity
	 * @generated
	 */
	public Adapter createProvider_AssociatedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_DocumentationOf <em>Procedure Note Documentation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_DocumentationOf
	 * @generated
	 */
	public Adapter createProcedureNote_DocumentationOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1 <em>Documentation Of Service Event1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1
	 * @generated
	 */
	public Adapter createDocumentationOf_ServiceEvent1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ServiceEvent1_PrimaryPerformer <em>Service Event1 Primary Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ServiceEvent1_PrimaryPerformer
	 * @generated
	 */
	public Adapter createServiceEvent1_PrimaryPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote <em>Progress Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProgressNote
	 * @generated
	 */
	public Adapter createProgressNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote_DocumentationOf <em>Progress Note Documentation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProgressNote_DocumentationOf
	 * @generated
	 */
	public Adapter createProgressNote_DocumentationOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent2 <em>Documentation Of Service Event2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent2
	 * @generated
	 */
	public Adapter createDocumentationOf_ServiceEvent2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote_ComponentOf <em>Progress Note Component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProgressNote_ComponentOf
	 * @generated
	 */
	public Adapter createProgressNote_ComponentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter6 <em>Component Of Encompassing Encounter6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter6
	 * @generated
	 */
	public Adapter createComponentOf_EncompassingEncounter6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter6_Location <em>Encompassing Encounter6 Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter6_Location
	 * @generated
	 */
	public Adapter createEncompassingEncounter6_LocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Location_HealthCareFacility1 <em>Location Health Care Facility1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Location_HealthCareFacility1
	 * @generated
	 */
	public Adapter createLocation_HealthCareFacility1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis <em>Preoperative Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis
	 * @generated
	 */
	public Adapter createPreoperativeDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection <em>Instructions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InstructionsSection
	 * @generated
	 */
	public Adapter createInstructionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis <em>Hospital Admission Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis
	 * @generated
	 */
	public Adapter createHospitalAdmissionDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseAssignedEntity <em>Medication Dispense Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseAssignedEntity
	 * @generated
	 */
	public Adapter createMedicationDispenseAssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformationManufacturedMaterial <em>Immunization Medication Information Manufactured Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformationManufacturedMaterial
	 * @generated
	 */
	public Adapter createImmunizationMedicationInformationManufacturedMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport <em>Diagnostic Imaging Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport
	 * @generated
	 */
	public Adapter createDiagnosticImagingReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_Participant <em>Diagnostic Imaging Report Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_Participant
	 * @generated
	 */
	public Adapter createDiagnosticImagingReport_ParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Participant_AssociatedEntity <em>Participant Associated Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Participant_AssociatedEntity
	 * @generated
	 */
	public Adapter createParticipant_AssociatedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssociatedEntity_Person <em>Associated Entity Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssociatedEntity_Person
	 * @generated
	 */
	public Adapter createAssociatedEntity_PersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_InFulfillmentOf <em>Diagnostic Imaging Report In Fulfillment Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_InFulfillmentOf
	 * @generated
	 */
	public Adapter createDiagnosticImagingReport_InFulfillmentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_DocumentationOf <em>Diagnostic Imaging Report Documentation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_DocumentationOf
	 * @generated
	 */
	public Adapter createDiagnosticImagingReport_DocumentationOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4 <em>Documentation Of Service Event4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4
	 * @generated
	 */
	public Adapter createDocumentationOf_ServiceEvent4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_RelatedDocument <em>Diagnostic Imaging Report Related Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_RelatedDocument
	 * @generated
	 */
	public Adapter createDiagnosticImagingReport_RelatedDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_ComponentOf <em>Diagnostic Imaging Report Component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_ComponentOf
	 * @generated
	 */
	public Adapter createDiagnosticImagingReport_ComponentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter7 <em>Component Of Encompassing Encounter7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter7
	 * @generated
	 */
	public Adapter createComponentOf_EncompassingEncounter7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter7_ResponsibleParty <em>Encompassing Encounter7 Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter7_ResponsibleParty
	 * @generated
	 */
	public Adapter createEncompassingEncounter7_ResponsiblePartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResponsibleParty_AssignedEntity <em>Responsible Party Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResponsibleParty_AssignedEntity
	 * @generated
	 */
	public Adapter createResponsibleParty_AssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer <em>Physician Reading Study Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer
	 * @generated
	 */
	public Adapter createPhysicianReadingStudyPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer_AssignedEntity <em>Physician Reading Study Performer Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer_AssignedEntity
	 * @generated
	 */
	public Adapter createPhysicianReadingStudyPerformer_AssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant <em>Physicianof Record Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant
	 * @generated
	 */
	public Adapter createPhysicianofRecordParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant_AssignedEntity <em>Physicianof Record Participant Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant_AssignedEntity
	 * @generated
	 */
	public Adapter createPhysicianofRecordParticipant_AssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssignedEntity_AssignedPerson <em>Assigned Entity Assigned Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssignedEntity_AssignedPerson
	 * @generated
	 */
	public Adapter createAssignedEntity_AssignedPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation <em>Text Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.TextObservation
	 * @generated
	 */
	public Adapter createTextObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation <em>Quantity Measurement Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation
	 * @generated
	 */
	public Adapter createQuantityMeasurementObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations <em>Code Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CodeObservations
	 * @generated
	 */
	public Adapter createCodeObservationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureContext <em>Procedure Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureContext
	 * @generated
	 */
	public Adapter createProcedureContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Performer1 <em>Performer1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Performer1
	 * @generated
	 */
	public Adapter createPerformer1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Component2 <em>Component2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Component2
	 * @generated
	 */
	public Adapter createComponent2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.NonXMLBody <em>Non XML Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.NonXMLBody
	 * @generated
	 */
	public Adapter createNonXMLBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Author
	 * @generated
	 */
	public Adapter createAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.RecordTarget <em>Record Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.RecordTarget
	 * @generated
	 */
	public Adapter createRecordTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.DataEnterer <em>Data Enterer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.DataEnterer
	 * @generated
	 */
	public Adapter createDataEntererAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Custodian <em>Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Custodian
	 * @generated
	 */
	public Adapter createCustodianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.InformationRecipient <em>Information Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.InformationRecipient
	 * @generated
	 */
	public Adapter createInformationRecipientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.LegalAuthenticator <em>Legal Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.LegalAuthenticator
	 * @generated
	 */
	public Adapter createLegalAuthenticatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Authenticator <em>Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Authenticator
	 * @generated
	 */
	public Adapter createAuthenticatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.InFulfillmentOf <em>In Fulfillment Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.InFulfillmentOf
	 * @generated
	 */
	public Adapter createInFulfillmentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor <em>Assigned Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor
	 * @generated
	 */
	public Adapter createAssignedAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter <em>Encompassing Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter
	 * @generated
	 */
	public Adapter createEncompassingEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.AssignedCustodian <em>Assigned Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedCustodian
	 * @generated
	 */
	public Adapter createAssignedCustodianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization <em>Custodian Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.CustodianOrganization
	 * @generated
	 */
	public Adapter createCustodianOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.AuthoringDevice <em>Authoring Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.AuthoringDevice
	 * @generated
	 */
	public Adapter createAuthoringDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.IntendedRecipient <em>Intended Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.IntendedRecipient
	 * @generated
	 */
	public Adapter createIntendedRecipientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.PatientRole <em>Patient Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole
	 * @generated
	 */
	public Adapter createPatientRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Patient
	 * @generated
	 */
	public Adapter createPatientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Birthplace <em>Birthplace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Birthplace
	 * @generated
	 */
	public Adapter createBirthplaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Guardian <em>Guardian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian
	 * @generated
	 */
	public Adapter createGuardianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct <em>Manufactured Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct
	 * @generated
	 */
	public Adapter createManufacturedProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Precondition
	 * @generated
	 */
	public Adapter createPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Specimen <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Specimen
	 * @generated
	 */
	public Adapter createSpecimenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Performer2 <em>Performer2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Performer2
	 * @generated
	 */
	public Adapter createPerformer2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Material
	 * @generated
	 */
	public Adapter createMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Subject
	 * @generated
	 */
	public Adapter createSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.DocumentationOf <em>Documentation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentationOf
	 * @generated
	 */
	public Adapter createDocumentationOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ServiceEvent <em>Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ServiceEvent
	 * @generated
	 */
	public Adapter createServiceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.HealthCareFacility <em>Health Care Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.HealthCareFacility
	 * @generated
	 */
	public Adapter createHealthCareFacilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity <em>Associated Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity
	 * @generated
	 */
	public Adapter createAssociatedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.RelatedDocument <em>Related Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedDocument
	 * @generated
	 */
	public Adapter createRelatedDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ResponsibleParty
	 * @generated
	 */
	public Adapter createResponsiblePartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.EncounterParticipant <em>Encounter Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.EncounterParticipant
	 * @generated
	 */
	public Adapter createEncounterParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.RelatedEntity <em>Related Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedEntity
	 * @generated
	 */
	public Adapter createRelatedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity <em>Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity
	 * @generated
	 */
	public Adapter createAssignedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Informant12 <em>Informant12</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Informant12
	 * @generated
	 */
	public Adapter createInformant12Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Participant1 <em>Participant1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Participant1
	 * @generated
	 */
	public Adapter createParticipant1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Component1 <em>Component1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Component1
	 * @generated
	 */
	public Adapter createComponent1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.PlayingEntity <em>Playing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.PlayingEntity
	 * @generated
	 */
	public Adapter createPlayingEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument <em>External Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument
	 * @generated
	 */
	public Adapter createExternalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // ConsolAdapterFactory
