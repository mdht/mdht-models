
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.HistoryofInfectionFetalDeathSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Historyof Infection Fetal Death Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection#validateHistoryofInfectionFetalDeathSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Fetal Death Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection#validateHistoryofInfectionFetalDeathSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Fetal Death Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection#validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Fetal Death Section Infection Present Fetal Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection#getInfectionPresentFetalDeaths() <em>Get Infection Present Fetal Deaths</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryofInfectionFetalDeathSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryofInfectionFetalDeathSectionTemplateId() {
		OperationsTestCase<HistoryofInfectionFetalDeathSection> validateHistoryofInfectionFetalDeathSectionTemplateIdTestCase = new OperationsTestCase<HistoryofInfectionFetalDeathSection>(
			"validateHistoryofInfectionFetalDeathSectionTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryofInfectionFetalDeathSection target) {

			}

			@Override
			protected void updateToPass(HistoryofInfectionFetalDeathSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryofInfectionFetalDeathSectionOperations.validateHistoryofInfectionFetalDeathSectionTemplateId(
					(HistoryofInfectionFetalDeathSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryofInfectionFetalDeathSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryofInfectionFetalDeathSectionCode() {
		OperationsTestCase<HistoryofInfectionFetalDeathSection> validateHistoryofInfectionFetalDeathSectionCodeTestCase = new OperationsTestCase<HistoryofInfectionFetalDeathSection>(
			"validateHistoryofInfectionFetalDeathSectionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryofInfectionFetalDeathSection target) {

			}

			@Override
			protected void updateToPass(HistoryofInfectionFetalDeathSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryofInfectionFetalDeathSectionOperations.validateHistoryofInfectionFetalDeathSectionCode(
					(HistoryofInfectionFetalDeathSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryofInfectionFetalDeathSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath() {
		OperationsTestCase<HistoryofInfectionFetalDeathSection> validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeathTestCase = new OperationsTestCase<HistoryofInfectionFetalDeathSection>(
			"validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_INFECTION_PRESENT_FETAL_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryofInfectionFetalDeathSection target) {

			}

			@Override
			protected void updateToPass(HistoryofInfectionFetalDeathSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryofInfectionFetalDeathSectionOperations.validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(
					(HistoryofInfectionFetalDeathSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeathTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetInfectionPresentFetalDeaths() {

		HistoryofInfectionFetalDeathSection target = objectFactory.create();
		target.getInfectionPresentFetalDeaths();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryofInfectionFetalDeathSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryofInfectionFetalDeathSection> {
		public HistoryofInfectionFetalDeathSection create() {
			return VsbrFactory.eINSTANCE.createHistoryofInfectionFetalDeathSection();
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
	private static class ConstructorTestClass extends HistoryofInfectionFetalDeathSectionOperations {
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

} // HistoryofInfectionFetalDeathSectionOperations
