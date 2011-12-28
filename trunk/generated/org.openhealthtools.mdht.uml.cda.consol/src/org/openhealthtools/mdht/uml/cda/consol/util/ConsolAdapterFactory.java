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

import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.ExternalDocument;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.RelatedEntity;
import org.openhealthtools.mdht.uml.cda.Section;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
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
		public Adapter caseInstructions(Instructions object) {
			return createInstructionsAdapter();
		}

		@Override
		public Adapter caseMedicationDispense(MedicationDispense object) {
			return createMedicationDispenseAdapter();
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
		public Adapter caseMedicationSeriesNumberObservation(MedicationSeriesNumberObservation object) {
			return createMedicationSeriesNumberObservationAdapter();
		}

		@Override
		public Adapter caseMedicationStatusObservation(MedicationStatusObservation object) {
			return createMedicationStatusObservationAdapter();
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
		public Adapter caseAdvanceDirectivesSectionEntriesOptional(AdvanceDirectivesSectionEntriesOptional object) {
			return createAdvanceDirectivesSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectiveObservation(AdvanceDirectiveObservation object) {
			return createAdvanceDirectiveObservationAdapter();
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
		public Adapter caseEncountersSectionEntriesOptional(EncountersSectionEntriesOptional object) {
			return createEncountersSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseEncounterActivities(EncounterActivities object) {
			return createEncounterActivitiesAdapter();
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
		public Adapter caseAuthorizationActivity(AuthorizationActivity object) {
			return createAuthorizationActivityAdapter();
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
		public Adapter caseMedicalEquipmentSection(MedicalEquipmentSection object) {
			return createMedicalEquipmentSectionAdapter();
		}

		@Override
		public Adapter caseFunctionalStatusSection(FunctionalStatusSection object) {
			return createFunctionalStatusSectionAdapter();
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
		public Adapter caseAdvanceDirectivesSection(AdvanceDirectivesSection object) {
			return createAdvanceDirectivesSectionAdapter();
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
		public Adapter caseAdvanceDirectiveReference(AdvanceDirectiveReference object) {
			return createAdvanceDirectiveReferenceAdapter();
		}

		@Override
		public Adapter caseEncountersSection(EncountersSection object) {
			return createEncountersSectionAdapter();
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
		public Adapter caseHistoryOfPresentIllness(HistoryOfPresentIllness object) {
			return createHistoryOfPresentIllnessAdapter();
		}

		@Override
		public Adapter caseHospitalAdmissionDiagnosisSection(HospitalAdmissionDiagnosisSection object) {
			return createHospitalAdmissionDiagnosisSectionAdapter();
		}

		@Override
		public Adapter caseHospitalAdmissionMedicationsSectionEntriesOptional(
				HospitalAdmissionMedicationsSectionEntriesOptional object) {
			return createHospitalAdmissionMedicationsSectionEntriesOptionalAdapter();
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
		public Adapter caseMedicationTaperedDose(MedicationTaperedDose object) {
			return createMedicationTaperedDoseAdapter();
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
		public Adapter caseUnstructuredDocument(UnstructuredDocument object) {
			return createUnstructuredDocumentAdapter();
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
		public Adapter caseHospitalDischargeMedicationsSectionEntriesOptional(
				HospitalDischargeMedicationsSectionEntriesOptional object) {
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
		public Adapter caseHospitalDischargeStudiesSummarySection(HospitalDischargeStudiesSummarySection object) {
			return createHospitalDischargeStudiesSummarySectionAdapter();
		}

		@Override
		public Adapter caseHospitalDischargeInstructionsSection(HospitalDischargeInstructionsSection object) {
			return createHospitalDischargeInstructionsSectionAdapter();
		}

		@Override
		public Adapter caseHospitalDischargeMedicationsSection(HospitalDischargeMedicationsSection object) {
			return createHospitalDischargeMedicationsSectionAdapter();
		}

		@Override
		public Adapter caseHospitalDischargePhysicalSection(HospitalDischargePhysicalSection object) {
			return createHospitalDischargePhysicalSectionAdapter();
		}

		@Override
		public Adapter caseChiefComplaintAndReasonForVisitSection(ChiefComplaintAndReasonForVisitSection object) {
			return createChiefComplaintAndReasonForVisitSectionAdapter();
		}

		@Override
		public Adapter caseReasonForVisitSection(ReasonForVisitSection object) {
			return createReasonForVisitSectionAdapter();
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
		public Adapter caseAuthor(Author object) {
			return createAuthorAdapter();
		}

		@Override
		public Adapter casePerson(Person object) {
			return createPersonAdapter();
		}

		@Override
		public Adapter caseRecordTarget(RecordTarget object) {
			return createRecordTargetAdapter();
		}

		@Override
		public Adapter caseDataEnterer(DataEnterer object) {
			return createDataEntererAdapter();
		}

		@Override
		public Adapter caseCustodian(Custodian object) {
			return createCustodianAdapter();
		}

		@Override
		public Adapter caseInformationRecipient(InformationRecipient object) {
			return createInformationRecipientAdapter();
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
		public Adapter caseInformant(Informant object) {
			return createInformantAdapter();
		}

		@Override
		public Adapter caseParticipantSupport(ParticipantSupport object) {
			return createParticipantSupportAdapter();
		}

		@Override
		public Adapter caseInFulfillmentOf(InFulfillmentOf object) {
			return createInFulfillmentOfAdapter();
		}

		@Override
		public Adapter caseComponentOf(ComponentOf object) {
			return createComponentOfAdapter();
		}

		@Override
		public Adapter caseAssignedAuthenticator(AssignedAuthenticator object) {
			return createAssignedAuthenticatorAdapter();
		}

		@Override
		public Adapter caseAssignedAuthor(AssignedAuthor object) {
			return createAssignedAuthorAdapter();
		}

		@Override
		public Adapter caseEncompassingEncounter(EncompassingEncounter object) {
			return createEncompassingEncounterAdapter();
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
		public Adapter caseAuthoringDevice(AuthoringDevice object) {
			return createAuthoringDeviceAdapter();
		}

		@Override
		public Adapter caseAssignedInformant(AssignedInformant object) {
			return createAssignedInformantAdapter();
		}

		@Override
		public Adapter caseIntendedRecipient(IntendedRecipient object) {
			return createIntendedRecipientAdapter();
		}

		@Override
		public Adapter caseAssignedDataEnterer(AssignedDataEnterer object) {
			return createAssignedDataEntererAdapter();
		}

		@Override
		public Adapter caseOrder(Order object) {
			return createOrderAdapter();
		}

		@Override
		public Adapter caseRecievedOrganization(RecievedOrganization object) {
			return createRecievedOrganizationAdapter();
		}

		@Override
		public Adapter casePatientRole(PatientRole object) {
			return createPatientRoleAdapter();
		}

		@Override
		public Adapter casePatient(Patient object) {
			return createPatientAdapter();
		}

		@Override
		public Adapter caseBirthplace(Birthplace object) {
			return createBirthplaceAdapter();
		}

		@Override
		public Adapter caseGuardian(Guardian object) {
			return createGuardianAdapter();
		}

		@Override
		public Adapter caseProviderOrganization(ProviderOrganization object) {
			return createProviderOrganizationAdapter();
		}

		@Override
		public Adapter caseLanguageCommunication(LanguageCommunication object) {
			return createLanguageCommunicationAdapter();
		}

		@Override
		public Adapter casePlace(Place object) {
			return createPlaceAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectiveObservationCustodian(AdvanceDirectiveObservationCustodian object) {
			return createAdvanceDirectiveObservationCustodianAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectiveObservationReference(AdvanceDirectiveObservationReference object) {
			return createAdvanceDirectiveObservationReferenceAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectiveObservationVerifier(AdvanceDirectiveObservationVerifier object) {
			return createAdvanceDirectiveObservationVerifierAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectiveObservationCustodianRole(AdvanceDirectiveObservationCustodianRole object) {
			return createAdvanceDirectiveObservationCustodianRoleAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectiveObservationCustodianEntity(AdvanceDirectiveObservationCustodianEntity object) {
			return createAdvanceDirectiveObservationCustodianEntityAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectiveObservationExternalDocument(
				AdvanceDirectiveObservationExternalDocument object) {
			return createAdvanceDirectiveObservationExternalDocumentAdapter();
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
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
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
		public Adapter caseSection(Section object) {
			return createSectionAdapter();
		}

		@Override
		public Adapter caseCDA_Encounter(org.openhealthtools.mdht.uml.cda.Encounter object) {
			return createCDA_EncounterAdapter();
		}

		@Override
		public Adapter caseOrganizer(Organizer object) {
			return createOrganizerAdapter();
		}

		@Override
		public Adapter caseParticipation(Participation object) {
			return createParticipationAdapter();
		}

		@Override
		public Adapter caseParticipant2(Participant2 object) {
			return createParticipant2Adapter();
		}

		@Override
		public Adapter caseActRelationship(ActRelationship object) {
			return createActRelationshipAdapter();
		}

		@Override
		public Adapter caseReference(Reference object) {
			return createReferenceAdapter();
		}

		@Override
		public Adapter caseCDA_LanguageCommunication(org.openhealthtools.mdht.uml.cda.LanguageCommunication object) {
			return createCDA_LanguageCommunicationAdapter();
		}

		@Override
		public Adapter casePerformer1(Performer1 object) {
			return createPerformer1Adapter();
		}

		@Override
		public Adapter caseCDA_Author(org.openhealthtools.mdht.uml.cda.Author object) {
			return createCDA_AuthorAdapter();
		}

		@Override
		public Adapter caseCDA_DataEnterer(org.openhealthtools.mdht.uml.cda.DataEnterer object) {
			return createCDA_DataEntererAdapter();
		}

		@Override
		public Adapter caseManufacturedProduct(ManufacturedProduct object) {
			return createManufacturedProductAdapter();
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
		public Adapter casePerformer2(Performer2 object) {
			return createPerformer2Adapter();
		}

		@Override
		public Adapter caseEntity(Entity object) {
			return createEntityAdapter();
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
		public Adapter caseRelatedEntity(RelatedEntity object) {
			return createRelatedEntityAdapter();
		}

		@Override
		public Adapter caseAssignedEntity(AssignedEntity object) {
			return createAssignedEntityAdapter();
		}

		@Override
		public Adapter caseCDA_Person(org.openhealthtools.mdht.uml.cda.Person object) {
			return createCDA_PersonAdapter();
		}

		@Override
		public Adapter caseCDA_RecordTarget(org.openhealthtools.mdht.uml.cda.RecordTarget object) {
			return createCDA_RecordTargetAdapter();
		}

		@Override
		public Adapter caseCDA_Custodian(org.openhealthtools.mdht.uml.cda.Custodian object) {
			return createCDA_CustodianAdapter();
		}

		@Override
		public Adapter caseCDA_InformationRecipient(org.openhealthtools.mdht.uml.cda.InformationRecipient object) {
			return createCDA_InformationRecipientAdapter();
		}

		@Override
		public Adapter caseCDA_LegalAuthenticator(org.openhealthtools.mdht.uml.cda.LegalAuthenticator object) {
			return createCDA_LegalAuthenticatorAdapter();
		}

		@Override
		public Adapter caseCDA_Authenticator(org.openhealthtools.mdht.uml.cda.Authenticator object) {
			return createCDA_AuthenticatorAdapter();
		}

		@Override
		public Adapter caseInformant12(Informant12 object) {
			return createInformant12Adapter();
		}

		@Override
		public Adapter caseParticipant1(Participant1 object) {
			return createParticipant1Adapter();
		}

		@Override
		public Adapter caseCDA_InFulfillmentOf(org.openhealthtools.mdht.uml.cda.InFulfillmentOf object) {
			return createCDA_InFulfillmentOfAdapter();
		}

		@Override
		public Adapter caseComponent1(Component1 object) {
			return createComponent1Adapter();
		}

		@Override
		public Adapter caseCDA_AssignedAuthor(org.openhealthtools.mdht.uml.cda.AssignedAuthor object) {
			return createCDA_AssignedAuthorAdapter();
		}

		@Override
		public Adapter caseCDA_EncompassingEncounter(org.openhealthtools.mdht.uml.cda.EncompassingEncounter object) {
			return createCDA_EncompassingEncounterAdapter();
		}

		@Override
		public Adapter caseCDA_AssignedCustodian(org.openhealthtools.mdht.uml.cda.AssignedCustodian object) {
			return createCDA_AssignedCustodianAdapter();
		}

		@Override
		public Adapter caseCDA_CustodianOrganization(org.openhealthtools.mdht.uml.cda.CustodianOrganization object) {
			return createCDA_CustodianOrganizationAdapter();
		}

		@Override
		public Adapter caseCDA_AuthoringDevice(org.openhealthtools.mdht.uml.cda.AuthoringDevice object) {
			return createCDA_AuthoringDeviceAdapter();
		}

		@Override
		public Adapter caseCDA_IntendedRecipient(org.openhealthtools.mdht.uml.cda.IntendedRecipient object) {
			return createCDA_IntendedRecipientAdapter();
		}

		@Override
		public Adapter caseCDA_Order(org.openhealthtools.mdht.uml.cda.Order object) {
			return createCDA_OrderAdapter();
		}

		@Override
		public Adapter caseOrganization(Organization object) {
			return createOrganizationAdapter();
		}

		@Override
		public Adapter caseCDA_PatientRole(org.openhealthtools.mdht.uml.cda.PatientRole object) {
			return createCDA_PatientRoleAdapter();
		}

		@Override
		public Adapter caseCDA_Patient(org.openhealthtools.mdht.uml.cda.Patient object) {
			return createCDA_PatientAdapter();
		}

		@Override
		public Adapter caseCDA_Birthplace(org.openhealthtools.mdht.uml.cda.Birthplace object) {
			return createCDA_BirthplaceAdapter();
		}

		@Override
		public Adapter caseCDA_Guardian(org.openhealthtools.mdht.uml.cda.Guardian object) {
			return createCDA_GuardianAdapter();
		}

		@Override
		public Adapter caseCDA_Place(org.openhealthtools.mdht.uml.cda.Place object) {
			return createCDA_PlaceAdapter();
		}

		@Override
		public Adapter casePlayingEntity(PlayingEntity object) {
			return createPlayingEntityAdapter();
		}

		@Override
		public Adapter caseExternalDocument(ExternalDocument object) {
			return createExternalDocumentAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation <em>Medication Series Number Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation
	 * @generated
	 */
	public Adapter createMedicationSeriesNumberObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation <em>Medication Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation
	 * @generated
	 */
	public Adapter createMedicationStatusObservationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveReference <em>Advance Directive Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveReference
	 * @generated
	 */
	public Adapter createAdvanceDirectiveReferenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllness <em>History Of Present Illness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllness
	 * @generated
	 */
	public Adapter createHistoryOfPresentIllnessAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationVerifier <em>Advance Directive Observation Verifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationVerifier
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservationVerifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodian <em>Advance Directive Observation Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodian
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservationCustodianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodianRole <em>Advance Directive Observation Custodian Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodianRole
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservationCustodianRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodianEntity <em>Advance Directive Observation Custodian Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodianEntity
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservationCustodianEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationReference <em>Advance Directive Observation Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationReference
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservationReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationExternalDocument <em>Advance Directive Observation External Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationExternalDocument
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservationExternalDocumentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationTaperedDose <em>Medication Tapered Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationTaperedDose
	 * @generated
	 */
	public Adapter createMedicationTaperedDoseAdapter() {
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
	public Adapter createCDA_LanguageCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.LanguageCommunication <em>Language Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.LanguageCommunication
	 * @generated
	 */
	public Adapter createLanguageCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Author
	 * @generated
	 */
	public Adapter createCDA_AuthorAdapter() {
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
	public Adapter createCDA_DataEntererAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Author
	 * @generated
	 */
	public Adapter createAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget <em>Record Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.RecordTarget
	 * @generated
	 */
	public Adapter createRecordTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DataEnterer <em>Data Enterer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DataEnterer
	 * @generated
	 */
	public Adapter createDataEntererAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Custodian <em>Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Custodian
	 * @generated
	 */
	public Adapter createCustodianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InformationRecipient <em>Information Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InformationRecipient
	 * @generated
	 */
	public Adapter createInformationRecipientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.LegalAuthenticator <em>Legal Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.LegalAuthenticator
	 * @generated
	 */
	public Adapter createLegalAuthenticatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Authenticator <em>Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Authenticator
	 * @generated
	 */
	public Adapter createAuthenticatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Informant <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Informant
	 * @generated
	 */
	public Adapter createInformantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ParticipantSupport <em>Participant Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ParticipantSupport
	 * @generated
	 */
	public Adapter createParticipantSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InFulfillmentOf <em>In Fulfillment Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InFulfillmentOf
	 * @generated
	 */
	public Adapter createInFulfillmentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf <em>Component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ComponentOf
	 * @generated
	 */
	public Adapter createComponentOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthenticator <em>Assigned Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssignedAuthenticator
	 * @generated
	 */
	public Adapter createAssignedAuthenticatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor <em>Assigned Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor
	 * @generated
	 */
	public Adapter createAssignedAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter <em>Encompassing Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter
	 * @generated
	 */
	public Adapter createEncompassingEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian <em>Assigned Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian
	 * @generated
	 */
	public Adapter createAssignedCustodianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization <em>Custodian Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization
	 * @generated
	 */
	public Adapter createCustodianOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AuthoringDevice <em>Authoring Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AuthoringDevice
	 * @generated
	 */
	public Adapter createAuthoringDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssignedInformant <em>Assigned Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssignedInformant
	 * @generated
	 */
	public Adapter createAssignedInformantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.IntendedRecipient <em>Intended Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.IntendedRecipient
	 * @generated
	 */
	public Adapter createIntendedRecipientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssignedDataEnterer <em>Assigned Data Enterer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssignedDataEnterer
	 * @generated
	 */
	public Adapter createAssignedDataEntererAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.RecievedOrganization <em>Recieved Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.RecievedOrganization
	 * @generated
	 */
	public Adapter createRecievedOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole <em>Patient Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PatientRole
	 * @generated
	 */
	public Adapter createPatientRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Patient
	 * @generated
	 */
	public Adapter createPatientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Birthplace <em>Birthplace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Birthplace
	 * @generated
	 */
	public Adapter createBirthplaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Guardian <em>Guardian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Guardian
	 * @generated
	 */
	public Adapter createGuardianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProviderOrganization <em>Provider Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProviderOrganization
	 * @generated
	 */
	public Adapter createProviderOrganizationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Person
	 * @generated
	 */
	public Adapter createCDA_PersonAdapter() {
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
	public Adapter createCDA_RecordTargetAdapter() {
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
	public Adapter createCDA_CustodianAdapter() {
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
	public Adapter createCDA_InformationRecipientAdapter() {
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
	public Adapter createCDA_LegalAuthenticatorAdapter() {
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
	public Adapter createCDA_AuthenticatorAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.InFulfillmentOf <em>In Fulfillment Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.InFulfillmentOf
	 * @generated
	 */
	public Adapter createCDA_InFulfillmentOfAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor <em>Assigned Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor
	 * @generated
	 */
	public Adapter createCDA_AssignedAuthorAdapter() {
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
	public Adapter createCDA_EncompassingEncounterAdapter() {
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
	public Adapter createCDA_AssignedCustodianAdapter() {
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
	public Adapter createCDA_CustodianOrganizationAdapter() {
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
	public Adapter createCDA_AuthoringDeviceAdapter() {
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
	public Adapter createCDA_IntendedRecipientAdapter() {
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
	public Adapter createCDA_OrderAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.PatientRole <em>Patient Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole
	 * @generated
	 */
	public Adapter createCDA_PatientRoleAdapter() {
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
	public Adapter createCDA_PatientAdapter() {
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
	public Adapter createCDA_BirthplaceAdapter() {
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
	public Adapter createCDA_GuardianAdapter() {
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
	public Adapter createCDA_PlaceAdapter() {
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
