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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SmokingStatusMeaningfulUse2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Smoking Status Meaningful Use2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2EffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateTobaccoUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SmokingStatusMeaningfulUse2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateSmokingStatusMeaningfulUse2EffectiveTimeLow() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusMeaningfulUse2EffectiveTimeLowTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusMeaningfulUse2EffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {

			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusMeaningfulUse2EffectiveTimeLow(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusMeaningfulUse2EffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusMeaningfulUse2Id() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusMeaningfulUse2IdTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusMeaningfulUse2Id",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {

			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusMeaningfulUse2Id(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusMeaningfulUse2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusMeaningfulUse2AuthorParticipation() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusMeaningfulUse2AuthorParticipationTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusMeaningfulUse2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusMeaningfulUse2AuthorParticipation(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusMeaningfulUse2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTobaccoUseTemplateId() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateTobaccoUseTemplateIdTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateTobaccoUseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {

			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateTobaccoUseTemplateId(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationCodeP() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusObservationCodePTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {

			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationCodeP(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationCode() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusObservationCodeTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.getCode().setCode("72166-2");
				target.getCode().setCodeSystem(LOINC_ID);
			}

			@Override
			protected void setDependency(SmokingStatusMeaningfulUse2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationCode(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationEffectiveTime() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusObservationEffectiveTimeTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {

			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationEffectiveTime(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationValueP() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusObservationValuePTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationValueP(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationValue() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusObservationValueTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.getValues().set(0, DatatypesFactory.eINSTANCE.createCD("449868002", SNOMEDCT_ID));

			}

			@Override
			protected void setDependency(SmokingStatusMeaningfulUse2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationValue(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SmokingStatusMeaningfulUse2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<SmokingStatusMeaningfulUse2> {
		public SmokingStatusMeaningfulUse2 create() {
			return ConsolFactory.eINSTANCE.createSmokingStatusMeaningfulUse2();
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
	private static class ConstructorTestClass extends SmokingStatusMeaningfulUse2Operations {
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

} // SmokingStatusMeaningfulUse2Operations
