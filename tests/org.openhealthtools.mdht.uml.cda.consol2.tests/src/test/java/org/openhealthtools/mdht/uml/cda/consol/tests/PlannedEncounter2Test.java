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
import org.eclipse.mdht.uml.hl7.vocab.ParticipationType;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.eclipse.mdht.uml.hl7.vocab.x_DocumentEncounterMood;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedEncounter2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Encounter2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Participant Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2ServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2PriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2Indication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2PerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#getServiceDeliveryLocations() <em>Get Service Delivery Locations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#getPriorityPreference() <em>Get Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlanOfCareActivityEncounterTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlanOfCareActivityEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedEncounter2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCode() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCodeTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_PARTICIPANT_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Working OCL
			// self.participant->select(par : cda::Participant2 | par.participantRole.oclIsTypeOf(consol::ServiceDeliveryLocation))->forAll(pars :
			// cda::Participant2 | pars.typeCode=vocab::ParticipationType::LOC)

			@Override
			protected void updateToFail(PlannedEncounter2 target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				p.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init());
				target.getParticipants().add(p);
			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				for (Participant2 p : target.getParticipants()) {
					p.setTypeCode(ParticipationType.LOC);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCode(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedEncounter2Code() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2CodeTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2Code",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("notChecked", SNOMEDCT_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2Code(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2CodeP() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2CodePTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2CodeP(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedEncounter2StatusCode() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2StatusCodeTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS("active");
				target.setStatusCode(cs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2StatusCode(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2StatusCodeP() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2StatusCodePTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2StatusCodeP(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2EffectiveTime() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2EffectiveTimeTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2EffectiveTime(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedEncounter2Performer() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2PerformerTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2Performer",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				Performer2 p = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(p);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2Performer(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedEncounter2ServiceDeliveryLocation() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2ServiceDeliveryLocationTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2ServiceDeliveryLocation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p2);
				ServiceDeliveryLocation sdl = ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init();
				p2.setParticipantRole(sdl);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2ServiceDeliveryLocation(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2ServiceDeliveryLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedEncounter2PriorityPreference() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2PriorityPreferenceTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2PriorityPreference", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				EntryRelationship e = CDAFactory.eINSTANCE.createEntryRelationship();
				e.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				e.setObservation(ConsolFactory.eINSTANCE.createPriorityPreference().init());
				target.getEntryRelationships().add(e);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2PriorityPreference(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2PriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedEncounter2Indication2() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2Indication2TestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2Indication2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				EntryRelationship e = CDAFactory.eINSTANCE.createEntryRelationship();
				e.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				e.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(e);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2Indication2(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2Indication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedEncounter2AuthorParticipation() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2AuthorParticipationTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2AuthorParticipation(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedEncounter2PerformerAssignedEntity() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2PerformerAssignedEntityTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2PerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {
				target.init();
				Performer2 p = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(p);
			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				for (Performer2 p : target.getPerformers()) {
					p.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2PerformerAssignedEntity(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2PerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetServiceDeliveryLocations() {

		PlannedEncounter2 target = objectFactory.create();
		target.getServiceDeliveryLocations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPriorityPreference() {

		PlannedEncounter2 target = objectFactory.create();
		target.getPriorityPreference();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndication2s() {

		PlannedEncounter2 target = objectFactory.create();
		target.getIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityEncounterTemplateId() {
		OperationsTestCase<PlannedEncounter2> validatePlanOfCareActivityEncounterTemplateIdTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlanOfCareActivityEncounterTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlanOfCareActivityEncounterTemplateId(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivityEncounterMoodCode() {
		OperationsTestCase<PlannedEncounter2> validatePlanOfCareActivityEncounterMoodCodeTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlanOfCareActivityEncounterMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {
				target.init();
				target.setMoodCode(x_DocumentEncounterMood.EVN);
			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.setMoodCode(x_DocumentEncounterMood.APT);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlanOfCareActivityEncounterMoodCode(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedEncounter2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedEncounter2> {
		@Override
		public PlannedEncounter2 create() {
			return ConsolFactory.eINSTANCE.createPlannedEncounter2();
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
	private static class ConstructorTestClass extends PlannedEncounter2Operations {
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

} // PlannedEncounter2Operations
