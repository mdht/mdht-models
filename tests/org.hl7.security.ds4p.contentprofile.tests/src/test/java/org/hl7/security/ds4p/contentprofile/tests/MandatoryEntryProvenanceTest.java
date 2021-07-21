
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance;
import org.hl7.security.ds4p.contentprofile.operations.MandatoryEntryProvenanceOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mandatory Entry Provenance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance#validateMandatoryEntryProvenanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Provenance Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance#validateMandatoryEntryProvenanceTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Provenance Time</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance#validateMandatoryEntryProvenanceAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Entry Provenance Assigned Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MandatoryEntryProvenanceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMandatoryEntryProvenanceTemplateId() {
		OperationsTestCase<MandatoryEntryProvenance> validateMandatoryEntryProvenanceTemplateIdTestCase = new OperationsTestCase<MandatoryEntryProvenance>(
			"validateMandatoryEntryProvenanceTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_ENTRY_PROVENANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MandatoryEntryProvenance target) {

			}

			@Override
			protected void updateToPass(MandatoryEntryProvenance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryEntryProvenanceOperations.validateMandatoryEntryProvenanceTemplateId(
					(MandatoryEntryProvenance) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryEntryProvenanceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateMandatoryEntryProvenanceTime() {
		OperationsTestCase<MandatoryEntryProvenance> validateMandatoryEntryProvenanceTimeTestCase = new OperationsTestCase<MandatoryEntryProvenance>(
			"validateMandatoryEntryProvenanceTime",
			operationsForOCL.getOCLValue("VALIDATE_MANDATORY_ENTRY_PROVENANCE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MandatoryEntryProvenance target) {

			}

			@Override
			protected void updateToPass(MandatoryEntryProvenance target) {
				target.init();
				target.setTime(DatatypesFactory.eINSTANCE.createTS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryEntryProvenanceOperations.validateMandatoryEntryProvenanceTime(
					(MandatoryEntryProvenance) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryEntryProvenanceTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateMandatoryEntryProvenanceAssignedAuthor() {
		OperationsTestCase<MandatoryEntryProvenance> validateMandatoryEntryProvenanceAssignedAuthorTestCase = new OperationsTestCase<MandatoryEntryProvenance>(
			"validateMandatoryEntryProvenanceAssignedAuthor", operationsForOCL.getOCLValue(
				"VALIDATE_MANDATORY_ENTRY_PROVENANCE_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MandatoryEntryProvenance target) {

			}

			@Override
			protected void updateToPass(MandatoryEntryProvenance target) {
				target.init();
				target.setAssignedAuthor(CONTENTPROFILEFactory.eINSTANCE.createMandatoryEntryAssignedAuthor().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MandatoryEntryProvenanceOperations.validateMandatoryEntryProvenanceAssignedAuthor(
					(MandatoryEntryProvenance) objectToTest, diagnostician, map);
			}

		};

		validateMandatoryEntryProvenanceAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MandatoryEntryProvenanceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MandatoryEntryProvenance> {
		public MandatoryEntryProvenance create() {
			return CONTENTPROFILEFactory.eINSTANCE.createMandatoryEntryProvenance();
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
	private static class ConstructorTestClass extends MandatoryEntryProvenanceOperations {
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

} // MandatoryEntryProvenanceOperations
