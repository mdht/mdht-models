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
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.operations.Indication2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Indication2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication2#validateIndication2ProblemIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication2 Problem Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication2#validateIndication2CodeNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication2 Code Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication2#validateIndication2CodeNullFlavorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication2 Code Null Flavor Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication2#validateIndication2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication2#validateIndicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication2#validateIndicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication2#validateIndicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication2#validateIndicationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication2#validateIndicationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication2#validateIndicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Indication2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateIndication2ProblemIndication() {
		OperationsTestCase<Indication2> validateIndication2ProblemIndicationTestCase = new OperationsTestCase<Indication2>(
			"validateIndication2ProblemIndication",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION2_PROBLEM_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Indication2 target) {

			}

			@Override
			protected void updateToPass(Indication2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Indication2Operations.validateIndication2ProblemIndication(
					(Indication2) objectToTest, diagnostician, map);
			}

		};

		validateIndication2ProblemIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateIndication2CodeNullFlavor() {
		OperationsTestCase<Indication2> validateIndication2CodeNullFlavorTestCase = new OperationsTestCase<Indication2>(
			"validateIndication2CodeNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION2_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Indication2 target) {

			}

			@Override
			protected void updateToPass(Indication2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Indication2Operations.validateIndication2CodeNullFlavor(
					(Indication2) objectToTest, diagnostician, map);
			}

		};

		validateIndication2CodeNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateIndication2CodeNullFlavorValue() {
		OperationsTestCase<Indication2> validateIndication2CodeNullFlavorValueTestCase = new OperationsTestCase<Indication2>(
			"validateIndication2CodeNullFlavorValue",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION2_CODE_NULL_FLAVOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Indication2 target) {

			}

			@Override
			protected void updateToPass(Indication2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Indication2Operations.validateIndication2CodeNullFlavorValue(
					(Indication2) objectToTest, diagnostician, map);
			}

		};

		validateIndication2CodeNullFlavorValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIndication2Text() {
		OperationsTestCase<Indication2> validateIndication2TextTestCase = new OperationsTestCase<Indication2>(
			"validateIndication2Text",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Indication2 target) {

			}

			@Override
			protected void updateToPass(Indication2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Indication2Operations.validateIndication2Text((Indication2) objectToTest, diagnostician, map);
			}

		};

		validateIndication2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIndicationTemplateId() {
		OperationsTestCase<Indication2> validateIndicationTemplateIdTestCase = new OperationsTestCase<Indication2>(
			"validateIndicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Indication2 target) {

			}

			@Override
			protected void updateToPass(Indication2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Indication2Operations.validateIndicationTemplateId(
					(Indication2) objectToTest, diagnostician, map);
			}

		};

		validateIndicationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIndicationCodeP() {
		OperationsTestCase<Indication2> validateIndicationCodePTestCase = new OperationsTestCase<Indication2>(
			"validateIndicationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Indication2 target) {

			}

			@Override
			protected void updateToPass(Indication2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Indication2Operations.validateIndicationCodeP((Indication2) objectToTest, diagnostician, map);
			}

		};

		validateIndicationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIndicationCode() {
		OperationsTestCase<Indication2> validateIndicationCodeTestCase = new OperationsTestCase<Indication2>(
			"validateIndicationCode",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Indication2 target) {

			}

			@Override
			protected void updateToPass(Indication2 target) {
				target.init();

			}

			@Override
			protected void setDependency(Indication2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.IndicationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Indication2Operations.validateIndicationCode((Indication2) objectToTest, diagnostician, map);
			}

		};

		validateIndicationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIndicationId() {
		OperationsTestCase<Indication2> validateIndicationIdTestCase = new OperationsTestCase<Indication2>(
			"validateIndicationId",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Indication2 target) {
				target.init();

			}

			@Override
			protected void updateToPass(Indication2 target) {
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Indication2Operations.validateIndicationId((Indication2) objectToTest, diagnostician, map);
			}

		};

		validateIndicationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIndicationValueP() {
		OperationsTestCase<Indication2> validateIndicationValuePTestCase = new OperationsTestCase<Indication2>(
			"validateIndicationValueP",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Indication2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(Indication2 target) {
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Indication2Operations.validateIndicationValueP((Indication2) objectToTest, diagnostician, map);
			}

		};

		validateIndicationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIndicationValue() {
		OperationsTestCase<Indication2> validateIndicationValueTestCase = new OperationsTestCase<Indication2>(
			"validateIndicationValue",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Indication2 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(Indication2 target) {
				for (int i = 0; i < target.getValues().size(); i++) {
					target.getValues().set(i, DatatypesFactory.eINSTANCE.createCD("notChecked", SNOMEDCT_ID));
				}
			}

			@Override
			protected void setDependency(Indication2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.IndicationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Indication2Operations.validateIndicationValue((Indication2) objectToTest, diagnostician, map);
			}

		};

		validateIndicationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Indication2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<Indication2> {
		@Override
		public Indication2 create() {
			return ConsolFactory.eINSTANCE.createIndication2();
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
	private static class ConstructorTestClass extends Indication2Operations {
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

} // Indication2Operations
