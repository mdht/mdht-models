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
import org.eclipse.mdht.uml.cda.AssignedEntity;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.Organization;
import org.eclipse.mdht.uml.cda.Performer2;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.eclipse.mdht.uml.hl7.vocab.*;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityAct2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Act2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityAct2CodeSuggestedCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act2 Code Suggested Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityAct2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityAct2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#getConsolInstruction2() <em>Get Consol Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#getConsolMedicationActivity2s() <em>Get Consol Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Procedure Act Represented Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Procedure Act Represented Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActProcedureActPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityAct2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityAct2CodeSuggestedCodeSystems() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityAct2CodeSuggestedCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityAct2CodeSuggestedCodeSystems",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT2_CODE_SUGGESTED_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureActivityAct2 target) {
						target.setCode(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.12"));
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureActivityAct2 target) {
						target.setCode(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.4"));
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureActivityAct2 target) {
						target.setCode(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.13"));
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityAct2CodeSuggestedCodeSystems(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityAct2CodeSuggestedCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityAct2TemplateId() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityAct2TemplateIdTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityAct2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityAct2TemplateId(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityAct2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActStatusCodeP() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActStatusCodePTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActStatusCodeP(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityAct2AuthorParticipation() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityAct2AuthorParticipationTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityAct2AuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityAct2AuthorParticipation(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityAct2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolInstruction2() {

		ProcedureActivityAct2 target = objectFactory.create();
		target.getConsolInstruction2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolIndication2s() {

		ProcedureActivityAct2 target = objectFactory.create();
		target.getConsolIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationActivity2s() {

		ProcedureActivityAct2 target = objectFactory.create();
		target.getConsolMedicationActivity2s();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActInstructionsInversion() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActInstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActInstructionsInversion",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureActivityAct2 target) {
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
						target.getEntryRelationships().add(er);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureActivityAct2 target) {
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						er.setInversionInd(false);
						er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
						target.getEntryRelationships().add(er);
					}
				});
			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setInversionInd(true);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActInstructionsInversion(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActInstructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActMoodCode() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActMoodCodeTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActMoodCode(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActStatusCode() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActStatusCodeTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ProcedureActivityAct2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityActStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActStatusCode(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEffectiveTime() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActEffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActEffectiveTime(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActInstructions() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActInstructionsTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActInstructions", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActInstructions(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActIndication() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActIndicationTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActIndication",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActIndication(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActMedicationActivity() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActMedicationActivityTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActMedicationActivity", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureActivityAct2 target) {

					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureActivityAct2 target) {
						// v1 MedicationActivity instead of v2 version
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
						er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity().init());
						target.getEntryRelationships().add(er);
					}
				});
			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActMedicationActivity(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActPerformer() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActPerformerTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActPerformer",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActPerformer(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecomTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_PROCEDURE_ACT_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				for (Performer2 perf : target.getPerformers()) {
					for (Organization repOrg : perf.getAssignedEntity().getRepresentedOrganizations()) {
						repOrg.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddrTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_PROCEDURE_ACT_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				for (Performer2 perf : target.getPerformers()) {
					for (Organization repOrg : perf.getAssignedEntity().getRepresentedOrganizations()) {
						repOrg.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecomTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				for (Performer2 p : target.getPerformers()) {
					p.getAssignedEntity().getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganizationTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				ae.getRepresentedOrganizations().add(org);
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerAssignedEntity() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActProcedureActPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActProcedureActPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {
				target.init();
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerAssignedEntity(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityAct2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityAct2> {
		@Override
		public ProcedureActivityAct2 create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityAct2();
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
	private static class ConstructorTestClass extends ProcedureActivityAct2Operations {
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

} // ProcedureActivityAct2Operations
