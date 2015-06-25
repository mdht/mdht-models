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
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reaction Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#getConsolProcedureActivityProcedure2s() <em>Get Consol Procedure Activity Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#getConsolMedicationActivity2s() <em>Get Consol Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#getConsolSeverityObservation2() <em>Get Consol Severity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationProcedureActivityProcedureInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationMedicationActivityInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationSeverityObservationInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationSeverityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation</em>}</li>
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
	public void testValidateReactionObservationCodeValueSet() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationCodeValueSetTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationCodeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservation2Operations.validateReactionObservationCodeValueSet(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationCodeValueSetTestCase.doValidationTest();
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
	* @generated
	*/
	@Test
	public void testValidateReactionObservationStatusCodeP() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationStatusCodePTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservation2Operations.validateReactionObservationStatusCodeP(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationStatusCodePTestCase.doValidationTest();
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
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservationProcedureActivityProcedureInversionInd() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationProcedureActivityProcedureInversionIndTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationProcedureActivityProcedureInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservation2Operations.validateReactionObservationProcedureActivityProcedureInversionInd(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationProcedureActivityProcedureInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservationMedicationActivityInversionInd() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationMedicationActivityInversionIndTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationMedicationActivityInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservation2Operations.validateReactionObservationMedicationActivityInversionInd(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationMedicationActivityInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservationSeverityObservationInversionInd() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationSeverityObservationInversionIndTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationSeverityObservationInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservation2Operations.validateReactionObservationSeverityObservationInversionInd(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationSeverityObservationInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateReactionObservationTextReference() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationTextReferenceTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservation2Operations.validateReactionObservationTextReference(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateReactionObservationTextReferenceValue() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationTextReferenceValueTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationTextReferenceValue(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateReactionObservationReferenceValue() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationReferenceValueTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationReferenceValue(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationReferenceValueTestCase.doValidationTest();
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
	* @generated NOT
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
	@Test
	public void testValidateReactionObservationId() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationIdTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationId",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationId(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateReactionObservationText() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationTextTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationText",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationText(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationStatusCode() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationStatusCodeTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ReactionObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ReactionObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationStatusCode(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservationProcedureActivityProcedure() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationProcedureActivityProcedureTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationProcedureActivityProcedure",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservation2Operations.validateReactionObservationProcedureActivityProcedure(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationProcedureActivityProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservationMedicationActivity() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationMedicationActivityTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservation2Operations.validateReactionObservationMedicationActivity(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservationSeverityObservation() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationSeverityObservationTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationSeverityObservation",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservation2Operations.validateReactionObservationSeverityObservation(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationSeverityObservationTestCase.doValidationTest();
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
		@Override
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
