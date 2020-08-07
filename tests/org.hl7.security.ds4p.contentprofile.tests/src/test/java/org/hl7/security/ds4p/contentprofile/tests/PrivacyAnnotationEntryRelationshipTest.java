
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.PrivacyAnnotationEntryRelationship;
import org.hl7.security.ds4p.contentprofile.operations.PrivacyAnnotationEntryRelationshipOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Annotation Entry Relationship</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotationEntryRelationship#validatePrivacyAnnotationEntryRelationshipTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Entry Relationship Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotationEntryRelationship#validatePrivacyAnnotationEntryRelationshipOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Entry Relationship Organizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PrivacyAnnotationEntryRelationshipTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacyAnnotationEntryRelationshipTemplateId() {
		OperationsTestCase<PrivacyAnnotationEntryRelationship> validatePrivacyAnnotationEntryRelationshipTemplateIdTestCase = new OperationsTestCase<PrivacyAnnotationEntryRelationship>(
			"validatePrivacyAnnotationEntryRelationshipTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyAnnotationEntryRelationship target) {

			}

			@Override
			protected void updateToPass(PrivacyAnnotationEntryRelationship target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyAnnotationEntryRelationshipOperations.validatePrivacyAnnotationEntryRelationshipTemplateId(
					(PrivacyAnnotationEntryRelationship) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyAnnotationEntryRelationshipTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidatePrivacyAnnotationEntryRelationshipOrganizer() {
		OperationsTestCase<PrivacyAnnotationEntryRelationship> validatePrivacyAnnotationEntryRelationshipOrganizerTestCase = new OperationsTestCase<PrivacyAnnotationEntryRelationship>(
			"validatePrivacyAnnotationEntryRelationshipOrganizer",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyAnnotationEntryRelationship target) {

			}

			@Override
			protected void updateToPass(PrivacyAnnotationEntryRelationship target) {

				target.init();
				target.setOrganizer(CONTENTPROFILEFactory.eINSTANCE.createPrivacyAnnotation());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyAnnotationEntryRelationshipOperations.validatePrivacyAnnotationEntryRelationshipOrganizer(
					(PrivacyAnnotationEntryRelationship) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyAnnotationEntryRelationshipOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PrivacyAnnotationEntryRelationshipOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PrivacyAnnotationEntryRelationship> {
		public PrivacyAnnotationEntryRelationship create() {
			return CONTENTPROFILEFactory.eINSTANCE.createPrivacyAnnotationEntryRelationship();
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
	private static class ConstructorTestClass extends PrivacyAnnotationEntryRelationshipOperations {
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

} // PrivacyAnnotationEntryRelationshipOperations
