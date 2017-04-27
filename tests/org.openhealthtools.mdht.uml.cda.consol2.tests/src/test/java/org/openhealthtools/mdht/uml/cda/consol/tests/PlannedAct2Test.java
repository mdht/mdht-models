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
import org.eclipse.mdht.uml.cda.Performer2;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.eclipse.mdht.uml.hl7.vocab.*;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedAct2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Act2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2CodeFromLoincOrSnomed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Code From Loinc Or Snomed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2Indication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2PriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#getPriorityPreferences() <em>Get Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlanOfCareActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlanOfCareActivityActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedAct2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedAct2CodeFromLoincOrSnomed() {
		OperationsTestCase<PlannedAct2> validatePlannedAct2CodeFromLoincOrSnomedTestCase = new OperationsTestCase<PlannedAct2>(
			"validatePlannedAct2CodeFromLoincOrSnomed", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ACT2_CODE_FROM_LOINC_OR_SNOMED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedAct2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(PlannedAct2 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("any", LOINC_ID));
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(PlannedAct2 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("any", SNOMEDCT_ID));
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedAct2Operations.validatePlannedAct2CodeFromLoincOrSnomed(
					(PlannedAct2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedAct2CodeFromLoincOrSnomedTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedAct2Code() {
		OperationsTestCase<PlannedAct2> validatePlannedAct2CodeTestCase = new OperationsTestCase<PlannedAct2>(
			"validatePlannedAct2Code",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ACT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PlannedAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedAct2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedAct2Operations.validatePlannedAct2Code((PlannedAct2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedAct2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedAct2StatusCode() {
		OperationsTestCase<PlannedAct2> validatePlannedAct2StatusCodeTestCase = new OperationsTestCase<PlannedAct2>(
			"validatePlannedAct2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ACT2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedAct2 target) {
				target.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.10.20.22.4.39.2"));
				target.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.10.20.22.4.39"));
				target.setClassCode(x_ActClassDocumentEntryAct.ACT);
			}

			@Override
			protected void updateToPass(PlannedAct2 target) {
				CS cs = DatatypesFactory.eINSTANCE.createCS("active");
				target.setStatusCode(cs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedAct2Operations.validatePlannedAct2StatusCode(
					(PlannedAct2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedAct2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedAct2StatusCodeP() {
		OperationsTestCase<PlannedAct2> validatePlannedAct2StatusCodePTestCase = new OperationsTestCase<PlannedAct2>(
			"validatePlannedAct2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ACT2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedAct2 target) {

			}

			@Override
			protected void updateToPass(PlannedAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedAct2Operations.validatePlannedAct2StatusCodeP(
					(PlannedAct2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedAct2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedAct2EffectiveTime() {
		OperationsTestCase<PlannedAct2> validatePlannedAct2EffectiveTimeTestCase = new OperationsTestCase<PlannedAct2>(
			"validatePlannedAct2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ACT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedAct2 target) {

			}

			@Override
			protected void updateToPass(PlannedAct2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedAct2Operations.validatePlannedAct2EffectiveTime(
					(PlannedAct2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedAct2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedAct2Indication2() {
		OperationsTestCase<PlannedAct2> validatePlannedAct2Indication2TestCase = new OperationsTestCase<PlannedAct2>(
			"validatePlannedAct2Indication2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ACT2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedAct2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedAct2Operations.validatePlannedAct2Indication2(
					(PlannedAct2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedAct2Indication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedAct2Instruction2() {
		OperationsTestCase<PlannedAct2> validatePlannedAct2Instruction2TestCase = new OperationsTestCase<PlannedAct2>(
			"validatePlannedAct2Instruction2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ACT2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedAct2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedAct2Operations.validatePlannedAct2Instruction2(
					(PlannedAct2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedAct2Instruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedAct2AuthorParticipation() {
		OperationsTestCase<PlannedAct2> validatePlannedAct2AuthorParticipationTestCase = new OperationsTestCase<PlannedAct2>(
			"validatePlannedAct2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedAct2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedAct2Operations.validatePlannedAct2AuthorParticipation(
					(PlannedAct2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedAct2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedAct2Performer() {
		OperationsTestCase<PlannedAct2> validatePlannedAct2PerformerTestCase = new OperationsTestCase<PlannedAct2>(
			"validatePlannedAct2Performer",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ACT2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedAct2 target) {
				Performer2 p2 = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedAct2Operations.validatePlannedAct2Performer(
					(PlannedAct2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedAct2PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedAct2PriorityPreference() {
		OperationsTestCase<PlannedAct2> validatePlannedAct2PriorityPreferenceTestCase = new OperationsTestCase<PlannedAct2>(
			"validatePlannedAct2PriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedAct2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				// NOTE: THIS WILL EVENTUALLY NEED TO CHANGE TO createPriorityPreference
				er.setObservation(ConsolFactory.eINSTANCE.createPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedAct2Operations.validatePlannedAct2PriorityPreference(
					(PlannedAct2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedAct2PriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndication2s() {

		PlannedAct2 target = objectFactory.create();
		target.getIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstruction2s() {

		PlannedAct2 target = objectFactory.create();
		target.getInstruction2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPriorityPreferences() {

		PlannedAct2 target = objectFactory.create();
		target.getPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityActTemplateId() {
		OperationsTestCase<PlannedAct2> validatePlanOfCareActivityActTemplateIdTestCase = new OperationsTestCase<PlannedAct2>(
			"validatePlanOfCareActivityActTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedAct2 target) {

			}

			@Override
			protected void updateToPass(PlannedAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedAct2Operations.validatePlanOfCareActivityActTemplateId(
					(PlannedAct2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivityActMoodCode() {
		OperationsTestCase<PlannedAct2> validatePlanOfCareActivityActMoodCodeTestCase = new OperationsTestCase<PlannedAct2>(
			"validatePlanOfCareActivityActMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedAct2 target) {

			}

			@Override
			protected void updateToPass(PlannedAct2 target) {
				target.init();
				target.setMoodCode(x_DocumentActMood.PRMS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedAct2Operations.validatePlanOfCareActivityActMoodCode(
					(PlannedAct2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedAct2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedAct2> {
		@Override
		public PlannedAct2 create() {
			return ConsolFactory.eINSTANCE.createPlannedAct2();
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
	private static class ConstructorTestClass extends PlannedAct2Operations {
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

} // PlannedAct2Operations
