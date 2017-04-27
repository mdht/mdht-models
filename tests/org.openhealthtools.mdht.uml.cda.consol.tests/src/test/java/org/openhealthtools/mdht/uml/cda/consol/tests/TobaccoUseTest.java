/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.consol.operations.TobaccoUseOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tobacco Use</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseCDCodeTermAssertionOrLoinc(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use CD Code Term Assertion Or Loinc</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use CD Code System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TobaccoUseTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTobaccoUseEffectiveTimeLow() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseEffectiveTimeLowTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseEffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {
				target.init();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				IVL_TS ts = target.getEffectiveTime();
				ts.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseEffectiveTimeLow(
					(TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTobaccoUseTemplateId() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseTemplateIdTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseTemplateId((TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTobaccoUseClassCode() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseClassCodeTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseClassCode",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseClassCode((TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTobaccoUseMoodCode() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseMoodCodeTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseMoodCode((TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTobaccoUseCode() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseCodeTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseCode",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseCode((TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTobaccoUseEffectiveTime() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseEffectiveTimeTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseEffectiveTime(
					(TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTobaccoUseStatusCode() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseStatusCodeTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseStatusCode((TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTobaccoUseStatusCodeP() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseStatusCodePTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseStatusCodeP(
					(TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTobaccoUseValue() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseValueTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseValue",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseValue((TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTobaccoUseValueP() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseValuePTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseValueP",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseValueP((TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTobaccoUseCDCodeTermAssertionOrLoinc() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseCDCodeTermAssertionOrLoincTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseCDCodeTermAssertionOrLoinc",
			operationsForOCL.getOCLValue(
				"VALIDATE_TOBACCO_USE_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TobaccoUse target) {
						// code with no @code or @codeSystem
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD());
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TobaccoUse target) {
						// invalid @code
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, "2.16.840.1.113883.5.4"));
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TobaccoUse target) {
						// invalid @codeSystem
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", BAD_CODESYSTEM_ID));
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TobaccoUse target) {
						// invalid @code and invalid @codeSystem
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, BAD_CODESYSTEM_ID));
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TobaccoUse target) {
						// old R1.1 way for backwards compatibility
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4"));
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TobaccoUse target) {
						// new R2.1 option (as per errata 596)
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("11367-0", LOINC_ID));
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseCDCodeTermAssertionOrLoinc(
					(TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseCDCodeTermAssertionOrLoincTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTobaccoUseCDCode() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseCDCodeTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseCDCode",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("mustExistOnly", BAD_CODESYSTEM_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseCDCode((TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseCDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTobaccoUseCDCodeSystem() {
		OperationsTestCase<TobaccoUse> validateTobaccoUseCDCodeSystemTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseCDCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, "mustExistOnly"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseCDCodeSystem(
					(TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseCDCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TobaccoUseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TobaccoUse> {
		public TobaccoUse create() {
			return ConsolFactory.eINSTANCE.createTobaccoUse();
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
	private static class ConstructorTestClass extends TobaccoUseOperations {
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

} // TobaccoUseOperations
