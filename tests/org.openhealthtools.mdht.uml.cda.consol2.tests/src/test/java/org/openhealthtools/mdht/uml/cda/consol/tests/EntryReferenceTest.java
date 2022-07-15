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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.vocab.NullFlavor;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;
import org.openhealthtools.mdht.uml.cda.consol.operations.EntryReferenceOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Entry Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceIINullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference II Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceCDNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference CD Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceCDNullFlavorP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference CD Null Flavor P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EntryReferenceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEntryReferenceTemplateId() {
		OperationsTestCase<EntryReference> validateEntryReferenceTemplateIdTestCase = new OperationsTestCase<EntryReference>(
			"validateEntryReferenceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENTRY_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EntryReference target) {

			}

			@Override
			protected void updateToPass(EntryReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EntryReferenceOperations.validateEntryReferenceTemplateId(
					(EntryReference) objectToTest, diagnostician, map);
			}

		};

		validateEntryReferenceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEntryReferenceClassCode() {
		OperationsTestCase<EntryReference> validateEntryReferenceClassCodeTestCase = new OperationsTestCase<EntryReference>(
			"validateEntryReferenceClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ENTRY_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EntryReference target) {

			}

			@Override
			protected void updateToPass(EntryReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EntryReferenceOperations.validateEntryReferenceClassCode(
					(EntryReference) objectToTest, diagnostician, map);
			}

		};

		validateEntryReferenceClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEntryReferenceMoodCode() {
		OperationsTestCase<EntryReference> validateEntryReferenceMoodCodeTestCase = new OperationsTestCase<EntryReference>(
			"validateEntryReferenceMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ENTRY_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EntryReference target) {

			}

			@Override
			protected void updateToPass(EntryReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EntryReferenceOperations.validateEntryReferenceMoodCode(
					(EntryReference) objectToTest, diagnostician, map);
			}

		};

		validateEntryReferenceMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEntryReferenceId() {
		OperationsTestCase<EntryReference> validateEntryReferenceIdTestCase = new OperationsTestCase<EntryReference>(
			"validateEntryReferenceId",
			operationsForOCL.getOCLValue("VALIDATE_ENTRY_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EntryReference target) {

			}

			@Override
			protected void updateToPass(EntryReference target) {
				target.init();
				II idII = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(idII);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EntryReferenceOperations.validateEntryReferenceId(
					(EntryReference) objectToTest, diagnostician, map);
			}

		};

		validateEntryReferenceIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEntryReferenceCode() {
		OperationsTestCase<EntryReference> validateEntryReferenceCodeTestCase = new OperationsTestCase<EntryReference>(
			"validateEntryReferenceCode",
			operationsForOCL.getOCLValue("VALIDATE_ENTRY_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EntryReference target) {

			}

			@Override
			protected void updateToPass(EntryReference target) {
				target.init();
				CD codeCD = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(codeCD);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EntryReferenceOperations.validateEntryReferenceCode(
					(EntryReference) objectToTest, diagnostician, map);
			}

		};

		validateEntryReferenceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEntryReferenceStatusCode() {
		OperationsTestCase<EntryReference> validateEntryReferenceStatusCodeTestCase = new OperationsTestCase<EntryReference>(
			"validateEntryReferenceStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ENTRY_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EntryReference target) {

			}

			@Override
			protected void updateToPass(EntryReference target) {
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

				return EntryReferenceOperations.validateEntryReferenceStatusCode(
					(EntryReference) objectToTest, diagnostician, map);
			}

		};

		validateEntryReferenceStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEntryReferenceStatusCodeP() {
		OperationsTestCase<EntryReference> validateEntryReferenceStatusCodePTestCase = new OperationsTestCase<EntryReference>(
			"validateEntryReferenceStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ENTRY_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EntryReference target) {

			}

			@Override
			protected void updateToPass(EntryReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EntryReferenceOperations.validateEntryReferenceStatusCodeP(
					(EntryReference) objectToTest, diagnostician, map);
			}

		};

		validateEntryReferenceStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* Note: modified OCL for VALIDATE_ENTRY_REFERENCE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
	* due to OCL generation issue for a 0..0 situation
	*/
	@Test
	public void testValidateEntryReferenceIINullFlavor() {
		OperationsTestCase<EntryReference> validateEntryReferenceIINullFlavorTestCase = new OperationsTestCase<EntryReference>(
			"validateEntryReferenceIINullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_ENTRY_REFERENCE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EntryReference target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII(NullFlavor.ASKU);
				target.getIds().add(id);
			}

			@Override
			protected void updateToPass(EntryReference target) {
				target.getIds().clear();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EntryReferenceOperations.validateEntryReferenceIINullFlavor(
					(EntryReference) objectToTest, diagnostician, map);
			}

		};

		validateEntryReferenceIINullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEntryReferenceCDNullFlavor() {
		OperationsTestCase<EntryReference> validateEntryReferenceCDNullFlavorTestCase = new OperationsTestCase<EntryReference>(
			"validateEntryReferenceCDNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EntryReference target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(code);
				target.setNullFlavor(NullFlavor.ASKU);
			}

			@Override
			protected void updateToPass(EntryReference target) {
				// A specific code of NP is required
				target.getCode().setNullFlavor(NullFlavor.NP);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EntryReferenceOperations.validateEntryReferenceCDNullFlavor(
					(EntryReference) objectToTest, diagnostician, map);
			}

		};

		validateEntryReferenceCDNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEntryReferenceCDNullFlavorP() {
		OperationsTestCase<EntryReference> validateEntryReferenceCDNullFlavorPTestCase = new OperationsTestCase<EntryReference>(
			"validateEntryReferenceCDNullFlavorP",
			operationsForOCL.getOCLValue("VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EntryReference target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(code);
			}

			@Override
			protected void updateToPass(EntryReference target) {
				// For this test, a specific code is not required, only that nullFlavor exists.
				// This is why we are checking ASKU instead of NP as it should still pass
				target.getCode().setNullFlavor(NullFlavor.ASKU);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EntryReferenceOperations.validateEntryReferenceCDNullFlavorP(
					(EntryReference) objectToTest, diagnostician, map);
			}

		};

		validateEntryReferenceCDNullFlavorPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EntryReferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EntryReference> {
		public EntryReference create() {
			return ConsolFactory.eINSTANCE.createEntryReference();
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
	private static class ConstructorTestClass extends EntryReferenceOperations {
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

} // EntryReferenceOperations
