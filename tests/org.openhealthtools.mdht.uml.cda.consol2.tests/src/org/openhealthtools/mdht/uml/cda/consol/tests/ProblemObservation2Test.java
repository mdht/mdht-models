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
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2HasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2HasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2ValueNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Value Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2ValueNullFlavorUnknown(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Value Null Flavor Unknown</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2PatientPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Patient Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2PrognosisObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Prognosis Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2ProviderPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Provider Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2CDQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 CD Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2CDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#getPatientPriorityPreferences() <em>Get Patient Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#getPrognosisObservation() <em>Get Prognosis Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#getProviderPriorityPreferences() <em>Get Provider Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#getConsolProblemStatus() <em>Get Consol Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#getConsolHealthStatusObservation() <em>Get Consol Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservation2HasOnsetDate() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2HasOnsetDateTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2HasOnsetDate",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {
				target.init();
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();

				target.setEffectiveTime(ef);
			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				ef.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(ef);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2HasOnsetDate(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2HasOnsetDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservation2HasResolutionDate() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2HasResolutionDateTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2HasResolutionDate",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {
				target.init();
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ef);
			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				ef.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(ef);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2HasResolutionDate(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2HasResolutionDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateProblemObservation2ValueNullFlavor() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2ValueNullFlavorTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2ValueNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2ValueNullFlavor(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2ValueNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateProblemObservation2ValueNullFlavorUnknown() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2ValueNullFlavorUnknownTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2ValueNullFlavorUnknown",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_VALUE_NULL_FLAVOR_UNKNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2ValueNullFlavorUnknown(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2ValueNullFlavorUnknownTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservation2PatientPriorityPreference() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2PatientPriorityPreferenceTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2PatientPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createPatientPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2PatientPriorityPreference(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2PatientPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservation2PrognosisObservation() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2PrognosisObservationTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2PrognosisObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_PROGNOSIS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createPrognosisObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2PrognosisObservation(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2PrognosisObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservation2ProviderPriorityPreference() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2ProviderPriorityPreferenceTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2ProviderPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createProviderPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2ProviderPriorityPreference(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2ProviderPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservation2AuthorParticipation() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2AuthorParticipationTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2AuthorParticipation(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservation2CDQualifier() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2CDQualifierTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2CDQualifier",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.getValues().clear();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(val);
				CR qualifier = DatatypesFactory.eINSTANCE.createCR();
				val.getQualifiers().add(qualifier);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2CDQualifier(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2CDQualifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* modified VALIDATE_PROBLEM_OBSERVATION2_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP due to inline datatype OCL generation issue
	*/
	@Test
	public void testValidateProblemObservation2CDCode() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2CDCodeTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2CDCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.getValues().clear();
				CD val = DatatypesFactory.eINSTANCE.createCD("hasACode", "doesNotMatter");
				target.getValues().add(val);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2CDCode(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2CDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientPriorityPreferences() {

		ProblemObservation2 target = objectFactory.create();
		target.getPatientPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPrognosisObservation() {

		ProblemObservation2 target = objectFactory.create();
		target.getPrognosisObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProviderPriorityPreferences() {

		ProblemObservation2 target = objectFactory.create();
		target.getProviderPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProblemStatus() {

		ProblemObservation2 target = objectFactory.create();
		target.getConsolProblemStatus();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolHealthStatusObservation() {

		ProblemObservation2 target = objectFactory.create();
		target.getConsolHealthStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationTemplateId() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationTemplateId(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationNegationInd() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationNegationIndTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();
				target.setNegationInd(true);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationNegationInd(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationEffectiveTime() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationEffectiveTimeTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationEffectiveTime(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationValueP() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationValuePTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationValueP(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationValue() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationValueTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem(SNOMEDCT_ID);
				value.setCode("mustExist");
				target.getValues().add(value);
			}

			@Override
			protected void setDependency(ProblemObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationValue(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemObservation2> {
		public ProblemObservation2 create() {
			return ConsolFactory.eINSTANCE.createProblemObservation2();
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
	private static class ConstructorTestClass extends ProblemObservation2Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // ProblemObservation2Operations
