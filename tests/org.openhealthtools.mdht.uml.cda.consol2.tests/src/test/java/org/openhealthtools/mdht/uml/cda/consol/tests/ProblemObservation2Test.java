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
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2HasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2TextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2HasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2HasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2HasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2ValueNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Value Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2ValueNullFlavorUnknown(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Value Null Flavor Unknown</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2PrognosisObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Prognosis Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2PriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2CDQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 CD Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2CDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#getPrognosisObservation() <em>Get Prognosis Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#getPriorityPreferences() <em>Get Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#getConsolHealthStatusObservation() <em>Get Consol Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#getConsolProblemStatus() <em>Get Consol Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationProblemStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Problem Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateProblemObservation2HasTextReference() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2HasTextReferenceTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2HasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProblemObservation2Operations.validateProblemObservation2HasTextReference(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2HasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateProblemObservation2TextReferenceValue() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2TextReferenceValueTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2TextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2TextReferenceValue(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2TextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateProblemObservation2HasTextReferenceValue() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2HasTextReferenceValueTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2HasTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2HasTextReferenceValue(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2HasTextReferenceValueTestCase.doValidationTest();
	}

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
	* @generated
	*/
	@Test
	public void testValidateProblemObservationStatusCodeP() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationStatusCodePTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProblemObservation2Operations.validateProblemObservationStatusCodeP(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationStatusCodePTestCase.doValidationTest();
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
	public void testValidateProblemObservation2PriorityPreference() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2PriorityPreferenceTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2PriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2PriorityPreference(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2PriorityPreferenceTestCase.doValidationTest();
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
	* modified VALIDATE_PROBLEM_OBSERVATION2_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP due to inline datatype OCL generation issue
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
	public void testGetPrognosisObservation() {

		ProblemObservation2 target = objectFactory.create();
		target.getPrognosisObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPriorityPreferences() {

		ProblemObservation2 target = objectFactory.create();
		target.getPriorityPreferences();

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
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationCodeP() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationCodePTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationCodeP(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationCode() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationCodeTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("mustExistOnly", LOINC_ID));

			}

			@Override
			protected void setDependency(ProblemObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationCode(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationStatusCode() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationStatusCodeTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ProblemObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationStatusCode(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationProblemStatus() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationProblemStatusTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationProblemStatus",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createProblemStatus());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationProblemStatus(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationProblemStatusTestCase.doValidationTest();
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
		@Override
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

} // ProblemObservation2Operations
