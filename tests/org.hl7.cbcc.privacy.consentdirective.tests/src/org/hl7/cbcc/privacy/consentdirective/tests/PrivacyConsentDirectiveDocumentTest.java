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
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEFactory;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument;
import org.hl7.cbcc.privacy.consentdirective.SignaturesSection;
import org.hl7.cbcc.privacy.consentdirective.operations.PrivacyConsentDirectiveDocumentOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Privacy Consent Directive Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Title</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Privacy Consent Details Section</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentSignaturesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Signatures Section</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Authenticator</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Author</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Documentation Of</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Information Recipient</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Legal Authenticator</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Custodian</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Record Target</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Related Document</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#getPrivacyConsentDetailsSection() <em>Get Privacy Consent Details Section</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#getSignaturesSection() <em>Get Signatures Section</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PrivacyConsentDirectiveDocumentTest extends TestCase {

	/**
	 * The fixture for this Privacy Consent Directive Document test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyConsentDirectiveDocument fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrivacyConsentDirectiveDocumentTest.class);
	}

	/**
	 * Constructs a new Privacy Consent Directive Document test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentDirectiveDocumentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Privacy Consent Directive Document test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PrivacyConsentDirectiveDocument fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Privacy Consent Directive Document test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyConsentDirectiveDocument getFixture() {
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
		setFixture(CONSENTDIRECTIVEFactory.eINSTANCE.createPrivacyConsentDirectiveDocument());
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
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentTemplateId__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentCodeP__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentCode__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentTitle__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Privacy Consent Details Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentSignaturesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Signatures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentSignaturesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentSignaturesSection__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentAuthenticator__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentAuthor__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentDocumentationOf__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentInformationRecipient__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Legal Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentLegalAuthenticator__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentCustodian__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentRecordTarget__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Consent Directive Document Related Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#validatePrivacyConsentDirectiveDocumentRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePrivacyConsentDirectiveDocumentRelatedDocument__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#getPrivacyConsentDetailsSection() <em>Get Privacy Consent Details Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#getPrivacyConsentDetailsSection()
	 * @generated
	 */
	@Test
	public void testGetPrivacyConsentDetailsSection() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#getSignaturesSection() <em>Get Signatures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument#getSignaturesSection()
	 * @generated
	 */
	@Test
	public void testGetSignaturesSection() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //PrivacyConsentDirectiveDocumentTest
