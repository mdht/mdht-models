
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
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.DeviceIdentifierObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Device Identifier Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationIIUDIissuingagency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation IIUD Iissuingagency</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationIIRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationIIExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationIIDisplayable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Displayable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DeviceIdentifierObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDeviceIdentifierObservationTemplateId() {
		OperationsTestCase<DeviceIdentifierObservation> validateDeviceIdentifierObservationTemplateIdTestCase = new OperationsTestCase<DeviceIdentifierObservation>(
			"validateDeviceIdentifierObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservation target) {

			}

			@Override
			protected void updateToPass(DeviceIdentifierObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationTemplateId(
					(DeviceIdentifierObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDeviceIdentifierObservationCodeP() {
		OperationsTestCase<DeviceIdentifierObservation> validateDeviceIdentifierObservationCodePTestCase = new OperationsTestCase<DeviceIdentifierObservation>(
			"validateDeviceIdentifierObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservation target) {

			}

			@Override
			protected void updateToPass(DeviceIdentifierObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationCodeP(
					(DeviceIdentifierObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDeviceIdentifierObservationCode() {
		OperationsTestCase<DeviceIdentifierObservation> validateDeviceIdentifierObservationCodeTestCase = new OperationsTestCase<DeviceIdentifierObservation>(
			"validateDeviceIdentifierObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservation target) {

			}

			@Override
			protected void updateToPass(DeviceIdentifierObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("C160939", "2.16.840.1.113883.3.26.1.1");
				target.getValues().add(value);

			}

			@Override
			protected void setDependency(DeviceIdentifierObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationCode(
					(DeviceIdentifierObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDeviceIdentifierObservationValue() {
		OperationsTestCase<DeviceIdentifierObservation> validateDeviceIdentifierObservationValueTestCase = new OperationsTestCase<DeviceIdentifierObservation>(
			"validateDeviceIdentifierObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservation target) {

			}

			@Override
			protected void updateToPass(DeviceIdentifierObservation target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getValues().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationValue(
					(DeviceIdentifierObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationValueTestCase.doValidationTest();
	}

	@Test
	public void foo() {
		String v = "123456";
		System.out.println(v.matches("\\b123456\\b"));
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDeviceIdentifierObservationIIUDIissuingagency() {
		OperationsTestCase<DeviceIdentifierObservation> validateDeviceIdentifierObservationIIUDIissuingagencyTestCase = new OperationsTestCase<DeviceIdentifierObservation>(
			"validateDeviceIdentifierObservationIIUDIissuingagency",
			operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservation target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII();

				ii.setRoot("NOTINVALUES");
				target.getValues().add(ii);
			}

			// @Override
			// protected void updateToPass(DeviceIdentifierObservation target) {
			//
			// target.getValues().clear();
			// II ii = DatatypesFactory.eINSTANCE.createII();
			// ii.setRoot("1.3.160");
			// target.getValues().add(ii);
			//
			// }

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DeviceIdentifierObservation target) {
						target.getValues().clear();
						II ii = DatatypesFactory.eINSTANCE.createII();
						ii.setRoot("1.3.160");
						target.getValues().add(ii);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DeviceIdentifierObservation target) {
						target.getValues().clear();
						II ii = DatatypesFactory.eINSTANCE.createII();
						ii.setRoot("2.16.840.1.113883.6.18");
						target.getValues().add(ii);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DeviceIdentifierObservation target) {
						target.getValues().clear();
						II ii = DatatypesFactory.eINSTANCE.createII();
						ii.setRoot("2.16.840.1.113883.6.40");
						target.getValues().add(ii);
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationIIUDIissuingagency(
					(DeviceIdentifierObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationIIUDIissuingagencyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDeviceIdentifierObservationIIRoot() {
		OperationsTestCase<DeviceIdentifierObservation> validateDeviceIdentifierObservationIIRootTestCase = new OperationsTestCase<DeviceIdentifierObservation>(
			"validateDeviceIdentifierObservationIIRoot", operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservation target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getValues().add(ii);
			}

			@Override
			protected void updateToPass(DeviceIdentifierObservation target) {

				target.getValues().clear();
				II ii = DatatypesFactory.eINSTANCE.createII();
				ii.setRoot("root");
				target.getValues().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationIIRoot(
					(DeviceIdentifierObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationIIRootTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDeviceIdentifierObservationIIExtension() {
		OperationsTestCase<DeviceIdentifierObservation> validateDeviceIdentifierObservationIIExtensionTestCase = new OperationsTestCase<DeviceIdentifierObservation>(
			"validateDeviceIdentifierObservationIIExtension", operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservation target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getValues().add(ii);
			}

			@Override
			protected void updateToPass(DeviceIdentifierObservation target) {
				target.getValues().clear();
				II ii = DatatypesFactory.eINSTANCE.createII();
				ii.setExtension("extension");
				target.getValues().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationIIExtension(
					(DeviceIdentifierObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationIIExtensionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDeviceIdentifierObservationIIDisplayable() {
		OperationsTestCase<DeviceIdentifierObservation> validateDeviceIdentifierObservationIIDisplayableTestCase = new OperationsTestCase<DeviceIdentifierObservation>(
			"validateDeviceIdentifierObservationIIDisplayable",
			operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// @Override
			// protected void updateToFail(DeviceIdentifierObservation target) {
			// target.init();
			// II ii = DatatypesFactory.eINSTANCE.createII();
			// target.getValues().add(ii);
			// }

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 */
			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DeviceIdentifierObservation target) {
						target.init();
						II ii = DatatypesFactory.eINSTANCE.createII();
						target.getValues().add(ii);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DeviceIdentifierObservation target) {
						target.init();
						II ii = DatatypesFactory.eINSTANCE.createII();
						ii.setDisplayable(false);
						target.getValues().add(ii);
					}
				});

			}

			@Override
			protected void updateToPass(DeviceIdentifierObservation target) {

				target.getValues().clear();
				II ii = DatatypesFactory.eINSTANCE.createII();
				ii.setDisplayable(true);
				target.getValues().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationIIDisplayable(
					(DeviceIdentifierObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationIIDisplayableTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DeviceIdentifierObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DeviceIdentifierObservation> {
		public DeviceIdentifierObservation create() {
			return ConsolFactory.eINSTANCE.createDeviceIdentifierObservation();
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
	private static class ConstructorTestClass extends DeviceIdentifierObservationOperations {
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

} // DeviceIdentifierObservationOperations
