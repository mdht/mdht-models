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
import org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.SubstanceAdministeredActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Administered Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SubstanceAdministeredActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceAdministeredActTemplateId() {
		OperationsTestCase<SubstanceAdministeredAct> validateSubstanceAdministeredActTemplateIdTestCase = new OperationsTestCase<SubstanceAdministeredAct>(
			"validateSubstanceAdministeredActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_ADMINISTERED_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceAdministeredAct target) {

			}

			@Override
			protected void updateToPass(SubstanceAdministeredAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceAdministeredActOperations.validateSubstanceAdministeredActTemplateId(
					(SubstanceAdministeredAct) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceAdministeredActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceAdministeredActClassCode() {
		OperationsTestCase<SubstanceAdministeredAct> validateSubstanceAdministeredActClassCodeTestCase = new OperationsTestCase<SubstanceAdministeredAct>(
			"validateSubstanceAdministeredActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceAdministeredAct target) {

			}

			@Override
			protected void updateToPass(SubstanceAdministeredAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceAdministeredActOperations.validateSubstanceAdministeredActClassCode(
					(SubstanceAdministeredAct) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceAdministeredActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceAdministeredActMoodCode() {
		OperationsTestCase<SubstanceAdministeredAct> validateSubstanceAdministeredActMoodCodeTestCase = new OperationsTestCase<SubstanceAdministeredAct>(
			"validateSubstanceAdministeredActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_ADMINISTERED_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceAdministeredAct target) {

			}

			@Override
			protected void updateToPass(SubstanceAdministeredAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceAdministeredActOperations.validateSubstanceAdministeredActMoodCode(
					(SubstanceAdministeredAct) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceAdministeredActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceAdministeredActId() {
		OperationsTestCase<SubstanceAdministeredAct> validateSubstanceAdministeredActIdTestCase = new OperationsTestCase<SubstanceAdministeredAct>(
			"validateSubstanceAdministeredActId",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_ADMINISTERED_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceAdministeredAct target) {

			}

			@Override
			protected void updateToPass(SubstanceAdministeredAct target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceAdministeredActOperations.validateSubstanceAdministeredActId(
					(SubstanceAdministeredAct) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceAdministeredActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceAdministeredActCodeP() {
		OperationsTestCase<SubstanceAdministeredAct> validateSubstanceAdministeredActCodePTestCase = new OperationsTestCase<SubstanceAdministeredAct>(
			"validateSubstanceAdministeredActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceAdministeredAct target) {

			}

			@Override
			protected void updateToPass(SubstanceAdministeredAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceAdministeredActOperations.validateSubstanceAdministeredActCodeP(
					(SubstanceAdministeredAct) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceAdministeredActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceAdministeredActCode() {
		OperationsTestCase<SubstanceAdministeredAct> validateSubstanceAdministeredActCodeTestCase = new OperationsTestCase<SubstanceAdministeredAct>(
			"validateSubstanceAdministeredActCode",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceAdministeredAct target) {

			}

			@Override
			protected void updateToPass(SubstanceAdministeredAct target) {
				target.init();

			}

			@Override
			protected void setDependency(SubstanceAdministeredAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceAdministeredActOperations.validateSubstanceAdministeredActCode(
					(SubstanceAdministeredAct) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceAdministeredActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceAdministeredActStatusCode() {
		OperationsTestCase<SubstanceAdministeredAct> validateSubstanceAdministeredActStatusCodeTestCase = new OperationsTestCase<SubstanceAdministeredAct>(
			"validateSubstanceAdministeredActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceAdministeredAct target) {

			}

			@Override
			protected void updateToPass(SubstanceAdministeredAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceAdministeredActOperations.validateSubstanceAdministeredActStatusCode(
					(SubstanceAdministeredAct) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceAdministeredActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceAdministeredActStatusCodeP() {
		OperationsTestCase<SubstanceAdministeredAct> validateSubstanceAdministeredActStatusCodePTestCase = new OperationsTestCase<SubstanceAdministeredAct>(
			"validateSubstanceAdministeredActStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceAdministeredAct target) {

			}

			@Override
			protected void updateToPass(SubstanceAdministeredAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceAdministeredActOperations.validateSubstanceAdministeredActStatusCodeP(
					(SubstanceAdministeredAct) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceAdministeredActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceAdministeredActEffectiveTime() {
		OperationsTestCase<SubstanceAdministeredAct> validateSubstanceAdministeredActEffectiveTimeTestCase = new OperationsTestCase<SubstanceAdministeredAct>(
			"validateSubstanceAdministeredActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_ADMINISTERED_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceAdministeredAct target) {

			}

			@Override
			protected void updateToPass(SubstanceAdministeredAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceAdministeredActOperations.validateSubstanceAdministeredActEffectiveTime(
					(SubstanceAdministeredAct) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceAdministeredActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SubstanceAdministeredActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SubstanceAdministeredAct> {
		@Override
		public SubstanceAdministeredAct create() {
			return ConsolFactory.eINSTANCE.createSubstanceAdministeredAct();
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
	private static class ConstructorTestClass extends SubstanceAdministeredActOperations {
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

} // SubstanceAdministeredActOperations
