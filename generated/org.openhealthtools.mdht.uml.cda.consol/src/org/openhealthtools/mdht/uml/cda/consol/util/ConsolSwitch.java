/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage
 * @generated
 */
public class ConsolSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConsolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolSwitch() {
		if (modelPackage == null) {
			modelPackage = ConsolPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS: {
				GeneralHeaderConstraints generalHeaderConstraints = (GeneralHeaderConstraints)theEObject;
				T result = caseGeneralHeaderConstraints(generalHeaderConstraints);
				if (result == null) result = caseClinicalDocument(generalHeaderConstraints);
				if (result == null) result = caseAct(generalHeaderConstraints);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET: {
				GeneralHeaderConstraints_RecordTarget generalHeaderConstraints_RecordTarget = (GeneralHeaderConstraints_RecordTarget)theEObject;
				T result = caseGeneralHeaderConstraints_RecordTarget(generalHeaderConstraints_RecordTarget);
				if (result == null) result = caseRecordTarget(generalHeaderConstraints_RecordTarget);
				if (result == null) result = caseParticipation(generalHeaderConstraints_RecordTarget);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints_RecordTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.RECORD_TARGET_PATIENT_ROLE: {
				RecordTarget_PatientRole recordTarget_PatientRole = (RecordTarget_PatientRole)theEObject;
				T result = caseRecordTarget_PatientRole(recordTarget_PatientRole);
				if (result == null) result = casePatientRole(recordTarget_PatientRole);
				if (result == null) result = caseRole(recordTarget_PatientRole);
				if (result == null) result = caseInfrastructureRoot(recordTarget_PatientRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PATIENT_ROLE_PATIENT: {
				PatientRole_Patient patientRole_Patient = (PatientRole_Patient)theEObject;
				T result = casePatientRole_Patient(patientRole_Patient);
				if (result == null) result = casePatient(patientRole_Patient);
				if (result == null) result = caseEntity(patientRole_Patient);
				if (result == null) result = caseInfrastructureRoot(patientRole_Patient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PATIENT_GUARDIAN: {
				Patient_Guardian patient_Guardian = (Patient_Guardian)theEObject;
				T result = casePatient_Guardian(patient_Guardian);
				if (result == null) result = caseGuardian(patient_Guardian);
				if (result == null) result = caseRole(patient_Guardian);
				if (result == null) result = caseInfrastructureRoot(patient_Guardian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PATIENT_LANGUAGE_COMMUNICATION: {
				Patient_LanguageCommunication patient_LanguageCommunication = (Patient_LanguageCommunication)theEObject;
				T result = casePatient_LanguageCommunication(patient_LanguageCommunication);
				if (result == null) result = caseLanguageCommunication(patient_LanguageCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PATIENT_BIRTHPLACE: {
				Patient_Birthplace patient_Birthplace = (Patient_Birthplace)theEObject;
				T result = casePatient_Birthplace(patient_Birthplace);
				if (result == null) result = caseBirthplace(patient_Birthplace);
				if (result == null) result = caseRole(patient_Birthplace);
				if (result == null) result = caseInfrastructureRoot(patient_Birthplace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.BIRTHPLACE_PLACE: {
				Birthplace_Place birthplace_Place = (Birthplace_Place)theEObject;
				T result = caseBirthplace_Place(birthplace_Place);
				if (result == null) result = casePlace(birthplace_Place);
				if (result == null) result = caseEntity(birthplace_Place);
				if (result == null) result = caseInfrastructureRoot(birthplace_Place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PATIENT_ROLE_PROVIDER_ORGANIZATION: {
				PatientRole_ProviderOrganization patientRole_ProviderOrganization = (PatientRole_ProviderOrganization)theEObject;
				T result = casePatientRole_ProviderOrganization(patientRole_ProviderOrganization);
				if (result == null) result = caseOrganization(patientRole_ProviderOrganization);
				if (result == null) result = caseEntity(patientRole_ProviderOrganization);
				if (result == null) result = caseInfrastructureRoot(patientRole_ProviderOrganization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF: {
				GeneralHeaderConstraints_ComponentOf generalHeaderConstraints_ComponentOf = (GeneralHeaderConstraints_ComponentOf)theEObject;
				T result = caseGeneralHeaderConstraints_ComponentOf(generalHeaderConstraints_ComponentOf);
				if (result == null) result = caseComponent1(generalHeaderConstraints_ComponentOf);
				if (result == null) result = caseActRelationship(generalHeaderConstraints_ComponentOf);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints_ComponentOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER: {
				ComponentOf_EncompassingEncounter componentOf_EncompassingEncounter = (ComponentOf_EncompassingEncounter)theEObject;
				T result = caseComponentOf_EncompassingEncounter(componentOf_EncompassingEncounter);
				if (result == null) result = caseEncompassingEncounter(componentOf_EncompassingEncounter);
				if (result == null) result = caseAct(componentOf_EncompassingEncounter);
				if (result == null) result = caseInfrastructureRoot(componentOf_EncompassingEncounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_AUTHOR: {
				GeneralHeaderConstraints_Author generalHeaderConstraints_Author = (GeneralHeaderConstraints_Author)theEObject;
				T result = caseGeneralHeaderConstraints_Author(generalHeaderConstraints_Author);
				if (result == null) result = caseAuthor(generalHeaderConstraints_Author);
				if (result == null) result = caseParticipation(generalHeaderConstraints_Author);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints_Author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.AUTHOR_ASSIGNED_AUTHOR: {
				Author_AssignedAuthor author_AssignedAuthor = (Author_AssignedAuthor)theEObject;
				T result = caseAuthor_AssignedAuthor(author_AssignedAuthor);
				if (result == null) result = caseAssignedAuthor(author_AssignedAuthor);
				if (result == null) result = caseRole(author_AssignedAuthor);
				if (result == null) result = caseInfrastructureRoot(author_AssignedAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ASSIGNED_AUTHOR_AUTHORING_DEVICE: {
				AssignedAuthor_AuthoringDevice assignedAuthor_AuthoringDevice = (AssignedAuthor_AuthoringDevice)theEObject;
				T result = caseAssignedAuthor_AuthoringDevice(assignedAuthor_AuthoringDevice);
				if (result == null) result = caseAuthoringDevice(assignedAuthor_AuthoringDevice);
				if (result == null) result = caseEntity(assignedAuthor_AuthoringDevice);
				if (result == null) result = caseInfrastructureRoot(assignedAuthor_AuthoringDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_PERSON: {
				GeneralHeaderConstraints_Person generalHeaderConstraints_Person = (GeneralHeaderConstraints_Person)theEObject;
				T result = caseGeneralHeaderConstraints_Person(generalHeaderConstraints_Person);
				if (result == null) result = casePerson(generalHeaderConstraints_Person);
				if (result == null) result = caseEntity(generalHeaderConstraints_Person);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints_Person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER: {
				GeneralHeaderConstraints_DataEnterer generalHeaderConstraints_DataEnterer = (GeneralHeaderConstraints_DataEnterer)theEObject;
				T result = caseGeneralHeaderConstraints_DataEnterer(generalHeaderConstraints_DataEnterer);
				if (result == null) result = caseDataEnterer(generalHeaderConstraints_DataEnterer);
				if (result == null) result = caseParticipation(generalHeaderConstraints_DataEnterer);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints_DataEnterer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DATA_ENTERER_ASSIGNED_ENTITY: {
				DataEnterer_AssignedEntity dataEnterer_AssignedEntity = (DataEnterer_AssignedEntity)theEObject;
				T result = caseDataEnterer_AssignedEntity(dataEnterer_AssignedEntity);
				if (result == null) result = caseAssignedEntity(dataEnterer_AssignedEntity);
				if (result == null) result = caseRole(dataEnterer_AssignedEntity);
				if (result == null) result = caseInfrastructureRoot(dataEnterer_AssignedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_CUSTODIAN: {
				GeneralHeaderConstraints_Custodian generalHeaderConstraints_Custodian = (GeneralHeaderConstraints_Custodian)theEObject;
				T result = caseGeneralHeaderConstraints_Custodian(generalHeaderConstraints_Custodian);
				if (result == null) result = caseCustodian(generalHeaderConstraints_Custodian);
				if (result == null) result = caseParticipation(generalHeaderConstraints_Custodian);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints_Custodian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.CUSTODIAN_ASSIGNED_CUSTODIAN: {
				Custodian_AssignedCustodian custodian_AssignedCustodian = (Custodian_AssignedCustodian)theEObject;
				T result = caseCustodian_AssignedCustodian(custodian_AssignedCustodian);
				if (result == null) result = caseAssignedCustodian(custodian_AssignedCustodian);
				if (result == null) result = caseRole(custodian_AssignedCustodian);
				if (result == null) result = caseInfrastructureRoot(custodian_AssignedCustodian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION: {
				AssignedCustodian_CustodianOrganization assignedCustodian_CustodianOrganization = (AssignedCustodian_CustodianOrganization)theEObject;
				T result = caseAssignedCustodian_CustodianOrganization(assignedCustodian_CustodianOrganization);
				if (result == null) result = caseCustodianOrganization(assignedCustodian_CustodianOrganization);
				if (result == null) result = caseEntity(assignedCustodian_CustodianOrganization);
				if (result == null) result = caseInfrastructureRoot(assignedCustodian_CustodianOrganization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT: {
				GeneralHeaderConstraints_InformationRecipient generalHeaderConstraints_InformationRecipient = (GeneralHeaderConstraints_InformationRecipient)theEObject;
				T result = caseGeneralHeaderConstraints_InformationRecipient(generalHeaderConstraints_InformationRecipient);
				if (result == null) result = caseInformationRecipient(generalHeaderConstraints_InformationRecipient);
				if (result == null) result = caseParticipation(generalHeaderConstraints_InformationRecipient);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints_InformationRecipient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.INFORMATION_RECIPIENT_INTENDED_RECIPIENT: {
				InformationRecipient_IntendedRecipient informationRecipient_IntendedRecipient = (InformationRecipient_IntendedRecipient)theEObject;
				T result = caseInformationRecipient_IntendedRecipient(informationRecipient_IntendedRecipient);
				if (result == null) result = caseIntendedRecipient(informationRecipient_IntendedRecipient);
				if (result == null) result = caseRole(informationRecipient_IntendedRecipient);
				if (result == null) result = caseInfrastructureRoot(informationRecipient_IntendedRecipient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.INTENDED_RECIPIENT_ORGANIZATION: {
				IntendedRecipient_Organization intendedRecipient_Organization = (IntendedRecipient_Organization)theEObject;
				T result = caseIntendedRecipient_Organization(intendedRecipient_Organization);
				if (result == null) result = caseOrganization(intendedRecipient_Organization);
				if (result == null) result = caseEntity(intendedRecipient_Organization);
				if (result == null) result = caseInfrastructureRoot(intendedRecipient_Organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR: {
				GeneralHeaderConstraints_LegalAuthenticator generalHeaderConstraints_LegalAuthenticator = (GeneralHeaderConstraints_LegalAuthenticator)theEObject;
				T result = caseGeneralHeaderConstraints_LegalAuthenticator(generalHeaderConstraints_LegalAuthenticator);
				if (result == null) result = caseLegalAuthenticator(generalHeaderConstraints_LegalAuthenticator);
				if (result == null) result = caseParticipation(generalHeaderConstraints_LegalAuthenticator);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints_LegalAuthenticator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY: {
				LegalAuthenticator_AssignedEntity legalAuthenticator_AssignedEntity = (LegalAuthenticator_AssignedEntity)theEObject;
				T result = caseLegalAuthenticator_AssignedEntity(legalAuthenticator_AssignedEntity);
				if (result == null) result = caseAssignedEntity(legalAuthenticator_AssignedEntity);
				if (result == null) result = caseRole(legalAuthenticator_AssignedEntity);
				if (result == null) result = caseInfrastructureRoot(legalAuthenticator_AssignedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR: {
				GeneralHeaderConstraints_Authenticator generalHeaderConstraints_Authenticator = (GeneralHeaderConstraints_Authenticator)theEObject;
				T result = caseGeneralHeaderConstraints_Authenticator(generalHeaderConstraints_Authenticator);
				if (result == null) result = caseAuthenticator(generalHeaderConstraints_Authenticator);
				if (result == null) result = caseParticipation(generalHeaderConstraints_Authenticator);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints_Authenticator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.AUTHENTICATOR_ASSIGNED_ENTITY: {
				Authenticator_AssignedEntity authenticator_AssignedEntity = (Authenticator_AssignedEntity)theEObject;
				T result = caseAuthenticator_AssignedEntity(authenticator_AssignedEntity);
				if (result == null) result = caseAssignedEntity(authenticator_AssignedEntity);
				if (result == null) result = caseRole(authenticator_AssignedEntity);
				if (result == null) result = caseInfrastructureRoot(authenticator_AssignedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_INFORMANT: {
				GeneralHeaderConstraints_Informant generalHeaderConstraints_Informant = (GeneralHeaderConstraints_Informant)theEObject;
				T result = caseGeneralHeaderConstraints_Informant(generalHeaderConstraints_Informant);
				if (result == null) result = caseInformant12(generalHeaderConstraints_Informant);
				if (result == null) result = caseParticipation(generalHeaderConstraints_Informant);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints_Informant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.INFORMANT_ASSIGNED_ENTITY: {
				Informant_AssignedEntity informant_AssignedEntity = (Informant_AssignedEntity)theEObject;
				T result = caseInformant_AssignedEntity(informant_AssignedEntity);
				if (result == null) result = caseAssignedEntity(informant_AssignedEntity);
				if (result == null) result = caseRole(informant_AssignedEntity);
				if (result == null) result = caseInfrastructureRoot(informant_AssignedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.INFORMANT_RELATED_ENTITY: {
				Informant_RelatedEntity informant_RelatedEntity = (Informant_RelatedEntity)theEObject;
				T result = caseInformant_RelatedEntity(informant_RelatedEntity);
				if (result == null) result = caseRelatedEntity(informant_RelatedEntity);
				if (result == null) result = caseRole(informant_RelatedEntity);
				if (result == null) result = caseInfrastructureRoot(informant_RelatedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT: {
				GeneralHeaderConstraints_ParticipantSupport generalHeaderConstraints_ParticipantSupport = (GeneralHeaderConstraints_ParticipantSupport)theEObject;
				T result = caseGeneralHeaderConstraints_ParticipantSupport(generalHeaderConstraints_ParticipantSupport);
				if (result == null) result = caseParticipant1(generalHeaderConstraints_ParticipantSupport);
				if (result == null) result = caseParticipation(generalHeaderConstraints_ParticipantSupport);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints_ParticipantSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF: {
				GeneralHeaderConstraints_InFulfillmentOf generalHeaderConstraints_InFulfillmentOf = (GeneralHeaderConstraints_InFulfillmentOf)theEObject;
				T result = caseGeneralHeaderConstraints_InFulfillmentOf(generalHeaderConstraints_InFulfillmentOf);
				if (result == null) result = caseInFulfillmentOf(generalHeaderConstraints_InFulfillmentOf);
				if (result == null) result = caseActRelationship(generalHeaderConstraints_InFulfillmentOf);
				if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints_InFulfillmentOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.IN_FULFILLMENT_OF_ORDER: {
				InFulfillmentOf_Order inFulfillmentOf_Order = (InFulfillmentOf_Order)theEObject;
				T result = caseInFulfillmentOf_Order(inFulfillmentOf_Order);
				if (result == null) result = caseOrder(inFulfillmentOf_Order);
				if (result == null) result = caseAct(inFulfillmentOf_Order);
				if (result == null) result = caseInfrastructureRoot(inFulfillmentOf_Order);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ALLERGY_PROBLEM_ACT: {
				AllergyProblemAct allergyProblemAct = (AllergyProblemAct)theEObject;
				T result = caseAllergyProblemAct(allergyProblemAct);
				if (result == null) result = caseCDA_Act(allergyProblemAct);
				if (result == null) result = caseClinicalStatement(allergyProblemAct);
				if (result == null) result = caseAct(allergyProblemAct);
				if (result == null) result = caseInfrastructureRoot(allergyProblemAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ALLERGY_OBSERVATION: {
				AllergyObservation allergyObservation = (AllergyObservation)theEObject;
				T result = caseAllergyObservation(allergyObservation);
				if (result == null) result = caseObservation(allergyObservation);
				if (result == null) result = caseClinicalStatement(allergyObservation);
				if (result == null) result = caseAct(allergyObservation);
				if (result == null) result = caseInfrastructureRoot(allergyObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.REACTION_OBSERVATION: {
				ReactionObservation reactionObservation = (ReactionObservation)theEObject;
				T result = caseReactionObservation(reactionObservation);
				if (result == null) result = caseObservation(reactionObservation);
				if (result == null) result = caseClinicalStatement(reactionObservation);
				if (result == null) result = caseAct(reactionObservation);
				if (result == null) result = caseInfrastructureRoot(reactionObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SEVERITY_OBSERVATION: {
				SeverityObservation severityObservation = (SeverityObservation)theEObject;
				T result = caseSeverityObservation(severityObservation);
				if (result == null) result = caseObservation(severityObservation);
				if (result == null) result = caseClinicalStatement(severityObservation);
				if (result == null) result = caseAct(severityObservation);
				if (result == null) result = caseInfrastructureRoot(severityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE: {
				ProcedureActivityProcedure procedureActivityProcedure = (ProcedureActivityProcedure)theEObject;
				T result = caseProcedureActivityProcedure(procedureActivityProcedure);
				if (result == null) result = caseProcedure(procedureActivityProcedure);
				if (result == null) result = caseClinicalStatement(procedureActivityProcedure);
				if (result == null) result = caseAct(procedureActivityProcedure);
				if (result == null) result = caseInfrastructureRoot(procedureActivityProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.INDICATION: {
				Indication indication = (Indication)theEObject;
				T result = caseIndication(indication);
				if (result == null) result = caseObservation(indication);
				if (result == null) result = caseClinicalStatement(indication);
				if (result == null) result = caseAct(indication);
				if (result == null) result = caseInfrastructureRoot(indication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SERVICE_DELIVERY_LOCATION: {
				ServiceDeliveryLocation serviceDeliveryLocation = (ServiceDeliveryLocation)theEObject;
				T result = caseServiceDeliveryLocation(serviceDeliveryLocation);
				if (result == null) result = caseParticipantRole(serviceDeliveryLocation);
				if (result == null) result = caseRole(serviceDeliveryLocation);
				if (result == null) result = caseInfrastructureRoot(serviceDeliveryLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATION_ACTIVITY: {
				MedicationActivity medicationActivity = (MedicationActivity)theEObject;
				T result = caseMedicationActivity(medicationActivity);
				if (result == null) result = caseSubstanceAdministration(medicationActivity);
				if (result == null) result = caseClinicalStatement(medicationActivity);
				if (result == null) result = caseAct(medicationActivity);
				if (result == null) result = caseInfrastructureRoot(medicationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATION_SUPPLY_ORDER: {
				MedicationSupplyOrder medicationSupplyOrder = (MedicationSupplyOrder)theEObject;
				T result = caseMedicationSupplyOrder(medicationSupplyOrder);
				if (result == null) result = caseSupply(medicationSupplyOrder);
				if (result == null) result = caseClinicalStatement(medicationSupplyOrder);
				if (result == null) result = caseAct(medicationSupplyOrder);
				if (result == null) result = caseInfrastructureRoot(medicationSupplyOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATION_SUPPLY_ORDER_PRODUCT: {
				MedicationSupplyOrder_Product medicationSupplyOrder_Product = (MedicationSupplyOrder_Product)theEObject;
				T result = caseMedicationSupplyOrder_Product(medicationSupplyOrder_Product);
				if (result == null) result = caseProduct(medicationSupplyOrder_Product);
				if (result == null) result = caseParticipation(medicationSupplyOrder_Product);
				if (result == null) result = caseInfrastructureRoot(medicationSupplyOrder_Product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.INSTRUCTIONS: {
				Instructions instructions = (Instructions)theEObject;
				T result = caseInstructions(instructions);
				if (result == null) result = caseCDA_Act(instructions);
				if (result == null) result = caseClinicalStatement(instructions);
				if (result == null) result = caseAct(instructions);
				if (result == null) result = caseInfrastructureRoot(instructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATION_DISPENSE: {
				MedicationDispense medicationDispense = (MedicationDispense)theEObject;
				T result = caseMedicationDispense(medicationDispense);
				if (result == null) result = caseSupply(medicationDispense);
				if (result == null) result = caseClinicalStatement(medicationDispense);
				if (result == null) result = caseAct(medicationDispense);
				if (result == null) result = caseInfrastructureRoot(medicationDispense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATION_DISPENSE_PRODUCT: {
				MedicationDispense_Product medicationDispense_Product = (MedicationDispense_Product)theEObject;
				T result = caseMedicationDispense_Product(medicationDispense_Product);
				if (result == null) result = caseProduct(medicationDispense_Product);
				if (result == null) result = caseParticipation(medicationDispense_Product);
				if (result == null) result = caseInfrastructureRoot(medicationDispense_Product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DRUG_VEHICLE: {
				DrugVehicle drugVehicle = (DrugVehicle)theEObject;
				T result = caseDrugVehicle(drugVehicle);
				if (result == null) result = caseParticipantRole(drugVehicle);
				if (result == null) result = caseRole(drugVehicle);
				if (result == null) result = caseInfrastructureRoot(drugVehicle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PRODUCT_INSTANCE: {
				ProductInstance productInstance = (ProductInstance)theEObject;
				T result = caseProductInstance(productInstance);
				if (result == null) result = caseParticipantRole(productInstance);
				if (result == null) result = caseRole(productInstance);
				if (result == null) result = caseInfrastructureRoot(productInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PRODUCT_INSTANCE_SCOPING_ENTITY: {
				ProductInstance_ScopingEntity productInstance_ScopingEntity = (ProductInstance_ScopingEntity)theEObject;
				T result = caseProductInstance_ScopingEntity(productInstance_ScopingEntity);
				if (result == null) result = caseCDA_Entity(productInstance_ScopingEntity);
				if (result == null) result = caseEntity(productInstance_ScopingEntity);
				if (result == null) result = caseInfrastructureRoot(productInstance_ScopingEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PRODUCT_INSTANCE_PLAYING_DEVICE: {
				ProductInstance_PlayingDevice productInstance_PlayingDevice = (ProductInstance_PlayingDevice)theEObject;
				T result = caseProductInstance_PlayingDevice(productInstance_PlayingDevice);
				if (result == null) result = caseDevice(productInstance_PlayingDevice);
				if (result == null) result = caseEntity(productInstance_PlayingDevice);
				if (result == null) result = caseInfrastructureRoot(productInstance_PlayingDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ALLERGY_STATUS_OBSERVATION: {
				AllergyStatusObservation allergyStatusObservation = (AllergyStatusObservation)theEObject;
				T result = caseAllergyStatusObservation(allergyStatusObservation);
				if (result == null) result = caseObservation(allergyStatusObservation);
				if (result == null) result = caseClinicalStatement(allergyStatusObservation);
				if (result == null) result = caseAct(allergyStatusObservation);
				if (result == null) result = caseInfrastructureRoot(allergyStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.AGE_OBSERVATION: {
				AgeObservation ageObservation = (AgeObservation)theEObject;
				T result = caseAgeObservation(ageObservation);
				if (result == null) result = caseObservation(ageObservation);
				if (result == null) result = caseClinicalStatement(ageObservation);
				if (result == null) result = caseAct(ageObservation);
				if (result == null) result = caseInfrastructureRoot(ageObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HEALTH_STATUS_OBSERVATION: {
				HealthStatusObservation healthStatusObservation = (HealthStatusObservation)theEObject;
				T result = caseHealthStatusObservation(healthStatusObservation);
				if (result == null) result = caseObservation(healthStatusObservation);
				if (result == null) result = caseClinicalStatement(healthStatusObservation);
				if (result == null) result = caseAct(healthStatusObservation);
				if (result == null) result = caseInfrastructureRoot(healthStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseCDA_Act(comment);
				if (result == null) result = caseClinicalStatement(comment);
				if (result == null) result = caseAct(comment);
				if (result == null) result = caseInfrastructureRoot(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.INTERNAL_REFERENCE: {
				InternalReference internalReference = (InternalReference)theEObject;
				T result = caseInternalReference(internalReference);
				if (result == null) result = caseCDA_Act(internalReference);
				if (result == null) result = caseClinicalStatement(internalReference);
				if (result == null) result = caseAct(internalReference);
				if (result == null) result = caseInfrastructureRoot(internalReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATION_TYPE: {
				MedicationType medicationType = (MedicationType)theEObject;
				T result = caseMedicationType(medicationType);
				if (result == null) result = caseObservation(medicationType);
				if (result == null) result = caseClinicalStatement(medicationType);
				if (result == null) result = caseAct(medicationType);
				if (result == null) result = caseInfrastructureRoot(medicationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.NON_MEDICINAL_SUPPLY_ACTIVITY: {
				NonMedicinalSupplyActivity nonMedicinalSupplyActivity = (NonMedicinalSupplyActivity)theEObject;
				T result = caseNonMedicinalSupplyActivity(nonMedicinalSupplyActivity);
				if (result == null) result = caseSupply(nonMedicinalSupplyActivity);
				if (result == null) result = caseClinicalStatement(nonMedicinalSupplyActivity);
				if (result == null) result = caseAct(nonMedicinalSupplyActivity);
				if (result == null) result = caseInfrastructureRoot(nonMedicinalSupplyActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS: {
				MedicationFullfillmentInstructions medicationFullfillmentInstructions = (MedicationFullfillmentInstructions)theEObject;
				T result = caseMedicationFullfillmentInstructions(medicationFullfillmentInstructions);
				if (result == null) result = caseCDA_Act(medicationFullfillmentInstructions);
				if (result == null) result = caseClinicalStatement(medicationFullfillmentInstructions);
				if (result == null) result = caseAct(medicationFullfillmentInstructions);
				if (result == null) result = caseInfrastructureRoot(medicationFullfillmentInstructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROBLEM_CONCERN_ACT: {
				ProblemConcernAct problemConcernAct = (ProblemConcernAct)theEObject;
				T result = caseProblemConcernAct(problemConcernAct);
				if (result == null) result = caseCDA_Act(problemConcernAct);
				if (result == null) result = caseClinicalStatement(problemConcernAct);
				if (result == null) result = caseAct(problemConcernAct);
				if (result == null) result = caseInfrastructureRoot(problemConcernAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROBLEM_OBSERVATION: {
				ProblemObservation problemObservation = (ProblemObservation)theEObject;
				T result = caseProblemObservation(problemObservation);
				if (result == null) result = caseObservation(problemObservation);
				if (result == null) result = caseClinicalStatement(problemObservation);
				if (result == null) result = caseAct(problemObservation);
				if (result == null) result = caseInfrastructureRoot(problemObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROBLEM_STATUS: {
				ProblemStatus problemStatus = (ProblemStatus)theEObject;
				T result = caseProblemStatus(problemStatus);
				if (result == null) result = caseObservation(problemStatus);
				if (result == null) result = caseClinicalStatement(problemStatus);
				if (result == null) result = caseAct(problemStatus);
				if (result == null) result = caseInfrastructureRoot(problemStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.CONTINUITY_OF_CARE_DOCUMENT: {
				ContinuityOfCareDocument continuityOfCareDocument = (ContinuityOfCareDocument)theEObject;
				T result = caseContinuityOfCareDocument(continuityOfCareDocument);
				if (result == null) result = caseGeneralHeaderConstraints(continuityOfCareDocument);
				if (result == null) result = caseClinicalDocument(continuityOfCareDocument);
				if (result == null) result = caseAct(continuityOfCareDocument);
				if (result == null) result = caseInfrastructureRoot(continuityOfCareDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF: {
				ContinuityOfCareDocument_DocumentationOf continuityOfCareDocument_DocumentationOf = (ContinuityOfCareDocument_DocumentationOf)theEObject;
				T result = caseContinuityOfCareDocument_DocumentationOf(continuityOfCareDocument_DocumentationOf);
				if (result == null) result = caseDocumentationOf(continuityOfCareDocument_DocumentationOf);
				if (result == null) result = caseActRelationship(continuityOfCareDocument_DocumentationOf);
				if (result == null) result = caseInfrastructureRoot(continuityOfCareDocument_DocumentationOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DOCUMENTATION_OF_SERVICE_EVENT3: {
				DocumentationOf_ServiceEvent3 documentationOf_ServiceEvent3 = (DocumentationOf_ServiceEvent3)theEObject;
				T result = caseDocumentationOf_ServiceEvent3(documentationOf_ServiceEvent3);
				if (result == null) result = caseServiceEvent(documentationOf_ServiceEvent3);
				if (result == null) result = caseAct(documentationOf_ServiceEvent3);
				if (result == null) result = caseInfrastructureRoot(documentationOf_ServiceEvent3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SERVICE_EVENT3_PERFORMER: {
				ServiceEvent3_Performer serviceEvent3_Performer = (ServiceEvent3_Performer)theEObject;
				T result = caseServiceEvent3_Performer(serviceEvent3_Performer);
				if (result == null) result = casePerformer1(serviceEvent3_Performer);
				if (result == null) result = caseParticipation(serviceEvent3_Performer);
				if (result == null) result = caseInfrastructureRoot(serviceEvent3_Performer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PERFORMER_ASSIGNED_ENTITY: {
				Performer_AssignedEntity performer_AssignedEntity = (Performer_AssignedEntity)theEObject;
				T result = casePerformer_AssignedEntity(performer_AssignedEntity);
				if (result == null) result = caseAssignedEntity(performer_AssignedEntity);
				if (result == null) result = caseRole(performer_AssignedEntity);
				if (result == null) result = caseInfrastructureRoot(performer_AssignedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.CONTINUITY_OF_CARE_DOCUMENT_AUTHOR: {
				ContinuityOfCareDocument_Author continuityOfCareDocument_Author = (ContinuityOfCareDocument_Author)theEObject;
				T result = caseContinuityOfCareDocument_Author(continuityOfCareDocument_Author);
				if (result == null) result = caseAuthor(continuityOfCareDocument_Author);
				if (result == null) result = caseParticipation(continuityOfCareDocument_Author);
				if (result == null) result = caseInfrastructureRoot(continuityOfCareDocument_Author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.AUTHOR_ASSIGNED_AUTHOR3: {
				Author_AssignedAuthor3 author_AssignedAuthor3 = (Author_AssignedAuthor3)theEObject;
				T result = caseAuthor_AssignedAuthor3(author_AssignedAuthor3);
				if (result == null) result = caseAssignedAuthor(author_AssignedAuthor3);
				if (result == null) result = caseRole(author_AssignedAuthor3);
				if (result == null) result = caseInfrastructureRoot(author_AssignedAuthor3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ALLERGIES_SECTION: {
				AllergiesSection allergiesSection = (AllergiesSection)theEObject;
				T result = caseAllergiesSection(allergiesSection);
				if (result == null) result = caseAllergiesSectionEntriesOptional(allergiesSection);
				if (result == null) result = caseSection(allergiesSection);
				if (result == null) result = caseAct(allergiesSection);
				if (result == null) result = caseInfrastructureRoot(allergiesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL: {
				AllergiesSectionEntriesOptional allergiesSectionEntriesOptional = (AllergiesSectionEntriesOptional)theEObject;
				T result = caseAllergiesSectionEntriesOptional(allergiesSectionEntriesOptional);
				if (result == null) result = caseSection(allergiesSectionEntriesOptional);
				if (result == null) result = caseAct(allergiesSectionEntriesOptional);
				if (result == null) result = caseInfrastructureRoot(allergiesSectionEntriesOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATIONS_SECTION: {
				MedicationsSection medicationsSection = (MedicationsSection)theEObject;
				T result = caseMedicationsSection(medicationsSection);
				if (result == null) result = caseMedicationsSectionEntriesOptional(medicationsSection);
				if (result == null) result = caseSection(medicationsSection);
				if (result == null) result = caseAct(medicationsSection);
				if (result == null) result = caseInfrastructureRoot(medicationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATIONS_SECTION_ENTRIES_OPTIONAL: {
				MedicationsSectionEntriesOptional medicationsSectionEntriesOptional = (MedicationsSectionEntriesOptional)theEObject;
				T result = caseMedicationsSectionEntriesOptional(medicationsSectionEntriesOptional);
				if (result == null) result = caseSection(medicationsSectionEntriesOptional);
				if (result == null) result = caseAct(medicationsSectionEntriesOptional);
				if (result == null) result = caseInfrastructureRoot(medicationsSectionEntriesOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROBLEM_SECTION: {
				ProblemSection problemSection = (ProblemSection)theEObject;
				T result = caseProblemSection(problemSection);
				if (result == null) result = caseProblemSectionEntriesOptional(problemSection);
				if (result == null) result = caseSection(problemSection);
				if (result == null) result = caseAct(problemSection);
				if (result == null) result = caseInfrastructureRoot(problemSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROBLEM_SECTION_ENTRIES_OPTIONAL: {
				ProblemSectionEntriesOptional problemSectionEntriesOptional = (ProblemSectionEntriesOptional)theEObject;
				T result = caseProblemSectionEntriesOptional(problemSectionEntriesOptional);
				if (result == null) result = caseSection(problemSectionEntriesOptional);
				if (result == null) result = caseAct(problemSectionEntriesOptional);
				if (result == null) result = caseInfrastructureRoot(problemSectionEntriesOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURES_SECTION: {
				ProceduresSection proceduresSection = (ProceduresSection)theEObject;
				T result = caseProceduresSection(proceduresSection);
				if (result == null) result = caseProceduresSectionEntriesOptional(proceduresSection);
				if (result == null) result = caseSection(proceduresSection);
				if (result == null) result = caseAct(proceduresSection);
				if (result == null) result = caseInfrastructureRoot(proceduresSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURES_SECTION_ENTRIES_OPTIONAL: {
				ProceduresSectionEntriesOptional proceduresSectionEntriesOptional = (ProceduresSectionEntriesOptional)theEObject;
				T result = caseProceduresSectionEntriesOptional(proceduresSectionEntriesOptional);
				if (result == null) result = caseSection(proceduresSectionEntriesOptional);
				if (result == null) result = caseAct(proceduresSectionEntriesOptional);
				if (result == null) result = caseInfrastructureRoot(proceduresSectionEntriesOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY_OBSERVATION: {
				ProcedureActivityObservation procedureActivityObservation = (ProcedureActivityObservation)theEObject;
				T result = caseProcedureActivityObservation(procedureActivityObservation);
				if (result == null) result = caseObservation(procedureActivityObservation);
				if (result == null) result = caseClinicalStatement(procedureActivityObservation);
				if (result == null) result = caseAct(procedureActivityObservation);
				if (result == null) result = caseInfrastructureRoot(procedureActivityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY_ACT: {
				ProcedureActivityAct procedureActivityAct = (ProcedureActivityAct)theEObject;
				T result = caseProcedureActivityAct(procedureActivityAct);
				if (result == null) result = caseCDA_Act(procedureActivityAct);
				if (result == null) result = caseClinicalStatement(procedureActivityAct);
				if (result == null) result = caseAct(procedureActivityAct);
				if (result == null) result = caseInfrastructureRoot(procedureActivityAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.RESULTS_SECTION: {
				ResultsSection resultsSection = (ResultsSection)theEObject;
				T result = caseResultsSection(resultsSection);
				if (result == null) result = caseResultsSectionEntriesOptional(resultsSection);
				if (result == null) result = caseSection(resultsSection);
				if (result == null) result = caseAct(resultsSection);
				if (result == null) result = caseInfrastructureRoot(resultsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.RESULTS_SECTION_ENTRIES_OPTIONAL: {
				ResultsSectionEntriesOptional resultsSectionEntriesOptional = (ResultsSectionEntriesOptional)theEObject;
				T result = caseResultsSectionEntriesOptional(resultsSectionEntriesOptional);
				if (result == null) result = caseSection(resultsSectionEntriesOptional);
				if (result == null) result = caseAct(resultsSectionEntriesOptional);
				if (result == null) result = caseInfrastructureRoot(resultsSectionEntriesOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.RESULT_ORGANIZER: {
				ResultOrganizer resultOrganizer = (ResultOrganizer)theEObject;
				T result = caseResultOrganizer(resultOrganizer);
				if (result == null) result = caseOrganizer(resultOrganizer);
				if (result == null) result = caseClinicalStatement(resultOrganizer);
				if (result == null) result = caseAct(resultOrganizer);
				if (result == null) result = caseInfrastructureRoot(resultOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.RESULT_OBSERVATION: {
				ResultObservation resultObservation = (ResultObservation)theEObject;
				T result = caseResultObservation(resultObservation);
				if (result == null) result = caseObservation(resultObservation);
				if (result == null) result = caseClinicalStatement(resultObservation);
				if (result == null) result = caseAct(resultObservation);
				if (result == null) result = caseInfrastructureRoot(resultObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION: {
				AdvanceDirectivesSection advanceDirectivesSection = (AdvanceDirectivesSection)theEObject;
				T result = caseAdvanceDirectivesSection(advanceDirectivesSection);
				if (result == null) result = caseAdvanceDirectivesSectionEntriesOptional(advanceDirectivesSection);
				if (result == null) result = caseSection(advanceDirectivesSection);
				if (result == null) result = caseAct(advanceDirectivesSection);
				if (result == null) result = caseInfrastructureRoot(advanceDirectivesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL: {
				AdvanceDirectivesSectionEntriesOptional advanceDirectivesSectionEntriesOptional = (AdvanceDirectivesSectionEntriesOptional)theEObject;
				T result = caseAdvanceDirectivesSectionEntriesOptional(advanceDirectivesSectionEntriesOptional);
				if (result == null) result = caseSection(advanceDirectivesSectionEntriesOptional);
				if (result == null) result = caseAct(advanceDirectivesSectionEntriesOptional);
				if (result == null) result = caseInfrastructureRoot(advanceDirectivesSectionEntriesOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION: {
				AdvanceDirectiveObservation advanceDirectiveObservation = (AdvanceDirectiveObservation)theEObject;
				T result = caseAdvanceDirectiveObservation(advanceDirectiveObservation);
				if (result == null) result = caseObservation(advanceDirectiveObservation);
				if (result == null) result = caseClinicalStatement(advanceDirectiveObservation);
				if (result == null) result = caseAct(advanceDirectiveObservation);
				if (result == null) result = caseInfrastructureRoot(advanceDirectiveObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE: {
				AdvanceDirectiveObservation_Reference advanceDirectiveObservation_Reference = (AdvanceDirectiveObservation_Reference)theEObject;
				T result = caseAdvanceDirectiveObservation_Reference(advanceDirectiveObservation_Reference);
				if (result == null) result = caseReference(advanceDirectiveObservation_Reference);
				if (result == null) result = caseActRelationship(advanceDirectiveObservation_Reference);
				if (result == null) result = caseInfrastructureRoot(advanceDirectiveObservation_Reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.REFERENCE_EXTERNAL_DOCUMENT: {
				Reference_ExternalDocument reference_ExternalDocument = (Reference_ExternalDocument)theEObject;
				T result = caseReference_ExternalDocument(reference_ExternalDocument);
				if (result == null) result = caseExternalDocument(reference_ExternalDocument);
				if (result == null) result = caseAct(reference_ExternalDocument);
				if (result == null) result = caseInfrastructureRoot(reference_ExternalDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN: {
				AdvanceDirectiveObservation_Custodian advanceDirectiveObservation_Custodian = (AdvanceDirectiveObservation_Custodian)theEObject;
				T result = caseAdvanceDirectiveObservation_Custodian(advanceDirectiveObservation_Custodian);
				if (result == null) result = caseParticipant2(advanceDirectiveObservation_Custodian);
				if (result == null) result = caseParticipation(advanceDirectiveObservation_Custodian);
				if (result == null) result = caseInfrastructureRoot(advanceDirectiveObservation_Custodian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.CUSTODIAN_CUSTODIAN_ROLE: {
				Custodian_CustodianRole custodian_CustodianRole = (Custodian_CustodianRole)theEObject;
				T result = caseCustodian_CustodianRole(custodian_CustodianRole);
				if (result == null) result = caseParticipantRole(custodian_CustodianRole);
				if (result == null) result = caseRole(custodian_CustodianRole);
				if (result == null) result = caseInfrastructureRoot(custodian_CustodianRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.CUSTODIAN_ROLE_CUSTODIAN_ENTITY: {
				CustodianRole_CustodianEntity custodianRole_CustodianEntity = (CustodianRole_CustodianEntity)theEObject;
				T result = caseCustodianRole_CustodianEntity(custodianRole_CustodianEntity);
				if (result == null) result = casePlayingEntity(custodianRole_CustodianEntity);
				if (result == null) result = caseEntity(custodianRole_CustodianEntity);
				if (result == null) result = caseInfrastructureRoot(custodianRole_CustodianEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER: {
				AdvanceDirectiveObservation_Verifier advanceDirectiveObservation_Verifier = (AdvanceDirectiveObservation_Verifier)theEObject;
				T result = caseAdvanceDirectiveObservation_Verifier(advanceDirectiveObservation_Verifier);
				if (result == null) result = caseParticipant2(advanceDirectiveObservation_Verifier);
				if (result == null) result = caseParticipation(advanceDirectiveObservation_Verifier);
				if (result == null) result = caseInfrastructureRoot(advanceDirectiveObservation_Verifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOUNTERS_SECTION: {
				EncountersSection encountersSection = (EncountersSection)theEObject;
				T result = caseEncountersSection(encountersSection);
				if (result == null) result = caseEncountersSectionEntriesOptional(encountersSection);
				if (result == null) result = caseSection(encountersSection);
				if (result == null) result = caseAct(encountersSection);
				if (result == null) result = caseInfrastructureRoot(encountersSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOUNTERS_SECTION_ENTRIES_OPTIONAL: {
				EncountersSectionEntriesOptional encountersSectionEntriesOptional = (EncountersSectionEntriesOptional)theEObject;
				T result = caseEncountersSectionEntriesOptional(encountersSectionEntriesOptional);
				if (result == null) result = caseSection(encountersSectionEntriesOptional);
				if (result == null) result = caseAct(encountersSectionEntriesOptional);
				if (result == null) result = caseInfrastructureRoot(encountersSectionEntriesOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOUNTER_ACTIVITIES: {
				EncounterActivities encounterActivities = (EncounterActivities)theEObject;
				T result = caseEncounterActivities(encounterActivities);
				if (result == null) result = caseCDA_Encounter(encounterActivities);
				if (result == null) result = caseClinicalStatement(encounterActivities);
				if (result == null) result = caseAct(encounterActivities);
				if (result == null) result = caseInfrastructureRoot(encounterActivities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_SECTION: {
				FamilyHistorySection familyHistorySection = (FamilyHistorySection)theEObject;
				T result = caseFamilyHistorySection(familyHistorySection);
				if (result == null) result = caseSection(familyHistorySection);
				if (result == null) result = caseAct(familyHistorySection);
				if (result == null) result = caseInfrastructureRoot(familyHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_ORGANIZER: {
				FamilyHistoryOrganizer familyHistoryOrganizer = (FamilyHistoryOrganizer)theEObject;
				T result = caseFamilyHistoryOrganizer(familyHistoryOrganizer);
				if (result == null) result = caseOrganizer(familyHistoryOrganizer);
				if (result == null) result = caseClinicalStatement(familyHistoryOrganizer);
				if (result == null) result = caseAct(familyHistoryOrganizer);
				if (result == null) result = caseInfrastructureRoot(familyHistoryOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_OBSERVATION: {
				FamilyHistoryObservation familyHistoryObservation = (FamilyHistoryObservation)theEObject;
				T result = caseFamilyHistoryObservation(familyHistoryObservation);
				if (result == null) result = caseObservation(familyHistoryObservation);
				if (result == null) result = caseClinicalStatement(familyHistoryObservation);
				if (result == null) result = caseAct(familyHistoryObservation);
				if (result == null) result = caseInfrastructureRoot(familyHistoryObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_DEATH_OBSERVATION: {
				FamilyHistoryDeathObservation familyHistoryDeathObservation = (FamilyHistoryDeathObservation)theEObject;
				T result = caseFamilyHistoryDeathObservation(familyHistoryDeathObservation);
				if (result == null) result = caseObservation(familyHistoryDeathObservation);
				if (result == null) result = caseClinicalStatement(familyHistoryDeathObservation);
				if (result == null) result = caseAct(familyHistoryDeathObservation);
				if (result == null) result = caseInfrastructureRoot(familyHistoryDeathObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.FUNCTIONAL_STATUS_SECTION: {
				FunctionalStatusSection functionalStatusSection = (FunctionalStatusSection)theEObject;
				T result = caseFunctionalStatusSection(functionalStatusSection);
				if (result == null) result = caseSection(functionalStatusSection);
				if (result == null) result = caseAct(functionalStatusSection);
				if (result == null) result = caseInfrastructureRoot(functionalStatusSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL: {
				ImmunizationsSectionEntriesOptional immunizationsSectionEntriesOptional = (ImmunizationsSectionEntriesOptional)theEObject;
				T result = caseImmunizationsSectionEntriesOptional(immunizationsSectionEntriesOptional);
				if (result == null) result = caseSection(immunizationsSectionEntriesOptional);
				if (result == null) result = caseAct(immunizationsSectionEntriesOptional);
				if (result == null) result = caseInfrastructureRoot(immunizationsSectionEntriesOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.IMMUNIZATION_ACTIVITY: {
				ImmunizationActivity immunizationActivity = (ImmunizationActivity)theEObject;
				T result = caseImmunizationActivity(immunizationActivity);
				if (result == null) result = caseSubstanceAdministration(immunizationActivity);
				if (result == null) result = caseClinicalStatement(immunizationActivity);
				if (result == null) result = caseAct(immunizationActivity);
				if (result == null) result = caseInfrastructureRoot(immunizationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.IMMUNIZATION_REFUSAL_REASON: {
				ImmunizationRefusalReason immunizationRefusalReason = (ImmunizationRefusalReason)theEObject;
				T result = caseImmunizationRefusalReason(immunizationRefusalReason);
				if (result == null) result = caseObservation(immunizationRefusalReason);
				if (result == null) result = caseClinicalStatement(immunizationRefusalReason);
				if (result == null) result = caseAct(immunizationRefusalReason);
				if (result == null) result = caseInfrastructureRoot(immunizationRefusalReason);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICAL_EQUIPMENT_SECTION: {
				MedicalEquipmentSection medicalEquipmentSection = (MedicalEquipmentSection)theEObject;
				T result = caseMedicalEquipmentSection(medicalEquipmentSection);
				if (result == null) result = caseSection(medicalEquipmentSection);
				if (result == null) result = caseAct(medicalEquipmentSection);
				if (result == null) result = caseInfrastructureRoot(medicalEquipmentSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PAYERS_SECTION: {
				PayersSection payersSection = (PayersSection)theEObject;
				T result = casePayersSection(payersSection);
				if (result == null) result = caseSection(payersSection);
				if (result == null) result = caseAct(payersSection);
				if (result == null) result = caseInfrastructureRoot(payersSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.COVERAGE_ACTIVITY: {
				CoverageActivity coverageActivity = (CoverageActivity)theEObject;
				T result = caseCoverageActivity(coverageActivity);
				if (result == null) result = caseCDA_Act(coverageActivity);
				if (result == null) result = caseClinicalStatement(coverageActivity);
				if (result == null) result = caseAct(coverageActivity);
				if (result == null) result = caseInfrastructureRoot(coverageActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.POLICY_ACTIVITY: {
				PolicyActivity policyActivity = (PolicyActivity)theEObject;
				T result = casePolicyActivity(policyActivity);
				if (result == null) result = caseCDA_Act(policyActivity);
				if (result == null) result = caseClinicalStatement(policyActivity);
				if (result == null) result = caseAct(policyActivity);
				if (result == null) result = caseInfrastructureRoot(policyActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.AUTHORIZATION_ACTIVITY: {
				AuthorizationActivity authorizationActivity = (AuthorizationActivity)theEObject;
				T result = caseAuthorizationActivity(authorizationActivity);
				if (result == null) result = caseCDA_Act(authorizationActivity);
				if (result == null) result = caseClinicalStatement(authorizationActivity);
				if (result == null) result = caseAct(authorizationActivity);
				if (result == null) result = caseInfrastructureRoot(authorizationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_SECTION: {
				PlanOfCareSection planOfCareSection = (PlanOfCareSection)theEObject;
				T result = casePlanOfCareSection(planOfCareSection);
				if (result == null) result = caseSection(planOfCareSection);
				if (result == null) result = caseAct(planOfCareSection);
				if (result == null) result = caseInfrastructureRoot(planOfCareSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT: {
				PlanOfCareActivityAct planOfCareActivityAct = (PlanOfCareActivityAct)theEObject;
				T result = casePlanOfCareActivityAct(planOfCareActivityAct);
				if (result == null) result = caseCDA_Act(planOfCareActivityAct);
				if (result == null) result = caseClinicalStatement(planOfCareActivityAct);
				if (result == null) result = caseAct(planOfCareActivityAct);
				if (result == null) result = caseInfrastructureRoot(planOfCareActivityAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER: {
				PlanOfCareActivityEncounter planOfCareActivityEncounter = (PlanOfCareActivityEncounter)theEObject;
				T result = casePlanOfCareActivityEncounter(planOfCareActivityEncounter);
				if (result == null) result = caseCDA_Encounter(planOfCareActivityEncounter);
				if (result == null) result = caseClinicalStatement(planOfCareActivityEncounter);
				if (result == null) result = caseAct(planOfCareActivityEncounter);
				if (result == null) result = caseInfrastructureRoot(planOfCareActivityEncounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION: {
				PlanOfCareActivityObservation planOfCareActivityObservation = (PlanOfCareActivityObservation)theEObject;
				T result = casePlanOfCareActivityObservation(planOfCareActivityObservation);
				if (result == null) result = caseObservation(planOfCareActivityObservation);
				if (result == null) result = caseClinicalStatement(planOfCareActivityObservation);
				if (result == null) result = caseAct(planOfCareActivityObservation);
				if (result == null) result = caseInfrastructureRoot(planOfCareActivityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_PROCEDURE: {
				PlanOfCareActivityProcedure planOfCareActivityProcedure = (PlanOfCareActivityProcedure)theEObject;
				T result = casePlanOfCareActivityProcedure(planOfCareActivityProcedure);
				if (result == null) result = caseProcedure(planOfCareActivityProcedure);
				if (result == null) result = caseClinicalStatement(planOfCareActivityProcedure);
				if (result == null) result = caseAct(planOfCareActivityProcedure);
				if (result == null) result = caseInfrastructureRoot(planOfCareActivityProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION: {
				PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration = (PlanOfCareActivitySubstanceAdministration)theEObject;
				T result = casePlanOfCareActivitySubstanceAdministration(planOfCareActivitySubstanceAdministration);
				if (result == null) result = caseSubstanceAdministration(planOfCareActivitySubstanceAdministration);
				if (result == null) result = caseClinicalStatement(planOfCareActivitySubstanceAdministration);
				if (result == null) result = caseAct(planOfCareActivitySubstanceAdministration);
				if (result == null) result = caseInfrastructureRoot(planOfCareActivitySubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_SUPPLY: {
				PlanOfCareActivitySupply planOfCareActivitySupply = (PlanOfCareActivitySupply)theEObject;
				T result = casePlanOfCareActivitySupply(planOfCareActivitySupply);
				if (result == null) result = caseSupply(planOfCareActivitySupply);
				if (result == null) result = caseClinicalStatement(planOfCareActivitySupply);
				if (result == null) result = caseAct(planOfCareActivitySupply);
				if (result == null) result = caseInfrastructureRoot(planOfCareActivitySupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SOCIAL_HISTORY_SECTION: {
				SocialHistorySection socialHistorySection = (SocialHistorySection)theEObject;
				T result = caseSocialHistorySection(socialHistorySection);
				if (result == null) result = caseSection(socialHistorySection);
				if (result == null) result = caseAct(socialHistorySection);
				if (result == null) result = caseInfrastructureRoot(socialHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SOCIAL_HISTORY_OBSERVATION: {
				SocialHistoryObservation socialHistoryObservation = (SocialHistoryObservation)theEObject;
				T result = caseSocialHistoryObservation(socialHistoryObservation);
				if (result == null) result = caseObservation(socialHistoryObservation);
				if (result == null) result = caseClinicalStatement(socialHistoryObservation);
				if (result == null) result = caseAct(socialHistoryObservation);
				if (result == null) result = caseInfrastructureRoot(socialHistoryObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PREGNANCY_OBSERVATION: {
				PregnancyObservation pregnancyObservation = (PregnancyObservation)theEObject;
				T result = casePregnancyObservation(pregnancyObservation);
				if (result == null) result = caseObservation(pregnancyObservation);
				if (result == null) result = caseClinicalStatement(pregnancyObservation);
				if (result == null) result = caseAct(pregnancyObservation);
				if (result == null) result = caseInfrastructureRoot(pregnancyObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ESTIMATED_DATE_OF_DELIVERY: {
				EstimatedDateOfDelivery estimatedDateOfDelivery = (EstimatedDateOfDelivery)theEObject;
				T result = caseEstimatedDateOfDelivery(estimatedDateOfDelivery);
				if (result == null) result = caseObservation(estimatedDateOfDelivery);
				if (result == null) result = caseClinicalStatement(estimatedDateOfDelivery);
				if (result == null) result = caseAct(estimatedDateOfDelivery);
				if (result == null) result = caseInfrastructureRoot(estimatedDateOfDelivery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL: {
				VitalSignsSectionEntriesOptional vitalSignsSectionEntriesOptional = (VitalSignsSectionEntriesOptional)theEObject;
				T result = caseVitalSignsSectionEntriesOptional(vitalSignsSectionEntriesOptional);
				if (result == null) result = caseSection(vitalSignsSectionEntriesOptional);
				if (result == null) result = caseAct(vitalSignsSectionEntriesOptional);
				if (result == null) result = caseInfrastructureRoot(vitalSignsSectionEntriesOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.VITAL_SIGNS_ORGANIZER: {
				VitalSignsOrganizer vitalSignsOrganizer = (VitalSignsOrganizer)theEObject;
				T result = caseVitalSignsOrganizer(vitalSignsOrganizer);
				if (result == null) result = caseOrganizer(vitalSignsOrganizer);
				if (result == null) result = caseClinicalStatement(vitalSignsOrganizer);
				if (result == null) result = caseAct(vitalSignsOrganizer);
				if (result == null) result = caseInfrastructureRoot(vitalSignsOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.VITAL_SIGN_OBSERVATION: {
				VitalSignObservation vitalSignObservation = (VitalSignObservation)theEObject;
				T result = caseVitalSignObservation(vitalSignObservation);
				if (result == null) result = caseObservation(vitalSignObservation);
				if (result == null) result = caseClinicalStatement(vitalSignObservation);
				if (result == null) result = caseAct(vitalSignObservation);
				if (result == null) result = caseInfrastructureRoot(vitalSignObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SOCIAL_HISTORY_STATUS_OBSERVATION: {
				SocialHistoryStatusObservation socialHistoryStatusObservation = (SocialHistoryStatusObservation)theEObject;
				T result = caseSocialHistoryStatusObservation(socialHistoryStatusObservation);
				if (result == null) result = caseObservation(socialHistoryStatusObservation);
				if (result == null) result = caseClinicalStatement(socialHistoryStatusObservation);
				if (result == null) result = caseAct(socialHistoryStatusObservation);
				if (result == null) result = caseInfrastructureRoot(socialHistoryStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PURPOSE_SECTION: {
				PurposeSection purposeSection = (PurposeSection)theEObject;
				T result = casePurposeSection(purposeSection);
				if (result == null) result = caseSection(purposeSection);
				if (result == null) result = caseAct(purposeSection);
				if (result == null) result = caseInfrastructureRoot(purposeSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PURPOSE_ACTIVITY: {
				PurposeActivity purposeActivity = (PurposeActivity)theEObject;
				T result = casePurposeActivity(purposeActivity);
				if (result == null) result = caseCDA_Act(purposeActivity);
				if (result == null) result = caseClinicalStatement(purposeActivity);
				if (result == null) result = caseAct(purposeActivity);
				if (result == null) result = caseInfrastructureRoot(purposeActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_VERIFICATION: {
				AdvanceDirectiveVerification advanceDirectiveVerification = (AdvanceDirectiveVerification)theEObject;
				T result = caseAdvanceDirectiveVerification(advanceDirectiveVerification);
				if (result == null) result = caseParticipant2(advanceDirectiveVerification);
				if (result == null) result = caseParticipation(advanceDirectiveVerification);
				if (result == null) result = caseInfrastructureRoot(advanceDirectiveVerification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION: {
				AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation = (AdvanceDirectiveStatusObservation)theEObject;
				T result = caseAdvanceDirectiveStatusObservation(advanceDirectiveStatusObservation);
				if (result == null) result = caseObservation(advanceDirectiveStatusObservation);
				if (result == null) result = caseClinicalStatement(advanceDirectiveStatusObservation);
				if (result == null) result = caseAct(advanceDirectiveStatusObservation);
				if (result == null) result = caseInfrastructureRoot(advanceDirectiveStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOUNTER: {
				Encounter encounter = (Encounter)theEObject;
				T result = caseEncounter(encounter);
				if (result == null) result = caseCDA_Encounter(encounter);
				if (result == null) result = caseClinicalStatement(encounter);
				if (result == null) result = caseAct(encounter);
				if (result == null) result = caseInfrastructureRoot(encounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.IMMUNIZATIONS_SECTION: {
				ImmunizationsSection immunizationsSection = (ImmunizationsSection)theEObject;
				T result = caseImmunizationsSection(immunizationsSection);
				if (result == null) result = caseImmunizationsSectionEntriesOptional(immunizationsSection);
				if (result == null) result = caseSection(immunizationsSection);
				if (result == null) result = caseAct(immunizationsSection);
				if (result == null) result = caseInfrastructureRoot(immunizationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.INSURANCE_PROVIDER: {
				InsuranceProvider insuranceProvider = (InsuranceProvider)theEObject;
				T result = caseInsuranceProvider(insuranceProvider);
				if (result == null) result = caseCDA_Act(insuranceProvider);
				if (result == null) result = caseClinicalStatement(insuranceProvider);
				if (result == null) result = caseAct(insuranceProvider);
				if (result == null) result = caseInfrastructureRoot(insuranceProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PAYER_ENTRY: {
				PayerEntry payerEntry = (PayerEntry)theEObject;
				T result = casePayerEntry(payerEntry);
				if (result == null) result = caseCDA_Act(payerEntry);
				if (result == null) result = caseClinicalStatement(payerEntry);
				if (result == null) result = caseAct(payerEntry);
				if (result == null) result = caseInfrastructureRoot(payerEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.COVERED_PARTY: {
				CoveredParty coveredParty = (CoveredParty)theEObject;
				T result = caseCoveredParty(coveredParty);
				if (result == null) result = caseParticipantRole(coveredParty);
				if (result == null) result = caseRole(coveredParty);
				if (result == null) result = caseInfrastructureRoot(coveredParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.POLICY_SUBSCRIBER: {
				PolicySubscriber policySubscriber = (PolicySubscriber)theEObject;
				T result = casePolicySubscriber(policySubscriber);
				if (result == null) result = caseParticipantRole(policySubscriber);
				if (result == null) result = caseRole(policySubscriber);
				if (result == null) result = caseInfrastructureRoot(policySubscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.EXTERNAL_REFERENCE: {
				ExternalReference externalReference = (ExternalReference)theEObject;
				T result = caseExternalReference(externalReference);
				if (result == null) result = caseCDA_Act(externalReference);
				if (result == null) result = caseClinicalStatement(externalReference);
				if (result == null) result = caseAct(externalReference);
				if (result == null) result = caseInfrastructureRoot(externalReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SUPPORT: {
				Support support = (Support)theEObject;
				T result = caseSupport(support);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.VITAL_SIGNS_SECTION: {
				VitalSignsSection vitalSignsSection = (VitalSignsSection)theEObject;
				T result = caseVitalSignsSection(vitalSignsSection);
				if (result == null) result = caseVitalSignsSectionEntriesOptional(vitalSignsSection);
				if (result == null) result = caseSection(vitalSignsSection);
				if (result == null) result = caseAct(vitalSignsSection);
				if (result == null) result = caseInfrastructureRoot(vitalSignsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HISTORY_OF_PAST_ILLNESS_SECTION: {
				HistoryOfPastIllnessSection historyOfPastIllnessSection = (HistoryOfPastIllnessSection)theEObject;
				T result = caseHistoryOfPastIllnessSection(historyOfPastIllnessSection);
				if (result == null) result = caseSection(historyOfPastIllnessSection);
				if (result == null) result = caseAct(historyOfPastIllnessSection);
				if (result == null) result = caseInfrastructureRoot(historyOfPastIllnessSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.CHIEF_COMPLAINT_SECTION: {
				ChiefComplaintSection chiefComplaintSection = (ChiefComplaintSection)theEObject;
				T result = caseChiefComplaintSection(chiefComplaintSection);
				if (result == null) result = caseSection(chiefComplaintSection);
				if (result == null) result = caseAct(chiefComplaintSection);
				if (result == null) result = caseInfrastructureRoot(chiefComplaintSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.REASON_FOR_REFERRAL_SECTION: {
				ReasonForReferralSection reasonForReferralSection = (ReasonForReferralSection)theEObject;
				T result = caseReasonForReferralSection(reasonForReferralSection);
				if (result == null) result = caseSection(reasonForReferralSection);
				if (result == null) result = caseAct(reasonForReferralSection);
				if (result == null) result = caseInfrastructureRoot(reasonForReferralSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HISTORY_OF_PRESENT_ILLNESS_SECTION: {
				HistoryOfPresentIllnessSection historyOfPresentIllnessSection = (HistoryOfPresentIllnessSection)theEObject;
				T result = caseHistoryOfPresentIllnessSection(historyOfPresentIllnessSection);
				if (result == null) result = caseSection(historyOfPresentIllnessSection);
				if (result == null) result = caseAct(historyOfPresentIllnessSection);
				if (result == null) result = caseInfrastructureRoot(historyOfPresentIllnessSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION: {
				HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection = (HospitalAdmissionDiagnosisSection)theEObject;
				T result = caseHospitalAdmissionDiagnosisSection(hospitalAdmissionDiagnosisSection);
				if (result == null) result = caseSection(hospitalAdmissionDiagnosisSection);
				if (result == null) result = caseAct(hospitalAdmissionDiagnosisSection);
				if (result == null) result = caseInfrastructureRoot(hospitalAdmissionDiagnosisSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL: {
				HospitalAdmissionMedicationsSectionEntriesOptional hospitalAdmissionMedicationsSectionEntriesOptional = (HospitalAdmissionMedicationsSectionEntriesOptional)theEObject;
				T result = caseHospitalAdmissionMedicationsSectionEntriesOptional(hospitalAdmissionMedicationsSectionEntriesOptional);
				if (result == null) result = caseSection(hospitalAdmissionMedicationsSectionEntriesOptional);
				if (result == null) result = caseAct(hospitalAdmissionMedicationsSectionEntriesOptional);
				if (result == null) result = caseInfrastructureRoot(hospitalAdmissionMedicationsSectionEntriesOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ADMISSION_MEDICATION: {
				AdmissionMedication admissionMedication = (AdmissionMedication)theEObject;
				T result = caseAdmissionMedication(admissionMedication);
				if (result == null) result = caseCDA_Act(admissionMedication);
				if (result == null) result = caseClinicalStatement(admissionMedication);
				if (result == null) result = caseAct(admissionMedication);
				if (result == null) result = caseInfrastructureRoot(admissionMedication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION: {
				MedicationsAdministeredSection medicationsAdministeredSection = (MedicationsAdministeredSection)theEObject;
				T result = caseMedicationsAdministeredSection(medicationsAdministeredSection);
				if (result == null) result = caseSection(medicationsAdministeredSection);
				if (result == null) result = caseAct(medicationsAdministeredSection);
				if (result == null) result = caseInfrastructureRoot(medicationsAdministeredSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PHYSICAL_EXAM_SECTION: {
				PhysicalExamSection physicalExamSection = (PhysicalExamSection)theEObject;
				T result = casePhysicalExamSection(physicalExamSection);
				if (result == null) result = caseSection(physicalExamSection);
				if (result == null) result = caseAct(physicalExamSection);
				if (result == null) result = caseInfrastructureRoot(physicalExamSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.GENERAL_STATUS_SECTION: {
				GeneralStatusSection generalStatusSection = (GeneralStatusSection)theEObject;
				T result = caseGeneralStatusSection(generalStatusSection);
				if (result == null) result = caseSection(generalStatusSection);
				if (result == null) result = caseAct(generalStatusSection);
				if (result == null) result = caseInfrastructureRoot(generalStatusSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.REVIEW_OF_SYSTEMS_SECTION: {
				ReviewOfSystemsSection reviewOfSystemsSection = (ReviewOfSystemsSection)theEObject;
				T result = caseReviewOfSystemsSection(reviewOfSystemsSection);
				if (result == null) result = caseSection(reviewOfSystemsSection);
				if (result == null) result = caseAct(reviewOfSystemsSection);
				if (result == null) result = caseInfrastructureRoot(reviewOfSystemsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ASSESSMENT_AND_PLAN_SECTION: {
				AssessmentAndPlanSection assessmentAndPlanSection = (AssessmentAndPlanSection)theEObject;
				T result = caseAssessmentAndPlanSection(assessmentAndPlanSection);
				if (result == null) result = caseSection(assessmentAndPlanSection);
				if (result == null) result = caseAct(assessmentAndPlanSection);
				if (result == null) result = caseInfrastructureRoot(assessmentAndPlanSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.LANGUAGE_SPOKEN: {
				LanguageSpoken languageSpoken = (LanguageSpoken)theEObject;
				T result = caseLanguageSpoken(languageSpoken);
				if (result == null) result = caseLanguageCommunication(languageSpoken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HEALTHCARE_PROVIDER: {
				HealthcareProvider healthcareProvider = (HealthcareProvider)theEObject;
				T result = caseHealthcareProvider(healthcareProvider);
				if (result == null) result = casePerformer1(healthcareProvider);
				if (result == null) result = caseParticipation(healthcareProvider);
				if (result == null) result = caseInfrastructureRoot(healthcareProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SUPPORT_GUARDIAN: {
				SupportGuardian supportGuardian = (SupportGuardian)theEObject;
				T result = caseSupportGuardian(supportGuardian);
				if (result == null) result = caseSupport(supportGuardian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SUPPORT_PARTICIPANT: {
				SupportParticipant supportParticipant = (SupportParticipant)theEObject;
				T result = caseSupportParticipant(supportParticipant);
				if (result == null) result = caseSupport(supportParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SURGICAL_DRAINS_SECTION: {
				SurgicalDrainsSection surgicalDrainsSection = (SurgicalDrainsSection)theEObject;
				T result = caseSurgicalDrainsSection(surgicalDrainsSection);
				if (result == null) result = caseSection(surgicalDrainsSection);
				if (result == null) result = caseAct(surgicalDrainsSection);
				if (result == null) result = caseInfrastructureRoot(surgicalDrainsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.UNSTRUCTURED_DOCUMENT: {
				UnstructuredDocument unstructuredDocument = (UnstructuredDocument)theEObject;
				T result = caseUnstructuredDocument(unstructuredDocument);
				if (result == null) result = caseGeneralHeaderConstraints(unstructuredDocument);
				if (result == null) result = caseClinicalDocument(unstructuredDocument);
				if (result == null) result = caseAct(unstructuredDocument);
				if (result == null) result = caseInfrastructureRoot(unstructuredDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.UNSTRUCTURED_DOCUMENT_RECORD_TARGET: {
				UnstructuredDocument_RecordTarget unstructuredDocument_RecordTarget = (UnstructuredDocument_RecordTarget)theEObject;
				T result = caseUnstructuredDocument_RecordTarget(unstructuredDocument_RecordTarget);
				if (result == null) result = caseRecordTarget(unstructuredDocument_RecordTarget);
				if (result == null) result = caseParticipation(unstructuredDocument_RecordTarget);
				if (result == null) result = caseInfrastructureRoot(unstructuredDocument_RecordTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.RECORD_TARGET_PATIENT_ROLE2: {
				RecordTarget_PatientRole2 recordTarget_PatientRole2 = (RecordTarget_PatientRole2)theEObject;
				T result = caseRecordTarget_PatientRole2(recordTarget_PatientRole2);
				if (result == null) result = casePatientRole(recordTarget_PatientRole2);
				if (result == null) result = caseRole(recordTarget_PatientRole2);
				if (result == null) result = caseInfrastructureRoot(recordTarget_PatientRole2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.UNSTRUCTURED_DOCUMENT_AUTHOR: {
				UnstructuredDocument_Author unstructuredDocument_Author = (UnstructuredDocument_Author)theEObject;
				T result = caseUnstructuredDocument_Author(unstructuredDocument_Author);
				if (result == null) result = caseAuthor(unstructuredDocument_Author);
				if (result == null) result = caseParticipation(unstructuredDocument_Author);
				if (result == null) result = caseInfrastructureRoot(unstructuredDocument_Author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.AUTHOR_ASSIGNED_AUTHOR2: {
				Author_AssignedAuthor2 author_AssignedAuthor2 = (Author_AssignedAuthor2)theEObject;
				T result = caseAuthor_AssignedAuthor2(author_AssignedAuthor2);
				if (result == null) result = caseAssignedAuthor(author_AssignedAuthor2);
				if (result == null) result = caseRole(author_AssignedAuthor2);
				if (result == null) result = caseInfrastructureRoot(author_AssignedAuthor2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.UNSTRUCTURED_DOCUMENT_CUSTODIAN: {
				UnstructuredDocument_Custodian unstructuredDocument_Custodian = (UnstructuredDocument_Custodian)theEObject;
				T result = caseUnstructuredDocument_Custodian(unstructuredDocument_Custodian);
				if (result == null) result = caseCustodian(unstructuredDocument_Custodian);
				if (result == null) result = caseParticipation(unstructuredDocument_Custodian);
				if (result == null) result = caseInfrastructureRoot(unstructuredDocument_Custodian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.CUSTODIAN_ASSIGNED_CUSTODIAN3: {
				Custodian_AssignedCustodian3 custodian_AssignedCustodian3 = (Custodian_AssignedCustodian3)theEObject;
				T result = caseCustodian_AssignedCustodian3(custodian_AssignedCustodian3);
				if (result == null) result = caseAssignedCustodian(custodian_AssignedCustodian3);
				if (result == null) result = caseRole(custodian_AssignedCustodian3);
				if (result == null) result = caseInfrastructureRoot(custodian_AssignedCustodian3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION: {
				AssignedCustodian3_CustodianOrganization assignedCustodian3_CustodianOrganization = (AssignedCustodian3_CustodianOrganization)theEObject;
				T result = caseAssignedCustodian3_CustodianOrganization(assignedCustodian3_CustodianOrganization);
				if (result == null) result = caseCustodianOrganization(assignedCustodian3_CustodianOrganization);
				if (result == null) result = caseEntity(assignedCustodian3_CustodianOrganization);
				if (result == null) result = caseInfrastructureRoot(assignedCustodian3_CustodianOrganization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.UNSTRUCTURED_DOCUMENT_COMPONENT: {
				UnstructuredDocument_Component unstructuredDocument_Component = (UnstructuredDocument_Component)theEObject;
				T result = caseUnstructuredDocument_Component(unstructuredDocument_Component);
				if (result == null) result = caseComponent2(unstructuredDocument_Component);
				if (result == null) result = caseActRelationship(unstructuredDocument_Component);
				if (result == null) result = caseInfrastructureRoot(unstructuredDocument_Component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.COMPONENT_NON_XML_BODY: {
				Component_NonXMLBody component_NonXMLBody = (Component_NonXMLBody)theEObject;
				T result = caseComponent_NonXMLBody(component_NonXMLBody);
				if (result == null) result = caseNonXMLBody(component_NonXMLBody);
				if (result == null) result = caseAct(component_NonXMLBody);
				if (result == null) result = caseInfrastructureRoot(component_NonXMLBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SCAN_ORIGINAL_AUTHOR: {
				ScanOriginalAuthor scanOriginalAuthor = (ScanOriginalAuthor)theEObject;
				T result = caseScanOriginalAuthor(scanOriginalAuthor);
				if (result == null) result = caseAuthor(scanOriginalAuthor);
				if (result == null) result = caseParticipation(scanOriginalAuthor);
				if (result == null) result = caseInfrastructureRoot(scanOriginalAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SCANNING_DEVICE: {
				ScanningDevice scanningDevice = (ScanningDevice)theEObject;
				T result = caseScanningDevice(scanningDevice);
				if (result == null) result = caseAuthor(scanningDevice);
				if (result == null) result = caseParticipation(scanningDevice);
				if (result == null) result = caseInfrastructureRoot(scanningDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SCAN_DATA_ENTERER: {
				ScanDataEnterer scanDataEnterer = (ScanDataEnterer)theEObject;
				T result = caseScanDataEnterer(scanDataEnterer);
				if (result == null) result = caseDataEnterer(scanDataEnterer);
				if (result == null) result = caseParticipation(scanDataEnterer);
				if (result == null) result = caseInfrastructureRoot(scanDataEnterer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATION_INFORMATION: {
				MedicationInformation medicationInformation = (MedicationInformation)theEObject;
				T result = caseMedicationInformation(medicationInformation);
				if (result == null) result = caseManufacturedProduct(medicationInformation);
				if (result == null) result = caseRole(medicationInformation);
				if (result == null) result = caseInfrastructureRoot(medicationInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.UNSTRUCTURED_OR_SCANNED_DOCUMENT: {
				UnstructuredOrScannedDocument unstructuredOrScannedDocument = (UnstructuredOrScannedDocument)theEObject;
				T result = caseUnstructuredOrScannedDocument(unstructuredOrScannedDocument);
				if (result == null) result = caseGeneralHeaderConstraints(unstructuredOrScannedDocument);
				if (result == null) result = caseClinicalDocument(unstructuredOrScannedDocument);
				if (result == null) result = caseAct(unstructuredOrScannedDocument);
				if (result == null) result = caseInfrastructureRoot(unstructuredOrScannedDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.REFERRAL_SUMMARY: {
				ReferralSummary referralSummary = (ReferralSummary)theEObject;
				T result = caseReferralSummary(referralSummary);
				if (result == null) result = caseGeneralHeaderConstraints(referralSummary);
				if (result == null) result = caseClinicalDocument(referralSummary);
				if (result == null) result = caseAct(referralSummary);
				if (result == null) result = caseInfrastructureRoot(referralSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DISCHARGE_SUMMARY: {
				DischargeSummary dischargeSummary = (DischargeSummary)theEObject;
				T result = caseDischargeSummary(dischargeSummary);
				if (result == null) result = caseGeneralHeaderConstraints(dischargeSummary);
				if (result == null) result = caseClinicalDocument(dischargeSummary);
				if (result == null) result = caseAct(dischargeSummary);
				if (result == null) result = caseInfrastructureRoot(dischargeSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DISCHARGE_SUMMARY_COMPONENT_OF: {
				DischargeSummary_ComponentOf dischargeSummary_ComponentOf = (DischargeSummary_ComponentOf)theEObject;
				T result = caseDischargeSummary_ComponentOf(dischargeSummary_ComponentOf);
				if (result == null) result = caseComponent1(dischargeSummary_ComponentOf);
				if (result == null) result = caseActRelationship(dischargeSummary_ComponentOf);
				if (result == null) result = caseInfrastructureRoot(dischargeSummary_ComponentOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER3: {
				ComponentOf_EncompassingEncounter3 componentOf_EncompassingEncounter3 = (ComponentOf_EncompassingEncounter3)theEObject;
				T result = caseComponentOf_EncompassingEncounter3(componentOf_EncompassingEncounter3);
				if (result == null) result = caseEncompassingEncounter(componentOf_EncompassingEncounter3);
				if (result == null) result = caseAct(componentOf_EncompassingEncounter3);
				if (result == null) result = caseInfrastructureRoot(componentOf_EncompassingEncounter3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY: {
				EncompassingEncounter3_ResponsibleParty encompassingEncounter3_ResponsibleParty = (EncompassingEncounter3_ResponsibleParty)theEObject;
				T result = caseEncompassingEncounter3_ResponsibleParty(encompassingEncounter3_ResponsibleParty);
				if (result == null) result = caseResponsibleParty(encompassingEncounter3_ResponsibleParty);
				if (result == null) result = caseParticipation(encompassingEncounter3_ResponsibleParty);
				if (result == null) result = caseInfrastructureRoot(encompassingEncounter3_ResponsibleParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT: {
				EncompassingEncounter3_EncounterParticipant encompassingEncounter3_EncounterParticipant = (EncompassingEncounter3_EncounterParticipant)theEObject;
				T result = caseEncompassingEncounter3_EncounterParticipant(encompassingEncounter3_EncounterParticipant);
				if (result == null) result = caseEncounterParticipant(encompassingEncounter3_EncounterParticipant);
				if (result == null) result = caseParticipation(encompassingEncounter3_EncounterParticipant);
				if (result == null) result = caseInfrastructureRoot(encompassingEncounter3_EncounterParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION: {
				HospitalDischargeDiagnosisSection hospitalDischargeDiagnosisSection = (HospitalDischargeDiagnosisSection)theEObject;
				T result = caseHospitalDischargeDiagnosisSection(hospitalDischargeDiagnosisSection);
				if (result == null) result = caseSection(hospitalDischargeDiagnosisSection);
				if (result == null) result = caseAct(hospitalDischargeDiagnosisSection);
				if (result == null) result = caseInfrastructureRoot(hospitalDischargeDiagnosisSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS: {
				HospitalDischargeDiagnosis hospitalDischargeDiagnosis = (HospitalDischargeDiagnosis)theEObject;
				T result = caseHospitalDischargeDiagnosis(hospitalDischargeDiagnosis);
				if (result == null) result = caseCDA_Act(hospitalDischargeDiagnosis);
				if (result == null) result = caseClinicalStatement(hospitalDischargeDiagnosis);
				if (result == null) result = caseAct(hospitalDischargeDiagnosis);
				if (result == null) result = caseInfrastructureRoot(hospitalDischargeDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DISCHARGE_DIET_SECTION: {
				DischargeDietSection dischargeDietSection = (DischargeDietSection)theEObject;
				T result = caseDischargeDietSection(dischargeDietSection);
				if (result == null) result = caseSection(dischargeDietSection);
				if (result == null) result = caseAct(dischargeDietSection);
				if (result == null) result = caseInfrastructureRoot(dischargeDietSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL: {
				HospitalDischargeMedicationsSectionEntriesOptional hospitalDischargeMedicationsSectionEntriesOptional = (HospitalDischargeMedicationsSectionEntriesOptional)theEObject;
				T result = caseHospitalDischargeMedicationsSectionEntriesOptional(hospitalDischargeMedicationsSectionEntriesOptional);
				if (result == null) result = caseSection(hospitalDischargeMedicationsSectionEntriesOptional);
				if (result == null) result = caseAct(hospitalDischargeMedicationsSectionEntriesOptional);
				if (result == null) result = caseInfrastructureRoot(hospitalDischargeMedicationsSectionEntriesOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DISCHARGE_MEDICATION: {
				DischargeMedication dischargeMedication = (DischargeMedication)theEObject;
				T result = caseDischargeMedication(dischargeMedication);
				if (result == null) result = caseCDA_Act(dischargeMedication);
				if (result == null) result = caseClinicalStatement(dischargeMedication);
				if (result == null) result = caseAct(dischargeMedication);
				if (result == null) result = caseInfrastructureRoot(dischargeMedication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HOSPITAL_COURSE_SECTION: {
				HospitalCourseSection hospitalCourseSection = (HospitalCourseSection)theEObject;
				T result = caseHospitalCourseSection(hospitalCourseSection);
				if (result == null) result = caseSection(hospitalCourseSection);
				if (result == null) result = caseAct(hospitalCourseSection);
				if (result == null) result = caseInfrastructureRoot(hospitalCourseSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION: {
				ChiefComplaintAndReasonForVisitSection chiefComplaintAndReasonForVisitSection = (ChiefComplaintAndReasonForVisitSection)theEObject;
				T result = caseChiefComplaintAndReasonForVisitSection(chiefComplaintAndReasonForVisitSection);
				if (result == null) result = caseSection(chiefComplaintAndReasonForVisitSection);
				if (result == null) result = caseAct(chiefComplaintAndReasonForVisitSection);
				if (result == null) result = caseInfrastructureRoot(chiefComplaintAndReasonForVisitSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HOSPITAL_CONSULTATIONS_SECTION: {
				HospitalConsultationsSection hospitalConsultationsSection = (HospitalConsultationsSection)theEObject;
				T result = caseHospitalConsultationsSection(hospitalConsultationsSection);
				if (result == null) result = caseSection(hospitalConsultationsSection);
				if (result == null) result = caseAct(hospitalConsultationsSection);
				if (result == null) result = caseInfrastructureRoot(hospitalConsultationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION: {
				HospitalDischargeInstructionsSection hospitalDischargeInstructionsSection = (HospitalDischargeInstructionsSection)theEObject;
				T result = caseHospitalDischargeInstructionsSection(hospitalDischargeInstructionsSection);
				if (result == null) result = caseSection(hospitalDischargeInstructionsSection);
				if (result == null) result = caseAct(hospitalDischargeInstructionsSection);
				if (result == null) result = caseInfrastructureRoot(hospitalDischargeInstructionsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_PHYSICAL_SECTION: {
				HospitalDischargePhysicalSection hospitalDischargePhysicalSection = (HospitalDischargePhysicalSection)theEObject;
				T result = caseHospitalDischargePhysicalSection(hospitalDischargePhysicalSection);
				if (result == null) result = caseSection(hospitalDischargePhysicalSection);
				if (result == null) result = caseAct(hospitalDischargePhysicalSection);
				if (result == null) result = caseInfrastructureRoot(hospitalDischargePhysicalSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION: {
				HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection = (HospitalDischargeStudiesSummarySection)theEObject;
				T result = caseHospitalDischargeStudiesSummarySection(hospitalDischargeStudiesSummarySection);
				if (result == null) result = caseSection(hospitalDischargeStudiesSummarySection);
				if (result == null) result = caseAct(hospitalDischargeStudiesSummarySection);
				if (result == null) result = caseInfrastructureRoot(hospitalDischargeStudiesSummarySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.REASON_FOR_VISIT_SECTION: {
				ReasonForVisitSection reasonForVisitSection = (ReasonForVisitSection)theEObject;
				T result = caseReasonForVisitSection(reasonForVisitSection);
				if (result == null) result = caseSection(reasonForVisitSection);
				if (result == null) result = caseAct(reasonForVisitSection);
				if (result == null) result = caseInfrastructureRoot(reasonForVisitSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION: {
				PreconditionForSubstanceAdministration preconditionForSubstanceAdministration = (PreconditionForSubstanceAdministration)theEObject;
				T result = casePreconditionForSubstanceAdministration(preconditionForSubstanceAdministration);
				if (result == null) result = casePrecondition(preconditionForSubstanceAdministration);
				if (result == null) result = caseActRelationship(preconditionForSubstanceAdministration);
				if (result == null) result = caseInfrastructureRoot(preconditionForSubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.IMMUNIZATION_MEDICATION_INFORMATION: {
				ImmunizationMedicationInformation immunizationMedicationInformation = (ImmunizationMedicationInformation)theEObject;
				T result = caseImmunizationMedicationInformation(immunizationMedicationInformation);
				if (result == null) result = caseManufacturedProduct(immunizationMedicationInformation);
				if (result == null) result = caseRole(immunizationMedicationInformation);
				if (result == null) result = caseInfrastructureRoot(immunizationMedicationInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_SPECIMEN: {
				ProcedureSpecimen procedureSpecimen = (ProcedureSpecimen)theEObject;
				T result = caseProcedureSpecimen(procedureSpecimen);
				if (result == null) result = caseSpecimen(procedureSpecimen);
				if (result == null) result = caseParticipation(procedureSpecimen);
				if (result == null) result = caseInfrastructureRoot(procedureSpecimen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_PERFORMER: {
				ProcedurePerformer procedurePerformer = (ProcedurePerformer)theEObject;
				T result = caseProcedurePerformer(procedurePerformer);
				if (result == null) result = casePerformer2(procedurePerformer);
				if (result == null) result = caseParticipation(procedurePerformer);
				if (result == null) result = caseInfrastructureRoot(procedurePerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_ENCOUNTER: {
				ProcedureEncounter procedureEncounter = (ProcedureEncounter)theEObject;
				T result = caseProcedureEncounter(procedureEncounter);
				if (result == null) result = caseCDA_Encounter(procedureEncounter);
				if (result == null) result = caseClinicalStatement(procedureEncounter);
				if (result == null) result = caseAct(procedureEncounter);
				if (result == null) result = caseInfrastructureRoot(procedureEncounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATION_INFORMATION_MANUFACTURED_MATERIAL: {
				MedicationInformationManufacturedMaterial medicationInformationManufacturedMaterial = (MedicationInformationManufacturedMaterial)theEObject;
				T result = caseMedicationInformationManufacturedMaterial(medicationInformationManufacturedMaterial);
				if (result == null) result = caseMaterial(medicationInformationManufacturedMaterial);
				if (result == null) result = caseEntity(medicationInformationManufacturedMaterial);
				if (result == null) result = caseInfrastructureRoot(medicationInformationManufacturedMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_SUBJECT: {
				FamilyHistorySubject familyHistorySubject = (FamilyHistorySubject)theEObject;
				T result = caseFamilyHistorySubject(familyHistorySubject);
				if (result == null) result = caseSubject(familyHistorySubject);
				if (result == null) result = caseParticipation(familyHistorySubject);
				if (result == null) result = caseInfrastructureRoot(familyHistorySubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION: {
				HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection = (HospitalDischargeMedicationsSection)theEObject;
				T result = caseHospitalDischargeMedicationsSection(hospitalDischargeMedicationsSection);
				if (result == null) result = caseHospitalDischargeMedicationsSectionEntriesOptional(hospitalDischargeMedicationsSection);
				if (result == null) result = caseSection(hospitalDischargeMedicationsSection);
				if (result == null) result = caseAct(hospitalDischargeMedicationsSection);
				if (result == null) result = caseInfrastructureRoot(hospitalDischargeMedicationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.RELATED_INFORMANT: {
				RelatedInformant relatedInformant = (RelatedInformant)theEObject;
				T result = caseRelatedInformant(relatedInformant);
				if (result == null) result = caseRelatedEntity(relatedInformant);
				if (result == null) result = caseRole(relatedInformant);
				if (result == null) result = caseInfrastructureRoot(relatedInformant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOUNTER_PERFORMER: {
				EncounterPerformer encounterPerformer = (EncounterPerformer)theEObject;
				T result = caseEncounterPerformer(encounterPerformer);
				if (result == null) result = casePerformer2(encounterPerformer);
				if (result == null) result = caseParticipation(encounterPerformer);
				if (result == null) result = caseInfrastructureRoot(encounterPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOUNTER_PERFORMER_ASSIGNED_ENTITY: {
				EncounterPerformerAssignedEntity encounterPerformerAssignedEntity = (EncounterPerformerAssignedEntity)theEObject;
				T result = caseEncounterPerformerAssignedEntity(encounterPerformerAssignedEntity);
				if (result == null) result = caseAssignedEntity(encounterPerformerAssignedEntity);
				if (result == null) result = caseRole(encounterPerformerAssignedEntity);
				if (result == null) result = caseInfrastructureRoot(encounterPerformerAssignedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ALLERGY_OBSERVATION_PARTICIPANT: {
				AllergyObservationParticipant allergyObservationParticipant = (AllergyObservationParticipant)theEObject;
				T result = caseAllergyObservationParticipant(allergyObservationParticipant);
				if (result == null) result = caseParticipant2(allergyObservationParticipant);
				if (result == null) result = caseParticipation(allergyObservationParticipant);
				if (result == null) result = caseInfrastructureRoot(allergyObservationParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ALLERGY_OBSERVATION_PARTICIPANT_ROLE: {
				AllergyObservationParticipantRole allergyObservationParticipantRole = (AllergyObservationParticipantRole)theEObject;
				T result = caseAllergyObservationParticipantRole(allergyObservationParticipantRole);
				if (result == null) result = caseParticipantRole(allergyObservationParticipantRole);
				if (result == null) result = caseRole(allergyObservationParticipantRole);
				if (result == null) result = caseInfrastructureRoot(allergyObservationParticipantRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ALLERGY_OBSERVATION_PLAYING_ENTITY: {
				AllergyObservationPlayingEntity allergyObservationPlayingEntity = (AllergyObservationPlayingEntity)theEObject;
				T result = caseAllergyObservationPlayingEntity(allergyObservationPlayingEntity);
				if (result == null) result = casePlayingEntity(allergyObservationPlayingEntity);
				if (result == null) result = caseEntity(allergyObservationPlayingEntity);
				if (result == null) result = caseInfrastructureRoot(allergyObservationPlayingEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ANESTHESIA_SECTION: {
				AnesthesiaSection anesthesiaSection = (AnesthesiaSection)theEObject;
				T result = caseAnesthesiaSection(anesthesiaSection);
				if (result == null) result = caseSection(anesthesiaSection);
				if (result == null) result = caseAct(anesthesiaSection);
				if (result == null) result = caseInfrastructureRoot(anesthesiaSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.COMPLICATIONS_SECTION: {
				ComplicationsSection complicationsSection = (ComplicationsSection)theEObject;
				T result = caseComplicationsSection(complicationsSection);
				if (result == null) result = caseSection(complicationsSection);
				if (result == null) result = caseAct(complicationsSection);
				if (result == null) result = caseInfrastructureRoot(complicationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DICOM_OBJECT_CATALOG_SECTION: {
				DICOMObjectCatalogSection dicomObjectCatalogSection = (DICOMObjectCatalogSection)theEObject;
				T result = caseDICOMObjectCatalogSection(dicomObjectCatalogSection);
				if (result == null) result = caseSection(dicomObjectCatalogSection);
				if (result == null) result = caseAct(dicomObjectCatalogSection);
				if (result == null) result = caseInfrastructureRoot(dicomObjectCatalogSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.STUDY_ACT: {
				StudyAct studyAct = (StudyAct)theEObject;
				T result = caseStudyAct(studyAct);
				if (result == null) result = caseCDA_Act(studyAct);
				if (result == null) result = caseClinicalStatement(studyAct);
				if (result == null) result = caseAct(studyAct);
				if (result == null) result = caseInfrastructureRoot(studyAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SERIES_ACT: {
				SeriesAct seriesAct = (SeriesAct)theEObject;
				T result = caseSeriesAct(seriesAct);
				if (result == null) result = caseCDA_Act(seriesAct);
				if (result == null) result = caseClinicalStatement(seriesAct);
				if (result == null) result = caseAct(seriesAct);
				if (result == null) result = caseInfrastructureRoot(seriesAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SOP_INSTANCE_OBSERVATION: {
				SOPInstanceObservation sopInstanceObservation = (SOPInstanceObservation)theEObject;
				T result = caseSOPInstanceObservation(sopInstanceObservation);
				if (result == null) result = caseObservation(sopInstanceObservation);
				if (result == null) result = caseClinicalStatement(sopInstanceObservation);
				if (result == null) result = caseAct(sopInstanceObservation);
				if (result == null) result = caseInfrastructureRoot(sopInstanceObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PURPOSEOF_REFERENCE_OBSERVATION: {
				PurposeofReferenceObservation purposeofReferenceObservation = (PurposeofReferenceObservation)theEObject;
				T result = casePurposeofReferenceObservation(purposeofReferenceObservation);
				if (result == null) result = caseObservation(purposeofReferenceObservation);
				if (result == null) result = caseClinicalStatement(purposeofReferenceObservation);
				if (result == null) result = caseAct(purposeofReferenceObservation);
				if (result == null) result = caseInfrastructureRoot(purposeofReferenceObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.REFERENCED_FRAMES_OBSERVATION: {
				ReferencedFramesObservation referencedFramesObservation = (ReferencedFramesObservation)theEObject;
				T result = caseReferencedFramesObservation(referencedFramesObservation);
				if (result == null) result = caseObservation(referencedFramesObservation);
				if (result == null) result = caseClinicalStatement(referencedFramesObservation);
				if (result == null) result = caseAct(referencedFramesObservation);
				if (result == null) result = caseInfrastructureRoot(referencedFramesObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.BOUNDARY_OBSERVATION: {
				BoundaryObservation boundaryObservation = (BoundaryObservation)theEObject;
				T result = caseBoundaryObservation(boundaryObservation);
				if (result == null) result = caseObservation(boundaryObservation);
				if (result == null) result = caseClinicalStatement(boundaryObservation);
				if (result == null) result = caseAct(boundaryObservation);
				if (result == null) result = caseInfrastructureRoot(boundaryObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.FINDINGS_SECTION: {
				FindingsSection findingsSection = (FindingsSection)theEObject;
				T result = caseFindingsSection(findingsSection);
				if (result == null) result = caseSection(findingsSection);
				if (result == null) result = caseAct(findingsSection);
				if (result == null) result = caseInfrastructureRoot(findingsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.INTERVENTIONS_SECTION: {
				InterventionsSection interventionsSection = (InterventionsSection)theEObject;
				T result = caseInterventionsSection(interventionsSection);
				if (result == null) result = caseSection(interventionsSection);
				if (result == null) result = caseAct(interventionsSection);
				if (result == null) result = caseInfrastructureRoot(interventionsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICAL_HISTORY_SECTION: {
				MedicalHistorySection medicalHistorySection = (MedicalHistorySection)theEObject;
				T result = caseMedicalHistorySection(medicalHistorySection);
				if (result == null) result = caseSection(medicalHistorySection);
				if (result == null) result = caseAct(medicalHistorySection);
				if (result == null) result = caseInfrastructureRoot(medicalHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.OBJECTIVE_SECTION: {
				ObjectiveSection objectiveSection = (ObjectiveSection)theEObject;
				T result = caseObjectiveSection(objectiveSection);
				if (result == null) result = caseSection(objectiveSection);
				if (result == null) result = caseAct(objectiveSection);
				if (result == null) result = caseInfrastructureRoot(objectiveSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.OPERATIVE_NOTE_FLUID_SECTION: {
				OperativeNoteFluidSection operativeNoteFluidSection = (OperativeNoteFluidSection)theEObject;
				T result = caseOperativeNoteFluidSection(operativeNoteFluidSection);
				if (result == null) result = caseSection(operativeNoteFluidSection);
				if (result == null) result = caseAct(operativeNoteFluidSection);
				if (result == null) result = caseInfrastructureRoot(operativeNoteFluidSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION: {
				OperativeNoteSurgicalProcedureSection operativeNoteSurgicalProcedureSection = (OperativeNoteSurgicalProcedureSection)theEObject;
				T result = caseOperativeNoteSurgicalProcedureSection(operativeNoteSurgicalProcedureSection);
				if (result == null) result = caseSection(operativeNoteSurgicalProcedureSection);
				if (result == null) result = caseAct(operativeNoteSurgicalProcedureSection);
				if (result == null) result = caseInfrastructureRoot(operativeNoteSurgicalProcedureSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PLANNED_PROCEDURE_SECTION: {
				PlannedProcedureSection plannedProcedureSection = (PlannedProcedureSection)theEObject;
				T result = casePlannedProcedureSection(plannedProcedureSection);
				if (result == null) result = caseSection(plannedProcedureSection);
				if (result == null) result = caseAct(plannedProcedureSection);
				if (result == null) result = caseInfrastructureRoot(plannedProcedureSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.POSTOPERATIVE_DIAGNOSIS_SECTION: {
				PostoperativeDiagnosisSection postoperativeDiagnosisSection = (PostoperativeDiagnosisSection)theEObject;
				T result = casePostoperativeDiagnosisSection(postoperativeDiagnosisSection);
				if (result == null) result = caseSection(postoperativeDiagnosisSection);
				if (result == null) result = caseAct(postoperativeDiagnosisSection);
				if (result == null) result = caseInfrastructureRoot(postoperativeDiagnosisSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION: {
				PostprocedureDiagnosisSection postprocedureDiagnosisSection = (PostprocedureDiagnosisSection)theEObject;
				T result = casePostprocedureDiagnosisSection(postprocedureDiagnosisSection);
				if (result == null) result = caseSection(postprocedureDiagnosisSection);
				if (result == null) result = caseAct(postprocedureDiagnosisSection);
				if (result == null) result = caseInfrastructureRoot(postprocedureDiagnosisSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS: {
				PostprocedureDiagnosis postprocedureDiagnosis = (PostprocedureDiagnosis)theEObject;
				T result = casePostprocedureDiagnosis(postprocedureDiagnosis);
				if (result == null) result = caseCDA_Act(postprocedureDiagnosis);
				if (result == null) result = caseClinicalStatement(postprocedureDiagnosis);
				if (result == null) result = caseAct(postprocedureDiagnosis);
				if (result == null) result = caseInfrastructureRoot(postprocedureDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS_SECTION: {
				PreoperativeDiagnosisSection preoperativeDiagnosisSection = (PreoperativeDiagnosisSection)theEObject;
				T result = casePreoperativeDiagnosisSection(preoperativeDiagnosisSection);
				if (result == null) result = caseSection(preoperativeDiagnosisSection);
				if (result == null) result = caseAct(preoperativeDiagnosisSection);
				if (result == null) result = caseInfrastructureRoot(preoperativeDiagnosisSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_DESCRIPTION_SECTION: {
				ProcedureDescriptionSection procedureDescriptionSection = (ProcedureDescriptionSection)theEObject;
				T result = caseProcedureDescriptionSection(procedureDescriptionSection);
				if (result == null) result = caseSection(procedureDescriptionSection);
				if (result == null) result = caseAct(procedureDescriptionSection);
				if (result == null) result = caseInfrastructureRoot(procedureDescriptionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_DISPOSITION_SECTION: {
				ProcedureDispositionSection procedureDispositionSection = (ProcedureDispositionSection)theEObject;
				T result = caseProcedureDispositionSection(procedureDispositionSection);
				if (result == null) result = caseSection(procedureDispositionSection);
				if (result == null) result = caseAct(procedureDispositionSection);
				if (result == null) result = caseInfrastructureRoot(procedureDispositionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION: {
				ProcedureEstimatedBloodLossSection procedureEstimatedBloodLossSection = (ProcedureEstimatedBloodLossSection)theEObject;
				T result = caseProcedureEstimatedBloodLossSection(procedureEstimatedBloodLossSection);
				if (result == null) result = caseSection(procedureEstimatedBloodLossSection);
				if (result == null) result = caseAct(procedureEstimatedBloodLossSection);
				if (result == null) result = caseInfrastructureRoot(procedureEstimatedBloodLossSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_FINDINGS_SECTION: {
				ProcedureFindingsSection procedureFindingsSection = (ProcedureFindingsSection)theEObject;
				T result = caseProcedureFindingsSection(procedureFindingsSection);
				if (result == null) result = caseSection(procedureFindingsSection);
				if (result == null) result = caseAct(procedureFindingsSection);
				if (result == null) result = caseInfrastructureRoot(procedureFindingsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_IMPLANTS_SECTION: {
				ProcedureImplantsSection procedureImplantsSection = (ProcedureImplantsSection)theEObject;
				T result = caseProcedureImplantsSection(procedureImplantsSection);
				if (result == null) result = caseSection(procedureImplantsSection);
				if (result == null) result = caseAct(procedureImplantsSection);
				if (result == null) result = caseInfrastructureRoot(procedureImplantsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_INDICATIONS_SECTION: {
				ProcedureIndicationsSection procedureIndicationsSection = (ProcedureIndicationsSection)theEObject;
				T result = caseProcedureIndicationsSection(procedureIndicationsSection);
				if (result == null) result = caseSection(procedureIndicationsSection);
				if (result == null) result = caseAct(procedureIndicationsSection);
				if (result == null) result = caseInfrastructureRoot(procedureIndicationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_SPECIMENS_TAKEN_SECTION: {
				ProcedureSpecimensTakenSection procedureSpecimensTakenSection = (ProcedureSpecimensTakenSection)theEObject;
				T result = caseProcedureSpecimensTakenSection(procedureSpecimensTakenSection);
				if (result == null) result = caseSection(procedureSpecimensTakenSection);
				if (result == null) result = caseAct(procedureSpecimensTakenSection);
				if (result == null) result = caseInfrastructureRoot(procedureSpecimensTakenSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SUBJECTIVE_SECTION: {
				SubjectiveSection subjectiveSection = (SubjectiveSection)theEObject;
				T result = caseSubjectiveSection(subjectiveSection);
				if (result == null) result = caseSection(subjectiveSection);
				if (result == null) result = caseAct(subjectiveSection);
				if (result == null) result = caseInfrastructureRoot(subjectiveSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.CONSULTATION_NOTE: {
				ConsultationNote consultationNote = (ConsultationNote)theEObject;
				T result = caseConsultationNote(consultationNote);
				if (result == null) result = caseGeneralHeaderConstraints(consultationNote);
				if (result == null) result = caseClinicalDocument(consultationNote);
				if (result == null) result = caseAct(consultationNote);
				if (result == null) result = caseInfrastructureRoot(consultationNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.CONSULTATION_NOTE_COMPONENT_OF: {
				ConsultationNote_ComponentOf consultationNote_ComponentOf = (ConsultationNote_ComponentOf)theEObject;
				T result = caseConsultationNote_ComponentOf(consultationNote_ComponentOf);
				if (result == null) result = caseComponent1(consultationNote_ComponentOf);
				if (result == null) result = caseActRelationship(consultationNote_ComponentOf);
				if (result == null) result = caseInfrastructureRoot(consultationNote_ComponentOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER2: {
				ComponentOf_EncompassingEncounter2 componentOf_EncompassingEncounter2 = (ComponentOf_EncompassingEncounter2)theEObject;
				T result = caseComponentOf_EncompassingEncounter2(componentOf_EncompassingEncounter2);
				if (result == null) result = caseEncompassingEncounter(componentOf_EncompassingEncounter2);
				if (result == null) result = caseAct(componentOf_EncompassingEncounter2);
				if (result == null) result = caseInfrastructureRoot(componentOf_EncompassingEncounter2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY: {
				EncompassingEncounter2_ResponsibleParty encompassingEncounter2_ResponsibleParty = (EncompassingEncounter2_ResponsibleParty)theEObject;
				T result = caseEncompassingEncounter2_ResponsibleParty(encompassingEncounter2_ResponsibleParty);
				if (result == null) result = caseResponsibleParty(encompassingEncounter2_ResponsibleParty);
				if (result == null) result = caseParticipation(encompassingEncounter2_ResponsibleParty);
				if (result == null) result = caseInfrastructureRoot(encompassingEncounter2_ResponsibleParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT: {
				EncompassingEncounter2_EncounterParticipant encompassingEncounter2_EncounterParticipant = (EncompassingEncounter2_EncounterParticipant)theEObject;
				T result = caseEncompassingEncounter2_EncounterParticipant(encompassingEncounter2_EncounterParticipant);
				if (result == null) result = caseEncounterParticipant(encompassingEncounter2_EncounterParticipant);
				if (result == null) result = caseParticipation(encompassingEncounter2_EncounterParticipant);
				if (result == null) result = caseInfrastructureRoot(encompassingEncounter2_EncounterParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ASSESSMENT_SECTION: {
				AssessmentSection assessmentSection = (AssessmentSection)theEObject;
				T result = caseAssessmentSection(assessmentSection);
				if (result == null) result = caseSection(assessmentSection);
				if (result == null) result = caseAct(assessmentSection);
				if (result == null) result = caseInfrastructureRoot(assessmentSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HISTORY_AND_PHYSICAL_NOTE: {
				HistoryAndPhysicalNote historyAndPhysicalNote = (HistoryAndPhysicalNote)theEObject;
				T result = caseHistoryAndPhysicalNote(historyAndPhysicalNote);
				if (result == null) result = caseGeneralHeaderConstraints(historyAndPhysicalNote);
				if (result == null) result = caseClinicalDocument(historyAndPhysicalNote);
				if (result == null) result = caseAct(historyAndPhysicalNote);
				if (result == null) result = caseInfrastructureRoot(historyAndPhysicalNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF: {
				HistoryAndPhysicalNote_ComponentOf historyAndPhysicalNote_ComponentOf = (HistoryAndPhysicalNote_ComponentOf)theEObject;
				T result = caseHistoryAndPhysicalNote_ComponentOf(historyAndPhysicalNote_ComponentOf);
				if (result == null) result = caseComponent1(historyAndPhysicalNote_ComponentOf);
				if (result == null) result = caseActRelationship(historyAndPhysicalNote_ComponentOf);
				if (result == null) result = caseInfrastructureRoot(historyAndPhysicalNote_ComponentOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4: {
				ComponentOf_EncompassingEncounter4 componentOf_EncompassingEncounter4 = (ComponentOf_EncompassingEncounter4)theEObject;
				T result = caseComponentOf_EncompassingEncounter4(componentOf_EncompassingEncounter4);
				if (result == null) result = caseEncompassingEncounter(componentOf_EncompassingEncounter4);
				if (result == null) result = caseAct(componentOf_EncompassingEncounter4);
				if (result == null) result = caseInfrastructureRoot(componentOf_EncompassingEncounter4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY: {
				EncompassingEncounter4_ResponsibleParty encompassingEncounter4_ResponsibleParty = (EncompassingEncounter4_ResponsibleParty)theEObject;
				T result = caseEncompassingEncounter4_ResponsibleParty(encompassingEncounter4_ResponsibleParty);
				if (result == null) result = caseResponsibleParty(encompassingEncounter4_ResponsibleParty);
				if (result == null) result = caseParticipation(encompassingEncounter4_ResponsibleParty);
				if (result == null) result = caseInfrastructureRoot(encompassingEncounter4_ResponsibleParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT: {
				EncompassingEncounter4_EncounterParticipant encompassingEncounter4_EncounterParticipant = (EncompassingEncounter4_EncounterParticipant)theEObject;
				T result = caseEncompassingEncounter4_EncounterParticipant(encompassingEncounter4_EncounterParticipant);
				if (result == null) result = caseEncounterParticipant(encompassingEncounter4_EncounterParticipant);
				if (result == null) result = caseParticipation(encompassingEncounter4_EncounterParticipant);
				if (result == null) result = caseInfrastructureRoot(encompassingEncounter4_EncounterParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.OPERATIVE_NOTE: {
				OperativeNote operativeNote = (OperativeNote)theEObject;
				T result = caseOperativeNote(operativeNote);
				if (result == null) result = caseGeneralHeaderConstraints(operativeNote);
				if (result == null) result = caseClinicalDocument(operativeNote);
				if (result == null) result = caseAct(operativeNote);
				if (result == null) result = caseInfrastructureRoot(operativeNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.OPERATIVE_NOTE_DOCUMENTATION_OF: {
				OperativeNote_DocumentationOf operativeNote_DocumentationOf = (OperativeNote_DocumentationOf)theEObject;
				T result = caseOperativeNote_DocumentationOf(operativeNote_DocumentationOf);
				if (result == null) result = caseDocumentationOf(operativeNote_DocumentationOf);
				if (result == null) result = caseActRelationship(operativeNote_DocumentationOf);
				if (result == null) result = caseInfrastructureRoot(operativeNote_DocumentationOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DOCUMENTATION_OF_SERVICE_EVENT: {
				DocumentationOf_ServiceEvent documentationOf_ServiceEvent = (DocumentationOf_ServiceEvent)theEObject;
				T result = caseDocumentationOf_ServiceEvent(documentationOf_ServiceEvent);
				if (result == null) result = caseServiceEvent(documentationOf_ServiceEvent);
				if (result == null) result = caseAct(documentationOf_ServiceEvent);
				if (result == null) result = caseInfrastructureRoot(documentationOf_ServiceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SERVICE_EVENT_PRIMARY_PERFORMER: {
				ServiceEvent_PrimaryPerformer serviceEvent_PrimaryPerformer = (ServiceEvent_PrimaryPerformer)theEObject;
				T result = caseServiceEvent_PrimaryPerformer(serviceEvent_PrimaryPerformer);
				if (result == null) result = casePerformer1(serviceEvent_PrimaryPerformer);
				if (result == null) result = caseParticipation(serviceEvent_PrimaryPerformer);
				if (result == null) result = caseInfrastructureRoot(serviceEvent_PrimaryPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_NOTE: {
				ProcedureNote procedureNote = (ProcedureNote)theEObject;
				T result = caseProcedureNote(procedureNote);
				if (result == null) result = caseGeneralHeaderConstraints(procedureNote);
				if (result == null) result = caseClinicalDocument(procedureNote);
				if (result == null) result = caseAct(procedureNote);
				if (result == null) result = caseInfrastructureRoot(procedureNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_NOTE_COMPONENT_OF: {
				ProcedureNote_ComponentOf procedureNote_ComponentOf = (ProcedureNote_ComponentOf)theEObject;
				T result = caseProcedureNote_ComponentOf(procedureNote_ComponentOf);
				if (result == null) result = caseComponent1(procedureNote_ComponentOf);
				if (result == null) result = caseActRelationship(procedureNote_ComponentOf);
				if (result == null) result = caseInfrastructureRoot(procedureNote_ComponentOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER5: {
				ComponentOf_EncompassingEncounter5 componentOf_EncompassingEncounter5 = (ComponentOf_EncompassingEncounter5)theEObject;
				T result = caseComponentOf_EncompassingEncounter5(componentOf_EncompassingEncounter5);
				if (result == null) result = caseEncompassingEncounter(componentOf_EncompassingEncounter5);
				if (result == null) result = caseAct(componentOf_EncompassingEncounter5);
				if (result == null) result = caseInfrastructureRoot(componentOf_EncompassingEncounter5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOMPASSING_ENCOUNTER5_LOCATION: {
				EncompassingEncounter5_Location encompassingEncounter5_Location = (EncompassingEncounter5_Location)theEObject;
				T result = caseEncompassingEncounter5_Location(encompassingEncounter5_Location);
				if (result == null) result = caseLocation(encompassingEncounter5_Location);
				if (result == null) result = caseParticipation(encompassingEncounter5_Location);
				if (result == null) result = caseInfrastructureRoot(encompassingEncounter5_Location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.LOCATION_HEALTH_CARE_FACILITY: {
				Location_HealthCareFacility location_HealthCareFacility = (Location_HealthCareFacility)theEObject;
				T result = caseLocation_HealthCareFacility(location_HealthCareFacility);
				if (result == null) result = caseHealthCareFacility(location_HealthCareFacility);
				if (result == null) result = caseRole(location_HealthCareFacility);
				if (result == null) result = caseInfrastructureRoot(location_HealthCareFacility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT: {
				EncompassingEncounter5_EncounterParticipant encompassingEncounter5_EncounterParticipant = (EncompassingEncounter5_EncounterParticipant)theEObject;
				T result = caseEncompassingEncounter5_EncounterParticipant(encompassingEncounter5_EncounterParticipant);
				if (result == null) result = caseEncounterParticipant(encompassingEncounter5_EncounterParticipant);
				if (result == null) result = caseParticipation(encompassingEncounter5_EncounterParticipant);
				if (result == null) result = caseInfrastructureRoot(encompassingEncounter5_EncounterParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_NOTE_INDIVIDUAL: {
				ProcedureNote_Individual procedureNote_Individual = (ProcedureNote_Individual)theEObject;
				T result = caseProcedureNote_Individual(procedureNote_Individual);
				if (result == null) result = caseParticipant1(procedureNote_Individual);
				if (result == null) result = caseParticipation(procedureNote_Individual);
				if (result == null) result = caseInfrastructureRoot(procedureNote_Individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_NOTE_PRIMARY_CARE_PHYSICIAN: {
				ProcedureNote_PrimaryCarePhysician procedureNote_PrimaryCarePhysician = (ProcedureNote_PrimaryCarePhysician)theEObject;
				T result = caseProcedureNote_PrimaryCarePhysician(procedureNote_PrimaryCarePhysician);
				if (result == null) result = caseParticipant1(procedureNote_PrimaryCarePhysician);
				if (result == null) result = caseParticipation(procedureNote_PrimaryCarePhysician);
				if (result == null) result = caseInfrastructureRoot(procedureNote_PrimaryCarePhysician);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_NOTE_PROVIDER: {
				ProcedureNote_Provider procedureNote_Provider = (ProcedureNote_Provider)theEObject;
				T result = caseProcedureNote_Provider(procedureNote_Provider);
				if (result == null) result = caseParticipant1(procedureNote_Provider);
				if (result == null) result = caseParticipation(procedureNote_Provider);
				if (result == null) result = caseInfrastructureRoot(procedureNote_Provider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROVIDER_ASSOCIATED_ENTITY: {
				Provider_AssociatedEntity provider_AssociatedEntity = (Provider_AssociatedEntity)theEObject;
				T result = caseProvider_AssociatedEntity(provider_AssociatedEntity);
				if (result == null) result = caseAssociatedEntity(provider_AssociatedEntity);
				if (result == null) result = caseRole(provider_AssociatedEntity);
				if (result == null) result = caseInfrastructureRoot(provider_AssociatedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_NOTE_DOCUMENTATION_OF: {
				ProcedureNote_DocumentationOf procedureNote_DocumentationOf = (ProcedureNote_DocumentationOf)theEObject;
				T result = caseProcedureNote_DocumentationOf(procedureNote_DocumentationOf);
				if (result == null) result = caseDocumentationOf(procedureNote_DocumentationOf);
				if (result == null) result = caseActRelationship(procedureNote_DocumentationOf);
				if (result == null) result = caseInfrastructureRoot(procedureNote_DocumentationOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DOCUMENTATION_OF_SERVICE_EVENT1: {
				DocumentationOf_ServiceEvent1 documentationOf_ServiceEvent1 = (DocumentationOf_ServiceEvent1)theEObject;
				T result = caseDocumentationOf_ServiceEvent1(documentationOf_ServiceEvent1);
				if (result == null) result = caseServiceEvent(documentationOf_ServiceEvent1);
				if (result == null) result = caseAct(documentationOf_ServiceEvent1);
				if (result == null) result = caseInfrastructureRoot(documentationOf_ServiceEvent1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.SERVICE_EVENT1_PRIMARY_PERFORMER: {
				ServiceEvent1_PrimaryPerformer serviceEvent1_PrimaryPerformer = (ServiceEvent1_PrimaryPerformer)theEObject;
				T result = caseServiceEvent1_PrimaryPerformer(serviceEvent1_PrimaryPerformer);
				if (result == null) result = casePerformer1(serviceEvent1_PrimaryPerformer);
				if (result == null) result = caseParticipation(serviceEvent1_PrimaryPerformer);
				if (result == null) result = caseInfrastructureRoot(serviceEvent1_PrimaryPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROGRESS_NOTE: {
				ProgressNote progressNote = (ProgressNote)theEObject;
				T result = caseProgressNote(progressNote);
				if (result == null) result = caseGeneralHeaderConstraints(progressNote);
				if (result == null) result = caseClinicalDocument(progressNote);
				if (result == null) result = caseAct(progressNote);
				if (result == null) result = caseInfrastructureRoot(progressNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROGRESS_NOTE_DOCUMENTATION_OF: {
				ProgressNote_DocumentationOf progressNote_DocumentationOf = (ProgressNote_DocumentationOf)theEObject;
				T result = caseProgressNote_DocumentationOf(progressNote_DocumentationOf);
				if (result == null) result = caseDocumentationOf(progressNote_DocumentationOf);
				if (result == null) result = caseActRelationship(progressNote_DocumentationOf);
				if (result == null) result = caseInfrastructureRoot(progressNote_DocumentationOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DOCUMENTATION_OF_SERVICE_EVENT2: {
				DocumentationOf_ServiceEvent2 documentationOf_ServiceEvent2 = (DocumentationOf_ServiceEvent2)theEObject;
				T result = caseDocumentationOf_ServiceEvent2(documentationOf_ServiceEvent2);
				if (result == null) result = caseServiceEvent(documentationOf_ServiceEvent2);
				if (result == null) result = caseAct(documentationOf_ServiceEvent2);
				if (result == null) result = caseInfrastructureRoot(documentationOf_ServiceEvent2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROGRESS_NOTE_COMPONENT_OF: {
				ProgressNote_ComponentOf progressNote_ComponentOf = (ProgressNote_ComponentOf)theEObject;
				T result = caseProgressNote_ComponentOf(progressNote_ComponentOf);
				if (result == null) result = caseComponent1(progressNote_ComponentOf);
				if (result == null) result = caseActRelationship(progressNote_ComponentOf);
				if (result == null) result = caseInfrastructureRoot(progressNote_ComponentOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER6: {
				ComponentOf_EncompassingEncounter6 componentOf_EncompassingEncounter6 = (ComponentOf_EncompassingEncounter6)theEObject;
				T result = caseComponentOf_EncompassingEncounter6(componentOf_EncompassingEncounter6);
				if (result == null) result = caseEncompassingEncounter(componentOf_EncompassingEncounter6);
				if (result == null) result = caseAct(componentOf_EncompassingEncounter6);
				if (result == null) result = caseInfrastructureRoot(componentOf_EncompassingEncounter6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOMPASSING_ENCOUNTER6_LOCATION: {
				EncompassingEncounter6_Location encompassingEncounter6_Location = (EncompassingEncounter6_Location)theEObject;
				T result = caseEncompassingEncounter6_Location(encompassingEncounter6_Location);
				if (result == null) result = caseLocation(encompassingEncounter6_Location);
				if (result == null) result = caseParticipation(encompassingEncounter6_Location);
				if (result == null) result = caseInfrastructureRoot(encompassingEncounter6_Location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.LOCATION_HEALTH_CARE_FACILITY1: {
				Location_HealthCareFacility1 location_HealthCareFacility1 = (Location_HealthCareFacility1)theEObject;
				T result = caseLocation_HealthCareFacility1(location_HealthCareFacility1);
				if (result == null) result = caseHealthCareFacility(location_HealthCareFacility1);
				if (result == null) result = caseRole(location_HealthCareFacility1);
				if (result == null) result = caseInfrastructureRoot(location_HealthCareFacility1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS: {
				PreoperativeDiagnosis preoperativeDiagnosis = (PreoperativeDiagnosis)theEObject;
				T result = casePreoperativeDiagnosis(preoperativeDiagnosis);
				if (result == null) result = caseCDA_Act(preoperativeDiagnosis);
				if (result == null) result = caseClinicalStatement(preoperativeDiagnosis);
				if (result == null) result = caseAct(preoperativeDiagnosis);
				if (result == null) result = caseInfrastructureRoot(preoperativeDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.INSTRUCTIONS_SECTION: {
				InstructionsSection instructionsSection = (InstructionsSection)theEObject;
				T result = caseInstructionsSection(instructionsSection);
				if (result == null) result = caseSection(instructionsSection);
				if (result == null) result = caseAct(instructionsSection);
				if (result == null) result = caseInfrastructureRoot(instructionsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.HOSPITAL_ADMISSION_DIAGNOSIS: {
				HospitalAdmissionDiagnosis hospitalAdmissionDiagnosis = (HospitalAdmissionDiagnosis)theEObject;
				T result = caseHospitalAdmissionDiagnosis(hospitalAdmissionDiagnosis);
				if (result == null) result = caseCDA_Act(hospitalAdmissionDiagnosis);
				if (result == null) result = caseClinicalStatement(hospitalAdmissionDiagnosis);
				if (result == null) result = caseAct(hospitalAdmissionDiagnosis);
				if (result == null) result = caseInfrastructureRoot(hospitalAdmissionDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.MEDICATION_DISPENSE_ASSIGNED_ENTITY: {
				MedicationDispenseAssignedEntity medicationDispenseAssignedEntity = (MedicationDispenseAssignedEntity)theEObject;
				T result = caseMedicationDispenseAssignedEntity(medicationDispenseAssignedEntity);
				if (result == null) result = caseAssignedEntity(medicationDispenseAssignedEntity);
				if (result == null) result = caseRole(medicationDispenseAssignedEntity);
				if (result == null) result = caseInfrastructureRoot(medicationDispenseAssignedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL: {
				ImmunizationMedicationInformationManufacturedMaterial immunizationMedicationInformationManufacturedMaterial = (ImmunizationMedicationInformationManufacturedMaterial)theEObject;
				T result = caseImmunizationMedicationInformationManufacturedMaterial(immunizationMedicationInformationManufacturedMaterial);
				if (result == null) result = caseMaterial(immunizationMedicationInformationManufacturedMaterial);
				if (result == null) result = caseEntity(immunizationMedicationInformationManufacturedMaterial);
				if (result == null) result = caseInfrastructureRoot(immunizationMedicationInformationManufacturedMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DIAGNOSTIC_IMAGING_REPORT: {
				DiagnosticImagingReport diagnosticImagingReport = (DiagnosticImagingReport)theEObject;
				T result = caseDiagnosticImagingReport(diagnosticImagingReport);
				if (result == null) result = caseGeneralHeaderConstraints(diagnosticImagingReport);
				if (result == null) result = caseClinicalDocument(diagnosticImagingReport);
				if (result == null) result = caseAct(diagnosticImagingReport);
				if (result == null) result = caseInfrastructureRoot(diagnosticImagingReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT: {
				DiagnosticImagingReport_Participant diagnosticImagingReport_Participant = (DiagnosticImagingReport_Participant)theEObject;
				T result = caseDiagnosticImagingReport_Participant(diagnosticImagingReport_Participant);
				if (result == null) result = caseParticipant1(diagnosticImagingReport_Participant);
				if (result == null) result = caseParticipation(diagnosticImagingReport_Participant);
				if (result == null) result = caseInfrastructureRoot(diagnosticImagingReport_Participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PARTICIPANT_ASSOCIATED_ENTITY: {
				Participant_AssociatedEntity participant_AssociatedEntity = (Participant_AssociatedEntity)theEObject;
				T result = caseParticipant_AssociatedEntity(participant_AssociatedEntity);
				if (result == null) result = caseAssociatedEntity(participant_AssociatedEntity);
				if (result == null) result = caseRole(participant_AssociatedEntity);
				if (result == null) result = caseInfrastructureRoot(participant_AssociatedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ASSOCIATED_ENTITY_PERSON: {
				AssociatedEntity_Person associatedEntity_Person = (AssociatedEntity_Person)theEObject;
				T result = caseAssociatedEntity_Person(associatedEntity_Person);
				if (result == null) result = casePerson(associatedEntity_Person);
				if (result == null) result = caseEntity(associatedEntity_Person);
				if (result == null) result = caseInfrastructureRoot(associatedEntity_Person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF: {
				DiagnosticImagingReport_InFulfillmentOf diagnosticImagingReport_InFulfillmentOf = (DiagnosticImagingReport_InFulfillmentOf)theEObject;
				T result = caseDiagnosticImagingReport_InFulfillmentOf(diagnosticImagingReport_InFulfillmentOf);
				if (result == null) result = caseInFulfillmentOf(diagnosticImagingReport_InFulfillmentOf);
				if (result == null) result = caseActRelationship(diagnosticImagingReport_InFulfillmentOf);
				if (result == null) result = caseInfrastructureRoot(diagnosticImagingReport_InFulfillmentOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF: {
				DiagnosticImagingReport_DocumentationOf diagnosticImagingReport_DocumentationOf = (DiagnosticImagingReport_DocumentationOf)theEObject;
				T result = caseDiagnosticImagingReport_DocumentationOf(diagnosticImagingReport_DocumentationOf);
				if (result == null) result = caseDocumentationOf(diagnosticImagingReport_DocumentationOf);
				if (result == null) result = caseActRelationship(diagnosticImagingReport_DocumentationOf);
				if (result == null) result = caseInfrastructureRoot(diagnosticImagingReport_DocumentationOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DOCUMENTATION_OF_SERVICE_EVENT4: {
				DocumentationOf_ServiceEvent4 documentationOf_ServiceEvent4 = (DocumentationOf_ServiceEvent4)theEObject;
				T result = caseDocumentationOf_ServiceEvent4(documentationOf_ServiceEvent4);
				if (result == null) result = caseServiceEvent(documentationOf_ServiceEvent4);
				if (result == null) result = caseAct(documentationOf_ServiceEvent4);
				if (result == null) result = caseInfrastructureRoot(documentationOf_ServiceEvent4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT: {
				DiagnosticImagingReport_RelatedDocument diagnosticImagingReport_RelatedDocument = (DiagnosticImagingReport_RelatedDocument)theEObject;
				T result = caseDiagnosticImagingReport_RelatedDocument(diagnosticImagingReport_RelatedDocument);
				if (result == null) result = caseRelatedDocument(diagnosticImagingReport_RelatedDocument);
				if (result == null) result = caseActRelationship(diagnosticImagingReport_RelatedDocument);
				if (result == null) result = caseInfrastructureRoot(diagnosticImagingReport_RelatedDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF: {
				DiagnosticImagingReport_ComponentOf diagnosticImagingReport_ComponentOf = (DiagnosticImagingReport_ComponentOf)theEObject;
				T result = caseDiagnosticImagingReport_ComponentOf(diagnosticImagingReport_ComponentOf);
				if (result == null) result = caseComponent1(diagnosticImagingReport_ComponentOf);
				if (result == null) result = caseActRelationship(diagnosticImagingReport_ComponentOf);
				if (result == null) result = caseInfrastructureRoot(diagnosticImagingReport_ComponentOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER7: {
				ComponentOf_EncompassingEncounter7 componentOf_EncompassingEncounter7 = (ComponentOf_EncompassingEncounter7)theEObject;
				T result = caseComponentOf_EncompassingEncounter7(componentOf_EncompassingEncounter7);
				if (result == null) result = caseEncompassingEncounter(componentOf_EncompassingEncounter7);
				if (result == null) result = caseAct(componentOf_EncompassingEncounter7);
				if (result == null) result = caseInfrastructureRoot(componentOf_EncompassingEncounter7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY: {
				EncompassingEncounter7_ResponsibleParty encompassingEncounter7_ResponsibleParty = (EncompassingEncounter7_ResponsibleParty)theEObject;
				T result = caseEncompassingEncounter7_ResponsibleParty(encompassingEncounter7_ResponsibleParty);
				if (result == null) result = caseResponsibleParty(encompassingEncounter7_ResponsibleParty);
				if (result == null) result = caseParticipation(encompassingEncounter7_ResponsibleParty);
				if (result == null) result = caseInfrastructureRoot(encompassingEncounter7_ResponsibleParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.RESPONSIBLE_PARTY_ASSIGNED_ENTITY: {
				ResponsibleParty_AssignedEntity responsibleParty_AssignedEntity = (ResponsibleParty_AssignedEntity)theEObject;
				T result = caseResponsibleParty_AssignedEntity(responsibleParty_AssignedEntity);
				if (result == null) result = caseAssignedEntity(responsibleParty_AssignedEntity);
				if (result == null) result = caseRole(responsibleParty_AssignedEntity);
				if (result == null) result = caseInfrastructureRoot(responsibleParty_AssignedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PHYSICIAN_READING_STUDY_PERFORMER: {
				PhysicianReadingStudyPerformer physicianReadingStudyPerformer = (PhysicianReadingStudyPerformer)theEObject;
				T result = casePhysicianReadingStudyPerformer(physicianReadingStudyPerformer);
				if (result == null) result = casePerformer1(physicianReadingStudyPerformer);
				if (result == null) result = caseParticipation(physicianReadingStudyPerformer);
				if (result == null) result = caseInfrastructureRoot(physicianReadingStudyPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY: {
				PhysicianReadingStudyPerformer_AssignedEntity physicianReadingStudyPerformer_AssignedEntity = (PhysicianReadingStudyPerformer_AssignedEntity)theEObject;
				T result = casePhysicianReadingStudyPerformer_AssignedEntity(physicianReadingStudyPerformer_AssignedEntity);
				if (result == null) result = caseAssignedEntity(physicianReadingStudyPerformer_AssignedEntity);
				if (result == null) result = caseRole(physicianReadingStudyPerformer_AssignedEntity);
				if (result == null) result = caseInfrastructureRoot(physicianReadingStudyPerformer_AssignedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PHYSICIANOF_RECORD_PARTICIPANT: {
				PhysicianofRecordParticipant physicianofRecordParticipant = (PhysicianofRecordParticipant)theEObject;
				T result = casePhysicianofRecordParticipant(physicianofRecordParticipant);
				if (result == null) result = caseEncounterParticipant(physicianofRecordParticipant);
				if (result == null) result = caseParticipation(physicianofRecordParticipant);
				if (result == null) result = caseInfrastructureRoot(physicianofRecordParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY: {
				PhysicianofRecordParticipant_AssignedEntity physicianofRecordParticipant_AssignedEntity = (PhysicianofRecordParticipant_AssignedEntity)theEObject;
				T result = casePhysicianofRecordParticipant_AssignedEntity(physicianofRecordParticipant_AssignedEntity);
				if (result == null) result = caseAssignedEntity(physicianofRecordParticipant_AssignedEntity);
				if (result == null) result = caseRole(physicianofRecordParticipant_AssignedEntity);
				if (result == null) result = caseInfrastructureRoot(physicianofRecordParticipant_AssignedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.ASSIGNED_ENTITY_ASSIGNED_PERSON: {
				AssignedEntity_AssignedPerson assignedEntity_AssignedPerson = (AssignedEntity_AssignedPerson)theEObject;
				T result = caseAssignedEntity_AssignedPerson(assignedEntity_AssignedPerson);
				if (result == null) result = casePerson(assignedEntity_AssignedPerson);
				if (result == null) result = caseEntity(assignedEntity_AssignedPerson);
				if (result == null) result = caseInfrastructureRoot(assignedEntity_AssignedPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.TEXT_OBSERVATION: {
				TextObservation textObservation = (TextObservation)theEObject;
				T result = caseTextObservation(textObservation);
				if (result == null) result = caseObservation(textObservation);
				if (result == null) result = caseClinicalStatement(textObservation);
				if (result == null) result = caseAct(textObservation);
				if (result == null) result = caseInfrastructureRoot(textObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.QUANTITY_MEASUREMENT_OBSERVATION: {
				QuantityMeasurementObservation quantityMeasurementObservation = (QuantityMeasurementObservation)theEObject;
				T result = caseQuantityMeasurementObservation(quantityMeasurementObservation);
				if (result == null) result = caseObservation(quantityMeasurementObservation);
				if (result == null) result = caseClinicalStatement(quantityMeasurementObservation);
				if (result == null) result = caseAct(quantityMeasurementObservation);
				if (result == null) result = caseInfrastructureRoot(quantityMeasurementObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.CODE_OBSERVATIONS: {
				CodeObservations codeObservations = (CodeObservations)theEObject;
				T result = caseCodeObservations(codeObservations);
				if (result == null) result = caseObservation(codeObservations);
				if (result == null) result = caseClinicalStatement(codeObservations);
				if (result == null) result = caseAct(codeObservations);
				if (result == null) result = caseInfrastructureRoot(codeObservations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsolPackage.PROCEDURE_CONTEXT: {
				ProcedureContext procedureContext = (ProcedureContext)theEObject;
				T result = caseProcedureContext(procedureContext);
				if (result == null) result = caseCDA_Act(procedureContext);
				if (result == null) result = caseClinicalStatement(procedureContext);
				if (result == null) result = caseAct(procedureContext);
				if (result == null) result = caseInfrastructureRoot(procedureContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Record Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Record Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_RecordTarget(GeneralHeaderConstraints_RecordTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Target Patient Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Target Patient Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTarget_PatientRole(RecordTarget_PatientRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Role Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Role Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientRole_Patient(PatientRole_Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Guardian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient_Guardian(Patient_Guardian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Language Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Language Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient_LanguageCommunication(Patient_LanguageCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Birthplace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Birthplace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient_Birthplace(Patient_Birthplace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Birthplace Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Birthplace Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBirthplace_Place(Birthplace_Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Role Provider Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Role Provider Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientRole_ProviderOrganization(PatientRole_ProviderOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Component Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Component Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_ComponentOf(GeneralHeaderConstraints_ComponentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentOf_EncompassingEncounter(ComponentOf_EncompassingEncounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_Author(GeneralHeaderConstraints_Author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Assigned Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthor_AssignedAuthor(Author_AssignedAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Author Authoring Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Author Authoring Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedAuthor_AuthoringDevice(AssignedAuthor_AuthoringDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_Person(GeneralHeaderConstraints_Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Data Enterer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_DataEnterer(GeneralHeaderConstraints_DataEnterer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Enterer Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Enterer Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataEnterer_AssignedEntity(DataEnterer_AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_Custodian(GeneralHeaderConstraints_Custodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian Assigned Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian Assigned Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodian_AssignedCustodian(Custodian_AssignedCustodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Custodian Custodian Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Custodian Custodian Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedCustodian_CustodianOrganization(AssignedCustodian_CustodianOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Information Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Information Recipient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_InformationRecipient(GeneralHeaderConstraints_InformationRecipient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Recipient Intended Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Recipient Intended Recipient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationRecipient_IntendedRecipient(InformationRecipient_IntendedRecipient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intended Recipient Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intended Recipient Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntendedRecipient_Organization(IntendedRecipient_Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Legal Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Legal Authenticator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_LegalAuthenticator(GeneralHeaderConstraints_LegalAuthenticator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Authenticator Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Authenticator Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalAuthenticator_AssignedEntity(LegalAuthenticator_AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Authenticator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_Authenticator(GeneralHeaderConstraints_Authenticator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authenticator Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authenticator Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticator_AssignedEntity(Authenticator_AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Informant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Informant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_Informant(GeneralHeaderConstraints_Informant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informant Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informant Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformant_AssignedEntity(Informant_AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informant Related Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informant Related Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformant_RelatedEntity(Informant_RelatedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Participant Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Participant Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_ParticipantSupport(GeneralHeaderConstraints_ParticipantSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints In Fulfillment Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints In Fulfillment Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_InFulfillmentOf(GeneralHeaderConstraints_InFulfillmentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Fulfillment Of Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Fulfillment Of Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInFulfillmentOf_Order(InFulfillmentOf_Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Problem Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyProblemAct(AllergyProblemAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyObservation(AllergyObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaction Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactionObservation(ReactionObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Severity Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeverityObservation(SeverityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyStatusObservation(AllergyStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Age Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgeObservation(AgeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthStatusObservation(HealthStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationActivity(MedicationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Medicinal Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Medicinal Supply Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonMedicinalSupplyActivity(NonMedicinalSupplyActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstance(ProductInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance Scoping Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance Scoping Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstance_ScopingEntity(ProductInstance_ScopingEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance Playing Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance Playing Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstance_PlayingDevice(ProductInstance_PlayingDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructions(Instructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndication(Indication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispense(MedicationDispense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispense_Product(MedicationDispense_Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Supply Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Supply Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationSupplyOrder(MedicationSupplyOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Supply Order Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Supply Order Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationSupplyOrder_Product(MedicationSupplyOrder_Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drug Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drug Vehicle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrugVehicle(DrugVehicle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalReference(InternalReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationType(MedicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Fullfillment Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationFullfillmentInstructions(MedicationFullfillmentInstructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Concern Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Concern Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemConcernAct(ProblemConcernAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemObservation(ProblemObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemStatus(ProblemStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity Of Care Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityOfCareDocument(ContinuityOfCareDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity Of Care Document Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity Of Care Document Documentation Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityOfCareDocument_DocumentationOf(ContinuityOfCareDocument_DocumentationOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Of Service Event3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Of Service Event3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationOf_ServiceEvent3(DocumentationOf_ServiceEvent3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Event3 Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Event3 Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEvent3_Performer(ServiceEvent3_Performer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performer Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performer Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformer_AssignedEntity(Performer_AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity Of Care Document Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity Of Care Document Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityOfCareDocument_Author(ContinuityOfCareDocument_Author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Assigned Author3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Assigned Author3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthor_AssignedAuthor3(Author_AssignedAuthor3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directives Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directives Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectivesSectionEntriesOptional(AdvanceDirectivesSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergies Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergies Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergiesSection(AllergiesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergies Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergies Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergiesSectionEntriesOptional(AllergiesSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSectionEntriesOptional(EncountersSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunizations Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunizations Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationsSectionEntriesOptional(ImmunizationsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payers Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayersSection(PayersSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageActivity(CoverageActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyActivity(PolicyActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationActivity(AuthorizationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsSection(MedicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsSectionEntriesOptional(MedicationsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareSection(PlanOfCareSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityAct(PlanOfCareActivityAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityEncounter(PlanOfCareActivityEncounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityObservation(PlanOfCareActivityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityProcedure(PlanOfCareActivityProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivitySubstanceAdministration(PlanOfCareActivitySubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivitySupply(PlanOfCareActivitySupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedures Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSection(ProceduresSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedures Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedures Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSectionEntriesOptional(ProceduresSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityObservation(ProcedureActivityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityAct(ProcedureActivityAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityProcedure(ProcedureActivityProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsSectionEntriesOptional(VitalSignsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistorySection(FamilyHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryOrganizer(FamilyHistoryOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryObservation(FamilyHistoryObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Death Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryDeathObservation(FamilyHistoryDeathObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistorySection(SocialHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistoryObservation(SocialHistoryObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pregnancy Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePregnancyObservation(PregnancyObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Estimated Date Of Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Estimated Date Of Delivery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEstimatedDateOfDelivery(EstimatedDateOfDelivery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSection(ResultsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSectionEntriesOptional(ResultsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultOrganizer(ResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultObservation(ResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical Equipment Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalEquipmentSection(MedicalEquipmentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusSection(FunctionalStatusSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemSection(ProblemSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemSectionEntriesOptional(ProblemSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistoryStatusObservation(SocialHistoryStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purpose Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurposeSection(PurposeSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purpose Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurposeActivity(PurposeActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directives Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectivesSection(AdvanceDirectivesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveObservation(AdvanceDirectiveObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Observation Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Observation Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveObservation_Reference(AdvanceDirectiveObservation_Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference External Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference External Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference_ExternalDocument(Reference_ExternalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Observation Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Observation Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveObservation_Custodian(AdvanceDirectiveObservation_Custodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian Custodian Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian Custodian Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodian_CustodianRole(Custodian_CustodianRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian Role Custodian Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian Role Custodian Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodianRole_CustodianEntity(CustodianRole_CustodianEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Observation Verifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Observation Verifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveObservation_Verifier(AdvanceDirectiveObservation_Verifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Verification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveVerification(AdvanceDirectiveVerification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveStatusObservation(AdvanceDirectiveStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSection(EncountersSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Activities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Activities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterActivities(EncounterActivities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Delivery Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Delivery Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDeliveryLocation(ServiceDeliveryLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounter(Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunizations Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationsSection(ImmunizationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationActivity(ImmunizationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Refusal Reason</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Refusal Reason</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRefusalReason(ImmunizationRefusalReason object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsuranceProvider(InsuranceProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payer Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payer Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayerEntry(PayerEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Covered Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Covered Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoveredParty(CoveredParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicySubscriber(PolicySubscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Specimen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureSpecimen(ProcedureSpecimen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedurePerformer(ProcedurePerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureEncounter(ProcedureEncounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Information Manufactured Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Information Manufactured Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationInformationManufacturedMaterial(MedicationInformationManufacturedMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistorySubject(FamilyHistorySubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Studies Summary Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Studies Summary Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeStudiesSummarySection(HospitalDischargeStudiesSummarySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeMedication(DischargeMedication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeDiagnosis(HospitalDischargeDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Instructions Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Instructions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeInstructionsSection(HospitalDischargeInstructionsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReference(ExternalReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupport(Support object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsSection(VitalSignsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsOrganizer(VitalSignsOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Sign Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignObservation(VitalSignObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Past Illness Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryOfPastIllnessSection(HistoryOfPastIllnessSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chief Complaint Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChiefComplaintSection(ChiefComplaintSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Referral Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonForReferralSection(ReasonForReferralSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Present Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Present Illness Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryOfPresentIllnessSection(HistoryOfPresentIllnessSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalAdmissionDiagnosisSection(HospitalAdmissionDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeDiagnosisSection(HospitalDischargeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Admission Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Admission Medications Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalAdmissionMedicationsSectionEntriesOptional(
			HospitalAdmissionMedicationsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admission Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admission Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmissionMedication(AdmissionMedication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeMedicationsSection(HospitalDischargeMedicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Physical Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Physical Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargePhysicalSection(HospitalDischargePhysicalSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chief Complaint And Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chief Complaint And Reason For Visit Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChiefComplaintAndReasonForVisitSection(ChiefComplaintAndReasonForVisitSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Visit Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonForVisitSection(ReasonForVisitSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Informant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Informant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedInformant(RelatedInformant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterPerformer(EncounterPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Performer Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Performer Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterPerformerAssignedEntity(EncounterPerformerAssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Administered Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsAdministeredSection(MedicationsAdministeredSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Exam Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalExamSection(PhysicalExamSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Status Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralStatusSection(GeneralStatusSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Review Of Systems Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReviewOfSystemsSection(ReviewOfSystemsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Course Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalCourseSection(HospitalCourseSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment And Plan Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentAndPlanSection(AssessmentAndPlanSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Spoken</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageSpoken(LanguageSpoken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareProvider(HealthcareProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Guardian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportGuardian(SupportGuardian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportParticipant(SupportParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surgical Drains Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surgical Drains Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurgicalDrainsSection(SurgicalDrainsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredDocument(UnstructuredDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Document Record Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Document Record Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredDocument_RecordTarget(UnstructuredDocument_RecordTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Target Patient Role2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Target Patient Role2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTarget_PatientRole2(RecordTarget_PatientRole2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Document Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Document Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredDocument_Author(UnstructuredDocument_Author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Assigned Author2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Assigned Author2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthor_AssignedAuthor2(Author_AssignedAuthor2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Document Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Document Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredDocument_Custodian(UnstructuredDocument_Custodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian Assigned Custodian3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian Assigned Custodian3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodian_AssignedCustodian3(Custodian_AssignedCustodian3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Custodian3 Custodian Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Custodian3 Custodian Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedCustodian3_CustodianOrganization(AssignedCustodian3_CustodianOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Document Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Document Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredDocument_Component(UnstructuredDocument_Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Non XML Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Non XML Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent_NonXMLBody(Component_NonXMLBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scan Original Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scan Original Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScanOriginalAuthor(ScanOriginalAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scanning Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScanningDevice(ScanningDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scan Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scan Data Enterer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScanDataEnterer(ScanDataEnterer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationInformation(MedicationInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Or Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Or Scanned Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredOrScannedDocument(UnstructuredOrScannedDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referral Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referral Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferralSummary(ReferralSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeSummary(DischargeSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Summary Component Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Summary Component Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeSummary_ComponentOf(DischargeSummary_ComponentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentOf_EncompassingEncounter3(ComponentOf_EncompassingEncounter3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter3 Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter3 Responsible Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter3_ResponsibleParty(EncompassingEncounter3_ResponsibleParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter3 Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter3 Encounter Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter3_EncounterParticipant(EncompassingEncounter3_EncounterParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Diet Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Diet Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeDietSection(DischargeDietSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeMedicationsSectionEntriesOptional(
			HospitalDischargeMedicationsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition For Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition For Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreconditionForSubstanceAdministration(PreconditionForSubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Medication Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationMedicationInformation(ImmunizationMedicationInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalStatement(ClinicalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceAdministration(SubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupply(Supply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDA_Entity(org.openhealthtools.mdht.uml.cda.Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantRole(ParticipantRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDA_Encounter(org.openhealthtools.mdht.uml.cda.Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizer(Organizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipation(Participation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant2(Participant2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActRelationship(ActRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageCommunication(LanguageCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Observation Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Observation Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyObservationParticipant(AllergyObservationParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Observation Participant Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Observation Participant Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyObservationParticipantRole(AllergyObservationParticipantRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Observation Playing Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Observation Playing Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyObservationPlayingEntity(AllergyObservationPlayingEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anesthesia Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anesthesia Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnesthesiaSection(AnesthesiaSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplicationsSection(ComplicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICOM Object Catalog Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICOM Object Catalog Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICOMObjectCatalogSection(DICOMObjectCatalogSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyAct(StudyAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Series Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Series Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeriesAct(SeriesAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SOP Instance Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SOP Instance Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSOPInstanceObservation(SOPInstanceObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purposeof Reference Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purposeof Reference Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurposeofReferenceObservation(PurposeofReferenceObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenced Frames Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenced Frames Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencedFramesObservation(ReferencedFramesObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundaryObservation(BoundaryObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Findings Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Findings Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindingsSection(FindingsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Consultations Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Consultations Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalConsultationsSection(HospitalConsultationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interventions Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interventions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterventionsSection(InterventionsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalHistorySection(MedicalHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveSection(ObjectiveSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operative Note Fluid Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operative Note Fluid Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperativeNoteFluidSection(OperativeNoteFluidSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operative Note Surgical Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operative Note Surgical Procedure Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperativeNoteSurgicalProcedureSection(OperativeNoteSurgicalProcedureSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Procedure Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedProcedureSection(PlannedProcedureSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postoperative Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postoperative Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostoperativeDiagnosisSection(PostoperativeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostprocedureDiagnosisSection(PostprocedureDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostprocedureDiagnosis(PostprocedureDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preoperative Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preoperative Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreoperativeDiagnosisSection(PreoperativeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Description Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Description Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureDescriptionSection(ProcedureDescriptionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Disposition Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Disposition Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureDispositionSection(ProcedureDispositionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Estimated Blood Loss Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Estimated Blood Loss Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureEstimatedBloodLossSection(ProcedureEstimatedBloodLossSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Findings Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Findings Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureFindingsSection(ProcedureFindingsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Implants Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Implants Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureImplantsSection(ProcedureImplantsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Indications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Indications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureIndicationsSection(ProcedureIndicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Specimens Taken Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Specimens Taken Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureSpecimensTakenSection(ProcedureSpecimensTakenSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subjective Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subjective Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectiveSection(SubjectiveSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consultation Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsultationNote(ConsultationNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consultation Note Component Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consultation Note Component Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsultationNote_ComponentOf(ConsultationNote_ComponentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentOf_EncompassingEncounter2(ComponentOf_EncompassingEncounter2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter2 Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter2 Responsible Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter2_ResponsibleParty(EncompassingEncounter2_ResponsibleParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter2 Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter2 Encounter Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter2_EncounterParticipant(EncompassingEncounter2_EncounterParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentSection(AssessmentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History And Physical Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History And Physical Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryAndPhysicalNote(HistoryAndPhysicalNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History And Physical Note Component Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History And Physical Note Component Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryAndPhysicalNote_ComponentOf(HistoryAndPhysicalNote_ComponentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentOf_EncompassingEncounter4(ComponentOf_EncompassingEncounter4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter4 Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter4 Responsible Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter4_ResponsibleParty(EncompassingEncounter4_ResponsibleParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter4 Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter4 Encounter Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter4_EncounterParticipant(EncompassingEncounter4_EncounterParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operative Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operative Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperativeNote(OperativeNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operative Note Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operative Note Documentation Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperativeNote_DocumentationOf(OperativeNote_DocumentationOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Of Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Of Service Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationOf_ServiceEvent(DocumentationOf_ServiceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Event Primary Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Event Primary Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEvent_PrimaryPerformer(ServiceEvent_PrimaryPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureNote(ProcedureNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Note Component Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Note Component Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureNote_ComponentOf(ProcedureNote_ComponentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentOf_EncompassingEncounter5(ComponentOf_EncompassingEncounter5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter5 Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter5 Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter5_Location(EncompassingEncounter5_Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Health Care Facility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Health Care Facility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation_HealthCareFacility(Location_HealthCareFacility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter5 Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter5 Encounter Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter5_EncounterParticipant(EncompassingEncounter5_EncounterParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Note Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Note Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureNote_Individual(ProcedureNote_Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Note Primary Care Physician</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Note Primary Care Physician</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureNote_PrimaryCarePhysician(ProcedureNote_PrimaryCarePhysician object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Note Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Note Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureNote_Provider(ProcedureNote_Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider Associated Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider Associated Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider_AssociatedEntity(Provider_AssociatedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Note Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Note Documentation Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureNote_DocumentationOf(ProcedureNote_DocumentationOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Of Service Event1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Of Service Event1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationOf_ServiceEvent1(DocumentationOf_ServiceEvent1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Event1 Primary Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Event1 Primary Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEvent1_PrimaryPerformer(ServiceEvent1_PrimaryPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressNote(ProgressNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Note Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Note Documentation Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressNote_DocumentationOf(ProgressNote_DocumentationOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Of Service Event2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Of Service Event2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationOf_ServiceEvent2(DocumentationOf_ServiceEvent2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Note Component Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Note Component Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressNote_ComponentOf(ProgressNote_ComponentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentOf_EncompassingEncounter6(ComponentOf_EncompassingEncounter6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter6 Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter6 Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter6_Location(EncompassingEncounter6_Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Health Care Facility1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Health Care Facility1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation_HealthCareFacility1(Location_HealthCareFacility1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preoperative Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preoperative Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreoperativeDiagnosis(PreoperativeDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instructions Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instructions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionsSection(InstructionsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalAdmissionDiagnosis(HospitalAdmissionDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispenseAssignedEntity(MedicationDispenseAssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Medication Information Manufactured Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Medication Information Manufactured Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationMedicationInformationManufacturedMaterial(
			ImmunizationMedicationInformationManufacturedMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticImagingReport(DiagnosticImagingReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticImagingReport_Participant(DiagnosticImagingReport_Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Associated Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Associated Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant_AssociatedEntity(Participant_AssociatedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associated Entity Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associated Entity Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociatedEntity_Person(AssociatedEntity_Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report In Fulfillment Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report In Fulfillment Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticImagingReport_InFulfillmentOf(DiagnosticImagingReport_InFulfillmentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report Documentation Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticImagingReport_DocumentationOf(DiagnosticImagingReport_DocumentationOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Of Service Event4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Of Service Event4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationOf_ServiceEvent4(DocumentationOf_ServiceEvent4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report Related Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report Related Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticImagingReport_RelatedDocument(DiagnosticImagingReport_RelatedDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report Component Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report Component Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticImagingReport_ComponentOf(DiagnosticImagingReport_ComponentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentOf_EncompassingEncounter7(ComponentOf_EncompassingEncounter7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter7 Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter7 Responsible Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter7_ResponsibleParty(EncompassingEncounter7_ResponsibleParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Party Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Party Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibleParty_AssignedEntity(ResponsibleParty_AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physician Reading Study Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physician Reading Study Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicianReadingStudyPerformer(PhysicianReadingStudyPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physician Reading Study Performer Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physician Reading Study Performer Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicianReadingStudyPerformer_AssignedEntity(PhysicianReadingStudyPerformer_AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physicianof Record Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physicianof Record Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicianofRecordParticipant(PhysicianofRecordParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physicianof Record Participant Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physicianof Record Participant Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicianofRecordParticipant_AssignedEntity(PhysicianofRecordParticipant_AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Entity Assigned Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Entity Assigned Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedEntity_AssignedPerson(AssignedEntity_AssignedPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextObservation(TextObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Measurement Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Measurement Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityMeasurementObservation(QuantityMeasurementObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Observations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Observations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeObservations(CodeObservations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureContext(ProcedureContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performer1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performer1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformer1(Performer1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent2(Component2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non XML Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non XML Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonXMLBody(NonXMLBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthor(Author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTarget(RecordTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Enterer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataEnterer(DataEnterer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodian(Custodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Recipient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationRecipient(InformationRecipient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Authenticator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalAuthenticator(LegalAuthenticator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authenticator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticator(Authenticator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Fulfillment Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Fulfillment Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInFulfillmentOf(InFulfillmentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedAuthor(AssignedAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter(EncompassingEncounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedCustodian(AssignedCustodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodianOrganization(CustodianOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authoring Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authoring Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthoringDevice(AuthoringDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intended Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intended Recipient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntendedRecipient(IntendedRecipient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientRole(PatientRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Birthplace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Birthplace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBirthplace(Birthplace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guardian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardian(Guardian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manufactured Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manufactured Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturedProduct(ManufacturedProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecondition(Precondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimen(Specimen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performer2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performer2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformer2(Performer2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterial(Material object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubject(Subject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationOf(DocumentationOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEvent(ServiceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Care Facility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Care Facility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthCareFacility(HealthCareFacility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associated Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associated Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociatedEntity(AssociatedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedDocument(RelatedDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibleParty(ResponsibleParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterParticipant(EncounterParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedEntity(RelatedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedEntity(AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informant12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informant12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformant12(Informant12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant1(Participant1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent1(Component1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Playing Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Playing Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayingEntity(PlayingEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDocument(ExternalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // ConsolSwitch
