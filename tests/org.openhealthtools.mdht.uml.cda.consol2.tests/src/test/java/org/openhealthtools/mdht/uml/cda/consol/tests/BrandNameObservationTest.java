
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
import org.openhealthtools.mdht.uml.cda.consol.BrandNameObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.BrandNameObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Brand Name Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BrandNameObservation#validateBrandNameObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Brand Name Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BrandNameObservation#validateBrandNameObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Brand Name Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BrandNameObservation#validateBrandNameObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Brand Name Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BrandNameObservation#validateBrandNameObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Brand Name Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class BrandNameObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBrandNameObservationTemplateId() {
		OperationsTestCase<BrandNameObservation> validateBrandNameObservationTemplateIdTestCase = new OperationsTestCase<BrandNameObservation>(
			"validateBrandNameObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_BRAND_NAME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BrandNameObservation target) {

			}

			@Override
			protected void updateToPass(BrandNameObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BrandNameObservationOperations.validateBrandNameObservationTemplateId(
					(BrandNameObservation) objectToTest, diagnostician, map);
			}

		};

		validateBrandNameObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBrandNameObservationCodeP() {
		OperationsTestCase<BrandNameObservation> validateBrandNameObservationCodePTestCase = new OperationsTestCase<BrandNameObservation>(
			"validateBrandNameObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_BRAND_NAME_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BrandNameObservation target) {

			}

			@Override
			protected void updateToPass(BrandNameObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BrandNameObservationOperations.validateBrandNameObservationCodeP(
					(BrandNameObservation) objectToTest, diagnostician, map);
			}

		};

		validateBrandNameObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBrandNameObservationCode() {
		OperationsTestCase<BrandNameObservation> validateBrandNameObservationCodeTestCase = new OperationsTestCase<BrandNameObservation>(
			"validateBrandNameObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_BRAND_NAME_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BrandNameObservation target) {

			}

			@Override
			protected void updateToPass(BrandNameObservation target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCD();

			}

			@Override
			protected void setDependency(BrandNameObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.BrandNameObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BrandNameObservationOperations.validateBrandNameObservationCode(
					(BrandNameObservation) objectToTest, diagnostician, map);
			}

		};

		validateBrandNameObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBrandNameObservationValue() {
		OperationsTestCase<BrandNameObservation> validateBrandNameObservationValueTestCase = new OperationsTestCase<BrandNameObservation>(
			"validateBrandNameObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_BRAND_NAME_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BrandNameObservation target) {

			}

			@Override
			protected void updateToPass(BrandNameObservation target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCD();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BrandNameObservationOperations.validateBrandNameObservationValue(
					(BrandNameObservation) objectToTest, diagnostician, map);
			}

		};

		validateBrandNameObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends BrandNameObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BrandNameObservation> {
		public BrandNameObservation create() {
			return ConsolFactory.eINSTANCE.createBrandNameObservation();
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
	private static class ConstructorTestClass extends BrandNameObservationOperations {
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

} // BrandNameObservationOperations
