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
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ValueOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Value Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2OriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2OriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2NegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2EDTELValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 EDTEL Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2EDReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 ED Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Allergy Observation Allergy Observation Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Allergy Observation Allergy Observation Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#getConsolAllergyStatusObservations() <em>Get Consol Allergy Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateSubstanceOrDeviceAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCEOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity CE Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Playing Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2ValueOriginalText() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ValueOriginalTextTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ValueOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2ValueOriginalText(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ValueOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2OriginalTextReference() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2OriginalTextReferenceTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2OriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2OriginalTextReference(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2OriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2OriginalTextReferenceValue() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2OriginalTextReferenceValueTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2OriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2OriginalTextReferenceValue(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2OriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2ReferenceValue() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ReferenceValueTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2ReferenceValue(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2NegationInd() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2NegationIndTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2NegationInd",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.setNegationInd(false);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2NegationInd(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2NegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservation2Text() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2TextTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2Text",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2Text(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationValueP() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationValuePTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationValueP(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2AuthorParticipation() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2AuthorParticipationTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2AuthorParticipation(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2EDTELValue() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2EDTELValueTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2EDTELValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				target.setText(DatatypesFactory.eINSTANCE.createED());
				target.getText().setReference(DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getText().getReference().setValue("hasAValue");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2EDTELValue(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2EDTELValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2EDReference() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2EDReferenceTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2EDReference",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				target.setText(DatatypesFactory.eINSTANCE.createED());
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getText().setReference(DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2EDReference(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2EDReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2IVLTSLow() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2IVLTSLowTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2IVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2IVLTSLow(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2IVLTSHigh() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2IVLTSHighTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2IVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2IVLTSHigh(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCodeTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRoleTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAllergyStatusObservations() {

		AllergyObservation2 target = objectFactory.create();
		target.getConsolAllergyStatusObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationTemplateId() {
		OperationsTestCase<AllergyObservation2> validateSubstanceOrDeviceAllergyObservationTemplateIdTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationTemplateId(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationCodeP() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationCodePTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationCodeP(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationCode() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationCodeTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				// target.init() happens to, by default, set up the code properly
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("ASSERTION");
				cd.setCodeSystem("2.16.840.1.113883.5.4");
				target.setCode(cd);
			}

			@Override
			protected void setDependency(AllergyObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AllergyObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationCode(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationValue() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationValueTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("420134006");
				target.getValues().add(value);
			}

			@Override
			protected void setDependency(AllergyObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AllergyObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationValue(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationEffectiveTime() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationEffectiveTimeTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationEffectiveTime(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipant() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationParticipantTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationParticipant",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationParticipant(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCEOriginalText() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCEOriginalTextTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCEOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCEOriginalText(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCEOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCETranslation() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCETranslationTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCETranslation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.getTranslations().add(DatatypesFactory.eINSTANCE.createCD());

				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCETranslation(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCETranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValueTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValueTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCodeTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCodeTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntityTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyObservation2> {
		public AllergyObservation2 create() {
			return ConsolFactory.eINSTANCE.createAllergyObservation2();
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
	private static class ConstructorTestClass extends AllergyObservation2Operations {
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

} // AllergyObservation2Operations
