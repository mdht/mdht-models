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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2InstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2TargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2TargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2Indication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2MedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#getMedicationActivity2s() <em>Get Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#getInstruction2() <em>Get Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservation2InstructionsInversion() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2InstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2InstructionsInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureActivityObservation2 target) {
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
						target.getEntryRelationships().add(er);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureActivityObservation2 target) {
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
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setInversionInd(true);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2InstructionsInversion(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2InstructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservation2TargetSiteCodeP() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2TargetSiteCodePTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2TargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2TargetSiteCodeP(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2TargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservation2TargetSiteCode() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2TargetSiteCodeTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2TargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {
				target.init();
				for (CD tsc : target.getTargetSiteCodes()) {
					tsc.setCodeSystem(BAD_CODESYSTEM_ID);
				}
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				for (CD tsc : target.getTargetSiteCodes()) {
					tsc.setCodeSystem(SNOMEDCT_ID);
					tsc.setCode("mustExistOnly");
				}
			}

			@Override
			protected void setDependency(ProcedureActivityObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2TargetSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2TargetSiteCode(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2TargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservation2Indication2() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2Indication2TestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2Indication2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2Indication2(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2Indication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservation2MedicationActivity2() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2MedicationActivity2TestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2MedicationActivity2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2MedicationActivity2(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2MedicationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservation2Instruction2() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2Instruction2TestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2Instruction2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2Instruction2(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2Instruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndication2s() {

		ProcedureActivityObservation2 target = objectFactory.create();
		target.getIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivity2s() {

		ProcedureActivityObservation2 target = objectFactory.create();
		target.getMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstruction2() {

		ProcedureActivityObservation2 target = objectFactory.create();
		target.getInstruction2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationTemplateId() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationTemplateIdTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationTemplateId(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityObservation2> {
		public ProcedureActivityObservation2 create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityObservation2();
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
	private static class ConstructorTestClass extends ProcedureActivityObservation2Operations {
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

} // ProcedureActivityObservation2Operations
