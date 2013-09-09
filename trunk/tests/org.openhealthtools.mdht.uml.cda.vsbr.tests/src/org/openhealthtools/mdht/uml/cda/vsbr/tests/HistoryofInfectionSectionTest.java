/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.HistoryofInfectionSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Historyof Infection Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection#validateHistoryofInfectionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection#validateHistoryofInfectionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection#validateHistoryofInfectionSectionInfectionsPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Section Infections Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection#getInfectionsPresents() <em>Get Infections Presents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryofInfectionSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryofInfectionSectionTemplateId() {
		OperationsTestCase<HistoryofInfectionSection> validateHistoryofInfectionSectionTemplateIdTestCase = new OperationsTestCase<HistoryofInfectionSection>(
			"validateHistoryofInfectionSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HISTORYOF_INFECTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryofInfectionSection target) {

			}

			@Override
			protected void updateToPass(HistoryofInfectionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryofInfectionSectionOperations.validateHistoryofInfectionSectionTemplateId(
					(HistoryofInfectionSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryofInfectionSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryofInfectionSectionText() {
		OperationsTestCase<HistoryofInfectionSection> validateHistoryofInfectionSectionTextTestCase = new OperationsTestCase<HistoryofInfectionSection>(
			"validateHistoryofInfectionSectionText",
			operationsForOCL.getOCLValue("VALIDATE_HISTORYOF_INFECTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryofInfectionSection target) {

			}

			@Override
			protected void updateToPass(HistoryofInfectionSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryofInfectionSectionOperations.validateHistoryofInfectionSectionText(
					(HistoryofInfectionSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryofInfectionSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryofInfectionSectionInfectionsPresent() {
		OperationsTestCase<HistoryofInfectionSection> validateHistoryofInfectionSectionInfectionsPresentTestCase = new OperationsTestCase<HistoryofInfectionSection>(
			"validateHistoryofInfectionSectionInfectionsPresent",
			operationsForOCL.getOCLValue("VALIDATE_HISTORYOF_INFECTION_SECTION_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryofInfectionSection target) {

			}

			@Override
			protected void updateToPass(HistoryofInfectionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryofInfectionSectionOperations.validateHistoryofInfectionSectionInfectionsPresent(
					(HistoryofInfectionSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryofInfectionSectionInfectionsPresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInfectionsPresents() {

		HistoryofInfectionSection target = objectFactory.create();
		target.getInfectionsPresents();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryofInfectionSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryofInfectionSection> {
		public HistoryofInfectionSection create() {
			return VsbrFactory.eINSTANCE.createHistoryofInfectionSection();
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
	private static class ConstructorTestClass extends HistoryofInfectionSectionOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // HistoryofInfectionSectionOperations
