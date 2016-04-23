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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryOrganizer2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Organizer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2#validateFamilyHistoryOrganizer2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2#getConsolFamilyHistoryObservation2s() <em>Get Consol Family History Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2#validateFamilyHistoryOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2#validateFamilyHistoryOrganizerFamilyHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryOrganizer2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryOrganizer2Id() {
		OperationsTestCase<FamilyHistoryOrganizer2> validateFamilyHistoryOrganizer2IdTestCase = new OperationsTestCase<FamilyHistoryOrganizer2>(
			"validateFamilyHistoryOrganizer2Id",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer2 target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer2 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizer2Operations.validateFamilyHistoryOrganizer2Id(
					(FamilyHistoryOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizer2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolFamilyHistoryObservation2s() {

		FamilyHistoryOrganizer2 target = objectFactory.create();
		target.getConsolFamilyHistoryObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerTemplateId() {
		OperationsTestCase<FamilyHistoryOrganizer2> validateFamilyHistoryOrganizerTemplateIdTestCase = new OperationsTestCase<FamilyHistoryOrganizer2>(
			"validateFamilyHistoryOrganizerTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer2 target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizer2Operations.validateFamilyHistoryOrganizerTemplateId(
					(FamilyHistoryOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerFamilyHistoryObservation() {
		OperationsTestCase<FamilyHistoryOrganizer2> validateFamilyHistoryOrganizerFamilyHistoryObservationTestCase = new OperationsTestCase<FamilyHistoryOrganizer2>(
			"validateFamilyHistoryOrganizerFamilyHistoryObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer2 target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer2 target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createFamilyHistoryObservation2().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizer2Operations.validateFamilyHistoryOrganizerFamilyHistoryObservation(
					(FamilyHistoryOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerFamilyHistoryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryOrganizer2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryOrganizer2> {
		public FamilyHistoryOrganizer2 create() {
			return ConsolFactory.eINSTANCE.createFamilyHistoryOrganizer2();
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
	private static class ConstructorTestClass extends FamilyHistoryOrganizer2Operations {
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

} // FamilyHistoryOrganizer2Operations
