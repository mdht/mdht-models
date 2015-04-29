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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ActReference;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.ActReferenceOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Act Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceCDNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference CD Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceCDNullFlavorP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference CD Null Flavor P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ActReferenceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateActReferenceTemplateId() {
		OperationsTestCase<ActReference> validateActReferenceTemplateIdTestCase = new OperationsTestCase<ActReference>(
			"validateActReferenceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ACT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ActReference target) {

			}

			@Override
			protected void updateToPass(ActReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ActReferenceOperations.validateActReferenceTemplateId(
					(ActReference) objectToTest, diagnostician, map);
			}

		};

		validateActReferenceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateActReferenceClassCode() {
		OperationsTestCase<ActReference> validateActReferenceClassCodeTestCase = new OperationsTestCase<ActReference>(
			"validateActReferenceClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ACT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ActReference target) {

			}

			@Override
			protected void updateToPass(ActReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ActReferenceOperations.validateActReferenceClassCode(
					(ActReference) objectToTest, diagnostician, map);
			}

		};

		validateActReferenceClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateActReferenceMoodCode() {
		OperationsTestCase<ActReference> validateActReferenceMoodCodeTestCase = new OperationsTestCase<ActReference>(
			"validateActReferenceMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ACT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ActReference target) {

			}

			@Override
			protected void updateToPass(ActReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ActReferenceOperations.validateActReferenceMoodCode(
					(ActReference) objectToTest, diagnostician, map);
			}

		};

		validateActReferenceMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateActReferenceId() {
		OperationsTestCase<ActReference> validateActReferenceIdTestCase = new OperationsTestCase<ActReference>(
			"validateActReferenceId",
			operationsForOCL.getOCLValue("VALIDATE_ACT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ActReference target) {

			}

			@Override
			protected void updateToPass(ActReference target) {
				target.init();
				II idII = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(idII);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ActReferenceOperations.validateActReferenceId((ActReference) objectToTest, diagnostician, map);
			}

		};

		validateActReferenceIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateActReferenceCode() {
		OperationsTestCase<ActReference> validateActReferenceCodeTestCase = new OperationsTestCase<ActReference>(
			"validateActReferenceCode",
			operationsForOCL.getOCLValue("VALIDATE_ACT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ActReference target) {

			}

			@Override
			protected void updateToPass(ActReference target) {
				target.init();
				CD codeCD = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(codeCD);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ActReferenceOperations.validateActReferenceCode((ActReference) objectToTest, diagnostician, map);
			}

		};

		validateActReferenceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateActReferenceStatusCode() {
		OperationsTestCase<ActReference> validateActReferenceStatusCodeTestCase = new OperationsTestCase<ActReference>(
			"validateActReferenceStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ACT_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ActReference target) {

			}

			@Override
			protected void updateToPass(ActReference target) {
				final String ACT_STATUS_CODESYSTEM_ID = "2.16.840.1.113883.5.14";
				final String CURRENT_CODESYSTEM_NAME = "ActStatus";
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				cs.setCodeSystem(ACT_STATUS_CODESYSTEM_ID);
				cs.setCodeSystemName(CURRENT_CODESYSTEM_NAME);
				target.setStatusCode(cs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ActReferenceOperations.validateActReferenceStatusCode(
					(ActReference) objectToTest, diagnostician, map);
			}

		};

		validateActReferenceStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateActReferenceStatusCodeP() {
		OperationsTestCase<ActReference> validateActReferenceStatusCodePTestCase = new OperationsTestCase<ActReference>(
			"validateActReferenceStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ACT_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ActReference target) {

			}

			@Override
			protected void updateToPass(ActReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ActReferenceOperations.validateActReferenceStatusCodeP(
					(ActReference) objectToTest, diagnostician, map);
			}

		};

		validateActReferenceStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateActReferenceCDNullFlavor() {
		OperationsTestCase<ActReference> validateActReferenceCDNullFlavorTestCase = new OperationsTestCase<ActReference>(
			"validateActReferenceCDNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ActReference target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(code);
				target.setNullFlavor(NullFlavor.ASKU);
			}

			@Override
			protected void updateToPass(ActReference target) {
				// A specific code of NP is required
				target.getCode().setNullFlavor(NullFlavor.NP);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ActReferenceOperations.validateActReferenceCDNullFlavor(
					(ActReference) objectToTest, diagnostician, map);
			}

		};

		validateActReferenceCDNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateActReferenceCDNullFlavorP() {
		OperationsTestCase<ActReference> validateActReferenceCDNullFlavorPTestCase = new OperationsTestCase<ActReference>(
			"validateActReferenceCDNullFlavorP",
			operationsForOCL.getOCLValue("VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ActReference target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ActReference target) {
				// For this test, a specific code is not required, only that nullFlavor exists.
				// This is why we are checking ASKU instead of NP as it should still pass
				target.getCode().setNullFlavor(NullFlavor.ASKU);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ActReferenceOperations.validateActReferenceCDNullFlavorP(
					(ActReference) objectToTest, diagnostician, map);
			}

		};

		validateActReferenceCDNullFlavorPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ActReferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ActReference> {
		@Override
		public ActReference create() {
			return ConsolFactory.eINSTANCE.createActReference();
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
	private static class ConstructorTestClass extends ActReferenceOperations {
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

} // ActReferenceOperations
