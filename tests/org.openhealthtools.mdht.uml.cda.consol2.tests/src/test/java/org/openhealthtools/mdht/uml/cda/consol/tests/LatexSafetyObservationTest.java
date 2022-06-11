
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
import org.openhealthtools.mdht.uml.cda.consol.LatexSafetyObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.LatexSafetyObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Latex Safety Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LatexSafetyObservation#validateLatexSafetyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Latex Safety Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LatexSafetyObservation#validateLatexSafetyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Latex Safety Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LatexSafetyObservation#validateLatexSafetyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Latex Safety Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LatexSafetyObservation#validateLatexSafetyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Latex Safety Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LatexSafetyObservation#validateLatexSafetyObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Latex Safety Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LatexSafetyObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLatexSafetyObservationTemplateId() {
		OperationsTestCase<LatexSafetyObservation> validateLatexSafetyObservationTemplateIdTestCase = new OperationsTestCase<LatexSafetyObservation>(
			"validateLatexSafetyObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_LATEX_SAFETY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LatexSafetyObservation target) {

			}

			@Override
			protected void updateToPass(LatexSafetyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LatexSafetyObservationOperations.validateLatexSafetyObservationTemplateId(
					(LatexSafetyObservation) objectToTest, diagnostician, map);
			}

		};

		validateLatexSafetyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLatexSafetyObservationCodeP() {
		OperationsTestCase<LatexSafetyObservation> validateLatexSafetyObservationCodePTestCase = new OperationsTestCase<LatexSafetyObservation>(
			"validateLatexSafetyObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_LATEX_SAFETY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LatexSafetyObservation target) {

			}

			@Override
			protected void updateToPass(LatexSafetyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LatexSafetyObservationOperations.validateLatexSafetyObservationCodeP(
					(LatexSafetyObservation) objectToTest, diagnostician, map);
			}

		};

		validateLatexSafetyObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateLatexSafetyObservationCode() {
		OperationsTestCase<LatexSafetyObservation> validateLatexSafetyObservationCodeTestCase = new OperationsTestCase<LatexSafetyObservation>(
			"validateLatexSafetyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_LATEX_SAFETY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LatexSafetyObservation target) {

			}

			@Override
			protected void updateToPass(LatexSafetyObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("C160939", "2.16.840.1.113883.3.26.1.1");
				target.getValues().add(value);
			}

			@Override
			protected void setDependency(LatexSafetyObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.LatexSafetyObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LatexSafetyObservationOperations.validateLatexSafetyObservationCode(
					(LatexSafetyObservation) objectToTest, diagnostician, map);
			}

		};

		validateLatexSafetyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateLatexSafetyObservationValue() {
		OperationsTestCase<LatexSafetyObservation> validateLatexSafetyObservationValueTestCase = new OperationsTestCase<LatexSafetyObservation>(
			"validateLatexSafetyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_LATEX_SAFETY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LatexSafetyObservation target) {

			}

			@Override
			protected void updateToPass(LatexSafetyObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("C106043", "2.16.840.1.113883.3.26.1.1");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LatexSafetyObservationOperations.validateLatexSafetyObservationValue(
					(LatexSafetyObservation) objectToTest, diagnostician, map);
			}

		};

		validateLatexSafetyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateLatexSafetyObservationValueP() {
		OperationsTestCase<LatexSafetyObservation> validateLatexSafetyObservationValuePTestCase = new OperationsTestCase<LatexSafetyObservation>(
			"validateLatexSafetyObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_LATEX_SAFETY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LatexSafetyObservation target) {

			}

			@Override
			protected void updateToPass(LatexSafetyObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LatexSafetyObservationOperations.validateLatexSafetyObservationValueP(
					(LatexSafetyObservation) objectToTest, diagnostician, map);
			}

		};

		validateLatexSafetyObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LatexSafetyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LatexSafetyObservation> {
		public LatexSafetyObservation create() {
			return ConsolFactory.eINSTANCE.createLatexSafetyObservation();
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
	private static class ConstructorTestClass extends LatexSafetyObservationOperations {
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

} // LatexSafetyObservationOperations
