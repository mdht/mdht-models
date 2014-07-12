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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsOrganizer2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Organizer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerVitalSignObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Vital Sign Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizer2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#getConsolVitalSignObservation2s() <em>Get Consol Vital Sign Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignsOrganizer2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsOrganizerCodeP() {
		OperationsTestCase<VitalSignsOrganizer2> validateVitalSignsOrganizerCodePTestCase = new OperationsTestCase<VitalSignsOrganizer2>(
			"validateVitalSignsOrganizerCodeP",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizer2Operations.validateVitalSignsOrganizerCodeP(
					(VitalSignsOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignsOrganizerVitalSignObservation2() {
		OperationsTestCase<VitalSignsOrganizer2> validateVitalSignsOrganizerVitalSignObservation2TestCase = new OperationsTestCase<VitalSignsOrganizer2>(
			"validateVitalSignsOrganizerVitalSignObservation2",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer2 target) {
				target.init();
				Component4 comp = CDAFactory.eINSTANCE.createComponent4();
				comp.setObservation(ConsolFactory.eINSTANCE.createVitalSignObservation2().init());
				target.getComponents().add(comp);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizer2Operations.validateVitalSignsOrganizerVitalSignObservation2(
					(VitalSignsOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerVitalSignObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignsOrganizer2AuthorParticipation() {
		OperationsTestCase<VitalSignsOrganizer2> validateVitalSignsOrganizer2AuthorParticipationTestCase = new OperationsTestCase<VitalSignsOrganizer2>(
			"validateVitalSignsOrganizer2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizer2Operations.validateVitalSignsOrganizer2AuthorParticipation(
					(VitalSignsOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizer2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolVitalSignObservation2s() {

		VitalSignsOrganizer2 target = objectFactory.create();
		target.getConsolVitalSignObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsOrganizerTemplateId() {
		OperationsTestCase<VitalSignsOrganizer2> validateVitalSignsOrganizerTemplateIdTestCase = new OperationsTestCase<VitalSignsOrganizer2>(
			"validateVitalSignsOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizer2Operations.validateVitalSignsOrganizerTemplateId(
					(VitalSignsOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsOrganizerCode() {
		OperationsTestCase<VitalSignsOrganizer2> validateVitalSignsOrganizerCodeTestCase = new OperationsTestCase<VitalSignsOrganizer2>(
			"validateVitalSignsOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer2 target) {
				target.init();

			}

			@Override
			protected void setDependency(VitalSignsOrganizer2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizerCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizer2Operations.validateVitalSignsOrganizerCode(
					(VitalSignsOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsOrganizerEffectiveTime() {
		OperationsTestCase<VitalSignsOrganizer2> validateVitalSignsOrganizerEffectiveTimeTestCase = new OperationsTestCase<VitalSignsOrganizer2>(
			"validateVitalSignsOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizer2Operations.validateVitalSignsOrganizerEffectiveTime(
					(VitalSignsOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VitalSignsOrganizer2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSignsOrganizer2> {
		public VitalSignsOrganizer2 create() {
			return ConsolFactory.eINSTANCE.createVitalSignsOrganizer2();
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
	private static class ConstructorTestClass extends VitalSignsOrganizer2Operations {
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

} // VitalSignsOrganizer2Operations
