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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PreconditionForSubstanceAdministration2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Precondition For Substance Administration2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2#validatePreconditionForSubstanceAdministration2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2#validatePreconditionForSubstanceAdministrationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2#validatePreconditionForSubstanceAdministrationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2#validatePreconditionForSubstanceAdministrationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2#validatePreconditionForSubstanceAdministrationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2#validatePreconditionForSubstanceAdministrationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PreconditionForSubstanceAdministration2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePreconditionForSubstanceAdministration2TemplateId() {
		OperationsTestCase<PreconditionForSubstanceAdministration2> validatePreconditionForSubstanceAdministration2TemplateIdTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration2>(
			"validatePreconditionForSubstanceAdministration2TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration2 target) {

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministration2Operations.validatePreconditionForSubstanceAdministration2TemplateId(
					(PreconditionForSubstanceAdministration2) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministration2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreconditionForSubstanceAdministrationCodeP() {
		OperationsTestCase<PreconditionForSubstanceAdministration2> validatePreconditionForSubstanceAdministrationCodePTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration2>(
			"validatePreconditionForSubstanceAdministrationCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration2 target) {

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministration2Operations.validatePreconditionForSubstanceAdministrationCodeP(
					(PreconditionForSubstanceAdministration2) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePreconditionForSubstanceAdministrationValueP() {
		OperationsTestCase<PreconditionForSubstanceAdministration2> validatePreconditionForSubstanceAdministrationValuePTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration2>(
			"validatePreconditionForSubstanceAdministrationValueP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration2 target) {

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration2 target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.setValue(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministration2Operations.validatePreconditionForSubstanceAdministrationValueP(
					(PreconditionForSubstanceAdministration2) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreconditionForSubstanceAdministrationCode() {
		OperationsTestCase<PreconditionForSubstanceAdministration2> validatePreconditionForSubstanceAdministrationCodeTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration2>(
			"validatePreconditionForSubstanceAdministrationCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration2 target) {

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministration2Operations.validatePreconditionForSubstanceAdministrationCode(
					(PreconditionForSubstanceAdministration2) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidatePreconditionForSubstanceAdministrationText() {
		OperationsTestCase<PreconditionForSubstanceAdministration2> validatePreconditionForSubstanceAdministrationTextTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration2>(
			"validatePreconditionForSubstanceAdministrationText",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration2 target) {

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministration2Operations.validatePreconditionForSubstanceAdministrationText(
					(PreconditionForSubstanceAdministration2) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePreconditionForSubstanceAdministrationValue() {
		OperationsTestCase<PreconditionForSubstanceAdministration2> validatePreconditionForSubstanceAdministrationValueTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration2>(
			"validatePreconditionForSubstanceAdministrationValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration2 target) {

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration2 target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD("mustExistOnly", SNOMEDCT_ID);
				target.setValue(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministration2Operations.validatePreconditionForSubstanceAdministrationValue(
					(PreconditionForSubstanceAdministration2) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PreconditionForSubstanceAdministration2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PreconditionForSubstanceAdministration2> {
		public PreconditionForSubstanceAdministration2 create() {
			return ConsolFactory.eINSTANCE.createPreconditionForSubstanceAdministration2();
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
	private static class ConstructorTestClass extends PreconditionForSubstanceAdministration2Operations {
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

} // PreconditionForSubstanceAdministration2Operations
