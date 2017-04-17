
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.InfantTransferOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infant Transfer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InfantTransferTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantTransferTemplateId() {
		OperationsTestCase<InfantTransfer> validateInfantTransferTemplateIdTestCase = new OperationsTestCase<InfantTransfer>(
			"validateInfantTransferTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantTransfer target) {

			}

			@Override
			protected void updateToPass(InfantTransfer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantTransferOperations.validateInfantTransferTemplateId(
					(InfantTransfer) objectToTest, diagnostician, map);
			}

		};

		validateInfantTransferTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantTransferClassCode() {
		OperationsTestCase<InfantTransfer> validateInfantTransferClassCodeTestCase = new OperationsTestCase<InfantTransfer>(
			"validateInfantTransferClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantTransfer target) {

			}

			@Override
			protected void updateToPass(InfantTransfer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantTransferOperations.validateInfantTransferClassCode(
					(InfantTransfer) objectToTest, diagnostician, map);
			}

		};

		validateInfantTransferClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantTransferMoodCode() {
		OperationsTestCase<InfantTransfer> validateInfantTransferMoodCodeTestCase = new OperationsTestCase<InfantTransfer>(
			"validateInfantTransferMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantTransfer target) {

			}

			@Override
			protected void updateToPass(InfantTransfer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantTransferOperations.validateInfantTransferMoodCode(
					(InfantTransfer) objectToTest, diagnostician, map);
			}

		};

		validateInfantTransferMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantTransferCodeP() {
		OperationsTestCase<InfantTransfer> validateInfantTransferCodePTestCase = new OperationsTestCase<InfantTransfer>(
			"validateInfantTransferCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantTransfer target) {

			}

			@Override
			protected void updateToPass(InfantTransfer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantTransferOperations.validateInfantTransferCodeP(
					(InfantTransfer) objectToTest, diagnostician, map);
			}

		};

		validateInfantTransferCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantTransferCode() {
		OperationsTestCase<InfantTransfer> validateInfantTransferCodeTestCase = new OperationsTestCase<InfantTransfer>(
			"validateInfantTransferCode",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantTransfer target) {

			}

			@Override
			protected void updateToPass(InfantTransfer target) {
				target.init();

			}

			@Override
			protected void setDependency(InfantTransfer target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.vsbr.InfantTransferCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantTransferOperations.validateInfantTransferCode(
					(InfantTransfer) objectToTest, diagnostician, map);
			}

		};

		validateInfantTransferCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantTransferValue() {
		OperationsTestCase<InfantTransfer> validateInfantTransferValueTestCase = new OperationsTestCase<InfantTransfer>(
			"validateInfantTransferValue",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantTransfer target) {

			}

			@Override
			protected void updateToPass(InfantTransfer target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantTransferOperations.validateInfantTransferValue(
					(InfantTransfer) objectToTest, diagnostician, map);
			}

		};

		validateInfantTransferValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantTransferParticipant() {
		OperationsTestCase<InfantTransfer> validateInfantTransferParticipantTestCase = new OperationsTestCase<InfantTransfer>(
			"validateInfantTransferParticipant",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantTransfer target) {

			}

			@Override
			protected void updateToPass(InfantTransfer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantTransferOperations.validateInfantTransferParticipant(
					(InfantTransfer) objectToTest, diagnostician, map);
			}

		};

		validateInfantTransferParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InfantTransferOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InfantTransfer> {
		public InfantTransfer create() {
			return VsbrFactory.eINSTANCE.createInfantTransfer();
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
	private static class ConstructorTestClass extends InfantTransferOperations {
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

} // InfantTransferOperations
