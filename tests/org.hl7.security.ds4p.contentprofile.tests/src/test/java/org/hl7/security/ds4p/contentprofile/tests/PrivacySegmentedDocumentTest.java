
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection;
import org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument;
import org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection;
import org.hl7.security.ds4p.contentprofile.operations.PrivacySegmentedDocumentOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Segmented Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument#validatePrivacySegmentedDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument#validatePrivacySegmentedDocumentAuthor1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Author1</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument#validatePrivacySegmentedDocumentSegmentedSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Segmented Section</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument#validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Document Privacy And Security Markings Section</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument#getSegmentedSections() <em>Get Segmented Sections</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument#getPrivacyAndSecurityMarkingsSections() <em>Get Privacy And Security Markings Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PrivacySegmentedDocumentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacySegmentedDocumentTemplateId() {
		OperationsTestCase<PrivacySegmentedDocument> validatePrivacySegmentedDocumentTemplateIdTestCase = new OperationsTestCase<PrivacySegmentedDocument>(
			"validatePrivacySegmentedDocumentTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacySegmentedDocument target) {

			}

			@Override
			protected void updateToPass(PrivacySegmentedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacySegmentedDocumentOperations.validatePrivacySegmentedDocumentTemplateId(
					(PrivacySegmentedDocument) objectToTest, diagnostician, map);
			}

		};

		validatePrivacySegmentedDocumentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidatePrivacySegmentedDocumentAuthor1() {
		OperationsTestCase<PrivacySegmentedDocument> validatePrivacySegmentedDocumentAuthor1TestCase = new OperationsTestCase<PrivacySegmentedDocument>(
			"validatePrivacySegmentedDocumentAuthor1",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_AUTHOR1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacySegmentedDocument target) {

			}

			@Override
			protected void updateToPass(PrivacySegmentedDocument target) {
				target.init();
				target.getAuthors().add(CONTENTPROFILEFactory.eINSTANCE.createMandatoryDocumentProvenance().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacySegmentedDocumentOperations.validatePrivacySegmentedDocumentAuthor1(
					(PrivacySegmentedDocument) objectToTest, diagnostician, map);
			}

		};

		validatePrivacySegmentedDocumentAuthor1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacySegmentedDocumentSegmentedSection() {
		OperationsTestCase<PrivacySegmentedDocument> validatePrivacySegmentedDocumentSegmentedSectionTestCase = new OperationsTestCase<PrivacySegmentedDocument>(
			"validatePrivacySegmentedDocumentSegmentedSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_SEGMENTED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacySegmentedDocument target) {

			}

			@Override
			protected void updateToPass(PrivacySegmentedDocument target) {
				target.init();

				/* SegmentedSection */
				PrivacySegmentedSection section =

						CONTENTPROFILEFactory.eINSTANCE.createPrivacySegmentedSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacySegmentedDocumentOperations.validatePrivacySegmentedDocumentSegmentedSection(
					(PrivacySegmentedDocument) objectToTest, diagnostician, map);
			}

		};

		validatePrivacySegmentedDocumentSegmentedSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection() {
		OperationsTestCase<PrivacySegmentedDocument> validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSectionTestCase = new OperationsTestCase<PrivacySegmentedDocument>(
			"validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIVACY_SEGMENTED_DOCUMENT_PRIVACY_AND_SECURITY_MARKINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacySegmentedDocument target) {

			}

			@Override
			protected void updateToPass(PrivacySegmentedDocument target) {
				target.init();

				/* PrivacyAndSecurityMarkingsSection */
				PrivacyMarkingsSection section =

						CONTENTPROFILEFactory.eINSTANCE.createPrivacyMarkingsSection().init();
				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacySegmentedDocumentOperations.validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(
					(PrivacySegmentedDocument) objectToTest, diagnostician, map);
			}

		};

		validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetSegmentedSections() {

		PrivacySegmentedDocument target = objectFactory.create();
		target.getSegmentedSections();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetPrivacyAndSecurityMarkingsSections() {

		PrivacySegmentedDocument target = objectFactory.create();
		target.getPrivacyAndSecurityMarkingsSections();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PrivacySegmentedDocumentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PrivacySegmentedDocument> {
		public PrivacySegmentedDocument create() {
			return CONTENTPROFILEFactory.eINSTANCE.createPrivacySegmentedDocument();
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
	private static class ConstructorTestClass extends PrivacySegmentedDocumentOperations {
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

} // PrivacySegmentedDocumentOperations
