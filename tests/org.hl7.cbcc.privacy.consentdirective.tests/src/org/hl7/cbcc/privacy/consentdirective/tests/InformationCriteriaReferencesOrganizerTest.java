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
import org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer;
import org.hl7.cbcc.privacy.consentdirective.operations.InformationCriteriaReferencesOrganizerOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Information Criteria References Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerInformationDefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Information Definition</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Related Protected Problem</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Confidentiality Code Label</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#getInformationDefinitions() <em>Get Information Definitions</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#getRelatedProtectedProblems() <em>Get Related Protected Problems</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#getConfidentialityCodeLabels() <em>Get Confidentiality Code Labels</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class InformationCriteriaReferencesOrganizerTest extends TestCase {

	/**
	 * The fixture for this Information Criteria References Organizer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationCriteriaReferencesOrganizer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InformationCriteriaReferencesOrganizerTest.class);
	}

	/**
	 * Constructs a new Information Criteria References Organizer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationCriteriaReferencesOrganizerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Information Criteria References Organizer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InformationCriteriaReferencesOrganizer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Information Criteria References Organizer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationCriteriaReferencesOrganizer getFixture() {
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
		setFixture(CONSENTDIRECTIVEFactory.eINSTANCE.createInformationCriteriaReferencesOrganizer());
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
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateInformationCriteriaReferencesOrganizerTemplateId__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateInformationCriteriaReferencesOrganizerMoodCode__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerInformationDefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Information Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerInformationDefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateInformationCriteriaReferencesOrganizerInformationDefinition__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Related Protected Problem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateInformationCriteriaReferencesOrganizerRelatedProtectedProblem__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Criteria References Organizer Confidentiality Code Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#getInformationDefinitions() <em>Get Information Definitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#getInformationDefinitions()
	 * @generated
	 */
	@Test
	public void testGetInformationDefinitions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#getRelatedProtectedProblems() <em>Get Related Protected Problems</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#getRelatedProtectedProblems()
	 * @generated
	 */
	@Test
	public void testGetRelatedProtectedProblems() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#getConfidentialityCodeLabels() <em>Get Confidentiality Code Labels</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer#getConfidentialityCodeLabels()
	 * @generated
	 */
	@Test
	public void testGetConfidentialityCodeLabels() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //InformationCriteriaReferencesOrganizerTest
