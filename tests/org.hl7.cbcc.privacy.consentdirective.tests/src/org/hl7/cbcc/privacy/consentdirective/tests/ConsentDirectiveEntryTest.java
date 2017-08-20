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
import org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry;
import org.hl7.cbcc.privacy.consentdirective.operations.ConsentDirectiveEntryOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Consent Directive Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Act</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Observation</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryObservationMedia(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Observation Media</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ConsentDirectiveEntryTest extends TestCase {

	/**
	 * The fixture for this Consent Directive Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentDirectiveEntry fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConsentDirectiveEntryTest.class);
	}

	/**
	 * Constructs a new Consent Directive Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDirectiveEntryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Consent Directive Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConsentDirectiveEntry fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Consent Directive Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentDirectiveEntry getFixture() {
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
		setFixture(CONSENTDIRECTIVEFactory.eINSTANCE.createConsentDirectiveEntry());
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
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveEntryTemplateId__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveEntryAct__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveEntryObservation__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryObservationMedia(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Observation Media</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryObservationMedia(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConsentDirectiveEntryObservationMedia__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //ConsentDirectiveEntryTest
