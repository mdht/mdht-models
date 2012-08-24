
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
import org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.BirthReportingPrenatalExperienceSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionPreNatalCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Pre Natal Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionHeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Height</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Dateof Last Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Last Menstrual Period Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Numberof Births Still Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Numberof Live Birthsnow Dead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Other Preganancy Outcomes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionRiskFactor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Birth Reporting Infections Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getPreNatalCare() <em>Get Pre Natal Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getHeight() <em>Get Height</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getDateofLastLiveBirth() <em>Get Dateof Last Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getLastMenstrualPeriodDate() <em>Get Last Menstrual Period Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getNumberofBirthsStillLiving() <em>Get Numberof Births Still Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getNumberofLiveBirthsnowDead() <em>Get Numberof Live Birthsnow Dead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getOtherPreganancyOutcomes() <em>Get Other Preganancy Outcomes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getRiskFactors() <em>Get Risk Factors</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getBirthReportingInfectionsPresents() <em>Get Birth Reporting Infections Presents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class BirthReportingPrenatalExperienceSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionTemplateId() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionTemplateIdTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionTemplateId(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionClassCode() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionClassCodeTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionClassCode",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionClassCode(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionCode() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionCodeTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionCode(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionMoodCode() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionMoodCodeTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionMoodCode(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionText() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionTextTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionText",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionText(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionPreNatalCare() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionPreNatalCareTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionPreNatalCare",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionPreNatalCare(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionPreNatalCareTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionHeight() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionHeightTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionHeight",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionHeight(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionHeightTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirthTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirthTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDateTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDateTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLivingTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLivingTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDeadTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDeadTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomesTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomesTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionRiskFactor() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionRiskFactorTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionRiskFactor",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionRiskFactor(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionRiskFactorTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent() {
			OperationsTestCase<BirthReportingPrenatalExperienceSection> validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresentTestCase = new OperationsTestCase<BirthReportingPrenatalExperienceSection>(
			"validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_BIRTH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(BirthReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(
					(BirthReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresentTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetPreNatalCare() {


BirthReportingPrenatalExperienceSection target = objectFactory.create();
target.getPreNatalCare();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetHeight() {


BirthReportingPrenatalExperienceSection target = objectFactory.create();
target.getHeight();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDateofLastLiveBirth() {


BirthReportingPrenatalExperienceSection target = objectFactory.create();
target.getDateofLastLiveBirth();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetLastMenstrualPeriodDate() {


BirthReportingPrenatalExperienceSection target = objectFactory.create();
target.getLastMenstrualPeriodDate();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNumberofBirthsStillLiving() {


BirthReportingPrenatalExperienceSection target = objectFactory.create();
target.getNumberofBirthsStillLiving();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNumberofLiveBirthsnowDead() {


BirthReportingPrenatalExperienceSection target = objectFactory.create();
target.getNumberofLiveBirthsnowDead();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetOtherPreganancyOutcomes() {


BirthReportingPrenatalExperienceSection target = objectFactory.create();
target.getOtherPreganancyOutcomes();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetRiskFactors() {


BirthReportingPrenatalExperienceSection target = objectFactory.create();
target.getRiskFactors();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBirthReportingInfectionsPresents() {


BirthReportingPrenatalExperienceSection target = objectFactory.create();
target.getBirthReportingInfectionsPresents();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends BirthReportingPrenatalExperienceSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BirthReportingPrenatalExperienceSection> {
		public BirthReportingPrenatalExperienceSection create() {		
			return VsbrFactory.eINSTANCE.createBirthReportingPrenatalExperienceSection();
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
	private static class ConstructorTestClass extends BirthReportingPrenatalExperienceSectionOperations {};
	
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
	
	

	
	
} // BirthReportingPrenatalExperienceSectionOperations