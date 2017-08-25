/**
 */
package org.hl7.cbcc.privacy.consentdirective.tests;

import java.util.Collection;
import java.util.Map;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEFactory;
import org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation;
import org.hl7.cbcc.privacy.consentdirective.operations.SignatureImageObservationOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Signature Image Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation#validateSignatureImageObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation#validateSignatureImageObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation#validateSignatureImageObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SignatureImageObservationTest extends TestCase {

	/**
	 * The fixture for this Signature Image Observation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImageObservation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SignatureImageObservationTest.class);
	}

	/**
	 * Constructs a new Signature Image Observation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureImageObservationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Signature Image Observation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SignatureImageObservation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Signature Image Observation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImageObservation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CONSENTDIRECTIVEFactory.eINSTANCE.createSignatureImageObservation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation#validateSignatureImageObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation#validateSignatureImageObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignatureImageObservationTemplateId__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation#validateSignatureImageObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation#validateSignatureImageObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignatureImageObservationMoodCode__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation#validateSignatureImageObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Image Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation#validateSignatureImageObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignatureImageObservationValue__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
*
* @generated NOT
*/
@Test

 
									
public void testValidateSignatureImageObservationValue() {
			OperationsTestCase<SignatureImageObservation> validateSignatureImageObservationValueTestCase = new OperationsTestCase<SignatureImageObservation>(
			"validateSignatureImageObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SIGNATURE_IMAGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SignatureImageObservation target) {

			}

			@Override
			protected void updateToPass(SignatureImageObservation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
//				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SignatureImageObservationOperations.validateSignatureImageObservationValue(
					(SignatureImageObservation) objectToTest, diagnostician, map);
			}

		};

		validateSignatureImageObservationValueTestCase.doValidationTest();
}

} //SignatureImageObservationTest
