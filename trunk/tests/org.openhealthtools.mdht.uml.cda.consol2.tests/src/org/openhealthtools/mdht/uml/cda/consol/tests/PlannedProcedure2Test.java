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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedProcedure2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Procedure2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Instruction2InversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Instruction2 Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2MethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2TargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2TargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2PatientPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Patient Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2ProviderPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Provider Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Indication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2PlannedCoverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Planned Coverage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#getPatientPriorityPreferences() <em>Get Patient Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#getProviderPriorityPreferences() <em>Get Provider Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#getPlannedCoverages() <em>Get Planned Coverages</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlanOfCareActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedProcedure2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedure2Instruction2InversionInd() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2Instruction2InversionIndTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2Instruction2InversionInd",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setInversionInd(true);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2Instruction2InversionInd(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2Instruction2InversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedure2Code() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2CodeTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2Code",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2Code(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedure2StatusCode() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2StatusCodeTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS("active");
				target.setStatusCode(cs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2StatusCode(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2StatusCodeP() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2StatusCodePTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2StatusCodeP(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2EffectiveTime() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2EffectiveTimeTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2EffectiveTime(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedure2MethodCode() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2MethodCodeTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2MethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2MethodCode(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2MethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2TargetSiteCodeP() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2TargetSiteCodePTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2TargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2TargetSiteCodeP(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2TargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedure2TargetSiteCode() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2TargetSiteCodeTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2TargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				for (int curTsc = 0; curTsc < target.getTargetSiteCodes().size(); curTsc++) {
					target.getTargetSiteCodes().set(
						curTsc, DatatypesFactory.eINSTANCE.createCD("mustExistOnly", SNOMEDCT_ID));
				}
			}

			@Override
			protected void setDependency(PlannedProcedure2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2TargetSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2TargetSiteCode(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2TargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedure2Performer() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2PerformerTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2Performer",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				Performer2 p2 = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2Performer(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedure2AuthorParticipation() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2AuthorParticipationTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2AuthorParticipation(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedure2PatientPriorityPreference() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2PatientPriorityPreferenceTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2PatientPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createPatientPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2PatientPriorityPreference(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2PatientPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedure2ProviderPriorityPreference() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2ProviderPriorityPreferenceTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2ProviderPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createProviderPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2ProviderPriorityPreference(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2ProviderPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedure2Indication2() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2Indication2TestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2Indication2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2Indication2(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2Indication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedure2Instruction2() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2Instruction2TestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2Instruction2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2Instruction2(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2Instruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedure2PlannedCoverage() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2PlannedCoverageTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2PlannedCoverage",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setAct(ConsolFactory.eINSTANCE.createPlannedCoverage().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2PlannedCoverage(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2PlannedCoverageTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientPriorityPreferences() {

		PlannedProcedure2 target = objectFactory.create();
		target.getPatientPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProviderPriorityPreferences() {

		PlannedProcedure2 target = objectFactory.create();
		target.getProviderPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndication2s() {

		PlannedProcedure2 target = objectFactory.create();
		target.getIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstruction2s() {

		PlannedProcedure2 target = objectFactory.create();
		target.getInstruction2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedCoverages() {

		PlannedProcedure2 target = objectFactory.create();
		target.getPlannedCoverages();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityProcedureTemplateId() {
		OperationsTestCase<PlannedProcedure2> validatePlanOfCareActivityProcedureTemplateIdTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlanOfCareActivityProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlanOfCareActivityProcedureTemplateId(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedProcedure2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedProcedure2> {
		@Override
		public PlannedProcedure2 create() {
			return ConsolFactory.eINSTANCE.createPlannedProcedure2();
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
	private static class ConstructorTestClass extends PlannedProcedure2Operations {
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

} // PlannedProcedure2Operations
