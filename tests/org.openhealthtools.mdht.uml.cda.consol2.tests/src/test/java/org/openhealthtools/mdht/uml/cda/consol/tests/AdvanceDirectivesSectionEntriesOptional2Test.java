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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectivesSectionEntriesOptional2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directives Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2#validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional2 Advance Directive Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2#validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Advance Directive Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2#getAdvanceDirectiveOrganizers() <em>Get Advance Directive Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2#getConsolAdvanceDirectiveObservation2s() <em>Get Consol Advance Directive Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2#validateAdvanceDirectivesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2#validateAdvanceDirectivesSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2#validateAdvanceDirectivesSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectivesSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional2> validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizerTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional2>(
			"validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional2 target) {
				target.addOrganizer(ConsolFactory.eINSTANCE.createAdvanceDirectiveOrganizer().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptional2Operations.validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer(
					(AdvanceDirectivesSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation2() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional2> validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation2TestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional2>(
			"validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation2",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptional2Operations.validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation2(
					(AdvanceDirectivesSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectiveOrganizers() {

		AdvanceDirectivesSectionEntriesOptional2 target = objectFactory.create();
		target.getAdvanceDirectiveOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAdvanceDirectiveObservation2s() {

		AdvanceDirectivesSectionEntriesOptional2 target = objectFactory.create();
		target.getConsolAdvanceDirectiveObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional2> validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional2>(
			"validateAdvanceDirectivesSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptional2Operations.validateAdvanceDirectivesSectionEntriesOptionalTemplateId(
					(AdvanceDirectivesSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalCodeP() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional2> validateAdvanceDirectivesSectionEntriesOptionalCodePTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional2>(
			"validateAdvanceDirectivesSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptional2Operations.validateAdvanceDirectivesSectionEntriesOptionalCodeP(
					(AdvanceDirectivesSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalCode() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional2> validateAdvanceDirectivesSectionEntriesOptionalCodeTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional2>(
			"validateAdvanceDirectivesSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(AdvanceDirectivesSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptional2Operations.validateAdvanceDirectivesSectionEntriesOptionalCode(
					(AdvanceDirectivesSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectivesSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectivesSectionEntriesOptional2> {
		@Override
		public AdvanceDirectivesSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectivesSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends AdvanceDirectivesSectionEntriesOptional2Operations {
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

} // AdvanceDirectivesSectionEntriesOptional2Operations
