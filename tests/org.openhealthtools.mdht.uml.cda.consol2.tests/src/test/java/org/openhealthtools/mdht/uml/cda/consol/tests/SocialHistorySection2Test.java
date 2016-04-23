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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistorySection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2CaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2CulturalAndReligiousObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Cultural And Religious Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2CharacteristicsOfHomeEnvironment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Characteristics Of Home Environment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getConsolSocialHistoryObservation2s() <em>Get Consol Social History Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getConsolCurrentSmokingStatus2s() <em>Get Consol Current Smoking Status2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getConsolTobaccoUse2s() <em>Get Consol Tobacco Use2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getCulturalAndReligiousObservations() <em>Get Cultural And Religious Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getCharacteristicsOfHomeEnvironments() <em>Get Characteristics Of Home Environments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionSocialHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Social History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionTobaccoUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Tobacco Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistorySection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySection2CaregiverCharacteristics() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2CaregiverCharacteristicsTestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2CaregiverCharacteristics",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createCaregiverCharacteristics().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2CaregiverCharacteristics(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2CaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySection2CulturalAndReligiousObservation() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2CulturalAndReligiousObservationTestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2CulturalAndReligiousObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createCulturalAndReligiousObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2CulturalAndReligiousObservation(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2CulturalAndReligiousObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySection2CharacteristicsOfHomeEnvironment() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2CharacteristicsOfHomeEnvironmentTestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2CharacteristicsOfHomeEnvironment",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createCharacteristicsOfHomeEnvironment().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2CharacteristicsOfHomeEnvironment(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2CharacteristicsOfHomeEnvironmentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolSocialHistoryObservation2s() {

		SocialHistorySection2 target = objectFactory.create();
		target.getConsolSocialHistoryObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolCurrentSmokingStatus2s() {

		SocialHistorySection2 target = objectFactory.create();
		target.getConsolCurrentSmokingStatus2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolTobaccoUse2s() {

		SocialHistorySection2 target = objectFactory.create();
		target.getConsolTobaccoUse2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaregiverCharacteristicss() {

		SocialHistorySection2 target = objectFactory.create();
		target.getCaregiverCharacteristicss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCulturalAndReligiousObservations() {

		SocialHistorySection2 target = objectFactory.create();
		target.getCulturalAndReligiousObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCharacteristicsOfHomeEnvironments() {

		SocialHistorySection2 target = objectFactory.create();
		target.getCharacteristicsOfHomeEnvironments();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionTemplateId() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySectionTemplateId(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionCodeP() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySectionCodePTestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySectionCodeP(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionCode() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySectionCodeTestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(SocialHistorySection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SocialHistorySectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySectionCode(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySectionSocialHistoryObservation() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySectionSocialHistoryObservationTestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySectionSocialHistoryObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createSocialHistoryObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySectionSocialHistoryObservation(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionSocialHistoryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySectionSmokingStatusObservation() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySectionSmokingStatusObservationTestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySectionSmokingStatusObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createSmokingStatusMeaningfulUse2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySectionSmokingStatusObservation(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionSmokingStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySectionTobaccoUse() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySectionTobaccoUseTestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySectionTobaccoUse",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createTobaccoUse2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySectionTobaccoUse(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTobaccoUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SocialHistorySection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<SocialHistorySection2> {
		@Override
		public SocialHistorySection2 create() {
			return ConsolFactory.eINSTANCE.createSocialHistorySection2();
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
	private static class ConstructorTestClass extends SocialHistorySection2Operations {
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

} // SocialHistorySection2Operations
