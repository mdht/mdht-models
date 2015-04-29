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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.operations.PatientPriorityPreferenceOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Priority Preference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferencePriorityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Priority Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferencePriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference CD Code System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientPriorityPreferenceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientPriorityPreferenceTemplateId() {
		OperationsTestCase<PatientPriorityPreference> validatePatientPriorityPreferenceTemplateIdTestCase = new OperationsTestCase<PatientPriorityPreference>(
			"validatePatientPriorityPreferenceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPriorityPreference target) {

			}

			@Override
			protected void updateToPass(PatientPriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceTemplateId(
					(PatientPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePatientPriorityPreferenceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientPriorityPreferenceClassCode() {
		OperationsTestCase<PatientPriorityPreference> validatePatientPriorityPreferenceClassCodeTestCase = new OperationsTestCase<PatientPriorityPreference>(
			"validatePatientPriorityPreferenceClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPriorityPreference target) {

			}

			@Override
			protected void updateToPass(PatientPriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceClassCode(
					(PatientPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePatientPriorityPreferenceClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientPriorityPreferenceMoodCode() {
		OperationsTestCase<PatientPriorityPreference> validatePatientPriorityPreferenceMoodCodeTestCase = new OperationsTestCase<PatientPriorityPreference>(
			"validatePatientPriorityPreferenceMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPriorityPreference target) {

			}

			@Override
			protected void updateToPass(PatientPriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceMoodCode(
					(PatientPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePatientPriorityPreferenceMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientPriorityPreferenceId() {
		OperationsTestCase<PatientPriorityPreference> validatePatientPriorityPreferenceIdTestCase = new OperationsTestCase<PatientPriorityPreference>(
			"validatePatientPriorityPreferenceId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPriorityPreference target) {

			}

			@Override
			protected void updateToPass(PatientPriorityPreference target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceId(
					(PatientPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePatientPriorityPreferenceIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientPriorityPreferenceCodeP() {
		OperationsTestCase<PatientPriorityPreference> validatePatientPriorityPreferenceCodePTestCase = new OperationsTestCase<PatientPriorityPreference>(
			"validatePatientPriorityPreferenceCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPriorityPreference target) {

			}

			@Override
			protected void updateToPass(PatientPriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceCodeP(
					(PatientPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePatientPriorityPreferenceCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientPriorityPreferenceCode() {
		OperationsTestCase<PatientPriorityPreference> validatePatientPriorityPreferenceCodeTestCase = new OperationsTestCase<PatientPriorityPreference>(
			"validatePatientPriorityPreferenceCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPriorityPreference target) {

			}

			@Override
			protected void updateToPass(PatientPriorityPreference target) {
				target.init();

			}

			@Override
			protected void setDependency(PatientPriorityPreference target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreferenceCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceCode(
					(PatientPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePatientPriorityPreferenceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientPriorityPreferencePriorityCodeP() {
		OperationsTestCase<PatientPriorityPreference> validatePatientPriorityPreferencePriorityCodePTestCase = new OperationsTestCase<PatientPriorityPreference>(
			"validatePatientPriorityPreferencePriorityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPriorityPreference target) {

			}

			@Override
			protected void updateToPass(PatientPriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPriorityPreferenceOperations.validatePatientPriorityPreferencePriorityCodeP(
					(PatientPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePatientPriorityPreferencePriorityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientPriorityPreferencePriorityCode() {
		OperationsTestCase<PatientPriorityPreference> validatePatientPriorityPreferencePriorityCodeTestCase = new OperationsTestCase<PatientPriorityPreference>(
			"validatePatientPriorityPreferencePriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPriorityPreference target) {

			}

			@Override
			protected void updateToPass(PatientPriorityPreference target) {
				target.init();
				CE priorityCode = DatatypesFactory.eINSTANCE.createCE();
				priorityCode.setCode("255216001");
				priorityCode.setCodeSystem("2.16.840.1.113883.6.96");
				target.setPriorityCode(priorityCode);
			}

			@Override
			protected void setDependency(PatientPriorityPreference target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreferencePriorityCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPriorityPreferenceOperations.validatePatientPriorityPreferencePriorityCode(
					(PatientPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePatientPriorityPreferencePriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientPriorityPreferenceValue() {
		OperationsTestCase<PatientPriorityPreference> validatePatientPriorityPreferenceValueTestCase = new OperationsTestCase<PatientPriorityPreference>(
			"validatePatientPriorityPreferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPriorityPreference target) {

			}

			@Override
			protected void updateToPass(PatientPriorityPreference target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCode("394849002");
				value.setCodeSystem("2.16.840.1.113883.6.96");
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceValue(
					(PatientPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePatientPriorityPreferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientPriorityPreferenceValueP() {
		OperationsTestCase<PatientPriorityPreference> validatePatientPriorityPreferenceValuePTestCase = new OperationsTestCase<PatientPriorityPreference>(
			"validatePatientPriorityPreferenceValueP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPriorityPreference target) {

			}

			@Override
			protected void updateToPass(PatientPriorityPreference target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceValueP(
					(PatientPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePatientPriorityPreferenceValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientPriorityPreferenceCDCodeSystem() {
		OperationsTestCase<PatientPriorityPreference> validatePatientPriorityPreferenceCDCodeSystemTestCase = new OperationsTestCase<PatientPriorityPreference>(
			"validatePatientPriorityPreferenceCDCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PRIORITY_PREFERENCE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPriorityPreference target) {
				target.init();
			}

			@Override
			protected void updateToPass(PatientPriorityPreference target) {
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCodeSystem(""); // terminology will need 2.16.840.1.113883.5.8 but this check only needs the element to exist
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceCDCodeSystem(
					(PatientPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePatientPriorityPreferenceCDCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientPriorityPreferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientPriorityPreference> {
		@Override
		public PatientPriorityPreference create() {
			return ConsolFactory.eINSTANCE.createPatientPriorityPreference();
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
	private static class ConstructorTestClass extends PatientPriorityPreferenceOperations {
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

} // PatientPriorityPreferenceOperations
