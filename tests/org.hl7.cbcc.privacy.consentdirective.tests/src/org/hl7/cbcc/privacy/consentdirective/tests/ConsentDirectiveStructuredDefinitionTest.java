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
import org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition;
import org.hl7.cbcc.privacy.consentdirective.operations.ConsentDirectiveStructuredDefinitionOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Consent Directive Structured Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Informant</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Participant</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionConsentAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Consent Action</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Information Criteria References Organizer</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Security Label Criteria</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#getConsentActions() <em>Get Consent Actions</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#getInformationCriteriaReferencesOrganizers() <em>Get Information Criteria References Organizers</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#getSecurityLabelCriteria() <em>Get Security Label Criteria</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ConsentDirectiveStructuredDefinitionTest extends TestCase {

	/**
	 * The fixture for this Consent Directive Structured Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentDirectiveStructuredDefinition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConsentDirectiveStructuredDefinitionTest.class);
	}

	/**
	 * Constructs a new Consent Directive Structured Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDirectiveStructuredDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Consent Directive Structured Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConsentDirectiveStructuredDefinition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Consent Directive Structured Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentDirectiveStructuredDefinition getFixture() {
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
		setFixture(CONSENTDIRECTIVEFactory.eINSTANCE.createConsentDirectiveStructuredDefinition());
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
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveStructuredDefinitionTemplateId__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveStructuredDefinitionCodeP__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveStructuredDefinitionCode__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveStructuredDefinitionMoodCode__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveStructuredDefinitionInformant__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveStructuredDefinitionParticipant__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionConsentAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Consent Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionConsentAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveStructuredDefinitionConsentAction__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Information Criteria References Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Security Label Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveStructuredDefinitionSecurityLabelCriteria__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#getConsentActions() <em>Get Consent Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#getConsentActions()
	 * @generated
	 */
	@Test
	public void testGetConsentActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#getInformationCriteriaReferencesOrganizers() <em>Get Information Criteria References Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#getInformationCriteriaReferencesOrganizers()
	 * @generated
	 */
	@Test
	public void testGetInformationCriteriaReferencesOrganizers() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#getSecurityLabelCriteria() <em>Get Security Label Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#getSecurityLabelCriteria()
	 * @generated
	 */
	@Test
	public void testGetSecurityLabelCriteria() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //ConsentDirectiveStructuredDefinitionTest
