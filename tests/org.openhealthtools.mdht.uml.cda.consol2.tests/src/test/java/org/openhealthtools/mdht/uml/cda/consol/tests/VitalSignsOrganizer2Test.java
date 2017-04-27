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
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Component4;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsOrganizer2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Organizer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizer2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizer2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizer2CDTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 CD Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#getConsolVitalSignObservation2s() <em>Get Consol Vital Sign Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerVitalSignObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Vital Sign Observation</em>}</li>
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
	public void testValidateVitalSignsOrganizer2AuthorParticipation() {
		OperationsTestCase<VitalSignsOrganizer2> validateVitalSignsOrganizer2AuthorParticipationTestCase = new OperationsTestCase<VitalSignsOrganizer2>(
			"validateVitalSignsOrganizer2AuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_ORGANIZER2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignsOrganizer2CDTranslation() {
		OperationsTestCase<VitalSignsOrganizer2> validateVitalSignsOrganizer2CDTranslationTestCase = new OperationsTestCase<VitalSignsOrganizer2>(
			"validateVitalSignsOrganizer2CDTranslation", operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(VitalSignsOrganizer2 target) {
				target.getCode().getTranslations().set(0, DatatypesFactory.eINSTANCE.createCD("74728-7", LOINC_ID));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizer2Operations.validateVitalSignsOrganizer2CDTranslation(
					(VitalSignsOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizer2CDTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignsOrganizer2CDTranslationP() {
		OperationsTestCase<VitalSignsOrganizer2> validateVitalSignsOrganizer2CDTranslationPTestCase = new OperationsTestCase<VitalSignsOrganizer2>(
			"validateVitalSignsOrganizer2CDTranslationP", operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(VitalSignsOrganizer2 target) {
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizer2Operations.validateVitalSignsOrganizer2CDTranslationP(
					(VitalSignsOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizer2CDTranslationPTestCase.doValidationTest();
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
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignsOrganizerCode() {
		OperationsTestCase<VitalSignsOrganizer2> validateVitalSignsOrganizerCodeTestCase = new OperationsTestCase<VitalSignsOrganizer2>(
			"validateVitalSignsOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(VitalSignsOrganizer2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("46680005", SNOMEDCT_ID));
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
			"validateVitalSignsOrganizerEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignsOrganizerVitalSignObservation() {
		OperationsTestCase<VitalSignsOrganizer2> validateVitalSignsOrganizerVitalSignObservationTestCase = new OperationsTestCase<VitalSignsOrganizer2>(
			"validateVitalSignsOrganizerVitalSignObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return VitalSignsOrganizer2Operations.validateVitalSignsOrganizerVitalSignObservation(
					(VitalSignsOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerVitalSignObservationTestCase.doValidationTest();
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
		@Override
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

} // VitalSignsOrganizer2Operations
