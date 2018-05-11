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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationsSectionEntriesOptional2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunizations Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2#validateImmunizationsSectionEntriesOptional2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2#getConsolImmunizationActivity2s() <em>Get Consol Immunization Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2#validateImmunizationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2#validateImmunizationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2#validateImmunizationsSectionEntriesOptionalImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Immunization Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationsSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationsSectionEntriesOptional2TemplateId() {
		OperationsTestCase<ImmunizationsSectionEntriesOptional2> validateImmunizationsSectionEntriesOptional2TemplateIdTestCase = new OperationsTestCase<ImmunizationsSectionEntriesOptional2>(
			"validateImmunizationsSectionEntriesOptional2TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionEntriesOptional2Operations.validateImmunizationsSectionEntriesOptional2TemplateId(
					(ImmunizationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptional2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolImmunizationActivity2s() {

		ImmunizationsSectionEntriesOptional2 target = objectFactory.create();
		target.getConsolImmunizationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionEntriesOptionalCodeP() {
		OperationsTestCase<ImmunizationsSectionEntriesOptional2> validateImmunizationsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ImmunizationsSectionEntriesOptional2>(
			"validateImmunizationsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionEntriesOptional2Operations.validateImmunizationsSectionEntriesOptionalCodeP(
					(ImmunizationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionEntriesOptionalCode() {
		OperationsTestCase<ImmunizationsSectionEntriesOptional2> validateImmunizationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ImmunizationsSectionEntriesOptional2>(
			"validateImmunizationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ImmunizationsSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionEntriesOptional2Operations.validateImmunizationsSectionEntriesOptionalCode(
					(ImmunizationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationsSectionEntriesOptionalImmunizationActivity() {
		OperationsTestCase<ImmunizationsSectionEntriesOptional2> validateImmunizationsSectionEntriesOptionalImmunizationActivityTestCase = new OperationsTestCase<ImmunizationsSectionEntriesOptional2>(
			"validateImmunizationsSectionEntriesOptionalImmunizationActivity",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSectionEntriesOptional2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationsSectionEntriesOptional2 target) {
				target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createImmunizationActivity2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionEntriesOptional2Operations.validateImmunizationsSectionEntriesOptionalImmunizationActivity(
					(ImmunizationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalImmunizationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationsSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationsSectionEntriesOptional2> {
		@Override
		public ImmunizationsSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createImmunizationsSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends ImmunizationsSectionEntriesOptional2Operations {
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

} // ImmunizationsSectionEntriesOptional2Operations
