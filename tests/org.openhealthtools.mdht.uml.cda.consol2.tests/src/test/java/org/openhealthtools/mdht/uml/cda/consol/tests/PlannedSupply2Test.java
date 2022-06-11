/*******************************************************************************
 * Copyright (c) 2014, 2015 Dan Brown and others.
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
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.Participant2;
import org.eclipse.mdht.uml.cda.Performer2;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.eclipse.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedSupply2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Supply2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2MedInfoXorImmunXorProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Med Info Xor Immun Xor Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2RepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Quantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Product(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2PriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Indication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2PlannedCoverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Planned Coverage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductRecommended(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Recommended</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product Med Info2 Xor Immun Med Info2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductManufacturedProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getProductInstance() <em>Get Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getPriorityPreferences() <em>Get Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getPlannedCoverages() <em>Get Planned Coverages</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlanOfCareActivitySupplyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedSupply2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2MedInfoXorImmunXorProductInstance() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2MedInfoXorImmunXorProductInstanceTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2MedInfoXorImmunXorProductInstance",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(PlannedSupply2 target) {
						// 1 has Med2 and ProductInstance
						target.init();
						target.setProduct(CDAFactory.eINSTANCE.createProduct());
						target.getProduct().setManufacturedProduct(
							ConsolFactory.eINSTANCE.createMedicationInformation2().init());
						target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
						for (Participant2 p : target.getParticipants()) {
							p.setParticipantRole(ConsolFactory.eINSTANCE.createProductInstance().init());
						}
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(PlannedSupply2 target) {
						// 2 has Immun2 and ProductInstance
						target.init();
						target.setProduct(CDAFactory.eINSTANCE.createProduct());
						target.getProduct().setManufacturedProduct(
							ConsolFactory.eINSTANCE.createImmunizationMedicationInformation2().init());
						target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
						for (Participant2 p : target.getParticipants()) {
							p.setParticipantRole(ConsolFactory.eINSTANCE.createProductInstance().init());
						}
					}
				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(PlannedSupply2 target) {
						// has Med2 only
						target.init();
						target.setProduct(CDAFactory.eINSTANCE.createProduct());
						target.getProduct().setManufacturedProduct(
							ConsolFactory.eINSTANCE.createMedicationInformation2().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(PlannedSupply2 target) {
						// has Immun2 only
						target.init();
						target.setProduct(CDAFactory.eINSTANCE.createProduct());
						target.getProduct().setManufacturedProduct(
							ConsolFactory.eINSTANCE.createImmunizationMedicationInformation2().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(PlannedSupply2 target) {
						// has ProductInstance only
						target.init();
						target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
						for (Participant2 p : target.getParticipants()) {
							p.setParticipantRole(ConsolFactory.eINSTANCE.createProductInstance().init());
						}
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(PlannedSupply2 target) {
						// added as per SITE-2226
						// has no product or participant and passes since the rule is not enforced in this case
						target.init();
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(PlannedSupply2 target) {
						// generic cda product shouldn't trigger the rule
						target.init();
						target.setProduct(CDAFactory.eINSTANCE.createProduct());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(PlannedSupply2 target) {
						// generic cda participant shouldn't trigger the rule
						target.init();
						target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2MedInfoXorImmunXorProductInstance(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2MedInfoXorImmunXorProductInstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedSupply2TemplateId() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2TemplateIdTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2TemplateId(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2StatusCode() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2StatusCodeTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS("active");
				target.setStatusCode(cs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2StatusCode(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2StatusCodeP() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2StatusCodePTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2StatusCodeP(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2EffectiveTime() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2EffectiveTimeTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getEffectiveTimes().add(ts);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2EffectiveTime(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2RepeatNumber() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2RepeatNumberTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2RepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.setRepeatNumber(DatatypesFactory.eINSTANCE.createIVL_INT());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2RepeatNumber(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2RepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2Quantity() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2QuantityTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Quantity",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				target.setQuantity(DatatypesFactory.eINSTANCE.createPQ());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Quantity(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2QuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2Product() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProductTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Product",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				target.setProduct(CDAFactory.eINSTANCE.createProduct());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Product(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProductTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2Performer() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2PerformerTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Performer",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				Performer2 p = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(p);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Performer(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2AuthorParticipation() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2AuthorParticipationTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2AuthorParticipation(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2ProductInstance() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProductInstanceTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2ProductInstance",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				for (Participant2 p : target.getParticipants()) {
					p.setParticipantRole(ConsolFactory.eINSTANCE.createProductInstance().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2ProductInstance(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProductInstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2PriorityPreference() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2PriorityPreferenceTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2PriorityPreference", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2PriorityPreference(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2PriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2Indication2() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2Indication2TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Indication2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Indication2(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2Indication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2Instruction2() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2Instruction2TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Instruction2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Instruction2(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2Instruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2PlannedCoverage() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2PlannedCoverageTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2PlannedCoverage",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setAct(ConsolFactory.eINSTANCE.createPlannedCoverage().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2PlannedCoverage(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2PlannedCoverageTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2ProductRecommended() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProductRecommendedTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2ProductRecommended", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.setProduct(CDAFactory.eINSTANCE.createProduct());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2ProductRecommended(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProductRecommendedTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
				target.setProduct(CDAFactory.eINSTANCE.createProduct());
				target.getProduct().setManufacturedProduct(CDAFactory.eINSTANCE.createManufacturedProduct());
			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(PlannedSupply2 target) {
						target.setProduct(CDAFactory.eINSTANCE.createProduct());
						target.getProduct().setManufacturedProduct(
							ConsolFactory.eINSTANCE.createMedicationInformation2().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(PlannedSupply2 target) {
						target.setProduct(CDAFactory.eINSTANCE.createProduct());
						target.getProduct().setManufacturedProduct(
							ConsolFactory.eINSTANCE.createImmunizationMedicationInformation2().init());
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2ProductManufacturedProduct() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProductManufacturedProductTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2ProductManufacturedProduct",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
				target.setProduct(CDAFactory.eINSTANCE.createProduct());
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.getProduct().setManufacturedProduct(CDAFactory.eINSTANCE.createManufacturedProduct());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2ProductManufacturedProduct(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProductManufacturedProductTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProductInstance() {

		PlannedSupply2 target = objectFactory.create();
		target.getProductInstance();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPriorityPreferences() {

		PlannedSupply2 target = objectFactory.create();
		target.getPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndication2s() {

		PlannedSupply2 target = objectFactory.create();
		target.getIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstruction2s() {

		PlannedSupply2 target = objectFactory.create();
		target.getInstruction2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedCoverages() {

		PlannedSupply2 target = objectFactory.create();
		target.getPlannedCoverages();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivitySupplyMoodCode() {
		OperationsTestCase<PlannedSupply2> validatePlanOfCareActivitySupplyMoodCodeTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlanOfCareActivitySupplyMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				target.setMoodCode(x_DocumentSubstanceMood.INT);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlanOfCareActivitySupplyMoodCode(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySupplyMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedSupply2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedSupply2> {
		@Override
		public PlannedSupply2 create() {
			return ConsolFactory.eINSTANCE.createPlannedSupply2();
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
	private static class ConstructorTestClass extends PlannedSupply2Operations {
	}

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

} // PlannedSupply2Operations
