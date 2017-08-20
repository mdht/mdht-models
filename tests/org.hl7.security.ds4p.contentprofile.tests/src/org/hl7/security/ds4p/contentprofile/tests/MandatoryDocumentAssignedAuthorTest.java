
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor;
import org.hl7.security.ds4p.contentprofile.operations.MandatoryDocumentAssignedAuthorOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mandatory Document Assigned Author</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor#validateMandatoryDocumentAssignedAuthorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor#validateMandatoryDocumentAssignedAuthorTelecomEmail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Telecom Email</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor#validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Assigned Authoring Device</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor#validateMandatoryDocumentAssignedAuthorAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Assigned Person</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor#validateMandatoryDocumentAssignedAuthorRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Represented Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MandatoryDocumentAssignedAuthorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMandatoryDocumentAssignedAuthorTemplateId() {
		OperationsTestCase<MandatoryDocumentAssignedAuthor> validateMandatoryDocumentAssignedAuthorTemplateIdTestCase = new OperationsTestCase<MandatoryDocumentAssignedAuthor>(
			"validateMandatoryDocumentAssignedAuthorTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MandatoryDocumentAssignedAuthor target) {

			}

			@Override
			protected void updateToPass(MandatoryDocumentAssignedAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryDocumentAssignedAuthorOperations.validateMandatoryDocumentAssignedAuthorTemplateId(
					(MandatoryDocumentAssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryDocumentAssignedAuthorTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMandatoryDocumentAssignedAuthorTelecomEmail() {
		OperationsTestCase<MandatoryDocumentAssignedAuthor> validateMandatoryDocumentAssignedAuthorTelecomEmailTestCase = new OperationsTestCase<MandatoryDocumentAssignedAuthor>(
			"validateMandatoryDocumentAssignedAuthorTelecomEmail",
			operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TELECOM_EMAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MandatoryDocumentAssignedAuthor target) {

			}

			@Override
			protected void updateToPass(MandatoryDocumentAssignedAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryDocumentAssignedAuthorOperations.validateMandatoryDocumentAssignedAuthorTelecomEmail(
					(MandatoryDocumentAssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryDocumentAssignedAuthorTelecomEmailTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice() {
		OperationsTestCase<MandatoryDocumentAssignedAuthor> validateMandatoryDocumentAssignedAuthorAssignedAuthoringDeviceTestCase = new OperationsTestCase<MandatoryDocumentAssignedAuthor>(
			"validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice",
			operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MandatoryDocumentAssignedAuthor target) {

			}

			@Override
			protected void updateToPass(MandatoryDocumentAssignedAuthor target) {
				target.init();

				target.setAssignedAuthoringDevice(CDAFactory.eINSTANCE.createAuthoringDevice());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryDocumentAssignedAuthorOperations.validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(
					(MandatoryDocumentAssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryDocumentAssignedAuthorAssignedAuthoringDeviceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateMandatoryDocumentAssignedAuthorAssignedPerson() {
		OperationsTestCase<MandatoryDocumentAssignedAuthor> validateMandatoryDocumentAssignedAuthorAssignedPersonTestCase = new OperationsTestCase<MandatoryDocumentAssignedAuthor>(
			"validateMandatoryDocumentAssignedAuthorAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MandatoryDocumentAssignedAuthor target) {

			}

			@Override
			protected void updateToPass(MandatoryDocumentAssignedAuthor target) {
				target.init();
				target.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryDocumentAssignedAuthorOperations.validateMandatoryDocumentAssignedAuthorAssignedPerson(
					(MandatoryDocumentAssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryDocumentAssignedAuthorAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateMandatoryDocumentAssignedAuthorRepresentedOrganization() {
		OperationsTestCase<MandatoryDocumentAssignedAuthor> validateMandatoryDocumentAssignedAuthorRepresentedOrganizationTestCase = new OperationsTestCase<MandatoryDocumentAssignedAuthor>(
			"validateMandatoryDocumentAssignedAuthorRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MandatoryDocumentAssignedAuthor target) {

			}

			@Override
			protected void updateToPass(MandatoryDocumentAssignedAuthor target) {

				target.init();

				target.setRepresentedOrganization(CDAFactory.eINSTANCE.createOrganization());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryDocumentAssignedAuthorOperations.validateMandatoryDocumentAssignedAuthorRepresentedOrganization(
					(MandatoryDocumentAssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryDocumentAssignedAuthorRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MandatoryDocumentAssignedAuthorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MandatoryDocumentAssignedAuthor> {
		public MandatoryDocumentAssignedAuthor create() {
			return CONTENTPROFILEFactory.eINSTANCE.createMandatoryDocumentAssignedAuthor();
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
	private static class ConstructorTestClass extends MandatoryDocumentAssignedAuthorOperations {
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

} // MandatoryDocumentAssignedAuthorOperations
