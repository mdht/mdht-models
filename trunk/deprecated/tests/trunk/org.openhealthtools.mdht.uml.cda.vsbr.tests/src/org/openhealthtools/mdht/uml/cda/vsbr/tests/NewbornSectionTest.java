
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
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.NewbornSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Newborn Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionEstimateofGestation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Estimateof Gestation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionApgarScore(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Apgar Score</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionPlurality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Plurality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionBirthOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionNumberofInfantsBornAlive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Numberof Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionCongenitalAnomaliesoftheNewborn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Congenital Anomaliesofthe Newborn</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Weight</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getEstimateofGestation() <em>Get Estimateof Gestation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getApgarScores() <em>Get Apgar Scores</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getPlurality() <em>Get Plurality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getBirthOrder() <em>Get Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getNumberofInfantsBornAlive() <em>Get Numberof Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getCongenitalAnomaliesoftheNewborns() <em>Get Congenital Anomaliesofthe Newborns</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getWeight() <em>Get Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class NewbornSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionTemplateId() {
			OperationsTestCase<NewbornSection> validateNewbornSectionTemplateIdTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionTemplateId(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionClassCode() {
			OperationsTestCase<NewbornSection> validateNewbornSectionClassCodeTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionClassCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionClassCode(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionCode() {
			OperationsTestCase<NewbornSection> validateNewbornSectionCodeTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionCode(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionMoodCode() {
			OperationsTestCase<NewbornSection> validateNewbornSectionMoodCodeTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionMoodCode(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionText() {
			OperationsTestCase<NewbornSection> validateNewbornSectionTextTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionText",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionText(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionSubject() {
			OperationsTestCase<NewbornSection> validateNewbornSectionSubjectTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionSubject",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionSubject(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionSubjectTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionEstimateofGestation() {
			OperationsTestCase<NewbornSection> validateNewbornSectionEstimateofGestationTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionEstimateofGestation",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionEstimateofGestation(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionEstimateofGestationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionApgarScore() {
			OperationsTestCase<NewbornSection> validateNewbornSectionApgarScoreTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionApgarScore",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_APGAR_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionApgarScore(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionApgarScoreTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionPlurality() {
			OperationsTestCase<NewbornSection> validateNewbornSectionPluralityTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionPlurality",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionPlurality(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionPluralityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionBirthOrder() {
			OperationsTestCase<NewbornSection> validateNewbornSectionBirthOrderTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionBirthOrder",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionBirthOrder(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionBirthOrderTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionNumberofInfantsBornAlive() {
			OperationsTestCase<NewbornSection> validateNewbornSectionNumberofInfantsBornAliveTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionNumberofInfantsBornAlive",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionNumberofInfantsBornAlive(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionNumberofInfantsBornAliveTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionCongenitalAnomaliesoftheNewborn() {
			OperationsTestCase<NewbornSection> validateNewbornSectionCongenitalAnomaliesoftheNewbornTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionCongenitalAnomaliesoftheNewborn",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionCongenitalAnomaliesoftheNewborn(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionCongenitalAnomaliesoftheNewbornTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNewbornSectionWeight() {
			OperationsTestCase<NewbornSection> validateNewbornSectionWeightTestCase = new OperationsTestCase<NewbornSection>(
			"validateNewbornSectionWeight",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORN_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(NewbornSection target) {

			}

			@Override
			protected void updateToPass(NewbornSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return NewbornSectionOperations.validateNewbornSectionWeight(
					(NewbornSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornSectionWeightTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetEstimateofGestation() {


NewbornSection target = objectFactory.create();
target.getEstimateofGestation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetApgarScores() {


NewbornSection target = objectFactory.create();
target.getApgarScores();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPlurality() {


NewbornSection target = objectFactory.create();
target.getPlurality();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBirthOrder() {


NewbornSection target = objectFactory.create();
target.getBirthOrder();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNumberofInfantsBornAlive() {


NewbornSection target = objectFactory.create();
target.getNumberofInfantsBornAlive();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCongenitalAnomaliesoftheNewborns() {


NewbornSection target = objectFactory.create();
target.getCongenitalAnomaliesoftheNewborns();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetWeight() {


NewbornSection target = objectFactory.create();
target.getWeight();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends NewbornSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NewbornSection> {
		public NewbornSection create() {		
			return VsbrFactory.eINSTANCE.createNewbornSection();
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
	private static class ConstructorTestClass extends NewbornSectionOperations {};
	
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
	
	

	
	
} // NewbornSectionOperations