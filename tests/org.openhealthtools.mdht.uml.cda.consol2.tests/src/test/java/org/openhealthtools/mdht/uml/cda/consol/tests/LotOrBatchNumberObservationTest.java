
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.LotOrBatchNumberObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Lot Or Batch Number Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservation#validateLotOrBatchNumberObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservation#validateLotOrBatchNumberObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservation#validateLotOrBatchNumberObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservation#validateLotOrBatchNumberObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LotOrBatchNumberObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLotOrBatchNumberObservationTemplateId() {
		OperationsTestCase<LotOrBatchNumberObservation> validateLotOrBatchNumberObservationTemplateIdTestCase = new OperationsTestCase<LotOrBatchNumberObservation>(
			"validateLotOrBatchNumberObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LotOrBatchNumberObservation target) {

			}

			@Override
			protected void updateToPass(LotOrBatchNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LotOrBatchNumberObservationOperations.validateLotOrBatchNumberObservationTemplateId(
					(LotOrBatchNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateLotOrBatchNumberObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLotOrBatchNumberObservationCodeP() {
		OperationsTestCase<LotOrBatchNumberObservation> validateLotOrBatchNumberObservationCodePTestCase = new OperationsTestCase<LotOrBatchNumberObservation>(
			"validateLotOrBatchNumberObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LotOrBatchNumberObservation target) {

			}

			@Override
			protected void updateToPass(LotOrBatchNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LotOrBatchNumberObservationOperations.validateLotOrBatchNumberObservationCodeP(
					(LotOrBatchNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateLotOrBatchNumberObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLotOrBatchNumberObservationCode() {
		OperationsTestCase<LotOrBatchNumberObservation> validateLotOrBatchNumberObservationCodeTestCase = new OperationsTestCase<LotOrBatchNumberObservation>(
			"validateLotOrBatchNumberObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LotOrBatchNumberObservation target) {

			}

			@Override
			protected void updateToPass(LotOrBatchNumberObservation target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCD();

			}

			@Override
			protected void setDependency(LotOrBatchNumberObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LotOrBatchNumberObservationOperations.validateLotOrBatchNumberObservationCode(
					(LotOrBatchNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateLotOrBatchNumberObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateLotOrBatchNumberObservationValue() {
		OperationsTestCase<LotOrBatchNumberObservation> validateLotOrBatchNumberObservationValueTestCase = new OperationsTestCase<LotOrBatchNumberObservation>(
			"validateLotOrBatchNumberObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LotOrBatchNumberObservation target) {

			}

			@Override
			protected void updateToPass(LotOrBatchNumberObservation target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createST("LOTNUMBER"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LotOrBatchNumberObservationOperations.validateLotOrBatchNumberObservationValue(
					(LotOrBatchNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateLotOrBatchNumberObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LotOrBatchNumberObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LotOrBatchNumberObservation> {
		public LotOrBatchNumberObservation create() {
			return ConsolFactory.eINSTANCE.createLotOrBatchNumberObservation();
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
	private static class ConstructorTestClass extends LotOrBatchNumberObservationOperations {
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

} // LotOrBatchNumberObservationOperations
