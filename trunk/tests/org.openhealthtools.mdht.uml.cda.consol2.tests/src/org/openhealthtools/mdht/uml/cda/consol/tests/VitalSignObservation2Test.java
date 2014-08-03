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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Sign Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservation2PQUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation2 PQ Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2#validateVitalSignObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignObservation2Test extends CDAValidationTest {

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
