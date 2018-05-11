/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianReadingStudyPerformer2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physician Reading Study Performer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer2#validatePhysicianReadingStudyPerformer2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicianReadingStudyPerformer2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicianReadingStudyPerformer2TemplateId() {
		OperationsTestCase<PhysicianReadingStudyPerformer2> validatePhysicianReadingStudyPerformer2TemplateIdTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer2>(
			"validatePhysicianReadingStudyPerformer2TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer2 target) {

			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformer2Operations.validatePhysicianReadingStudyPerformer2TemplateId(
					(PhysicianReadingStudyPerformer2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformer2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicianReadingStudyPerformer2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicianReadingStudyPerformer2> {
		public PhysicianReadingStudyPerformer2 create() {
			return ConsolFactory.eINSTANCE.createPhysicianReadingStudyPerformer2();
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
	private static class ConstructorTestClass extends PhysicianReadingStudyPerformer2Operations {
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

} // PhysicianReadingStudyPerformer2Operations
