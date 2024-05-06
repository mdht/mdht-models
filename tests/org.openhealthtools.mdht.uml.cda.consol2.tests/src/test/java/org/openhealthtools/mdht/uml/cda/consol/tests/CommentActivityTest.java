/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.AD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.vocab.PostalAddressUse;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.CommentActivity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.CommentActivityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Comment Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Participation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CommentActivityTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityTextReference() {
		OperationsTestCase<CommentActivity> validateCommentActivityTextReferenceTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityTextReference",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityTextReference(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityTextReferenceValue() {
		OperationsTestCase<CommentActivity> validateCommentActivityTextReferenceValueTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityTextReferenceValue(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityReferenceValue() {
		OperationsTestCase<CommentActivity> validateCommentActivityReferenceValueTestCase = new NarrativeReferenceTestCase<CommentActivity>(
			"validateCommentActivityReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityReferenceValue(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentActivityTemplateId() {
		OperationsTestCase<CommentActivity> validateCommentActivityTemplateIdTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityTemplateId(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentActivityClassCode() {
		OperationsTestCase<CommentActivity> validateCommentActivityClassCodeTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityClassCode(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentActivityMoodCode() {
		OperationsTestCase<CommentActivity> validateCommentActivityMoodCodeTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityMoodCode(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCommentActivityCode() {
		OperationsTestCase<CommentActivity> validateCommentActivityCodeTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

			}

			@Override
			protected void setDependency(CommentActivity target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CommentActivityCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityCode(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityText() {
		OperationsTestCase<CommentActivity> validateCommentActivityTextTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityText",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityText(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCommentActivityAuthorParticipation() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorParticipationTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_COMMENT_ACTIVITY_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				AuthorParticipation ap = ConsolFactory.eINSTANCE.createAuthorParticipation().init();
				target.getAuthors().add(ap);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorParticipation(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CommentActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CommentActivity> {
		@Override
		public CommentActivity create() {
			return ConsolFactory.eINSTANCE.createCommentActivity();
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
	private static class ConstructorTestClass extends CommentActivityOperations {
	}

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

	private AD createUSRealmAddress() {
		AD addr = DatatypesFactory.eINSTANCE.createAD();
		addr.getUses().add(PostalAddressUse.HP);
		addr.addStreetAddressLine("123 Main Street");
		addr.addCity("Boston");
		addr.addState("MA");
		addr.addCountry("US");
		addr.addPostalCode("01001");

		return addr;

	}

} // CommentActivityOperations
