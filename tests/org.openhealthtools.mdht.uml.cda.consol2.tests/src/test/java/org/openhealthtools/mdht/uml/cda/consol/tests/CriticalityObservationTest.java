/*******************************************************************************
 * Copyright (c) 2016 Dan Brown and others.
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.CriticalityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.CriticalityObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Criticality Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CriticalityObservation#validateCriticalityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criticality Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CriticalityObservation#validateCriticalityObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criticality Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CriticalityObservation#validateCriticalityObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criticality Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CriticalityObservation#validateCriticalityObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criticality Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CriticalityObservation#validateCriticalityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criticality Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CriticalityObservation#validateCriticalityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criticality Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CriticalityObservation#validateCriticalityObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criticality Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CriticalityObservation#validateCriticalityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criticality Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CriticalityObservation#validateCriticalityObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criticality Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CriticalityObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCriticalityObservationTemplateId() {
		OperationsTestCase<CriticalityObservation> validateCriticalityObservationTemplateIdTestCase = new OperationsTestCase<CriticalityObservation>(
			"validateCriticalityObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_CRITICALITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CriticalityObservation target) {

			}

			@Override
			protected void updateToPass(CriticalityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CriticalityObservationOperations.validateCriticalityObservationTemplateId(
					(CriticalityObservation) objectToTest, diagnostician, map);
			}

		};

		validateCriticalityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCriticalityObservationClassCode() {
		OperationsTestCase<CriticalityObservation> validateCriticalityObservationClassCodeTestCase = new OperationsTestCase<CriticalityObservation>(
			"validateCriticalityObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CRITICALITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CriticalityObservation target) {

			}

			@Override
			protected void updateToPass(CriticalityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CriticalityObservationOperations.validateCriticalityObservationClassCode(
					(CriticalityObservation) objectToTest, diagnostician, map);
			}

		};

		validateCriticalityObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCriticalityObservationMoodCode() {
		OperationsTestCase<CriticalityObservation> validateCriticalityObservationMoodCodeTestCase = new OperationsTestCase<CriticalityObservation>(
			"validateCriticalityObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CRITICALITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CriticalityObservation target) {

			}

			@Override
			protected void updateToPass(CriticalityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CriticalityObservationOperations.validateCriticalityObservationMoodCode(
					(CriticalityObservation) objectToTest, diagnostician, map);
			}

		};

		validateCriticalityObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCriticalityObservationCodeP() {
		OperationsTestCase<CriticalityObservation> validateCriticalityObservationCodePTestCase = new OperationsTestCase<CriticalityObservation>(
			"validateCriticalityObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CRITICALITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CriticalityObservation target) {

			}

			@Override
			protected void updateToPass(CriticalityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CriticalityObservationOperations.validateCriticalityObservationCodeP(
					(CriticalityObservation) objectToTest, diagnostician, map);
			}

		};

		validateCriticalityObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCriticalityObservationCode() {
		OperationsTestCase<CriticalityObservation> validateCriticalityObservationCodeTestCase = new OperationsTestCase<CriticalityObservation>(
			"validateCriticalityObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_CRITICALITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				// code element with no attributes
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(CriticalityObservation target) {
						target.init();
						CD cd = DatatypesFactory.eINSTANCE.createCD();
						target.setCode(cd);
					}
				});

				// code element with incorrect code and codeSystem
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(CriticalityObservation target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, BAD_CODESYSTEM_ID));
					}
				});

				// code element with incorrect code but correct codeSystem
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(CriticalityObservation target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, LOINC_ID));
					}
				});

				// code element with correct code but incorrect codeSystem
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(CriticalityObservation target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("82606-5", BAD_CODESYSTEM_ID));
					}
				});
			}

			// code element with correct code and codeSystem
			@Override
			protected void updateToPass(CriticalityObservation target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD("82606-5", LOINC_ID));
			}

			@Override
			protected void setDependency(CriticalityObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CriticalityObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CriticalityObservationOperations.validateCriticalityObservationCode(
					(CriticalityObservation) objectToTest, diagnostician, map);
			}

		};

		validateCriticalityObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCriticalityObservationStatusCode() {
		OperationsTestCase<CriticalityObservation> validateCriticalityObservationStatusCodeTestCase = new OperationsTestCase<CriticalityObservation>(
			"validateCriticalityObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_CRITICALITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CriticalityObservation target) {

			}

			@Override
			protected void updateToPass(CriticalityObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CriticalityObservationOperations.validateCriticalityObservationStatusCode(
					(CriticalityObservation) objectToTest, diagnostician, map);
			}

		};

		validateCriticalityObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCriticalityObservationStatusCodeP() {
		OperationsTestCase<CriticalityObservation> validateCriticalityObservationStatusCodePTestCase = new OperationsTestCase<CriticalityObservation>(
			"validateCriticalityObservationStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_CRITICALITY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CriticalityObservation target) {

			}

			@Override
			protected void updateToPass(CriticalityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CriticalityObservationOperations.validateCriticalityObservationStatusCodeP(
					(CriticalityObservation) objectToTest, diagnostician, map);
			}

		};

		validateCriticalityObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCriticalityObservationValue() {
		OperationsTestCase<CriticalityObservation> validateCriticalityObservationValueTestCase = new OperationsTestCase<CriticalityObservation>(
			"validateCriticalityObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_CRITICALITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			private static final String OBSERVATION_VALUE_CS = "2.16.840.1.113883.5.1063";

			private final List<String> CRITICALITY_OBSERVATION_CODES = new ArrayList<>(
				Arrays.asList("CRITL", "CRITH", "CRITU"));

			@Override
			public void addFailTests() {

				// value element with no attributes
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(CriticalityObservation target) {
						target.init();
						CD cd = DatatypesFactory.eINSTANCE.createCD();
						target.getValues().add(cd);
					}
				});

				// value element with incorrect code and codeSystem
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(CriticalityObservation target) {
						target.init();
						CD cd = DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, BAD_CODESYSTEM_ID);
						target.getValues().add(cd);
					}
				});

				// value element with incorrect code but correct codeSystem
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(CriticalityObservation target) {
						target.init();
						CD cd = DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, OBSERVATION_VALUE_CS);
						target.getValues().add(cd);
					}
				});

				// value element with correct code but incorrect codeSystem
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(CriticalityObservation target) {
						target.init();
						CD cd = DatatypesFactory.eINSTANCE.createCD(
							CRITICALITY_OBSERVATION_CODES.get(0), BAD_CODESYSTEM_ID);
						target.getValues().add(cd);
					}
				});
			}

			// value element with correct code and codeSystem
			@Override
			public void addPassTests() {
				for (final String curCode : CRITICALITY_OBSERVATION_CODES) {
					addPassTest(new PassTest() {
						@Override
						public void updateToPass(CriticalityObservation target) {
							target.init();
							CD cd = DatatypesFactory.eINSTANCE.createCD(curCode, OBSERVATION_VALUE_CS);
							target.getValues().add(cd);
						}
					});
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CriticalityObservationOperations.validateCriticalityObservationValue(
					(CriticalityObservation) objectToTest, diagnostician, map);
			}

		};

		validateCriticalityObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCriticalityObservationValueP() {
		OperationsTestCase<CriticalityObservation> validateCriticalityObservationValuePTestCase = new OperationsTestCase<CriticalityObservation>(
			"validateCriticalityObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_CRITICALITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CriticalityObservation target) {
			}

			@Override
			protected void updateToPass(CriticalityObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CriticalityObservationOperations.validateCriticalityObservationValueP(
					(CriticalityObservation) objectToTest, diagnostician, map);
			}

		};

		validateCriticalityObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CriticalityObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CriticalityObservation> {
		public CriticalityObservation create() {
			return ConsolFactory.eINSTANCE.createCriticalityObservation();
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
	private static class ConstructorTestClass extends CriticalityObservationOperations {
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

} // CriticalityObservationOperations
