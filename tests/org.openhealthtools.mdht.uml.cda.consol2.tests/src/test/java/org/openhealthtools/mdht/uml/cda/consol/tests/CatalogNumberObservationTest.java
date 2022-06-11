
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
import org.openhealthtools.mdht.uml.cda.consol.CatalogNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CatalogNumberObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Catalog Number Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CatalogNumberObservation#validateCatalogNumberObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Catalog Number Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CatalogNumberObservation#validateCatalogNumberObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Catalog Number Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CatalogNumberObservation#validateCatalogNumberObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Catalog Number Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CatalogNumberObservation#validateCatalogNumberObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Catalog Number Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CatalogNumberObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCatalogNumberObservationTemplateId() {
		OperationsTestCase<CatalogNumberObservation> validateCatalogNumberObservationTemplateIdTestCase = new OperationsTestCase<CatalogNumberObservation>(
			"validateCatalogNumberObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_CATALOG_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CatalogNumberObservation target) {

			}

			@Override
			protected void updateToPass(CatalogNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CatalogNumberObservationOperations.validateCatalogNumberObservationTemplateId(
					(CatalogNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateCatalogNumberObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCatalogNumberObservationCodeP() {
		OperationsTestCase<CatalogNumberObservation> validateCatalogNumberObservationCodePTestCase = new OperationsTestCase<CatalogNumberObservation>(
			"validateCatalogNumberObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CATALOG_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CatalogNumberObservation target) {

			}

			@Override
			protected void updateToPass(CatalogNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CatalogNumberObservationOperations.validateCatalogNumberObservationCodeP(
					(CatalogNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateCatalogNumberObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCatalogNumberObservationCode() {
		OperationsTestCase<CatalogNumberObservation> validateCatalogNumberObservationCodeTestCase = new OperationsTestCase<CatalogNumberObservation>(
			"validateCatalogNumberObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_CATALOG_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CatalogNumberObservation target) {

			}

			@Override
			protected void updateToPass(CatalogNumberObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("C160939", "2.16.840.1.113883.3.26.1.1");
				target.getValues().add(value);

			}

			@Override
			protected void setDependency(CatalogNumberObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CatalogNumberObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CatalogNumberObservationOperations.validateCatalogNumberObservationCode(
					(CatalogNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateCatalogNumberObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCatalogNumberObservationValue() {
		OperationsTestCase<CatalogNumberObservation> validateCatalogNumberObservationValueTestCase = new OperationsTestCase<CatalogNumberObservation>(
			"validateCatalogNumberObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_CATALOG_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CatalogNumberObservation target) {

			}

			@Override
			protected void updateToPass(CatalogNumberObservation target) {
				target.init();

				target.getValues().add(DatatypesFactory.eINSTANCE.createED("CATALOGNUMBER"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CatalogNumberObservationOperations.validateCatalogNumberObservationValue(
					(CatalogNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateCatalogNumberObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CatalogNumberObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CatalogNumberObservation> {
		public CatalogNumberObservation create() {
			return ConsolFactory.eINSTANCE.createCatalogNumberObservation();
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
	private static class ConstructorTestClass extends CatalogNumberObservationOperations {
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

} // CatalogNumberObservationOperations
