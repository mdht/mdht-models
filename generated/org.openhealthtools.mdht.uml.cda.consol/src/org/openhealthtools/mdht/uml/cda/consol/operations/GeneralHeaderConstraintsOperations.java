/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEnterer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSupportParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Support Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Software Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has Assigned Person Or Assigned Authoring Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Recieved Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Preference Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Guardian Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Marital Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Religious Affiliation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Has Assigned Entity Or Related Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Associated Entity Has Associated Person Or Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsParticipantSupportTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraintsOperations extends ClinicalDocumentOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected GeneralHeaderConstraintsOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmAddress(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsUSRealmAddress(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "datatypes::AD.allInstances()->reject("
			+ "    addr : datatypes::AD | "
			+ "    addr.isNullFlavorDefined() or ( "
			+ "		not addr.use->isEmpty() and"
			+ "		addr.use->forAll("
			+ "			use : vocab::PostalAddressUse |"
			+ "			use=vocab::PostalAddressUse::BAD or"
			+ "			use=vocab::PostalAddressUse::DIR or"
			+ "			use=vocab::PostalAddressUse::H or"
			+ "			use=vocab::PostalAddressUse::HP or"
			+ "			use=vocab::PostalAddressUse::HV or"
			+ "			use=vocab::PostalAddressUse::PHYS or"
			+ "			use=vocab::PostalAddressUse::PST or"
			+ "			use=vocab::PostalAddressUse::PUB or"
			+ "			use=vocab::PostalAddressUse::TMP or"
			+ "			use=vocab::PostalAddressUse::WP"
			+ "		) and"
			+ "		addr.streetAddressLine->size() >= 1 and"
			+ "		addr.streetAddressLine->size() <= 4 and"
			+ "		addr.city->size() = 1 and"
			+ "		addr.country->size() <= 1 and"
			+ "		("
			+ "			("
			+ "				addr.country->size() = 0 or"
			+ "				("
			+ "					addr.country->size() = 1 and addr.country->asSequence()->first().getText()='US'"
			+ "				)"
			+ "			) implies addr.state->size() = 1 and addr.postalCode->size() = 1" + "		)" + "	)" + ")";

	// protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP =
	// "datatypes::AD.allInstances()->reject("
	// + "    addr : datatypes::AD | " + "    addr.isNullFlavorDefined() "
	// // + "    not addr.use->isEmpty() "
	// + ")";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmAddress(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsUSRealmAddress(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* datatypes::AD.allInstances()->reject(
	*     addr : datatypes::AD | 
	*     addr.isNullFlavorDefined() or ( 
	* 		not addr.use->isEmpty() and
	* 		addr.use->forAll(
	* 			use : vocab::PostalAddressUse |
	* 			use=vocab::PostalAddressUse::BAD or
	* 			use=vocab::PostalAddressUse::DIR or
	* 			use=vocab::PostalAddressUse::H or
	* 			use=vocab::PostalAddressUse::HP or
	* 			use=vocab::PostalAddressUse::HV or
	* 			use=vocab::PostalAddressUse::PHYS or
	* 			use=vocab::PostalAddressUse::PST or
	* 			use=vocab::PostalAddressUse::PUB or
	* 			use=vocab::PostalAddressUse::TMP or
	* 			use=vocab::PostalAddressUse::WP
	* 		) and
	* 		addr.streetAddressLine->size() >= 1 and
	* 		addr.streetAddressLine->size() <= 4 and
	* 		addr.city->size() = 1 and
	* 		addr.country->size() <= 1 and
	* 		(
	* 			(
	* 				addr.country->size() = 0 or
	* 				(
	* 					addr.country->size() = 1 and addr.country->asSequence()->first().getText()='US'
	* 				)
	* 			) implies addr.state->size() = 1 and addr.postalCode->size() = 1
	* 		)
	* 	)
	* )
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmAddress(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsUSRealmAddress"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmPatientName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Patient Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsUSRealmPatientName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "datatypes::PN.allInstances()->reject("
			+ "    name : datatypes::PN |"
			+ "    name.use->forAll("
			+ "        use : vocab::EntityNameUse |"
			+ "        use=vocab::EntityNameUse::A or"
			+ "        use=vocab::EntityNameUse::ABC or"
			+ "        use=vocab::EntityNameUse::ASGN or"
			+ "        use=vocab::EntityNameUse::C or"
			+ "        use=vocab::EntityNameUse::I or"
			+ "        use=vocab::EntityNameUse::IDE or"
			+ "        use=vocab::EntityNameUse::L or"
			+ "        use=vocab::EntityNameUse::P or"
			+ "        use=vocab::EntityNameUse::PHON or"
			+ "        use=vocab::EntityNameUse::R or"
			+ "        use=vocab::EntityNameUse::SNDX or"
			+ "        use=vocab::EntityNameUse::SRCH or"
			+ "        use=vocab::EntityNameUse::SYL"
			+ "    ) and"
			+ "    name.prefix->forAll("
			+ "        prefix : datatypes::ENXP |"
			+ "        prefix.qualifier->forAll("
			+ "            qualifier : vocab::EntityNamePartQualifier |"
			+ "            qualifier=vocab::EntityNamePartQualifier::AC or"
			+ "            qualifier=vocab::EntityNamePartQualifier::AD or"
			+ "            qualifier=vocab::EntityNamePartQualifier::BR or"
			+ "            qualifier=vocab::EntityNamePartQualifier::CL or"
			+ "            qualifier=vocab::EntityNamePartQualifier::IN or"
			+ "            qualifier=vocab::EntityNamePartQualifier::NB or"
			+ "            qualifier=vocab::EntityNamePartQualifier::PR or"
			+ "            qualifier=vocab::EntityNamePartQualifier::SP or"
			+ "            qualifier=vocab::EntityNamePartQualifier::TITLE or"
			+ "            qualifier=vocab::EntityNamePartQualifier::VV"
			+ "        )"
			+ "    ) and"
			+ "    name.given->size() >= 1 and"
			+ "    name.given->forAll("
			+ "        given : datatypes::ENXP |"
			+ "        given.qualifier->forAll("
			+ "            qualifier : vocab::EntityNamePartQualifier |"
			+ "	    qualifier=vocab::EntityNamePartQualifier::AC or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::AD or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::BR or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::CL or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::IN or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::NB or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::PR or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::SP or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::TITLE or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::VV"
			+ "        )"
			+ "    ) and"
			+ "    name.family->size() = 1 and"
			+ "    name.family->forAll("
			+ "        family : datatypes::ENXP |"
			+ "        family.qualifier->forAll("
			+ "            qualifier : vocab::EntityNamePartQualifier |"
			+ "	    qualifier=vocab::EntityNamePartQualifier::AC or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::AD or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::BR or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::CL or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::IN or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::NB or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::PR or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::SP or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::TITLE or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::VV"
			+ "        )"
			+ "    ) and"
			+ "    name.suffix->size() <= 1 and"
			+ "    name.suffix->forAll("
			+ "        suffix : datatypes::ENXP |"
			+ "        suffix.qualifier->forAll("
			+ "            qualifier : vocab::EntityNamePartQualifier |"
			+ "	    qualifier=vocab::EntityNamePartQualifier::AC or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::AD or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::BR or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::CL or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::IN or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::NB or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::PR or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::SP or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::TITLE or"
			+ "	    qualifier=vocab::EntityNamePartQualifier::VV" + "        )" + "    )" + ")";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmPatientName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Patient Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsUSRealmPatientName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* datatypes::PN.allInstances()->reject(
	*     name : datatypes::PN |
	*     name.use->forAll(
	*         use : vocab::EntityNameUse |
	*         use=vocab::EntityNameUse::A or
	*         use=vocab::EntityNameUse::ABC or
	*         use=vocab::EntityNameUse::ASGN or
	*         use=vocab::EntityNameUse::C or
	*         use=vocab::EntityNameUse::I or
	*         use=vocab::EntityNameUse::IDE or
	*         use=vocab::EntityNameUse::L or
	*         use=vocab::EntityNameUse::P or
	*         use=vocab::EntityNameUse::PHON or
	*         use=vocab::EntityNameUse::R or
	*         use=vocab::EntityNameUse::SNDX or
	*         use=vocab::EntityNameUse::SRCH or
	*         use=vocab::EntityNameUse::SYL
	*     ) and
	*     name.prefix->forAll(
	*         prefix : datatypes::ENXP |
	*         prefix.qualifier->forAll(
	*             qualifier : vocab::EntityNamePartQualifier |
	*             qualifier=vocab::EntityNamePartQualifier::AC or
	*             qualifier=vocab::EntityNamePartQualifier::AD or
	*             qualifier=vocab::EntityNamePartQualifier::BR or
	*             qualifier=vocab::EntityNamePartQualifier::CL or
	*             qualifier=vocab::EntityNamePartQualifier::IN or
	*             qualifier=vocab::EntityNamePartQualifier::NB or
	*             qualifier=vocab::EntityNamePartQualifier::PR or
	*             qualifier=vocab::EntityNamePartQualifier::SP or
	*             qualifier=vocab::EntityNamePartQualifier::TITLE or
	*             qualifier=vocab::EntityNamePartQualifier::VV
	*         )
	*     ) and
	*     name.given->size() >= 1 and
	*     name.given->forAll(
	*         given : datatypes::ENXP |
	*         given.qualifier->forAll(
	*             qualifier : vocab::EntityNamePartQualifier |
	* 	    qualifier=vocab::EntityNamePartQualifier::AC or
	* 	    qualifier=vocab::EntityNamePartQualifier::AD or
	* 	    qualifier=vocab::EntityNamePartQualifier::BR or
	* 	    qualifier=vocab::EntityNamePartQualifier::CL or
	* 	    qualifier=vocab::EntityNamePartQualifier::IN or
	* 	    qualifier=vocab::EntityNamePartQualifier::NB or
	* 	    qualifier=vocab::EntityNamePartQualifier::PR or
	* 	    qualifier=vocab::EntityNamePartQualifier::SP or
	* 	    qualifier=vocab::EntityNamePartQualifier::TITLE or
	* 	    qualifier=vocab::EntityNamePartQualifier::VV
	*         )
	*     ) and
	*     name.family->size() = 1 and
	*     name.family->forAll(
	*         family : datatypes::ENXP |
	*         family.qualifier->forAll(
	*             qualifier : vocab::EntityNamePartQualifier |
	* 	    qualifier=vocab::EntityNamePartQualifier::AC or
	* 	    qualifier=vocab::EntityNamePartQualifier::AD or
	* 	    qualifier=vocab::EntityNamePartQualifier::BR or
	* 	    qualifier=vocab::EntityNamePartQualifier::CL or
	* 	    qualifier=vocab::EntityNamePartQualifier::IN or
	* 	    qualifier=vocab::EntityNamePartQualifier::NB or
	* 	    qualifier=vocab::EntityNamePartQualifier::PR or
	* 	    qualifier=vocab::EntityNamePartQualifier::SP or
	* 	    qualifier=vocab::EntityNamePartQualifier::TITLE or
	* 	    qualifier=vocab::EntityNamePartQualifier::VV
	*         )
	*     ) and
	*     name.suffix->size() <= 1 and
	*     name.suffix->forAll(
	*         suffix : datatypes::ENXP |
	*         suffix.qualifier->forAll(
	*             qualifier : vocab::EntityNamePartQualifier |
	* 	    qualifier=vocab::EntityNamePartQualifier::AC or
	* 	    qualifier=vocab::EntityNamePartQualifier::AD or
	* 	    qualifier=vocab::EntityNamePartQualifier::BR or
	* 	    qualifier=vocab::EntityNamePartQualifier::CL or
	* 	    qualifier=vocab::EntityNamePartQualifier::IN or
	* 	    qualifier=vocab::EntityNamePartQualifier::NB or
	* 	    qualifier=vocab::EntityNamePartQualifier::PR or
	* 	    qualifier=vocab::EntityNamePartQualifier::SP or
	* 	    qualifier=vocab::EntityNamePartQualifier::TITLE or
	* 	    qualifier=vocab::EntityNamePartQualifier::VV
	*         )
	*     )
	* )
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmPatientName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsUSRealmPatientName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1')";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1')
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTemplateId"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = element.oclAsType(datatypes::CS) in " + "value.code = 'US'))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
	* let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
	* value.code = 'US'))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_REALM_CODE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRealmCode"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTypeId"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsId(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsId"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CODE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TITLE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTitle"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsEffectiveTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsEffectiveTime"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsConfidentialityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Confidentiality Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsConfidentialityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.25' and not value.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsConfidentialityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Confidentiality Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsConfidentialityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.5.25' and not value.code.oclIsUndefined())
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateGeneralHeaderConstraintsConfidentialityCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsConfidentialityCode"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in "
			+ "not value.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
	* let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
	* not value.code.oclIsUndefined())
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsLanguageCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLanguageCode"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsSetId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsSetId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsSetId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsSetId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsSetId(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsSetId"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsVersionNumber(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsVersionNumber"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsAuthor(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthor"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEnterer(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEnterer(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEnterer(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEnterer(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsDataEnterer(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsDataEnterer"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsCustodian(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCustodian"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsInformationRecipient(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformationRecipient"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticator(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticator"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->exists(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->exists(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsAuthenticator(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticator"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsRecordTarget(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTarget"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsComponentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsComponentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsComponentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsComponentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsComponentOf(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsComponentOf"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->one(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->one(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsInformant(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformant"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsSupportParticipant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Support Participant</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsSupportParticipant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsSupportParticipant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Support Participant</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsSupportParticipant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsSupportParticipant(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsSupportParticipant"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInFulfillmentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInFulfillmentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateGeneralHeaderConstraintsInFulfillmentOf(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInFulfillmentOf"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Manufacturer Model Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	// protected static final String
	// VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP =
	// "if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) and self.author.assignedAuthor.assignedAuthoringDevice->exists(not oclIsUndefined()) then self.author.assignedAuthor.assignedAuthoringDevice->forAll((manufacturerModelName.oclIsUndefined() or manufacturerModelName.isNullFlavorUndefined()) implies (not manufacturerModelName.oclIsUndefined())) else true endif";
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedAuthoringDevice->excluding(null)->reject((manufacturerModelName.oclIsUndefined() or manufacturerModelName.isNullFlavorUndefined()) implies (not manufacturerModelName.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Manufacturer Model Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null).assignedAuthoringDevice->excluding(null)->reject((manufacturerModelName.oclIsUndefined() or manufacturerModelName.isNullFlavorUndefined()) implies (not manufacturerModelName.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Software Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedAuthoringDevice->excluding(null)->reject((softwareName.oclIsUndefined() or softwareName.isNullFlavorUndefined()) implies (not softwareName.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Software Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null).assignedAuthoringDevice->excluding(null)->reject((softwareName.oclIsUndefined() or softwareName.isNullFlavorUndefined()) implies (not softwareName.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Person Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Person Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthorAssignedAuthorPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has Assigned Person Or Assigned Authoring Device</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson.oclIsUndefined() xor assignedAuthoringDevice.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has Assigned Person Or Assigned Authoring Device</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson.oclIsUndefined() xor assignedAuthoringDevice.oclIsUndefined())
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_ASSIGNED_AUTHORING_DEVICE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has National Provider Identifier</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has National Provider Identifier</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthorAssignedAuthorAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.101'))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthorAssignedAuthorCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthorAssignedAuthorCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101'))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthorAssignedAuthorCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthorAssignedAuthorCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthorAssignedAuthorCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthorAssignedAuthorId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Telecom</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Telecom</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthorAssignedAuthorTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthorAssignedAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthor(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthorAssignedAuthor"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Person Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Person Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsDataEntererAssignedEntityPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Has National Provider Identifier</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Has National Provider Identifier</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsDataEntererAssignedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.101'))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDataEntererAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsDataEntererAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101'))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsDataEntererAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDataEntererAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDataEntererAssignedEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsDataEntererAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Telecom</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Telecom</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsDataEntererAssignedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Assigned Person</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Assigned Person</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsDataEntererAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntity(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsDataEntererAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Has National Provider Identifier</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Has National Provider Identifier</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Telecom</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((telecom.oclIsUndefined() or telecom.isNullFlavorUndefined()) implies (not telecom.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Telecom</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((telecom.oclIsUndefined() or telecom.isNullFlavorUndefined()) implies (not telecom.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Represented Custodian Organization</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null)->reject(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Represented Custodian Organization</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null).assignedCustodian->excluding(null)->reject(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsCustodianAssignedCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodian(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCustodianAssignedCustodian"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Organization Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Organization Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Person Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null).informationRecipient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Person Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informationRecipient->excluding(null).intendedRecipient->excluding(null).informationRecipient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Information Recipient</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Information Recipient</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Recieved Organization</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(receivedOrganization->one(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(cda::Organization)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Recieved Organization</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(receivedOrganization->one(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(cda::Organization)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformationRecipientIntendedRecipient"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Person Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Person Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Has National Provider Identifier</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Has National Provider Identifier</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.101'))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101'))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Telecom</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Telecom</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Assigned Person</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Assigned Person</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticatorTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Signature Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in " + "value.code = 'S'))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Signature Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and 
	* let value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in 
	* value.code = 'S'))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticatorSignatureCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Person Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Person Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Has National Provider Identifier</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Has National Provider Identifier</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticatorAssignedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.101'))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticatorAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101'))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticatorAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Telecom</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Telecom</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticatorTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Signature Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in " + "value.code = 'S'))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Signature Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and 
	* let value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in 
	* value.code = 'S'))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorSignatureCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticatorSignatureCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticatorAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Has National Provider Identifier</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Has National Provider Identifier</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject(guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(cda::Person)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(not birthTime.value.oclIsUndefined() and birthTime.value.size() >= 4)
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_YEAR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(not birthTime.value.oclIsUndefined()  and birthTime.value.size() >= 6)
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_DAY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthplace->excluding(null).place->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthplace->excluding(null)->reject(place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(cda::Place)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null).guardianPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((preferenceInd.oclIsUndefined() or preferenceInd.isNullFlavorUndefined()) implies (not preferenceInd.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((proficiencyLevelCode.oclIsUndefined() or proficiencyLevelCode.isNullFlavorUndefined()) implies (proficiencyLevelCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = proficiencyLevelCode.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.5.61' and (value.code = 'E' or value.code = 'F' or value.code = 'G' or value.code = 'P')))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((proficiencyLevelCode.oclIsUndefined() or proficiencyLevelCode.isNullFlavorUndefined()) implies (not proficiencyLevelCode.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((modeCode.oclIsUndefined() or modeCode.isNullFlavorUndefined()) implies (modeCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = modeCode.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR')))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((modeCode.oclIsUndefined() or modeCode.isNullFlavorUndefined()) implies (not modeCode.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (ethnicGroupCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = ethnicGroupCode.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (not ethnicGroupCode.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((maritalStatusCode.oclIsUndefined() or maritalStatusCode.isNullFlavorUndefined()) implies (maritalStatusCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = maritalStatusCode.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'T' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'S' or value.code = 'P' or value.code = 'W')))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (raceCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = raceCode.oclAsType(datatypes::CE) in 
	* not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((religiousAffiliationCode.oclIsUndefined() or religiousAffiliationCode.isNullFlavorUndefined()) implies (religiousAffiliationCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = religiousAffiliationCode.oclAsType(datatypes::CE) in 
	* not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(guardian->exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(birthplace->one(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(cda::Birthplace)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(languageCommunication->one(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Telecom</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Telecom</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((languageCode.oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not languageCode.oclIsUndefined() and languageCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = languageCode.oclAsType(datatypes::CS) in "
			+ "not value.code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Preference Ind</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((preferenceInd.oclIsUndefined() or preferenceInd.isNullFlavorUndefined()) implies (not preferenceInd.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Preference Ind</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((proficiencyLevelCode.oclIsUndefined() or proficiencyLevelCode.isNullFlavorUndefined()) implies (not proficiencyLevelCode.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((proficiencyLevelCode.oclIsUndefined() or proficiencyLevelCode.isNullFlavorUndefined()) implies (proficiencyLevelCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = proficiencyLevelCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.61' and (value.code = 'E' or value.code = 'F' or value.code = 'G' or value.code = 'P')))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((modeCode.oclIsUndefined() or modeCode.isNullFlavorUndefined()) implies (not modeCode.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((modeCode.oclIsUndefined() or modeCode.isNullFlavorUndefined()) implies (modeCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = modeCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR')))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthplace->excluding(null).place->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthplace->excluding(null)->reject(place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(cda::Place)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Person Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null).guardianPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Person Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Telecom</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Telecom</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Guardian Person</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject(guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(cda::Person)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Guardian Person</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time Precise To Year</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(not birthTime.value.oclIsUndefined() and birthTime.value.size() >= 4)";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time Precise To Year</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time Precise To Day</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(not birthTime.value.oclIsUndefined()  and birthTime.value.size() >= 6)";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time Precise To Day</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Administrative Gender Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Administrative Gender Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (not ethnicGroupCode.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (ethnicGroupCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = ethnicGroupCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Marital Status Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((maritalStatusCode.oclIsUndefined() or maritalStatusCode.isNullFlavorUndefined()) implies (maritalStatusCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = maritalStatusCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'T' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'S' or value.code = 'P' or value.code = 'W')))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Marital Status Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (raceCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = raceCode.oclAsType(datatypes::CE) in "
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Religious Affiliation Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((religiousAffiliationCode.oclIsUndefined() or religiousAffiliationCode.isNullFlavorUndefined()) implies (religiousAffiliationCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = religiousAffiliationCode.oclAsType(datatypes::CE) in "
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Religious Affiliation Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(guardian->exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(birthplace->one(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(cda::Birthplace)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(languageCommunication->one(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((languageCode.oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not languageCode.oclIsUndefined() and languageCode.oclIsKindOf(datatypes::CS) and 
	* let value : datatypes::CS = languageCode.oclAsType(datatypes::CS) in 
	* not value.code.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRoleAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRoleId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Telecom</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Telecom</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRoleTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRolePatient"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRole(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTargetPatientRole"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsComponentOfEncompassingEncounterId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsComponentOfEncompassingEncounter"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).relatedEntity->excluding(null).relatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).relatedEntity->excluding(null).relatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformantRelatedEntityPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformantAssignedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.101'))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsInformantAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformantAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformantAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsInformantAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsInformantAssignedEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformantAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformantAssignedEntityPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null)->reject(assignedEntity.oclIsUndefined() xor relatedEntity.oclIsUndefined())
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.participant->excluding(null)->reject(associatedEntity.associatedPerson.oclIsUndefined() xor associatedEntity.scopingOrganization.oclIsUndefined())
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantRelatedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantRelatedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).relatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantRelatedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantRelatedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).relatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantRelatedEntityAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformantRelatedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantRelatedEntityPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantRelatedEntityPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).relatedEntity->excluding(null)->reject(relatedPerson->one(relatedPerson : cda::Person | not relatedPerson.oclIsUndefined() and relatedPerson.oclIsKindOf(cda::Person)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantRelatedEntityPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantRelatedEntityPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).relatedEntity->excluding(null)->reject(relatedPerson->one(relatedPerson : cda::Person | not relatedPerson.oclIsUndefined() and relatedPerson.oclIsKindOf(cda::Person)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantRelatedEntityPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformantRelatedEntityPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformantAssignedEntityPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Has National Provider Identifier</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Has National Provider Identifier</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Addr</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Addr</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101'))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantAssignedEntityPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Has Assigned Entity Or Related Entity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null)->reject(assignedEntity.oclIsUndefined() xor relatedEntity.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Has Assigned Entity Or Related Entity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Associated Entity Has Associated Person Or Scoping Organization</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity.associatedPerson.oclIsUndefined() xor associatedEntity.scopingOrganization.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Associated Entity Has Associated Person Or Scoping Organization</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsParticipantSupportTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsParticipantSupportTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsParticipantSupportTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsParticipantSupportTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.participant->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsParticipantSupportTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsParticipantSupportTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOfOrderId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInFulfillmentOfOrderId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->excluding(null).order->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOfOrderId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInFulfillmentOfOrderId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.inFulfillmentOf->excluding(null).order->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInFulfillmentOfOrderId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInFulfillmentOfOrderId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOfOrder(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInFulfillmentOfOrder(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->excluding(null)->reject(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOfOrder(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsInFulfillmentOfOrder(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.inFulfillmentOf->excluding(null)->reject(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))
	* @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInFulfillmentOfOrder(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInFulfillmentOfOrder"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // GeneralHeaderConstraintsOperations
