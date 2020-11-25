
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
import org.openhealthtools.mdht.uml.cda.consol.CompanyNameObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CompanyNameObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Company Name Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CompanyNameObservation#validateCompanyNameObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Company Name Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CompanyNameObservation#validateCompanyNameObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Company Name Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CompanyNameObservation#validateCompanyNameObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Company Name Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CompanyNameObservation#validateCompanyNameObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Company Name Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CompanyNameObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCompanyNameObservationTemplateId() {
		OperationsTestCase<CompanyNameObservation> validateCompanyNameObservationTemplateIdTestCase = new OperationsTestCase<CompanyNameObservation>(
			"validateCompanyNameObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_COMPANY_NAME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CompanyNameObservation target) {

			}

			@Override
			protected void updateToPass(CompanyNameObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CompanyNameObservationOperations.validateCompanyNameObservationTemplateId(
					(CompanyNameObservation) objectToTest, diagnostician, map);
			}

		};

		validateCompanyNameObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCompanyNameObservationCodeP() {
		OperationsTestCase<CompanyNameObservation> validateCompanyNameObservationCodePTestCase = new OperationsTestCase<CompanyNameObservation>(
			"validateCompanyNameObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COMPANY_NAME_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CompanyNameObservation target) {

			}

			@Override
			protected void updateToPass(CompanyNameObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CompanyNameObservationOperations.validateCompanyNameObservationCodeP(
					(CompanyNameObservation) objectToTest, diagnostician, map);
			}

		};

		validateCompanyNameObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCompanyNameObservationCode() {
		OperationsTestCase<CompanyNameObservation> validateCompanyNameObservationCodeTestCase = new OperationsTestCase<CompanyNameObservation>(
			"validateCompanyNameObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPANY_NAME_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CompanyNameObservation target) {

			}

			@Override
			protected void updateToPass(CompanyNameObservation target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCD();

			}

			@Override
			protected void setDependency(CompanyNameObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CompanyNameObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CompanyNameObservationOperations.validateCompanyNameObservationCode(
					(CompanyNameObservation) objectToTest, diagnostician, map);
			}

		};

		validateCompanyNameObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCompanyNameObservationValue() {
		OperationsTestCase<CompanyNameObservation> validateCompanyNameObservationValueTestCase = new OperationsTestCase<CompanyNameObservation>(
			"validateCompanyNameObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_COMPANY_NAME_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CompanyNameObservation target) {

			}

			@Override
			protected void updateToPass(CompanyNameObservation target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCD();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CompanyNameObservationOperations.validateCompanyNameObservationValue(
					(CompanyNameObservation) objectToTest, diagnostician, map);
			}

		};

		validateCompanyNameObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CompanyNameObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CompanyNameObservation> {
		public CompanyNameObservation create() {
			return ConsolFactory.eINSTANCE.createCompanyNameObservation();
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
	private static class ConstructorTestClass extends CompanyNameObservationOperations {
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

} // CompanyNameObservationOperations
