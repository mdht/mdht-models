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
import org.openhealthtools.mdht.uml.cda.consol.IndicationV3;
import org.openhealthtools.mdht.uml.cda.consol.operations.IndicationV3Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Indication V3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.IndicationV3#validateIndication2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.IndicationV3#validateIndicationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.IndicationV3#validateIndicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class IndicationV3Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateIndication2TemplateId() {
		OperationsTestCase<IndicationV3> validateIndication2TemplateIdTestCase = new OperationsTestCase<IndicationV3>(
			"validateIndication2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IndicationV3 target) {

			}

			@Override
			protected void updateToPass(IndicationV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationV3Operations.validateIndication2TemplateId(
					(IndicationV3) objectToTest, diagnostician, map);
			}

		};

		validateIndication2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateIndicationValueP() {
		OperationsTestCase<IndicationV3> validateIndicationValuePTestCase = new OperationsTestCase<IndicationV3>(
			"validateIndicationValueP",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IndicationV3 target) {

			}

			@Override
			protected void updateToPass(IndicationV3 target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationV3Operations.validateIndicationValueP((IndicationV3) objectToTest, diagnostician, map);
			}

		};

		validateIndicationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateIndicationValue() {
		OperationsTestCase<IndicationV3> validateIndicationValueTestCase = new OperationsTestCase<IndicationV3>(
			"validateIndicationValue",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(IndicationV3 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(IndicationV3 target) {
				CD cd = (CD) target.getValues().get(0);
				cd.setCodeSystem("ASDF");
			}

			@Override
			protected void setDependency(IndicationV3 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.IndicationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationV3Operations.validateIndicationValue((IndicationV3) objectToTest, diagnostician, map);
			}

		};

		validateIndicationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends IndicationV3Operations {
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
	private static class ObjectFactory implements TestObjectFactory<IndicationV3> {
		public IndicationV3 create() {
			return ConsolFactory.eINSTANCE.createIndicationV3();
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
	private static class ConstructorTestClass extends IndicationV3Operations {
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

} // IndicationV3Operations
