
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
import org.openhealthtools.mdht.uml.cda.vsbr.FetusSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetusSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetus Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionAbnormalConditionsoftheNewborn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Abnormal Conditionsofthe Newborn</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionBirthOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionNumberofInfantsBornAlive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Numberof Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionCongenitalAnomaliesoftheNewborn2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Congenital Anomaliesofthe Newborn2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Weight</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#getAbnormalConditionsoftheNewborns() <em>Get Abnormal Conditionsofthe Newborns</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#getBirthOrder() <em>Get Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#getNumberofInfantsBornAlive() <em>Get Numberof Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#getCongenitalAnomaliesoftheNewborn2s() <em>Get Congenital Anomaliesofthe Newborn2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#getWeight() <em>Get Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class FetusSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateFetusSectionTemplateId() {
			OperationsTestCase<FetusSection> validateFetusSectionTemplateIdTestCase = new OperationsTestCase<FetusSection>(
			"validateFetusSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetusSection target) {

			}

			@Override
			protected void updateToPass(FetusSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetusSectionOperations.validateFetusSectionTemplateId(
					(FetusSection) objectToTest, diagnostician, map);
			}

		};

		validateFetusSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetusSectionClassCode() {
			OperationsTestCase<FetusSection> validateFetusSectionClassCodeTestCase = new OperationsTestCase<FetusSection>(
			"validateFetusSectionClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetusSection target) {

			}

			@Override
			protected void updateToPass(FetusSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetusSectionOperations.validateFetusSectionClassCode(
					(FetusSection) objectToTest, diagnostician, map);
			}

		};

		validateFetusSectionClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetusSectionCode() {
			OperationsTestCase<FetusSection> validateFetusSectionCodeTestCase = new OperationsTestCase<FetusSection>(
			"validateFetusSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetusSection target) {

			}

			@Override
			protected void updateToPass(FetusSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetusSectionOperations.validateFetusSectionCode(
					(FetusSection) objectToTest, diagnostician, map);
			}

		};

		validateFetusSectionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetusSectionMoodCode() {
			OperationsTestCase<FetusSection> validateFetusSectionMoodCodeTestCase = new OperationsTestCase<FetusSection>(
			"validateFetusSectionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetusSection target) {

			}

			@Override
			protected void updateToPass(FetusSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetusSectionOperations.validateFetusSectionMoodCode(
					(FetusSection) objectToTest, diagnostician, map);
			}

		};

		validateFetusSectionMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetusSectionText() {
			OperationsTestCase<FetusSection> validateFetusSectionTextTestCase = new OperationsTestCase<FetusSection>(
			"validateFetusSectionText",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetusSection target) {

			}

			@Override
			protected void updateToPass(FetusSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetusSectionOperations.validateFetusSectionText(
					(FetusSection) objectToTest, diagnostician, map);
			}

		};

		validateFetusSectionTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetusSectionSubject() {
			OperationsTestCase<FetusSection> validateFetusSectionSubjectTestCase = new OperationsTestCase<FetusSection>(
			"validateFetusSectionSubject",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetusSection target) {

			}

			@Override
			protected void updateToPass(FetusSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetusSectionOperations.validateFetusSectionSubject(
					(FetusSection) objectToTest, diagnostician, map);
			}

		};

		validateFetusSectionSubjectTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetusSectionAbnormalConditionsoftheNewborn() {
			OperationsTestCase<FetusSection> validateFetusSectionAbnormalConditionsoftheNewbornTestCase = new OperationsTestCase<FetusSection>(
			"validateFetusSectionAbnormalConditionsoftheNewborn",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetusSection target) {

			}

			@Override
			protected void updateToPass(FetusSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetusSectionOperations.validateFetusSectionAbnormalConditionsoftheNewborn(
					(FetusSection) objectToTest, diagnostician, map);
			}

		};

		validateFetusSectionAbnormalConditionsoftheNewbornTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetusSectionBirthOrder() {
			OperationsTestCase<FetusSection> validateFetusSectionBirthOrderTestCase = new OperationsTestCase<FetusSection>(
			"validateFetusSectionBirthOrder",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetusSection target) {

			}

			@Override
			protected void updateToPass(FetusSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetusSectionOperations.validateFetusSectionBirthOrder(
					(FetusSection) objectToTest, diagnostician, map);
			}

		};

		validateFetusSectionBirthOrderTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetusSectionNumberofInfantsBornAlive() {
			OperationsTestCase<FetusSection> validateFetusSectionNumberofInfantsBornAliveTestCase = new OperationsTestCase<FetusSection>(
			"validateFetusSectionNumberofInfantsBornAlive",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetusSection target) {

			}

			@Override
			protected void updateToPass(FetusSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetusSectionOperations.validateFetusSectionNumberofInfantsBornAlive(
					(FetusSection) objectToTest, diagnostician, map);
			}

		};

		validateFetusSectionNumberofInfantsBornAliveTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetusSectionCongenitalAnomaliesoftheNewborn2() {
			OperationsTestCase<FetusSection> validateFetusSectionCongenitalAnomaliesoftheNewborn2TestCase = new OperationsTestCase<FetusSection>(
			"validateFetusSectionCongenitalAnomaliesoftheNewborn2",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetusSection target) {

			}

			@Override
			protected void updateToPass(FetusSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetusSectionOperations.validateFetusSectionCongenitalAnomaliesoftheNewborn2(
					(FetusSection) objectToTest, diagnostician, map);
			}

		};

		validateFetusSectionCongenitalAnomaliesoftheNewborn2TestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetusSectionWeight() {
			OperationsTestCase<FetusSection> validateFetusSectionWeightTestCase = new OperationsTestCase<FetusSection>(
			"validateFetusSectionWeight",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetusSection target) {

			}

			@Override
			protected void updateToPass(FetusSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetusSectionOperations.validateFetusSectionWeight(
					(FetusSection) objectToTest, diagnostician, map);
			}

		};

		validateFetusSectionWeightTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAbnormalConditionsoftheNewborns() {


FetusSection target = objectFactory.create();
target.getAbnormalConditionsoftheNewborns();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBirthOrder() {


FetusSection target = objectFactory.create();
target.getBirthOrder();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNumberofInfantsBornAlive() {


FetusSection target = objectFactory.create();
target.getNumberofInfantsBornAlive();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCongenitalAnomaliesoftheNewborn2s() {


FetusSection target = objectFactory.create();
target.getCongenitalAnomaliesoftheNewborn2s();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetWeight() {


FetusSection target = objectFactory.create();
target.getWeight();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends FetusSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FetusSection> {
		public FetusSection create() {		
			return VsbrFactory.eINSTANCE.createFetusSection();
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
	private static class ConstructorTestClass extends FetusSectionOperations {};
	
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
	
	

	
	
} // FetusSectionOperations