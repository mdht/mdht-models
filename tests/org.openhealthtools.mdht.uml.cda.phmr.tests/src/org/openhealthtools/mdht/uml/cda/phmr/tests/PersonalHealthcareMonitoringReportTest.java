
/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  Myriam Lipprandt <myriam.lipprandt@offis.de>, OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.PersonalHealthcareMonitoringReportOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Personal Healthcare Monitoring Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportVitalSigns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportResults(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportMedicalEquipment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Medical Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportFunctionalStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Functional Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Purpose</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#getVitalSigns() <em>Get Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#getResults() <em>Get Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#getMedicalEquipment() <em>Get Medical Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#getFunctionalStatus() <em>Get Functional Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#getMedication() <em>Get Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#getPurpose() <em>Get Purpose</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PersonalHealthcareMonitoringReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePersonalHealthcareMonitoringReportTemplateId() {
			OperationsTestCase<PersonalHealthcareMonitoringReport> validatePersonalHealthcareMonitoringReportTemplateIdTestCase = new OperationsTestCase<PersonalHealthcareMonitoringReport>(
			"validatePersonalHealthcareMonitoringReportTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PersonalHealthcareMonitoringReport target) {

			}

			@Override
			protected void updateToPass(PersonalHealthcareMonitoringReport target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportTemplateId(
					(PersonalHealthcareMonitoringReport) objectToTest, diagnostician, map);
			}

		};

		validatePersonalHealthcareMonitoringReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePersonalHealthcareMonitoringReportVitalSigns() {
			OperationsTestCase<PersonalHealthcareMonitoringReport> validatePersonalHealthcareMonitoringReportVitalSignsTestCase = new OperationsTestCase<PersonalHealthcareMonitoringReport>(
			"validatePersonalHealthcareMonitoringReportVitalSigns",
			operationsForOCL.getOCLValue("VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PersonalHealthcareMonitoringReport target) {

			}

			@Override
			protected void updateToPass(PersonalHealthcareMonitoringReport target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportVitalSigns(
					(PersonalHealthcareMonitoringReport) objectToTest, diagnostician, map);
			}

		};

		validatePersonalHealthcareMonitoringReportVitalSignsTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePersonalHealthcareMonitoringReportResults() {
			OperationsTestCase<PersonalHealthcareMonitoringReport> validatePersonalHealthcareMonitoringReportResultsTestCase = new OperationsTestCase<PersonalHealthcareMonitoringReport>(
			"validatePersonalHealthcareMonitoringReportResults",
			operationsForOCL.getOCLValue("VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PersonalHealthcareMonitoringReport target) {

			}

			@Override
			protected void updateToPass(PersonalHealthcareMonitoringReport target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportResults(
					(PersonalHealthcareMonitoringReport) objectToTest, diagnostician, map);
			}

		};

		validatePersonalHealthcareMonitoringReportResultsTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePersonalHealthcareMonitoringReportMedicalEquipment() {
			OperationsTestCase<PersonalHealthcareMonitoringReport> validatePersonalHealthcareMonitoringReportMedicalEquipmentTestCase = new OperationsTestCase<PersonalHealthcareMonitoringReport>(
			"validatePersonalHealthcareMonitoringReportMedicalEquipment",
			operationsForOCL.getOCLValue("VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICAL_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PersonalHealthcareMonitoringReport target) {

			}

			@Override
			protected void updateToPass(PersonalHealthcareMonitoringReport target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportMedicalEquipment(
					(PersonalHealthcareMonitoringReport) objectToTest, diagnostician, map);
			}

		};

		validatePersonalHealthcareMonitoringReportMedicalEquipmentTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePersonalHealthcareMonitoringReportFunctionalStatus() {
			OperationsTestCase<PersonalHealthcareMonitoringReport> validatePersonalHealthcareMonitoringReportFunctionalStatusTestCase = new OperationsTestCase<PersonalHealthcareMonitoringReport>(
			"validatePersonalHealthcareMonitoringReportFunctionalStatus",
			operationsForOCL.getOCLValue("VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PersonalHealthcareMonitoringReport target) {

			}

			@Override
			protected void updateToPass(PersonalHealthcareMonitoringReport target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportFunctionalStatus(
					(PersonalHealthcareMonitoringReport) objectToTest, diagnostician, map);
			}

		};

		validatePersonalHealthcareMonitoringReportFunctionalStatusTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePersonalHealthcareMonitoringReportMedication() {
			OperationsTestCase<PersonalHealthcareMonitoringReport> validatePersonalHealthcareMonitoringReportMedicationTestCase = new OperationsTestCase<PersonalHealthcareMonitoringReport>(
			"validatePersonalHealthcareMonitoringReportMedication",
			operationsForOCL.getOCLValue("VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PersonalHealthcareMonitoringReport target) {

			}

			@Override
			protected void updateToPass(PersonalHealthcareMonitoringReport target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportMedication(
					(PersonalHealthcareMonitoringReport) objectToTest, diagnostician, map);
			}

		};

		validatePersonalHealthcareMonitoringReportMedicationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePersonalHealthcareMonitoringReportPurpose() {
			OperationsTestCase<PersonalHealthcareMonitoringReport> validatePersonalHealthcareMonitoringReportPurposeTestCase = new OperationsTestCase<PersonalHealthcareMonitoringReport>(
			"validatePersonalHealthcareMonitoringReportPurpose",
			operationsForOCL.getOCLValue("VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_PURPOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PersonalHealthcareMonitoringReport target) {

			}

			@Override
			protected void updateToPass(PersonalHealthcareMonitoringReport target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PersonalHealthcareMonitoringReportOperations.validatePersonalHealthcareMonitoringReportPurpose(
					(PersonalHealthcareMonitoringReport) objectToTest, diagnostician, map);
			}

		};

		validatePersonalHealthcareMonitoringReportPurposeTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetVitalSigns() {


PersonalHealthcareMonitoringReport target = objectFactory.create();
target.getVitalSigns();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetResults() {


PersonalHealthcareMonitoringReport target = objectFactory.create();
target.getResults();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMedicalEquipment() {


PersonalHealthcareMonitoringReport target = objectFactory.create();
target.getMedicalEquipment();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetFunctionalStatus() {


PersonalHealthcareMonitoringReport target = objectFactory.create();
target.getFunctionalStatus();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMedication() {


PersonalHealthcareMonitoringReport target = objectFactory.create();
target.getMedication();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPurpose() {


PersonalHealthcareMonitoringReport target = objectFactory.create();
target.getPurpose();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends PersonalHealthcareMonitoringReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PersonalHealthcareMonitoringReport> {
		@Override
		public PersonalHealthcareMonitoringReport create() {		
			return PhmrFactory.eINSTANCE.createPersonalHealthcareMonitoringReport();
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
	private static class ConstructorTestClass extends PersonalHealthcareMonitoringReportOperations {};
	
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
	
	

	
	
} // PersonalHealthcareMonitoringReportOperations