/**
 */
package org.hl7.cbcc.privacy.consentdirective.tests;

import java.util.Collection;
import java.util.Map;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEFactory;
import org.hl7.cbcc.privacy.consentdirective.SignaturesSection;
import org.hl7.cbcc.privacy.consentdirective.operations.SignaturesSectionOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Signatures Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Text</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Title</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Entry</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SignaturesSectionTest extends TestCase {

	/**
	 * The fixture for this Signatures Section test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignaturesSection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SignaturesSectionTest.class);
	}

	/**
	 * Constructs a new Signatures Section test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaturesSectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Signatures Section test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SignaturesSection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Signatures Section test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignaturesSection getFixture() {
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
		setFixture(CONSENTDIRECTIVEFactory.eINSTANCE.createSignaturesSection());
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
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignaturesSectionTemplateId__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignaturesSectionCode__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignaturesSectionCodeP__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignaturesSectionText__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignaturesSectionTitle__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signatures Section Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.SignaturesSection#validateSignaturesSectionEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignaturesSectionEntry__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //SignaturesSectionTest
