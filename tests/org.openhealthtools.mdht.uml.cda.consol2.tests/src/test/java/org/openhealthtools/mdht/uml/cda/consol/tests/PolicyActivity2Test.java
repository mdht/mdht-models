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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Payer Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Payer Assigned Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Payer Assigned Entity General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Payer Assigned Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Payer Assigned Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Payer Assigned Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Payer Assigned Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Payer Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Policy Activity Payer Payer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Policy Activity Payer Payer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PolicyActivityPayerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Payer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Payer Payer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PolicyActivityGuarantorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Guarantor Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Guarantor Guarantor Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Coverage Role Coverage Playing Entity Date Of Birth In SDT Cbirth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2CoverageCoverageRolePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Coverage Role Policy Activity Coverage Coverage Role Coverage Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Coverage Role Coverage Playing Entity SDTC Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Policy Activity Coverage Coverage Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Policy Activity Coverage Coverage Role Coverage Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PolicyActivityCoverageTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Coverage Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PolicyActivityCoverageCoverageRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Coverage Coverage Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityPayer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityGuarantor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityCoverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PolicyActivity2Test extends CDAValidationTest {

	public static final String PAYER_PERFORMER_ROOT = "2.16.840.1.113883.10.20.22.4.87";

	public static final String GUARANTOR_PERFORMER_ROOT = "2.16.840.1.113883.10.20.22.4.88";

	public static final String COVERAGE_PARTICIPANT_ROOT = "2.16.840.1.113883.10.20.22.4.89";

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityStatusCodeP() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivityStatusCodePTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivityStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivityStatusCodeP(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						target.getPerformers().add(payer);
						AssignedEntity payerEntity = createPayerAssignedEntity();
						payerEntity.getAddrs().add(ad);
						payer.setAssignedEntity(payerEntity);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						target.getPerformers().add(payer);
						AssignedEntity payerEntity = createPayerAssignedEntity();
						payerEntity.getAddrs().clear();
						payerEntity.getAddrs().add(ad);
						payer.setAssignedEntity(payerEntity);
					}
				});

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payer.setAssignedEntity(payerEntity);
				payerEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				payerEntity.getAddrs().get(0).getUses().add(PostalAddressUse.ABC);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();

				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityAddr() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityAddrTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_PAYER_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
				payerEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityAddr(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	// @Test
	// public void testValidatePolicyActivity2Payer() {
	// OperationsTestCase<PolicyActivity2> validatePolicyActivity2PayerTestCase = new OperationsTestCase<PolicyActivity2>(
	// "validatePolicyActivity2Payer",
	// operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// public void addFailTests() {
	//
	// addFailTest(new FailTest() {
	//
	// @Override
	// public void updateToFail(PolicyActivity2 target) {
	// // does not contain any payer or any guarantor performer elements
	// target.init();
	// }
	// });
	//
	// addFailTest(new FailTest() {
	//
	// @Override
	// public void updateToFail(PolicyActivity2 target) {
	// // Contains 2 payers and Contains 1 guarantor
	// target.init();
	// target.getPerformers().clear();
	// Performer2 payer = createPerformer();
	// payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
	// target.getPerformers().add(payer);
	// Performer2 payer2 = createPerformer();
	// payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
	// target.getPerformers().add(payer2);
	//
	// Performer2 guarantor = createPerformer();
	// guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
	// target.getPerformers().add(guarantor);
	// }
	// });
	//
	// addFailTest(new FailTest() {
	//
	// @Override
	// public void updateToFail(PolicyActivity2 target) {
	// // Contains 2 payers and Contains 0 guarantor
	// target.init();
	// target.getPerformers().clear();
	// Performer2 payer = createPerformer();
	// payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
	// target.getPerformers().add(payer);
	// Performer2 payer2 = createPerformer();
	// payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
	// target.getPerformers().add(payer2);
	// }
	// });
	//
	// addFailTest(new FailTest() {
	//
	// @Override
	// public void updateToFail(PolicyActivity2 target) {
	// // Contains 0 payers and Contains 2 guarantors
	// target.init();
	// target.getPerformers().clear();
	// Performer2 guarantor = createPerformer();
	// guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
	// target.getPerformers().add(guarantor);
	// Performer2 guarantor2 = createPerformer();
	// guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
	// target.getPerformers().add(guarantor2);
	// }
	// });
	//
	// addFailTest(new FailTest() {
	//
	// @Override
	// public void updateToFail(PolicyActivity2 target) {
	// // Contains 2 payers and Contains 2 guarantors
	// target.init();
	// target.getPerformers().clear();
	// Performer2 guarantor = createPerformer();
	// guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
	// target.getPerformers().add(guarantor);
	// Performer2 guarantor2 = createPerformer();
	// guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
	// target.getPerformers().add(guarantor2);
	//
	// Performer2 payer = createPerformer();
	// payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
	// target.getPerformers().add(payer);
	// Performer2 payer2 = createPerformer();
	// payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
	// target.getPerformers().add(payer2);
	// }
	// });
	//
	// }
	//
	// @Override
	// protected void updateToPass(PolicyActivity2 target) {
	// target.init();
	//
	// Performer2 payer = createPerformer();
	// AssignedEntity aePay = CDAFactory.eINSTANCE.createAssignedEntity();
	// aePay.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));
	//
	// payer.setAssignedEntity(aePay);
	// target.getPerformers().add(payer);
	//
	// II iiPay = DatatypesFactory.eINSTANCE.createII();
	// iiPay.setRoot(PAYER_PERFORMER_ROOT);
	// payer.getTemplateIds().add(0, iiPay);
	//
	// Performer2 guarantor = createPerformer();
	// AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
	// ae.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));
	//
	// guarantor.setAssignedEntity(ae);
	// target.getPerformers().add(guarantor);
	//
	// II iiGuar = DatatypesFactory.eINSTANCE.createII();
	// iiGuar.setRoot(GUARANTOR_PERFORMER_ROOT);
	// guarantor.getTemplateIds().add(0, iiGuar);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return PolicyActivity2Operations.validatePolicyActivity2Payer(
	// (PolicyActivity2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validatePolicyActivity2PayerTestCase.doValidationTest();
	// }

	/**
	*
	* @generated NOT
	*/
	// @Test
	// public void testValidatePolicyActivity2Guarantor() {
	// OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorTestCase = new OperationsTestCase<PolicyActivity2>(
	// "validatePolicyActivity2Guarantor",
	// operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// public void addFailTests() {
	//
	// addFailTest(new FailTest() {
	//
	// @Override
	// public void updateToFail(PolicyActivity2 target) {
	// // does not contain any payer or any guarantor performer elements
	// target.init();
	// }
	// });
	//
	// addFailTest(new FailTest() {
	//
	// @Override
	// public void updateToFail(PolicyActivity2 target) {
	// // Contains 1 payer and Contains 2 guarantors
	// target.init();
	// target.getPerformers().clear();
	// Performer2 payer = createPerformer();
	// payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
	// target.getPerformers().add(payer);
	//
	// Performer2 guarantor = createPerformer();
	// guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
	// target.getPerformers().add(guarantor);
	// Performer2 guarantor2 = createPerformer();
	// guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
	// target.getPerformers().add(guarantor2);
	// }
	// });
	//
	// addFailTest(new FailTest() {
	//
	// @Override
	// public void updateToFail(PolicyActivity2 target) {
	// // Contains 2 payers and Contains 0 guarantor
	// target.init();
	// target.getPerformers().clear();
	// Performer2 payer = createPerformer();
	// payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
	// target.getPerformers().add(payer);
	// Performer2 payer2 = createPerformer();
	// payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
	// target.getPerformers().add(payer2);
	// }
	// });
	//
	// addFailTest(new FailTest() {
	//
	// @Override
	// public void updateToFail(PolicyActivity2 target) {
	// // Contains 0 payers and Contains 2 guarantors
	// target.init();
	// target.getPerformers().clear();
	// Performer2 guarantor = createPerformer();
	// guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
	// target.getPerformers().add(guarantor);
	// Performer2 guarantor2 = createPerformer();
	// guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
	// target.getPerformers().add(guarantor2);
	// }
	// });
	//
	// addFailTest(new FailTest() {
	//
	// @Override
	// public void updateToFail(PolicyActivity2 target) {
	// // Contains 2 payers and Contains 2 guarantors
	// target.init();
	// target.getPerformers().clear();
	// Performer2 guarantor = createPerformer();
	// guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
	// target.getPerformers().add(guarantor);
	// Performer2 guarantor2 = createPerformer();
	// guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
	// target.getPerformers().add(guarantor2);
	//
	// Performer2 payer = createPerformer();
	// payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
	// target.getPerformers().add(payer);
	// Performer2 payer2 = createPerformer();
	// payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
	// target.getPerformers().add(payer2);
	// }
	// });
	//
	// }
	//
	// @Override
	// protected void updateToPass(PolicyActivity2 target) {
	// // Contains 1 payer and 1 guarantor
	// target.init();
	// target.getPerformers().clear();
	// Performer2 payer = createPerformer();
	// AssignedEntity aePay = CDAFactory.eINSTANCE.createAssignedEntity();
	// aePay.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));
	//
	// payer.setAssignedEntity(aePay);
	// target.getPerformers().add(payer);
	//
	// II iiPay = DatatypesFactory.eINSTANCE.createII();
	// iiPay.setRoot(PAYER_PERFORMER_ROOT);
	// payer.getTemplateIds().add(0, iiPay);
	//
	// Performer2 guarantor = createPerformer();
	// AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
	// ae.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));
	//
	// guarantor.setAssignedEntity(ae);
	// target.getPerformers().add(guarantor);
	//
	// II iiGuar = DatatypesFactory.eINSTANCE.createII();
	// iiGuar.setRoot(GUARANTOR_PERFORMER_ROOT);
	// guarantor.getTemplateIds().add(0, iiGuar);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return PolicyActivity2Operations.validatePolicyActivity2Guarantor(
	// (PolicyActivity2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validatePolicyActivity2GuarantorTestCase.doValidationTest();
	// }

	/**
	*
	* @generated NOT
	*/
	// @Test
	// public void testValidatePolicyActivity2Coverage() {
	// OperationsTestCase<PolicyActivity2> validatePolicyActivity2CoverageTestCase = new OperationsTestCase<PolicyActivity2>(
	// "validatePolicyActivity2Coverage",
	// operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(PolicyActivity2 target) {
	//
	// }
	//
	// @Override
	// protected void updateToPass(PolicyActivity2 target) {
	// target.init();
	// target.getParticipants().add(createCoverage());
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return PolicyActivity2Operations.validatePolicyActivity2Coverage(
	// (PolicyActivity2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validatePolicyActivity2CoverageTestCase.doValidationTest();
	// }

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecomTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_PAYER_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getTelecoms().clear();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PolicyActivityPayerTemplateId() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PolicyActivityPayerTemplateIdTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PolicyActivityPayerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_PAYER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Checks if the template ID exists or not, but the template ID must exist in order to differentiate between the two different types of
			// performers, payer and guarantor. So, it is not possible to not include a template ID and for the code to know to fail it for not
			// specifically having a payer or a guarantor. Due to the identification issue, the fail test has been skipped.

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = CDAFactory.eINSTANCE.createPerformer2();
				II iiPay = DatatypesFactory.eINSTANCE.createII(BAD_TEMPLATE_ID);
				payer.getTemplateIds().add(0, iiPay);
				target.getPerformers().add(payer);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = CDAFactory.eINSTANCE.createPerformer2();
				II iiPay = DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT);
				payer.getTemplateIds().add(0, iiPay);
				payer.setAssignedEntity(createPayerAssignedEntity());
				target.getPerformers().add(payer);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PolicyActivityPayerTemplateId(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PolicyActivityPayerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PolicyActivityPayerPayerAssignedEntity() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PolicyActivityPayerPayerAssignedEntityTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = CDAFactory.eINSTANCE.createPerformer2();
				II iiPay = DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT);
				payer.getTemplateIds().add(0, iiPay);
				target.getPerformers().add(payer);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = CDAFactory.eINSTANCE.createPerformer2();
				II iiPay = DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT);
				payer.getTemplateIds().add(0, iiPay);
				payer.setAssignedEntity(createPayerAssignedEntity());
				target.getPerformers().add(payer);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PolicyActivityPayerPayerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						AssignedEntity gEntity = createGuarantorAssignedEntity();
						gEntity.getAddrs().clear();
						gEntity.getAddrs().add(ad);
						guarantor.setAssignedEntity(gEntity);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						AssignedEntity gEntity = createGuarantorAssignedEntity();
						gEntity.getAddrs().clear();
						gEntity.getAddrs().add(ad);
						guarantor.setAssignedEntity(gEntity);
					}
				});

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				gEntity.getAddrs().get(0).getUses().add(PostalAddressUse.ABC);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(PolicyActivityTest.createUSRealmAddress());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecomTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PolicyActivityGuarantorTemplateId() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PolicyActivityGuarantorTemplateIdTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PolicyActivityGuarantorTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_GUARANTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Checks if the template ID exists or not, but the template ID must exist in order to differentiate between the two different types of
			// performers, payer and guarantor. So, it is not possible to not include a template ID and for the code to know to fail it for not
			// specifically having a payer or a guarantor. Due to the identification issue, the fail test has been skipped.

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				// target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
				// Although the correct GUARANTOR performer template ID is provided, any ID will pass, as the test only ensures an ID is there.
				// The real check for the actual ID is done with testValidatePolicyActivityGuarantor()
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PolicyActivityGuarantorTemplateId(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PolicyActivityGuarantorTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodePTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				guarantor.setAssignedEntity(createGuarantorAssignedEntity());
				guarantor.getAssignedEntity().setCode(null);
				target.getPerformers().add(guarantor);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					// Case with guarantor/assignedEntity/code
					public void updateToPass(PolicyActivity2 target) {
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						guarantor.setAssignedEntity(createGuarantorAssignedEntity());
						target.getPerformers().add(guarantor);
					}

				});

				addPassTest(new PassTest() {

					@Override
					// Case with guarantor/assignedEntity/code="GUAR" AND payer/assignedEntity/code="GUAR"
					// to ensure there is no confusion between the two identities.
					public void updateToPass(PolicyActivity2 target) {
						target.init();
						target.getPerformers().clear();
						// payer
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						payer.setAssignedEntity(createPayerAssignedEntity());
						target.getPerformers().add(payer);
						// guarantor
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						guarantor.setAssignedEntity(createGuarantorAssignedEntity());
						target.getPerformers().add(guarantor);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				guarantor.setAssignedEntity(createGuarantorAssignedEntity());
				guarantor.getAssignedEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.XXX"));
				target.getPerformers().add(guarantor);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					// Case with guarantor/assignedEntity/code
					public void updateToPass(PolicyActivity2 target) {
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						guarantor.setAssignedEntity(createGuarantorAssignedEntity());
						target.getPerformers().add(guarantor);
					}

				});

				addPassTest(new PassTest() {

					@Override
					// Case with guarantor/assignedEntity/code="GUAR" AND payer/assignedEntity/code="GUAR"
					// to ensure there is no confusion between the two identities.
					public void updateToPass(PolicyActivity2 target) {
						target.init();
						target.getPerformers().clear();
						// payer
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						payer.setAssignedEntity(createPayerAssignedEntity());
						target.getPerformers().add(payer);
						// guarantor
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						guarantor.setAssignedEntity(createGuarantorAssignedEntity());
						target.getPerformers().add(guarantor);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityAddr() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityAddrTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityAddr(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntityTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				II iiGuar = DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT);
				guarantor.getTemplateIds().add(0, iiGuar);
				target.getPerformers().add(guarantor);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				II iiGuar = DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT);
				guarantor.getTemplateIds().add(0, iiGuar);
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTimeTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_DATE_OF_BIRTH_IN_SDT_CBIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2CoverageCoverageRolePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2CoverageCoverageRolePolicyActivityCoverageCoverageRoleCoveragePlayingEntityNameTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2CoverageCoverageRolePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
				coverage.setParticipantRole(pr);
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
				coverage.setParticipantRole(pr);
				PN name = DatatypesFactory.eINSTANCE.createPN();
				pe.getNames().add(name);
				target.getParticipants().add(coverage);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2CoverageCoverageRolePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2CoverageCoverageRolePolicyActivityCoverageCoverageRoleCoveragePlayingEntityNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTimeTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_SDTC_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
				coverage.setParticipantRole(pr);
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
				coverage.setParticipantRole(pr);
				TS sDTCBirthTime = DatatypesFactory.eINSTANCE.createTS();
				pe.setSDTCBirthTime(sDTCBirthTime);
				target.getParticipants().add(coverage);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleId() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleIdTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_COVERAGE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				coverage.setParticipantRole(pr);
				target.getParticipants().add(coverage);

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
				coverage.setParticipantRole(pr);
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleId(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntityTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_COVERAGE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				coverage.setParticipantRole(pr);
				target.getParticipants().add(coverage);

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
				coverage.setParticipantRole(pr);
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PolicyActivityCoverageTemplateId() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PolicyActivityCoverageTemplateIdTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PolicyActivityCoverageTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				II iiCov = DatatypesFactory.eINSTANCE.createII(BAD_TEMPLATE_ID);
				coverage.getTemplateIds().add(0, iiCov);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getParticipants().clear();
				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				II iiCov = DatatypesFactory.eINSTANCE.createII(COVERAGE_PARTICIPANT_ROOT);
				coverage.getTemplateIds().add(0, iiCov);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PolicyActivityCoverageTemplateId(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PolicyActivityCoverageTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2PolicyActivityCoverageCoverageRole() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PolicyActivityCoverageCoverageRoleTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2PolicyActivityCoverageCoverageRole",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				CDAFactory.eINSTANCE.createParticipantRole();
				CDAFactory.eINSTANCE.createPlayingEntity();
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getParticipants().clear();
				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pEntity = CDAFactory.eINSTANCE.createPlayingEntity();
				role.setPlayingEntity(pEntity);
				coverage.setParticipantRole(role);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivity2PolicyActivityCoverageCoverageRole(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PolicyActivityCoverageCoverageRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityTemplateId() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivityTemplateIdTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivityTemplateId(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityCodeP() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivityCodePTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivityCodeP(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityCode() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivityCodeTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getCode().setCode("mustExistOnly");
				target.getCode().setCodeSystem("2.16.840.1.113883.3.221.5");
			}

			@Override
			protected void setDependency(PolicyActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PolicyActivityCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivityCode(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityStatusCode() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivityStatusCodeTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(PolicyActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PolicyActivityStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivityStatusCode(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayer() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivityPayerTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivityPayer",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						// does not contain any payer or any guarantor performer elements
						target.init();
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						// Contains 2 payers and Contains 1 guarantor
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);
						Performer2 payer2 = createPerformer();
						payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer2);

						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						// Contains 2 payers and Contains 0 guarantor
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);
						Performer2 payer2 = createPerformer();
						payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer2);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						// Contains 0 payers and Contains 2 guarantors
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						Performer2 guarantor2 = createPerformer();
						guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor2);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						// Contains 2 payers and Contains 2 guarantors
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						Performer2 guarantor2 = createPerformer();
						guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor2);

						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);
						Performer2 payer2 = createPerformer();
						payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer2);
					}
				});

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();

				Performer2 payer = createPerformer();
				AssignedEntity aePay = CDAFactory.eINSTANCE.createAssignedEntity();
				aePay.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));

				payer.setAssignedEntity(aePay);
				target.getPerformers().add(payer);

				II iiPay = DatatypesFactory.eINSTANCE.createII();
				iiPay.setRoot(PAYER_PERFORMER_ROOT);
				payer.getTemplateIds().add(0, iiPay);

				Performer2 guarantor = createPerformer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));

				guarantor.setAssignedEntity(ae);
				target.getPerformers().add(guarantor);

				II iiGuar = DatatypesFactory.eINSTANCE.createII();
				iiGuar.setRoot(GUARANTOR_PERFORMER_ROOT);
				guarantor.getTemplateIds().add(0, iiGuar);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivityPayer(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantor() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivityGuarantorTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivityGuarantor",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						// does not contain any payer or any guarantor performer elements
						target.init();
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						// Contains 1 payer and Contains 2 guarantors
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);

						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						Performer2 guarantor2 = createPerformer();
						guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor2);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						// Contains 2 payers and Contains 0 guarantor
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);
						Performer2 payer2 = createPerformer();
						payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer2);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						// Contains 0 payers and Contains 2 guarantors
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						Performer2 guarantor2 = createPerformer();
						guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor2);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity2 target) {
						// Contains 2 payers and Contains 2 guarantors
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						Performer2 guarantor2 = createPerformer();
						guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor2);

						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);
						Performer2 payer2 = createPerformer();
						payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer2);
					}
				});

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				// Contains 1 payer and 1 guarantor
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				AssignedEntity aePay = CDAFactory.eINSTANCE.createAssignedEntity();
				aePay.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));

				payer.setAssignedEntity(aePay);
				target.getPerformers().add(payer);

				II iiPay = DatatypesFactory.eINSTANCE.createII();
				iiPay.setRoot(PAYER_PERFORMER_ROOT);
				payer.getTemplateIds().add(0, iiPay);

				Performer2 guarantor = createPerformer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));

				guarantor.setAssignedEntity(ae);
				target.getPerformers().add(guarantor);

				II iiGuar = DatatypesFactory.eINSTANCE.createII();
				iiGuar.setRoot(GUARANTOR_PERFORMER_ROOT);
				guarantor.getTemplateIds().add(0, iiGuar);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivityGuarantor(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityCoverage() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivityCoverageTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivityCoverage",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity2 target) {

			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.init();
				target.getParticipants().add(createCoverage());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivity2Operations.validatePolicyActivityCoverage(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PolicyActivity2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PolicyActivity2> {
		@Override
		public PolicyActivity2 create() {
			return ConsolFactory.eINSTANCE.createPolicyActivity2();
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
	private static class ConstructorTestClass extends PolicyActivity2Operations {
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

	/**
	 * Convenience Method for creating AssignedEntity for Payer
	 */
	private static AssignedEntity createPayerAssignedEntity() {
		AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		assignedEntity.getIds().add(DatatypesFactory.eINSTANCE.createII("12345"));
		assignedEntity.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));
		assignedEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
		assignedEntity.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
		return assignedEntity;
	}

	private static AssignedEntity createGuarantorAssignedEntity() {
		AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		assignedEntity.getIds().add(DatatypesFactory.eINSTANCE.createII("12345"));
		assignedEntity.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));
		return assignedEntity;
	}

	private static Performer2 createPerformer() {
		Performer2 performer = CDAFactory.eINSTANCE.createPerformer2();
		return performer;
	}

	private static Participant2 createCoverage() {
		Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
		ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
		PlayingEntity pEntity = CDAFactory.eINSTANCE.createPlayingEntity();
		role.setPlayingEntity(pEntity);
		coverage.setParticipantRole(role);
		coverage.setTypeCode(ParticipationType.COV);
		return coverage;
	}

} // PolicyActivity2Operations
