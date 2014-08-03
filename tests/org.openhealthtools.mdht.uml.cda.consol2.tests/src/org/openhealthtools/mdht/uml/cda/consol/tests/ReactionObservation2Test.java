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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReactionObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reaction Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservation2CodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservation2ProcedureActivityProcedureInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Procedure Activity Procedure Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservation2MedicationActivityInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Medication Activity Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservation2SeverityObservationInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Severity Observation Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationProcedureActivityProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationSeverityObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#getConsolProcedureActivityProcedure2s() <em>Get Consol Procedure Activity Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#getConsolMedicationActivity2s() <em>Get Consol Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#getConsolSeverityObservation2() <em>Get Consol Severity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReactionObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateReactionObservation2CodeValueSet() {
		OperationsTestCase<ReactionObservation2> validateReactionObservation2CodeValueSetTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservation2CodeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION2_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservation2CodeValueSet(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservation2CodeValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservation2ProcedureActivityProcedureInversionInd() {
		OperationsTestCase<ReactionObservation2> validateReactionObservation2ProcedureActivityProcedureInversionIndTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservation2ProcedureActivityProcedureInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION2_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ReactionObservation2 target) {
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
						er.setProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure2().init());
						target.getEntryRelationships().add(er);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ReactionObservation2 target) {
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
						er.setInversionInd(false);
						er.setProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure2().init());
						target.getEntryRelationships().add(er);
					}
				});
			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setInversionInd(true);
				er.setProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservation2ProcedureActivityProcedureInversionInd(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservation2ProcedureActivityProcedureInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservation2MedicationActivityInversionInd() {
		OperationsTestCase<ReactionObservation2> validateReactionObservation2MedicationActivityInversionIndTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservation2MedicationActivityInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION2_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ReactionObservation2 target) {
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
						er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
						target.getEntryRelationships().add(er);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ReactionObservation2 target) {
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
						er.setInversionInd(false);
						er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
						target.getEntryRelationships().add(er);
					}
				});
			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setInversionInd(true);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservation2MedicationActivityInversionInd(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservation2MedicationActivityInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservation2SeverityObservationInversionInd() {
		OperationsTestCase<ReactionObservation2> validateReactionObservation2SeverityObservationInversionIndTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservation2SeverityObservationInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION2_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createSeverityObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setInversionInd(true);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservation2SeverityObservationInversionInd(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservation2SeverityObservationInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationCodeP() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationCodePTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationCodeP(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateReactionObservationProcedureActivityProcedure2() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationProcedureActivityProcedure2TestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationProcedureActivityProcedure2",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationProcedureActivityProcedure2(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationProcedureActivityProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateReactionObservationMedicationActivity2() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationMedicationActivity2TestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationMedicationActivity2",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationMedicationActivity2(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationMedicationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservationSeverityObservation2() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationSeverityObservation2TestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationSeverityObservation2",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createSeverityObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationSeverityObservation2(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationSeverityObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProcedureActivityProcedure2s() {

		ReactionObservation2 target = objectFactory.create();
		target.getConsolProcedureActivityProcedure2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationActivity2s() {

		ReactionObservation2 target = objectFactory.create();
		target.getConsolMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolSeverityObservation2() {

		ReactionObservation2 target = objectFactory.create();
		target.getConsolSeverityObservation2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationTemplateId() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationTemplateIdTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationTemplateId(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationCode() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationCodeTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(ReactionObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ReactionObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationCode(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReactionObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ReactionObservation2> {
		public ReactionObservation2 create() {
			return ConsolFactory.eINSTANCE.createReactionObservation2();
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
	private static class ConstructorTestClass extends ReactionObservation2Operations {
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

} // ReactionObservation2Operations
