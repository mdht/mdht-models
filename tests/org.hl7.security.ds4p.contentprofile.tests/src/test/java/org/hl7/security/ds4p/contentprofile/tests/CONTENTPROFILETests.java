/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.JUnit4TestAdapter;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>contentprofile</b></em>' package.
 * <!-- end-user-doc -->
 *

 * @generated
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		PrivacySegmentedDocumentTest.class, PrivacySegmentedSectionTest.class, PrivacyMarkingsSectionTest.class,
		ObligationPolicySecurityObservationTest.class, MandatoryDocumentProvenanceTest.class,
		MandatoryDocumentAssignedAuthorTest.class, PrivacyAnnotationTest.class,
		RefrainPolicySecurityObservationTest.class, PurposeOfUseSecurityObservationTest.class,
		ConfidentialitySecurityObservationTest.class, ProtectedProblemTest.class, MandatoryEntryProvenanceTest.class,
		MandatoryEntryAssignedAuthorTest.class, PrivacyAnnotationEntryRelationshipTest.class,
		PrivacyMarkingsEntryTest.class })
public class CONTENTPROFILETests {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(CONTENTPROFILETests.class);
	}

} // CONTENTPROFILETests
