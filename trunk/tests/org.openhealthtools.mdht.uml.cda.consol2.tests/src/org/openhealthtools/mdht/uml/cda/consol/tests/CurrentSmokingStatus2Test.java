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
import org.openhealthtools.mdht.uml.cda.consol.CurrentSmokingStatus2;
import org.openhealthtools.mdht.uml.cda.consol.operations.CurrentSmokingStatus2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Current Smoking Status2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CurrentSmokingStatus2#validateCurrentSmokingStatus2EffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Smoking Status2 Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CurrentSmokingStatus2#validateCurrentSmokingStatus2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Smoking Status2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CurrentSmokingStatus2#validateTobaccoUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CurrentSmokingStatus2#validateSmokingStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CurrentSmokingStatus2#validateSmokingStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CurrentSmokingStatus2#validateSmokingStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CurrentSmokingStatus2#validateSmokingStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CurrentSmokingStatus2#validateSmokingStatusObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CurrentSmokingStatus2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateCurrentSmokingStatus2EffectiveTimeLow() {
		OperationsTestCase<CurrentSmokingStatus2> validateCurrentSmokingStatus2EffectiveTimeLowTestCase = new OperationsTestCase<CurrentSmokingStatus2>(
			"validateCurrentSmokingStatus2EffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_SMOKING_STATUS2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentSmokingStatus2 target) {

			}

			@Override
			protected void updateToPass(CurrentSmokingStatus2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentSmokingStatus2Operations.validateCurrentSmokingStatus2EffectiveTimeLow(
					(CurrentSmokingStatus2) objectToTest, diagnostician, map);
			}

		};

		validateCurrentSmokingStatus2EffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCurrentSmokingStatus2AuthorParticipation() {
		OperationsTestCase<CurrentSmokingStatus2> validateCurrentSmokingStatus2AuthorParticipationTestCase = new OperationsTestCase<CurrentSmokingStatus2>(
			"validateCurrentSmokingStatus2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_SMOKING_STATUS2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentSmokingStatus2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(CurrentSmokingStatus2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentSmokingStatus2Operations.validateCurrentSmokingStatus2AuthorParticipation(
					(CurrentSmokingStatus2) objectToTest, diagnostician, map);
			}

		};

		validateCurrentSmokingStatus2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTobaccoUseTemplateId() {
		OperationsTestCase<CurrentSmokingStatus2> validateTobaccoUseTemplateIdTestCase = new OperationsTestCase<CurrentSmokingStatus2>(
			"validateTobaccoUseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentSmokingStatus2 target) {

			}

			@Override
			protected void updateToPass(CurrentSmokingStatus2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentSmokingStatus2Operations.validateTobaccoUseTemplateId(
					(CurrentSmokingStatus2) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationValueP() {
		OperationsTestCase<CurrentSmokingStatus2> validateSmokingStatusObservationValuePTestCase = new OperationsTestCase<CurrentSmokingStatus2>(
			"validateSmokingStatusObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentSmokingStatus2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(CurrentSmokingStatus2 target) {
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentSmokingStatus2Operations.validateSmokingStatusObservationValueP(
					(CurrentSmokingStatus2) objectToTest, diagnostician, map);
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
		OperationsTestCase<CurrentSmokingStatus2> validateSmokingStatusObservationValueTestCase = new OperationsTestCase<CurrentSmokingStatus2>(
			"validateSmokingStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentSmokingStatus2 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(CurrentSmokingStatus2 target) {
				target.getValues().set(0, DatatypesFactory.eINSTANCE.createCD("449868002", SNOMEDCT_ID));
			}

			@Override
			protected void setDependency(CurrentSmokingStatus2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentSmokingStatus2Operations.validateSmokingStatusObservationValue(
					(CurrentSmokingStatus2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationCodeP() {
		OperationsTestCase<CurrentSmokingStatus2> validateSmokingStatusObservationCodePTestCase = new OperationsTestCase<CurrentSmokingStatus2>(
			"validateSmokingStatusObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentSmokingStatus2 target) {

			}

			@Override
			protected void updateToPass(CurrentSmokingStatus2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentSmokingStatus2Operations.validateSmokingStatusObservationCodeP(
					(CurrentSmokingStatus2) objectToTest, diagnostician, map);
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
		OperationsTestCase<CurrentSmokingStatus2> validateSmokingStatusObservationCodeTestCase = new OperationsTestCase<CurrentSmokingStatus2>(
			"validateSmokingStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentSmokingStatus2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(CurrentSmokingStatus2 target) {
				target.getCode().setCode("229819007");
				target.getCode().setCodeSystem(SNOMEDCT_ID);
			}

			@Override
			protected void setDependency(CurrentSmokingStatus2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentSmokingStatus2Operations.validateSmokingStatusObservationCode(
					(CurrentSmokingStatus2) objectToTest, diagnostician, map);
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
		OperationsTestCase<CurrentSmokingStatus2> validateSmokingStatusObservationEffectiveTimeTestCase = new OperationsTestCase<CurrentSmokingStatus2>(
			"validateSmokingStatusObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentSmokingStatus2 target) {

			}

			@Override
			protected void updateToPass(CurrentSmokingStatus2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentSmokingStatus2Operations.validateSmokingStatusObservationEffectiveTime(
					(CurrentSmokingStatus2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CurrentSmokingStatus2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<CurrentSmokingStatus2> {
		public CurrentSmokingStatus2 create() {
			return ConsolFactory.eINSTANCE.createCurrentSmokingStatus2();
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
	private static class ConstructorTestClass extends CurrentSmokingStatus2Operations {
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

} // CurrentSmokingStatus2Operations
