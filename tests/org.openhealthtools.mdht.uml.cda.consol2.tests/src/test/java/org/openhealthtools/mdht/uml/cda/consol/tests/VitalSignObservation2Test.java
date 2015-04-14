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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Sign Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservation2TextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservation2ReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservation2TextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservation2PQUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 PQ Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Interpretation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateVitalSignObservation2TextReference() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservation2TextReferenceTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservation2TextReference",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION2_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return VitalSignObservation2Operations.validateVitalSignObservation2TextReference(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservation2TextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateVitalSignObservation2ReferenceValue() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservation2ReferenceValueTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservation2ReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION2_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return VitalSignObservation2Operations.validateVitalSignObservation2ReferenceValue(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservation2ReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateVitalSignObservation2TextReferenceValue() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservation2TextReferenceValueTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservation2TextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION2_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return VitalSignObservation2Operations.validateVitalSignObservation2TextReferenceValue(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservation2TextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationInterpretationCodeP() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservationInterpretationCodePTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservationInterpretationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

	/**
	*
	* @generated NOT
	* modified VALIDATE_VITAL_SIGN_OBSERVATION2_PQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP due to inline datatype OCL generation issue
	*/
	@Test
	public void testValidateVitalSignObservation2PQUnit() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservation2PQUnitTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservation2PQUnit",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION2_PQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation2 target) {
				target.init();
				PQ value = DatatypesFactory.eINSTANCE.createPQ();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				PQ value = DatatypesFactory.eINSTANCE.createPQ();
				value.setUnit("hasUnit");
				for (int i = 0; i < target.getValues().size(); i++) {
					target.getValues().set(i, value);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservation2Operations.validateVitalSignObservation2PQUnit(
					(VitalSignObservation2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservation2PQUnitTestCase.doValidationTest();
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
			"validateVitalSignObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	*/
	@Test
	public void testValidateVitalSignObservationInterpretationCode() {
		OperationsTestCase<VitalSignObservation2> validateVitalSignObservationInterpretationCodeTestCase = new OperationsTestCase<VitalSignObservation2>(
			"validateVitalSignObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation2 target) {
				target.init();
				target.getInterpretationCodes().clear();
				target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(VitalSignObservation2 target) {
				target.getInterpretationCodes().set(
					0, DatatypesFactory.eINSTANCE.createCE("A", "2.16.840.1.113883.5.83"));
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
