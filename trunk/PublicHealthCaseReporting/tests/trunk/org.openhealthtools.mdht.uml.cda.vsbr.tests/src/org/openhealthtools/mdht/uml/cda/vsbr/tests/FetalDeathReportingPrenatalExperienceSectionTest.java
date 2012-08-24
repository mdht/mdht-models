
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
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetalDeathReportingPrenatalExperienceSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Pre Natal Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionHeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Height</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Dateof Last Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Numberof Births Still Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Numberof Live Birthsnow Dead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Other Preganancy Outcomes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Fetal Death Reporting Infections Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getPreNatalCare() <em>Get Pre Natal Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getHeight() <em>Get Height</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getDateofLastLiveBirth() <em>Get Dateof Last Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getLastMenstrualPeriodDate() <em>Get Last Menstrual Period Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getNumberofBirthsStillLiving() <em>Get Numberof Births Still Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getNumberofLiveBirthsnowDead() <em>Get Numberof Live Birthsnow Dead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getOtherPreganancyOutcomes() <em>Get Other Preganancy Outcomes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getRiskFactors() <em>Get Risk Factors</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getFetalDeathReportingInfectionsPresents() <em>Get Fetal Death Reporting Infections Presents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class FetalDeathReportingPrenatalExperienceSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionTemplateId() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionTemplateIdTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionTemplateId(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionClassCode() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionClassCodeTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionClassCode(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionCode() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionCodeTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionCode(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionMoodCode() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionMoodCodeTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionMoodCode(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionText() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionTextTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionText",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionText(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionPreNatalCare() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionPreNatalCareTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionPreNatalCareTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionHeight() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionHeightTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionHeight",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionHeight(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionHeightTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirthTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirthTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLivingTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLivingTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDeadTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDeadTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomesTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomesTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionRiskFactor() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionRiskFactorTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionRiskFactor",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionRiskFactorTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent() {
			OperationsTestCase<FetalDeathReportingPrenatalExperienceSection> validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresentTestCase = new OperationsTestCase<FetalDeathReportingPrenatalExperienceSection>(
			"validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalDeathReportingPrenatalExperienceSection target) {

			}

			@Override
			protected void updateToPass(FetalDeathReportingPrenatalExperienceSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(
					(FetalDeathReportingPrenatalExperienceSection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresentTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetPreNatalCare() {


FetalDeathReportingPrenatalExperienceSection target = objectFactory.create();
target.getPreNatalCare();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetHeight() {


FetalDeathReportingPrenatalExperienceSection target = objectFactory.create();
target.getHeight();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDateofLastLiveBirth() {


FetalDeathReportingPrenatalExperienceSection target = objectFactory.create();
target.getDateofLastLiveBirth();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetLastMenstrualPeriodDate() {


FetalDeathReportingPrenatalExperienceSection target = objectFactory.create();
target.getLastMenstrualPeriodDate();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNumberofBirthsStillLiving() {


FetalDeathReportingPrenatalExperienceSection target = objectFactory.create();
target.getNumberofBirthsStillLiving();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNumberofLiveBirthsnowDead() {


FetalDeathReportingPrenatalExperienceSection target = objectFactory.create();
target.getNumberofLiveBirthsnowDead();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetOtherPreganancyOutcomes() {


FetalDeathReportingPrenatalExperienceSection target = objectFactory.create();
target.getOtherPreganancyOutcomes();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetRiskFactors() {


FetalDeathReportingPrenatalExperienceSection target = objectFactory.create();
target.getRiskFactors();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetFetalDeathReportingInfectionsPresents() {


FetalDeathReportingPrenatalExperienceSection target = objectFactory.create();
target.getFetalDeathReportingInfectionsPresents();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends FetalDeathReportingPrenatalExperienceSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FetalDeathReportingPrenatalExperienceSection> {
		public FetalDeathReportingPrenatalExperienceSection create() {		
			return VsbrFactory.eINSTANCE.createFetalDeathReportingPrenatalExperienceSection();
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
	private static class ConstructorTestClass extends FetalDeathReportingPrenatalExperienceSectionOperations {};
	
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
	
	

	
	
} // FetalDeathReportingPrenatalExperienceSectionOperations