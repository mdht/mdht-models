
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.MaternalTransferOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Maternal Transfer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MaternalTransferTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMaternalTransferTemplateId() {
		OperationsTestCase<MaternalTransfer> validateMaternalTransferTemplateIdTestCase = new OperationsTestCase<MaternalTransfer>(
			"validateMaternalTransferTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalTransfer target) {

			}

			@Override
			protected void updateToPass(MaternalTransfer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalTransferOperations.validateMaternalTransferTemplateId(
					(MaternalTransfer) objectToTest, diagnostician, map);
			}

		};

		validateMaternalTransferTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMaternalTransferClassCode() {
		OperationsTestCase<MaternalTransfer> validateMaternalTransferClassCodeTestCase = new OperationsTestCase<MaternalTransfer>(
			"validateMaternalTransferClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalTransfer target) {

			}

			@Override
			protected void updateToPass(MaternalTransfer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalTransferOperations.validateMaternalTransferClassCode(
					(MaternalTransfer) objectToTest, diagnostician, map);
			}

		};

		validateMaternalTransferClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMaternalTransferMoodCode() {
		OperationsTestCase<MaternalTransfer> validateMaternalTransferMoodCodeTestCase = new OperationsTestCase<MaternalTransfer>(
			"validateMaternalTransferMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalTransfer target) {

			}

			@Override
			protected void updateToPass(MaternalTransfer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalTransferOperations.validateMaternalTransferMoodCode(
					(MaternalTransfer) objectToTest, diagnostician, map);
			}

		};

		validateMaternalTransferMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMaternalTransferCodeP() {
		OperationsTestCase<MaternalTransfer> validateMaternalTransferCodePTestCase = new OperationsTestCase<MaternalTransfer>(
			"validateMaternalTransferCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalTransfer target) {

			}

			@Override
			protected void updateToPass(MaternalTransfer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalTransferOperations.validateMaternalTransferCodeP(
					(MaternalTransfer) objectToTest, diagnostician, map);
			}

		};

		validateMaternalTransferCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMaternalTransferCode() {
		OperationsTestCase<MaternalTransfer> validateMaternalTransferCodeTestCase = new OperationsTestCase<MaternalTransfer>(
			"validateMaternalTransferCode",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalTransfer target) {

			}

			@Override
			protected void updateToPass(MaternalTransfer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalTransferOperations.validateMaternalTransferCode(
					(MaternalTransfer) objectToTest, diagnostician, map);
			}

		};

		validateMaternalTransferCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMaternalTransferValue() {
		OperationsTestCase<MaternalTransfer> validateMaternalTransferValueTestCase = new OperationsTestCase<MaternalTransfer>(
			"validateMaternalTransferValue",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalTransfer target) {

			}

			@Override
			protected void updateToPass(MaternalTransfer target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalTransferOperations.validateMaternalTransferValue(
					(MaternalTransfer) objectToTest, diagnostician, map);
			}

		};

		validateMaternalTransferValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMaternalTransferParticipant() {
		OperationsTestCase<MaternalTransfer> validateMaternalTransferParticipantTestCase = new OperationsTestCase<MaternalTransfer>(
			"validateMaternalTransferParticipant",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalTransfer target) {

			}

			@Override
			protected void updateToPass(MaternalTransfer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalTransferOperations.validateMaternalTransferParticipant(
					(MaternalTransfer) objectToTest, diagnostician, map);
			}

		};

		validateMaternalTransferParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MaternalTransferOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MaternalTransfer> {
		public MaternalTransfer create() {
			return VsbrFactory.eINSTANCE.createMaternalTransfer();
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
	private static class ConstructorTestClass extends MaternalTransferOperations {
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

} // MaternalTransferOperations
