/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
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
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Payer Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Payer Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Person Name And Or Org Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Coverage Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Coverage Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageLowTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Low Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageHighTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage High Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityEntryRelationshipTargetActActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Target Act Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Description Coverage Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyActivityOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.61')";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.61')
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePolicyActivityTemplateId(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PolicyActivityTemplateId"), new Object[] { policyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityClassCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityClassCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityClassCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityClassCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePolicyActivityClassCode(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("PolicyActivityClassCode"), new Object[] { policyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePolicyActivityCode(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_CODE,
					ConsolPlugin.INSTANCE.getString("PolicyActivityCode"), new Object[] { policyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsTypeOf(datatypes::CE))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POLICY_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsTypeOf(datatypes::CE))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePolicyActivityCodeP(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_CODE_P,
					ConsolPlugin.INSTANCE.getString("PolicyActivityCodeP"), new Object[] { policyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePolicyActivityId(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_ID,
					ConsolPlugin.INSTANCE.getString("PolicyActivityId"), new Object[] { policyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityMoodCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityMoodCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityMoodCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityMoodCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePolicyActivityMoodCode(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("PolicyActivityMoodCode"), new Object[] { policyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityStatusCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityStatusCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityStatusCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityStatusCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePolicyActivityStatusCode(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("PolicyActivityStatusCode"), new Object[] { policyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayer(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayer(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR'))->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayer(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayer(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR'))->size() = 1
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePolicyActivityPayer(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER,
					ConsolPlugin.INSTANCE.getString("PolicyActivityPayer"), new Object[] { policyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantor(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantor(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'})->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantor(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantor(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'})->size() = 1
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePolicyActivityGuarantor(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR,
					ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantor"), new Object[] { policyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverage(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverage(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::COV)->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverage(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverage(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::COV)->size() = 1
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePolicyActivityCoverage(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE,
					ConsolPlugin.INSTANCE.getString("PolicyActivityCoverage"), new Object[] { policyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolder(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolder(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::HLD)->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolder(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolder(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POLICY_ACTIVITY_HOLDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::HLD)->size() = 1
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePolicyActivityHolder(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_HOLDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_HOLDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_HOLDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER,
					ConsolPlugin.INSTANCE.getString("PolicyActivityHolder"), new Object[] { policyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityEntryRelationship(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validatePolicyActivityEntryRelationship(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->notEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityEntryRelationship(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityEntryRelationship(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->notEmpty()
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePolicyActivityEntryRelationship(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
			try {
				VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_ENTRY_RELATIONSHIP,
					ConsolPlugin.INSTANCE.getString("PolicyActivityEntryRelationship"), new Object[] { policyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreet(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address City</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address City</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCity(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityUSRealmAddressCity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCountry(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityUSRealmAddressCountry"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Postal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressPostalCode(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityUSRealmAddressPostalCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address State</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressState(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityUSRealmAddressState"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Street Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Street Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreetAddressLine(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityUSRealmAddressStreetAddressLine"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Use P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject(not use->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Use P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject(not use->isEmpty())
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.PolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP",
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
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity US Realm Address Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse)))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUse(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.PolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP");
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
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityUSRealmAddressUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Payer Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Payer Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null).representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityPayerOrganizationName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityId(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.110' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.5.110' and not value.code.oclIsUndefined()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityCode(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityCodeP(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityAddr(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityTelecom(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityTelecom(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityTelecom(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityTelecom(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityTelecom(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Payer Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Payer Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR')).assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntityPayerOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR'))->reject(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.87'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR'))->reject(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.87'))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerTemplateId(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerTemplateId"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR'))->reject(isDefined('typeCode') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR'))->reject(isDefined('typeCode') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerTypeCode(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerTypeCode"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayerPayerAssignedEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR'))->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayerPayerAssignedEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayerPayerAssignedEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes('GUAR'))->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityPayerPayerAssignedEntity(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("PolicyActivityPayerPayerAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreet(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address City</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address City</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCity(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCountry(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCountry"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Postal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressPostalCode(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressPostalCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address State</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressState(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressState"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Street Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Street Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Use P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject(not use->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Use P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject(not use->isEmpty())
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP",
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
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity US Realm Address Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse)))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP");
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
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Person Name And Or Org Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_PERSON_NAME_AND_OR_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null)->reject((performer.assignedEntity.assignedPerson->exists(not oclIsUndefined()) and performer.assignedEntity.assignedPerson.name->size() >0) or (performer.assignedEntity.representedOrganization->exists(not oclIsUndefined()) and performer.assignedEntity.representedOrganization.name->size() >0 ))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Person Name And Or Org Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_PERSON_NAME_AND_OR_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null)->reject((performer.assignedEntity.assignedPerson->exists(not oclIsUndefined()) and performer.assignedEntity.assignedPerson.name->size() >0) or (performer.assignedEntity.representedOrganization->exists(not oclIsUndefined()) and performer.assignedEntity.representedOrganization.name->size() >0 ))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_PERSON_NAME_AND_OR_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_PERSON_NAME_AND_OR_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_PERSON_NAME_AND_OR_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_PERSON_NAME_AND_OR_ORG_NAME,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.code = 'GUAR' and value.codeSystem = '2.16.840.1.113883.5.111'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	 * value.code = 'GUAR' and value.codeSystem = '2.16.840.1.113883.5.111'))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityCode(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'}).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'})->reject(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.88'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'})->reject(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.88'))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorTemplateId(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorTemplateId"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'})->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'})->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorTime(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_TIME,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorTime"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'})->reject(isDefined('typeCode') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'})->reject(isDefined('typeCode') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorTypeCode(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorTypeCode"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'})->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantorGuarantorAssignedEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantorGuarantorAssignedEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{'GUAR'})->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityGuarantorGuarantorAssignedEntity(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantorGuarantorAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreet(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address City</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address City</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressCity(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_CITY,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleUSRealmAddressCity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressCountry(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_COUNTRY,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleUSRealmAddressCountry"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Postal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressPostalCode(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_POSTAL_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleUSRealmAddressPostalCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address State</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressState(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STATE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleUSRealmAddressState"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Street Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Street Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreetAddressLine(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleUSRealmAddressStreetAddressLine"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Use P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject(not use->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Use P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject(not use->isEmpty())
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressUseP(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_USE_P,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleUSRealmAddressUseP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PolicyActivityCoverageCoverageRoleUSRealmAddressUseP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.PolicyActivityCoverageCoverageRoleUSRealmAddressUseP",
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
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role US Realm Address Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse)))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressUse(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.PolicyActivityCoverageCoverageRoleUSRealmAddressUseP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_US_REALM_ADDRESS_USE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleUSRealmAddressUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Coverage Playing Entity Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).playingEntity->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Coverage Playing Entity Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).playingEntity->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleId(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ID,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.111' and (value.code = 'FAMDEP' or value.code = 'FSTUD' or value.code = 'HANDIC' or value.code = 'INJ' or value.code = 'PSTUD' or value.code = 'SELF' or value.code = 'SPON' or value.code = 'STUD')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.5.111' and (value.code = 'FAMDEP' or value.code = 'FSTUD' or value.code = 'HANDIC' or value.code = 'INJ' or value.code = 'PSTUD' or value.code = 'SELF' or value.code = 'SPON' or value.code = 'STUD')))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleCode(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleCodeP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleCodeP(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE_P,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleAddr(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ADDR,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Coverage Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Coverage Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRoleCoveragePlayingEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageLowTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Low Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageLowTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_LOW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(not time.oclIsUndefined() implies not time.low.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageLowTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Low Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageLowTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_LOW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(not time.oclIsUndefined() implies not time.low.oclIsUndefined())
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageLowTime(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_LOW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_LOW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_LOW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_LOW_TIME,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageLowTime"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageHighTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage High Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageHighTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_HIGH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(not time.oclIsUndefined() implies not time.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageHighTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage High Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageHighTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_HIGH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(not time.oclIsUndefined() implies not time.high.oclIsUndefined())
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageHighTime(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_HIGH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_HIGH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_HIGH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_HIGH_TIME,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageHighTime"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.89'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.89'))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageTemplateId(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageTemplateId"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(typeCode=vocab::ParticipationType::COV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(typeCode=vocab::ParticipationType::COV)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageTypeCode(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageTypeCode"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageTime(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_TIME,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageTime"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverageCoverageRole(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRole(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverageCoverageRole(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverageCoverageRole(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityCoverageCoverageRole(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityCoverageCoverageRole"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressStreet(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderHolderRoleUSRealmAddressStreet(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderHolderRoleUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address City</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address City</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressCity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderHolderRoleUSRealmAddressCity(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_CITY,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderHolderRoleUSRealmAddressCity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressCountry(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderHolderRoleUSRealmAddressCountry(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_COUNTRY,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderHolderRoleUSRealmAddressCountry"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Postal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressPostalCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderHolderRoleUSRealmAddressPostalCode(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_POSTAL_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderHolderRoleUSRealmAddressPostalCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address State</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressState(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderHolderRoleUSRealmAddressState(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STATE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderHolderRoleUSRealmAddressState"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Street Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Street Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressStreetAddressLine(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderHolderRoleUSRealmAddressStreetAddressLine(
			PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderHolderRoleUSRealmAddressStreetAddressLine"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Use P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject(not use->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Use P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressUseP(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject(not use->isEmpty())
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderHolderRoleUSRealmAddressUseP(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_USE_P,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderHolderRoleUSRealmAddressUseP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PolicyActivityHolderHolderRoleUSRealmAddressUseP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.PolicyActivityHolderHolderRoleUSRealmAddressUseP",
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
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderHolderRoleUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role US Realm Address Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleUSRealmAddressUse(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse)))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderHolderRoleUSRealmAddressUse(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.PolicyActivityHolderHolderRoleUSRealmAddressUseP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_US_REALM_ADDRESS_USE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderHolderRoleUSRealmAddressUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderHolderRoleId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderHolderRoleId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderHolderRoleId(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ID,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderHolderRoleId"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderHolderRoleAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderHolderRoleAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRoleAddr(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderHolderRoleAddr(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ADDR,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderHolderRoleAddr"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.90'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderTemplateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.90'))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderTemplateId(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderTemplateId"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(typeCode=vocab::ParticipationType::HLD)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(typeCode=vocab::ParticipationType::HLD)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderTypeCode(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderTypeCode"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderTime(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderTime(PolicyActivity policyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_TIME,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderTime"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityHolderHolderRole(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRole(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityHolderHolderRole(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityHolderHolderRole(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityHolderHolderRole(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_HOLDER_HOLDER_ROLE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityHolderHolderRole"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityEntryRelationshipTargetActActivity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Target Act Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validatePolicyActivityEntryRelationshipTargetActActivity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET_ACT_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->reject(act->one(a : cda::Act | a.oclIsTypeOf(consol::AuthorizationActivity) or (a.classCode=vocab::x_ActClassDocumentEntryAct::ACT and a.moodCode=vocab::x_DocumentActMood::DEF)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityEntryRelationshipTargetActActivity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Target Act Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityEntryRelationshipTargetActActivity(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET_ACT_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->reject(act->one(a : cda::Act | a.oclIsTypeOf(consol::AuthorizationActivity) or (a.classCode=vocab::x_ActClassDocumentEntryAct::ACT and a.moodCode=vocab::x_DocumentActMood::DEF)))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityEntryRelationshipTargetActActivity(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET_ACT_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET_ACT_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET_ACT_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET_ACT_ACTIVITY,
						ConsolPlugin.INSTANCE.getString("PolicyActivityEntryRelationshipTargetActActivity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Description Coverage Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_DESCRIPTION_COVERAGE_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->reject(act->select(a : cda::Act | a.classCode=vocab::x_ActClassDocumentEntryAct::ACT and (a.moodCode=vocab::x_DocumentActMood::DEF))->forAll(id->size() > 0 and text->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Description Coverage Plan</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_DESCRIPTION_COVERAGE_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->reject(act->select(a : cda::Act | a.classCode=vocab::x_ActClassDocumentEntryAct::ACT and (a.moodCode=vocab::x_DocumentActMood::DEF))->forAll(id->size() > 0 and text->size() = 1))
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_DESCRIPTION_COVERAGE_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_DESCRIPTION_COVERAGE_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_DESCRIPTION_COVERAGE_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_ENTRY_RELATIONSHIP_DESCRIPTION_COVERAGE_PLAN,
						ConsolPlugin.INSTANCE.getString("PolicyActivityEntryRelationshipDescriptionCoveragePlan"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityEntryRelationshipTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityEntryRelationshipTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityEntryRelationshipTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityEntryRelationshipTypeCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivityEntryRelationshipTypeCode(PolicyActivity policyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivityEntryRelationshipTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // PolicyActivityOperations
