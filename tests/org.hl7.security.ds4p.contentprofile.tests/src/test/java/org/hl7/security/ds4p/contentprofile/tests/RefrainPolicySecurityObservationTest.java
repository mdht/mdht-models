
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation;
import org.hl7.security.ds4p.contentprofile.operations.RefrainPolicySecurityObservationOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Refrain Policy Security Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation#validateSecurityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation#validateSecurityObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation#validateSecurityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation#validateSecurityObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Value P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation#validateSecurityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RefrainPolicySecurityObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSecurityObservationTemplateId() {
		OperationsTestCase<RefrainPolicySecurityObservation> validateSecurityObservationTemplateIdTestCase = new OperationsTestCase<RefrainPolicySecurityObservation>(
			"validateSecurityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RefrainPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(RefrainPolicySecurityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RefrainPolicySecurityObservationOperations.validateSecurityObservationTemplateId(
					(RefrainPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSecurityObservationCodeP() {
		OperationsTestCase<RefrainPolicySecurityObservation> validateSecurityObservationCodePTestCase = new OperationsTestCase<RefrainPolicySecurityObservation>(
			"validateSecurityObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RefrainPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(RefrainPolicySecurityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RefrainPolicySecurityObservationOperations.validateSecurityObservationCodeP(
					(RefrainPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateSecurityObservationCode() {
		OperationsTestCase<RefrainPolicySecurityObservation> validateSecurityObservationCodeTestCase = new OperationsTestCase<RefrainPolicySecurityObservation>(
			"validateSecurityObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RefrainPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(RefrainPolicySecurityObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("SECCONOBS", "2.16.840.1.113883.1.11.20457");

				target.setCode(cd);

			}

			@Override
			protected void setDependency(RefrainPolicySecurityObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.hl7.security.ds4p.contentprofile.SecurityObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RefrainPolicySecurityObservationOperations.validateSecurityObservationCode(
					(RefrainPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateSecurityObservationValueP() {
		OperationsTestCase<RefrainPolicySecurityObservation> validateSecurityObservationValuePTestCase = new OperationsTestCase<RefrainPolicySecurityObservation>(
			"validateSecurityObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RefrainPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(RefrainPolicySecurityObservation target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RefrainPolicySecurityObservationOperations.validateSecurityObservationValueP(
					(RefrainPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateSecurityObservationValue() {
		OperationsTestCase<RefrainPolicySecurityObservation> validateSecurityObservationValueTestCase = new OperationsTestCase<RefrainPolicySecurityObservation>(
			"validateSecurityObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RefrainPolicySecurityObservation target) {
				CE value = DatatypesFactory.eINSTANCE.createCE("notNORDSLCD", "2.16.840.1.113883.5.1063");
				target.getValues().add(value);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("NORDSLCD", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("NOAUTH", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("NOCOLLECT", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("NOINTEGRATE", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("NOLIST", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("NOMOU", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("NOORGPOL", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("NOPERSISTP", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("NORDSCLW", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("NORELINK", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("NOREUSE", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("NOVIP", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(RefrainPolicySecurityObservation target) {
						target.init();
						CE value = DatatypesFactory.eINSTANCE.createCE("ORCON", "2.16.840.1.113883.5.1063");
						target.getValues().add(value);
					}
				});

			}

			/*
			 * NORDSLCD
			 */
			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#setDependency(java.lang.Object)
			 */
			// @Override
			// protected void updateToPass(RefrainPolicySecurityObservation target) {
			// target.init();
			//
			// target.getValues().clear();
			//
			// CE value = DatatypesFactory.eINSTANCE.createCE("NORDSLCD", "2.16.840.1.113883.5.1063");
			// target.getValues().add(value);
			//
			// }

			@Override
			protected void setDependency(RefrainPolicySecurityObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.hl7.security.ds4p.contentprofile.SecurityObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RefrainPolicySecurityObservationOperations.validateSecurityObservationValue(
					(RefrainPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RefrainPolicySecurityObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RefrainPolicySecurityObservation> {
		public RefrainPolicySecurityObservation create() {
			return CONTENTPROFILEFactory.eINSTANCE.createRefrainPolicySecurityObservation();
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
	private static class ConstructorTestClass extends RefrainPolicySecurityObservationOperations {
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

} // RefrainPolicySecurityObservationOperations
