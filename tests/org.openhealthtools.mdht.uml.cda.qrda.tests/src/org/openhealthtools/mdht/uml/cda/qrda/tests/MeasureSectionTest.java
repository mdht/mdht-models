
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.qrda.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.qrda.MeasureSection;
import org.openhealthtools.mdht.uml.cda.qrda.QRDAFactory;
import org.openhealthtools.mdht.uml.cda.qrda.operations.MeasureSectionOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Measure Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.MeasureSection#validateMeasureSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.MeasureSection#validateMeasureSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.MeasureSection#validateMeasureSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.MeasureSection#validateMeasureSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MeasureSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateMeasureSectionTemplateId() {
			OperationsTestCase<MeasureSection> validateMeasureSectionTemplateIdTestCase = new OperationsTestCase<MeasureSection>(
			"validateMeasureSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEASURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MeasureSection target) {

			}

			@Override
			protected void updateToPass(MeasureSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MeasureSectionOperations.validateMeasureSectionTemplateId(
					(MeasureSection) objectToTest, diagnostician, map);
			}

		};

		validateMeasureSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMeasureSectionCode() {
			OperationsTestCase<MeasureSection> validateMeasureSectionCodeTestCase = new OperationsTestCase<MeasureSection>(
			"validateMeasureSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MEASURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MeasureSection target) {

			}

			@Override
			protected void updateToPass(MeasureSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MeasureSectionOperations.validateMeasureSectionCode(
					(MeasureSection) objectToTest, diagnostician, map);
			}

		};

		validateMeasureSectionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMeasureSectionText() {
			OperationsTestCase<MeasureSection> validateMeasureSectionTextTestCase = new OperationsTestCase<MeasureSection>(
			"validateMeasureSectionText",
			operationsForOCL.getOCLValue("VALIDATE_MEASURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MeasureSection target) {

			}

			@Override
			protected void updateToPass(MeasureSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MeasureSectionOperations.validateMeasureSectionText(
					(MeasureSection) objectToTest, diagnostician, map);
			}

		};

		validateMeasureSectionTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMeasureSectionTitle() {
			OperationsTestCase<MeasureSection> validateMeasureSectionTitleTestCase = new OperationsTestCase<MeasureSection>(
			"validateMeasureSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_MEASURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MeasureSection target) {

			}

			@Override
			protected void updateToPass(MeasureSection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MeasureSectionOperations.validateMeasureSectionTitle(
					(MeasureSection) objectToTest, diagnostician, map);
			}

		};

		validateMeasureSectionTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends MeasureSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MeasureSection> {
		public MeasureSection create() {		
			return QRDAFactory.eINSTANCE.createMeasureSection();
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
	private static class ConstructorTestClass extends MeasureSectionOperations {};
	
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
	
	

	
	
} // MeasureSectionOperations