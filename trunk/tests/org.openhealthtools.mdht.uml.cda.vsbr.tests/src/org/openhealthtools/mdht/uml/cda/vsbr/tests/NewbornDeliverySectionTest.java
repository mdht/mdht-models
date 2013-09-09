/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.NewbornDeliverySectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Newborn Delivery Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionBirthOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNumberofInfantsBornAlive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Numberof Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionCongenitalAnomalies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Congenital Anomalies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornsVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborns Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionAbnormalConditionsoftheNewborn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Abnormal Conditionsofthe Newborn</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionInfantLiving(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Infant Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionInfantBreastfed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Infant Breastfed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionInfantTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Infant Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionPlurality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Plurality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn SDTC Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Administrative Gender Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRelatedSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Related Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getBirthOrder() <em>Get Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getNumberofInfantsBornAlive() <em>Get Numberof Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getCongenitalAnomaliess() <em>Get Congenital Anomaliess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getNewbornsVitalSignsSection() <em>Get Newborns Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getAbnormalConditionsoftheNewborns() <em>Get Abnormal Conditionsofthe Newborns</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getInfantLiving() <em>Get Infant Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getInfantBreastfed() <em>Get Infant Breastfed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getInfantTransfer() <em>Get Infant Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getPlurality() <em>Get Plurality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NewbornDeliverySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionTemplateId() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionTemplateIdTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionTemplateId(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionClassCode() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionClassCodeTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionClassCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionClassCode(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionMoodCode() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionMoodCodeTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionMoodCode(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionCode() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionCodeTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionCode(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionText() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionTextTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionText",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionText(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionSubject() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionSubjectTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionSubject",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionSubject(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionBirthOrder() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionBirthOrderTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionBirthOrder",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionBirthOrder(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionBirthOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNumberofInfantsBornAlive() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNumberofInfantsBornAliveTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNumberofInfantsBornAlive",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNumberofInfantsBornAlive(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNumberofInfantsBornAliveTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionCongenitalAnomalies() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionCongenitalAnomaliesTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionCongenitalAnomalies",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_CONGENITAL_ANOMALIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionCongenitalAnomalies(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionCongenitalAnomaliesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornsVitalSignsSection() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornsVitalSignsSectionTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornsVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORNS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

				/* NewbornsVitalSignsSection */
				NewbornsVitalSignsSection section =

				VsbrFactory.eINSTANCE.createNewbornsVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornsVitalSignsSection(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornsVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionAbnormalConditionsoftheNewborn() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionAbnormalConditionsoftheNewbornTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionAbnormalConditionsoftheNewborn",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionAbnormalConditionsoftheNewborn(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionAbnormalConditionsoftheNewbornTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionInfantLiving() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionInfantLivingTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionInfantLiving",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionInfantLiving(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionInfantLivingTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionInfantBreastfed() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionInfantBreastfedTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionInfantBreastfed",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_BREASTFED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionInfantBreastfed(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionInfantBreastfedTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionInfantTransfer() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionInfantTransferTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionInfantTransfer",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionInfantTransfer(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionInfantTransferTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionPlurality() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionPluralityTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionPlurality",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionPlurality(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionPluralityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCodeTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCodeTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCIdTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornNameTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodePTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTimeTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCodeTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCodeTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubjectTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornSubjectTypeCode() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornSubjectTypeCodeTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornSubjectTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectTypeCode(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornSubjectTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNewbornDeliverySectionNewbornSubjectRelatedSubject() {
		OperationsTestCase<NewbornDeliverySection> validateNewbornDeliverySectionNewbornSubjectRelatedSubjectTestCase = new OperationsTestCase<NewbornDeliverySection>(
			"validateNewbornDeliverySectionNewbornSubjectRelatedSubject",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornDeliverySection target) {

			}

			@Override
			protected void updateToPass(NewbornDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRelatedSubject(
					(NewbornDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornDeliverySectionNewbornSubjectRelatedSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetBirthOrder() {

		NewbornDeliverySection target = objectFactory.create();
		target.getBirthOrder();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNumberofInfantsBornAlive() {

		NewbornDeliverySection target = objectFactory.create();
		target.getNumberofInfantsBornAlive();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCongenitalAnomaliess() {

		NewbornDeliverySection target = objectFactory.create();
		target.getCongenitalAnomaliess();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNewbornsVitalSignsSection() {

		NewbornDeliverySection target = objectFactory.create();
		target.getNewbornsVitalSignsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAbnormalConditionsoftheNewborns() {

		NewbornDeliverySection target = objectFactory.create();
		target.getAbnormalConditionsoftheNewborns();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInfantLiving() {

		NewbornDeliverySection target = objectFactory.create();
		target.getInfantLiving();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInfantBreastfed() {

		NewbornDeliverySection target = objectFactory.create();
		target.getInfantBreastfed();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInfantTransfer() {

		NewbornDeliverySection target = objectFactory.create();
		target.getInfantTransfer();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlurality() {

		NewbornDeliverySection target = objectFactory.create();
		target.getPlurality();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NewbornDeliverySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NewbornDeliverySection> {
		public NewbornDeliverySection create() {
			return VsbrFactory.eINSTANCE.createNewbornDeliverySection();
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
	private static class ConstructorTestClass extends NewbornDeliverySectionOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // NewbornDeliverySectionOperations
