/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.BinaryDataEncoding;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.eclipse.mdht.uml.hl7.datatypes.operations.STOperations;
import org.eclipse.mdht.uml.hl7.vocab.CompressionAlgorithm;
import org.eclipse.mdht.uml.hl7.vocab.IntegrityCheckAlgorithm;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>ST</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#validateThumbnail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thumbnail</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#validateReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#validateIntegrityCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Integrity Check</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#validateIntegrityCheckAlgorithm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Integrity Check Algorithm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#validateCompression(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Compression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#validateRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#validateST(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ST</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#isCompressionDefined() <em>Is Compression Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#isIntegrityCheckAlgorithmDefined() <em>Is Integrity Check Algorithm Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#isRepresentationDefined() <em>Is Representation Defined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class STTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateThumbnail() {
		OperationsTestCase<ST> validateThumbnailTestCase = new OperationsTestCase<ST>(
			"validateThumbnail", operationsForOCL.getOCLValue("VALIDATE_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ST target) {

				ED value = DatatypesFactory.eINSTANCE.createED();
				target.setThumbnail(value);
			}

			@Override
			protected void updateToPass(ST target) {

				target.setThumbnail(null);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return STOperations.validateThumbnail((ST) objectToTest, diagnostician, map);
			}

		};

		validateThumbnailTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateReference() {
		OperationsTestCase<ST> validateReferenceTestCase = new OperationsTestCase<ST>(
			"validateReference", operationsForOCL.getOCLValue("VALIDATE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ST target) {
				target.setReference(DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected void updateToPass(ST target) {
				target.setReference(null);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return STOperations.validateReference((ST) objectToTest, diagnostician, map);
			}

		};

		validateReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIntegrityCheck() {
		OperationsTestCase<ST> validateIntegrityCheckTestCase = new OperationsTestCase<ST>(
			"validateIntegrityCheck",
			operationsForOCL.getOCLValue("VALIDATE_INTEGRITY_CHECK__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ST target) {
				target.setIntegrityCheck(new byte[10]);
			}

			@Override
			protected void updateToPass(ST target) {
				target.setIntegrityCheck(null);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return STOperations.validateIntegrityCheck((ST) objectToTest, diagnostician, map);
			}

		};

		validateIntegrityCheckTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIntegrityCheckAlgorithm() {
		OperationsTestCase<ST> validateIntegrityCheckAlgorithmTestCase = new OperationsTestCase<ST>(
			"validateIntegrityCheckAlgorithm",
			operationsForOCL.getOCLValue("VALIDATE_INTEGRITY_CHECK_ALGORITHM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ST target) {

				target.setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm.SHA1);
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(ST target) {
						// TODO Auto-generated method stub

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return STOperations.validateIntegrityCheckAlgorithm((ST) objectToTest, diagnostician, map);
			}

		};

		validateIntegrityCheckAlgorithmTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCompression() {
		OperationsTestCase<ST> validateCompressionTestCase = new OperationsTestCase<ST>(
			"validateCompression", operationsForOCL.getOCLValue("VALIDATE_COMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ST target) {
				target.setCompression(CompressionAlgorithm.DF);
			}

			@Override
			public void addPassTests() {

				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(ST target) {
						// TODO Auto-generated method stub

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return STOperations.validateCompression((ST) objectToTest, diagnostician, map);
			}

		};

		validateCompressionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateRepresentation() {
		OperationsTestCase<ST> validateRepresentationTestCase = new OperationsTestCase<ST>(
			"validateRepresentation",
			operationsForOCL.getOCLValue("VALIDATE_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ST target) {

				target.setRepresentation(BinaryDataEncoding.B64);
			}

			@Override
			protected void updateToPass(ST target) {

				target.setRepresentation(BinaryDataEncoding.TXT);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return STOperations.validateRepresentation((ST) objectToTest, diagnostician, map);
			}

		};

		validateRepresentationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateST() {
		OperationsTestCase<ST> validateSTTestCase = new OperationsTestCase<ST>(
			"validateST", operationsForOCL.getOCLValue("VALIDATE_ST__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ST target) {

			}

			@Override
			protected void updateToPass(ST target) {
				target.addText("some text");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return STOperations.validateST((ST) objectToTest, diagnostician, map);
			}

		};

		validateSTTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends STOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ST> {

		public ST create() {
			return DatatypesFactory.eINSTANCE.createST();
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
	private static class ConstructorTestClass extends STOperations {
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

} // STOperations
