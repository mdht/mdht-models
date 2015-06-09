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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.operations.PriorityPreferenceOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Priority Preference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Author Participation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PriorityPreferenceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorityPreferenceTemplateId() {
		OperationsTestCase<PriorityPreference> validatePriorityPreferenceTemplateIdTestCase = new OperationsTestCase<PriorityPreference>(
			"validatePriorityPreferenceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorityPreference target) {

			}

			@Override
			protected void updateToPass(PriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorityPreferenceOperations.validatePriorityPreferenceTemplateId(
					(PriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePriorityPreferenceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorityPreferenceClassCode() {
		OperationsTestCase<PriorityPreference> validatePriorityPreferenceClassCodeTestCase = new OperationsTestCase<PriorityPreference>(
			"validatePriorityPreferenceClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorityPreference target) {

			}

			@Override
			protected void updateToPass(PriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorityPreferenceOperations.validatePriorityPreferenceClassCode(
					(PriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePriorityPreferenceClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorityPreferenceMoodCode() {
		OperationsTestCase<PriorityPreference> validatePriorityPreferenceMoodCodeTestCase = new OperationsTestCase<PriorityPreference>(
			"validatePriorityPreferenceMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorityPreference target) {

			}

			@Override
			protected void updateToPass(PriorityPreference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorityPreferenceOperations.validatePriorityPreferenceMoodCode(
					(PriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePriorityPreferenceMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePriorityPreferenceId() {
		OperationsTestCase<PriorityPreference> validatePriorityPreferenceIdTestCase = new OperationsTestCase<PriorityPreference>(
			"validatePriorityPreferenceId",
			operationsForOCL.getOCLValue("VALIDATE_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorityPreference target) {

			}

			@Override
			protected void updateToPass(PriorityPreference target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorityPreferenceOperations.validatePriorityPreferenceId(
					(PriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePriorityPreferenceIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePriorityPreferenceCodeP() {
		OperationsTestCase<PriorityPreference> validatePriorityPreferenceCodePTestCase = new OperationsTestCase<PriorityPreference>(
			"validatePriorityPreferenceCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorityPreference target) {
				target.init();
				target.setCode(null);
			}

			@Override
			protected void updateToPass(PriorityPreference target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorityPreferenceOperations.validatePriorityPreferenceCodeP(
					(PriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePriorityPreferenceCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePriorityPreferenceCode() {
		OperationsTestCase<PriorityPreference> validatePriorityPreferenceCodeTestCase = new OperationsTestCase<PriorityPreference>(
			"validatePriorityPreferenceCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorityPreference target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(PriorityPreference target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("225773000", SNOMEDCT_ID));
			}

			@Override
			protected void setDependency(PriorityPreference target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PriorityPreferenceCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorityPreferenceOperations.validatePriorityPreferenceCode(
					(PriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePriorityPreferenceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorityPreferenceEffectiveTime() {
		OperationsTestCase<PriorityPreference> validatePriorityPreferenceEffectiveTimeTestCase = new OperationsTestCase<PriorityPreference>(
			"validatePriorityPreferenceEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PRIORITY_PREFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorityPreference target) {

			}

			@Override
			protected void updateToPass(PriorityPreference target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorityPreferenceOperations.validatePriorityPreferenceEffectiveTime(
					(PriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePriorityPreferenceEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePriorityPreferenceValue() {
		OperationsTestCase<PriorityPreference> validatePriorityPreferenceValueTestCase = new OperationsTestCase<PriorityPreference>(
			"validatePriorityPreferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorityPreference target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(PriorityPreference target) {
				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD("394849002", SNOMEDCT_ID);
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorityPreferenceOperations.validatePriorityPreferenceValue(
					(PriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePriorityPreferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePriorityPreferenceValueP() {
		OperationsTestCase<PriorityPreference> validatePriorityPreferenceValuePTestCase = new OperationsTestCase<PriorityPreference>(
			"validatePriorityPreferenceValueP",
			operationsForOCL.getOCLValue("VALIDATE_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorityPreference target) {

			}

			@Override
			protected void updateToPass(PriorityPreference target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorityPreferenceOperations.validatePriorityPreferenceValueP(
					(PriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePriorityPreferenceValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePriorityPreferenceAuthorParticipation() {
		OperationsTestCase<PriorityPreference> validatePriorityPreferenceAuthorParticipationTestCase = new OperationsTestCase<PriorityPreference>(
			"validatePriorityPreferenceAuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorityPreference target) {
				target.init();
			}

			@Override
			protected void updateToPass(PriorityPreference target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorityPreferenceOperations.validatePriorityPreferenceAuthorParticipation(
					(PriorityPreference) objectToTest, diagnostician, map);
			}

		};

		validatePriorityPreferenceAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PriorityPreferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PriorityPreference> {
		public PriorityPreference create() {
			return ConsolFactory.eINSTANCE.createPriorityPreference();
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
	private static class ConstructorTestClass extends PriorityPreferenceOperations {
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

} // PriorityPreferenceOperations
