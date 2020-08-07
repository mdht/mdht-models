
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance;
import org.hl7.security.ds4p.contentprofile.operations.MandatoryDocumentProvenanceOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mandatory Document Provenance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance#validateMandatoryDocumentProvenanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Provenance Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance#validateMandatoryDocumentProvenanceTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Provenance Time</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance#validateMandatoryDocumentProvenanceAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Provenance Assigned Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MandatoryDocumentProvenanceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMandatoryDocumentProvenanceTemplateId() {
		OperationsTestCase<MandatoryDocumentProvenance> validateMandatoryDocumentProvenanceTemplateIdTestCase = new OperationsTestCase<MandatoryDocumentProvenance>(
			"validateMandatoryDocumentProvenanceTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MandatoryDocumentProvenance target) {

			}

			@Override
			protected void updateToPass(MandatoryDocumentProvenance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryDocumentProvenanceOperations.validateMandatoryDocumentProvenanceTemplateId(
					(MandatoryDocumentProvenance) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryDocumentProvenanceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateMandatoryDocumentProvenanceTime() {
		OperationsTestCase<MandatoryDocumentProvenance> validateMandatoryDocumentProvenanceTimeTestCase = new OperationsTestCase<MandatoryDocumentProvenance>(
			"validateMandatoryDocumentProvenanceTime",
			operationsForOCL.getOCLValue("VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MandatoryDocumentProvenance target) {

			}

			@Override
			protected void updateToPass(MandatoryDocumentProvenance target) {
				target.init();
				target.setTime(DatatypesFactory.eINSTANCE.createTS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryDocumentProvenanceOperations.validateMandatoryDocumentProvenanceTime(
					(MandatoryDocumentProvenance) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryDocumentProvenanceTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateMandatoryDocumentProvenanceAssignedAuthor() {
		OperationsTestCase<MandatoryDocumentProvenance> validateMandatoryDocumentProvenanceAssignedAuthorTestCase = new OperationsTestCase<MandatoryDocumentProvenance>(
			"validateMandatoryDocumentProvenanceAssignedAuthor",
			operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_DOCUMENT_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MandatoryDocumentProvenance target) {

			}

			@Override
			protected void updateToPass(MandatoryDocumentProvenance target) {
				target.init();
				target.setAssignedAuthor(
					CONTENTPROFILEFactory.eINSTANCE.createMandatoryDocumentAssignedAuthor().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryDocumentProvenanceOperations.validateMandatoryDocumentProvenanceAssignedAuthor(
					(MandatoryDocumentProvenance) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryDocumentProvenanceAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MandatoryDocumentProvenanceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MandatoryDocumentProvenance> {
		public MandatoryDocumentProvenance create() {
			return CONTENTPROFILEFactory.eINSTANCE.createMandatoryDocumentProvenance();
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
	private static class ConstructorTestClass extends MandatoryDocumentProvenanceOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // MandatoryDocumentProvenanceOperations
