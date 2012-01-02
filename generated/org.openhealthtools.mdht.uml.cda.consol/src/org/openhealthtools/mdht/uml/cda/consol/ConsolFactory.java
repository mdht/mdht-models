/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage
 * @generated
 */
public interface ConsolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConsolFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.consol.impl.ConsolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints createGeneralHeaderConstraints();

	/**
	 * Returns a new object of class '<em>General Header Constraints Record Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints Record Target</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints_RecordTarget createGeneralHeaderConstraints_RecordTarget();

	/**
	 * Returns a new object of class '<em>Record Target Patient Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Target Patient Role</em>'.
	 * @generated
	 */
	RecordTarget_PatientRole createRecordTarget_PatientRole();

	/**
	 * Returns a new object of class '<em>Patient Role Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Role Patient</em>'.
	 * @generated
	 */
	PatientRole_Patient createPatientRole_Patient();

	/**
	 * Returns a new object of class '<em>Patient Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Guardian</em>'.
	 * @generated
	 */
	Patient_Guardian createPatient_Guardian();

	/**
	 * Returns a new object of class '<em>Patient Language Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Language Communication</em>'.
	 * @generated
	 */
	Patient_LanguageCommunication createPatient_LanguageCommunication();

	/**
	 * Returns a new object of class '<em>Patient Birthplace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Birthplace</em>'.
	 * @generated
	 */
	Patient_Birthplace createPatient_Birthplace();

	/**
	 * Returns a new object of class '<em>Birthplace Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Birthplace Place</em>'.
	 * @generated
	 */
	Birthplace_Place createBirthplace_Place();

	/**
	 * Returns a new object of class '<em>Patient Role Provider Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Role Provider Organization</em>'.
	 * @generated
	 */
	PatientRole_ProviderOrganization createPatientRole_ProviderOrganization();

	/**
	 * Returns a new object of class '<em>General Header Constraints Component Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints Component Of</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints_ComponentOf createGeneralHeaderConstraints_ComponentOf();

	/**
	 * Returns a new object of class '<em>Component Of Encompassing Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Of Encompassing Encounter</em>'.
	 * @generated
	 */
	ComponentOf_EncompassingEncounter createComponentOf_EncompassingEncounter();

	/**
	 * Returns a new object of class '<em>General Header Constraints Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints Author</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints_Author createGeneralHeaderConstraints_Author();

	/**
	 * Returns a new object of class '<em>Author Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Author Assigned Author</em>'.
	 * @generated
	 */
	Author_AssignedAuthor createAuthor_AssignedAuthor();

	/**
	 * Returns a new object of class '<em>Assigned Author Authoring Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assigned Author Authoring Device</em>'.
	 * @generated
	 */
	AssignedAuthor_AuthoringDevice createAssignedAuthor_AuthoringDevice();

	/**
	 * Returns a new object of class '<em>General Header Constraints Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints Person</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints_Person createGeneralHeaderConstraints_Person();

	/**
	 * Returns a new object of class '<em>General Header Constraints Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints Data Enterer</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints_DataEnterer createGeneralHeaderConstraints_DataEnterer();

	/**
	 * Returns a new object of class '<em>Data Enterer Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Enterer Assigned Entity</em>'.
	 * @generated
	 */
	DataEnterer_AssignedEntity createDataEnterer_AssignedEntity();

	/**
	 * Returns a new object of class '<em>General Header Constraints Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints Custodian</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints_Custodian createGeneralHeaderConstraints_Custodian();

	/**
	 * Returns a new object of class '<em>Custodian Assigned Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custodian Assigned Custodian</em>'.
	 * @generated
	 */
	Custodian_AssignedCustodian createCustodian_AssignedCustodian();

	/**
	 * Returns a new object of class '<em>Assigned Custodian Custodian Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assigned Custodian Custodian Organization</em>'.
	 * @generated
	 */
	AssignedCustodian_CustodianOrganization createAssignedCustodian_CustodianOrganization();

	/**
	 * Returns a new object of class '<em>General Header Constraints Information Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints Information Recipient</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints_InformationRecipient createGeneralHeaderConstraints_InformationRecipient();

	/**
	 * Returns a new object of class '<em>Information Recipient Intended Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Recipient Intended Recipient</em>'.
	 * @generated
	 */
	InformationRecipient_IntendedRecipient createInformationRecipient_IntendedRecipient();

	/**
	 * Returns a new object of class '<em>Intended Recipient Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intended Recipient Organization</em>'.
	 * @generated
	 */
	IntendedRecipient_Organization createIntendedRecipient_Organization();

	/**
	 * Returns a new object of class '<em>General Header Constraints Legal Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints Legal Authenticator</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints_LegalAuthenticator createGeneralHeaderConstraints_LegalAuthenticator();

	/**
	 * Returns a new object of class '<em>Legal Authenticator Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legal Authenticator Assigned Entity</em>'.
	 * @generated
	 */
	LegalAuthenticator_AssignedEntity createLegalAuthenticator_AssignedEntity();

	/**
	 * Returns a new object of class '<em>General Header Constraints Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints Authenticator</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints_Authenticator createGeneralHeaderConstraints_Authenticator();

	/**
	 * Returns a new object of class '<em>Authenticator Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authenticator Assigned Entity</em>'.
	 * @generated
	 */
	Authenticator_AssignedEntity createAuthenticator_AssignedEntity();

	/**
	 * Returns a new object of class '<em>General Header Constraints Informant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints Informant</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints_Informant createGeneralHeaderConstraints_Informant();

	/**
	 * Returns a new object of class '<em>Informant Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Informant Assigned Entity</em>'.
	 * @generated
	 */
	Informant_AssignedEntity createInformant_AssignedEntity();

	/**
	 * Returns a new object of class '<em>Informant Related Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Informant Related Entity</em>'.
	 * @generated
	 */
	Informant_RelatedEntity createInformant_RelatedEntity();

	/**
	 * Returns a new object of class '<em>General Header Constraints Participant Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints Participant Support</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints_ParticipantSupport createGeneralHeaderConstraints_ParticipantSupport();

	/**
	 * Returns a new object of class '<em>General Header Constraints In Fulfillment Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints In Fulfillment Of</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints_InFulfillmentOf createGeneralHeaderConstraints_InFulfillmentOf();

	/**
	 * Returns a new object of class '<em>In Fulfillment Of Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Fulfillment Of Order</em>'.
	 * @generated
	 */
	InFulfillmentOf_Order createInFulfillmentOf_Order();

	/**
	 * Returns a new object of class '<em>Allergy Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Problem Act</em>'.
	 * @generated
	 */
	AllergyProblemAct createAllergyProblemAct();

	/**
	 * Returns a new object of class '<em>Allergy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Observation</em>'.
	 * @generated
	 */
	AllergyObservation createAllergyObservation();

	/**
	 * Returns a new object of class '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Observation</em>'.
	 * @generated
	 */
	ReactionObservation createReactionObservation();

	/**
	 * Returns a new object of class '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Severity Observation</em>'.
	 * @generated
	 */
	SeverityObservation createSeverityObservation();

	/**
	 * Returns a new object of class '<em>Allergy Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Status Observation</em>'.
	 * @generated
	 */
	AllergyStatusObservation createAllergyStatusObservation();

	/**
	 * Returns a new object of class '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Age Observation</em>'.
	 * @generated
	 */
	AgeObservation createAgeObservation();

	/**
	 * Returns a new object of class '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Status Observation</em>'.
	 * @generated
	 */
	HealthStatusObservation createHealthStatusObservation();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Activity</em>'.
	 * @generated
	 */
	MedicationActivity createMedicationActivity();

	/**
	 * Returns a new object of class '<em>Non Medicinal Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Medicinal Supply Activity</em>'.
	 * @generated
	 */
	NonMedicinalSupplyActivity createNonMedicinalSupplyActivity();

	/**
	 * Returns a new object of class '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Instance</em>'.
	 * @generated
	 */
	ProductInstance createProductInstance();

	/**
	 * Returns a new object of class '<em>Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instructions</em>'.
	 * @generated
	 */
	Instructions createInstructions();

	/**
	 * Returns a new object of class '<em>Indication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indication</em>'.
	 * @generated
	 */
	Indication createIndication();

	/**
	 * Returns a new object of class '<em>Medication Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense</em>'.
	 * @generated
	 */
	MedicationDispense createMedicationDispense();

	/**
	 * Returns a new object of class '<em>Medication Supply Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Supply Order</em>'.
	 * @generated
	 */
	MedicationSupplyOrder createMedicationSupplyOrder();

	/**
	 * Returns a new object of class '<em>Drug Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drug Vehicle</em>'.
	 * @generated
	 */
	DrugVehicle createDrugVehicle();

	/**
	 * Returns a new object of class '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Series Number Observation</em>'.
	 * @generated
	 */
	MedicationSeriesNumberObservation createMedicationSeriesNumberObservation();

	/**
	 * Returns a new object of class '<em>Medication Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Status Observation</em>'.
	 * @generated
	 */
	MedicationStatusObservation createMedicationStatusObservation();

	/**
	 * Returns a new object of class '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Reference</em>'.
	 * @generated
	 */
	InternalReference createInternalReference();

	/**
	 * Returns a new object of class '<em>Medication Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Type</em>'.
	 * @generated
	 */
	MedicationType createMedicationType();

	/**
	 * Returns a new object of class '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Fullfillment Instructions</em>'.
	 * @generated
	 */
	MedicationFullfillmentInstructions createMedicationFullfillmentInstructions();

	/**
	 * Returns a new object of class '<em>Problem Concern Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Concern Act</em>'.
	 * @generated
	 */
	ProblemConcernAct createProblemConcernAct();

	/**
	 * Returns a new object of class '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Observation</em>'.
	 * @generated
	 */
	ProblemObservation createProblemObservation();

	/**
	 * Returns a new object of class '<em>Problem Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Status</em>'.
	 * @generated
	 */
	ProblemStatus createProblemStatus();

	/**
	 * Returns a new object of class '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuity Of Care Document</em>'.
	 * @generated
	 */
	ContinuityOfCareDocument createContinuityOfCareDocument();

	/**
	 * Returns a new object of class '<em>Advance Directives Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directives Section Entries Optional</em>'.
	 * @generated
	 */
	AdvanceDirectivesSectionEntriesOptional createAdvanceDirectivesSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Allergies Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergies Section</em>'.
	 * @generated
	 */
	AllergiesSection createAllergiesSection();

	/**
	 * Returns a new object of class '<em>Allergies Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergies Section Entries Optional</em>'.
	 * @generated
	 */
	AllergiesSectionEntriesOptional createAllergiesSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Encounters Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Section Entries Optional</em>'.
	 * @generated
	 */
	EncountersSectionEntriesOptional createEncountersSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Immunizations Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunizations Section Entries Optional</em>'.
	 * @generated
	 */
	ImmunizationsSectionEntriesOptional createImmunizationsSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payers Section</em>'.
	 * @generated
	 */
	PayersSection createPayersSection();

	/**
	 * Returns a new object of class '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Activity</em>'.
	 * @generated
	 */
	CoverageActivity createCoverageActivity();

	/**
	 * Returns a new object of class '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Activity</em>'.
	 * @generated
	 */
	PolicyActivity createPolicyActivity();

	/**
	 * Returns a new object of class '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Activity</em>'.
	 * @generated
	 */
	AuthorizationActivity createAuthorizationActivity();

	/**
	 * Returns a new object of class '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Section</em>'.
	 * @generated
	 */
	MedicationsSection createMedicationsSection();

	/**
	 * Returns a new object of class '<em>Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Section Entries Optional</em>'.
	 * @generated
	 */
	MedicationsSectionEntriesOptional createMedicationsSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Section</em>'.
	 * @generated
	 */
	PlanOfCareSection createPlanOfCareSection();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Act</em>'.
	 * @generated
	 */
	PlanOfCareActivityAct createPlanOfCareActivityAct();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Encounter</em>'.
	 * @generated
	 */
	PlanOfCareActivityEncounter createPlanOfCareActivityEncounter();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Observation</em>'.
	 * @generated
	 */
	PlanOfCareActivityObservation createPlanOfCareActivityObservation();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Procedure</em>'.
	 * @generated
	 */
	PlanOfCareActivityProcedure createPlanOfCareActivityProcedure();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Substance Administration</em>'.
	 * @generated
	 */
	PlanOfCareActivitySubstanceAdministration createPlanOfCareActivitySubstanceAdministration();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Supply</em>'.
	 * @generated
	 */
	PlanOfCareActivitySupply createPlanOfCareActivitySupply();

	/**
	 * Returns a new object of class '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedures Section</em>'.
	 * @generated
	 */
	ProceduresSection createProceduresSection();

	/**
	 * Returns a new object of class '<em>Procedures Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedures Section Entries Optional</em>'.
	 * @generated
	 */
	ProceduresSectionEntriesOptional createProceduresSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Activity Observation</em>'.
	 * @generated
	 */
	ProcedureActivityObservation createProcedureActivityObservation();

	/**
	 * Returns a new object of class '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Activity Act</em>'.
	 * @generated
	 */
	ProcedureActivityAct createProcedureActivityAct();

	/**
	 * Returns a new object of class '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Activity Procedure</em>'.
	 * @generated
	 */
	ProcedureActivityProcedure createProcedureActivityProcedure();

	/**
	 * Returns a new object of class '<em>Vital Signs Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Section Entries Optional</em>'.
	 * @generated
	 */
	VitalSignsSectionEntriesOptional createVitalSignsSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Section</em>'.
	 * @generated
	 */
	FamilyHistorySection createFamilyHistorySection();

	/**
	 * Returns a new object of class '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Organizer</em>'.
	 * @generated
	 */
	FamilyHistoryOrganizer createFamilyHistoryOrganizer();

	/**
	 * Returns a new object of class '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Observation</em>'.
	 * @generated
	 */
	FamilyHistoryObservation createFamilyHistoryObservation();

	/**
	 * Returns a new object of class '<em>Family History Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Death Observation</em>'.
	 * @generated
	 */
	FamilyHistoryDeathObservation createFamilyHistoryDeathObservation();

	/**
	 * Returns a new object of class '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Section</em>'.
	 * @generated
	 */
	SocialHistorySection createSocialHistorySection();

	/**
	 * Returns a new object of class '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Observation</em>'.
	 * @generated
	 */
	SocialHistoryObservation createSocialHistoryObservation();

	/**
	 * Returns a new object of class '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregnancy Observation</em>'.
	 * @generated
	 */
	PregnancyObservation createPregnancyObservation();

	/**
	 * Returns a new object of class '<em>Estimated Date Of Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estimated Date Of Delivery</em>'.
	 * @generated
	 */
	EstimatedDateOfDelivery createEstimatedDateOfDelivery();

	/**
	 * Returns a new object of class '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results Section</em>'.
	 * @generated
	 */
	ResultsSection createResultsSection();

	/**
	 * Returns a new object of class '<em>Results Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results Section Entries Optional</em>'.
	 * @generated
	 */
	ResultsSectionEntriesOptional createResultsSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Organizer</em>'.
	 * @generated
	 */
	ResultOrganizer createResultOrganizer();

	/**
	 * Returns a new object of class '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Observation</em>'.
	 * @generated
	 */
	ResultObservation createResultObservation();

	/**
	 * Returns a new object of class '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medical Equipment Section</em>'.
	 * @generated
	 */
	MedicalEquipmentSection createMedicalEquipmentSection();

	/**
	 * Returns a new object of class '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Status Section</em>'.
	 * @generated
	 */
	FunctionalStatusSection createFunctionalStatusSection();

	/**
	 * Returns a new object of class '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Section</em>'.
	 * @generated
	 */
	ProblemSection createProblemSection();

	/**
	 * Returns a new object of class '<em>Problem Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Section Entries Optional</em>'.
	 * @generated
	 */
	ProblemSectionEntriesOptional createProblemSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Social History Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Status Observation</em>'.
	 * @generated
	 */
	SocialHistoryStatusObservation createSocialHistoryStatusObservation();

	/**
	 * Returns a new object of class '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purpose Section</em>'.
	 * @generated
	 */
	PurposeSection createPurposeSection();

	/**
	 * Returns a new object of class '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purpose Activity</em>'.
	 * @generated
	 */
	PurposeActivity createPurposeActivity();

	/**
	 * Returns a new object of class '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directives Section</em>'.
	 * @generated
	 */
	AdvanceDirectivesSection createAdvanceDirectivesSection();

	/**
	 * Returns a new object of class '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Observation</em>'.
	 * @generated
	 */
	AdvanceDirectiveObservation createAdvanceDirectiveObservation();

	/**
	 * Returns a new object of class '<em>Advance Directive Observation Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Observation Reference</em>'.
	 * @generated
	 */
	AdvanceDirectiveObservation_Reference createAdvanceDirectiveObservation_Reference();

	/**
	 * Returns a new object of class '<em>Reference External Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference External Document</em>'.
	 * @generated
	 */
	Reference_ExternalDocument createReference_ExternalDocument();

	/**
	 * Returns a new object of class '<em>Advance Directive Observation Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Observation Custodian</em>'.
	 * @generated
	 */
	AdvanceDirectiveObservation_Custodian createAdvanceDirectiveObservation_Custodian();

	/**
	 * Returns a new object of class '<em>Custodian Custodian Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custodian Custodian Role</em>'.
	 * @generated
	 */
	Custodian_CustodianRole createCustodian_CustodianRole();

	/**
	 * Returns a new object of class '<em>Custodian Role Custodian Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custodian Role Custodian Entity</em>'.
	 * @generated
	 */
	CustodianRole_CustodianEntity createCustodianRole_CustodianEntity();

	/**
	 * Returns a new object of class '<em>Advance Directive Observation Verifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Observation Verifier</em>'.
	 * @generated
	 */
	AdvanceDirectiveObservation_Verifier createAdvanceDirectiveObservation_Verifier();

	/**
	 * Returns a new object of class '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Verification</em>'.
	 * @generated
	 */
	AdvanceDirectiveVerification createAdvanceDirectiveVerification();

	/**
	 * Returns a new object of class '<em>Advance Directive Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Status Observation</em>'.
	 * @generated
	 */
	AdvanceDirectiveStatusObservation createAdvanceDirectiveStatusObservation();

	/**
	 * Returns a new object of class '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Section</em>'.
	 * @generated
	 */
	EncountersSection createEncountersSection();

	/**
	 * Returns a new object of class '<em>Encounter Activities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Activities</em>'.
	 * @generated
	 */
	EncounterActivities createEncounterActivities();

	/**
	 * Returns a new object of class '<em>Service Delivery Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Delivery Location</em>'.
	 * @generated
	 */
	ServiceDeliveryLocation createServiceDeliveryLocation();

	/**
	 * Returns a new object of class '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter</em>'.
	 * @generated
	 */
	Encounter createEncounter();

	/**
	 * Returns a new object of class '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunizations Section</em>'.
	 * @generated
	 */
	ImmunizationsSection createImmunizationsSection();

	/**
	 * Returns a new object of class '<em>Immunization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Activity</em>'.
	 * @generated
	 */
	ImmunizationActivity createImmunizationActivity();

	/**
	 * Returns a new object of class '<em>Immunization Refusal Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Refusal Reason</em>'.
	 * @generated
	 */
	ImmunizationRefusalReason createImmunizationRefusalReason();

	/**
	 * Returns a new object of class '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Provider</em>'.
	 * @generated
	 */
	InsuranceProvider createInsuranceProvider();

	/**
	 * Returns a new object of class '<em>Payer Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payer Entry</em>'.
	 * @generated
	 */
	PayerEntry createPayerEntry();

	/**
	 * Returns a new object of class '<em>Covered Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Covered Party</em>'.
	 * @generated
	 */
	CoveredParty createCoveredParty();

	/**
	 * Returns a new object of class '<em>Policy Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Subscriber</em>'.
	 * @generated
	 */
	PolicySubscriber createPolicySubscriber();

	/**
	 * Returns a new object of class '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference</em>'.
	 * @generated
	 */
	ExternalReference createExternalReference();

	/**
	 * Returns a new object of class '<em>Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support</em>'.
	 * @generated
	 */
	Support createSupport();

	/**
	 * Returns a new object of class '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Section</em>'.
	 * @generated
	 */
	VitalSignsSection createVitalSignsSection();

	/**
	 * Returns a new object of class '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Organizer</em>'.
	 * @generated
	 */
	VitalSignsOrganizer createVitalSignsOrganizer();

	/**
	 * Returns a new object of class '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Sign Observation</em>'.
	 * @generated
	 */
	VitalSignObservation createVitalSignObservation();

	/**
	 * Returns a new object of class '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Past Illness Section</em>'.
	 * @generated
	 */
	HistoryOfPastIllnessSection createHistoryOfPastIllnessSection();

	/**
	 * Returns a new object of class '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chief Complaint Section</em>'.
	 * @generated
	 */
	ChiefComplaintSection createChiefComplaintSection();

	/**
	 * Returns a new object of class '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reason For Referral Section</em>'.
	 * @generated
	 */
	ReasonForReferralSection createReasonForReferralSection();

	/**
	 * Returns a new object of class '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Present Illness</em>'.
	 * @generated
	 */
	HistoryOfPresentIllness createHistoryOfPresentIllness();

	/**
	 * Returns a new object of class '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Admission Diagnosis Section</em>'.
	 * @generated
	 */
	HospitalAdmissionDiagnosisSection createHospitalAdmissionDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Diagnosis Section</em>'.
	 * @generated
	 */
	HospitalDischargeDiagnosisSection createHospitalDischargeDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Hospital Admission Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Admission Medications Section Entries Optional</em>'.
	 * @generated
	 */
	HospitalAdmissionMedicationsSectionEntriesOptional createHospitalAdmissionMedicationsSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Medications Section</em>'.
	 * @generated
	 */
	HospitalDischargeMedicationsSection createHospitalDischargeMedicationsSection();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Physical Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Physical Section</em>'.
	 * @generated
	 */
	HospitalDischargePhysicalSection createHospitalDischargePhysicalSection();

	/**
	 * Returns a new object of class '<em>Chief Complaint And Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chief Complaint And Reason For Visit Section</em>'.
	 * @generated
	 */
	ChiefComplaintAndReasonForVisitSection createChiefComplaintAndReasonForVisitSection();

	/**
	 * Returns a new object of class '<em>Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reason For Visit Section</em>'.
	 * @generated
	 */
	ReasonForVisitSection createReasonForVisitSection();

	/**
	 * Returns a new object of class '<em>Related Informant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Informant</em>'.
	 * @generated
	 */
	RelatedInformant createRelatedInformant();

	/**
	 * Returns a new object of class '<em>Encounter Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Performer</em>'.
	 * @generated
	 */
	EncounterPerformer createEncounterPerformer();

	/**
	 * Returns a new object of class '<em>Encounter Performer Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Performer Assigned Entity</em>'.
	 * @generated
	 */
	EncounterPerformerAssignedEntity createEncounterPerformerAssignedEntity();

	/**
	 * Returns a new object of class '<em>Allergy Observation Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Observation Participant</em>'.
	 * @generated
	 */
	AllergyObservationParticipant createAllergyObservationParticipant();

	/**
	 * Returns a new object of class '<em>Allergy Observation Participant Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Observation Participant Role</em>'.
	 * @generated
	 */
	AllergyObservationParticipantRole createAllergyObservationParticipantRole();

	/**
	 * Returns a new object of class '<em>Allergy Observation Playing Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Observation Playing Entity</em>'.
	 * @generated
	 */
	AllergyObservationPlayingEntity createAllergyObservationPlayingEntity();

	/**
	 * Returns a new object of class '<em>Anesthesia Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anesthesia Section</em>'.
	 * @generated
	 */
	AnesthesiaSection createAnesthesiaSection();

	/**
	 * Returns a new object of class '<em>Complications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complications Section</em>'.
	 * @generated
	 */
	ComplicationsSection createComplicationsSection();

	/**
	 * Returns a new object of class '<em>DICOM Object Catalog Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DICOM Object Catalog Section</em>'.
	 * @generated
	 */
	DICOMObjectCatalogSection createDICOMObjectCatalogSection();

	/**
	 * Returns a new object of class '<em>Findings Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Findings Section</em>'.
	 * @generated
	 */
	FindingsSection createFindingsSection();

	/**
	 * Returns a new object of class '<em>Hospital Consultations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Consultations Section</em>'.
	 * @generated
	 */
	HospitalConsultationsSection createHospitalConsultationsSection();

	/**
	 * Returns a new object of class '<em>Interventions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interventions Section</em>'.
	 * @generated
	 */
	InterventionsSection createInterventionsSection();

	/**
	 * Returns a new object of class '<em>Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medical History Section</em>'.
	 * @generated
	 */
	MedicalHistorySection createMedicalHistorySection();

	/**
	 * Returns a new object of class '<em>Objective Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Section</em>'.
	 * @generated
	 */
	ObjectiveSection createObjectiveSection();

	/**
	 * Returns a new object of class '<em>Operative Note Fluid Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operative Note Fluid Section</em>'.
	 * @generated
	 */
	OperativeNoteFluidSection createOperativeNoteFluidSection();

	/**
	 * Returns a new object of class '<em>Operative Note Surgical Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operative Note Surgical Procedure Section</em>'.
	 * @generated
	 */
	OperativeNoteSurgicalProcedureSection createOperativeNoteSurgicalProcedureSection();

	/**
	 * Returns a new object of class '<em>Planned Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Procedure Section</em>'.
	 * @generated
	 */
	PlannedProcedureSection createPlannedProcedureSection();

	/**
	 * Returns a new object of class '<em>Postoperative Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postoperative Diagnosis Section</em>'.
	 * @generated
	 */
	PostoperativeDiagnosisSection createPostoperativeDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Postprocedure Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postprocedure Diagnosis Section</em>'.
	 * @generated
	 */
	PostprocedureDiagnosisSection createPostprocedureDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Preoperative Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preoperative Diagnosis Section</em>'.
	 * @generated
	 */
	PreoperativeDiagnosisSection createPreoperativeDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Procedure Description Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Description Section</em>'.
	 * @generated
	 */
	ProcedureDescriptionSection createProcedureDescriptionSection();

	/**
	 * Returns a new object of class '<em>Procedure Disposition Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Disposition Section</em>'.
	 * @generated
	 */
	ProcedureDispositionSection createProcedureDispositionSection();

	/**
	 * Returns a new object of class '<em>Procedure Estimated Blood Loss Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Estimated Blood Loss Section</em>'.
	 * @generated
	 */
	ProcedureEstimatedBloodLossSection createProcedureEstimatedBloodLossSection();

	/**
	 * Returns a new object of class '<em>Procedure Findings Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Findings Section</em>'.
	 * @generated
	 */
	ProcedureFindingsSection createProcedureFindingsSection();

	/**
	 * Returns a new object of class '<em>Procedure Implants Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Implants Section</em>'.
	 * @generated
	 */
	ProcedureImplantsSection createProcedureImplantsSection();

	/**
	 * Returns a new object of class '<em>Procedure Indications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Indications Section</em>'.
	 * @generated
	 */
	ProcedureIndicationsSection createProcedureIndicationsSection();

	/**
	 * Returns a new object of class '<em>Procedure Specimens Taken Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Specimens Taken Section</em>'.
	 * @generated
	 */
	ProcedureSpecimensTakenSection createProcedureSpecimensTakenSection();

	/**
	 * Returns a new object of class '<em>Subjective Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subjective Section</em>'.
	 * @generated
	 */
	SubjectiveSection createSubjectiveSection();

	/**
	 * Returns a new object of class '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Administered Section</em>'.
	 * @generated
	 */
	MedicationsAdministeredSection createMedicationsAdministeredSection();

	/**
	 * Returns a new object of class '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Exam Section</em>'.
	 * @generated
	 */
	PhysicalExamSection createPhysicalExamSection();

	/**
	 * Returns a new object of class '<em>General Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Status Section</em>'.
	 * @generated
	 */
	GeneralStatusSection createGeneralStatusSection();

	/**
	 * Returns a new object of class '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Review Of Systems Section</em>'.
	 * @generated
	 */
	ReviewOfSystemsSection createReviewOfSystemsSection();

	/**
	 * Returns a new object of class '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Course Section</em>'.
	 * @generated
	 */
	HospitalCourseSection createHospitalCourseSection();

	/**
	 * Returns a new object of class '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment And Plan Section</em>'.
	 * @generated
	 */
	AssessmentAndPlanSection createAssessmentAndPlanSection();

	/**
	 * Returns a new object of class '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Spoken</em>'.
	 * @generated
	 */
	LanguageSpoken createLanguageSpoken();

	/**
	 * Returns a new object of class '<em>Healthcare Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Provider</em>'.
	 * @generated
	 */
	HealthcareProvider createHealthcareProvider();

	/**
	 * Returns a new object of class '<em>Medication Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Tapered Dose</em>'.
	 * @generated
	 */
	MedicationTaperedDose createMedicationTaperedDose();

	/**
	 * Returns a new object of class '<em>Support Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support Guardian</em>'.
	 * @generated
	 */
	SupportGuardian createSupportGuardian();

	/**
	 * Returns a new object of class '<em>Support Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support Participant</em>'.
	 * @generated
	 */
	SupportParticipant createSupportParticipant();

	/**
	 * Returns a new object of class '<em>Surgical Drains Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surgical Drains Section</em>'.
	 * @generated
	 */
	SurgicalDrainsSection createSurgicalDrainsSection();

	/**
	 * Returns a new object of class '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured Document</em>'.
	 * @generated
	 */
	UnstructuredDocument createUnstructuredDocument();

	/**
	 * Returns a new object of class '<em>Scan Original Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scan Original Author</em>'.
	 * @generated
	 */
	ScanOriginalAuthor createScanOriginalAuthor();

	/**
	 * Returns a new object of class '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scanning Device</em>'.
	 * @generated
	 */
	ScanningDevice createScanningDevice();

	/**
	 * Returns a new object of class '<em>Scan Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scan Data Enterer</em>'.
	 * @generated
	 */
	ScanDataEnterer createScanDataEnterer();

	/**
	 * Returns a new object of class '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Information</em>'.
	 * @generated
	 */
	MedicationInformation createMedicationInformation();

	/**
	 * Returns a new object of class '<em>Unstructured Or Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured Or Scanned Document</em>'.
	 * @generated
	 */
	UnstructuredOrScannedDocument createUnstructuredOrScannedDocument();

	/**
	 * Returns a new object of class '<em>Referral Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referral Summary</em>'.
	 * @generated
	 */
	ReferralSummary createReferralSummary();

	/**
	 * Returns a new object of class '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Summary</em>'.
	 * @generated
	 */
	DischargeSummary createDischargeSummary();

	/**
	 * Returns a new object of class '<em>Discharge Diet Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Diet Section</em>'.
	 * @generated
	 */
	DischargeDietSection createDischargeDietSection();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Medications Section Entries Optional</em>'.
	 * @generated
	 */
	HospitalDischargeMedicationsSectionEntriesOptional createHospitalDischargeMedicationsSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Precondition For Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition For Substance Administration</em>'.
	 * @generated
	 */
	PreconditionForSubstanceAdministration createPreconditionForSubstanceAdministration();

	/**
	 * Returns a new object of class '<em>Immunization Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Medication Information</em>'.
	 * @generated
	 */
	ImmunizationMedicationInformation createImmunizationMedicationInformation();

	/**
	 * Returns a new object of class '<em>Procedure Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Specimen</em>'.
	 * @generated
	 */
	ProcedureSpecimen createProcedureSpecimen();

	/**
	 * Returns a new object of class '<em>Procedure Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Performer</em>'.
	 * @generated
	 */
	ProcedurePerformer createProcedurePerformer();

	/**
	 * Returns a new object of class '<em>Procedure Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Encounter</em>'.
	 * @generated
	 */
	ProcedureEncounter createProcedureEncounter();

	/**
	 * Returns a new object of class '<em>Medication Information Manufactured Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Information Manufactured Material</em>'.
	 * @generated
	 */
	MedicationInformationManufacturedMaterial createMedicationInformationManufacturedMaterial();

	/**
	 * Returns a new object of class '<em>Family History Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Subject</em>'.
	 * @generated
	 */
	FamilyHistorySubject createFamilyHistorySubject();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Studies Summary Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Studies Summary Section</em>'.
	 * @generated
	 */
	HospitalDischargeStudiesSummarySection createHospitalDischargeStudiesSummarySection();

	/**
	 * Returns a new object of class '<em>Discharge Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Medication</em>'.
	 * @generated
	 */
	DischargeMedication createDischargeMedication();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Diagnosis</em>'.
	 * @generated
	 */
	HospitalDischargeDiagnosis createHospitalDischargeDiagnosis();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Instructions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Instructions Section</em>'.
	 * @generated
	 */
	HospitalDischargeInstructionsSection createHospitalDischargeInstructionsSection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConsolPackage getConsolPackage();

} // ConsolFactory
