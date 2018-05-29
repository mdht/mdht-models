/*******************************************************************************
 * Copyright (c) 2018 Dan Brown and others.
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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemStatus2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Status2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2#validateProblemStatus2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2#validateProblemStatusTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2#validateProblemStatusReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2#validateProblemStatusTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2#validateProblemStatusText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2#validateProblemStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemStatus2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemStatus2TemplateId() {
		OperationsTestCase<ProblemStatus2> validateProblemStatus2TemplateIdTestCase = new OperationsTestCase<ProblemStatus2>(
			"validateProblemStatus2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_STATUS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatus2 target) {

			}

			@Override
			protected void updateToPass(ProblemStatus2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatus2Operations.validateProblemStatus2TemplateId(
					(ProblemStatus2) objectToTest, diagnostician, map);
			}

		};

		validateProblemStatus2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateProblemStatusTextReference() {
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateProblemStatusReferenceValue() {
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateProblemStatusTextReferenceValue() {
	}

	/**
	*
	* @generated NOT
	* This (non-CC) constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateProblemStatusText() {
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemStatusValue() {
		OperationsTestCase<ProblemStatus2> validateProblemStatusValueTestCase = new OperationsTestCase<ProblemStatus2>(
			"validateProblemStatusValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatus2 target) {

			}

			@Override
			protected void updateToPass(ProblemStatus2 target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("444931000124107");
				value.setDisplayName("Poorly-controlled");
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatus2Operations.validateProblemStatusValue(
					(ProblemStatus2) objectToTest, diagnostician, map);
			}

		};

		validateProblemStatusValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemStatus2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemStatus2> {
		public ProblemStatus2 create() {
			return ConsolFactory.eINSTANCE.createProblemStatus2();
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
	private static class ConstructorTestClass extends ProblemStatus2Operations {
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

} // ProblemStatus2Operations
