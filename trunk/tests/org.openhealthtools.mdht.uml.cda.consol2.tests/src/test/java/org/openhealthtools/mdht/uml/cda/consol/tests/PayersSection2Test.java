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
import org.openhealthtools.mdht.uml.cda.consol.PayersSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PayersSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Payers Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection2#validatePayersSectionCoverageActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Coverage Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection2#getConsolCoverageActivity2s() <em>Get Consol Coverage Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection2#validatePayersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection2#validatePayersSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection2#validatePayersSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PayersSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePayersSectionCoverageActivity2() {
		OperationsTestCase<PayersSection2> validatePayersSectionCoverageActivity2TestCase = new OperationsTestCase<PayersSection2>(
			"validatePayersSectionCoverageActivity2",
			operationsForOCL.getOCLValue("VALIDATE_PAYERS_SECTION_COVERAGE_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PayersSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PayersSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createCoverageActivity2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSection2Operations.validatePayersSectionCoverageActivity2(
					(PayersSection2) objectToTest, diagnostician, map);
			}

		};

		validatePayersSectionCoverageActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolCoverageActivity2s() {

		PayersSection2 target = objectFactory.create();
		target.getConsolCoverageActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayersSectionTemplateId() {
		OperationsTestCase<PayersSection2> validatePayersSectionTemplateIdTestCase = new OperationsTestCase<PayersSection2>(
			"validatePayersSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PayersSection2 target) {

			}

			@Override
			protected void updateToPass(PayersSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSection2Operations.validatePayersSectionTemplateId(
					(PayersSection2) objectToTest, diagnostician, map);
			}

		};

		validatePayersSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayersSectionCodeP() {
		OperationsTestCase<PayersSection2> validatePayersSectionCodePTestCase = new OperationsTestCase<PayersSection2>(
			"validatePayersSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PAYERS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PayersSection2 target) {

			}

			@Override
			protected void updateToPass(PayersSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSection2Operations.validatePayersSectionCodeP(
					(PayersSection2) objectToTest, diagnostician, map);
			}

		};

		validatePayersSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayersSectionCode() {
		OperationsTestCase<PayersSection2> validatePayersSectionCodeTestCase = new OperationsTestCase<PayersSection2>(
			"validatePayersSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PayersSection2 target) {

			}

			@Override
			protected void updateToPass(PayersSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PayersSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PayersSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSection2Operations.validatePayersSectionCode(
					(PayersSection2) objectToTest, diagnostician, map);
			}

		};

		validatePayersSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PayersSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PayersSection2> {
		@Override
		public PayersSection2 create() {
			return ConsolFactory.eINSTANCE.createPayersSection2();
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
	private static class ConstructorTestClass extends PayersSection2Operations {
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

} // PayersSection2Operations
