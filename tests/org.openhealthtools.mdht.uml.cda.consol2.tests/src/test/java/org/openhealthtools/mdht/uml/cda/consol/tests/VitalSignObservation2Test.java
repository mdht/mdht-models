/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Sign Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationInterpretationCodeP() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservationInterpretationCodePTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservationInterpretationCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation2 target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservation2Operations.validateVitalSignObservationInterpretationCodeP(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationInterpretationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignObservation2AuthorParticipation() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservation2AuthorParticipationTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservation2AuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGN_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation2 target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservation2Operations.validateVitalSignObservation2AuthorParticipation(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservation2AuthorParticipationTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated NOT
	// * modified VALIDATE_VITAL_SIGN_OBSERVATION2_PQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP due to inline datatype OCL generation issue
	// */
	// @Test
	// public void testValidateVitalSignObservation2PQUnit() {
	// OperationsTestCase<VitalSignObservation2> validateVitalSignObservation2PQUnitTestCase = new OperationsTestCase<VitalSignObservation2>(
	// "validateVitalSignObservation2PQUnit",
	// operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION2_PQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(VitalSignObservation2 target) {
	// target.init();
	// PQ value = DatatypesFactory.eINSTANCE.createPQ();
	// target.getValues().add(value);
	// }
	//
	// @Override
	// protected void updateToPass(VitalSignObservation2 target) {
	// PQ value = DatatypesFactory.eINSTANCE.createPQ();
	// value.setUnit("hasUnit");
	// for (int i = 0; i < target.getValues().size(); i++) {
	// target.getValues().set(i, value);
	// }
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return VitalSignObservation2Operations.validateVitalSignObservation2PQUnit(
	// (VitalSignObservation2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateVitalSignObservation2PQUnitTestCase.doValidationTest();
	// }

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateVitalSignObservationTextReference() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservationTextReferenceTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservationTextReference", operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation2 target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservation2Operations.validateVitalSignObservationTextReference(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateVitalSignObservationReferenceValue() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservationReferenceValueTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservationReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGN_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation2 target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservation2Operations.validateVitalSignObservationReferenceValue(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateVitalSignObservationTextReferenceValue() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservationTextReferenceValueTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservationTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation2 target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservation2Operations.validateVitalSignObservationTextReferenceValue(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationTemplateId() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservationTemplateIdTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation2 target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservation2Operations.validateVitalSignObservationTemplateId(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationEffectiveTime() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservationEffectiveTimeTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservationEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGN_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation2 target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservation2Operations.validateVitalSignObservationEffectiveTime(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationValue() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservationValueTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation2 target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservation2Operations.validateVitalSignObservationValue(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateVitalSignObservationText() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservationTextTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservationText",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation2 target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservation2Operations.validateVitalSignObservationText(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignObservationInterpretationCode() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservationInterpretationCodeTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservationInterpretationCode", operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				// no code system set
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(VitalSignObservation2 target) {
						target.init();
						target.getInterpretationCodes().clear();
						target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());
					}
				});

				// bad code system set
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(VitalSignObservation2 target) {
						target.init();
						target.getInterpretationCodes().clear();
						target.getInterpretationCodes().add(
							DatatypesFactory.eINSTANCE.createCE("notChecked", BAD_CODESYSTEM_ID));
					}
				});

			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				target.init();
				target.getInterpretationCodes().clear();
				target.getInterpretationCodes().add(
					DatatypesFactory.eINSTANCE.createCE("notChecked", "2.16.840.1.113883.5.83"));
			}

			@Override
			protected void setDependency(VitalSignObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.VitalSignObservationInterpretationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservation2Operations.validateVitalSignObservationInterpretationCode(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This association is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateVitalSignObservationAuthor() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservationAuthorTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservationAuthor",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation2 target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservation2Operations.validateVitalSignObservationAuthor(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VitalSignObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSignObservation2> {
		@Override
		public VitalSignObservation2 create() {
			return ConsolFactory.eINSTANCE.createVitalSignObservation2();
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
	private static class ConstructorTestClass extends VitalSignObservation2Operations {
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

} // VitalSignObservation2Operations
