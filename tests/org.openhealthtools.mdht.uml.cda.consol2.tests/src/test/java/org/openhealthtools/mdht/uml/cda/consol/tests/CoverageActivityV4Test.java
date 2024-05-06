
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.CoverageActivityV4;
import org.openhealthtools.mdht.uml.cda.consol.operations.CoverageActivityV4Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Activity V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivityV4#validateCoverageActivityV4EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity V4 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivityV4#validateCoverageActivityV4IVLTSValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity V4IVLTS Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivityV4#validateCoverageActivity2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CoverageActivityV4Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCoverageActivityV4EffectiveTime() {
		OperationsTestCase<CoverageActivityV4> validateCoverageActivityV4EffectiveTimeTestCase = new OperationsTestCase<CoverageActivityV4>(
			"validateCoverageActivityV4EffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_COVERAGE_ACTIVITY_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivityV4 target) {

			}

			@Override
			protected void updateToPass(CoverageActivityV4 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivityV4Operations.validateCoverageActivityV4EffectiveTime(
					(CoverageActivityV4) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivityV4EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCoverageActivityV4IVLTSValue() {
		OperationsTestCase<CoverageActivityV4> validateCoverageActivityV4IVLTSValueTestCase = new OperationsTestCase<CoverageActivityV4>(
			"validateCoverageActivityV4IVLTSValue",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_V4IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivityV4 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(CoverageActivityV4 target) {
				target.getEffectiveTime().setValue("2012");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivityV4Operations.validateCoverageActivityV4IVLTSValue(
					(CoverageActivityV4) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivityV4IVLTSValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCoverageActivity2TemplateId() {
		OperationsTestCase<CoverageActivityV4> validateCoverageActivity2TemplateIdTestCase = new OperationsTestCase<CoverageActivityV4>(
			"validateCoverageActivity2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ACTIVITY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivityV4 target) {

			}

			@Override
			protected void updateToPass(CoverageActivityV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivityV4Operations.validateCoverageActivity2TemplateId(
					(CoverageActivityV4) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivity2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CoverageActivityV4Operations {
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
	private static class ObjectFactory implements TestObjectFactory<CoverageActivityV4> {
		public CoverageActivityV4 create() {
			return ConsolFactory.eINSTANCE.createCoverageActivityV4();
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
	private static class ConstructorTestClass extends CoverageActivityV4Operations {
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

} // CoverageActivityV4Operations
