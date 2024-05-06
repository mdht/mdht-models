
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderV4;
import org.openhealthtools.mdht.uml.cda.consol.operations.USRealmHeaderV4Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>US Realm Header V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderV4#validateUSRealmHeaderV4Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header V4 Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class USRealmHeaderV4Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUSRealmHeaderV4Participant() {
		OperationsTestCase<USRealmHeaderV4> validateUSRealmHeaderV4ParticipantTestCase = new OperationsTestCase<USRealmHeaderV4>(
			"validateUSRealmHeaderV4Participant",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER_V4_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderV4 target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderV4 target) {
				target.init();
				target.getParticipants().add(
					ConsolFactory.eINSTANCE.createRelatedPersonRelationshipandNameParticipant());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderV4Operations.validateUSRealmHeaderV4Participant(
					(USRealmHeaderV4) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderV4ParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends USRealmHeaderV4Operations {
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
	private static class ObjectFactory implements TestObjectFactory<USRealmHeaderV4> {
		public USRealmHeaderV4 create() {
			return ConsolFactory.eINSTANCE.createUSRealmHeaderV4();
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
	private static class ConstructorTestClass extends USRealmHeaderV4Operations {
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

} // USRealmHeaderV4Operations
