
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
import org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.operations.DeviceIdentifierObservationV2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Device Identifier Observation V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2IIUDIissuingagency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2IIUD Iissuingagency</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2IIRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2II Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2IIExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2II Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2IIDisplayable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2II Displayable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DeviceIdentifierObservationV2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDeviceIdentifierObservationV2TemplateId() {
		OperationsTestCase<DeviceIdentifierObservationV2> validateDeviceIdentifierObservationV2TemplateIdTestCase = new OperationsTestCase<DeviceIdentifierObservationV2>(
			"validateDeviceIdentifierObservationV2TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservationV2 target) {

			}

			@Override
			protected void updateToPass(DeviceIdentifierObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2TemplateId(
					(DeviceIdentifierObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationV2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDeviceIdentifierObservationV2CodeP() {
		OperationsTestCase<DeviceIdentifierObservationV2> validateDeviceIdentifierObservationV2CodePTestCase = new OperationsTestCase<DeviceIdentifierObservationV2>(
			"validateDeviceIdentifierObservationV2CodeP", operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservationV2 target) {

			}

			@Override
			protected void updateToPass(DeviceIdentifierObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2CodeP(
					(DeviceIdentifierObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationV2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDeviceIdentifierObservationV2Code() {
		OperationsTestCase<DeviceIdentifierObservationV2> validateDeviceIdentifierObservationV2CodeTestCase = new OperationsTestCase<DeviceIdentifierObservationV2>(
			"validateDeviceIdentifierObservationV2Code", operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservationV2 target) {

			}

			@Override
			protected void updateToPass(DeviceIdentifierObservationV2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("C160939", "2.16.840.1.113883.3.26.1.1");
				target.getValues().add(value);

			}

			@Override
			protected void setDependency(DeviceIdentifierObservationV2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2Code(
					(DeviceIdentifierObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationV2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDeviceIdentifierObservationV2Value() {
		OperationsTestCase<DeviceIdentifierObservationV2> validateDeviceIdentifierObservationV2ValueTestCase = new OperationsTestCase<DeviceIdentifierObservationV2>(
			"validateDeviceIdentifierObservationV2Value", operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservationV2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(DeviceIdentifierObservationV2 target) {
				target.getValues().clear();

				II value = DatatypesFactory.eINSTANCE.createII();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2Value(
					(DeviceIdentifierObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationV2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDeviceIdentifierObservationV2IIUDIissuingagency() {
		OperationsTestCase<DeviceIdentifierObservationV2> validateDeviceIdentifierObservationV2IIUDIissuingagencyTestCase = new OperationsTestCase<DeviceIdentifierObservationV2>(
			"validateDeviceIdentifierObservationV2IIUDIissuingagency",
			operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservationV2 target) {
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
					public void updateToPass(DeviceIdentifierObservationV2 target) {
						target.getValues().clear();
						II ii = DatatypesFactory.eINSTANCE.createII();
						ii.setRoot("1.3.160");
						target.getValues().add(ii);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DeviceIdentifierObservationV2 target) {
						target.getValues().clear();
						II ii = DatatypesFactory.eINSTANCE.createII();
						ii.setRoot("2.16.840.1.113883.6.18");
						target.getValues().add(ii);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DeviceIdentifierObservationV2 target) {
						target.getValues().clear();
						II ii = DatatypesFactory.eINSTANCE.createII();
						ii.setRoot("2.16.840.1.113883.6.40");
						target.getValues().add(ii);
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2IIUDIissuingagency(
					(DeviceIdentifierObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationV2IIUDIissuingagencyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDeviceIdentifierObservationV2IIRoot() {
		OperationsTestCase<DeviceIdentifierObservationV2> validateDeviceIdentifierObservationV2IIRootTestCase = new OperationsTestCase<DeviceIdentifierObservationV2>(
			"validateDeviceIdentifierObservationV2IIRoot", operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservationV2 target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getValues().add(ii);
			}

			@Override
			protected void updateToPass(DeviceIdentifierObservationV2 target) {

				target.getValues().clear();
				II ii = DatatypesFactory.eINSTANCE.createII();
				ii.setRoot("root");
				target.getValues().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2IIRoot(
					(DeviceIdentifierObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationV2IIRootTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDeviceIdentifierObservationV2IIExtension() {
		OperationsTestCase<DeviceIdentifierObservationV2> validateDeviceIdentifierObservationV2IIExtensionTestCase = new OperationsTestCase<DeviceIdentifierObservationV2>(
			"validateDeviceIdentifierObservationV2IIExtension",
			operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeviceIdentifierObservationV2 target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getValues().add(ii);
			}

			@Override
			protected void updateToPass(DeviceIdentifierObservationV2 target) {
				target.getValues().clear();
				II ii = DatatypesFactory.eINSTANCE.createII();
				ii.setExtension("extension");
				target.getValues().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2IIExtension(
					(DeviceIdentifierObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationV2IIExtensionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDeviceIdentifierObservationV2IIDisplayable() {
		OperationsTestCase<DeviceIdentifierObservationV2> validateDeviceIdentifierObservationV2IIDisplayableTestCase = new OperationsTestCase<DeviceIdentifierObservationV2>(
			"validateDeviceIdentifierObservationV2IIDisplayable",
			operationsForOCL.getOCLValue(
				"VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DeviceIdentifierObservationV2 target) {
						target.init();
						II ii = DatatypesFactory.eINSTANCE.createII();
						target.getValues().add(ii);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DeviceIdentifierObservationV2 target) {
						target.init();
						II ii = DatatypesFactory.eINSTANCE.createII();
						ii.setDisplayable(false);
						target.getValues().add(ii);
					}
				});

			}

			@Override
			protected void updateToPass(DeviceIdentifierObservationV2 target) {

				target.getValues().clear();
				II ii = DatatypesFactory.eINSTANCE.createII();
				ii.setDisplayable(true);
				target.getValues().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2IIDisplayable(
					(DeviceIdentifierObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateDeviceIdentifierObservationV2IIDisplayableTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DeviceIdentifierObservationV2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<DeviceIdentifierObservationV2> {
		public DeviceIdentifierObservationV2 create() {
			return ConsolFactory.eINSTANCE.createDeviceIdentifierObservationV2();
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
	private static class ConstructorTestClass extends DeviceIdentifierObservationV2Operations {
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

} // DeviceIdentifierObservationV2Operations
