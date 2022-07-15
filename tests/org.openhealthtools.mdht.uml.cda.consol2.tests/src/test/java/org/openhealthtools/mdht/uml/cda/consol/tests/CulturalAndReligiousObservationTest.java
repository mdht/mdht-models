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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.CulturalAndReligiousObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cultural And Religious Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationValueOfTypeCDIsFromSnomed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Value Of Type CD Is From Snomed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation#validateCulturalAndReligiousObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cultural And Religious Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CulturalAndReligiousObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCulturalAndReligiousObservationValueOfTypeCDIsFromSnomed() {
		OperationsTestCase<CulturalAndReligiousObservation> validateCulturalAndReligiousObservationValueOfTypeCDIsFromSnomedTestCase = new OperationsTestCase<CulturalAndReligiousObservation>(
			"validateCulturalAndReligiousObservationValueOfTypeCDIsFromSnomed",
			operationsForOCL.getOCLValue(
				"VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_VALUE_OF_TYPE_CD_IS_FROM_SNOMED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CulturalAndReligiousObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(CulturalAndReligiousObservation target) {
				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("hasCode", SNOMEDCT_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationValueOfTypeCDIsFromSnomed(
					(CulturalAndReligiousObservation) objectToTest, diagnostician, map);
			}

		};

		validateCulturalAndReligiousObservationValueOfTypeCDIsFromSnomedTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCulturalAndReligiousObservationTemplateId() {
		OperationsTestCase<CulturalAndReligiousObservation> validateCulturalAndReligiousObservationTemplateIdTestCase = new OperationsTestCase<CulturalAndReligiousObservation>(
			"validateCulturalAndReligiousObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CulturalAndReligiousObservation target) {

			}

			@Override
			protected void updateToPass(CulturalAndReligiousObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationTemplateId(
					(CulturalAndReligiousObservation) objectToTest, diagnostician, map);
			}

		};

		validateCulturalAndReligiousObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCulturalAndReligiousObservationClassCode() {
		OperationsTestCase<CulturalAndReligiousObservation> validateCulturalAndReligiousObservationClassCodeTestCase = new OperationsTestCase<CulturalAndReligiousObservation>(
			"validateCulturalAndReligiousObservationClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CulturalAndReligiousObservation target) {

			}

			@Override
			protected void updateToPass(CulturalAndReligiousObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationClassCode(
					(CulturalAndReligiousObservation) objectToTest, diagnostician, map);
			}

		};

		validateCulturalAndReligiousObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCulturalAndReligiousObservationMoodCode() {
		OperationsTestCase<CulturalAndReligiousObservation> validateCulturalAndReligiousObservationMoodCodeTestCase = new OperationsTestCase<CulturalAndReligiousObservation>(
			"validateCulturalAndReligiousObservationMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CulturalAndReligiousObservation target) {

			}

			@Override
			protected void updateToPass(CulturalAndReligiousObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationMoodCode(
					(CulturalAndReligiousObservation) objectToTest, diagnostician, map);
			}

		};

		validateCulturalAndReligiousObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCulturalAndReligiousObservationId() {
		OperationsTestCase<CulturalAndReligiousObservation> validateCulturalAndReligiousObservationIdTestCase = new OperationsTestCase<CulturalAndReligiousObservation>(
			"validateCulturalAndReligiousObservationId", operationsForOCL.getOCLValue(
				"VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CulturalAndReligiousObservation target) {

			}

			@Override
			protected void updateToPass(CulturalAndReligiousObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationId(
					(CulturalAndReligiousObservation) objectToTest, diagnostician, map);
			}

		};

		validateCulturalAndReligiousObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCulturalAndReligiousObservationCodeP() {
		OperationsTestCase<CulturalAndReligiousObservation> validateCulturalAndReligiousObservationCodePTestCase = new OperationsTestCase<CulturalAndReligiousObservation>(
			"validateCulturalAndReligiousObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CulturalAndReligiousObservation target) {

			}

			@Override
			protected void updateToPass(CulturalAndReligiousObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationCodeP(
					(CulturalAndReligiousObservation) objectToTest, diagnostician, map);
			}

		};

		validateCulturalAndReligiousObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCulturalAndReligiousObservationCode() {
		OperationsTestCase<CulturalAndReligiousObservation> validateCulturalAndReligiousObservationCodeTestCase = new OperationsTestCase<CulturalAndReligiousObservation>(
			"validateCulturalAndReligiousObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CulturalAndReligiousObservation target) {

			}

			@Override
			protected void updateToPass(CulturalAndReligiousObservation target) {
				target.init();
				CD codeCD = DatatypesFactory.eINSTANCE.createCD();
				codeCD.setCode("75281-6");
				codeCD.setCodeSystem(LOINC_ID);
				target.setCode(codeCD);
			}

			@Override
			protected void setDependency(CulturalAndReligiousObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationCode(
					(CulturalAndReligiousObservation) objectToTest, diagnostician, map);
			}

		};

		validateCulturalAndReligiousObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCulturalAndReligiousObservationStatusCode() {
		OperationsTestCase<CulturalAndReligiousObservation> validateCulturalAndReligiousObservationStatusCodeTestCase = new OperationsTestCase<CulturalAndReligiousObservation>(
			"validateCulturalAndReligiousObservationStatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CulturalAndReligiousObservation target) {

			}

			@Override
			protected void updateToPass(CulturalAndReligiousObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationStatusCode(
					(CulturalAndReligiousObservation) objectToTest, diagnostician, map);
			}

		};

		validateCulturalAndReligiousObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCulturalAndReligiousObservationStatusCodeP() {
		OperationsTestCase<CulturalAndReligiousObservation> validateCulturalAndReligiousObservationStatusCodePTestCase = new OperationsTestCase<CulturalAndReligiousObservation>(
			"validateCulturalAndReligiousObservationStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CulturalAndReligiousObservation target) {

			}

			@Override
			protected void updateToPass(CulturalAndReligiousObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationStatusCodeP(
					(CulturalAndReligiousObservation) objectToTest, diagnostician, map);
			}

		};

		validateCulturalAndReligiousObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCulturalAndReligiousObservationValue() {
		OperationsTestCase<CulturalAndReligiousObservation> validateCulturalAndReligiousObservationValueTestCase = new OperationsTestCase<CulturalAndReligiousObservation>(
			"validateCulturalAndReligiousObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_CULTURAL_AND_RELIGIOUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CulturalAndReligiousObservation target) {

			}

			@Override
			protected void updateToPass(CulturalAndReligiousObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationValue(
					(CulturalAndReligiousObservation) objectToTest, diagnostician, map);
			}

		};

		validateCulturalAndReligiousObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CulturalAndReligiousObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CulturalAndReligiousObservation> {
		@Override
		public CulturalAndReligiousObservation create() {
			return ConsolFactory.eINSTANCE.createCulturalAndReligiousObservation();
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
	private static class ConstructorTestClass extends CulturalAndReligiousObservationOperations {
	}

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

} // CulturalAndReligiousObservationOperations
