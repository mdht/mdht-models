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
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.vocab.ActClassDocument;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference;
import org.openhealthtools.mdht.uml.cda.consol.operations.ExternalDocumentReferenceOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>External Document Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Version Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExternalDocumentReferenceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExternalDocumentReferenceTemplateId() {
		OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceTemplateIdTestCase = new OperationsTestCase<ExternalDocumentReference>(
			"validateExternalDocumentReferenceTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalDocumentReference target) {

			}

			@Override
			protected void updateToPass(ExternalDocumentReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceTemplateId(
					(ExternalDocumentReference) objectToTest, diagnostician, map);
			}

		};

		validateExternalDocumentReferenceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalDocumentReferenceClassCode() {
		OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceClassCodeTestCase = new OperationsTestCase<ExternalDocumentReference>(
			"validateExternalDocumentReferenceClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalDocumentReference target) {
				target.init();
				target.setClassCode(ActClassDocument.CDALVLONE);
			}

			@Override
			protected void updateToPass(ExternalDocumentReference target) {
				target.setClassCode(ActClassDocument.DOCCLIN);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceClassCode(
					(ExternalDocumentReference) objectToTest, diagnostician, map);
			}

		};

		validateExternalDocumentReferenceClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExternalDocumentReferenceMoodCode() {
		OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceMoodCodeTestCase = new OperationsTestCase<ExternalDocumentReference>(
			"validateExternalDocumentReferenceMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalDocumentReference target) {

			}

			@Override
			protected void updateToPass(ExternalDocumentReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceMoodCode(
					(ExternalDocumentReference) objectToTest, diagnostician, map);
			}

		};

		validateExternalDocumentReferenceMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalDocumentReferenceId() {
		OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceIdTestCase = new OperationsTestCase<ExternalDocumentReference>(
			"validateExternalDocumentReferenceId",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalDocumentReference target) {
				target.init();
			}

			@Override
			protected void updateToPass(ExternalDocumentReference target) {
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceId(
					(ExternalDocumentReference) objectToTest, diagnostician, map);
			}

		};

		validateExternalDocumentReferenceIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalDocumentReferenceCode() {
		OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceCodeTestCase = new OperationsTestCase<ExternalDocumentReference>(
			"validateExternalDocumentReferenceCode",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalDocumentReference target) {
				target.init();
			}

			@Override
			protected void updateToPass(ExternalDocumentReference target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceCode(
					(ExternalDocumentReference) objectToTest, diagnostician, map);
			}

		};

		validateExternalDocumentReferenceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalDocumentReferenceSetId() {
		OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceSetIdTestCase = new OperationsTestCase<ExternalDocumentReference>(
			"validateExternalDocumentReferenceSetId",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalDocumentReference target) {
				target.init();
			}

			@Override
			protected void updateToPass(ExternalDocumentReference target) {
				target.setSetId(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceSetId(
					(ExternalDocumentReference) objectToTest, diagnostician, map);
			}

		};

		validateExternalDocumentReferenceSetIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalDocumentReferenceVersionNumber() {
		OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceVersionNumberTestCase = new OperationsTestCase<ExternalDocumentReference>(
			"validateExternalDocumentReferenceVersionNumber", operationsForOCL.getOCLValue(
				"VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalDocumentReference target) {
				target.init();
			}

			@Override
			protected void updateToPass(ExternalDocumentReference target) {
				target.setVersionNumber(DatatypesFactory.eINSTANCE.createINT());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceVersionNumber(
					(ExternalDocumentReference) objectToTest, diagnostician, map);
			}

		};

		validateExternalDocumentReferenceVersionNumberTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateExternalDocumentReferenceReference() {
	// OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceReferenceTestCase = new
	// OperationsTestCase<ExternalDocumentReference>(
	// "validateExternalDocumentReferenceReference",
	// operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ExternalDocumentReference target) {
	//
	// }
	//
	// @Override
	// protected void updateToPass(ExternalDocumentReference target) {
	// target.init();
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// target.getReferences().add(ref);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReference(
	// (ExternalDocumentReference) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateExternalDocumentReferenceReferenceTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateExternalDocumentReferenceReferenceExternalDocumentClassCode() {
	// OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceReferenceExternalDocumentClassCodeTestCase = new
	// OperationsTestCase<ExternalDocumentReference>(
	// "validateExternalDocumentReferenceReferenceExternalDocumentClassCode",
	// operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ExternalDocumentReference target) {
	// target.init();
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// target.getReferences().add(ref);
	// ExternalDocument exDoc = CDAFactory.eINSTANCE.createExternalDocument();
	// ref.setExternalDocument(exDoc);
	// }
	//
	// @Override
	// protected void updateToPass(ExternalDocumentReference target) {
	// target.getReferences().get(0).getExternalDocument().setClassCode(ActClassDocument.DOCCLIN);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocumentClassCode(
	// (ExternalDocumentReference) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateExternalDocumentReferenceReferenceExternalDocumentClassCodeTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateExternalDocumentReferenceReferenceExternalDocumentMoodCode() {
	// OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceReferenceExternalDocumentMoodCodeTestCase = new
	// OperationsTestCase<ExternalDocumentReference>(
	// "validateExternalDocumentReferenceReferenceExternalDocumentMoodCode",
	// operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ExternalDocumentReference target) {
	// target.init();
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// target.getReferences().add(ref);
	// ExternalDocument exDoc = CDAFactory.eINSTANCE.createExternalDocument();
	// ref.setExternalDocument(exDoc);
	// }
	//
	// @Override
	// protected void updateToPass(ExternalDocumentReference target) {
	// target.getReferences().get(0).getExternalDocument().setMoodCode(ActMood.EVN);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocumentMoodCode(
	// (ExternalDocumentReference) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateExternalDocumentReferenceReferenceExternalDocumentMoodCodeTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateExternalDocumentReferenceReferenceExternalDocumentId() {
	// OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceReferenceExternalDocumentIdTestCase = new
	// OperationsTestCase<ExternalDocumentReference>(
	// "validateExternalDocumentReferenceReferenceExternalDocumentId",
	// operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ExternalDocumentReference target) {
	// target.init();
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// target.getReferences().add(ref);
	// ExternalDocument exDoc = CDAFactory.eINSTANCE.createExternalDocument();
	// ref.setExternalDocument(exDoc);
	// }
	//
	// @Override
	// protected void updateToPass(ExternalDocumentReference target) {
	// target.getReferences().get(0).getExternalDocument().getIds().add(DatatypesFactory.eINSTANCE.createII());
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocumentId(
	// (ExternalDocumentReference) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateExternalDocumentReferenceReferenceExternalDocumentIdTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateExternalDocumentReferenceReferenceExternalDocumentCode() {
	// OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceReferenceExternalDocumentCodeTestCase = new
	// OperationsTestCase<ExternalDocumentReference>(
	// "validateExternalDocumentReferenceReferenceExternalDocumentCode",
	// operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ExternalDocumentReference target) {
	// target.init();
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// target.getReferences().add(ref);
	// ExternalDocument exDoc = CDAFactory.eINSTANCE.createExternalDocument();
	// ref.setExternalDocument(exDoc);
	// }
	//
	// @Override
	// protected void updateToPass(ExternalDocumentReference target) {
	// target.getReferences().get(0).getExternalDocument().setCode(DatatypesFactory.eINSTANCE.createCD());
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocumentCode(
	// (ExternalDocumentReference) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateExternalDocumentReferenceReferenceExternalDocumentCodeTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateExternalDocumentReferenceReferenceExternalDocumentSetId() {
	// OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceReferenceExternalDocumentSetIdTestCase = new
	// OperationsTestCase<ExternalDocumentReference>(
	// "validateExternalDocumentReferenceReferenceExternalDocumentSetId",
	// operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ExternalDocumentReference target) {
	// target.init();
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// target.getReferences().add(ref);
	// ExternalDocument exDoc = CDAFactory.eINSTANCE.createExternalDocument();
	// ref.setExternalDocument(exDoc);
	// }
	//
	// @Override
	// protected void updateToPass(ExternalDocumentReference target) {
	// target.getReferences().get(0).getExternalDocument().setSetId(DatatypesFactory.eINSTANCE.createII());
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocumentSetId(
	// (ExternalDocumentReference) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateExternalDocumentReferenceReferenceExternalDocumentSetIdTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateExternalDocumentReferenceReferenceExternalDocumentVersionNumber() {
	// OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceReferenceExternalDocumentVersionNumberTestCase = new
	// OperationsTestCase<ExternalDocumentReference>(
	// "validateExternalDocumentReferenceReferenceExternalDocumentVersionNumber",
	// operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ExternalDocumentReference target) {
	// target.init();
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// target.getReferences().add(ref);
	// ExternalDocument exDoc = CDAFactory.eINSTANCE.createExternalDocument();
	// ref.setExternalDocument(exDoc);
	// }
	//
	// @Override
	// protected void updateToPass(ExternalDocumentReference target) {
	// target.getReferences().get(0).getExternalDocument().setVersionNumber(
	// DatatypesFactory.eINSTANCE.createINT());
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocumentVersionNumber(
	// (ExternalDocumentReference) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateExternalDocumentReferenceReferenceExternalDocumentVersionNumberTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateExternalDocumentReferenceReferenceTypeCode() {
	// OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceReferenceTypeCodeTestCase = new
	// OperationsTestCase<ExternalDocumentReference>(
	// "validateExternalDocumentReferenceReferenceTypeCode",
	// operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ExternalDocumentReference target) {
	// target.init();
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// target.getReferences().add(ref);
	// }
	//
	// @Override
	// protected void updateToPass(ExternalDocumentReference target) {
	// target.getReferences().get(0).setTypeCode(x_ActRelationshipExternalReference.REFR);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceTypeCode(
	// (ExternalDocumentReference) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateExternalDocumentReferenceReferenceTypeCodeTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateExternalDocumentReferenceReferenceExternalDocument() {
	// OperationsTestCase<ExternalDocumentReference> validateExternalDocumentReferenceReferenceExternalDocumentTestCase = new
	// OperationsTestCase<ExternalDocumentReference>(
	// "validateExternalDocumentReferenceReferenceExternalDocument",
	// operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ExternalDocumentReference target) {
	// target.init();
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// target.getReferences().add(ref);
	// }
	//
	// @Override
	// protected void updateToPass(ExternalDocumentReference target) {
	// target.getReferences().get(0).setExternalDocument(CDAFactory.eINSTANCE.createExternalDocument());
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocument(
	// (ExternalDocumentReference) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateExternalDocumentReferenceReferenceExternalDocumentTestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ExternalDocumentReferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExternalDocumentReference> {
		@Override
		public ExternalDocumentReference create() {
			return ConsolFactory.eINSTANCE.createExternalDocumentReference();
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
	private static class ConstructorTestClass extends ExternalDocumentReferenceOperations {
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

} // ExternalDocumentReferenceOperations
