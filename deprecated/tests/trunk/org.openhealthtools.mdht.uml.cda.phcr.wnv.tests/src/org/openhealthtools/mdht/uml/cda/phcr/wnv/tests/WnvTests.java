/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.wnv.tests;


import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>wnv</b></em>' package.
 * <!-- end-user-doc -->
 * 		

 * @generated
 */
 @RunWith(Suite.class)
@Suite.SuiteClasses({
  	WestNileVirusCaseReportTest.class
  	,WnvPhcrClinicalInformationSectionTest.class
  	,WnvCaseObservationTest.class
  	,WnvSignsAndSymptomsObservationTest.class
  	,WnvPhcrRelevantDxTestsSectionTest.class
  	,WnvResultObservationTest.class
  	,WnvResultOrganizerTest.class
})
public class WnvTests {

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static junit.framework.Test suite() {
    return new JUnit4TestAdapter( WnvTests.class);
  }
	 

} //WnvTests