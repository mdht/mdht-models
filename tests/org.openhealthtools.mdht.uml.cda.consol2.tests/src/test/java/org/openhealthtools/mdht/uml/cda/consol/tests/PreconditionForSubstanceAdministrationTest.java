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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.operations.PreconditionForSubstanceAdministrationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Precondition For Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PreconditionForSubstanceAdministrationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreconditionForSubstanceAdministrationTemplateId() {
		OperationsTestCase<PreconditionForSubstanceAdministration> validatePreconditionForSubstanceAdministrationTemplateIdTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration>(
			"validatePreconditionForSubstanceAdministrationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationTemplateId(
					(PreconditionForSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePreconditionForSubstanceAdministrationCode() {
		OperationsTestCase<PreconditionForSubstanceAdministration> validatePreconditionForSubstanceAdministrationCodeTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration>(
			"validatePreconditionForSubstanceAdministrationCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationCode(
					(PreconditionForSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreconditionForSubstanceAdministrationText() {
		OperationsTestCase<PreconditionForSubstanceAdministration> validatePreconditionForSubstanceAdministrationTextTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration>(
			"validatePreconditionForSubstanceAdministrationText",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationText(
					(PreconditionForSubstanceAdministration) objectToTest, diagnostician, map);
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
		OperationsTestCase<PreconditionForSubstanceAdministration> validatePreconditionForSubstanceAdministrationValueTestCase = new OperationsTestCase<PreconditionForSubstanceAdministration>(
			"validatePreconditionForSubstanceAdministrationValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreconditionForSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(PreconditionForSubstanceAdministration target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4");
				target.setValue(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationValue(
					(PreconditionForSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePreconditionForSubstanceAdministrationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PreconditionForSubstanceAdministrationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PreconditionForSubstanceAdministration> {
		public PreconditionForSubstanceAdministration create() {
			return ConsolFactory.eINSTANCE.createPreconditionForSubstanceAdministration();
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
	private static class ConstructorTestClass extends PreconditionForSubstanceAdministrationOperations {
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

} // PreconditionForSubstanceAdministrationOperations
