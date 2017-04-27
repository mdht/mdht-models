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
import org.eclipse.mdht.uml.cda.AssignedCustodian;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Component2;
import org.eclipse.mdht.uml.cda.Custodian;
import org.eclipse.mdht.uml.cda.NonXMLBody;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.RecordTarget;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.BinaryDataEncoding;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2;
import org.openhealthtools.mdht.uml.cda.consol.operations.UnstructuredDocument2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Document2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2RecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2Custodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2Component(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2RecordTargetPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Record Target Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2RecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Custodian Assigned Custodian Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2CustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2ComponentNonXMLBodyEDMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body ED Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2ComponentNonXMLBodyHasReferenceOrRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body Has Reference Or Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body Media Type File Formats</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2ComponentNonXMLBodyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2ComponentNonXMLBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnstructuredDocument2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUnstructuredDocument2RecordTarget() {
		OperationsTestCase<UnstructuredDocument2> validateUnstructuredDocument2RecordTargetTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateUnstructuredDocument2RecordTarget", operationsForOCL.getOCLValue(
				"VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateUnstructuredDocument2RecordTarget(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocument2RecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUnstructuredDocument2Custodian() {
		OperationsTestCase<UnstructuredDocument2> validateUnstructuredDocument2CustodianTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateUnstructuredDocument2Custodian",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				target.init();
				Custodian cus = CDAFactory.eINSTANCE.createCustodian();
				target.setCustodian(cus);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateUnstructuredDocument2Custodian(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocument2CustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUnstructuredDocument2Component() {
		OperationsTestCase<UnstructuredDocument2> validateUnstructuredDocument2ComponentTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateUnstructuredDocument2Component",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateUnstructuredDocument2Component(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocument2ComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUnstructuredDocument2RecordTargetPatientRoleId() {
		OperationsTestCase<UnstructuredDocument2> validateUnstructuredDocument2RecordTargetPatientRoleIdTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateUnstructuredDocument2RecordTargetPatientRoleId",
			operationsForOCL.getOCLValue(
				"VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				for (RecordTarget rt : target.getRecordTargets()) {
					rt.getPatientRole().getIds().add(DatatypesFactory.eINSTANCE.createII());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateUnstructuredDocument2RecordTargetPatientRoleId(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocument2RecordTargetPatientRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUnstructuredDocument2RecordTargetPatientRole() {
		OperationsTestCase<UnstructuredDocument2> validateUnstructuredDocument2RecordTargetPatientRoleTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateUnstructuredDocument2RecordTargetPatientRole",
			operationsForOCL.getOCLValue(
				"VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				for (RecordTarget rt : target.getRecordTargets()) {
					rt.setPatientRole(pr);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateUnstructuredDocument2RecordTargetPatientRole(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocument2RecordTargetPatientRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization() {
		OperationsTestCase<UnstructuredDocument2> validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganizationTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {
				target.init();
				Custodian cus = CDAFactory.eINSTANCE.createCustodian();
				target.setCustodian(cus);
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				cus.setAssignedCustodian(ac);
			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				target.getCustodian().getAssignedCustodian().setRepresentedCustodianOrganization(
					CDAFactory.eINSTANCE.createCustodianOrganization());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUnstructuredDocument2CustodianAssignedCustodian() {
		OperationsTestCase<UnstructuredDocument2> validateUnstructuredDocument2CustodianAssignedCustodianTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateUnstructuredDocument2CustodianAssignedCustodian",
			operationsForOCL.getOCLValue(
				"VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {
				target.init();
				Custodian cus = CDAFactory.eINSTANCE.createCustodian();
				target.setCustodian(cus);
			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				target.getCustodian().setAssignedCustodian(ac);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateUnstructuredDocument2CustodianAssignedCustodian(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocument2CustodianAssignedCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* modified VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_ED_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
	* due to inline datatype OCL generation issue
	*/
	@Test
	public void testValidateUnstructuredDocument2ComponentNonXMLBodyEDMediaType() {
		OperationsTestCase<UnstructuredDocument2> validateUnstructuredDocument2ComponentNonXMLBodyEDMediaTypeTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateUnstructuredDocument2ComponentNonXMLBodyEDMediaType",
			operationsForOCL.getOCLValue(
				"VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_ED_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				NonXMLBody nxb = CDAFactory.eINSTANCE.createNonXMLBody();
				c2.setNonXMLBody(nxb);
				ED text = DatatypesFactory.eINSTANCE.createED();
				nxb.setText(text);
			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				ED textWithMedia = DatatypesFactory.eINSTANCE.createED();
				textWithMedia.setMediaType("hasMediaType");
				target.getComponent().getNonXMLBody().setText(textWithMedia);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateUnstructuredDocument2ComponentNonXMLBodyEDMediaType(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocument2ComponentNonXMLBodyEDMediaTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUnstructuredDocument2ComponentNonXMLBodyHasReferenceOrRepresentation() {
		OperationsTestCase<UnstructuredDocument2> validateUnstructuredDocument2ComponentNonXMLBodyHasReferenceOrRepresentationTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateUnstructuredDocument2ComponentNonXMLBodyHasReferenceOrRepresentation",
			operationsForOCL.getOCLValue(
				"VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_HAS_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				NonXMLBody nxb = CDAFactory.eINSTANCE.createNonXMLBody();
				c2.setNonXMLBody(nxb);
				ED text = DatatypesFactory.eINSTANCE.createED();
				nxb.setText(text);
			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				ED validText = DatatypesFactory.eINSTANCE.createED();
				validText.setMediaType("hasMediaType");
				validText.setRepresentation(BinaryDataEncoding.B64);
				target.getComponent().getNonXMLBody().setText(validText);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateUnstructuredDocument2ComponentNonXMLBodyHasReferenceOrRepresentation(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocument2ComponentNonXMLBodyHasReferenceOrRepresentationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats() {
		OperationsTestCase<UnstructuredDocument2> validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormatsTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats",
			operationsForOCL.getOCLValue(
				"VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				NonXMLBody nxb = CDAFactory.eINSTANCE.createNonXMLBody();
				c2.setNonXMLBody(nxb);
				ED text = DatatypesFactory.eINSTANCE.createED();
				text.setMediaType("invalidType");
				nxb.setText(text);
			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				ED validText = DatatypesFactory.eINSTANCE.createED();
				validText.setMediaType("application/msword");
				target.getComponent().getNonXMLBody().setText(validText);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormatsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUnstructuredDocument2ComponentNonXMLBodyText() {
		OperationsTestCase<UnstructuredDocument2> validateUnstructuredDocument2ComponentNonXMLBodyTextTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateUnstructuredDocument2ComponentNonXMLBodyText",
			operationsForOCL.getOCLValue(
				"VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
				NonXMLBody nxb = CDAFactory.eINSTANCE.createNonXMLBody();
				c2.setNonXMLBody(nxb);
			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				ED text = DatatypesFactory.eINSTANCE.createED();
				target.getComponent().getNonXMLBody().setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateUnstructuredDocument2ComponentNonXMLBodyText(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocument2ComponentNonXMLBodyTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUnstructuredDocument2ComponentNonXMLBody() {
		OperationsTestCase<UnstructuredDocument2> validateUnstructuredDocument2ComponentNonXMLBodyTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateUnstructuredDocument2ComponentNonXMLBody",
			operationsForOCL.getOCLValue(
				"VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {
				target.init();
				Component2 c2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(c2);
			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				NonXMLBody nxb = CDAFactory.eINSTANCE.createNonXMLBody();
				target.getComponent().setNonXMLBody(nxb);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateUnstructuredDocument2ComponentNonXMLBody(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocument2ComponentNonXMLBodyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<UnstructuredDocument2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<UnstructuredDocument2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument2 target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument2Operations.validateGeneralHeaderConstraintsTemplateId(
					(UnstructuredDocument2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends UnstructuredDocument2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<UnstructuredDocument2> {
		public UnstructuredDocument2 create() {
			return ConsolFactory.eINSTANCE.createUnstructuredDocument2();
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
	private static class ConstructorTestClass extends UnstructuredDocument2Operations {
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

} // UnstructuredDocument2Operations
