
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseV4;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationDispenseV4Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Dispense V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseV4#validateMedicationDispenseV4CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense V4 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseV4#validateMedicationDispenseV4Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense V4 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseV4#validateMedicationDispense2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationDispenseV4Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationDispenseV4CodeP() {
		OperationsTestCase<MedicationDispenseV4> validateMedicationDispenseV4CodePTestCase = new OperationsTestCase<MedicationDispenseV4>(
			"validateMedicationDispenseV4CodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_V4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispenseV4 target) {

			}

			@Override
			protected void updateToPass(MedicationDispenseV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseV4Operations.validateMedicationDispenseV4CodeP(
					(MedicationDispenseV4) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseV4CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateMedicationDispenseV4Code() {
		OperationsTestCase<MedicationDispenseV4> validateMedicationDispenseV4CodeTestCase = new OperationsTestCase<MedicationDispenseV4>(
			"validateMedicationDispenseV4Code",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_V4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispenseV4 target) {

			}

			@Override
			protected void updateToPass(MedicationDispenseV4 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD("preparation", "2.16.840.1.113883.4.642.4.1313"));

			}

			@Override
			protected void setDependency(MedicationDispenseV4 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseV4CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseV4Operations.validateMedicationDispenseV4Code(
					(MedicationDispenseV4) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseV4CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationDispense2TemplateId() {
		OperationsTestCase<MedicationDispenseV4> validateMedicationDispense2TemplateIdTestCase = new OperationsTestCase<MedicationDispenseV4>(
			"validateMedicationDispense2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispenseV4 target) {

			}

			@Override
			protected void updateToPass(MedicationDispenseV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseV4Operations.validateMedicationDispense2TemplateId(
					(MedicationDispenseV4) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispense2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationDispenseV4Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationDispenseV4> {
		public MedicationDispenseV4 create() {
			return ConsolFactory.eINSTANCE.createMedicationDispenseV4();
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
	private static class ConstructorTestClass extends MedicationDispenseV4Operations {
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

} // MedicationDispenseV4Operations
