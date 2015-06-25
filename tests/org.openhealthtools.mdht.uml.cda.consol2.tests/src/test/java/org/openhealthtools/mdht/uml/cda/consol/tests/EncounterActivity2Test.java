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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivity2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#getConsolEncounterDiagnosis2s() <em>Get Consol Encounter Diagnosis2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#getConsolServiceDeliveryLocations() <em>Get Consol Service Delivery Locations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesSdtcDDCFromNUBCOrDD(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Sdtc DDC From NUBC Or DD</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesSDTCDischargeDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterActivity2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesCodeP() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesCodePTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesCodeP(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivity2CDTranslation() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivity2CDTranslationTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivity2CDTranslation",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITY2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(code);
			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivity2CDTranslation(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivity2CDTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodePTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {
				target.init();
				Performer2 ep = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(ep);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ep.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.getPerformers().clear();
				target.init();
				Performer2 ep = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(ep);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ep.setAssignedEntity(ae);
				ae.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolIndication2s() {

		EncounterActivity2 target = objectFactory.create();
		target.getConsolIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolEncounterDiagnosis2s() {

		EncounterActivity2 target = objectFactory.create();
		target.getConsolEncounterDiagnosis2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolServiceDeliveryLocations() {

		EncounterActivity2 target = objectFactory.create();
		target.getConsolServiceDeliveryLocations();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesSdtcDDCFromNUBCOrDD() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesSdtcDDCFromNUBCOrDDTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesSdtcDDCFromNUBCOrDD",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			private static final String NUBC_CODESYSTEM_VALUE = "2.16.840.1.113883.6.301.5";

			private static final String DDC_CODESYSTEM_VALUE = "2.16.840.1.113883.12.112";

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(EncounterActivity2 target) {
						// Fails due to incorrect codeSystem
						target.init();
						CE sdtcCode = DatatypesFactory.eINSTANCE.createCE();
						sdtcCode.setCode("AnyStringRequired"); // Required to be defined, but not to any specific String
						sdtcCode.setCodeSystem(CDAValidationTest.BAD_CODESYSTEM_ID); // apply incorrect codeSystem
						target.getSDTCDischargeDispositionCodes().add(sdtcCode);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(EncounterActivity2 target) {
						// even though it has the correct codeSystem -
						// fails due to not having a code defined at all
						target.init();
						CE sdtcCode = DatatypesFactory.eINSTANCE.createCE();
						sdtcCode.setCodeSystem(NUBC_CODESYSTEM_VALUE); // apply incorrect codeSystem
						target.getSDTCDischargeDispositionCodes().add(sdtcCode);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(EncounterActivity2 target) {
						target.init();

						CE sdtcCode = DatatypesFactory.eINSTANCE.createCE();
						sdtcCode.setCode("notChecked"); // Required to be defined, but not to any specific String
						sdtcCode.setCodeSystem(NUBC_CODESYSTEM_VALUE); // the actual constraint checked which must be accurate
						sdtcCode.setCodeSystemName("NUBC UB-04 FL17-Patient Status"); // not required (not checked as a constraint)
						target.getSDTCDischargeDispositionCodes().add(sdtcCode);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(EncounterActivity2 target) {
						target.init();
						CE sdtcCode = DatatypesFactory.eINSTANCE.createCE();
						sdtcCode.setCode("notChecked"); // Required to be defined, but not to any specific String
						sdtcCode.setCodeSystem(DDC_CODESYSTEM_VALUE); // the actual constraint checked which must be accurate
						sdtcCode.setCodeSystemName("HL7 Discharge Disposition"); // not required (not checked as a constraint)
						target.getSDTCDischargeDispositionCodes().add(sdtcCode);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesSdtcDDCFromNUBCOrDD(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesSdtcDDCFromNUBCOrDDTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesTemplateId() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesTemplateIdTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesTemplateId(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesCode() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesCodeTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();
				target.getCode().setCode("mustExistOnly");
				target.getCode().setCodeSystem("2.16.840.1.113883.6.12");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesCode(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesSDTCDischargeDispositionCode() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesSDTCDischargeDispositionCodeTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesSDTCDischargeDispositionCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {
				// Fails due to not existing
				target.init();
			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				// only needs to exist for this test
				CE sdtcCode = DatatypesFactory.eINSTANCE.createCE();
				target.getSDTCDischargeDispositionCodes().add(sdtcCode);
			}

			@Override
			protected void setDependency(EncounterActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.EncounterActivitiesSDTCDischargeDispositionCodeP",
					passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesSDTCDischargeDispositionCode(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesSDTCDischargeDispositionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesIndication() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesIndicationTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesIndication",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesIndication(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterDiagnosis() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesEncounterDiagnosisTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesEncounterDiagnosis",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createEncounterDiagnosis2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesEncounterDiagnosis(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterDiagnosisTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesServiceDeliveryLocation() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesServiceDeliveryLocationTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesServiceDeliveryLocation",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
				p.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesServiceDeliveryLocation(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesServiceDeliveryLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterPerformer() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesEncounterPerformerTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesEncounterPerformer",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();
				Performer2 ep = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(ep);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesEncounterPerformer(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {
				target.init();
				Performer2 ep = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(ep);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ep.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.getPerformers().clear();
				target.init();
				Performer2 ep = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(ep);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ep.setAssignedEntity(ae);
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("mustExistOnly", "2.16.840.1.113883.6.101"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {
				target.init();
				Performer2 ep = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(ep);
			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.getPerformers().clear();
				target.init();
				Performer2 ep = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(ep);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ep.setAssignedEntity(ae);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterActivity2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterActivity2> {
		@Override
		public EncounterActivity2 create() {
			return ConsolFactory.eINSTANCE.createEncounterActivity2();
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
	private static class ConstructorTestClass extends EncounterActivity2Operations {
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

} // EncounterActivity2Operations
