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
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistorySection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2#getConsolFamilyHistoryOrganizer2s() <em>Get Consol Family History Organizer2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2#validateFamilyHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2#validateFamilyHistorySectionFamilyHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Family History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistorySection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolFamilyHistoryOrganizer2s() {

		FamilyHistorySection2 target = objectFactory.create();
		target.getConsolFamilyHistoryOrganizer2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionTemplateId() {
		OperationsTestCase<FamilyHistorySection2> validateFamilyHistorySectionTemplateIdTestCase = new OperationsTestCase<FamilyHistorySection2>(
			"validateFamilyHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection2 target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySection2Operations.validateFamilyHistorySectionTemplateId(
					(FamilyHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistorySectionFamilyHistory() {
		OperationsTestCase<FamilyHistorySection2> validateFamilyHistorySectionFamilyHistoryTestCase = new OperationsTestCase<FamilyHistorySection2>(
			"validateFamilyHistorySectionFamilyHistory",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection2 target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection2 target) {
				target.init();
				target.addOrganizer(ConsolFactory.eINSTANCE.createFamilyHistoryOrganizer2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySection2Operations.validateFamilyHistorySectionFamilyHistory(
					(FamilyHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionFamilyHistoryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistorySection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistorySection2> {
		public FamilyHistorySection2 create() {
			return ConsolFactory.eINSTANCE.createFamilyHistorySection2();
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
	private static class ConstructorTestClass extends FamilyHistorySection2Operations {
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

} // FamilyHistorySection2Operations
