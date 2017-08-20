
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.PrivacyMarkingsEntry;
import org.hl7.security.ds4p.contentprofile.operations.PrivacyMarkingsEntryOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Markings Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsEntry#validatePrivacyMarkingsEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Entry Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsEntry#validatePrivacyMarkingsEntryOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Entry Organizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PrivacyMarkingsEntryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacyMarkingsEntryTemplateId() {
		OperationsTestCase<PrivacyMarkingsEntry> validatePrivacyMarkingsEntryTemplateIdTestCase = new OperationsTestCase<PrivacyMarkingsEntry>(
			"validatePrivacyMarkingsEntryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_MARKINGS_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyMarkingsEntry target) {

			}

			@Override
			protected void updateToPass(PrivacyMarkingsEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyMarkingsEntryOperations.validatePrivacyMarkingsEntryTemplateId(
					(PrivacyMarkingsEntry) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyMarkingsEntryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePrivacyMarkingsEntryOrganizer() {
		OperationsTestCase<PrivacyMarkingsEntry> validatePrivacyMarkingsEntryOrganizerTestCase = new OperationsTestCase<PrivacyMarkingsEntry>(
			"validatePrivacyMarkingsEntryOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_MARKINGS_ENTRY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyMarkingsEntry target) {

			}

			@Override
			protected void updateToPass(PrivacyMarkingsEntry target) {
				target.init();

				target.setOrganizer(CONTENTPROFILEFactory.eINSTANCE.createPrivacyAnnotation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyMarkingsEntryOperations.validatePrivacyMarkingsEntryOrganizer(
					(PrivacyMarkingsEntry) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyMarkingsEntryOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PrivacyMarkingsEntryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PrivacyMarkingsEntry> {
		public PrivacyMarkingsEntry create() {
			return CONTENTPROFILEFactory.eINSTANCE.createPrivacyMarkingsEntry();
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
	private static class ConstructorTestClass extends PrivacyMarkingsEntryOperations {
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

} // PrivacyMarkingsEntryOperations
