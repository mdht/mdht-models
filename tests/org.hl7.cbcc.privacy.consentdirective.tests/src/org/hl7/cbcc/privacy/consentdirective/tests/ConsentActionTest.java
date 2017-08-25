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
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEFactory;
import org.hl7.cbcc.privacy.consentdirective.ConsentAction;
import org.hl7.cbcc.privacy.consentdirective.operations.ConsentActionOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Consent Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Negation Ind</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ConsentActionTest extends TestCase {

	/**
	 * The fixture for this Consent Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentAction fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConsentActionTest.class);
	}

	/**
	 * Constructs a new Consent Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentActionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Consent Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConsentAction fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Consent Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentAction getFixture() {
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
		setFixture(CONSENTDIRECTIVEFactory.eINSTANCE.createConsentAction());
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
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentActionTemplateId__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentActionCodeP__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentActionCode__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentActionMoodCode__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentActionNegationInd__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //ConsentActionTest
