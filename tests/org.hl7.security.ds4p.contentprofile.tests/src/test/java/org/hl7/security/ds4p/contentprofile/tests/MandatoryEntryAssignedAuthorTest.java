
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor;
import org.hl7.security.ds4p.contentprofile.operations.MandatoryEntryAssignedAuthorOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mandatory Entry Assigned Author</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor#validateMandatoryEntryAssignedAuthorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor#validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Assigned Authoring Device</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor#validateMandatoryEntryAssignedAuthorAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Assigned Person</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor#validateMandatoryEntryAssignedAuthorRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Assigned Author Represented Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MandatoryEntryAssignedAuthorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMandatoryEntryAssignedAuthorTemplateId() {
		OperationsTestCase<MandatoryEntryAssignedAuthor> validateMandatoryEntryAssignedAuthorTemplateIdTestCase = new OperationsTestCase<MandatoryEntryAssignedAuthor>(
			"validateMandatoryEntryAssignedAuthorTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MandatoryEntryAssignedAuthor target) {

			}

			@Override
			protected void updateToPass(MandatoryEntryAssignedAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryEntryAssignedAuthorOperations.validateMandatoryEntryAssignedAuthorTemplateId(
					(MandatoryEntryAssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryEntryAssignedAuthorTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateMandatoryEntryAssignedAuthorAssignedAuthoringDevice() {
		OperationsTestCase<MandatoryEntryAssignedAuthor> validateMandatoryEntryAssignedAuthorAssignedAuthoringDeviceTestCase = new OperationsTestCase<MandatoryEntryAssignedAuthor>(
			"validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice",
			operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
				this.skipPassTest();
			}

			@Override
			protected void updateToFail(MandatoryEntryAssignedAuthor target) {

			}

			@Override
			protected void updateToPass(MandatoryEntryAssignedAuthor target) {
				target.init();
				target.setAssignedAuthoringDevice(CDAFactory.eINSTANCE.createAuthoringDevice());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryEntryAssignedAuthorOperations.validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(
					(MandatoryEntryAssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryEntryAssignedAuthorAssignedAuthoringDeviceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateMandatoryEntryAssignedAuthorAssignedPerson() {
		OperationsTestCase<MandatoryEntryAssignedAuthor> validateMandatoryEntryAssignedAuthorAssignedPersonTestCase = new OperationsTestCase<MandatoryEntryAssignedAuthor>(
			"validateMandatoryEntryAssignedAuthorAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
				this.skipPassTest();
			}

			@Override
			protected void updateToFail(MandatoryEntryAssignedAuthor target) {

			}

			@Override
			protected void updateToPass(MandatoryEntryAssignedAuthor target) {
				target.init();
				target.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryEntryAssignedAuthorOperations.validateMandatoryEntryAssignedAuthorAssignedPerson(
					(MandatoryEntryAssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryEntryAssignedAuthorAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateMandatoryEntryAssignedAuthorRepresentedOrganization() {
		OperationsTestCase<MandatoryEntryAssignedAuthor> validateMandatoryEntryAssignedAuthorRepresentedOrganizationTestCase = new OperationsTestCase<MandatoryEntryAssignedAuthor>(
			"validateMandatoryEntryAssignedAuthorRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_ENTRY_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
				this.skipPassTest();
			}

			@Override
			protected void updateToFail(MandatoryEntryAssignedAuthor target) {

			}

			@Override
			protected void updateToPass(MandatoryEntryAssignedAuthor target) {
				target.init();
				target.setRepresentedOrganization(CDAFactory.eINSTANCE.createOrganization());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryEntryAssignedAuthorOperations.validateMandatoryEntryAssignedAuthorRepresentedOrganization(
					(MandatoryEntryAssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryEntryAssignedAuthorRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MandatoryEntryAssignedAuthorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MandatoryEntryAssignedAuthor> {
		public MandatoryEntryAssignedAuthor create() {
			return CONTENTPROFILEFactory.eINSTANCE.createMandatoryEntryAssignedAuthor();
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
	private static class ConstructorTestClass extends MandatoryEntryAssignedAuthorOperations {
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

} // MandatoryEntryAssignedAuthorOperations
