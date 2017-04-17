
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.CongenitalAnomalyOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Congenital Anomaly</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyDownConfirmationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Down Confirmation Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Chromosomal Disorder Confirmation Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CongenitalAnomalyTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCongenitalAnomalyTemplateId() {
		OperationsTestCase<CongenitalAnomaly> validateCongenitalAnomalyTemplateIdTestCase = new OperationsTestCase<CongenitalAnomaly>(
			"validateCongenitalAnomalyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CONGENITAL_ANOMALY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CongenitalAnomaly target) {

			}

			@Override
			protected void updateToPass(CongenitalAnomaly target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CongenitalAnomalyOperations.validateCongenitalAnomalyTemplateId(
					(CongenitalAnomaly) objectToTest, diagnostician, map);
			}

		};

		validateCongenitalAnomalyTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCongenitalAnomalyClassCode() {
		OperationsTestCase<CongenitalAnomaly> validateCongenitalAnomalyClassCodeTestCase = new OperationsTestCase<CongenitalAnomaly>(
			"validateCongenitalAnomalyClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CONGENITAL_ANOMALY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CongenitalAnomaly target) {

			}

			@Override
			protected void updateToPass(CongenitalAnomaly target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CongenitalAnomalyOperations.validateCongenitalAnomalyClassCode(
					(CongenitalAnomaly) objectToTest, diagnostician, map);
			}

		};

		validateCongenitalAnomalyClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCongenitalAnomalyMoodCode() {
		OperationsTestCase<CongenitalAnomaly> validateCongenitalAnomalyMoodCodeTestCase = new OperationsTestCase<CongenitalAnomaly>(
			"validateCongenitalAnomalyMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CONGENITAL_ANOMALY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CongenitalAnomaly target) {

			}

			@Override
			protected void updateToPass(CongenitalAnomaly target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CongenitalAnomalyOperations.validateCongenitalAnomalyMoodCode(
					(CongenitalAnomaly) objectToTest, diagnostician, map);
			}

		};

		validateCongenitalAnomalyMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCongenitalAnomalyCodeP() {
		OperationsTestCase<CongenitalAnomaly> validateCongenitalAnomalyCodePTestCase = new OperationsTestCase<CongenitalAnomaly>(
			"validateCongenitalAnomalyCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CONGENITAL_ANOMALY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CongenitalAnomaly target) {

			}

			@Override
			protected void updateToPass(CongenitalAnomaly target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CongenitalAnomalyOperations.validateCongenitalAnomalyCodeP(
					(CongenitalAnomaly) objectToTest, diagnostician, map);
			}

		};

		validateCongenitalAnomalyCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCongenitalAnomalyCode() {
		OperationsTestCase<CongenitalAnomaly> validateCongenitalAnomalyCodeTestCase = new OperationsTestCase<CongenitalAnomaly>(
			"validateCongenitalAnomalyCode",
			operationsForOCL.getOCLValue("VALIDATE_CONGENITAL_ANOMALY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CongenitalAnomaly target) {

			}

			@Override
			protected void updateToPass(CongenitalAnomaly target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CongenitalAnomalyOperations.validateCongenitalAnomalyCode(
					(CongenitalAnomaly) objectToTest, diagnostician, map);
			}

		};

		validateCongenitalAnomalyCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCongenitalAnomalyCodeVS() {
		OperationsTestCase<CongenitalAnomaly> validateCongenitalAnomalyCodeVSTestCase = new OperationsTestCase<CongenitalAnomaly>(
			"validateCongenitalAnomalyCodeVS",
			operationsForOCL.getOCLValue("VALIDATE_CONGENITAL_ANOMALY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CongenitalAnomaly target) {

			}

			@Override
			protected void updateToPass(CongenitalAnomaly target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CongenitalAnomalyOperations.validateCongenitalAnomalyCodeVS(
					(CongenitalAnomaly) objectToTest, diagnostician, map);
			}

		};

		validateCongenitalAnomalyCodeVSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCongenitalAnomalyValue() {
		OperationsTestCase<CongenitalAnomaly> validateCongenitalAnomalyValueTestCase = new OperationsTestCase<CongenitalAnomaly>(
			"validateCongenitalAnomalyValue",
			operationsForOCL.getOCLValue("VALIDATE_CONGENITAL_ANOMALY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CongenitalAnomaly target) {

			}

			@Override
			protected void updateToPass(CongenitalAnomaly target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CongenitalAnomalyOperations.validateCongenitalAnomalyValue(
					(CongenitalAnomaly) objectToTest, diagnostician, map);
			}

		};

		validateCongenitalAnomalyValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCongenitalAnomalyValueP() {
		OperationsTestCase<CongenitalAnomaly> validateCongenitalAnomalyValuePTestCase = new OperationsTestCase<CongenitalAnomaly>(
			"validateCongenitalAnomalyValueP",
			operationsForOCL.getOCLValue("VALIDATE_CONGENITAL_ANOMALY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CongenitalAnomaly target) {

			}

			@Override
			protected void updateToPass(CongenitalAnomaly target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CongenitalAnomalyOperations.validateCongenitalAnomalyValueP(
					(CongenitalAnomaly) objectToTest, diagnostician, map);
			}

		};

		validateCongenitalAnomalyValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCongenitalAnomalyDownConfirmationAssociation() {
		OperationsTestCase<CongenitalAnomaly> validateCongenitalAnomalyDownConfirmationAssociationTestCase = new OperationsTestCase<CongenitalAnomaly>(
			"validateCongenitalAnomalyDownConfirmationAssociation",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONGENITAL_ANOMALY_DOWN_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CongenitalAnomaly target) {

			}

			@Override
			protected void updateToPass(CongenitalAnomaly target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CongenitalAnomalyOperations.validateCongenitalAnomalyDownConfirmationAssociation(
					(CongenitalAnomaly) objectToTest, diagnostician, map);
			}

		};

		validateCongenitalAnomalyDownConfirmationAssociationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCongenitalAnomalyChromosomalDisorderConfirmationAssociation() {
		OperationsTestCase<CongenitalAnomaly> validateCongenitalAnomalyChromosomalDisorderConfirmationAssociationTestCase = new OperationsTestCase<CongenitalAnomaly>(
			"validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONGENITAL_ANOMALY_CHROMOSOMAL_DISORDER_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CongenitalAnomaly target) {

			}

			@Override
			protected void updateToPass(CongenitalAnomaly target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CongenitalAnomalyOperations.validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(
					(CongenitalAnomaly) objectToTest, diagnostician, map);
			}

		};

		validateCongenitalAnomalyChromosomalDisorderConfirmationAssociationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CongenitalAnomalyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CongenitalAnomaly> {
		public CongenitalAnomaly create() {
			return VsbrFactory.eINSTANCE.createCongenitalAnomaly();
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
	private static class ConstructorTestClass extends CongenitalAnomalyOperations {
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

} // CongenitalAnomalyOperations
