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
import org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities;
import org.openhealthtools.mdht.uml.cda.consol.operations.SelfCareActivitiesOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Self Care Activities</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SelfCareActivitiesTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSelfCareActivitiesTemplateId() {
		OperationsTestCase<SelfCareActivities> validateSelfCareActivitiesTemplateIdTestCase = new OperationsTestCase<SelfCareActivities>(
			"validateSelfCareActivitiesTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SELF_CARE_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SelfCareActivities target) {

			}

			@Override
			protected void updateToPass(SelfCareActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SelfCareActivitiesOperations.validateSelfCareActivitiesTemplateId(
					(SelfCareActivities) objectToTest, diagnostician, map);
			}

		};

		validateSelfCareActivitiesTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSelfCareActivitiesClassCode() {
		OperationsTestCase<SelfCareActivities> validateSelfCareActivitiesClassCodeTestCase = new OperationsTestCase<SelfCareActivities>(
			"validateSelfCareActivitiesClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SELF_CARE_ACTIVITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SelfCareActivities target) {

			}

			@Override
			protected void updateToPass(SelfCareActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SelfCareActivitiesOperations.validateSelfCareActivitiesClassCode(
					(SelfCareActivities) objectToTest, diagnostician, map);
			}

		};

		validateSelfCareActivitiesClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSelfCareActivitiesMoodCode() {
		OperationsTestCase<SelfCareActivities> validateSelfCareActivitiesMoodCodeTestCase = new OperationsTestCase<SelfCareActivities>(
			"validateSelfCareActivitiesMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SELF_CARE_ACTIVITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SelfCareActivities target) {

			}

			@Override
			protected void updateToPass(SelfCareActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SelfCareActivitiesOperations.validateSelfCareActivitiesMoodCode(
					(SelfCareActivities) objectToTest, diagnostician, map);
			}

		};

		validateSelfCareActivitiesMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSelfCareActivitiesCodeP() {
		OperationsTestCase<SelfCareActivities> validateSelfCareActivitiesCodePTestCase = new OperationsTestCase<SelfCareActivities>(
			"validateSelfCareActivitiesCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SELF_CARE_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SelfCareActivities target) {

			}

			@Override
			protected void updateToPass(SelfCareActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SelfCareActivitiesOperations.validateSelfCareActivitiesCodeP(
					(SelfCareActivities) objectToTest, diagnostician, map);
			}

		};

		validateSelfCareActivitiesCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSelfCareActivitiesCode() {
		OperationsTestCase<SelfCareActivities> validateSelfCareActivitiesCodeTestCase = new OperationsTestCase<SelfCareActivities>(
			"validateSelfCareActivitiesCode",
			operationsForOCL.getOCLValue("VALIDATE_SELF_CARE_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SelfCareActivities target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(code);
			}

			@Override
			protected void updateToPass(SelfCareActivities target) {
				CD code = DatatypesFactory.eINSTANCE.createCD("46008-9", LOINC_ID);
				target.setCode(code);
			}

			@Override
			protected void setDependency(SelfCareActivities target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SelfCareActivitiesCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SelfCareActivitiesOperations.validateSelfCareActivitiesCode(
					(SelfCareActivities) objectToTest, diagnostician, map);
			}

		};

		validateSelfCareActivitiesCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSelfCareActivitiesValue() {
		OperationsTestCase<SelfCareActivities> validateSelfCareActivitiesValueTestCase = new OperationsTestCase<SelfCareActivities>(
			"validateSelfCareActivitiesValue",
			operationsForOCL.getOCLValue("VALIDATE_SELF_CARE_ACTIVITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SelfCareActivities target) {
				CD val = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(val);
			}

			@Override
			protected void updateToPass(SelfCareActivities target) {
				target.getValues().clear();
				CD val = DatatypesFactory.eINSTANCE.createCD("371153006", SNOMEDCT_ID);
				target.getValues().add(val);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SelfCareActivitiesOperations.validateSelfCareActivitiesValue(
					(SelfCareActivities) objectToTest, diagnostician, map);
			}

		};

		validateSelfCareActivitiesValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSelfCareActivitiesValueP() {
		OperationsTestCase<SelfCareActivities> validateSelfCareActivitiesValuePTestCase = new OperationsTestCase<SelfCareActivities>(
			"validateSelfCareActivitiesValueP",
			operationsForOCL.getOCLValue("VALIDATE_SELF_CARE_ACTIVITIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SelfCareActivities target) {

			}

			@Override
			protected void updateToPass(SelfCareActivities target) {
				target.init();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(val);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SelfCareActivitiesOperations.validateSelfCareActivitiesValueP(
					(SelfCareActivities) objectToTest, diagnostician, map);
			}

		};

		validateSelfCareActivitiesValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SelfCareActivitiesOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SelfCareActivities> {
		public SelfCareActivities create() {
			return ConsolFactory.eINSTANCE.createSelfCareActivities();
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
	private static class ConstructorTestClass extends SelfCareActivitiesOperations {
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

} // SelfCareActivitiesOperations
