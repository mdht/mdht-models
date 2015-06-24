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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SeverityObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Severity Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2#validateSeverityObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2#validateSeverityObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2#validateSeverityObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2#validateSeverityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2#validateSeverityObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2#validateSeverityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2#validateSeverityObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2#validateSeverityObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2#validateSeverityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SeverityObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeverityObservationCodeP() {
		OperationsTestCase<SeverityObservation2> validateSeverityObservationCodePTestCase = new OperationsTestCase<SeverityObservation2>(
			"validateSeverityObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation2 target) {

			}

			@Override
			protected void updateToPass(SeverityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservation2Operations.validateSeverityObservationCodeP(
					(SeverityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeverityObservationStatusCodeP() {
		OperationsTestCase<SeverityObservation2> validateSeverityObservationStatusCodePTestCase = new OperationsTestCase<SeverityObservation2>(
			"validateSeverityObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation2 target) {

			}

			@Override
			protected void updateToPass(SeverityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservation2Operations.validateSeverityObservationStatusCodeP(
					(SeverityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateSeverityObservationTextReference() {
		OperationsTestCase<SeverityObservation2> validateSeverityObservationTextReferenceTestCase = new OperationsTestCase<SeverityObservation2>(
			"validateSeverityObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation2 target) {

			}

			@Override
			protected void updateToPass(SeverityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservation2Operations.validateSeverityObservationTextReference(
					(SeverityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateSeverityObservationTextReferenceValue() {
		OperationsTestCase<SeverityObservation2> validateSeverityObservationTextReferenceValueTestCase = new OperationsTestCase<SeverityObservation2>(
			"validateSeverityObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation2 target) {

			}

			@Override
			protected void updateToPass(SeverityObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservation2Operations.validateSeverityObservationTextReferenceValue(
					(SeverityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateSeverityObservationReferenceValue() {
		OperationsTestCase<SeverityObservation2> validateSeverityObservationReferenceValueTestCase = new OperationsTestCase<SeverityObservation2>(
			"validateSeverityObservationReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation2 target) {

			}

			@Override
			protected void updateToPass(SeverityObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservation2Operations.validateSeverityObservationReferenceValue(
					(SeverityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeverityObservationTemplateId() {
		OperationsTestCase<SeverityObservation2> validateSeverityObservationTemplateIdTestCase = new OperationsTestCase<SeverityObservation2>(
			"validateSeverityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation2 target) {

			}

			@Override
			protected void updateToPass(SeverityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservation2Operations.validateSeverityObservationTemplateId(
					(SeverityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSeverityObservationCode() {
		OperationsTestCase<SeverityObservation2> validateSeverityObservationCodeTestCase = new OperationsTestCase<SeverityObservation2>(
			"validateSeverityObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(SeverityObservation2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("SEV", "2.16.840.1.113883.5.4"));
			}

			@Override
			protected void setDependency(SeverityObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SeverityObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservation2Operations.validateSeverityObservationCode(
					(SeverityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateSeverityObservationText() {
		OperationsTestCase<SeverityObservation2> validateSeverityObservationTextTestCase = new OperationsTestCase<SeverityObservation2>(
			"validateSeverityObservationText",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation2 target) {

			}

			@Override
			protected void updateToPass(SeverityObservation2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservation2Operations.validateSeverityObservationText(
					(SeverityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeverityObservationStatusCode() {
		OperationsTestCase<SeverityObservation2> validateSeverityObservationStatusCodeTestCase = new OperationsTestCase<SeverityObservation2>(
			"validateSeverityObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation2 target) {

			}

			@Override
			protected void updateToPass(SeverityObservation2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(SeverityObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SeverityObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservation2Operations.validateSeverityObservationStatusCode(
					(SeverityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SeverityObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<SeverityObservation2> {
		@Override
		public SeverityObservation2 create() {
			return ConsolFactory.eINSTANCE.createSeverityObservation2();
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
	private static class ConstructorTestClass extends SeverityObservation2Operations {
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

} // SeverityObservation2Operations
