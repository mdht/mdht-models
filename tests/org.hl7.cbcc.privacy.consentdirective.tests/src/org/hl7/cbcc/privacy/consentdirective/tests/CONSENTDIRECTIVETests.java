/**
 */
package org.hl7.cbcc.privacy.consentdirective.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>consentdirective</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
@RunWith(Suite.class)
	@Suite.SuiteClasses({
  	PrivacyConsentHeaderAuthorTest.class
  	,PrivacyConsentHeaderDocumentationOfServiceEventTest.class
  	,PrivacyConsentDirectiveDocumentTest.class
  	,PrivacyConsentDetailsSectionTest.class
  	,SignaturesSectionTest.class
  	,ConsentDirectiveEntryTest.class
  	,ConsentDirectiveStructuredDefinitionTest.class
  	,ConsentActionTest.class
  	,InformationCriteriaReferencesOrganizerTest.class
  	,CriteriumInformationDefinitionTest.class
  	,CriteriumRelatedProtectedProblemTest.class
  	,ConfidentialitySecurityObservationTest.class
  	,IIHIReceivingProviderTest.class
  	,ObligationPolicySecurityObservationTest.class
  	,ComputablePolicyConsentTest.class
  	,ScannedPrivacyConsentTest.class
  	,SignatureImageObservationTest.class
  	,SignatureImageEntryTest.class
  	,PrivacyConsentHeaderDocumentationOfTest.class
  	,PurposeOfUseSecurityObservationTest.class
  	,RefrainPolicySecurityObservationTest.class
})
public class CONSENTDIRECTIVETests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CONSENTDIRECTIVETests("consentdirective Tests");
		suite.addTestSuite(PrivacyConsentHeaderAuthorTest.class);
		suite.addTestSuite(PrivacyConsentHeaderDocumentationOfServiceEventTest.class);
		suite.addTestSuite(PrivacyConsentDirectiveDocumentTest.class);
		suite.addTestSuite(PrivacyConsentDetailsSectionTest.class);
		suite.addTestSuite(SignaturesSectionTest.class);
		suite.addTestSuite(ConsentDirectiveEntryTest.class);
		suite.addTestSuite(ConsentDirectiveStructuredDefinitionTest.class);
		suite.addTestSuite(ConsentActionTest.class);
		suite.addTestSuite(InformationCriteriaReferencesOrganizerTest.class);
		suite.addTestSuite(CriteriumInformationDefinitionTest.class);
		suite.addTestSuite(CriteriumRelatedProtectedProblemTest.class);
		suite.addTestSuite(ConfidentialitySecurityObservationTest.class);
		suite.addTestSuite(IIHIReceivingProviderTest.class);
		suite.addTestSuite(ObligationPolicySecurityObservationTest.class);
		suite.addTestSuite(ComputablePolicyConsentTest.class);
		suite.addTestSuite(ScannedPrivacyConsentTest.class);
		suite.addTestSuite(SignatureImageObservationTest.class);
		suite.addTestSuite(SignatureImageEntryTest.class);
		suite.addTestSuite(PrivacyConsentHeaderDocumentationOfTest.class);
		suite.addTestSuite(PurposeOfUseSecurityObservationTest.class);
		suite.addTestSuite(RefrainPolicySecurityObservationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSENTDIRECTIVETests(String name) {
		super(name);
	}

} //CONSENTDIRECTIVETests
