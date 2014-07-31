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
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2Payer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2Guarantor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2Coverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Policy Activity Payer Payer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Payer Payer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Guarantor Guarantor Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Coverage Role Coverage Playing Entity Date Of Birth In SDT Cbirth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Coverage Role Coverage Playing Entity SDTC Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Policy Activity Coverage Coverage Role Coverage Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PolicyActivityCoverageCoverageRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Coverage Coverage Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PolicyActivity2Test extends CDAValidationTest {

	public static final String PAYER_PERFORMER_ROOT = "2.16.840.1.113883.10.20.22.4.87";

	public static final String GUARANTOR_PERFORMER_ROOT = "2.16.840.1.113883.10.20.22.4.88";

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2Payer() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2PayerTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2Payer",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PolicyActivity2Operations.validatePolicyActivity2Payer(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2PayerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2Guarantor() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2GuarantorTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2Guarantor",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PolicyActivity2Operations.validatePolicyActivity2Guarantor(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2GuarantorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivity2Coverage() {
		OperationsTestCase<PolicyActivity2> validatePolicyActivity2CoverageTestCase = new OperationsTestCase<PolicyActivity2>(
			"validatePolicyActivity2Coverage",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PolicyActivity2Operations.validatePolicyActivity2Coverage(
					(PolicyActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2CoverageTestCase.doValidationTest();
	}

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
				// gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity2 target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				// gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
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
