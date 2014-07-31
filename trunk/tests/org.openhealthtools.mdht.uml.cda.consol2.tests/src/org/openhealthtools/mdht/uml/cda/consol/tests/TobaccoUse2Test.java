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
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2;
import org.openhealthtools.mdht.uml.cda.consol.operations.TobaccoUse2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tobacco Use2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUse2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUse2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUseCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TobaccoUse2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTobaccoUse2AuthorParticipation() {
		OperationsTestCase<TobaccoUse2> validateTobaccoUse2AuthorParticipationTestCase = new OperationsTestCase<TobaccoUse2>(
			"validateTobaccoUse2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse2 target) {

			}

			@Override
			protected void updateToPass(TobaccoUse2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUse2Operations.validateTobaccoUse2AuthorParticipation(
					(TobaccoUse2) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUse2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTobaccoUse2IVLTSHigh() {
		OperationsTestCase<TobaccoUse2> validateTobaccoUse2IVLTSHighTestCase = new OperationsTestCase<TobaccoUse2>(
			"validateTobaccoUse2IVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse2 target) {
				target.init();
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(et);
			}

			@Override
			protected void updateToPass(TobaccoUse2 target) {
				IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
				target.getEffectiveTime().setHigh(high);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUse2Operations.validateTobaccoUse2IVLTSHigh(
					(TobaccoUse2) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUse2IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTobaccoUseTemplateId() {
		OperationsTestCase<TobaccoUse2> validateTobaccoUseTemplateIdTestCase = new OperationsTestCase<TobaccoUse2>(
			"validateTobaccoUseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse2 target) {

			}

			@Override
			protected void updateToPass(TobaccoUse2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUse2Operations.validateTobaccoUseTemplateId(
					(TobaccoUse2) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTobaccoUseEffectiveTime() {
		OperationsTestCase<TobaccoUse2> validateTobaccoUseEffectiveTimeTestCase = new OperationsTestCase<TobaccoUse2>(
			"validateTobaccoUseEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse2 target) {

			}

			@Override
			protected void updateToPass(TobaccoUse2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUse2Operations.validateTobaccoUseEffectiveTime(
					(TobaccoUse2) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTobaccoUseCodeP() {
		OperationsTestCase<TobaccoUse2> validateTobaccoUseCodePTestCase = new OperationsTestCase<TobaccoUse2>(
			"validateTobaccoUseCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse2 target) {

			}

			@Override
			protected void updateToPass(TobaccoUse2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUse2Operations.validateTobaccoUseCodeP((TobaccoUse2) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTobaccoUseCode() {
		OperationsTestCase<TobaccoUse2> validateTobaccoUseCodeTestCase = new OperationsTestCase<TobaccoUse2>(
			"validateTobaccoUseCode",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(TobaccoUse2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("229819007", SNOMEDCT_ID));
			}

			@Override
			protected void setDependency(TobaccoUse2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.TobaccoUseCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUse2Operations.validateTobaccoUseCode((TobaccoUse2) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TobaccoUse2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<TobaccoUse2> {
		public TobaccoUse2 create() {
			return ConsolFactory.eINSTANCE.createTobaccoUse2();
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
	private static class ConstructorTestClass extends TobaccoUse2Operations {
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

} // TobaccoUse2Operations
