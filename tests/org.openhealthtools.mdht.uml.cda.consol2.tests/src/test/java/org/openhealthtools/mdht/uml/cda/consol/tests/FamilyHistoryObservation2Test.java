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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation2#validateFamilyHistoryObservation2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation2#validateFamilyHistoryObservation2CDTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation2 CD Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation2#validateFamilyHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation2#validateFamilyHistoryObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation2#validateFamilyHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryObservation2CDTranslation() {
		OperationsTestCase<FamilyHistoryObservation2> validateFamilyHistoryObservation2CDTranslationTestCase = new OperationsTestCase<FamilyHistoryObservation2>(
			"validateFamilyHistoryObservation2CDTranslation",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(FamilyHistoryObservation2 target) {
				target.getCode().getTranslations().set(0, DatatypesFactory.eINSTANCE.createCD("75326-9", LOINC_ID));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservation2Operations.validateFamilyHistoryObservation2CDTranslation(
					(FamilyHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservation2CDTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryObservation2CDTranslationP() {
		OperationsTestCase<FamilyHistoryObservation2> validateFamilyHistoryObservation2CDTranslationPTestCase = new OperationsTestCase<FamilyHistoryObservation2>(
			"validateFamilyHistoryObservation2CDTranslationP",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(FamilyHistoryObservation2 target) {
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservation2Operations.validateFamilyHistoryObservation2CDTranslationP(
					(FamilyHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservation2CDTranslationPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationTemplateId() {
		OperationsTestCase<FamilyHistoryObservation2> validateFamilyHistoryObservationTemplateIdTestCase = new OperationsTestCase<FamilyHistoryObservation2>(
			"validateFamilyHistoryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation2 target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservation2Operations.validateFamilyHistoryObservationTemplateId(
					(FamilyHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationCodeP() {
		OperationsTestCase<FamilyHistoryObservation2> validateFamilyHistoryObservationCodePTestCase = new OperationsTestCase<FamilyHistoryObservation2>(
			"validateFamilyHistoryObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation2 target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservation2Operations.validateFamilyHistoryObservationCodeP(
					(FamilyHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryObservationCode() {
		OperationsTestCase<FamilyHistoryObservation2> validateFamilyHistoryObservationCodeTestCase = new OperationsTestCase<FamilyHistoryObservation2>(
			"validateFamilyHistoryObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(FamilyHistoryObservation2 target) {
				target.getCode().setCodeSystem(SNOMEDCT_ID);
				target.getCode().setCode("404684003");
			}

			@Override
			protected void setDependency(FamilyHistoryObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservation2Operations.validateFamilyHistoryObservationCode(
					(FamilyHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryObservation2> {
		public FamilyHistoryObservation2 create() {
			return ConsolFactory.eINSTANCE.createFamilyHistoryObservation2();
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
	private static class ConstructorTestClass extends FamilyHistoryObservation2Operations {
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

} // FamilyHistoryObservation2Operations
