/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tss.tests;


import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>tss</b></em>' package.
 * <!-- end-user-doc -->
 * 		

 * @generated
 */
 @RunWith(Suite.class)
@Suite.SuiteClasses({
  	ToxicShockSyndromeCaseReportTest.class
  	,TssPhcrClinicalInformationSectionTest.class
  	,TssCaseObservationTest.class
  	,TssSignsAndSymptomsObservationTest.class
  	,TssPhcrRelevantDxTestsSectionTest.class
  	,TssResultOrganizerTest.class
  	,TssResultObservationTest.class
})
public class tssTests {

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static junit.framework.Test suite() {
    return new JUnit4TestAdapter( tssTests.class);
  }
	 

} //tssTests