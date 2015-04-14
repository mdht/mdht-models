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
import org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProviderPriorityPreferenceOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provider Priority Preference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferencePriorityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Priority Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferencePriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Author Participation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProviderPriorityPreferenceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderPriorityPreferenceTemplateId() {
		OperationsTestCase<ProviderPriorityPreference> validateProviderPriorityPreferenceTemplateIdTestCase = new OperationsTestCase<ProviderPriorityPreference>(
			"validateProviderPriorityPreferenceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPriorityPreference target) {

			}

			@Override
			protected void updateToPass(ProviderPriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceTemplateId(
					(ProviderPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validateProviderPriorityPreferenceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderPriorityPreferenceClassCode() {
		OperationsTestCase<ProviderPriorityPreference> validateProviderPriorityPreferenceClassCodeTestCase = new OperationsTestCase<ProviderPriorityPreference>(
			"validateProviderPriorityPreferenceClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPriorityPreference target) {

			}

			@Override
			protected void updateToPass(ProviderPriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceClassCode(
					(ProviderPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validateProviderPriorityPreferenceClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderPriorityPreferenceMoodCode() {
		OperationsTestCase<ProviderPriorityPreference> validateProviderPriorityPreferenceMoodCodeTestCase = new OperationsTestCase<ProviderPriorityPreference>(
			"validateProviderPriorityPreferenceMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPriorityPreference target) {

			}

			@Override
			protected void updateToPass(ProviderPriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceMoodCode(
					(ProviderPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validateProviderPriorityPreferenceMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProviderPriorityPreferenceId() {
		OperationsTestCase<ProviderPriorityPreference> validateProviderPriorityPreferenceIdTestCase = new OperationsTestCase<ProviderPriorityPreference>(
			"validateProviderPriorityPreferenceId",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPriorityPreference target) {

			}

			@Override
			protected void updateToPass(ProviderPriorityPreference target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceId(
					(ProviderPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validateProviderPriorityPreferenceIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderPriorityPreferenceCodeP() {
		OperationsTestCase<ProviderPriorityPreference> validateProviderPriorityPreferenceCodePTestCase = new OperationsTestCase<ProviderPriorityPreference>(
			"validateProviderPriorityPreferenceCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPriorityPreference target) {

			}

			@Override
			protected void updateToPass(ProviderPriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceCodeP(
					(ProviderPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validateProviderPriorityPreferenceCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderPriorityPreferenceCode() {
		OperationsTestCase<ProviderPriorityPreference> validateProviderPriorityPreferenceCodeTestCase = new OperationsTestCase<ProviderPriorityPreference>(
			"validateProviderPriorityPreferenceCode",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPriorityPreference target) {

			}

			@Override
			protected void updateToPass(ProviderPriorityPreference target) {
				target.init();

			}

			@Override
			protected void setDependency(ProviderPriorityPreference target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreferenceCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceCode(
					(ProviderPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validateProviderPriorityPreferenceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderPriorityPreferencePriorityCodeP() {
		OperationsTestCase<ProviderPriorityPreference> validateProviderPriorityPreferencePriorityCodePTestCase = new OperationsTestCase<ProviderPriorityPreference>(
			"validateProviderPriorityPreferencePriorityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPriorityPreference target) {

			}

			@Override
			protected void updateToPass(ProviderPriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferencePriorityCodeP(
					(ProviderPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validateProviderPriorityPreferencePriorityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProviderPriorityPreferencePriorityCode() {
		OperationsTestCase<ProviderPriorityPreference> validateProviderPriorityPreferencePriorityCodeTestCase = new OperationsTestCase<ProviderPriorityPreference>(
			"validateProviderPriorityPreferencePriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPriorityPreference target) {
				target.init();
				CE pc = DatatypesFactory.eINSTANCE.createCE();
				target.setPriorityCode(pc);
			}

			@Override
			protected void updateToPass(ProviderPriorityPreference target) {
				target.getPriorityCode().setCode("255216001");
				target.getPriorityCode().setCodeSystem(SNOMEDCT_ID);
			}

			@Override
			protected void setDependency(ProviderPriorityPreference target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreferencePriorityCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferencePriorityCode(
					(ProviderPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validateProviderPriorityPreferencePriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProviderPriorityPreferenceValue() {
		OperationsTestCase<ProviderPriorityPreference> validateProviderPriorityPreferenceValueTestCase = new OperationsTestCase<ProviderPriorityPreference>(
			"validateProviderPriorityPreferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPriorityPreference target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(ProviderPriorityPreference target) {
				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD("394849002", SNOMEDCT_ID);
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceValue(
					(ProviderPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validateProviderPriorityPreferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProviderPriorityPreferenceValueP() {
		OperationsTestCase<ProviderPriorityPreference> validateProviderPriorityPreferenceValuePTestCase = new OperationsTestCase<ProviderPriorityPreference>(
			"validateProviderPriorityPreferenceValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPriorityPreference target) {

			}

			@Override
			protected void updateToPass(ProviderPriorityPreference target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceValueP(
					(ProviderPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validateProviderPriorityPreferenceValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProviderPriorityPreferenceAuthorParticipation() {
		OperationsTestCase<ProviderPriorityPreference> validateProviderPriorityPreferenceAuthorParticipationTestCase = new OperationsTestCase<ProviderPriorityPreference>(
			"validateProviderPriorityPreferenceAuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPriorityPreference target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProviderPriorityPreference target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPriorityPreferenceOperations.validateProviderPriorityPreferenceAuthorParticipation(
					(ProviderPriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validateProviderPriorityPreferenceAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProviderPriorityPreferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProviderPriorityPreference> {
		@Override
		public ProviderPriorityPreference create() {
			return ConsolFactory.eINSTANCE.createProviderPriorityPreference();
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
	private static class ConstructorTestClass extends ProviderPriorityPreferenceOperations {
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

} // ProviderPriorityPreferenceOperations
